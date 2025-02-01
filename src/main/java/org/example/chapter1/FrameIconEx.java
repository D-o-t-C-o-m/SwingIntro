package org.example.chapter1;

import javax.swing.*;
import java.awt.*;

public class FrameIconEx extends JFrame {
public FrameIconEx() {
	initUi();
}
private void initUi() {
	var webIcon = new ImageIcon(getClass().getResource("/web.png"));
	setIconImage(webIcon.getImage());

	setTitle("Icon");
	setSize(400, 300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	EventQueue.invokeLater(() -> {
		var frame = new FrameIconEx();
		frame.setVisible(true);
	});
}
}
