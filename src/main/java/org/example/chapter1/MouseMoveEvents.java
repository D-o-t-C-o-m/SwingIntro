package org.example.chapter1;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMoveEvents extends JFrame {

private JLabel coords;

public MouseMoveEvents(){
	initUI();
}
private void initUI(){
	coords = new JLabel(" ");
	createLayout(coords);

	addMouseMotionListener(new MouseMotionAdapter() {

		@Override
		public void mouseMoved(MouseEvent e) {
			super.mouseMoved(e);
			int x = e.getX();
			int y = e.getY();

			var text = String.format("x: %d, y: %d", x, y);
			coords.setText(text);

		}
	});

	setTitle("Mouse Move Events");
	setSize(400,300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void createLayout(JComponent... arg){
	var pane = getContentPane();
	var gl = new GroupLayout(pane);
	pane.setLayout(gl);

	gl.setAutoCreateContainerGaps(true);

	gl.setHorizontalGroup(gl.createParallelGroup()
			.addComponent(arg[0])
			.addGap(250)

	);

	gl.setVerticalGroup(gl.createSequentialGroup()
			.addComponent(arg[0])
			.addGap(130)
	);
	pack();

}

public static void main(String[] args) {
	EventQueue.invokeLater(() -> {

		var ex = new MouseMoveEvents();
		ex.setVisible(true);
	});
}
}
