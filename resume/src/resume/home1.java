package resume;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.element.Image;
import com.itextpdf.text.*;
import com.itextpdf.text.TabStop.Alignment;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;

import com.itextpdf.text.pdf.draw.VerticalPositionMark;

import javax.swing.JMenuItem;

public class home1 extends JFrame {

	public JPanel contentPane;
	public JTextField txtFirstName;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JButton btnNewButton_2;
	public JLabel lblNewLabel_1;
	public JTextField textField_5;
	public JTextField txtSkill;
	public JTextField txtSkill_1;
	public JTextField txtSkill_2;
	public JLabel lblNewLabel_2;
	public JTextField txtAwardcertificate;
	public JTextField txtAwardcertificate_1;
	public JTextField txtAwardcertificate_2;
	public JTextField txtAwardcertificate_3;
	public JPanel panel2,panel4;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_4;
	public JTextField txtSchoolName;
	public JTextField txtBoarduniversity;
	public JTextField txtYear;
	public JTextField txtCgpapercentage;
	public JLabel lblNewLabel_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
	public JLabel lblNewLabel_6;
	public JTextField txtCollegeuniversity;
	public JTextField txtBoarduniversity_1;
	public JTextField textField_12;
	public JTextField textField_13;
	public JTextField textField_10;
	public JTextField textField_11;
	public JTextField textField_14;
	public JTextField textField_15;
	public JPanel panel3;
	public JLabel lblNewLabel_7;
	public JTextField textField_16;
	public JTextField textField_17;
	public JTextField textField_18;
	public JTextField textField_19;
	public JTextField textField_20;
	public JTextField textField_21;
	public JTextField textField_22;
	Image image1;
	String filename= null;
	private JPanel panel_1;
	private JTextField textField_23;
	private JTextField textField_24;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home1 frame = new home1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 /**
	 * Create the frame.
	 * @throws DocumentException 
	 * @throws FileNotFoundException 
	 */
	
	public home1() throws FileNotFoundException, DocumentException {
		setTitle("   ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 630);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1016, 109);
		panel.setBackground(new Color(65, 105, 225));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.setBounds(874, 10, 132, 35);
		panel.add(btnNewButton);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 204, 51));
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(874, 55, 132, 35);
		panel.add(btnNewButton_1);
		
		
//		Personal Information
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10, 119, 996, 464);
		contentPane.add(panel1);
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personal Information :-");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(68, 17, 293, 43);
		panel1.add(lblNewLabel);
		
		txtFirstName = new JTextField("First Name");
		txtFirstName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtFirstName.getText().equals("First Name"))
					txtFirstName.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtFirstName.getText().equals(""))
					txtFirstName.setText("First Name");
			}
		});
		txtFirstName.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtFirstName.setForeground(new Color(192, 192, 192));
		txtFirstName.setBackground(new Color(255, 255, 255));
		txtFirstName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtFirstName.setBounds(186, 80, 201, 27);
		panel1.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		textField = new JTextField("Last Name");
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField.getText().equals("Last Name"))
					textField.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField.getText().equals(""))
					textField.setText("Last Name");
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setBackground(Color.WHITE);
		textField.setBounds(592, 80, 201, 26);
		panel1.add(textField);
		
		textField_1 = new JTextField("Email");
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_1.getText().equals("Email"))
					textField_1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_1.getText().equals(""))
					textField_1.setText("Email");
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(186, 155, 607, 27);
		panel1.add(textField_1);
		
		textField_2 = new JTextField("Mobile No.");
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_2.getText().equals("Mobile No."))
				textField_2.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_2.getText().equals(""))
					textField_2.setText("Mobile No.");
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(186, 239, 201, 27);
		panel1.add(textField_2);
		
		textField_3 = new JTextField("Nationality");
		textField_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_3.getText().equals("Nationality"))
				textField_3.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_3.getText().equals(""))
					textField_3.setText("Nationality");
			}
		});	
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setForeground(Color.LIGHT_GRAY);
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(592, 238, 201, 27);
		panel1.add(textField_3);
		
		textField_4 = new JTextField("Address");
		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_4.getText().equals("Address"))
				textField_4.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_4.getText().equals(""))
					textField_4.setText("Address");
			}
		});
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(186, 317, 607, 27);
		panel1.add(textField_4);
		
		btnNewButton_2 = new JButton("Save & Continue");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				System.out.println(txtFirstName.getText());
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 205));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_2.setBounds(731, 391, 196, 35);
		panel1.add(btnNewButton_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Attach Image");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				filename=f.getAbsolutePath();
			}
		});
		mntmNewMenuItem.setBounds(827, 80, 133, 24);
		panel1.add(mntmNewMenuItem);
		
		
