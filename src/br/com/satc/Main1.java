/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jessica.155117
 */
public class Main1 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException  {
        Disciplina disciplina;
        String nomeDisciplina = JOptionPane.showInputDialog("informe o nome da disciplina:");
        String departamento = JOptionPane.showInputDialog("qual o departamento?");
        String status = JOptionPane.showInputDialog("informe seu status");
        
        disciplina = new Disciplina(nomeDisciplina,  departamento, status);
        JOptionPane.showInputDialog(null,disciplina.toString());
        
      
        
        
        Professor professor;
        String nomeprofessor = JOptionPane.showInputDialog("informe seu nome");
        int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("informe a carga horaria do :"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("informe o valor da sua hora:"));
        String rgProfessor = JOptionPane.showInputDialog("informe o rg do professor:");
        String cpfProfessor = JOptionPane.showInputDialog("informe o cpf do professor:");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("informe a data de nascimento:"));
        String nomeProfessor = null;
        
   
       
        
        professor = new Professor(cargaHoraria, valorHora, nomeProfessor, rgProfessor, cpfProfessor,dataNascimento, cargaHoraria);
        JOptionPane.showInputDialog(null, professor.toString());
        
        
        Aluno aluno;
        String nomeAluno = JOptionPane.showInputDialog("informe o nome do aluno");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("informe a matricula do aluno:"));
        Date dataMatricula = sdf.parse(JOptionPane.showInputDialog("informe a data da matricula:"));
        String rgAluno = JOptionPane.showInputDialog("informe o rg do aluno:");
        String cpfAluno = JOptionPane.showInputDialog("informe o cpf do aluno:");
        Date datanascimento = sdf.parse(JOptionPane.showInputDialog("informe a data de nascimento do aluno"));
        
        
        aluno = new Aluno(matricula, dataMatricula, nomeAluno, datanascimento, matricula);
        JOptionPane.showInputDialog(null, aluno.toString());
        
        
        
        
        
        
    }
    
}



    
    

