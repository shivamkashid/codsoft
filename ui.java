package AtmInterface1;


	

	import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
	
	public class ui extends JFrame {

		JButton btn;
		JTextField t = new JTextField();
		JLabel l = new JLabel();
		JFrame j = new JFrame();

//		JButton btn1=new JButton();
//		JTextField t1=new JTextField();

		public ui() {
			t = new JTextField(20);
//		s	t1=new JTextField(20);
			l = new JLabel("invalid pin");
			JButton btn1 = new JButton();
			
			btn = new JButton();
			btn.setSize(200, 100);
			btn.setText("Enter");

			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (e.getSource() == btn) {
						String oin = "1234";
						if (t.getText().equals(oin)) {
							new AtmInterface();
						} else {
							l.setVisible(true);

						}
					}

				}

			});// btn.setAction(new MainAtm());

			add(btn);

			setVisible(true);
			setSize(400, 400);
			setLayout(new FlowLayout());
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("ATM");
			add(t);
			l.setVisible(false);
			add(l);
		}

		private int gettext() {
			// TODO Auto-generated method stub
			return 0;
		}

	}