//		Qualification
		
		panel2 = new JPanel();
		panel2.setBounds(10, 119, 996, 464);
		contentPane.add(panel2);
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Qualifications :-");
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(9, 20, 254, 36);
		panel2.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("10th");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_4.setBounds(58, 59, 74, 30);
		panel2.add(lblNewLabel_4);
		
		txtSchoolName = new JTextField();
		txtSchoolName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtSchoolName.getText().equals("School Name"))
					txtSchoolName.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSchoolName.getText().equals(""))
					txtSchoolName.setText("School Name");
			}
		});
		txtSchoolName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtSchoolName.setText("School Name");
		txtSchoolName.setBounds(60, 105, 219, 19);
		panel2.add(txtSchoolName);
		txtSchoolName.setColumns(10);
		
		txtBoarduniversity = new JTextField();
		txtBoarduniversity.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtBoarduniversity.getText().equals("Board/University"))
					txtBoarduniversity.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtBoarduniversity.getText().equals(""))
					txtBoarduniversity.setText("Board/University");
			}
		});
		txtBoarduniversity.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtBoarduniversity.setText("Board/University");
		txtBoarduniversity.setColumns(10);
		txtBoarduniversity.setBounds(296, 103, 219, 19);
		panel2.add(txtBoarduniversity);
		
		txtYear = new JTextField();
		txtYear.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtYear.getText().equals("Year"))
					txtYear.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtYear.getText().equals(""))
					txtYear.setText("Year");
			}
		});
		txtYear.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtYear.setText("Year");
		txtYear.setColumns(10);
		txtYear.setBounds(530, 102, 219, 19);
		panel2.add(txtYear);
		
		txtCgpapercentage = new JTextField();
		txtCgpapercentage.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtCgpapercentage.getText().equals("CGPA/Percentage"))
					txtCgpapercentage.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtCgpapercentage.getText().equals(""))
					txtCgpapercentage.setText("CGPA/Percentage");
			}
		});
		txtCgpapercentage.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtCgpapercentage.setText("CGPA/Percentage");
		txtCgpapercentage.setColumns(10);
		txtCgpapercentage.setBounds(761, 102, 219, 19);
		panel2.add(txtCgpapercentage);
		
		
//		12th
		
		lblNewLabel_5 = new JLabel("12th");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_5.setBounds(58, 138, 74, 30);
		panel2.add(lblNewLabel_5);
		
		textField_6 = new JTextField();
		textField_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_6.getText().equals("School Name"))
					textField_6.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_6.getText().equals(""))
					textField_6.setText("School Name");
			}
		});
		textField_6.setText("School Name");
		textField_6.setColumns(10);
		textField_6.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_6.setBounds(60, 184, 219, 19);
		panel2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_7.getText().equals("Board/University"))
					textField_7.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_7.getText().equals(""))
					textField_7.setText("Board/University");
			}
		});
		textField_7.setText("Board/University");
		textField_7.setColumns(10);
		textField_7.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_7.setBounds(296, 182, 219, 19);
		panel2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_8.getText().equals("Year"))
					textField_8.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_8.getText().equals(""))
					textField_8.setText("Year");
			}
		});
		textField_8.setText("Year");
		textField_8.setColumns(10);
		textField_8.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_8.setBounds(530, 181, 219, 19);
		panel2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_9.getText().equals("CGPA/Percentage"))
					textField_9.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_9.getText().equals(""))
					textField_9.setText("CGPA/Percentage");
			}
		});
		textField_9.setText("CGPA/Percentage");
		textField_9.setColumns(10);
		textField_9.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_9.setBounds(761, 181, 219, 19);
		panel2.add(textField_9);
		
		
