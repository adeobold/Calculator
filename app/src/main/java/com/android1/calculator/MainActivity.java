package com.android1.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String CalcParams = "CalcParams";

    private TextView outputText;

    private CalcParams calcParams;

    char separator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portrait_layout);
        initElements();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putParcelable(CalcParams, calcParams);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        calcParams = instanceState.getParcelable(CalcParams);
        setTextView();
    }

    private void setTextView() {
        outputText.setText(calcParams.getCurrentOutput());
    }

    private void initElements() {

        DecimalFormat format = (DecimalFormat) DecimalFormat.getInstance();
        DecimalFormatSymbols symbols = format.getDecimalFormatSymbols();
        separator = symbols.getDecimalSeparator();

        calcParams = new CalcParams();

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
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnRoot = findViewById(R.id.btnRoot);
        Button btnPercent = findViewById(R.id.btnProcent);
        Button btnIs = findViewById(R.id.btnIs);
        Button btnNegative = findViewById(R.id.btnNegative);
        Button btnDot = findViewById(R.id.btnDot);

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
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnRoot.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnIs.setOnClickListener(this);
        btnNegative.setOnClickListener(this);
        btnDot.setOnClickListener(this);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnClear:
                outputText.setText("0");
                calcParams.setFirstArg(0.0);
                calcParams.setSecondArg(0.0);
                calcParams.setOperation("");
                calcParams.setOperationInProgress(false);
                calcParams.setSecondArgInput(false);
                break;
            case R.id.btnZero:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("0");
                } else {
                    outputText.setText(outputText.getText() + "0");
                }
                break;
            case R.id.btnOne:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("1");
                } else {
                    outputText.setText(outputText.getText() + "1");
                }
                break;
            case R.id.btnTwo:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("2");
                } else {
                    outputText.setText(outputText.getText() + "2");
                }
                break;
            case R.id.btnThree:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("3");
                } else {
                    outputText.setText(outputText.getText() + "3");
                }
                break;
            case R.id.btnFour:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("4");
                } else {
                    outputText.setText(outputText.getText() + "4");
                }
                break;
            case R.id.btnFive:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("5");
                } else {
                    outputText.setText(outputText.getText() + "5");
                }
                break;
            case R.id.btnSix:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("6");
                } else {
                    outputText.setText(outputText.getText() + "6");
                }
                break;
            case R.id.btnSeven:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("7");
                } else {
                    outputText.setText(outputText.getText() + "7");
                }
                break;
            case R.id.btnEight:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("8");
                } else {
                    outputText.setText(outputText.getText() + "8");
                }
                break;
            case R.id.btnNine:
                if (outputText.getText().toString().equals("0") || calcParams.getSecondArgInput()) {
                    outputText.setText("");
                    calcParams.setSecondArgInput(false);
                }
                if (calcParams.getOperationInProgress()) {
                    outputText.setText("9");
                } else {
                    outputText.setText(outputText.getText() + "9");
                }
                break;
            case R.id.btnPlus:
                if (!calcParams.getOperationInProgress()) {
                    calcParams.setFirstArg(Double.valueOf(outputText.getText().toString()));
                    calcParams.setSecondArgInput(true);
                }
                calcParams.setOperation("plus");
                break;
            case R.id.btnMinus:
                if (!calcParams.getOperationInProgress()) {
                    calcParams.setFirstArg(Double.valueOf(outputText.getText().toString()));
                    calcParams.setSecondArgInput(true);
                }
                calcParams.setOperation("minus");
                break;
            case R.id.btnMultiply:
                if (!calcParams.getOperationInProgress()) {
                    calcParams.setFirstArg(Double.valueOf(outputText.getText().toString()));
                    calcParams.setSecondArgInput(true);
                }
                calcParams.setOperation("multiply");
                break;
            case R.id.btnDivide:
                if (!calcParams.getOperationInProgress()) {
                    calcParams.setFirstArg(Double.valueOf(outputText.getText().toString()));
                    calcParams.setSecondArgInput(true);
                }
                calcParams.setOperation("divide");
                break;
            case R.id.btnRoot:
                if (!calcParams.getOperationInProgress()) {
                    calcParams.setFirstArg(Double.valueOf(outputText.getText().toString()));
                    calcParams.setSecondArgInput(true);
                }
                calcParams.setOperation("root");
                outputText.setText(solve(calcParams.getFirstArg(), calcParams.getSecondArg(), calcParams.getOperation()));
                calcParams.setOperationInProgress(false);
                break;
            case R.id.btnProcent:
                if (!calcParams.getOperationInProgress()) {
                    calcParams.setFirstArg(Double.valueOf(outputText.getText().toString()));
                    calcParams.setSecondArgInput(true);
                }
                calcParams.setOperation("percent");
                break;
            case R.id.btnNegative:
                double tmpNegative = Double.parseDouble(outputText.getText().toString()) * -1.0;
                if ((tmpNegative - (int) tmpNegative) == 0) {
                    outputText.setText(String.valueOf((int) tmpNegative));
                } else {
                    outputText.setText(String.valueOf(tmpNegative));
                }
                break;
            case R.id.btnIs:
                calcParams.setSecondArg(Double.valueOf(outputText.getText().toString()));
                outputText.setText(solve(calcParams.getFirstArg(), calcParams.getSecondArg(), calcParams.getOperation()));
                calcParams.setOperationInProgress(false);
                break;
            case R.id.btnDot:
                outputText.setText(outputText.getText().toString() + separator);
        }

        calcParams.setCurrentOutput(outputText.getText().toString());

    }

    private String solve(Double firstArg, Double secondArg, String operation) {

        BigDecimal first = new BigDecimal(firstArg.toString());
        BigDecimal second = new BigDecimal(secondArg.toString());

        Double res = 0.0;

        try {
            switch (operation) {
                case "plus":
                    res = first.add(second).doubleValue();
                    break;
                case "minus":
                    res = first.subtract(second).doubleValue();
                    break;
                case "multiply":
                    res =  first.multiply(second).doubleValue();
                    break;
                case "divide":
                    res =  first.divide(second,13, RoundingMode.HALF_UP).doubleValue();
                    break;
                case "root":
                    res = Math.sqrt(second.doubleValue());
                    break;
                case "percent":
                    res = first.divide(new BigDecimal("100")).multiply(second).doubleValue();
                    break;
            }
        } catch (ArithmeticException e) {
            return "Ошибка";
        }

        return new DecimalFormat("0.#############").format(res);

    }

}