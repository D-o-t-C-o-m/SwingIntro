package org.example.chapter1;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;

class MyLabel extends JLabel {
public MyLabel() {
	super("", null, LEADING);
}
@Override
public boolean isOpaque() {
	return true;
}

}

public class StandardColorsEx extends JFrame {
public StandardColorsEx() {
	initUI();
}

private void initUI() {
	Color[] stdCols = { Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.RED, Color.WHITE, Color.yellow};

var labels = new ArrayList<JLabel>();

for (var col : stdCols) {
	var lbl = createColoredLabel(col);
	labels.add(lbl);
}

createLayout(labels.toArray(new JLabel[0]));

setTitle("Standard Colors");
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private JLabel createColoredLabel(Color color) {
	var label = new MyLabel();
	label.setMinimumSize(new Dimension(90, 40));
	label.setBackground(color);
	return label;
}

private void createLayout(JLabel[] label) {
var pane = (JPanel) getContentPane();
var gl = new GroupLayout(pane);
pane.setLayout(gl);

pane.setToolTipText("Content Pane");

gl.setAutoCreateContainerGaps(true);

gl.setAutoCreateGaps(true);

gl.setHorizontalGroup(gl.createParallelGroup()
		.addGroup(gl.createSequentialGroup()
				.addComponent(label[0])
				.addComponent(label[1])
				.addComponent(label[2])
				.addComponent(label[3]))
		.addGroup(gl.createSequentialGroup()
		.addComponent(label[4])
				.addComponent(label[5])
				.addComponent(label[6])
				.addComponent(label[7])
)       .addGroup(gl.createSequentialGroup()
		.addComponent(label[8])
				.addComponent(label[9])
				.addComponent(label[10])
				.addComponent(label[11]))
		.addComponent(label[12]));

gl.setVerticalGroup(gl.createSequentialGroup()
		.addGroup(gl.createParallelGroup()
				.addComponent(label[0])
				.addComponent(label[1])
				.addComponent(label[2])
				.addComponent(label[3]))
		.addGroup(gl.createParallelGroup()
				.addComponent(label[4])
				.addComponent(label[5])
				.addComponent(label[6])
				.addComponent(label[7])
		)       .addGroup(gl.createParallelGroup()
				.addComponent(label[8])
				.addComponent(label[9])
				.addComponent(label[10])
				.addComponent(label[11]))
		.addComponent(label[12]));
		pack();
}

public static void main(String[] args) {
	EventQueue.invokeLater(() -> {
		var frame = new StandardColorsEx();
		frame.setVisible(true);
	});
}
}
