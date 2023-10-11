package resultado_exame;

public class Principal {
    public static void main(String[] args) {
        
        //Exame de Glicemia
        ExameGlicemia exameG = new ExameGlicemia();
        
        exameG.cadastrarExame();
        exameG.mostrarResultado();
        
        //Exame de Colesterol
        ExameColesterol exameC = new ExameColesterol();
        
        exameC.cadastrarExame();
        exameC.mostrarResultado();
        
        //Exame de Triglicerídeos
        ExameTriglicerideos exameT = new ExameTriglicerideos();
        
        exameT.cadastrarExame();
        exameT.mostrarResultado();
    }
    
}
