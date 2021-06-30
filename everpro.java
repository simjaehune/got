package myever;

public class everpro {
	
	public static void age() {
		everdata data = new everdata();
		
		if (data.user_id >= 20) {
			data.result = data.adult_price;
			data.human = data.adl;
			} else {
			data.result = data.kid_price;
			data.human = data.kid;
			}
	}
	public static void woo() {
		// TODO Auto-generated method stub
		everdata data = new everdata();
		
		if(data.discount == 1) {
			data.result = (int) ((data.result * data.ea) * 1);
			data.woodea = "정상가";
			} else if(data.discount == 2) {
			data.result = (int) ((data.result * data.ea) * 0.8);
			data.woodea = "장애인 우대";
		    } else if(data.discount == 3) {
		    data.result = (int) ((data.result * data.ea) * 0.8);
		    data.woodea = "국가유공자 우대";
		    } else if(data.discount == 4) {
			data.result = (int) ((data.result * data.ea) * 0.8);
			data.woodea = "다자녀우대";
			} else {
			data.result = (int) ((data.result * data.ea) * 0.8);
			data.woodea = "임산부 우대";
			}
		
	}
	public static void arrpro() {
		// TODO Auto-generated method stub
		everdata data = new everdata();
		
		data.arr.savedate.add(data.date);
		data.arr.savehuman.add(data.human);
		data.arr.saveea.add(data.ea);
		data.arr.saveresult.add(data.result);
		data.arr.savewoodea.add(data.woodea);
	}
}
