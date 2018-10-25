
public class App {
	public static void main(String args[]) {
	    ClienteCiaAerea c = new ClienteCiaAerea(1010,"Zezinho");
	    System.out.println(c.milhasAcumuladas(5000));

	    c.setCalculoMilhas(new PromocaoClienteFrequente(c.getCalculoMilhas()));
	    System.out.println(c.milhasAcumuladas(5000));

	    c.setCalculoMilhas(new PromocaoVerao(c.getCalculoMilhas()));
	    System.out.println(c.milhasAcumuladas(5000));

	    c.setCalculoMilhas(new PromocaoDaSorte(c.getCalculoMilhas()));
	    System.out.println(c.milhasAcumuladas(5000));
	}    
}
