package src.view.panels;

import javax.swing.*;
import java.awt.*;

public class AnnuityPlanPanel extends JPanel{
    public JLabel durationLabel1 = new JLabel("1. Benefit Rider Length");
    public JLabel withdrawalLabel1 = new JLabel("Withdrawal Amount");

    public JLabel durationLabel2 = new JLabel("2. Benefit Rider Length");
    public JLabel withdrawalLabel2 = new JLabel("Withdrawal Amount");

    public JLabel durationLabel3 = new JLabel("3. Benefit Rider Length");
    public JLabel withdrawalLabel3 = new JLabel("Withdrawal Amount");

    public JLabel durationLabel4 = new JLabel("4. Benefit Rider Length");
    public JLabel withdrawalLabel4 = new JLabel("Withdrawal Amount");

    public JLabel durationLabel5 = new JLabel("5. Benefit Rider Length");
    public JLabel withdrawalLabel5 = new JLabel("Withdrawal Amount");

    public JTextField durationText1 = new JTextField(10);
    public JTextField withdrawalText1 = new JTextField(10);

    public JTextField durationText2 = new JTextField(10);
    public JTextField withdrawalText2 = new JTextField(10);

    public JTextField durationText3 = new JTextField(10);
    public JTextField withdrawalText3 = new JTextField(10);

    public JTextField durationText4 = new JTextField(10);
    public JTextField withdrawalText4 = new JTextField(10);

    public JTextField durationText5 = new JTextField(10);
    public JTextField withdrawalText5 = new JTextField(10);

    public AnnuityPlanPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;

        constr.gridx=0;
        constr.gridy=0;

        add(durationLabel1, constr);
        constr.gridx=1;
        add(durationText1, constr);
        constr.gridx=2;
        add(withdrawalLabel1, constr);
        constr.gridx=3;
        add(withdrawalText1, constr);
        constr.gridx=0; constr.gridy+=1;

        add(durationLabel2, constr);
        constr.gridx=1;
        add(durationText2, constr);
        constr.gridx=2;
        add(withdrawalLabel2, constr);
        constr.gridx=3;
        add(withdrawalText2, constr);
        constr.gridx=0; constr.gridy+=1;

        add(durationLabel3, constr);
        constr.gridx=1;
        add(durationText3, constr);
        constr.gridx=2;
        add(withdrawalLabel3, constr);
        constr.gridx=3;
        add(withdrawalText3, constr);
        constr.gridx=0; constr.gridy+=1;

        add(durationLabel4, constr);
        constr.gridx=1;
        add(durationText4, constr);
        constr.gridx=2;
        add(withdrawalLabel4, constr);
        constr.gridx=3;
        add(withdrawalText4, constr);
        constr.gridx=0; constr.gridy+=1;

        add(durationLabel5, constr);
        constr.gridx=1;
        add(durationText5, constr);
        constr.gridx=2;
        add(withdrawalLabel5, constr);
        constr.gridx=3;
        add(withdrawalText5, constr);
        constr.gridx=0; constr.gridy+=1;
    }
    
}
