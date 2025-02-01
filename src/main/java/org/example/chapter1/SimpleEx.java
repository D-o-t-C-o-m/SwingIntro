package org.example.chapter1;
import javax.swing.JFrame;
import java.awt.*;


public class SimpleEx extends JFrame {
public SimpleEx() {
	initUI();
}

private void initUI() {
	setTitle("Simple Example");
	setSize(400, 300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args) {
	EventQueue.invokeLater(() -> {

		var ex = new SimpleEx();
		ex.setVisible(true);

	});
}
}