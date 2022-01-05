package layout.preyaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Secondtable extends JFrame {


	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtprice;
	private JTextField txtfamily;
	private JTextField txtname;
	private JTextField txtdate;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secondtable frame = new Secondtable();
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
	public Secondtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1264, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1028, 674);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("INSTRUMENT", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MUSICAL  INSTRUMENT");
		lblNewLabel.setBounds(44, 11, 386, 37);
		lblNewLabel.setForeground(new Color(255, 51, 102));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Designed by Preyaa");
		lblNewLabel_1.setBounds(445, 24, 167, 37);
		lblNewLabel_1.setForeground(new Color(173, 255, 47));
		lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 18));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 72, 524, 548);
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Instrument Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 51, 102)));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Instrument ID:");
		lblNewLabel_2.setBounds(34, 84, 154, 35);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setForeground(new Color(255, 204, 204));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Instrument Family:");
		lblNewLabel_2_1.setBounds(34, 149, 200, 35);
		lblNewLabel_2_1.setForeground(new Color(255, 204, 204));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Instrument Name:");
		lblNewLabel_2_2.setBounds(34, 223, 200, 35);
		lblNewLabel_2_2.setForeground(new Color(255, 204, 204));
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Price (Rs):");
		lblNewLabel_2_3.setBounds(34, 297, 200, 35);
		lblNewLabel_2_3.setForeground(new Color(255, 204, 204));
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		panel_1.add(lblNewLabel_2_3);
		
		txtid = new JTextField();
		txtid.setBounds(244, 84, 255, 35);
		txtid.setHorizontalAlignment(SwingConstants.LEFT);
		txtid.setBackground(new Color(255, 235, 205));
		panel_1.add(txtid);
		txtid.setColumns(10);
		
		txtprice = new JTextField();
		txtprice.setBounds(244, 297, 255, 35);
		txtprice.setBackground(new Color(255, 235, 205));
		txtprice.setColumns(10);
		panel_1.add(txtprice);
		
		txtfamily = new JTextField();
		txtfamily.setBounds(244, 153, 255, 35);
		txtfamily.setColumns(10);
		txtfamily.setBackground(new Color(255, 235, 205));
		panel_1.add(txtfamily);
		
		txtname = new JTextField();
		txtname.setBounds(244, 223, 255, 35);
		txtname.setColumns(10);
		txtname.setBackground(new Color(255, 235, 205));
		panel_1.add(txtname);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Date:");
		lblNewLabel_2_3_1.setBounds(34, 367, 200, 35);
		lblNewLabel_2_3_1.setForeground(new Color(255, 204, 204));
		lblNewLabel_2_3_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		panel_1.add(lblNewLabel_2_3_1);
		
		txtdate = new JTextField();
		txtdate.setBounds(244, 367, 255, 35);
		txtdate.setColumns(10);
		txtdate.setBackground(new Color(255, 235, 205));
		panel_1.add(txtdate);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 380, 504, 157);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Acer\\Downloads\\piano-dark-cool-partial-wallpaper-preview.jpg"));
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewAdd = new JButton("ADD");
		btnNewAdd.setBounds(562, 487, 171, 44);
		btnNewAdd.setBackground(new Color(139, 0, 0));
		btnNewAdd.setForeground(new Color(173, 255, 47));
		btnNewAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addtoDB();
		
			}
		});
		btnNewAdd.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(btnNewAdd);
		
		JButton btnNewUpdate = new JButton("UPDATE");
		btnNewUpdate.setBounds(827, 487, 171, 44);
		btnNewUpdate.setForeground(new Color(173, 255, 47));
		btnNewUpdate.setBackground(new Color(139, 0, 0));
		btnNewUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updatetoDB();
			}
		});
		btnNewUpdate.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(btnNewUpdate);
		
		JLabel label = new JLabel("New label");
		label.setBounds(44, 529, 46, 14);
		panel.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(330, 529, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewDelete = new JButton("DELETE");
		btnNewDelete.setBounds(562, 576, 171, 44);
		btnNewDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletefromDB();
			}
		});
		btnNewDelete.setForeground(new Color(173, 255, 47));
		btnNewDelete.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewDelete.setBackground(new Color(139, 0, 0));
		panel.add(btnNewDelete);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(827, 576, 171, 44);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resettextfields();
			}
		});
		btnReset.setForeground(new Color(173, 255, 47));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnReset.setBackground(new Color(139, 0, 0));
		panel.add(btnReset);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Acer\\Downloads\\m3.jpg"));
		lblNewLabel_5.setBounds(0, 0, 1024, 646);
		panel.add(lblNewLabel_5);
	}

	static Connection con() {
		try {
			String driver="com.mysql.cj.jdbc.Driver";
			String url ="jdbc:mysql://localhost/musicdatabase";
			Class.forName(driver);
			return DriverManager.getConnection(url,"root","");
					
		} catch (Exception e) {
			System.out.println("Unable to connect to the database!" + e);
		}
		return null;
		
	}
	private void addtoDB() {
		Connection con = con();
		try
		{
			String query = "INSERT into instrument VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, txtid.getText());
			ps.setString(2, txtfamily.getText());
			ps.setString(3, txtname.getText());
			ps.setString(4, txtprice.getText());
			ps.setString(5,txtdate.getText());
			ps.execute();
			
			JOptionPane.showMessageDialog(null,"ADDED SUCCESSFULLY!");
		    } catch (Exception e) {
			System.out.println("Failed: " + e);
		}
	}
	
	private void updatetoDB() {
		Connection con=con();
		try 
		{
			String query = "Update instrument set id='"+txtid.getText()+"' ,family='"+txtfamily.getText()+"'  ,name='"+txtname.getText()+"' ,price='"+txtprice.getText()+"' ,date='"+txtdate.getText()+"' where id='"+txtid.getText()+"' ";
			PreparedStatement ps= con.prepareStatement(query);
			
			ps.execute();
					
			JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY!");
			
			ps.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void deletefromDB() {
		Connection con= con();
		try
		{
				String query = "Delete from instrument where id='"+txtid.getText()+"' ";
				PreparedStatement ps= con.prepareStatement(query);
				
				ps.execute();
						
				JOptionPane.showMessageDialog(null,"DELETED SUCCESSFULLY!");
				
				ps.close();

			}catch (Exception ex) {
				ex.printStackTrace();
	}
	
	}
	
	private void resettextfields() {
		txtid.setText(null);
		txtfamily.setText(null);
		txtname.setText(null);
		txtprice.setText(null);
		txtdate.setText(null);
	}
}
		

