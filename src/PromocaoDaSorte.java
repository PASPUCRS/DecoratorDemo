import java.util.Random;

public class PromocaoDaSorte implements CalculaMilhas {
    private CalculaMilhas cm;
    
    public PromocaoDaSorte(CalculaMilhas cm) {
    	this.cm = cm;
    }
    
	@Override
	public int calculaMilhas(int distancia) {
        Random r = new Random(System.currentTimeMillis());
        int percent = r.nextInt(60)+10;
        double taxa = percent/100.0;
		return cm.calculaMilhas(distancia) + (int)(distancia*taxa);
	}

}
