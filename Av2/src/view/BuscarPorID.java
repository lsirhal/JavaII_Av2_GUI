package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.BuscarID;
import controller.Deletar;
import model.Contato;

public class BuscarPorID extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPorID frame = new BuscarPorID();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuscarPorID() {
		setTitle("Buscar por ID - Contatos 1.0");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 543, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar por ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(146, 22, 242, 61);
		contentPane.add(lblNewLabel);
		
		JButton btnDeletar = new JButton("Buscar");
		btnDeletar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeletar.setBounds(191, 186, 115, 36);
		contentPane.add(btnDeletar);
		
		JLabel lblNewLabel_4 = new JLabel("Digite o ID:");
		lblNewLabel_4.setBounds(10, 111, 72, 14);
		contentPane.add(lblNewLabel_4);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(78, 108, 86, 20);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);
		
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = textFieldID.getText();
				
				Contato contato = new Contato();
				
				Long id_long = Long.parseLong(id);
				
				contato.setId(id_long);
		
				BuscarID.buscarID(contato);
			}
		});
		
	}

}
