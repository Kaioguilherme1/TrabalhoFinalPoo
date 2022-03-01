package Enums;

public enum Pelo {
	LONGO("longo"),
	CURTO("curto"),
	MEDIO("medio");
	
	private String pelo;
	
	Pelo(String pelo) {
		this.pelo = pelo;
	}

	public String getPelo() {
		return pelo;
	}	
}
