package com.example.programadviser_jmooc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private 封装实例变量 final保证expert被初始化
    private final ProgramExpert expert = new ProgramExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //使用匿名内部类在onCreate时为按钮设置监听器
        findViewById(R.id.find_language).setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        //获得Spinner引用
                        Spinner spinner = findViewById(R.id.feature);
                        //获得Spinner选项
                        String feature = spinner.getSelectedItem().toString();
                        //查询模型层
                        String language = expert.getLanguage(feature);
                        //获得Text View引用
                        TextView textView = findViewById(R.id.language);
                        //设置Text View文字
                        textView.setText(language);
                    }
                }
        );
    }
    public void onClickButton(View view){
//        //获得Spinner引用
//        Spinner spinner = findViewById(R.id.feature);
//        //获得Spinner选项
//        String feature = spinner.getSelectedItem().toString();
//        //获得Text View引用
//        TextView textView = findViewById(R.id.language);
//        //设置Text View文字
//        textView.setText(feature);

//        //获得Spinner引用
//        Spinner spinner = findViewById(R.id.feature);
//        //获得Spinner选项
//        String feature = spinner.getSelectedItem().toString();
//        //查询模型层
//        String language = expert.getLanguage(feature);
//        //获得Text View引用
//        TextView textView = findViewById(R.id.language);
//        //设置Text View文字
//        textView.setText(language);
    }
}
