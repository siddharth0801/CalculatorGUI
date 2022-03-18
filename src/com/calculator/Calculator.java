package com.calculator;

import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

	Frame f = new Frame();
	Label l1 = new Label("Enter Number:-");
	Label l2 = new Label("Result:-");
	Label l3 = new Label("");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	// TextField t3 = new TextField();
	Button add = new Button("Add");
	Button sub = new Button("Sub");
	Button mul = new Button("Mul");
	Button div = new Button("Div");
	Button clear = new Button("Clear");

	public Calculator() {
		// Giving Coordinates
		l1.setBounds(50, 100, 100, 20);
		l2.setBounds(50, 120, 100, 10);
		l3.setBounds(50, 140, 125, 20);
		t1.setBounds(200, 100, 100, 20);
		t2.setBounds(200, 140, 100, 20);
		// t3.setBounds(200, 180, 100, 20);
		add.setBounds(50, 250, 50, 20);
		sub.setBounds(110, 250, 50, 20);
		mul.setBounds(170, 250, 50, 20);
		div.setBounds(230, 250, 50, 20);
		clear.setBounds(290, 250, 50, 20);

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		// f.add(t3);
		f.add(add);
		f.add(sub);
		f.add(mul);
		f.add(div);
		f.add(clear);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400, 350);
		f.setTitle("Simple Calculator!");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}

	public void actionPerformed(ActionEvent e) {

		if (t1.getText().equals("") && t2.getText().equals("")) {
			l3.setText("Enter Number");
			l3.setForeground(Color.red);
		} else {
			float n1 = Float.parseFloat(t1.getText());
			float n2;

			if (e.getSource() == add) {
				n2 = 0;
				if (!t2.getText().equals("")) {
					n2 = Float.parseFloat(t2.getText());
				}
				t2.setText(String.valueOf(n1 + n2));
				l3.setText(n2 + "+" + n1);
			} else if (e.getSource() == sub) {
				n2 = 0;
				if (!t2.getText().equals("")) {
					n2 = Float.parseFloat(t2.getText());
					t2.setText(String.valueOf(n2 - n1));
					l3.setText(n2 + "-" + n1);
				}
				else {
					t2.setText(String.valueOf(n1));
				}
				
			} else if (e.getSource() == mul) {
				n2 = 1;
				if (!t2.getText().equals("")) {
					n2 = Float.parseFloat(t2.getText());
				}
				t2.setText(String.valueOf(n1 * n2));
				l3.setText(n2 + "*" + n1);
			} else if (e.getSource() == div) {
				n2 = 1;
				if (!t2.getText().equals("")) {
					n2 = Float.parseFloat(t2.getText());
					t2.setText(String.valueOf(n2 / n1));
					l3.setText(n2 + "/" + n1);
				} else {
					t2.setText(String.valueOf(n1));
				}
			} else if (e.getSource() == clear) {
				t1.setText("");
				t2.setText("");
				// t3.setText("");
			}
		}
	}

}
