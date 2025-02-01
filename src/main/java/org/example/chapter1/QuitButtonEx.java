package org.example.chapter1;

import javax.swing.*;
import java.awt.*;

public class QuitButtonEx extends JFrame {

public QuitButtonEx() {
	initUi();
}
public void initUi() {
	var quitButton = new JButton("Quit");
	quitButton.addActionListener(_ -> System.exit(0));

	createLayout(quitButton);

	setTitle("Quit");
	setSize(400, 300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void createLayout(JComponent... arg) {
	var pane = getContentPane();
	var gl = new GroupLayout(pane);
	pane.setLayout(gl);

	gl.setAutoCreateContainerGaps(true);

	gl.setHorizontalGroup(gl.createSequentialGroup()
			.addComponent(arg[0])
	);
	gl.setVerticalGroup(gl.createSequentialGroup()
	.addComponent(arg[0]));
}
public static void main(String[] args) {
	EventQueue.invokeLater(() -> {
		var ex = new QuitButtonEx();
		ex.setVisible(true);
	});
}
}
