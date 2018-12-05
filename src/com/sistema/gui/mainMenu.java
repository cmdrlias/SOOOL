package com.sistema.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;

import com.academico.instituicao.Instituicao;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class mainMenu {
	
	ArrayList<Instituicao> instituicoes = new ArrayList<Instituicao>();

	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenu window = new mainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public mainMenu() {
		initialize();
	}
	
	public void reload() {
		initialize();
	}
	
	public JComboBox setComboboxInstituicao() {
		JComboBox<String> comboBox = new JComboBox<String>();
		Vector<String> inst = new Vector<String>();
		
		instituicoes.add(new Instituicao("UNIBH", "Belo Horizonte", "Minas Gerais"));
		
		if(!instituicoes.isEmpty()) {
			for(Instituicao i : instituicoes) {
				inst.add(i.getNomeInstituicao());
			}
		} else {
			inst.add("Selecione...");
		}
		
		comboBox.setModel(new DefaultComboBoxModel<String>(inst));
		
		comboBox.setBounds(22, 120, 750, 33);
		return comboBox;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1000, 600);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 47, 976, 23);
		frame.getContentPane().add(separator);
		
		JTextPane txtpnMenu = new JTextPane();
		txtpnMenu.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtpnMenu.setText("Menu");
		txtpnMenu.setBounds(12, 47, 91, 23);
		frame.getContentPane().add(txtpnMenu);
		
		JButton btnNovoCursoDe = new JButton("Cursos de Graduação");
		btnNovoCursoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cursosGraduacao window = new cursosGraduacao();
				window.frame.setVisible(true);
			}
		});
		btnNovoCursoDe.setBounds(22, 165, 450, 44);
		frame.getContentPane().add(btnNovoCursoDe);
		
		JButton btnNovoCursoDe_1 = new JButton("Cursos de Extensão");
		btnNovoCursoDe_1.setBounds(522, 165, 450, 44);
		frame.getContentPane().add(btnNovoCursoDe_1);
		
		// ComboBox instituição
		
		JComboBox comboBox = setComboboxInstituicao();
		frame.getContentPane().add(comboBox);
		
		JLabel lblSelecioneUmaInstituio = new JLabel("Selecione uma instituição:");
		lblSelecioneUmaInstituio.setBounds(22, 93, 206, 15);
		frame.getContentPane().add(lblSelecioneUmaInstituio);
		
		// Botão de ação - Nova instituição
		
		JButton btnNovaInstituio = new JButton("Nova instituição");
		btnNovaInstituio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionaInstituicao window = new adicionaInstituicao();
				window.frame.setVisible(true);
			}
		});
		
		btnNovaInstituio.setBounds(784, 120, 188, 33);
		frame.getContentPane().add(btnNovaInstituio);
		
		JLabel lblSooolSistema = new JLabel("SOOOL - Sistema Orientado a Objetos Online");
		lblSooolSistema.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSooolSistema.setBounds(300, 20, 417, 15);
		frame.getContentPane().add(lblSooolSistema);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
