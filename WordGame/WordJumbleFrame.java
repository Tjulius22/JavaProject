package WordGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class WordJumbleFrame extends JFrame implements ActionListener{

    final int FRAME_WIDTH = 260;
    final int FRAME_HEIGHT = 400;
    final int MAX_LENGTH = 10;

    private String[] settingArray ={"  ","Easy","Medium","Hard"};
    private JComboBox difficultySetting = new JComboBox(settingArray);
    private JLabel selectDifficulty = new JLabel("Select Difficulty: ");
    private JLabel difficulty = new JLabel(" ");
    private JButton pressMe = new JButton("Start");
    private JLabel select = new JLabel("Difficulty: ");
    private JLabel space = new JLabel(" || ");
    private JLabel word = new JLabel("Word is: ");
    private JLabel randomWord = new JLabel("  ");
    private JLabel guess = new JLabel("Guess:");
    private JTextField guessField = new JTextField(10);
    private JButton attemptMe = new JButton("Attempt");
    private JLabel correctWord = new JLabel("***");
    private JLabel answer = new JLabel("*****");

    //--------------------------------------------------------------------------------------

    public WordJumbleFrame(){

        super("Word Jumble");
        initializeToolWidgets();
        buildUserInterface();

    }//end wordjumpleframe()

//---------------------------------------------------------------------------------------

    private void initializeToolWidgets(){

        String[] settingArray ={"  ","Easy","Medium","Hard"};
        difficultySetting = new JComboBox(settingArray);
        selectDifficulty = new JLabel("Select Difficulty: ");
        difficulty = new JLabel(" ");
        pressMe = new JButton("Start");
        JLabel space = new JLabel(" || ");
        select = new JLabel("Difficulty: ");
        //select.setFont(new Font("Arial", Font.BOLD, 17));
        word = new JLabel("Word is: ");
        //word.setFont(new Font("Arial", Font.BOLD, 17));
        randomWord = new JLabel("  ");
        JLabel guess = new JLabel("Guess:");
        JTextField guessField = new JTextField(10);
        JButton attemptMe = new JButton("Attempt");
        JLabel correctWord = new JLabel("***");
        JLabel answer = new JLabel("*****");

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//end initializeToolWidgets

//---------------------------------------------------------------------------------------

    private void buildUserInterface(){

        setLayout(new FlowLayout());
        add(selectDifficulty);
        add(difficultySetting);
        add(pressMe);
        add(select);
        add(difficulty);
        add(space);
        add(word);
        add(randomWord);
        add(guess);
        add(guessField);
        add(attemptMe);
        //add(correctWord);
        add(answer);
        pressMe.addActionListener(this);
        attemptMe.addActionListener(this);

    }//end buildUserInterface()

//--------------------------------------------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e){


        Random random = new Random();

        String option = (String)difficultySetting.getSelectedItem();
        difficulty.setText(option);
        if (e.getSource()== pressMe) {

            switch (option) {
                case "Easy": {

                    String[] easyArray = {"hive", "navy", "mask", "blue", "pink", "java", "find", "baby", "Aunt", "duck"};
                    int index = random.nextInt(easyArray.length);

                    Random generator = new Random();
                    StringBuffer buffer = new StringBuffer(easyArray[index]);
                    int tempIndex;
                    char tempA;
                    char tempB;
                    String result;
                    String rightWord;

                    for (int i = 1; i < easyArray[index].length(); i++) {

                        tempIndex = generator.nextInt(easyArray[index].length());

                        tempA = buffer.charAt(i);
                        tempB = buffer.charAt(tempIndex);
                        buffer.setCharAt(i, tempB);
                        buffer.setCharAt(tempIndex, tempA);
                    }  //end for loop

                    rightWord = easyArray[index];
                    result = buffer.toString();

                    correctWord.setText(rightWord);
                    randomWord.setText(result);
                    break;
                }//end easy case

                case "Medium": {

                    String[] mediumArray = {"heavy", "metal", "water", "goose", "price", "paint", "cycle", "boxer", "cover", "unity"};
                    int index = random.nextInt(mediumArray.length);

                    Random generator = new Random();
                    StringBuffer buffer = new StringBuffer(mediumArray[index]);
                    int tempIndex;
                    char tempA;
                    char tempB;
                    String result;
                    String rightWord;

                    for (int i = 1; i < mediumArray[index].length(); i++) {

                        tempIndex = generator.nextInt(mediumArray[index].length());

                        tempA = buffer.charAt(i);
                        tempB = buffer.charAt(tempIndex);
                        buffer.setCharAt(i, tempB);
                        buffer.setCharAt(tempIndex, tempA);
                    }  //end for loop

                    rightWord = mediumArray[index];
                    result = buffer.toString(); //end for loop

                    correctWord.setText(rightWord);
                    randomWord.setText(result);
                    break;
                }//end medium case

                case "Hard": {

                    String[] hardArray = {"laptop", "goblet", "horror", "resume", "letter", "keiser", "oracle", "public", "string", "double"};
                    int index = random.nextInt(hardArray.length);

                    Random generator = new Random();
                    StringBuffer buffer = new StringBuffer(hardArray[index]);
                    int tempIndex;
                    char tempA;
                    char tempB;
                    String result;
                    String rightWord;

                    for (int i = 1; i < hardArray[index].length(); i++) {

                        tempIndex = generator.nextInt(hardArray[index].length());

                        tempA = buffer.charAt(i);
                        tempB = buffer.charAt(tempIndex);
                        buffer.setCharAt(i, tempB);
                        buffer.setCharAt(tempIndex, tempA);
                    }  //end for loop

                    rightWord = hardArray[index];
                    result = buffer.toString();  //end  for loop

                    correctWord.setText(rightWord);
                    randomWord.setText(result);
                    break;
                }//end hard case
            }// end switch
        }//end if

        else if((e.getSource()== attemptMe)){
            String guessAttempt = guessField.getText();
            String correct = correctWord.getText();

            if (guessAttempt.equals(correct)){
                String response = "Correct";

                answer.setText(response);
            }
            else{
                String response = "wrong";

                answer.setText(response);
            }
        }
    }//end actionPerformed

}//end class

