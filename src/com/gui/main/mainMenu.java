package com.gui.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import com.jgoodies.forms.layout.FormLayout;
import com.config.SystemMessages;
import com.info.instituicao.Instituicao;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
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
		
		if(!instituicoes.isEmpty()) {
			for(Instituicao i : instituicoes) {
				inst.add(i.getNomeInstituicao());
			}
		} else {
			inst.add("Selecione...");
		}
		
		comboBox.setModel(new DefaultComboBoxModel<String>(inst));
		
		comboBox.setBounds(22, 120, 600, 33);
		return comboBox;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnSooolSistema = new JTextPane();
		txtpnSooolSistema.setFont(new Font("Dialog", Font.BOLD, 16));
		txtpnSooolSistema.setText("SOOOL - Sistema Orientado a Objetos Online");
		txtpnSooolSistema.setBounds(212, 12, 410, 33);
		frame.getContentPane().add(txtpnSooolSistema);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 47, 816, 23);
		frame.getContentPane().add(separator);
		
		JTextPane txtpnMenu = new JTextPane();
		txtpnMenu.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtpnMenu.setText("Menu");
		txtpnMenu.setBounds(12, 47, 91, 23);
		frame.getContentPane().add(txtpnMenu);
		
		JButton btnNovoCursoDe = new JButton("Cursos de Graduação");
		btnNovoCursoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNovoCursoDe.setBounds(22, 165, 392, 25);
		frame.getContentPane().add(btnNovoCursoDe);
		
		JButton btnNovoCursoDe_1 = new JButton("Cursos de Extensão");
		btnNovoCursoDe_1.setBounds(424, 165, 392, 25);
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
		
		btnNovaInstituio.setBounds(628, 120, 188, 33);
		frame.getContentPane().add(btnNovaInstituio);

		frame.setBounds(100, 100, 840, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(new Color(248, 248, 255));
		frame.setJMenuBar(menuBar);
	}
}
