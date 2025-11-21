package nazmplanner.ui.tasks;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Date;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import nazmplanner.ui.components.CardPanel;

/**
 * <h2>CreationFormPanel</h2>
 * 
 * <p>Sticky footer panel for creating new tasks.</p>
 * 
 * @author Fahad Hassan
 * @version 22/11/2025
 */
public class CreationFormPanel extends CardPanel
{
    private JButton addButton;
    private JTextField titleField;
    private JSpinner dateSpinner;
    
    public CreationFormPanel()
    {
        initComponents();
        initLayout();
        initStyling();
    }
    
    private void initComponents()
    {
        addButton = new JButton("+");
        titleField = new JTextField();
        titleField.setToolTipText("What needs to be done?");
        
        SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, java.util.Calendar.HOUR_OF_DAY);
        dateSpinner = new JSpinner(model);        
        JSpinner.DateEditor editor = new JSpinner.DateEditor(dateSpinner, "dd/MM/yyyy HH:mm");
        dateSpinner.setEditor(editor);
        dateSpinner.setPreferredSize(new Dimension(150, 25));
    }
    
    private void initLayout()
    {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        add(addButton);
        add(Box.createHorizontalStrut(10)).setMaximumSize(getPreferredSize());
        add(titleField);
        add(Box.createHorizontalGlue());
        add(dateSpinner);
    }
    
    private void initStyling()
    {
        setBackground(Color.DARK_GRAY);
    }
    
}
