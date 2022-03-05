package Enums;

public enum Focinho {
	BRAQUICEFALICOS("braquicefalico"), 
	MESOCEFALICOS("mesocefalico"), 
	DOLICOCEFALICOS("dolicocefalico");
	
	private String focinho;

	Focinho(String focinho) {
		this.focinho = focinho;
	}

	public String getFocinho() {
		return focinho;
	}
}
