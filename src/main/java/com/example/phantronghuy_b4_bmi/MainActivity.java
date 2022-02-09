package com.example.phantronghuy_b4_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btnTinh;
    TextView textTitle,textNhapTen,textChieuCao,textNang,textBMI,textChuanDoan;
    EditText edtNhapTen,edtChieuCao,edtNang,edtBMI,edtChuanDoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTinh=findViewById(R.id.btnTinh);
        textTitle=findViewById(R.id.textTitle);
        textNhapTen=findViewById(R.id.textNhapTen);
        textChieuCao=findViewById(R.id.textChieuCao);
        textNang=findViewById(R.id.textNang);
        textBMI=findViewById(R.id.textBMI);
        textChuanDoan=findViewById(R.id.textChuanDoan);
        edtNhapTen=findViewById(R.id.edtNhapTen);
        edtChieuCao=findViewById(R.id.edtChieuCao);
        edtNang=findViewById(R.id.edtNang);
        edtBMI=findViewById(R.id.edtBMI);
        edtChuanDoan=findViewById(R.id.edtChuanDoan);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double H= Double.parseDouble(edtChieuCao.getText().toString());
                double W=Double.parseDouble(edtNang.getText().toString());
                double bmi= W/Math.pow(H,2);
                String chuandoan="";
                if (bmi<18)
                {
                    chuandoan="Ban Gay";
                }
                else if (bmi<=24.9)
                {
                    chuandoan="Ban binh thuong";
                }
                else if (bmi<=29.9)
                {
                    chuandoan="Ban beo phi do 1";
                }
                else if (bmi<=34.9)
                {
                    chuandoan="Ban beo phi do 2";
                }
                else {
                    chuandoan="Ban beo phi do 3";
                }
                DecimalFormat dfc= new DecimalFormat("#.0");
                edtBMI.setText(dfc.format(bmi));
                edtChuanDoan.setText(chuandoan);
            }
        });
    }
}