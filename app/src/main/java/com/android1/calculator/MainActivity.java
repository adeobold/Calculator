package com.android1.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView outputText;

    private Boolean operationInProgress = false;

    private CalcParams calcParams = new CalcParams();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portrait_layout);
        initElements();
    }

    private void initElements(){

        outputText = findViewById(R.id.outputText);

        Button btnClear = findViewById(R.id.btnClear);

        Button btnZero = findViewById(R.id.btnZero);
        Button btnOne = findViewById(R.id.btnOne);
        Button btnTwo = findViewById(R.id.btnTwo);
        Button btnThree = findViewById(R.id.btnThree);
        Button btnFour = findViewById(R.id.btnFour);
        Button btnFive = findViewById(R.id.btnFive);
        Button btnSix = findViewById(R.id.btnSix);
        Button btnSeven = findViewById(R.id.btnSeven);
        Button btnEight = findViewById(R.id.btnEight);
        Button btnNine = findViewById(R.id.btnNine);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnPlus = findViewById(R.id.btnMinus);
        Button btnPlus = findViewById(R.id.btnMultiply);
        Button btnPlus = findViewById(R.id.btnDivide);

        btnClear.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);

    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnClear:
                outputText.setText("0");
                break;
            case R.id.btnZero:
                if (operationInProgress){
                    outputText.setText("0");
                } else {
                    outputText.setText(outputText.getText() + "0");
                }
                break;
            case R.id.btnOne:
                if (operationInProgress){
                    outputText.setText("1");
                } else {
                    outputText.setText(outputText.getText() + "1");
                }
                break;
            case R.id.btnTwo:
                if (operationInProgress){
                    outputText.setText("2");
                } else {
                    outputText.setText(outputText.getText() + "2");
                }
                break;
            case R.id.btnThree:
                if (operationInProgress){
                    outputText.setText("3");
                } else {
                    outputText.setText(outputText.getText() + "3");
                }
                break;
            case R.id.btnFour:
                if (operationInProgress){
                    outputText.setText("4");
                } else {
                    outputText.setText(outputText.getText() + "4");
                }
                break;
            case R.id.btnFive:
                if (operationInProgress){
                    outputText.setText("5");
                } else {
                    outputText.setText(outputText.getText() + "5");
                }
                break;
            case R.id.btnSix:
                if (operationInProgress){
                    outputText.setText("6");
                } else {
                    outputText.setText(outputText.getText() + "6");
                }
                break;
            case R.id.btnSeven:
                if (operationInProgress){
                    outputText.setText("7");
                } else {
                    outputText.setText(outputText.getText() + "7");
                }
                break;
            case R.id.btnEight:
                if (operationInProgress){
                    outputText.setText("8");
                } else {
                    outputText.setText(outputText.getText() + "8");
                }
                break;
            case R.id.btnNine:
                if (operationInProgress){
                    outputText.setText("9");
                } else {
                    outputText.setText(outputText.getText() + "9");
                }
                break;
        }


    }

}