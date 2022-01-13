package PaintEstimator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PaintFrame extends JFrame implements ActionListener{

    final int FRAME_WIDTH = 270;
    final int FRAME_HEIGHT = 400;
    final int LOW_QUALITY = 2;
    final int MID_QUALITY = 5;
    final int HIGH_QUALITY = 10;

    private JLabel length = new JLabel("Length of room:  ");
    private JTextField lengthField = new JTextField(10);
    private JLabel width = new JLabel("Width of room:  ");
    private JTextField widthField = new JTextField(10);
    private JLabel paintQuality = new JLabel("Select a paint quality:  ");
    private String[] paintArray ={"  ","Low Quality","Mid Quality","High Quality"};
    private JComboBox paintChoice = new JComboBox(paintArray);
    private JButton pressMe = new JButton("calculate");
    private JLabel sizeOfRoom = new JLabel("Room Size:  ");
    private JLabel squareFeet = new JLabel("  ");
    private JLabel estimatedCost = new JLabel("Estimated Cost:  ");
    private JLabel estimate = new JLabel("  ");
    private JLabel cost = new JLabel("  ");

//----------------------------------------------------------------------------

    public PaintFrame(){

        super("Paint Estimator");
        initializeToolWidgets();
        buildUserInterface();

    }//end PaintFrame()

    //------------------------------------------------------------------------
    private void initializeToolWidgets(){

        length = new JLabel("Length of room:  ");
        lengthField = new JTextField(10);
        width = new JLabel("Width of room:  ");
        widthField = new JTextField(10);
        paintQuality = new JLabel("Select a paint quality:  ");
        paintQuality.setFont(new Font("Arial", Font.BOLD, 22));
        String[] paintArray ={"  ","Low Quality","Mid Quality","High Quality"};
        paintChoice = new JComboBox(paintArray);
        pressMe = new JButton("calculate");
        sizeOfRoom = new JLabel("Room Size:  ");
        squareFeet = new JLabel("  ");
        estimatedCost = new JLabel("Estimated cost:  ");
        estimate= new JLabel("  ");
        cost = new JLabel(" ");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }// end initializeToolWidgets()

    //------------------------------------------------------------------------
    private void buildUserInterface(){

        setLayout(new FlowLayout());
        add(length);
        add(lengthField);
        add(width);
        add(widthField);
        add(paintQuality);
        add(paintChoice);
        add(pressMe);
        add(sizeOfRoom);
        add(squareFeet);
        add(cost);
        add(estimatedCost);
        add(estimate);
        pressMe.addActionListener(this);



    }//end buildUserInterface()

//-----------------------------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e){

        String quality = (String) paintChoice.getSelectedItem();
        int roomLength = Integer.parseInt(lengthField.getText());
        int roomWidth = Integer.parseInt(widthField.getText());
        int totalCost = 1;
        int roomSize;
        String room;
        String totalEstimate;

        roomSize = roomLength * roomWidth;


        if(quality.equals("High Quality")){
            totalCost = roomSize * HIGH_QUALITY;
        }
        else if (quality.equals("Mid Quality")){
            totalCost = roomSize * MID_QUALITY;
        }
        else if (quality.equals("Low Quality")){
            totalCost = roomSize * LOW_QUALITY;
        }

        room = roomSize + " sqft";
        totalEstimate = "$" + totalCost;

        squareFeet.setText(room);
        estimate.setText(totalEstimate);
    }//end action performed
}//end class
