package nazmplanner.ui;

import javax.swing.JFrame;
import nazmplanner.ui.tasks.*;

public class MainFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 600;
    private TasksPanel tasksPanel;
    
    public MainFrame()
    {
        super.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("Nazm Planner");
        
        tasksPanel = new TasksPanel();
        super.add(tasksPanel);
    }
}
