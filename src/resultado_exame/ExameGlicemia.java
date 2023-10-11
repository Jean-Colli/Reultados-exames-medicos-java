package resultado_exame;

import javax.swing.JOptionPane;

public class ExameGlicemia extends Exame{
    
    private double qtdGlicose;

    public double getQtdGlicose() {
        return qtdGlicose;
    }

    public void setQtdGlicose(double qtdGlicose) {
        this.qtdGlicose = qtdGlicose;
    }
    
    @Override 
    public void cadastrarExame(){
        super.cadastrarExame();
        setQtdGlicose(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Glicose por mg/dL do paciente")));
    }
    
    private String classificarExame(){
        if (this.getQtdGlicose() < 100){
            return "Normoglicemia";
        }
        if(this.getQtdGlicose() >= 100 && this.getQtdGlicose() < 126){
            return "Pré-diabetes";
        }else {
            return "Diabetes estabelecido";
        }
    }
    
    public void mostrarResultado(){
        String msg = "Paciente: " + this.getPacienteNome() + "\n";
        msg += "Tipop Sanguíneo: " + this.getTipoSanguíneo() + "\n";
        msg += "Idade: " + this.calculaIdade() + "\n\n";
        
        msg += "Quantidade de Glicose no sangue: " + this.getQtdGlicose() + " mg/dL \n";
        msg += "Classificação do Resultado do Exame: " + this.classificarExame();
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
 
