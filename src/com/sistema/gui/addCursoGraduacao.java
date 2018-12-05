package com.sistema.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.academico.cursos.CursoGraduacao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addCursoGraduacao extends cursosGraduacao {

	JFrame frameAC;
	
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtTurno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCursoGraduacao window = new addCursoGraduacao();
					window.frameAC.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addCursoGraduacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void salvarCurso() {
		try {
			cursos.add(new CursoGraduacao(txtCodigo.getText().toString(), txtNome.getText().toString(), txtTurno.getText().toString()));
			JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!", "Sucesso", 1);
			frameAC.dispose();
			preencheLista();
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar curso", "Mistakes were made", 1);
		}
	}
	
	private void initialize() {
		frameAC = new JFrame();
		frameAC.setBounds(100, 100, 400, 300);
		frameAC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameAC.getContentPane().setLayout(null);
		
		JLabel lblCdigo = new JLabel("Código:");
		lblCdigo.setBounds(36, 73, 70, 15);
		frameAC.getContentPane().add(lblCdigo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(36, 111, 70, 15);
		frameAC.getContentPane().add(lblNome);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setBounds(36, 149, 70, 15);
		frameAC.getContentPane().add(lblTurno);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(111, 71, 233, 19);
		frameAC.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(111, 109, 227, 19);
		frameAC.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtTurno = new JTextField();
		txtTurno.setBounds(111, 147, 227, 19);
		frameAC.getContentPane().add(txtTurno);
		txtTurno.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(53, 199, 117, 25);
		frameAC.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarCurso();
			}
		});
		btnSalvar.setBounds(203, 199, 117, 25);
		frameAC.getContentPane().add(btnSalvar);
	}
}
