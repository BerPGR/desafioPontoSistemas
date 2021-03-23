package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;


import entities.Pessoa;


import javax.swing.JOptionPane;


import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class Programa {

	List<Pessoa> pessoa = new ArrayList<>();
	private JFrame frame;
	private JTextField NomeField;
	private JTextField IdadeField;
	private JTextField EmailField;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa window = new Programa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Programa() {
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 681, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Pessoas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setBounds(83, 22, 171, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		NomeField = new JTextField();
		NomeField.setBounds(44, 54, 225, 20);
		frame.getContentPane().add(NomeField);
		NomeField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(10, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		IdadeField = new JTextField();
		IdadeField.setBounds(44, 99, 86, 20);
		frame.getContentPane().add(IdadeField);
		IdadeField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(19, 86, 269, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 132, 268, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setBounds(10, 148, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		EmailField = new JTextField();
		EmailField.setBounds(44, 145, 225, 20);
		frame.getContentPane().add(EmailField);
		EmailField.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(19, 173, 269, 7);
		frame.getContentPane().add(separator_2);
		
		JButton SalvarBtt = new JButton("Salvar");
		SalvarBtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(NomeField.getText().equals(null) || IdadeField.getText().equals(null) || EmailField.getText().equals(null) ) {
					JOptionPane.showMessageDialog(null, "Digite os valores nos espaços em branco");
				}
				pessoa.add(new Pessoa(NomeField.getText(), Integer.parseInt(IdadeField.getText()), EmailField.getText()));
				NomeField.setText("");
				IdadeField.setText("");
				EmailField.setText("");
				
			}
		});
		SalvarBtt.setBounds(113, 203, 89, 23);
		frame.getContentPane().add(SalvarBtt);
		
		JButton LerBtt = new JButton("Ler");
		LerBtt.setBounds(113, 237, 89, 23);
		frame.getContentPane().add(LerBtt);
		
		JButton AtualizarBtt = new JButton("Atualizar");
		AtualizarBtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AtualizarBtt.setBounds(113, 271, 89, 23);
		frame.getContentPane().add(AtualizarBtt);
		
		JButton DeletarBtt = new JButton("Deletar");
		DeletarBtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(pessoa.equals(null))) {
					pessoa = null;
					JOptionPane.showMessageDialog(null, "Lista deletada!");
				}
			}
		});
		DeletarBtt.setBounds(113, 305, 89, 23);
		frame.getContentPane().add(DeletarBtt);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(336, 57, 303, 248);
		frame.getContentPane().add(panel);
		
		}
	}