//		btech
		
		lblNewLabel_6 = new JLabel("Degree/Diploma");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_6.setBounds(58, 222, 165, 30);
		panel2.add(lblNewLabel_6);
		
		txtCollegeuniversity = new JTextField();
		txtCollegeuniversity.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtCollegeuniversity.getText().equals("Program"))
					txtCollegeuniversity.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtCollegeuniversity.getText().equals(""))
					txtCollegeuniversity.setText("Program");
			}
		});
		txtCollegeuniversity.setText("Program");
		txtCollegeuniversity.setColumns(10);
		txtCollegeuniversity.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtCollegeuniversity.setBounds(60, 268, 219, 19);
		panel2.add(txtCollegeuniversity);
		
		txtBoarduniversity_1 = new JTextField();
		txtBoarduniversity_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtBoarduniversity_1.getText().equals("Board/University"))
					txtBoarduniversity_1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtBoarduniversity_1.getText().equals(""))
					txtBoarduniversity_1.setText("Board/University");
			}
		});
		txtBoarduniversity_1.setText("Board/University");
		txtBoarduniversity_1.setColumns(10);
		txtBoarduniversity_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtBoarduniversity_1.setBounds(296, 266, 219, 19);
		panel2.add(txtBoarduniversity_1);
		
		textField_12 = new JTextField();
		textField_12.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_12.getText().equals("Year"))
					textField_12.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_12.getText().equals(""))
					textField_12.setText("Year");
			}
		});
		textField_12.setText("Year");
		textField_12.setColumns(10);
		textField_12.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_12.setBounds(530, 265, 219, 19);
		panel2.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_13.getText().equals("CGPA/Percentage"))
					textField_13.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_13.getText().equals(""))
					textField_13.setText("CGPA/Percentage");
			}
		});
		textField_13.setText("CGPA/Percentage");
		textField_13.setColumns(10);
		textField_13.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_13.setBounds(761, 265, 219, 19);
		panel2.add(textField_13);
		
		
//		higher degree
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Higher Degree");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!rdbtnNewRadioButton.isSelected())
				{
					textField_10.setVisible(false);
					textField_11.setVisible(false);
					textField_14.setVisible(false);
					textField_15.setVisible(false);
				}
				else
				{
					textField_10.setVisible(true);
					textField_11.setVisible(true);
					textField_14.setVisible(true);
					textField_15.setVisible(true);
				}
			}
		});
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(58, 304, 254, 30);
		panel2.add(rdbtnNewRadioButton);
		
		textField_10 = new JTextField();
		textField_10.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_10.getText().equals("Program"))
					textField_10.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_10.getText().equals(""))
					textField_10.setText("Program");
			}
		});
		textField_10.setText("Program");
		textField_10.setColumns(10);
		textField_10.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_10.setBounds(58, 356, 219, 19);
		panel2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_11.getText().equals("Board/University"))
					textField_11.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_11.getText().equals(""))
					textField_11.setText("Board/University");
			}
		});
		textField_11.setText("Board/University");
		textField_11.setColumns(10);
		textField_11.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_11.setBounds(294, 354, 219, 19);
		panel2.add(textField_11);
		
		textField_14 = new JTextField();
		textField_14.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_14.getText().equals("Year"))
					textField_14.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_14.getText().equals(""))
					textField_14.setText("Year");
			}
		});
		textField_14.setText("Year");
		textField_14.setColumns(10);
		textField_14.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_14.setBounds(528, 353, 219, 19);
		panel2.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_15.getText().equals("CGPA/Percentage"))
					textField_15.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_15.getText().equals(""))
					textField_15.setText("CGPA/Percentage");
			}
		});
		textField_15.setText("CGPA/Percentage");
		textField_15.setColumns(10);
		textField_15.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_15.setBounds(759, 353, 219, 19);
		panel2.add(textField_15);
		

		textField_10.setVisible(false);
		textField_11.setVisible(false);
		textField_14.setVisible(false);
		textField_15.setVisible(false);
		
		btnNewButton_2 = new JButton("Save & Continue");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				panel3.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 205));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_2.setBounds(731, 391, 196, 35);
		panel2.add(btnNewButton_2);
		

