package Globales;


import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *  The WordWrapRenderer can be used as a renderer for a JTable column. It will
 *  allow the text to wrap to a new line and adjust the table row height.
 *
 *  Note. This renderer can only be used for a single column in the table.
 */
public class WordWrapRenderer extends JTextArea implements TableCellRenderer
{
    public WordWrapRenderer()
    {
        setLineWrap(true);
        setWrapStyleWord(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        setText( (value == null) ? "" : value.toString() );
        setSize(table.getColumnModel().getColumn(column).getWidth(), table.getRowHeight(row));

        //  Recalculate the preferred height now that the text and renderer width have been set.

        int preferredHeight = getPreferredSize().height;

        if (table.getRowHeight(row) != preferredHeight)
        {
            table.setRowHeight(row, preferredHeight);
        }

        return this;
    }

    public static void createAndShowGUI()
    {
        JTable table = new JTable(2, 3);
        table.setValueAt("A", 0, 0);
        table.setValueAt("This text should wrap by default", 0, 1);

        table.getColumnModel().getColumn(1).setCellRenderer( new WordWrapRenderer() );

        JFrame frame = new JFrame("TableBasic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new JScrollPane( table ) );
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }


}
