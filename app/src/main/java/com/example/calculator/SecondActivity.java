package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.Scanner;

public class SecondActivity extends AppCompatActivity {
    String Expression="";
    Boolean isJZ=true;
    int jz1=10;
    int jz2=10;
    int E=0;
    int M=0;
    String Result="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        Button BClear=(Button)findViewById(R.id.Bclear);
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
        Button BOpt=(Button)findViewById(R.id.BOpt);
        Button SB1=(Button)findViewById(R.id.SB1);
        Button SB2=(Button)findViewById(R.id.SB2);
        Button SB3=(Button)findViewById(R.id.SB3);
        Button SB4=(Button)findViewById(R.id.SB4);
        Button SB5=(Button)findViewById(R.id.SB5);
        Button SB6=(Button)findViewById(R.id.SB6);
        Button SB7=(Button)findViewById(R.id.SB7);
        Button SB8=(Button)findViewById(R.id.SB8);
        BOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu();
            }
        });
        BClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E=0;
                Expression="";
                ST1.setText("");
                ST2.setText("");
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="1";
                E=E*10+1;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(isJZ&&jz1==16){
                    Expression+="A";
                    ST1.setText(Expression);
                    getResult(Expression,jz1,jz2);
                    ST2.setText(Result);
                    return true;
                }
                return false;
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="2";
                E=E*10+2;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(isJZ&&jz1==16){
                    Expression+="B";
                    ST1.setText(Expression);
                    getResult(Expression,jz1,jz2);
                    ST2.setText(Result);
                    return true;
                }
                return false;
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="3";
                E=E*10+3;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(isJZ&&jz1==16){
                    Expression+="C";
                    ST1.setText(Expression);
                    getResult(Expression,jz1,jz2);
                    ST2.setText(Result);
                    return true;
                }
                return false;
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="4";
                E=E*10+4;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(isJZ&&jz1==16){
                    Expression+="D";
                    ST1.setText(Expression);
                    getResult(Expression,jz1,jz2);
                    ST2.setText(Result);
                    return true;
                }
                return false;
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="5";
                E=E*10+5;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(isJZ&&jz1==16){
                    Expression+="E";
                    ST1.setText(Expression);
                    getResult(Expression,jz1,jz2);
                    ST2.setText(Result);
                    return true;
                }
                return false;
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="6";
                E=E*10+6;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(isJZ&&jz1==16){
                    Expression+="F";
                    ST1.setText(Expression);
                    getResult(Expression,jz1,jz2);
                    ST2.setText(Result);
                    return true;
                }
                return false;
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="7";
                E=E*10+7;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=E*jz1/jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="8";
                E=E*10+8;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="9";
                E=E*10+9;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression+="0";
                E=E*10;
                ST1.setText(Expression);
                if(isJZ){
                    getResult(Expression,jz1,jz2);
                }
                else{
                    Result=(float)E*(float)jz1/(float)jz2+"";
                }
                ST2.setText(Result);
            }
        });
        SB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JZmenu1();
            }
        });
        SB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JZmenu2();
            }
        });
        SB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SJmenu1();
            }
        });
        SB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SJmenu2();
            }
        });
        SB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CDmenu1();
            }
        });
        SB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CDmenu2();
            }
        });
        SB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HKmenu1();
            }
        });
        SB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HKmenu2();
            }
        });
    }
    private void showPopupMenu(){
        TextView mPopupMenu=findViewById(R.id.BOpt);
        PopupMenu popupMenu = new PopupMenu(this,mPopupMenu);
        popupMenu.inflate(R.menu.popupmenu);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        final View v1=findViewById(R.id.BL1);
        final View v2=findViewById(R.id.BL2);
        final View v3=findViewById(R.id.BL3);
        final View v4=findViewById(R.id.BL4);
        final View v5=findViewById(R.id.BL5);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                E=0;
                Result="";
                jz1=0;
                jz2=0;
                ST1.setText("");
                ST2.setText("");
                final Button BOpt=(Button)findViewById(R.id.BOpt);
                switch (menuItem.getItemId()){
                    case R.id.action_1:{
                        v1.setVisibility(View.VISIBLE);
                        v2.setVisibility(View.INVISIBLE);
                        v3.setVisibility(View.INVISIBLE);
                        v4.setVisibility(View.INVISIBLE);
                        BOpt.setText("进制");
                        isJZ=true;
                        return true;
                    }
                    case R.id.action_2:{
                        v1.setVisibility(View.INVISIBLE);
                        v2.setVisibility(View.VISIBLE);
                        v3.setVisibility(View.INVISIBLE);
                        v4.setVisibility(View.INVISIBLE);
                        BOpt.setText("时间");
                        isJZ=false;
                        jz1=86400;
                        jz2=86400;
                        return true;
                    }
                    case R.id.action_3:{
                        v1.setVisibility(View.INVISIBLE);
                        v2.setVisibility(View.INVISIBLE);
                        v3.setVisibility(View.VISIBLE);
                        v4.setVisibility(View.INVISIBLE);
                        BOpt.setText("长度");
                        isJZ=false;
                        jz1=10000;
                        jz2=10000;
                        return true;
                    }
                    case R.id.action_4:{
                        v1.setVisibility(View.INVISIBLE);
                        v2.setVisibility(View.INVISIBLE);
                        v3.setVisibility(View.INVISIBLE);
                        v4.setVisibility(View.VISIBLE);
                        BOpt.setText("汇款");
                        isJZ=false;
                        jz1=10000;
                        jz2=10000;
                        return true;
                    }
                    default:{
                        v1.setVisibility(View.INVISIBLE);
                        v2.setVisibility(View.INVISIBLE);
                        v3.setVisibility(View.INVISIBLE);
                        v4.setVisibility(View.VISIBLE);
                        BOpt.setText("汇款");
                        isJZ=true;
                        jz1=10000;
                        jz2=10000;
                        return true;
                    }
                }
            }
        });
        popupMenu.show();
    }
    private void JZmenu1(){
        E=0;
        final TextView sb1Menu=findViewById(R.id.SB1);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        final Button B1=(Button)findViewById(R.id.B1);
        final Button B2=(Button)findViewById(R.id.B2);
        final Button B3=(Button)findViewById(R.id.B3);
        final Button B4=(Button)findViewById(R.id.B4);
        final Button B5=(Button)findViewById(R.id.B5);
        final Button B6=(Button)findViewById(R.id.B6);
        final Button B7=(Button)findViewById(R.id.B7);
        final Button B8=(Button)findViewById(R.id.B8);
        final Button B9=(Button)findViewById(R.id.B9);
        Button B0=(Button)findViewById(R.id.B0);
        PopupMenu popupMenu = new PopupMenu(this,sb1Menu);
        popupMenu.inflate(R.menu.jinzhi);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                final Button sb1=(Button)findViewById(R.id.SB1);
                switch (menuItem.getItemId()){
                    case R.id.JZ_2:{
                        jz1=2;
                        ST1.setText("");
                        ST2.setText("");
                        sb1.setText("二进制");
                        B2.setEnabled(false);
                        B3.setEnabled(false);
                        B4.setEnabled(false);
                        B5.setEnabled(false);
                        B6.setEnabled(false);
                        B7.setEnabled(false);
                        B8.setEnabled(false);
                        B9.setEnabled(false);
                        return true;
                    }
                    case R.id.JZ_8:{
                        jz1=8;
                        ST1.setText("");
                        ST2.setText("");
                        sb1.setText("八进制");
                        B2.setEnabled(true);
                        B3.setEnabled(true);
                        B4.setEnabled(true);
                        B5.setEnabled(true);
                        B6.setEnabled(true);
                        B7.setEnabled(true);
                        B8.setEnabled(false);
                        B9.setEnabled(false);
                        return true;
                    }
                    case R.id.JZ_10:{
                        jz1=10;
                        ST1.setText("");
                        ST2.setText("");
                        sb1.setText("十进制");
                        B2.setEnabled(true);
                        B3.setEnabled(true);
                        B4.setEnabled(true);
                        B5.setEnabled(true);
                        B6.setEnabled(true);
                        B7.setEnabled(true);
                        B8.setEnabled(true);
                        B9.setEnabled(true);
                        return true;
                    }
                    case R.id.JZ_16:{
                        jz1=16;
                        ST1.setText("");
                        ST2.setText("");
                        sb1.setText("十六进制");
                        B2.setEnabled(true);
                        B3.setEnabled(true);
                        B4.setEnabled(true);
                        B5.setEnabled(true);
                        B6.setEnabled(true);
                        B7.setEnabled(true);
                        B8.setEnabled(true);
                        B9.setEnabled(true);
                        return true;
                    }

                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void JZmenu2(){
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        final TextView sb2Menu=findViewById(R.id.SB2);
        PopupMenu popupMenu = new PopupMenu(this,sb2Menu);
        popupMenu.inflate(R.menu.jinzhi);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Button sb2=(Button)findViewById(R.id.SB2);
                switch (menuItem.getItemId()){
                    case R.id.JZ_2:{
                        jz2=2;
                        sb2.setText("二进制");
                        if(!ST1.getText().equals("")){
                            if(jz1==2){
                                ST2.setText(E+"");
                            }
                            else if(jz1==8){
                                ST2.setText(Integer.toBinaryString(Integer.valueOf(E+"",8)));
                            }
                            else if(jz1==10){
                                ST2.setText(Integer.toBinaryString(E));
                            }
                            else if(jz1==16){
                                ST2.setText(Integer.toBinaryString(Integer.valueOf(E+"",16)));
                            }
                        }
                        return true;
                    }
                    case R.id.JZ_8:{
                        jz2=8;
                        sb2.setText("八进制");
                        if(!ST1.getText().equals("")){
                            if(jz1==2){
                                ST2.setText(Integer.toOctalString(Integer.valueOf(E+"",2)));
                            }
                            else if(jz1==8){
                                ST2.setText(E+"");
                            }
                            else if(jz1==10){
                                ST2.setText(Integer.toOctalString(E));
                            }
                            else if(jz1==16){
                                ST2.setText(Integer.toOctalString(Integer.valueOf(E+"",16)));
                            }
                        }
                        return true;
                    }
                    case R.id.JZ_10:{
                        jz2=10;
                        sb2.setText("十进制");
                        if(!ST1.getText().equals("")){
                            if(jz1==2){
                                ST2.setText(Integer.valueOf(E+"",2));
                            }
                            else if(jz1==8){
                                ST2.setText(Integer.valueOf(E+"",8));
                            }
                            else if(jz1==10){
                                ST2.setText(E+"");
                            }
                            else if(jz1==16){
                                ST2.setText(Integer.valueOf(E+"",16));
                            }
                        }
                        return true;
                    }
                    case R.id.JZ_16:{
                        jz2=16;
                        sb2.setText("十六进制");
                        if(!ST1.getText().equals("")){
                            if(jz1==2){
                                ST2.setText(Integer.toHexString(Integer.valueOf(E+"",2)));
                            }
                            else if(jz1==8){
                                ST2.setText(Integer.toHexString(Integer.valueOf(E+"",8)));
                            }
                            else if(jz1==10){
                                ST2.setText(Integer.toHexString(E));
                            }
                            else if(jz1==16){
                                ST2.setText(E+"");
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void SJmenu1(){
        E=0;
        final TextView sb1Menu=findViewById(R.id.SB3);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        PopupMenu popupMenu = new PopupMenu(this,sb1Menu);
        popupMenu.inflate(R.menu.shijian);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                final Button sb3=(Button)findViewById(R.id.SB3);
                switch (menuItem.getItemId()){
                    case R.id.SJ_1 :{
                        jz1=31536000;
                        sb3.setText("年");
                        return true;
                    }case R.id.SJ_2:{
                        jz1=2592000;
                        sb3.setText("月");
                        return true;
                    }case R.id.SJ_3:{
                        jz1=604800;
                        sb3.setText("周");
                        return true;
                    }case R.id.SJ_4:{
                        jz1=86400;
                        sb3.setText("天");
                        return true;
                    }case R.id.SJ_5:{
                        jz1=3600;
                        sb3.setText("小时");
                        return true;
                    }case R.id.SJ_6:{
                        jz1=60;
                        sb3.setText("分钟");
                        return true;
                    }case R.id.SJ_7:{
                        jz1=1;
                        sb3.setText("秒");
                        return true;
                    }
                }
                return false;
            }
        });
        popupMenu.show();
    }

    private void SJmenu2(){
        final TextView sb1Menu=findViewById(R.id.SB3);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        PopupMenu popupMenu = new PopupMenu(this,sb1Menu);
        popupMenu.inflate(R.menu.shijian);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                final Button sb4=(Button)findViewById(R.id.SB4);
                switch (menuItem.getItemId()){
                    case R.id.SJ_1 :{
                        jz2=31536000;
                        sb4.setText("年");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.SJ_2:{
                        jz2=2592000;
                        sb4.setText("月");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.SJ_3:{
                        jz2=604800;
                        sb4.setText("周");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.SJ_4:{
                        jz2=86400;
                        sb4.setText("天");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.SJ_5:{
                        jz2=3600;
                        sb4.setText("小时");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.SJ_6:{
                        jz2=60;
                        sb4.setText("分钟");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.SJ_7:{
                        jz2=1;
                        sb4.setText("秒");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }
                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void CDmenu1(){
        E=0;
        final TextView sb1Menu=findViewById(R.id.SB5);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        PopupMenu popupMenu = new PopupMenu(this,sb1Menu);
        popupMenu.inflate(R.menu.changdu);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                final Button sb3=(Button)findViewById(R.id.SB5);
                switch (menuItem.getItemId()){
                    case R.id.CD_1 :{
                        jz1=10000000;
                        sb3.setText("千米");
                        return true;
                    }case R.id.CD_2:{
                        jz1=10000;
                        sb3.setText("米");
                        return true;
                    }case R.id.CD_3:{
                        jz1=3048;
                        sb3.setText("英尺");
                        return true;
                    }case R.id.CD_4:{
                        jz1=16093440;
                        sb3.setText("英里");
                        return true;
                    }
                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void CDmenu2(){
        final TextView sb1Menu=findViewById(R.id.SB3);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        PopupMenu popupMenu = new PopupMenu(this,sb1Menu);
        popupMenu.inflate(R.menu.changdu);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                final Button sb6=(Button)findViewById(R.id.SB6);
                switch (menuItem.getItemId()){
                    case R.id.CD_1 :{
                        jz2=10000000;
                        sb6.setText("千米");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.CD_2:{
                        jz2=10000;
                        sb6.setText("米");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.CD_3:{
                        jz2=3048;
                        sb6.setText("英尺");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.CD_4:{
                        jz2=16093440;
                        sb6.setText("英里");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }
                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void HKmenu1(){
        E=0;
        final TextView sb1Menu=findViewById(R.id.SB5);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        PopupMenu popupMenu = new PopupMenu(this,sb1Menu);
        popupMenu.inflate(R.menu.huikuan);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                final Button sb7=(Button)findViewById(R.id.SB7);
                switch (menuItem.getItemId()){
                    case R.id.HK_1 :{
                        jz1=10000;
                        sb7.setText("人民币");
                        return true;
                    }case R.id.HK_2:{
                        jz1=70659;
                        sb7.setText("美元");
                        return true;
                    }case R.id.HK_3:{
                        jz1=77767;
                        sb7.setText("欧元");
                        return true;
                    }case R.id.HK_4:{
                        jz1=87730;
                        sb7.setText("英镑");
                        return true;
                    }
                    case R.id.HK_5:{
                        jz1=653;
                        sb7.setText("日元");
                        return true;
                    }
                    case R.id.HK_6:{
                        jz1=59;
                        sb7.setText("韩元");
                        return true;
                    }
                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void HKmenu2(){
        final TextView sb1Menu=findViewById(R.id.SB3);
        final TextView ST2=(TextView)findViewById(R.id.ST2);
        final TextView ST1=(TextView)findViewById(R.id.ST1);
        PopupMenu popupMenu = new PopupMenu(this,sb1Menu);
        popupMenu.inflate(R.menu.huikuan);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                final Button sb8=(Button)findViewById(R.id.SB8);
                switch (menuItem.getItemId()){
                    case R.id.HK_1 :{
                        jz2=10000;
                        sb8.setText("人民币");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.HK_2:{
                        jz2=70659;
                        sb8.setText("美元");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.HK_3:{
                        jz2=77767;
                        sb8.setText("欧元");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }case R.id.HK_4:{
                        jz2=87730;
                        sb8.setText("英镑");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }
                    case R.id.HK_5:{
                        jz2=653;
                        sb8.setText("日元");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }
                    case R.id.HK_6:{
                        jz2=59;
                        sb8.setText("韩元");
                        if(!ST1.getText().equals("")){
                            ST2.setText((float)E*(float)jz1/(float)jz2+"");
                        }
                        return true;
                    }
                }
                return false;
            }
        });
        popupMenu.show();
    }

    public void getResult(String expression, int jz1, int jz2){
        M=Integer.valueOf(expression,jz1);
        switch ((int)jz2){
            case 2:Result= Integer.toBinaryString(M);break;
            case 8:Result=Integer.toOctalString(M);break;
            case 10:Result=String.valueOf(M);break;
            case 16:Result=Integer.toHexString(M);break;
        }
    }
}