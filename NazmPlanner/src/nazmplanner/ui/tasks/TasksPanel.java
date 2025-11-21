package nazmplanner.ui.tasks;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import nazmplanner.ui.util.GBC;

public class TasksPanel extends JPanel
{
    private PrimaryPanel primaryPanel;
    private SidebarPanel sidebarPanel;
    
    public TasksPanel()
    {
        initLayout();
    }
    
    private void initLayout()
    {
        super.setLayout(new GridBagLayout());
        
        sidebarPanel = new SidebarPanel();
        super.add(sidebarPanel, 
                  new GBC(0, 0, 1, 1)
                  .setAnchor(GridBagConstraints.SOUTH)
                  .setWeight(0.20, 1.00)
                  .setFill(GridBagConstraints.BOTH));
        
        primaryPanel = new PrimaryPanel();
        super.add(primaryPanel, 
                  new GBC(1, 0, 1, 1)
                  .setAnchor(GridBagConstraints.NORTH)
                  .setWeight(0.80, 1.00)
                  .setFill(GridBagConstraints.BOTH));
    }
    
}
