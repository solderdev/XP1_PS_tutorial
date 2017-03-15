package at.sw2017.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity implements View.OnClickListener {

    public enum State {
        ADD, SUB, MUL, DIV, INIT, NUM
    }

    State state = State.INIT;

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

    TextView numberView;

    Integer firstNumber;

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

        numberView = (TextView)findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        Button clickedButton = (Button) v;

        switch (clickedButton.getId()) {
            case R.id.buttonAdd:
                clearNumberView();
                state = State.ADD;
                break;
            case R.id.buttonMinus:
                clearNumberView();
                state = State.SUB;
                break;
            case R.id.buttonMul:
                clearNumberView();
                state = State.MUL;
                break;
            case R.id.buttonDivide:
                clearNumberView();
                state = State.DIV;
                break;
            case R.id.buttonResult:
                calculateResult();
                state = State.INIT;
                break;
            case R.id.buttonC:
                clearTextView();
                break;
            default:
                String recentNumber = numberView.getText().toString();
                if (state == State.INIT) {
                    recentNumber = "";
                    state = State.NUM;
                }
                recentNumber += clickedButton.getText().toString();
                numberView.setText(recentNumber);
        }
    }

    private void clearTextView() {
        numberView.setText("0");
        firstNumber = 0;
        state = State.INIT;
    }

    private   void  clearNumberView() {
        String tempString = numberView.getText().toString();
        if (!tempString.equals("")) {
            firstNumber = Integer.valueOf(tempString);
        }
        numberView.setText("");
    }

    private void calculateResult() {
        int secondNumber = 0;
        String tempString = numberView.getText().toString();
        if (!tempString.equals("")) {
            secondNumber = Integer.valueOf(tempString);
        }
        int result;
        switch (state) {
            case ADD:
                result = Calculations.doAddition(firstNumber, secondNumber);
                break;
            case SUB:
                result = Calculations.doSubtraction(firstNumber, secondNumber);
                break;
            case MUL:
                result = Calculations.doMultiplication(firstNumber, secondNumber);
                break;
            case DIV:
                result = Calculations.doDivision(firstNumber, secondNumber);
                break;
            default:
                result = secondNumber;
        }
        numberView.setText(Integer.toString(result));
    }





}
