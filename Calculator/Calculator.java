package Calculator;

public class Calculator implements Equations{

	private double toplam = 0;
	private int display_value;

	public Calculator() {}

	@Override
	public void toplama(int data) {
		if(toplam == 0) {
			toplam = data;
		}
		else {
			toplam += data;
		}
	}

	@Override
	public void carpma(int data) {
		if(toplam == 0) {
			toplam = data;
		}
		else {	
			toplam *= data;
		}
		
	}

	@Override
	public void cikarma(int data) {
		
		if(toplam == 0) {
			toplam = data;
		}
		else {
			toplam -= data;
		}
	}

	@Override
	public void bolme(int data) {
		if(toplam == 0) {
			toplam = data;
		}
		else {
			toplam /= data;
		}
	}
	
	

	public int getDisplay_value() {
		return display_value;
	}

	public void setDisplay_value(int display_value) {
		this.display_value = display_value;
	}

	public double getToplam() {
		return toplam;
	}

	@Override
	public void kokalma(int data) {
		if(toplam == 0) {
			toplam = data;
		}else {
			toplam += Math.sqrt(data);
		}
	}
	

	
	
	
	
	
}
