package nl.tudelft.jpacman.ui;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu extends JFrame {
	private JButton startButton;
	private JButton tutorialButton;

	public MainMenu() {
		// Set up the frame
		setTitle("JPacman");
		setSize(600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon backgroundImage = new ImageIcon("src/main/resources/pac_bg.png");
		Image image = backgroundImage.getImage().getScaledInstance(600, 800, Image.SCALE_SMOOTH);
		ImageIcon realImg = new ImageIcon(image);
		JLabel backgroundLabel = new JLabel(realImg);

		ImageIcon startIcon = new ImageIcon("src/main/resources/start_btn.png");
		Image startImg = startIcon.getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH);
		ImageIcon startBtn = new ImageIcon(startImg);
		// Set up the button
		startButton = new JButton("");
		startButton.setIcon(startBtn);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.setBorder(null);

		startButton.addActionListener(e -> {
			this.setVisible(false);
			new MapSelector();
		});

		tutorialButton = new JButton("Tutorial");

		// Set up the panel
		// JPanel panel = new JPanel();
		// panel.setOpaque(false);
		// panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		// panel.add(startButton);
		// panel.add(tutorialButton);

		// add(panel, BorderLayout.CENTER);

		// add(panel);

		backgroundLabel.add(startButton, BorderLayout.CENTER);
		startButton.setBounds(250, 300, 100, 200);
		backgroundLabel.setLayout(null);
		add(backgroundLabel, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new MainMenu();
	}
}