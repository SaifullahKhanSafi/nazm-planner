package nazmplanner;

import java.awt.EventQueue;
import nazmplanner.ui.MainFrame;

/**
 * <h2>PlannerApp</h2>
 * 
 * <p>Entry point for the app.</p>
 * 
 * @author Fahad Hassan
 * @version 21/11/2025
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
