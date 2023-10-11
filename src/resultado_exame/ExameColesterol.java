package resultado_exame;

import javax.swing.JOptionPane;

public class ExameColesterol extends Exame{
    
    private double qdtLDL;
    private double qdtHDL;
    private String riscoPaciente;
    

    public double getQdtLDL() {
        return qdtLDL;
    }

    public void setQdtLDL(double qdtLDL) {
        this.qdtLDL = qdtLDL;
    }

    public double getQdtHDL() {
        return qdtHDL;
    }

    public void setQdtHDL(double qdtHDL) {
        this.qdtHDL = qdtHDL;
    }

    public String getRiscoPaciente() {
        return riscoPaciente;
    }

    public void setRiscoPaciente(String riscoPaciente) {
        this.riscoPaciente = riscoPaciente;
    }
    
    @Override 
    public void cadastrarExame(){
        super.cadastrarExame();
        setQdtLDL(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Colesterol LDL por mg/dL do paciente")));
        setQdtHDL(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Colesterol HDL por mg/dL do paciente")));
        setRiscoPaciente(JOptionPane.showInputDialog("Insira o risco do Paciente: \nB - baixo \nM - médio \nA - alto"));
    }
    
    private String classificarExameHDL(){
        if (super.calculaIdade() <= 19){
            if(this.getQdtHDL() > 45){
                return "Bom";
            }else {
                return "Ruim";
            }
        }else {
            if(this.getQdtHDL() > 40){
                return "Bom";
            }else {
                return "Ruim";
            } 
        }
    }
    
    private String classificarExameLDL(){
        if(this.getRiscoPaciente().equals("B")){
            if(this.getQdtLDL() < 100){
                return "Bom";
            }else {
                return "Ruim";
            }
        }
        if(this.getRiscoPaciente().equals("M")){
            if(this.getQdtLDL() < 70){
                return "Bom";
            }else{
                return "Ruim";
            }
        }else {
            if (this.getQdtLDL() < 50){
                return "Bom";
            }else {
                return "Ruim";
            }
        }
        
        
    }
    
    private String stringRiscoPaciente(){
        if(this.getRiscoPaciente().equals("B")){
            return "Baixo";
        }
        if(this.getRiscoPaciente().equals("M")){
            return "Médio";
        }else {
            return "Alto";
        }
    }
    
    
    public void mostrarResultado(){
        String msg = "Paciente: " + this.getPacienteNome() + "\n";
        msg += "Tipop Sanguíneo: " + this.getTipoSanguíneo() + "\n";
        msg += "Idade: " + this.calculaIdade() + "\n\n";
        
        msg += "Quantidade de Colesterol HDL no sangue: " + this.getQdtHDL()+ " mg/dL \n";
        msg += "Classificação do Resultado do Exame: HDL - " + this.classificarExameHDL() + "\n\n";
        
        msg += "Risco do paciente: " + this.stringRiscoPaciente() + "\n";
        msg += "Quantidade de Colesterol HDL no sangue: " + this.getQdtLDL()+ " mg/dL \n";
        msg += "Classificação do Resultado do Exame: LDL - " + this.classificarExameLDL();
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
 
