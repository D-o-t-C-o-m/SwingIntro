package org.example.chapter1;

import javax.swing.*;
import java.awt.*;

public class TooltipEx extends JFrame {

public TooltipEx() {
	initUI();
}
private void initUI() {
	var btn = new JButton("Button");
	btn.setToolTipText("Button");

	createLayout(btn);
	setTitle("Tooltip");
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void createLayout(JComponent... arg) {
	var pane = (JPanel) getContentPane();
	var gl = new GroupLayout(pane);
	pane.setLayout(gl);

	pane.setToolTipText("Content Pane");

	gl.setAutoCreateContainerGaps(true);

	gl.setHorizontalGroup(gl.createSequentialGroup()
			.addComponent(arg[0])
			.addGap(200));
	gl.setVerticalGroup(gl.createSequentialGroup()
	.addComponent(arg[0])
			.addGap(120));
	pack();
}
public static void main(String[] args) {
	EventQueue.invokeLater(() -> {
		var frame = new TooltipEx();
		frame.setVisible(true);
	});
}
}
