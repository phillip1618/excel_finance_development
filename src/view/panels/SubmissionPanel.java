package src.view.panels;

import javax.swing.*;
import java.awt.*;

public class SubmissionPanel extends JPanel {
    public JLabel fileLocationLabel = new JLabel("File Location");
    public JTextField fileLocationText = new JTextField(25);
    
    public JButton submitButton = new JButton("Submit");

    public SubmissionPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;

        constr.gridx=0;
        constr.gridy=0;

        fileLocationText.setEditable(false);

        add(fileLocationLabel, constr);
        constr.gridx=1;
        add(fileLocationText);
        constr.gridx=0; constr.gridy=1;
        add(submitButton);
    }

}
