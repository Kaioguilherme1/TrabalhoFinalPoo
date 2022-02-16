package Enums;

public enum CorDoPelo {
	PRETO("preto"),
	CINZA("cinza");
	
	private String cor_pelo;

	CorDoPelo(String cor_pelo) {
		this.cor_pelo = cor_pelo;
	}
	
	public String getCor_pelo() {
		return cor_pelo;
	}

}
