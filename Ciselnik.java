tu sa mazalo
	public Ciselnik(GroupView skupina, int positionX, int positionY, int hodnota, String jednotka) {
		this.jednotka = jednotka;
		text = new TextView(skupina, vytvorZobrazovanyText(hodnota), positionX, positionY);
	}
	
	public void nastavHodnotu(int hodnota) {
		text.setText(vytvorZobrazovanyText(hodnota));
	}
	
	private String vytvorZobrazovanyText(int hodnota) {
		return hodnota + " " + jednotka;
	}
}
