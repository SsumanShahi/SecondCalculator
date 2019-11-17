package com.secondcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //    private TextView tvview;
    EditText etview;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnadd, btnsub, btnmul, btndiv, btndel, btneql;
    public int num1, num2, result;
    char temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bindings
//        tvview=findViewById(R.id.tvview);
        etview = findViewById(R.id.etview);
        btn1 = findViewById(R.id.bt1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btndel = findViewById(R.id.btndel);
        btneql = findViewById(R.id.btneql);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "9");

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(etview.getText().toString() + "0");

            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etview.setText(null);
            }
        });


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(etview.getText() + "");
                temp = '+';
                //etview.getText().clear();
                //tvview.setText(fisrt + "+");
                //etview.setText(etview.getText() + "+");
                etview.setText(null);

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(etview.getText() + "");
                temp = '-';
                // etview.getText().clear();
                //tvview.setText(fisrt + "-");
//                etview.setText(etview.getText() + "-");

                etview.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(etview.getText() + "");
                temp = '*';

                //etview.getText().clear();
                // tvview.setText(fisrt + "*");
//                etview.setText(etview.getText() + "*");
                etview.setText(null);

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(etview.getText() + "");
                temp = '/';

                //etview.getText().clear();
                //tvview.setText(fisrt + "/");
//                etview.setText(etview.getText() + "/");
                etview.setText(null);

            }
        });

        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                etview.setText(null);
                num2 = Integer.parseInt(etview.getText() + "");
                switch (temp) {
                    case '+':
                        Calculatorclass ca = new Calculatorclass(num1, num2);
                        result = ca.add();
                        //tvview.setText(ca.add());
                        etview.setText(result + "");
                        break;
                    case '-':
                        Calculatorclass cs = new Calculatorclass(num1, num2);
                        //tvview.setText(cs.sub());
                        //etview.setText(Integer.toString(cs.sub()));
                        result = cs.sub();
                        etview.setText(result + "");
                        break;
                    case '*':
                        Calculatorclass cm = new Calculatorclass(num1, num2);
                        result = cm.mul();
                        etview.setText(result + "");
                        //tvview.setText(cm.mul());
                        //etview.setText(Integer.toString(cm.mul()));
                        break;
                    case '/':
                        Calculatorclass cd = new Calculatorclass(num1, num2);
                        result = cd.div();
                        etview.setText(result + "");
//                     //tvview.setText(cd.div());
//                     //etview.setText(Integer.toString(cd.div()));
                        break;
                }
            }
        });
    }
}
