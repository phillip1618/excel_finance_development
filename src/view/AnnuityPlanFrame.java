package src.view;

import javax.swing.*;

import src.view.panels.AnnuityPlanConfigPanel;
import src.view.panels.AnnuityPlanPanel;
import src.view.panels.SubmissionPanel;

public class AnnuityPlanFrame extends JFrame {
    public AnnuityPlanConfigPanel annuityPlanConfigPanel = new AnnuityPlanConfigPanel();
    public AnnuityPlanPanel annuityPlanPanel = new AnnuityPlanPanel();
    public SubmissionPanel submissionPanel = new SubmissionPanel();

    public MainPanel mainPanel = new MainPanel();

    public AnnuityPlanFrame() {
        setTitle("JJEFA");
        setBounds(100,100,800,800);

        mainPanel.add(annuityPlanConfigPanel);
        mainPanel.add(annuityPlanPanel);
        mainPanel.add(submissionPanel);

        add(mainPanel);
    }

    public static void main(String... arg) {
        AnnuityPlanFrame annuityPlanFrame = new AnnuityPlanFrame();
        annuityPlanFrame.setVisible(true);
    }
}