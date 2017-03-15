package at.sw2017.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculator extends Activity implements View.OnClickListener {

    Button buttonAdd;
    Button buttonMinus;
    Button buttonMul;
    Button buttonDivide;
    Button buttonResult;
    Button buttonC;
    Button buttonZero;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);
        buttonMinus= (Button)findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(this);
        buttonMul = (Button)findViewById(R.id.buttonMul);
        buttonMul.setOnClickListener(this);
        buttonDivide = (Button)findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(this);
        buttonResult = (Button)findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(this);
        buttonC = (Button)findViewById(R.id.buttonC);
        buttonC.setOnClickListener(this);
        buttonZero = (Button)findViewById(R.id.buttonZero);
        buttonZero.setOnClickListener(this);
        buttonOne = (Button)findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(this);
        buttonTwo = (Button)findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(this);
        buttonThree = (Button)findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(this);
        buttonFour = (Button)findViewById(R.id.buttonFour);
        buttonFour.setOnClickListener(this);
        buttonFive = (Button)findViewById(R.id.buttonFive);
        buttonFive.setOnClickListener(this);
        buttonSix = (Button)findViewById(R.id.buttonSix);
        buttonSix.setOnClickListener(this);
        buttonSeven = (Button)findViewById(R.id.buttonSeven);
        buttonSeven.setOnClickListener(this);
        buttonEight = (Button)findViewById(R.id.buttonEight);
        buttonEight.setOnClickListener(this);
        buttonNine = (Button)findViewById(R.id.buttonNine);
        buttonNine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
