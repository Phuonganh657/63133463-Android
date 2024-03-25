import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class body extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txH;
	private JTextField txW;
	private JTextField txKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					body frame = new body();
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
	public body() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(0, 255, 128));
		panel.setBounds(10, 10, 573, 30);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("BODY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 0), null));
		panel_1.setBackground(new Color(0, 255, 128));
		panel_1.setBounds(10, 51, 573, 192);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Weight(kg)");
		lblNewLabel_2.setBounds(10, 70, 110, 30);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Height(m)");
		lblNewLabel_1.setBounds(10, 29, 110, 30);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_3 = new JLabel("BMI");
		lblNewLabel_3.setBounds(10, 122, 46, 14);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		txH = new JTextField();
		txH.setBounds(229, 32, 269, 30);
		panel_1.add(txH);
		txH.setColumns(10);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamTinhToan();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTinh.setBounds(69, 158, 89, 23);
		panel_1.add(btnTinh);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXoa();
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnXoa.setBounds(253, 158, 89, 23);
		panel_1.add(btnXoa);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThoat.setBounds(451, 158, 89, 23);
		panel_1.add(btnThoat);
		
		txW = new JTextField();
		txW.setBounds(229, 74, 269, 28);
		panel_1.add(txW);
		txW.setColumns(10);
		
		txKQ = new JTextField();
		txKQ.setBounds(229, 118, 269, 28);
		panel_1.add(txKQ);
		txKQ.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\LAP HP\\Downloads\\images.png"));
		lblNewLabel_4.setBounds(10, 247, 573, 100);
		contentPane.add(lblNewLabel_4);
	}
	void HamXoa() {
		txH.setText("");
		txW.setText("");
		txKQ.setText("");
		txKQ.setOpaque(true);
		txKQ.setBackground(null);
		
		
	}
	
	void HamTinhToan() {
		double h = Double.parseDouble(txH.getText());
		double w = Double.parseDouble(txW.getText());
		
		double bmi = w / (h * h);
		String cal = String.format("%.2f",bmi);
		
		txKQ.setText(cal);
		if(bmi <= 18.5) {
			txKQ.setOpaque(true);
			txKQ.setBackground(Color.blue);
			
			
			
		}else if(bmi <= 24.5) {
			txKQ.setOpaque(true);
			txKQ.setBackground(Color.green);
			
		}else if(bmi <= 29.5) {
			txKQ.setOpaque(true);
			txKQ.setBackground(Color.orange);
			
		}else if(bmi >= 30) {
			txKQ.setOpaque(true);
			txKQ.setBackground(Color.red);
			
		}
	}
	
}
