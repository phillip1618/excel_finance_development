package src.view.panels;

import javax.swing.*;
import java.awt.*;

public class AnnuityPlanConfigPanel extends JPanel{
    public JLabel startYearLabel = new JLabel("Start Year");
    public JLabel endYearLabel = new JLabel("End Year");

    public JTextField startYearText = new JTextField(10);
    public JTextField endYearText = new JTextField(10);

    public JLabel lumpSumLabel = new JLabel("Lump Sum");
    public JLabel discountRateLabel = new JLabel("Discount Rate");
    public JLabel colaCheckBoxLabel = new JLabel("COLA");

    public JTextField lumpSumText = new JTextField(10);
    public JTextField discountRateText = new JTextField(10);
    public JCheckBox colaCheckBox = new JCheckBox();

    public AnnuityPlanConfigPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;

        constr.gridx=0;
        constr.gridy=0;

        add(startYearLabel, constr);
        constr.gridx=1;
        add(startYearText, constr);
        constr.gridx=2;
        add(endYearLabel, constr);
        constr.gridx=3;
        add(endYearText, constr);
        constr.gridx=0; constr.gridy=1;

        add(lumpSumLabel, constr);
        constr.gridx=1;
        add(lumpSumText, constr);
        constr.gridx=2;
        add(discountRateLabel, constr);
        constr.gridx=3;
        add(discountRateText, constr);
        constr.gridx=4;
        add(colaCheckBoxLabel, constr);
        constr.gridx=5;
        add(colaCheckBox, constr);
    }
}
