// Michael Benson
// Section 10
// Quiz 3

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class quiz3 extends JApplet implements ActionListener {

    // property variables
    JTextField left_input = new JTextField("0");
    JLabel msg = new JLabel("Is Equal To");
    JTextField right_input = new JTextField("0");
    JLabel msg2 = new JLabel("No Input Yet");
    Dimension size = new Dimension(50,20);
    JLabel mod_spots1 = new JLabel("?");
    JLabel mod_spots2 = new JLabel("?");
    JLabel mod_spots3 = new JLabel("?");
    JLabel mod_spots4 = new JLabel("?");
    JLabel mod_spots5 = new JLabel("?");
    JLabel mod_spots6 = new JLabel("?");
    private int [] l_array = new int[10];
    private int [] r_array = new int[10];
    private int count = 0;
    private int pair_count = 0;
    String str = new String();



    public void init() {

	Container window = getContentPane();
	window.setLayout(new GridLayout(5,4));

	// set up the screen
	//left_input.setPreferredSize(size);
	window.add(left_input);
	
	msg.setOpaque(true);
	msg.setBackground(Color.yellow);
	
	window.add(msg);
	//right_input.setPreferredSize(size);
	
	window.add(right_input);
	msg2.setOpaque(true);
	msg2.setBackground(Color.green);
	window.add(msg2);

	mod_spots1.setOpaque(true);
	mod_spots1.setBackground(Color.black);

	window.add(mod_spots1);
	window.add(mod_spots2);
	window.add(mod_spots3);
	window.add(mod_spots4);
	window.add(mod_spots5);
	// attach the Listeners
	left_input.addActionListener(this);
	right_input.addActionListener(this);

	} // end init method

	public void actionPerformed (ActionEvent event) {

	int l_number = Integer.parseInt(left_input.getText());
	int r_number = Integer.parseInt(right_input.getText());

	if (count < 10) {
	    l_array[count] = l_number;
	    r_array[count] = r_number;
	    count++;
	    if (l_number > r_number) {
		msg.setText("Is Greater Then");
		}
	    else if (l_number < r_number) {
		msg.setText("Is Less Than");
		}
	    else {
		msg.setText("Is Equal To");
		pair_count++;
	        str = "Number of Equal Pairs is " + pair_count;
		msg2.setText(str); 
		}
	    }
	if (count > 9) {
	    msg2.setText("Ignoring Input");
	    }
	



	
	
	} // end ActionPerformed method
    } // end quiz3 class
