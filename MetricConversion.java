import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MetricConversion implements ActionListener {
    JFrame frame;
    JPanel contentPane;
    JLabel prompt, answer;
    JComboBox conversion;
    public MetricConversion() {
        frame = new JFrame("MetricConversion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane,
                BoxLayout.PAGE_AXIS));
        contentPane.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));

        prompt = new JLabel("Select a Conversion Type:");
        prompt.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        prompt.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        contentPane.add(prompt);

        String[] conversions = {"Inches to Centimeters",
                "Feet to Centimeters",
                "Yards to Meters" ,
                "Miles to Kilometers" ,
                "Centimeters to Inches" ,
                "Centimeters to Feet" ,
                "Meters to Yards" ,
                "Kilometers to Miles"};

        conversion = new JComboBox(conversions);
        conversion.setSelectedIndex(0);
        conversion.addActionListener(this);
        contentPane.add(conversion);

        answer = new JLabel(" ");
        answer.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        answer.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        contentPane.add(answer);

        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        MetricConversion mc = new MetricConversion();
    }

    public void actionPerformed(ActionEvent event) {
        JComboBox conversion = (JComboBox)event.getSource();
        String conversions = (String)conversion.getSelectedItem();

        if(conversions == "Inches to Centimeters") {
            answer.setText("1 inch = 2.54 centimeters");
        } else if(conversions == "Feet to Centimeters") {
            answer.setText("1 foot = centimeters");
        } else if(conversions == "Yards to Meters") {
            answer.setText("1 yard = meters");
        } else if(conversions == "Miles to Kilometers") {
            answer.setText("1 mile = kilometers");
        } else if(conversions == "Centimeters to Inches") {
            answer.setText("1 centimeter = inches");
        } else if(conversions == "Centimeters to Feet") {
            answer.setText("1 centimeter = feet");
        } else if(conversions == "Meters to Yards") {
            answer.setText("1 meter = yards");
        } else if(conversions == "Kilometers to Miles") {
            answer.setText("1 kilometer = miles");
        }
    }

    public static void main (String[]args){
        /* Methods that create and show a GUI should be
            run from an event-dispatching thread */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }

}
