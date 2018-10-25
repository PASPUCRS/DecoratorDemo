
public class PromocaoVerao implements CalculaMilhas {
    private CalculaMilhas cm;
    
    public PromocaoVerao(CalculaMilhas cm) {
    	this.cm = cm;
    }
    
	@Override
	public int calculaMilhas(int distancia) {
		return cm.calculaMilhas(distancia)+(2*distancia);
	}
}