//		Projects		
		
		panel3 = new JPanel();
		panel3.setBounds(10, 119, 996, 464);
		contentPane.add(panel3);
		panel3.setBackground(new Color(255, 255, 255));
		panel3.setLayout(null);
		
		lblNewLabel_7 = new JLabel("Projects :-");
		lblNewLabel_7.setForeground(new Color(0, 0, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_7.setBounds(10, 10, 167, 37);
		panel3.add(lblNewLabel_7);
		
		textField_16 = new JTextField();
		textField_16.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_16.setBounds(42, 80, 147, 19);
		panel3.add(textField_16);
		textField_16.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(240, 248, 255));
		textArea.setBounds(217, 60, 253, 58);
		panel3.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(240, 248, 255));
		textArea_1.setBounds(706, 60, 253, 58);
		panel3.add(textArea_1);
		
		textField_17 = new JTextField();
		textField_17.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_17.setColumns(10);
		textField_17.setBounds(531, 80, 147, 19);
		panel3.add(textField_17);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(new Color(240, 248, 255));
		textArea_2.setBounds(217, 168, 253, 58);
		panel3.add(textArea_2);
		
		textField_18 = new JTextField();
		textField_18.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_18.setColumns(10);
		textField_18.setBounds(42, 188, 147, 19);
		panel3.add(textField_18);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(new Color(240, 248, 255));
		textArea_3.setBounds(217, 273, 253, 58);
		panel3.add(textArea_3);
		
		textField_19 = new JTextField();
		textField_19.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_19.setColumns(10);
		textField_19.setBounds(42, 293, 147, 19);
		panel3.add(textField_19);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(new Color(240, 248, 255));
		textArea_4.setBounds(706, 168, 253, 58);
		panel3.add(textArea_4);
		
		textField_20 = new JTextField();
		textField_20.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_20.setColumns(10);
		textField_20.setBounds(531, 188, 147, 19);
		panel3.add(textField_20);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBackground(new Color(240, 248, 255));
		textArea_5.setBounds(706, 273, 253, 58);
		panel3.add(textArea_5);
		
		textField_21 = new JTextField();
		textField_21.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_21.setColumns(10);
		textField_21.setBounds(531, 293, 147, 19);
		panel3.add(textField_21);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBackground(new Color(240, 248, 255));
		textArea_6.setBounds(217, 373, 253, 58);
		panel3.add(textArea_6);
		
		textField_22 = new JTextField();
		textField_22.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_22.setColumns(10);
		textField_22.setBounds(42, 393, 147, 19);
		panel3.add(textField_22);
		

		btnNewButton_2 = new JButton("Save & Continue");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel3.setVisible(false);
				panel4.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 205));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_2.setBounds(731, 391, 196, 35);
		panel3.add(btnNewButton_2);
		
		
