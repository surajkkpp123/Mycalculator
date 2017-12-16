package com.example.calsi.mycalculator;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,beq,badd,bsub,bmul,bdiv,bdot,bclear,bback,blog,bpow,bfact,bper;
    TextView ans;
    Double v1;
    Double v2;
    private DrawerLayout d1;
    private ActionBarDrawerToggle a1;
    boolean add,sub,mul,div,pow,fact,per;
    public int check(String s) {
        if (s == null)
            return 0;
        else
            return 1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //for navigation bar
        d1=(DrawerLayout)findViewById(R.id.drawer);
        a1=new ActionBarDrawerToggle(this,d1,R.string.open,R.string.close);
        d1.addDrawerListener(a1);
        a1.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //for buttons
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        b0=(Button)findViewById(R.id.btn0);
        blog=(Button)findViewById(R.id.btnlog);
        bper=(Button)findViewById(R.id.btnper);
        bfact=(Button)findViewById(R.id.btnfact);
        bpow=(Button)findViewById(R.id.btnpow);
        bclear=(Button)findViewById(R.id.btnclear);
        bback=(Button)findViewById(R.id.btnback);
        badd=(Button)findViewById(R.id.btnplus);
        bsub=(Button)findViewById(R.id.btnminus);
        bdiv=(Button)findViewById(R.id.btndivid);
        bmul=(Button)findViewById(R.id.btnmulti);
        bdot=(Button)findViewById(R.id.btndot);
        beq=(Button)findViewById(R.id.btneq);
        ans=(TextView)findViewById(R.id.Answer);
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2=Double.parseDouble(ans.getText()+"");
                if(add==true)
                {
                    ans.setText(v1+v2+"");
                    add=false;
                }
                if(sub==true)
                {
                    ans.setText(v1-v2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    ans.setText(v1*v2+"");
                    mul=false;
                }
                if(div==true)
                {
                    ans.setText(v1/v2+"");
                    div=false;
                }
                if(pow==true)
                {
                 int x= v1.intValue(),y=v2.intValue();
                    int p= (int) Math.pow(x,y);
                    ans.setText(p+"");
                    pow=false;
                }
                if(fact==true)
                {
                    int x= v1.intValue();
                    int f=1;
                    for(int k=x;k>=1;k--)
                             f=f*k;
                    ans.setText(f+"");
                    fact=false;
                }
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v1>0)
                  ans.setText((int)Math.log(v1));
                else
                    ans.setText("");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(ans.getText()+"");
                fact=true;
                ans.setText(null);
            }
        });
        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
            }
        });
        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(ans.getText()+"");
                pow=true;
                ans.setText(null);
            }
        });
        bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=ans.getText().toString();
                if (str.length() >=1 ) {
                    str = str.substring(0, str.length() - 1);
                    ans.setText(str);
                };
                if (str.length() <1 ) {
                    ans.setText("");
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=ans.getText().toString();
                if(check(str)==1)
                 ans.setText(ans.getText()+".");
                else
                  ans.setText(ans.getText()+"");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(ans.getText()+"");
                add=true;
                ans.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(ans.getText()+"");
                sub=true;
                ans.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(ans.getText()+"");
                mul=true;
                ans.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(ans.getText()+"");
                div=true;
                ans.setText(null);
            }
        });
    }
    //shareing option in navigationbar
    android.widget.ShareActionProvider mShareActionProvider;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu resource file
        getMenuInflater().inflate(R.menu.nav_menu,menu);
        MenuItem item=menu.findItem(R.id.share);
        mShareActionProvider=(ShareActionProvider)item.getActionProvider();
        return true;
    }
    private void setShareIntent(Intent shareIntent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(a1.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
