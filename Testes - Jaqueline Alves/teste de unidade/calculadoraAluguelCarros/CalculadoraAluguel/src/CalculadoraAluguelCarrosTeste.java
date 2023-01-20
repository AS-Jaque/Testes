import static org.junit.Assert.assertEquals;
import javax.swing.JOptionPane;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraAluguelCarrosTeste {

    private static CalculadoraAluguelCarros calculadoraAluguel;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    calculadoraAluguel = new CalculadoraAluguelCarros ();
    }

     @Test
    public void testeListarCarrosEvalores() {
        //Arrange
        String resultadoEsperado = "Fiat Doblo 7 lugares, diaria: 215.00 || Chevrolet Spin 7 lugares, diaria: 230.00 || Fiesta Sedã 5 lugares, diaria: 190.00 || Fiat Siena 5 lugares, diaria: 170.00";

        //Act
        JOptionPane.showMessageDialog(null,"Listar os carros e valores das diárias");
        String resultado = calculadoraAluguel.listarCarrosEvalores();
        JOptionPane.showMessageDialog(null, resultado);
        
         //Assert
        assertEquals(resultadoEsperado, resultado);
    }

     @Test
    public void testCalcularAluguelCarroSeteLugares() {
       //Arrange
       int resultadoEsperado = 1075; //para opçao de modelo 2 fiat Doblo e 5 diárias -> 5 x 215,00 = 1075

       //Act
       JOptionPane.showMessageDialog(null,"Calculo para carro de 7 lugares");
       int modelo = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE:\n1 - para modelo Chevrolet Spin\n2 - para modelo fiat Doblo"));
       int diarias = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE A QUANTIDADE DE DIÁRIAS:"));
       int resultado = calculadoraAluguel.calcularAluguelCarroSeteLugares(diarias, modelo);
       JOptionPane.showMessageDialog(null, "valor:"+resultado);
       
        //Assert
       assertEquals(resultadoEsperado, resultado);

    } 

    @Test
    public void testCalcularAluguelCarroCincoLugares() {
       //Arrange
       int resultadoEsperado = 1330; //para opçao de modelo 1 Fiesta Sedã e 7 diárias -> 7 x 190,00 = 1330

       //Act
       JOptionPane.showMessageDialog(null,"Calculo para carro de 5 lugares");
       int modelo = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE:\n1 - para modelo Fiesta Sedã\n2 - para modelo fiat Siena"));
       int diarias = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE A QUANTIDADE DE DIÁRIAS:"));
       int resultado = calculadoraAluguel.calcularAluguelCarroCincoLugares(diarias, modelo);
       JOptionPane.showMessageDialog(null, "valor:"+resultado);
       
        //Assert
       assertEquals(resultadoEsperado, resultado);

    } 

    @Test
    public void testCalcularAluguelClientePremium() {
       //Arrange
       int resultadoEsperado = 300; //para opçao de carros com 5 lugares e 2 diaárias -> 2 x 150,00 = 300,00

       //Act
       JOptionPane.showMessageDialog(null,"Calculo para cliente premium");
       int modelo = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE:\n7 - para carros com sete lugares\n5 - para carros com cinco lugares"));
       int diarias = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE A QUANTIDADE DE DIÁRIAS:"));
       int resultado = calculadoraAluguel.calcularAluguelClientePremium(diarias, modelo);
       JOptionPane.showMessageDialog(null, "valor:"+resultado);
       
        //Assert
       assertEquals(resultadoEsperado, resultado);

    } 
    
}
