package nl.tudelft.jpacman.ui;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tutorial extends JFrame {

	private JButton backButton;

	public Tutorial() {
		setTitle("JPacman");
		setSize(600, 800);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		ImageIcon backgroundImage = new ImageIcon("src/main/resources/bg/tutorial_ep_bg.png");
		Image image = backgroundImage.getImage().getScaledInstance(600, 800, Image.SCALE_SMOOTH);
		ImageIcon realImg = new ImageIcon(image);
		JLabel backgroundLabel = new JLabel(realImg);

		ImageIcon backIcon = new ImageIcon("src/main/resources/button/back_btn.png");
		Image backImg = backIcon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
		ImageIcon backBtn = new ImageIcon(backImg);

		ImageIcon icon = new ImageIcon("src/main/resources/icon.png");
		Image iconImg = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		setIconImage(iconImg);
		this.setLocationRelativeTo(null);

		backButton = new JButton("");
		backButton.setIcon(backBtn);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		backButton.setBorder(null);

		// continueButton.addActionListener(e -> {
		// this.setVisible(false);
		// new Launcher().launch_tutorial();
		// });

		backButton.addActionListener(e -> {
			this.setVisible(false);
			new MainMenu();
		});

		backgroundLabel.add(backButton, BorderLayout.CENTER);

		backButton.setBounds(185, 670, 200, 50);

		add(backgroundLabel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {

	}
}
