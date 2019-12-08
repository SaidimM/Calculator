package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    String Expression="";
    Double d1=0.0;
    Double d2=0.0;
    ArrayList<String> E= new ArrayList<>();

    boolean isDesimal=false;
    String Result="";
    double res=0.0;
    String exp="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BClear=(Button)findViewById(R.id.BClear);
        Button BHis=(Button)findViewById(R.id.BHis);
        Button BTrans=(Button)findViewById(R.id.BTrans);
        Button BDiv=(Button)findViewById(R.id.BDiv);
        Button B1=(Button)findViewById(R.id.B1);
        Button B2=(Button)findViewById(R.id.B2);
        Button B3=(Button)findViewById(R.id.B3);
        Button B4=(Button)findViewById(R.id.B4);
        Button B5=(Button)findViewById(R.id.B5);
        Button B6=(Button)findViewById(R.id.B6);
        Button B7=(Button)findViewById(R.id.B7);
        Button B8=(Button)findViewById(R.id.B8);
        Button B9=(Button)findViewById(R.id.B9);
        Button B0=(Button)findViewById(R.id.B0);
        Button BMul=(Button)findViewById(R.id.BMultiply);
        Button Badd=(Button)findViewById(R.id.Badd);
        Button Bsub=(Button)findViewById(R.id.BSub);
        Button Bor=(Button)findViewById(R.id.BOr);
        Button Bre=(Button)findViewById(R.id.BRes);
        Button Bp=(Button)findViewById(R.id.Bp);

        Button Bsin=(Button)findViewById(R.id.Bsin);
        Button Bcos=(Button)findViewById(R.id.Bcos);
        Button Btan=(Button)findViewById(R.id.Btan);
        Button Bqua=(Button)findViewById(R.id.Bquadrat);
        Button Bcub=(Button)findViewById(R.id.Bcube);
        Button Bexp=(Button)findViewById(R.id.Bexponent);

        final View nB=findViewById(R.id.nB);
        final TextView t1=(TextView)findViewById(R.id.nA);
        final ListView listView=(ListView) findViewById(R.id.LV);
        final String[] e={"a","b","c"};
        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,E);
        Button HClear=(Button)findViewById(R.id.HClear);
        BClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression="";
                Result="";
                res=0.0;
                t1.setText(Expression);
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="1";

                t1.setText(Expression);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="2";

                t1.setText(Expression);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="3";
                t1.setText(Expression);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="4";
                t1.setText(Expression);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="5";
                t1.setText(Expression);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="6";
                t1.setText(Expression);
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="7";
                t1.setText(Expression);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="8";
                t1.setText(Expression);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="9";
                t1.setText(Expression);
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="0";
                t1.setText(Expression);
            }
        });
        Badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    if(Math.round(res)-res == 0){
                        Expression=(int)res+"";
                    }else{
                        Expression=res+"";
                    }
                }
                String c=Expression.substring(Expression.length()-1);
                if(c.equals("+")||c.equals("-")||c.equals("x")||c.equals("÷")||c.equals(".")||c.equals("n")||c.equals("s")||c.equals("^")){

                }else{
                    getResult(Expression);
                    Expression+="+";
                    exp="+";
                    t1.setText(Expression);
                }
            }
        });
        Bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    if(res%1==0){
                        Expression=(int)res+"";
                    }else{
                        Expression=res+"";
                    }
                }
                String c=Expression.substring(Expression.length()-1);
                if(c.equals("+")||c.equals("-")||c.equals("x")||c.equals("÷")||c.equals(".")||c.equals("n")||c.equals("s")||c.equals("^")){

                }
                else{
                    Expression=getResult(Expression);
                    Expression+="-";
                    exp="-";
                    t1.setText(Expression);
                }
            }
        });
        BMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    if(res%1==0){
                        Expression=(int)res+"";
                    }else{
                        Expression=res+"";
                    }
                }
                String c=Expression.substring(Expression.length()-1);
                if(c.equals("+")||c.equals("-")||c.equals("x")||c.equals("÷")||c.equals(".")||c.equals("n")||c.equals("s")||c.equals("^")){

                }
                else{
                    Expression=getResult(Expression);
                    Expression+="x";
                    exp="x";
                    t1.setText(Expression);
                }
            }
        });
        BDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Expression.equals("")){
                    if(res%1==0){
                        Expression=(int)res+"";
                    }else{
                        Expression=res+"";
                    }
                }
                String c=Expression.substring(Expression.length()-1);
                if(c.equals("+")||c.equals("-")||c.equals("x")||c.equals("÷")||c.equals(".")||c.equals("n")||c.equals("s")||c.equals("^")){

                }else{
                    Expression=getResult(Expression);
                    Expression+="÷";
                    exp="÷";
                    t1.setText(Expression);
                }
            }
        });
        Bor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!Expression.equals("")){
                    Expression=Expression.substring(0,Expression.length()-1);
                }
                t1.setText(Expression);
            }
        });
        Bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+=".";
                isDesimal=true;
                t1.setText(Expression);
            }
        });
        Bre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nB.setVisibility(View.INVISIBLE);
                String c=Expression.substring(Expression.length()-1);
                if(c.equals("+")||c.equals("-")||c.equals("x")||c.equals("÷")||c.equals(".")||c.equals("n")||c.equals("s")||c.equals("^")){

                }
                else{
                    t1.setText(getResult(Expression));
                    Expression="";
                    exp="";
                }
            }
        });
        BHis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                listView.setAdapter(arrayAdapter);
                nB.setVisibility(View.VISIBLE);
            }
        });
        HClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.clear();
                nB.setVisibility(View.INVISIBLE);
            }
        });
        BTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        Bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    Expression+="Sin ";
                    exp="sin";
                    t1.setText(Expression);
                }else{
                    Expression="";
                    Expression+="Sin ";
                    exp="sin";
                    t1.setText(Expression);
                }
            }
        });
        Bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    Expression+="Cos ";
                    exp="cos";
                    t1.setText(Expression);
                }else{
                    Expression="";
                    Expression+="Cos ";
                    exp="cos";
                    t1.setText(Expression);
                }
            }
        });
        Btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    Expression+="Sin ";
                    exp="sin";
                    t1.setText(Expression);
                }else{
                    Expression="";
                    Expression+="Sin ";
                    exp="sin";
                    t1.setText(Expression);
                }
            }
        });
        Bqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    if(res%1==0){
                        Expression=(int)res+"";
                    }else{
                        Expression=res+"";
                    }
                }
                String c=Expression.substring(Expression.length()-1);
                if(c.equals("+")||c.equals("-")||c.equals("x")||c.equals("÷")||c.equals(".")||c.equals("n")||c.equals("s")||c.equals("^")){

                }
                else{
                    Expression=getResult(Expression);
                    Expression+="²";
                    exp="²";
                    t1.setText(Expression);
                }
            }
        });
        Bcub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    if(res%1==0){
                        Expression=(int)res+"";
                    }else{
                        Expression=res+"";
                    }
                }
                String c=Expression.substring(Expression.length()-1);
                if(c.equals("+")||c.equals("-")||c.equals("x")||c.equals("÷")||c.equals(".")||c.equals("n")||c.equals("s")||c.equals("^")){

                }
                else{
                    Expression=getResult(Expression);
                    Expression+="³";
                    exp="³";
                    t1.setText(Expression);
                }
            }
        });
        Bexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nB.setVisibility(View.INVISIBLE);
                if(Expression.equals("")){
                    if(res%1==0){
                        Expression=(int)res+"";
                    }else{
                        Expression=res+"";
                    }
                }
                String c=Expression.substring(Expression.length()-1);
                if(c.equals("+")||c.equals("-")||c.equals("x")||c.equals("÷")||c.equals(".")||c.equals("n")||c.equals("s")||c.equals("^")){

                }
                else{
                    Expression=getResult(Expression);
                    Expression+="^";
                    exp="^";
                    t1.setText(Expression);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.help, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.action_cart://监听菜单按钮
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    String getResult(String s){
        if(!s.equals("")){
            if(exp.equals("")){
                d1=Double.parseDouble(s);
            }else if(exp.equals("sin")||exp.equals("cos")||exp.equals("tan")){
                d2=Double.parseDouble(s.substring(3));
            }
            else if(exp.equals("²")||exp.equals("³")){
                int n=s.indexOf(exp);
                d1=Double.parseDouble(s.substring(0,n));
            }
            else{
                int n=s.indexOf(exp);
                String s1=s.substring(0,n);
                d1=Double.parseDouble(s1);
                d2=Double.parseDouble(s.substring(n+1));
            }
            switch (exp){
                case "+":res=d1+d2;break;
                case "-":res=d1-d2;break;
                case "x":res=d1*d2;break;
                case "÷":{
                    if(d1==0){
                        Toast toast=Toast.makeText(MainActivity.this,"come on!",Toast.LENGTH_SHORT);
                        toast.show();
                        Result="";
                    }
                    else{
                        res=d1/d2;
                    }
                }break;
                case "sin":res=Math.sin(d2/180*Math.PI);break;
                case "cos":res=Math.cos(d2/180*Math.PI);break;
                case "tan":res=Math.tan(d2/180*Math.PI);break;
                case "²":res=Math.pow(d1,2);break;
                case "³":res=Math.pow(d1,3);break;
                case "^":res=Math.pow(d1,d2);break;
                case "":res=d1;break;
            }
            if(res%1!=0){
                isDesimal=true;
            }
            if(!isDesimal){

                Result=(int)res+"";
            }else{
                Result=res+"";
            }
            if(!s.equals(Result)){
                s+="="+Result;
                E.add(s);
            }
            isDesimal=false;
            s="";
        }
        else{
            res=0.0;
            Result="";
        }
        Expression=Result;
        return Result;
    }
}
