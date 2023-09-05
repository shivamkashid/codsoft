package AtmInterface1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;



public class AtmInterface  extends JFrame {
	JButton btn = new JButton();
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();
	JButton btn4 = new JButton();
	
	JPanel check = new JPanel();
	JPanel with = new JPanel();
	JPanel dep = new JPanel();
	JTextField tl = new JTextField(20);
	JTextField tll=new JTextField(20);
	JLabel withdraw = new JLabel("insufficient fund");
	JLabel nik = new JLabel("transaction successful");
	JLabel deposit = new JLabel("Amount Deposited Successfully");
	ui ui = new ui();
	Border borderline = BorderFactory.createLineBorder(Color.black);
	int accountbalance = 2300;
int tt=0;
int in=0;
	public AtmInterface() {

		// setSize(1000,800);
		setBounds(100, 100, 1000, 800);
		add(btn);
		btn.setText("CHECK Balance");
		btn.setBounds(200, 50, 100, 40);

		add(btn1);
		btn1.setText("Withdraw");
		btn1.setBounds(350, 50, 100, 40);

		add(btn2);
		btn2.setText("Deposit");
		btn2.setBounds(500, 50, 100, 40);

		// adding jpanel or check balence
		add(check);
		getContentPane().add(check);

		check.setBorder(borderline);
		check.setBounds(300, 250, 600, 200);
		check.setLayout(null);
		check.setVisible(false);

		add(with);
		getContentPane().add(with);

		with.setBorder(borderline);
		with.setBounds(300, 250, 600, 200);
		with.setLayout(null);
		with.setVisible(false);

		add(dep);
		getContentPane().add(dep);

		dep.setBorder(borderline);
		dep.setBounds(300, 250, 600, 200);
		dep.setLayout(null);
		dep.setVisible(false);

		JLabel name = new JLabel();
		
		check.add(name);
		name.setBounds(100, 150, 200, 50);
	
		with.add(withdraw);
		withdraw.setVisible(false);
		with.add(nik);
		nik.setBounds(100,150,800,50);
		nik.setVisible(false);
		withdraw.setBounds(100, 150, 800, 50);
		withdraw.getText();
		with.add(btn3);
		btn3.setText("withdraw");
		btn3.setBounds(10, 15, 200, 50);
		with.add(tl);
		tl.setBounds(50, 80, 100, 40);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
                 String st = tl.getText();
				 tt = Integer.parseInt(st);
				 name.setText("Your account balance has:"+withdraw(accountbalance,tt));
				 
			}

		});
		

		
		dep.add(deposit);
		deposit.setVisible(false);
		deposit.setBounds(100, 150, 200, 45);
		
		dep.add(btn4);
	    btn4.setText("Deposit");
	    btn4.setBounds(10,15,200,50);
	    dep.add(tll);
	    tll.setBounds(50,80,100,40);
	    btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String stt=tll.getText();
				 in=Integer.parseInt(stt);
				 name.setText("your account balance is:"+deposit(accountbalance,in));
			}
	    	
	    });

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn) {
					name.setText("your account balance is:" +accountbalance);
					check.setVisible(true);
					with.setVisible(false);
					dep.setVisible(false);
					
				}

			}

		});
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1) {
					with.setVisible(true);
					check.setVisible(false);
					dep.setVisible(false);
				}
			}

		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn2) {
					with.setVisible(false);
					check.setVisible(false);
					dep.setVisible(true);
				}
			}

		});

		

		setVisible(true);
		setLayout(null);


	}

	public int withdraw(int balence, int amount_with) {
		if(balence>amount_with) {
		accountbalance=balence-amount_with;
		}
		if(accountbalance>tt) {
			nik.setVisible(true); 
			nik.setText("Transaction successfull");
			withdraw.setVisible(false);
		}
		     else {
		    	 nik.setVisible(false);
			withdraw.setVisible(true);
		}
		return accountbalance;

	}
	public int deposit(int balence,int amount_dep) {
		accountbalance=balence+amount_dep;
		deposit.setVisible(true);
		return accountbalance;
		
	}

	

}


