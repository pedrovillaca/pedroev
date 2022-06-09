/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedroev;

/**
 *
 * @author pedro
 */
public class PacDAO extends Conexao {
    
    public String cadastrarPaciente(paciente paciente)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO PACIENTE VALUES (NULL,'" +
                        paciente.getNome() + "','" + paciente.getIdade() +            
                        "','" + paciente.getCPF() + "')";
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
        }
    public String atualizarPaciente(paciente paciente)
    {
         try
        {
            String sentenca;
            sentenca = "UPDATE paciente SET NOME = '" + paciente.getNome() +
                        "',IDADE = " + paciente.getIdade() + 
                        "',CPF = " + paciente.getCPF() +
                        "'WHERE idpaciente = " + paciente.getIdpaciente();
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
        }
    public String excluirPaciente(paciente paciente)
    {
         try
        {
            String sentenca;
            sentenca = "DELETE FROM paciente WHERE idpaciente =" + paciente.getIdpaciente();
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
        }
    }
