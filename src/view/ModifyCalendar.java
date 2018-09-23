package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JList;

public class ModifyCalendar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;

	

	/**
	 * Create the dialog.
	 */
	public ModifyCalendar() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblName = new JLabel("Calendar Name: ");
			lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
			lblName.setBounds(44, 37, 109, 16);
			contentPanel.add(lblName);
		}
		{
			JLabel lblStartDate = new JLabel("Start Date");
			lblStartDate.setBounds(44, 78, 97, 16);
			contentPanel.add(lblStartDate);
		}
		{
			JLabel lblEndDate = new JLabel("End Date");
			lblEndDate.setBounds(44, 118, 79, 16);
			contentPanel.add(lblEndDate);
		}
		{
			JLabel lblMeetingDuraton = new JLabel("TimeSlot Duration");
			lblMeetingDuraton.setBounds(44, 158, 124, 16);
			contentPanel.add(lblMeetingDuraton);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(226, 76, 130, 26);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(226, 113, 130, 26);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(226, 158, 130, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(226, 37, 130, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}