//		Skills
		
		panel4 = new JPanel();
		panel4.setBounds(10, 119, 996, 464);
		contentPane.add(panel4);
		panel4.setBackground(new Color(255, 255, 255));
		panel4.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Skills :-");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(43, 20, 146, 31);
		panel4.add(lblNewLabel_1);
		
		textField_5 = new JTextField("Skill");
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField_5.getText().equals("Skill"))
				textField_5.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_5.getText().equals(""))
					textField_5.setText("Skill");
			}
		});	
		textField_5.setBackground(new Color(255, 255, 255));
		textField_5.setForeground(Color.LIGHT_GRAY);
		textField_5.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_5.setBounds(93, 76, 326, 31);
		panel4.add(textField_5);
		textField_5.setColumns(10);
		
		txtSkill = new JTextField();
		txtSkill.setText("Skill");
		txtSkill.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSkill.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtSkill.getText().equals("Skill"))
				txtSkill.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSkill.getText().equals(""))
					txtSkill.setText("Skill");
			}
		});
		txtSkill.setForeground(Color.LIGHT_GRAY);
		txtSkill.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtSkill.setBounds(93, 145, 326, 31);
		panel4.add(txtSkill);
		txtSkill.setColumns(10);
		
		txtSkill_1 = new JTextField();
		txtSkill_1.setText("Skill");
		txtSkill_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSkill_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtSkill_1.getText().equals("Skill"))
				txtSkill_1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSkill_1.getText().equals(""))
					txtSkill_1.setText("Skill");
			}
		});
		txtSkill_1.setForeground(Color.LIGHT_GRAY);
		txtSkill_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtSkill_1.setBounds(93, 212, 326, 31);
		panel4.add(txtSkill_1);
		txtSkill_1.setColumns(10);
		
		txtSkill_2 = new JTextField();
		txtSkill_2.setText("Skill");
		txtSkill_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSkill_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtSkill_2.getText().equals("Skill"))
				txtSkill_2.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSkill_2.getText().equals(""))
					txtSkill_2.setText("Skill");
			}
		});
		txtSkill_2.setForeground(Color.LIGHT_GRAY);
		txtSkill_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtSkill_2.setBounds(93, 279, 326, 31);
		panel4.add(txtSkill_2);
		txtSkill_2.setColumns(10);
		
		
		
		lblNewLabel_2 = new JLabel("Awards & Certificates :-");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(541, 20, 310, 31);
		panel4.add(lblNewLabel_2);
		
		txtAwardcertificate = new JTextField();
		txtAwardcertificate.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtAwardcertificate.getText().equals("Award/Certificate"))
					txtAwardcertificate.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtAwardcertificate.getText().equals(""))
					txtAwardcertificate.setText("Award/Certificate");
			}
		});
		txtAwardcertificate.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAwardcertificate.setText("Award/Certificate");
		txtAwardcertificate.setForeground(Color.LIGHT_GRAY);
		txtAwardcertificate.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtAwardcertificate.setColumns(10);
		txtAwardcertificate.setBounds(617, 76, 326, 31);
		panel4.add(txtAwardcertificate);
		
		txtAwardcertificate_1 = new JTextField();
		txtAwardcertificate_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtAwardcertificate_1.getText().equals("Award/Certificate"))
					txtAwardcertificate_1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtAwardcertificate_1.getText().equals(""))
					txtAwardcertificate_1.setText("Award/Certificate");
			}
		});
		txtAwardcertificate_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAwardcertificate_1.setText("Award/Certificate");
		txtAwardcertificate_1.setForeground(Color.LIGHT_GRAY);
		txtAwardcertificate_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtAwardcertificate_1.setColumns(10);
		txtAwardcertificate_1.setBounds(617, 145, 326, 31);
		panel4.add(txtAwardcertificate_1);
		
		txtAwardcertificate_2 = new JTextField();
		txtAwardcertificate_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtAwardcertificate_2.getText().equals("Award/Certificate"))
					txtAwardcertificate_2.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtAwardcertificate_2.getText().equals(""))
					txtAwardcertificate_2.setText("Award/Certificate");
			}
		});
		txtAwardcertificate_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAwardcertificate_2.setText("Award/Certificate");
		txtAwardcertificate_2.setForeground(Color.LIGHT_GRAY);
		txtAwardcertificate_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtAwardcertificate_2.setColumns(10);
		txtAwardcertificate_2.setBounds(617, 212, 326, 31);
		panel4.add(txtAwardcertificate_2);
		
		txtAwardcertificate_3 = new JTextField();
		txtAwardcertificate_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtAwardcertificate_3.getText().equals("Award/Certificate"))
					txtAwardcertificate_3.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtAwardcertificate_3.getText().equals(""))
					txtAwardcertificate_3.setText("Award/Certificate");
			}
		});
		txtAwardcertificate_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAwardcertificate_3.setText("Award/Certificate");
		txtAwardcertificate_3.setForeground(Color.LIGHT_GRAY);
		txtAwardcertificate_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtAwardcertificate_3.setColumns(10);
		txtAwardcertificate_3.setBounds(617, 279, 326, 31);
		panel4.add(txtAwardcertificate_3);
		
		btnNewButton_2 = new JButton("Save & Continue");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 205));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_2.setBounds(731, 391, 196, 35);
		panel4.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			panel_1.setVisible(true);
			panel4.setVisible(false);
			}
		});
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 119, 996, 464);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\pulki\\Downloads\\download.png"));
		lblNewLabel_8.setBounds(135, 73, 297, 84);
		panel_1.add(lblNewLabel_8);
		
		textField_23 = new JTextField();
		textField_23.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_23.setBounds(442, 73, 507, 61);
		panel_1.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\pulki\\Downloads\\download1.jfif"));
		lblNewLabel_9.setBounds(146, 213, 297, 84);
		panel_1.add(lblNewLabel_9);
		
		textField_24 = new JTextField();
		textField_24.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_24.setColumns(10);
		textField_24.setBounds(442, 213, 507, 61);
		panel_1.add(textField_24);
		
		btnNewButton_2 = new JButton("Generate CV");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 205));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_2.setBounds(731, 391, 196, 35);
		panel_1.add(btnNewButton_2);	
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					JFileChooser dialog = new JFileChooser();
			      dialog.setSelectedFile(new File(txtFirstName.getText()+" "+textField.getText()+"-CV"+".pdf"));
			      int dialogResult = dialog.showSaveDialog(null);
			      
			      if (dialogResult==JFileChooser.APPROVE_OPTION)
			      {
			    	  try {
			    		  
			    		  String filePath = dialog.getSelectedFile().getPath();
			     	 
			     		 com.itextpdf.text.Document myDocument = new com.itextpdf.text.Document();  
			     		 PdfWriter myWriter=PdfWriter.getInstance(myDocument,new FileOutputStream(filePath));
			     		 myDocument.open();
			            
			     		float columnWidth1[]= {22f,80f,40f}; 
			     		PdfPTable table1 = new PdfPTable(columnWidth1);
			            table1.setWidthPercentage(100);
			            
			            com.itextpdf.text.Image img=com.itextpdf.text.Image.getInstance(filename);
			            img.setAbsolutePosition(473f, 750f);
			            img.scaleAbsolute(80f,70f);
			             PdfPCell c11 = new PdfPCell(img);
			             
			             c11.setBorder(0);
			           table1.addCell(c11);
			             
			            PdfPCell cell = new PdfPCell(new Paragraph(txtFirstName.getText()+"  "+textField.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.DARK_GRAY )));
			            	
			            cell.setBorder(0);
			            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			            
			            table1.addCell(cell);
			            
			            float columnWidth2[]= {33f,80f};
			            PdfPTable table2 = new PdfPTable(columnWidth2);
			            	PdfPCell c1=new PdfPCell(new Paragraph("Email:",FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.BLACK)));
			            	PdfPCell c2=new PdfPCell(new Paragraph(textField_1.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,8,BaseColor.DARK_GRAY)));
			            	c1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			            	c2.setHorizontalAlignment(Element.ALIGN_LEFT);
			            			c1.setBorder(0);
			            			c2.setBorder(0);
			            	table2.addCell(c1);
			            	table2.addCell(c2);

			            	c1=new PdfPCell(new Paragraph("Linkedin:",FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.BLACK)));			            	
			            	Chunk chunk=new Chunk("Linkedin Profile",FontFactory.getFont(FontFactory.TIMES_BOLD,8,BaseColor.BLUE));
			            	chunk.setAnchor(textField_23.getText());
			            	c2=new PdfPCell(new Paragraph(chunk));
			            	c1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			            	c2.setHorizontalAlignment(Element.ALIGN_LEFT);
			            			c1.setBorder(0);
			            			c2.setBorder(0);
			            	table2.addCell(c1);
			            	table2.addCell(c2);
			            	
			            	
			            	c1=new PdfPCell(new Paragraph("Github:",FontFactory.getFont(FontFactory.TIMES_BOLD,9,BaseColor.BLACK)));
			            	Chunk chunk1=new Chunk("Github Profile",FontFactory.getFont(FontFactory.TIMES_BOLD,8,BaseColor.BLUE));
			            	chunk1.setAnchor(textField_24.getText());
			            	c2=new PdfPCell(new Paragraph(chunk1));
			            	c1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			            	c2.setHorizontalAlignment(Element.ALIGN_LEFT);
			            			c1.setBorder(0);
			            			c2.setBorder(0);
			            	table2.addCell(c1);
			            	table2.addCell(c2);
			            	
			            	
			            	
			            	
			            	
			            PdfPCell cell1 = new PdfPCell(table2);
			            
			            cell1.setBorder(0);
			            cell1.setVerticalAlignment(Element.ALIGN_TOP);
			            cell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
			            table1.addCell(cell1);
   
			            myDocument.add(table1);
			            
