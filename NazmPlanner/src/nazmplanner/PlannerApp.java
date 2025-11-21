package nazmplanner;

import java.awt.EventQueue;
import nazmplanner.ui.MainFrame;

/**
 * Entry point of the app.
 */
public class PlannerApp
{
   
    public void main()
    {
        EventQueue.invokeLater(() -> 
        {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }

}
