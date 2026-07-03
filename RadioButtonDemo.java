package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton bird, cat, dog, rabbit, pig;
    JLabel imageLabel;
    private String img;

    public RadioButtonDemo() {

        setTitle("RadioButton Demo");
        setSize(650, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create radio buttons
        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        // Group radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        // Add listeners
        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        // Left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5, 1));

        leftPanel.add(bird);
        leftPanel.add(cat);
        leftPanel.add(dog);
        leftPanel.add(rabbit);
        leftPanel.add(pig);

        add(leftPanel, BorderLayout.WEST);

        // Image label
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setPreferredSize(new Dimension(300, 300));

        add(imageLabel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String pet = "";
        String image = "";

        if (bird.isSelected()) {
            pet = "Bird";
            image = "Bird.jpg";
        }
        else if (cat.isSelected()) {
            pet = "Cat";
            image = "Cat.jpg";
        }
        else if (dog.isSelected()) {
            pet = "Dog";
            image = "Dog.jpg";
        }
        else if (rabbit.isSelected()) {
            pet = "Rabbit";
            image = "Rabbit.jpg";
        }
        else if (pig.isSelected()) {
            pet = "Pig";
            image = "Pig.jpg";
        }

        ImageIcon icon = new ImageIcon(getClass().getResource("/assignment/" + image));
        imageLabel . setIcon(icon);  
        
        JOptionPane.showMessageDialog(
                this,
                "You selected: " + pet,
                "Selected Pet",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RadioButtonDemo());
    }
}