//			            myDocument.add(image);
			            myDocument.add(new Paragraph("")); 
			            myDocument.add(new Paragraph(""));
			            myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
			           

//			        	Projects
			        				        myDocument.add(new Paragraph("PROJECTS",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD,BaseColor.DARK_GRAY ))); 
			        				        myDocument.add(new Paragraph(""));
			        				        
			        				        com.itextpdf.text.Font f2 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN,15,com.itextpdf.text.Font.BOLD);
			        				        com.itextpdf.text.Font f3 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN,10,com.itextpdf.text.Font.ITALIC,BaseColor.LIGHT_GRAY);
			        				          
			        				        
			        				        if(!textField_16.getText().equals("Project1"))
			        				        {
			        				        	myDocument.add(new Paragraph(textField_16.getText(),f2)); 
			        				        	myDocument.add(new Paragraph(textArea.getText(),f3)); 
			        				        }
			        				        if(!textField_17.getText().equals("Project2"))
			        				        {
			        				        	myDocument.add(new Paragraph(textField_17.getText(),f2)); 
			        				        	myDocument.add(new Paragraph(textArea_1.getText(),f3)); 
			        				        }
			        				        if(!textField_18.getText().equals("Project3"))
			        				        {
			        				        	myDocument.add(new Paragraph(textField_18.getText(),f2)); 
			        				        	myDocument.add(new Paragraph(textArea_2.getText(),f3)); 
			        				        }
			        				        if(!textField_20.getText().equals("Project4"))
			        				        {
			        				        	myDocument.add(new Paragraph(textField_20.getText(),f2)); 
			        				        	myDocument.add(new Paragraph(textArea_4.getText(),f3)); 
			        				        }
			        				        if(!textField_19.getText().equals("Project5"))
			        				        {
			        				        	myDocument.add(new Paragraph(textField_19.getText(),f2)); 
			        				        	myDocument.add(new Paragraph(textArea_3.getText(),f3)); 
			        				        }
			        				        if(!textField_21.getText().equals("Project6"))
			        				        {
			        				        	myDocument.add(new Paragraph(textField_21.getText(),f2)); 
			        				        	myDocument.add(new Paragraph(textArea_5.getText(),f3)); 
			        				        }
			        				        if(!textField_22.getText().equals("Project7"))
			        				        {
			        				        	myDocument.add(new Paragraph(textField_22.getText(),f2)); 
			        				        	myDocument.add(new Paragraph(textArea_6.getText(),f3)); 
			        				        }
			        			
			        				        myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
			        				                    
			            
			            
