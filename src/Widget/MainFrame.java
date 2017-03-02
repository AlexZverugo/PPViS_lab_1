package Widget;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by Admin on 01.03.2017.
 */
public class MainFrame {
    JPanel jpnl1;
    JPanel jpnl2;
    JPanel jpnl3;
    JPanel jpnl4;
    JPanel jpnl5;
    JLabel jlab1;
    JLabel jlab2;
    JLabel jlab3;
    JLabel jlab4;
    JLabel jlab5;
    JButton jbtnAddText;
    JTextField jtfAddText;
    JComboBox jcbGetText;
    JTextField jtfAddInf;
    JButton jbtnSetName;
    JButton jbtnGetName;
    JRadioButton jrbOne;
    JRadioButton jrbTwo;
    JRadioButton jrbThree;
    JTextField jtfSelectButton;
    JButton jbtnSelect;
    JTextField jtfSelectCheckBox;
    JButton jbtnSelectCheckBox;
    JCheckBox jcbOne;
    JCheckBox jcbTwo;
    JCheckBox jcbThree;
    int check=0;

    MainFrame(){
        JFrame jfrm = new JFrame("Widget");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(900,300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jpnl1 = new JPanel();
        jpnl1.setPreferredSize(new Dimension(150,230));
        jpnl1.setOpaque(true);
        jpnl1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        jpnl2 = new JPanel();
        jpnl2.setPreferredSize(new Dimension(150,230));
        jpnl2.setOpaque(true);
        jpnl2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        jpnl3 = new JPanel();
        jpnl3.setPreferredSize(new Dimension(150,230));
        jpnl3.setOpaque(true);
        jpnl3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        jpnl4 = new JPanel();
        jpnl4.setPreferredSize(new Dimension(150,230));
        jpnl4.setOpaque(true);
        jpnl4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        jpnl5 = new JPanel();
        jpnl5.setPreferredSize(new Dimension(180,230));
        jpnl5.setOpaque(true);
        jpnl5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

        jlab1 = new JLabel("Task 1");
        jlab2 = new JLabel("Task 2");
        jlab3 = new JLabel("Task 3");
        jlab4 = new JLabel("Task 4");
        jlab5 = new JLabel("Task 5");
        jlab5.setHorizontalTextPosition(SwingConstants.CENTER);

        jpnl1.add(jlab1);
        jpnl2.add(jlab2);
        jpnl3.add(jlab3);
        jpnl4.add(jlab4);
        jpnl5.add(jlab5);

        jtfAddText = new JTextField(10);
        jcbGetText = new JComboBox();
        jcbGetText.setEditable(true);
        jbtnAddText = new JButton("Add text");
        jtfAddInf = new JTextField(10);
        jbtnSetName = new JButton("Give it a name");
        jbtnGetName = new JButton("Empty");

        jbtnSetName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jbtnGetName.setText(jtfAddInf.getText());
            }
        });

        jpnl1.add(jtfAddText);
        jpnl1.add(jcbGetText);
        jpnl1.add(jbtnAddText);

        jbtnGetName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              String Name = jbtnSetName.getText();
              jbtnSetName.setText(jbtnGetName.getText());
              jbtnGetName.setText(Name);
            }
        });

        jpnl2.add(jtfAddInf);
        jpnl2.add(jbtnSetName);
        jpnl2.add(jbtnGetName);

        jbtnAddText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String item = jtfAddText.getText();
            if (item == null) return;
            int i;
            for (i=0; i<jcbGetText.getItemCount(); i++)
                if(item.equals(jcbGetText.getItemAt(i))||item.equals(""))
                    JOptionPane.showMessageDialog(jcbGetText, "Text has already existed!");
            if (i == jcbGetText.getItemCount()) jcbGetText.addItem(item);
            }
        });

        jtfSelectButton = new JTextField(10);
        jbtnSelect = new JButton("Select");
        jrbOne = new JRadioButton("One");
        jrbTwo = new JRadioButton("Two");
        jrbThree = new JRadioButton("Three");

        ButtonGroup bg = new ButtonGroup();
        bg.add(jrbOne);
        bg.add(jrbTwo);
        bg.add(jrbThree);

        jpnl3.add(jtfSelectButton);
        jpnl3.add(jbtnSelect);
        jpnl3.add(jrbOne);
        jpnl3.add(jrbTwo);
        jpnl3.add(jrbThree);

        jbtnSelect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jtfSelectButton.getText().equals(jrbOne.getText()))
                    jrbOne.setSelected(true);
                else if(jtfSelectButton.getText().equals(jrbTwo.getText()))
                    jrbTwo.setSelected(true);
                else if(jtfSelectButton.getText().equals(jrbThree.getText()))
                    jrbThree.setSelected(true);
                else JOptionPane.showMessageDialog(jbtnSelect, "There is no such button!");
            }
        });

        ///
        jtfSelectCheckBox = new JTextField(10);
        jbtnSelectCheckBox = new JButton("Select this.");
        jcbOne = new JCheckBox("One");
        jcbTwo = new JCheckBox("Two");
        jcbThree = new JCheckBox("Three");

        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(jcbOne);
        bgroup.add(jcbTwo);
        bgroup.add(jcbThree);

        jpnl4.add(jtfSelectCheckBox);
        jpnl4.add(jbtnSelectCheckBox);
        jpnl4.add(jcbOne);
        jpnl4.add(jcbTwo);
        jpnl4.add(jcbThree);

        jbtnSelectCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jtfSelectCheckBox.getText().equals(jcbOne.getText()))
                    jcbOne.setSelected(true);
                else if(jtfSelectCheckBox.getText().equals(jcbTwo.getText()))
                    jcbTwo.setSelected(true);
                else if(jtfSelectCheckBox.getText().equals(jcbThree.getText()))
                    jcbThree.setSelected(true);
                else JOptionPane.showMessageDialog(jbtnSelect, "There is no such CheckButton!");
            }
        });

        JTable tbl = new JTable(5,2);
        JTextField jtfNewValue = new JTextField(12);
        JButton jbtnAddToFirst = new JButton("Add to first column.");
        JButton jbtnMoveToSecond = new JButton("Move to second column.");
        JButton jbtnMoveToFirst = new JButton("Move to first column.");

        jpnl5.add(jtfNewValue);
        jpnl5.add(jbtnAddToFirst);
        jpnl5.add(jbtnMoveToSecond);
        jpnl5.add(jbtnMoveToFirst);
        jpnl5.add(tbl);

        jbtnAddToFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(check == 5)
                    JOptionPane.showMessageDialog(tbl, "There is no place in first column!");
                else {
                    tbl.setValueAt(jtfNewValue.getText(), check, 0);
                    check++;
                }
            }
        });

        jbtnMoveToSecond.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = "";
                tbl.setValueAt(tbl.getValueAt((check-1),0), (check-1), 1);
                tbl.setValueAt(str ,(check-1), 0);
            }
        });

        jbtnMoveToFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = "";
                tbl.setValueAt(tbl.getValueAt((check-1),1), (check-1), 0);
                tbl.setValueAt(str ,(check-1), 1);
            }
        });

        jfrm.getContentPane().add(jpnl1);
        jfrm.getContentPane().add(jpnl2);
        jfrm.getContentPane().add(jpnl3);
        jfrm.getContentPane().add(jpnl4);
        jfrm.getContentPane().add(jpnl5);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }

}
