package layout.preyaa;

import java.awt.BorderLayout;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class designview extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtsong;
	private JTextField txtyear;
	private JTextField txtname;
	private JTable table_1;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					designview frame = new designview();
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
	public designview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 914, 704);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 914, 704);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("SONGS", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SONGS designed by Preyaa");
		lblNewLabel.setBounds(152, 0, 391, 32);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(21, 39, 607, 270);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new TitledBorder(null, "Song Details", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Song ID:");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(94, 27, 123, 27);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Title Song:");
		lblNewLabel_1_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(94, 80, 145, 27);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Year Released:");
		lblNewLabel_1_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(94, 137, 164, 27);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Artist Name:");
		lblNewLabel_1_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(94, 197, 164, 27);
		panel_2.add(lblNewLabel_1_3);
		
		txtID = new JTextField();
		txtID.setBackground(new Color(153, 255, 255));
		txtID.setForeground(new Color(0, 0, 153));
		txtID.setBounds(282, 27, 261, 27);
		panel_2.add(txtID);
		txtID.setColumns(10);
		
		txtsong = new JTextField();
		txtsong.setBackground(new Color(153, 255, 255));
		txtsong.setForeground(new Color(0, 0, 153));
		txtsong.setColumns(10);
		txtsong.setBounds(282, 80, 261, 27);
		panel_2.add(txtsong);
		
		txtyear = new JTextField();
		txtyear.setBackground(new Color(153, 255, 255));
		txtyear.setForeground(new Color(0, 0, 153));
		txtyear.setColumns(10);
		txtyear.setBounds(282, 137, 261, 27);
		panel_2.add(txtyear);
		
		txtname = new JTextField();
		txtname.setBackground(new Color(153, 255, 255));
		txtname.setForeground(new Color(0, 0, 153));
		txtname.setColumns(10);
		txtname.setBounds(282, 201, 261, 27);
		panel_2.add(txtname);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Acer\\OneDrive\\Desktop\\black-silver-microphone.jpg"));
		lblNewLabel_3.setBounds(10, 20, 587, 239);
		panel_2.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBackground(new Color(102, 0, 153));
		btnNewButton.setBounds(694, 39, 139, 53);
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddtoDatabase();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(153, 255, 153));
		btnClear.setBackground(new Color(0, 51, 0));
		btnClear.setBounds(694, 298, 139, 53);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClearTextFields();
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 24));
		panel_1.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 320, 607, 334);
		scrollPane.setBackground(Color.PINK);
		panel_1.add(scrollPane);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table_1.getSelectedRow();
				txtID.setText(model.getValueAt(i, 0).toString());
				txtsong.setText(model.getValueAt(i, 1).toString());
				txtyear.setText(model.getValueAt(i, 2).toString());
				txtname.setText(model.getValueAt(i, 3).toString());

			}
		});
		model=new DefaultTableModel();
		Object[] column = {"ID","Title_Song","Year_Released","Artist_Name"};
		final Object[] row =new Object[4];
		model.setColumnIdentifiers(column);
		table_1.setModel(model);
		scrollPane.setViewportView(table_1);
		table_1.setBackground(new Color(255, 245, 238));
		
		JLabel label_1 = new JLabel("New label");
		scrollPane.setColumnHeaderView(label_1);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setForeground(new Color(255, 255, 0));
		btnUpdate.setBackground(new Color(255, 0, 153));
		btnUpdate.setBounds(694, 469, 139, 53);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i= table_1.getSelectedRow();
				model.setValueAt(txtID.getText(), i, 0);
				model.setValueAt(txtsong.getText(), i, 1);
				model.setValueAt(txtyear.getText(), i, 2);
				model.setValueAt(txtname.getText(), i, 3);
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel_1.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(new Color(255, 255, 0));
		btnDelete.setBackground(new Color(255, 0, 153));
		btnDelete.setBounds(694, 533, 139, 53);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table_1.getSelectedRow();
				if(i>=0) 
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "DELETED Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel_1.add(btnDelete);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setForeground(new Color(255, 255, 0));
		btnAdd.setBackground(new Color(255, 0, 153));
		btnAdd.setBounds(694, 405, 139, 53);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtID.getText().equals("") || txtsong.getText().equals("") || txtyear.getText().equals("") || txtname.getText().equals("") )
				{
					JOptionPane.showMessageDialog(null, "Kindly fill in the song details");
				}
				else
				{
					row[0]=txtID.getText();
					row[1]=txtsong.getText();
					row[2]=txtyear.getText();
					row[3]=txtname.getText();
					model.addRow(row);
					
					txtID.setText("");
					txtsong.setText("");
					txtyear.setText("");
					txtname.setText("");	
					JOptionPane.showMessageDialog(null, "SAVED Successfully!");

				}

			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel_1.add(btnAdd);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, -10, 909, 686);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Acer\\OneDrive\\Pictures\\wallpaper\\611905.jpg"));
		panel_1.add(lblNewLabel_2);
		
		
		JButton btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateToDatabase();
			}
		});
		btnUpdate_1.setForeground(Color.YELLOW);
		btnUpdate_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnUpdate_1.setBackground(new Color(102, 0, 153));
		btnUpdate_1.setBounds(694, 123, 139, 53);
		panel_1.add(btnUpdate_1);
		
		JButton btnDelete_1 = new JButton("DELETE");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteFromDatabase();
			}
		});
		btnDelete_1.setForeground(Color.YELLOW);
		btnDelete_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnDelete_1.setBackground(new Color(102, 0, 153));
		btnDelete_1.setBounds(694, 213, 139, 53);
		panel_1.add(btnDelete_1);
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
	private void AddtoDatabase() {
		Connection con = con();
		try
		{
			String query = "INSERT into songs VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, txtID.getText());
			ps.setString(2, txtsong.getText());
			ps.setString(3, txtyear.getText());
			ps.setString(4, txtname.getText());
			ps.execute();
			
			JOptionPane.showMessageDialog(null,"ADDED SUCCESSFULLY!");
		    } catch (Exception e) {
			System.out.println("Failed: " + e);
		}
	}
	
	private void ClearTextFields() {
		txtID.setText(null);
		txtsong.setText(null);
		txtyear.setText(null);
		txtname.setText(null);

	}
	
	private void UpdateToDatabase() {
		Connection con=con();
		try
		{
			String query = "Update songs set id='"+txtID.getText()+"' ,titlesong='"+txtsong.getText()+"'  ,year='"+txtyear.getText()+"' ,name='"+txtname.getText()+"' where id='"+txtID.getText()+"' ";
			PreparedStatement ps= con.prepareStatement(query);
			
			ps.execute();
					
			JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY!");
			
			ps.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void DeleteFromDatabase() {
		Connection con= con();
		try
		{
				String query = "Delete from songs where id='"+txtID.getText()+"' ";
				PreparedStatement ps= con.prepareStatement(query);
				
				ps.execute();
						
				JOptionPane.showMessageDialog(null,"DELETED SUCCESSFULLY!");
				
				ps.close();

			}catch (Exception ex) {
				ex.printStackTrace();
		}
	}
}
