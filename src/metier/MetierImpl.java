package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	// Couplage faible
    private IDao dao;
    
    
	public MetierImpl(IDao dao) {
		super();
		this.dao = dao;
	}


	@Override
	public double calcul() {
		double temp=dao.getData();
		double res=temp*Math.cos(temp*3.14)*500;
		return res;
	}
	
	

}
