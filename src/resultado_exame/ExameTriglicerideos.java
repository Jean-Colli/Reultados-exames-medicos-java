package resultado_exame;

import javax.swing.JOptionPane;

public class ExameTriglicerideos extends Exame{
    
    private double qtdTriglicerideos;

    public double getQtdTriglicerideos() {
        return qtdTriglicerideos;
    }

    public void setQtdTriglicerideos(double qtdTriglicerideos) {
        this.qtdTriglicerideos = qtdTriglicerideos;
    }

    
    
    @Override 
    public void cadastrarExame(){
        super.cadastrarExame();
        setQtdTriglicerideos(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Triglicerídeos por mg/dL do paciente")));
    }
    
    private String classificarExame(){
        if (super.calculaIdade() <= 9){
            if(this.getQtdTriglicerideos() < 75){
                return "Bom";
            }else{
                return "Ruim";
            }           
        }
        if(super.calculaIdade() >= 10 && super.calculaIdade() <= 19){
            if(this.getQtdTriglicerideos() < 90){
                return "Bom";
            } else {
                return "Ruim";
            }
        }else {
            if(this.getQtdTriglicerideos() < 150){
                return "Bom";
            }else {
                return "Ruim";
            }
        }
    }
    
    public void mostrarResultado(){
        String msg = "Paciente: " + this.getPacienteNome() + "\n";
        msg += "Tipop Sanguíneo: " + this.getTipoSanguíneo() + "\n";
        msg += "Idade: " + this.calculaIdade() + "\n\n";
        
        msg += "Quantidade de Triglicerídeos no sangue: " + this.getQtdTriglicerideos()+ " mg/dL \n";
        msg += "Classificação do Resultado do Exame: " + this.classificarExame();
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
 
