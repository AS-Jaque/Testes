import javax.swing.JOptionPane;

public class CalculadoraAluguelCarros {

    
     public String listarCarrosEvalores() {
        String carrosEvalores = "Fiat Doblo 7 lugares, diaria: 215.00 || Chevrolet Spin 7 lugares, diaria: 230.00 || Fiesta Sedã 5 lugares, diaria: 190.00 || Fiat Siena 5 lugares, diaria: 170.00";
        return carrosEvalores;
        
     }
    
    
    public int calcularAluguelCarroSeteLugares(int diarias, int modelo) {
       //modelo = 1, significa modelo Chevrolet Spin
        if (modelo == 1){
            return diarias * 230;
        } 
        //modelo = 2, significa modelo fiat Doblo
        else if (modelo == 2){
            return diarias * 215;
        }   
        else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
            return 0;
        }     
     }

     public int calcularAluguelCarroCincoLugares(int diarias, int modelo) {
        //modelo = 1, significa modelo Fiesta Sedã
        if (modelo == 1){
            return diarias * 190;
        } 
        //modelo = 2, significa modelo fiat Siena
        else if(modelo == 2){
            return diarias * 170;
        }  
        else {
           JOptionPane.showMessageDialog(null, "Opção inválida");
            return 0;
        }       
     }

     public int calcularAluguelClientePremium(int diarias, int modelo) {
        if(modelo == 7){
            return diarias * 205; 
        }    
        else if(modelo == 5){
            return diarias * 150; 
        }    
        
        else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
            return 0;
        }        
     }


}
