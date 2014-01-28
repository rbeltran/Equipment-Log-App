package testPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;


public class WindowBuilderTest extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAddDescription;
	private JTextField textFieldOutput;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTest frame = new WindowBuilderTest();
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
	public WindowBuilderTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxEquipmentList = new JComboBox();
		comboBoxEquipmentList.setToolTipText("Select equipment from list.");
		comboBoxEquipmentList.setBounds(55, 22, 226, 27);
		comboBoxEquipmentList.addItem("Choose equipment");
		comboBoxEquipmentList.addItem("Dispenser");
		comboBoxEquipmentList.addItem("Pin Tool");	
		//final String equipment = (String)comboBoxEquipmentList.getSelectedItem();
		contentPane.add(comboBoxEquipmentList);
		
		
		JButton btnSave = new JButton("Save");
		btnSave.setToolTipText("Click to save entry to log.");
		
		btnSave.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {	
				//String equipment = (String) comboBoxEquipmentList.getSelectedItem();
				//textFieldOutput.setText(equipment);
				/*how to save to Excel sheet when I click the save button?*/
			}
		});		
		btnSave.setBounds(103, 271, 117, 29);
		contentPane.add(btnSave);
				
		JTextArea textAreaDescription = new JTextArea();
		textAreaDescription.setLineWrap(true);
		textAreaDescription.setText("test");
		textAreaDescription.setBounds(55, 194, 206, 71);
		contentPane.add(textAreaDescription);
		
		textFieldAddDescription = new JTextField();
		textFieldAddDescription.setText("Add notes below:");
		textFieldAddDescription.setEditable(false);
		textFieldAddDescription.setBounds(55, 154, 134, 28);
		contentPane.add(textFieldAddDescription);
		textFieldAddDescription.setColumns(10);
		
		JComboBox comboBoxCategoryList = new JComboBox();
		comboBoxCategoryList.setBounds(55, 61, 206, 27);
		comboBoxCategoryList.addItem("Choose task category");
		comboBoxCategoryList.addItem("Valve Change");
		comboBoxCategoryList.addItem("Wash Fluid Change");
		contentPane.add(comboBoxCategoryList);
		
		JComboBox comboBoxValveNumber = new JComboBox();
		comboBoxValveNumber.setModel(new DefaultComboBoxModel(new String[] {"Choose Valve Number", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBoxValveNumber.setBounds(55, 101, 206, 27);
		comboBoxValveNumber.addItem("Choose Valve Number");
		comboBoxValveNumber.addItem("1");
		comboBoxValveNumber.addItem("2");
		comboBoxValveNumber.addItem("3");
		comboBoxValveNumber.addItem("4");
		comboBoxValveNumber.addItem("5");
		comboBoxValveNumber.addItem("6");
		comboBoxValveNumber.addItem("7");
		comboBoxValveNumber.addItem("8");
		
		contentPane.add(comboBoxValveNumber);
		
		textFieldOutput = new JTextField();
		textFieldOutput.setEditable(false);
		textFieldOutput.setBounds(344, 20, 134, 28);
		contentPane.add(textFieldOutput);
		textFieldOutput.setColumns(10);
		
	}
}
