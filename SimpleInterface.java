
package simple.pkginterface;

import java.awt.*;
import javax.swing.*;

public class SimpleInterface extends JFrame {

    // Declare components
    private JLabel label, label2, label3, label4, label5;
    private JTextField textField;
    private JButton button;
    private JCheckBox checkBox, checkBox2;
    private JRadioButton radioButton1, radioButton2;
    private JComboBox<String> comboBox;
    private JTextArea textArea;
    private ButtonGroup radioGroup;

    public SimpleInterface() {
        super("Zus Coffee App");
        
        // Set layout for the container
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        label3 = new JLabel("\t                          ");
        container.add(label3);
        
        Icon rabbit = new ImageIcon("C:\\Users\\60135\\Downloads\\Zus-Coffee-eGift-Card (3).jpg");
        label2 = new JLabel("", rabbit,SwingConstants.CENTER);
        label2.setToolTipText("YUMMYYY");
        label2.setLocation(100,200);
        container.add(label2);
        
        label5 = new JLabel("\n                                                    ");
        container.add(label5);
         // JComboBox
        // JLabel
        label = new JLabel("Enter your name:");
        container.add(label);

        // JTextField
        textField = new JTextField(15);
        container.add(textField);

        label3 = new JLabel("\t");
        container.add(label3);
        // JRadioButton
        radioButton1 = new JRadioButton("Self-pickup");
        radioButton2 = new JRadioButton("Delivery");
        radioGroup = new ButtonGroup(); // To group the radio buttons
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        container.add(radioButton1);
        container.add(radioButton2);
        
        label5 = new JLabel("\n\t");
        container.add(label5);
         // JComboBox
        String[] options = { "Select your beverages", "Baby-cino", "Spanish Latte", "Watermelon Frappe", "Matcha Latte" };
        comboBox = new JComboBox<>(options);
        container.add(comboBox);
        
        label4 = new JLabel("\n");
        container.add(label4);
        // JCheckBox
        checkBox = new JCheckBox("Straw\n");
        checkBox2 = new JCheckBox("Bag");
        container.add(checkBox);
        container.add(checkBox2);

        label2 = new JLabel("Description: ");
        container.add(label2);
        // JTextArea with JScrollPane for scrollable text area
        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea); // Wrap JTextArea in JScrollPane
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        container.add(scrollPane); // Add the scrollable text area
        
        // JButton
        button = new JButton("Send Order");
        container.add(button);

        // Set the size of the JFrame and make it visible
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleInterface(); // Create and display the interface
    }
}
