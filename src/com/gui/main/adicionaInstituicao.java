package com.gui.main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import com.info.instituicao.Instituicao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class adicionaInstituicao extends mainMenu {

	protected JFrame frame;
	private JTextField txtNome;
	private JTextField txtCidade;
	private JTextField txtUf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adicionaInstituicao window = new adicionaInstituicao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adicionaInstituicao() {
		super();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("Digite o nome...");
		txtNome.setBounds(12, 39, 416, 30);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNomeDaInstituio = new JLabel("Nome da instituição:");
		lblNomeDaInstituio.setBounds(12, 12, 192, 15);
		frame.getContentPane().add(lblNomeDaInstituio);
		
		txtCidade = new JTextField();
		txtCidade.setToolTipText("Digite a Cidade...");
		txtCidade.setColumns(10);
		txtCidade.setBounds(12, 108, 277, 30);
		frame.getContentPane().add(txtCidade);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(12, 81, 192, 15);
		frame.getContentPane().add(lblCidade);
		
		txtUf = new JTextField();
		txtUf.setToolTipText("Digite a UF...");
		txtUf.setColumns(10);
		txtUf.setBounds(301, 108, 127, 30);
		frame.getContentPane().add(txtUf);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(301, 81, 127, 15);
		frame.getContentPane().add(lblEstado);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(213, 172, 117, 25);
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				instituicoes.add(new Instituicao(txtNome.getText(), txtCidade.getText(), txtUf.getText()));
				JOptionPane.showMessageDialog(null, "Instituiçao " + txtNome.getText() + " criada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
				reload();
			}
		});
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(123, 172, 77, 25);
		frame.getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				reload();
			}
		});
		
		frame.getContentPane().add(btnSalvar);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 456, 255);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
