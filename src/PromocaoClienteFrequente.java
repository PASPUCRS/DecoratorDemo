
public class PromocaoClienteFrequente implements CalculaMilhas {
    private CalculaMilhas cm;
    
    public PromocaoClienteFrequente(CalculaMilhas cm) {
    	this.cm = cm;
    }
    
	@Override
	public int calculaMilhas(int distancia) {
		int qtdade = cm.calculaMilhas(distancia);
		if (distancia > 2000) {
			qtdade += (int)(qtdade*1.1);
		}
		return qtdade;
	}

}
