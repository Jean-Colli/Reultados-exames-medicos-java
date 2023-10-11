
package resultado_exame;

import javax.swing.JOptionPane;

public class Exame {
    private String pacienteNome;
    private int anoDeNascimento;
    private String tipoSanguíneo;

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getTipoSanguíneo() {
        return tipoSanguíneo;
    }

    public void setTipoSanguíneo(String tipoSanguíneo) {
        this.tipoSanguíneo = tipoSanguíneo;
    }
    
    public void cadastrarExame(){
        setPacienteNome(JOptionPane.showInputDialog("Insira o Nome do Paciente"));
        setTipoSanguíneo(JOptionPane.showInputDialog("Insira o Tipo Sanguíneo do Paciente"));
        setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de Nascimento do Paciente")));
    }
    
    public int calculaIdade(){
        return 2023 - this.getAnoDeNascimento();
    }
    

    
}
