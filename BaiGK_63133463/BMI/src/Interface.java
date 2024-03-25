import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final Component Jlabel5 = null;
	private JPanel contentPane;
	protected JLabel jTextFieldl;
	protected JLabel jTextField1;
	protected JLabel jTextField2;
	protected JLabel jTextField3;
	protected JLabel jLabel6;
	protected JLabel jTextField;
	protected JLabel jTextField_1;
	protected JLabel jTextField_2;
	protected JLabel jLabel5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setBackground(new Color(0, 255, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 573, 35);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(0, 255, 128));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("BODY MASS INDEX");
		lblNewLabel.setForeground(new Color(128, 64, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 46, 573, 225);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), null));
		panel_1.setBackground(new Color(128, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbH = new JLabel("Height(m)");
		lbH.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbH.setBounds(29, 33, 83, 23);
		panel_1.add(lbH);
		
		JLabel lbW = new JLabel("Weight(kg)");
		lbW.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbW.setBounds(29, 90, 92, 23);
		panel_1.add(lbW);
		
		JLabel lbB = new JLabel("BMI");
		lbB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbB.setBounds(36, 138, 34, 23);
		panel_1.add(lbB);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setBounds(0, 280, 573, 88);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\LAP HP\\Downloads\\images.png"));
		contentPane.add(lblNewLabel_4);
	}
	
}
