package nazmplanner.ui.tasks;

import java.awt.Color;
import java.util.List;
import nazmplanner.domain.tasks.Task;
import nazmplanner.ui.components.CardListPanel;

public class TaskCardListPanel extends CardListPanel
{
   
    public TaskCardListPanel()
    {
        initStyling();
    }
    
    public void setTasks(List<Task> tasks)
    {
        clear();
        
        for (Task task : tasks)
        {
            addCard(new TaskCardPanel(task));
        }
    }
    
    private void initStyling()
    {
        setBackground(Color.LIGHT_GRAY);
    }
    
}