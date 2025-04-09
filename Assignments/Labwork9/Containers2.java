import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleSwingForm extends JFrame {
    
    private JTextField nameField;
    private JTextField emailField;
    private JTextArea commentsArea;
    private JButton submitButton;
    private JButton clearButton;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private ButtonGroup genderGroup;
    
    public SimpleSwingForm() {
        // Set up the frame
        super("User Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        
        // Create main panel with border layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Create form panel with more rows to accommodate gender selection
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 5, 10));
        
        // Create form components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        
        // Create gender radio buttons
        JLabel genderLabel = new JLabel("Gender:");
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        
        // Group radio buttons to ensure only one can be selected
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        
        // Pre-select male option
        maleRadioButton.setSelected(true);
        
        // Add radio buttons to the gender panel
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        
        JLabel commentsLabel = new JLabel("Comments:");
        commentsArea = new JTextArea(5, 20);
        commentsArea.setLineWrap(true);
        commentsArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(commentsArea);
        
        // Add components to form panel
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(genderLabel);
        formPanel.add(genderPanel);
        formPanel.add(commentsLabel);
        formPanel.add(scrollPane);
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");
        
        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);
        
        // Add action listeners
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String comments = commentsArea.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                
                if (name.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(SimpleSwingForm.this, 
                        "Please fill in all required fields",
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(SimpleSwingForm.this,
                        "Form submitted successfully!\n" +
                        "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "Comments: " + comments,
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                    clearForm();
                }
            }
        });
        
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
        
        // Add panels to main panel
        mainPanel.add(new JLabel("User Registration Form", JLabel.CENTER), BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        // Add main panel to frame
        add(mainPanel);
    }
    
    private void clearForm() {
        nameField.setText("");
        emailField.setText("");
        commentsArea.setText("");
        maleRadioButton.setSelected(true);
        nameField.requestFocus();
    }
    
    public static void main(String[] args) {
        // Use Event Dispatch Thread for Swing applications
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleSwingForm().setVisible(true);
            }
        });
    }
}
