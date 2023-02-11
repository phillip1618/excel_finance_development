package src.view;

import javax.swing.*;
import java.awt.*;

public class ViewUI extends JFrame {

    public ViewUI() {
        setTitle("JJEFA");
        setBounds(100,100,800,800);
        JPanel mainPanel = getMainPanel();
        JPanel annuityPlanPanel = getAnnuityPlanPanel();

        mainPanel.add(annuityPlanPanel);
        add(mainPanel);
    }

    public JPanel getMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        return mainPanel;
    }

    public JPanel getAnnuityPlanPanel() {
        JPanel annuityPlanPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;

        constr.gridx=0;
        constr.gridy=0;

        JLabel durationLabel1 = new JLabel("1. Annuity Plan Duration");
        JLabel durationLabel2 = new JLabel("2. Annuity Plan Duration");
        JLabel withdrawalLabel1 = new JLabel("1 Annual Withdrawal");
        JLabel withdrawalLabel2 = new JLabel("2 Annual Withdrawal");

        JTextField durationText1 = new JTextField(10);
        JTextField durationText2 = new JTextField(10);
        JTextField withdrawalText1 = new JTextField(10);
        JTextField withdrawalText2 = new JTextField(10);

        annuityPlanPanel.add(durationLabel1, constr);
        constr.gridx=1;
        annuityPlanPanel.add(durationText1, constr);
        constr.gridx=2;
        annuityPlanPanel.add(withdrawalLabel1, constr);
        constr.gridx=3;
        annuityPlanPanel.add(withdrawalText1, constr);
        constr.gridx=0; constr.gridy=1;

        annuityPlanPanel.add(durationLabel2, constr);
        constr.gridx=1;
        annuityPlanPanel.add(durationText2, constr);
        constr.gridx=2;
        annuityPlanPanel.add(withdrawalLabel2, constr);
        constr.gridx=3;
        annuityPlanPanel.add(withdrawalText2, constr);

        constr.gridwidth = 2;
        constr.anchor = GridBagConstraints.CENTER;

        return annuityPlanPanel;
    }

    public static void main(String... arg) {
        ViewUI jframe = new ViewUI();
        jframe.setVisible(true);
    }
}