//		ACADEMIC DETAILS
			            myDocument.add(new Paragraph("ACADEMIC DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD,BaseColor.DARK_GRAY ))); 
			          
			            
			            float columnWidth[]= {30f,80f,80f,30f,50f};
			            PdfPTable table=new PdfPTable(columnWidth);
			            table.setWidthPercentage(100);
			            com.itextpdf.text.Font f1 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN,12,com.itextpdf.text.Font.BOLD);
			          
			            PdfPCell cell_1 = new PdfPCell(new Paragraph("Program",f1));
			            PdfPCell cell_2 = new PdfPCell(new Paragraph("Institute",f1));
			            PdfPCell cell_3 = new PdfPCell(new Paragraph("Board/University",f1));
			            PdfPCell cell_4 = new PdfPCell(new Paragraph("Year",f1));
			            PdfPCell cell_5 = new PdfPCell(new Paragraph("CGPA/Percentage",f1));
				            table.addCell(cell_1);
				            table.addCell(cell_2);
				            table.addCell(cell_3);
				            table.addCell(cell_4);
				            table.addCell(cell_5);
				     
				        cell_1=new PdfPCell(new Paragraph("10th"));
				        cell_2=new PdfPCell(new Paragraph(txtSchoolName.getText()));
				        cell_3=new PdfPCell(new Paragraph(txtBoarduniversity.getText()));
				        cell_4=new PdfPCell(new Paragraph(txtYear.getText()));
				        cell_5=new PdfPCell(new Paragraph(txtCgpapercentage.getText()));
					        table.addCell(cell_1);
				            table.addCell(cell_2);
				            table.addCell(cell_3);
				            table.addCell(cell_4);
				            table.addCell(cell_5);
				        
			            cell_1=new PdfPCell(new Paragraph("12th"));
				        cell_2=new PdfPCell(new Paragraph(textField_6.getText()));
				        cell_3=new PdfPCell(new Paragraph(textField_7.getText()));
				        cell_4=new PdfPCell(new Paragraph(textField_8.getText()));
				        cell_5=new PdfPCell(new Paragraph(textField_9.getText()));
					        table.addCell(cell_1);
				            table.addCell(cell_2);
				            table.addCell(cell_3);
				            table.addCell(cell_4);
				            table.addCell(cell_5);
			            
			            cell_1=new PdfPCell(new Paragraph(txtCollegeuniversity.getText()));
				        cell_2=new PdfPCell(new Paragraph(txtBoarduniversity_1.getText()));
				        cell_3=new PdfPCell(new Paragraph(txtBoarduniversity_1.getText()));
				        cell_4=new PdfPCell(new Paragraph(textField_12.getText()));
				        cell_5=new PdfPCell(new Paragraph(textField_13.getText()));
					        table.addCell(cell_1);
				            table.addCell(cell_2);
				            table.addCell(cell_3);
				            table.addCell(cell_4);
				            table.addCell(cell_5);
				            
				       if(!textField_10.getText().equals("Program")) 
				       {
			            cell_1=new PdfPCell(new Paragraph(textField_10.getText()));
				        cell_2=new PdfPCell(new Paragraph(textField_11.getText()));
				        cell_3=new PdfPCell(new Paragraph(textField_11.getText()));
				        cell_4=new PdfPCell(new Paragraph(textField_14.getText()));
				        cell_5=new PdfPCell(new Paragraph(textField_15.getText()));
					        table.addCell(cell_1);
				            table.addCell(cell_2);
				            table.addCell(cell_3);
				            table.addCell(cell_4);
				            table.addCell(cell_5);
				       } 
			            myDocument.add(table);
			            myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
			           
//		Achivements			            
			            myDocument.add(new Paragraph("ACHIVEMENTS & CERTIFICATIONS",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD,BaseColor.DARK_GRAY ))); 
			            myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.BOLD,BaseColor.DARK_GRAY)));
			            List list = new List(); 
				            if(!txtAwardcertificate.getText().equals("Award/Certificate")) list.add(txtAwardcertificate.getText());
				            if(!txtAwardcertificate_1.getText().equals("Award/Certificate")) list.add(txtAwardcertificate_1.getText());
				            if(!txtAwardcertificate_2.getText().equals("Award/Certificate")) list.add(txtAwardcertificate_2.getText());
				            if(!txtAwardcertificate_3.getText().equals("Award/Certificate")) list.add(txtAwardcertificate_3.getText());
				        myDocument.add(list);
				        myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
				           
//		Skills
				        myDocument.add(new Paragraph("SKILLS",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD,BaseColor.DARK_GRAY ))); 
				        myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.BOLD,BaseColor.DARK_GRAY)));
				           
				        List list1 = new List(); 
				            if(!txtSkill.getText().equals("Skill")) list1.add(txtSkill.getText());
				            if(!txtSkill_1.getText().equals("Skill")) list1.add(txtSkill_1.getText());
				            if(!txtSkill_2.getText().equals("Skill")) list1.add(txtSkill_2.getText());
				            if(!textField_5.getText().equals("Skill")) list1.add(textField_5.getText());
				        myDocument.add(list1);
				        myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
				           
				        	        
				        
			            myDocument.close();  
			         }
			    	  catch(Exception ex)
			    	  {
			    		  ex.printStackTrace();
			    	  }
			}

			}
		});
		panel4.setVisible(false);
		panel3.setVisible(false);
		
		
		panel2.setVisible(false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
