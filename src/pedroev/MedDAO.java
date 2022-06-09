/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedroev;

/**
 *
 * @author pedro
 */
public class MedDAO extends Conexao {
    
    public String cadastrarMedico(medico medico)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO MEDICO VALUES (NULL,'" +
                        medico.getNome() + "','" + medico.getEspecialidade() +
                        "','" + medico.getCRM() + "','" + medico.getCRM() +
                        "','" + medico.getCPF() + "')";
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
        }
    public String atualizarMedico(medico medico)
    {
         try
        {
            String sentenca;
            sentenca = "UPDATE medico SET NOME = '" + medico.getNome() +
                        "',ESPECIALIDADE = " + medico.getEspecialidade() +
                        "',CRM = " + medico.getCRM() + "',CRM = " + medico.getCPF() +
                        "'WHERE idmedico = " + medico.getIdmedico();
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
        }
    public String excluirMedico(medico medico)
    {
         try
        {
            String sentenca;
            sentenca = "DELETE FROM medico WHERE idmedico =" + medico.getIdmedico();
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
        }
    }


