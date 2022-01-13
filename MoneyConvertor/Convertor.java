package MoneyConvertor;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Convertor extends JFrame implements ActionListener{

    final int FRAME_WIDTH = 325;
    final int FRAME_HEIGHT = 250;
    static final DecimalFormat df = new DecimalFormat("0.00");

    private String[] convertList = {"Select Currency", "US Dollar", "Pounds", "Rupies", "Japanese Yen"};
    private JComboBox convertFrom = new JComboBox(convertList);
    private JComboBox convertTo = new JComboBox(convertList);
    private JLabel space = new JLabel(" ---------> ");
    private JLabel userInput = new JLabel("Enter amount of money");
    private JTextField amountField = new JTextField(10);
    private JButton calculateMe = new JButton("Calculate");
    private JLabel convertedAmount = new JLabel("Amount: ");
    private JLabel convertField = new JLabel("**********");

    public Convertor(){

        super("Money convertor");
        initializeToolWidgets();
        buildUserInterface();

    }//end converter

//------------------------------------------------------------------------------

    private void initializeToolWidgets(){

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
        String[] convertList = {"Select Currency", "US Dollar", "Pounds", "Rupies", "Japanese Yen"};
        JComboBox convertFrom = new JComboBox(convertList);
        JComboBox convertTo = new JComboBox(convertList);
        JLabel space = new JLabel("--------->");
        JLabel userInput = new JLabel("Enter amount of money");
        JTextField amountField = new JTextField(10);
        JButton calculateMe = new JButton("Calculate");
        JLabel convertedAmount = new JLabel("Amount: ");
        JLabel convertField = new JLabel("**********");

    }//end initializedWidgets()
//------------------------------------------------------------------------------

    private void buildUserInterface(){

        setLayout(new FlowLayout());
        add(convertFrom);
        add(space);
        add(convertTo);
        add(userInput);
        add(amountField);
        add(calculateMe);
        add(convertedAmount);
        add(convertField);
        calculateMe.addActionListener(this);
        //convertFrom.addActionListener(this);
        //convertTo.addActionListener(this);
    }//end builderInterface()

    //------------------------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e){

        String field = (String) convertFrom.getSelectedItem();

        switch (field) {
            case "US Dollar":
                UsDollar();
                break;
            case "Pounds":
                Pound();
                break;
            case "Rupies":
                Rupies();
                break;
            case "Japanese Yen":
                JapaneseYen();
                break;
            default:
                Error();
                break;
        }

    }//end actionPerformed(ActionEvent e)
    //---------------------------------------------------------------------
    void UsDollar(){
        double usDollar = 1;
        double pounds = 0.75;
        double rupies = 74.35;
        double yen = 113.87;
        String field = (String) convertTo.getSelectedItem();
        double amount = Double.parseDouble(amountField.getText());
        double convert = 1;
        String calculate;
        String complete = null;

        switch (field){

            case "US Dollar":
                convert = amount * usDollar;
                complete = "$" + df.format(convert);
                break;
            case "Pounds":
                convert = amount * pounds;
                complete = "£" + df.format(convert);
                break;
            case "Rupies":
                convert = amount * rupies;
                complete = "₹" + df.format(convert);
                break;
            case "Japanese Yen":
                convert = amount * yen;
                complete = "¥" + df.format(convert);
                break;
            default:
                Error();
                break;
        }
        calculate = complete;

        convertField.setText(calculate);
    }//end UsDollar()
    //-------------------------------------------------------------------
    void Pound(){

        double usDollar = 1.34;
        double pounds = 1;
        double rupies = 99.74;
        double yen = 152.78;
        String field = (String) convertTo.getSelectedItem();
        double amount = Double.parseDouble(amountField.getText());
        double convert = 1;
        String calculate;
        String complete = null;

        switch (field){

            case "US Dollar":
                //answer = "US Dollar";
                convert = amount * usDollar;
                complete = "$" + df.format(convert);
                break;
            case "Pounds":
                //answer = "Pounds";
                convert = amount * pounds;
                complete = "£" + df.format(convert);
                break;
            case "Rupies":
                //answer = "Rupies";
                convert = amount * rupies;
                complete = "₹" + df.format(convert);
                break;
            case "Japanese Yen":
                convert = amount * yen;
                complete = "¥" + df.format(convert);
                break;
            default:
                Error();
                break;
        }
        calculate = complete;

        convertField.setText(calculate);

    }//end Pound()
    //-------------------------------------------------------------------
    void Rupies(){
        double usDollar = 0.013;
        double pounds = 0.010;
        double rupies = 1;
        double yen = 1.53;
        String field = (String) convertTo.getSelectedItem();
        double amount = Double.parseDouble(amountField.getText());
        double convert = 1;
        String calculate;
        String complete = null;

        switch (field){

            case "US Dollar":
                //answer = "US Dollar";
                convert = amount * usDollar;
                complete = "$" + df.format(convert);
                break;
            case "Pounds":
                //answer = "Pounds";
                convert = amount * pounds;
                complete = "£" + df.format(convert);
                break;
            case "Rupies":
                //answer = "Rupies";
                convert = amount * rupies;
                complete = "₹" + df.format(convert);
                break;
            case "Japanese Yen":
                convert = amount * yen;
                complete = "¥" + df.format(convert);
                break;
            default:
                Error();
                break;
        }
        calculate = complete;

        convertField.setText(calculate);
    }//end rupies
//---------------------------------------------------------------------

    void JapaneseYen(){

        double usDollar = 0.088;
        double pounds = 0.065;
        double rupies = 0.65;
        double yen = 1;
        String field = (String) convertTo.getSelectedItem();
        double amount = Double.parseDouble(amountField.getText());
        double convert = 1;
        String calculate;
        String complete = null;

        switch (field){

            case "US Dollar":
                //answer = "US Dollar";
                convert = amount * usDollar;
                complete = "$" + df.format(convert);
                break;
            case "Pounds":
                //answer = "Pounds";
                convert = amount * pounds;
                complete = "£" + df.format(convert);
                break;
            case "Rupies":
                //answer = "Rupies";
                convert = amount * rupies;
                complete = "₹" + df.format(convert);
                break;
            case "Japanese Yen":
                convert = amount * yen;
                complete = "¥" + df.format(convert);
                break;
            default:
                Error();
                break;
        }
        calculate = complete;

        convertField.setText(calculate);

    }

    //---------------------------------------------------------------------
    void Error(){
        String field = (String) convertTo.getSelectedItem();
        String answer = "Error";
        convertField.setText(answer);

    }//end error

}//end convertor
