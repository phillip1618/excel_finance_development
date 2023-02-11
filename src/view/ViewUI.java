package src.view;

import javax.swing.*;
import java.awt.*;

public class ViewUI extends JFrame {

    public ViewUI() {
        setTitle("JJEFA");
        setBounds(100,100,800,800);
        JPanel mainPanel = getMainPanel();
        JPanel annuityPlanPanel = getAnnuityPlanPanel();
        JPanel annuityPlanConfigPanel = getAnnuityPlanConfigPanel();

        mainPanel.add(annuityPlanConfigPanel);
        mainPanel.add(annuityPlanPanel);

        add(mainPanel);
    }

    public JPanel getMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        return mainPanel;
    }

    public JPanel getAnnuityPlanConfigPanel() {
        JPanel annuityPlanConfigPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;

        constr.gridx=0;
        constr.gridy=0;

        JLabel startYearLabel = new JLabel("Start Year");
        JLabel endYearLabel = new JLabel("End Year");

        JTextField startYearText = new JTextField(10);
        JTextField endYearText = new JTextField(10);

        annuityPlanConfigPanel.add(startYearLabel, constr);
        constr.gridx=1;
        annuityPlanConfigPanel.add(startYearText, constr);
        constr.gridx=2;
        annuityPlanConfigPanel.add(endYearLabel, constr);
        constr.gridx=3;
        annuityPlanConfigPanel.add(endYearText, constr);
        constr.gridx=0; constr.gridy=1;

        JLabel lumpSumLabel = new JLabel("Lump Sum");
        JLabel discountRateLabel = new JLabel("Discount Rate");
        JLabel colaCheckBoxLabel = new JLabel("COLA");

        JTextField lumpSumText = new JTextField(10);
        JTextField discountRateText = new JTextField(10);
        JCheckBox colaCheckBox = new JCheckBox();
        
        annuityPlanConfigPanel.add(lumpSumLabel, constr);
        constr.gridx=1;
        annuityPlanConfigPanel.add(lumpSumText, constr);
        constr.gridx=2;
        annuityPlanConfigPanel.add(discountRateLabel, constr);
        constr.gridx=3;
        annuityPlanConfigPanel.add(discountRateText, constr);
        constr.gridx=4;
        annuityPlanConfigPanel.add(colaCheckBoxLabel, constr);
        constr.gridx=5;
        annuityPlanConfigPanel.add(colaCheckBox, constr);

        return annuityPlanConfigPanel;
    }
    
    public JPanel getAnnuityPlanPanel() {
        JPanel annuityPlanPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;

        constr.gridx=0;
        constr.gridy=0;

        for (int i = 1; i < 6; i++) {
            String numbering = Integer.toString(i);

            JLabel durationLabel = new JLabel(numbering + ". Benefit Rider Length");
            JLabel withdrawalLabel = new JLabel("Withdrawal Amount");

            JTextField durationText = new JTextField(10);
            JTextField withdrawalText = new JTextField(10);

            annuityPlanPanel.add(durationLabel, constr);
            constr.gridx=1;
            annuityPlanPanel.add(durationText, constr);
            constr.gridx=2;
            annuityPlanPanel.add(withdrawalLabel, constr);
            constr.gridx=3;
            annuityPlanPanel.add(withdrawalText, constr);
            constr.gridx=0; constr.gridy+=1;
        }

        return annuityPlanPanel;
    }

    public static void main(String... arg) {
        ViewUI jframe = new ViewUI();
        jframe.setVisible(true);
    }
}
