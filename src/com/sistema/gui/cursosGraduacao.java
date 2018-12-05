package com.sistema.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import com.academico.cursos.CursoGraduacao;

import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cursosGraduacao {
	
	public static ArrayList<CursoGraduacao> cursos = new ArrayList<CursoGraduacao>();

	public static JList jlist;
	JFrame frameCG;
	DefaultListModel model = new DefaultListModel();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cursosGraduacao window = new cursosGraduacao();
					window.frameCG.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public cursosGraduacao() {
		initialize();
	}

	public DefaultListModel preencheLista() {
		Vector<String> cg = new Vector<String>();
		
		for(CursoGraduacao c : cursos) {
			model.addElement(c.getCodigoCurso() + ". " + c.getNomeCurso());
		}
		
		System.out.println(model);
		return model;
	}

	private void initialize() {
		frameCG = new JFrame();
		frameCG.setBounds(100, 100, 800, 600);
		frameCG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCG.getContentPane().setLayout(null);
		
		jlist = new JList(preencheLista().toArray());
		
		jlist.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		jlist.setBackground(Color.WHITE);
		jlist.setFont(new Font("Dialog", Font.ITALIC, 14));
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jlist.setBounds(33, 67, 240, 463);
		frameCG.getContentPane().add(jlist);

		jlist.updateUI();
		
		JButton btnNovoCurso = new JButton("Novo curso");
		btnNovoCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addCursoGraduacao window = new addCursoGraduacao();
				window.frameAC.setVisible(true);
			}
		});
		btnNovoCurso.setBounds(285, 65, 117, 25);
		frameCG.getContentPane().add(btnNovoCurso);
	}
}
