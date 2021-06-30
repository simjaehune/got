package hwanjan;

public class hwanjanpro {
	hwanjandata data = new hwanjandata();

	public void exc(double korWon, double exchange, double resultex, 
			int businessType, int resultexInt, int returnWon) {
		// TODO Auto-generated method stub
		
		data.korWon = korWon;
		data.exchange = exchange;
		data.resultex = resultex;
		data.businessType = businessType;
		data.resultexInt = resultexInt;
		data.returnWon = returnWon;
		
		
		data.resultex = data.korWon / data.exchange;
		data.resultexInt = (int) data.resultex;
		data.returnWon = (int)((data.resultex - data.resultexInt) * data.exchange) ;
		data.returnWon = data.returnWon / 10*10;
		
	}

}
