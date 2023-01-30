package hh.sof3as3.autoprojekti.domain;

public class Auto {
	
	// attribuutit
	
	private String automalli;
	private Integer valmistusvuosi;
	
	// konstruktorit
	
	
	
	public Auto(String automalli, Integer valmistusvuosi) {
		super();
		this.automalli = automalli;
		this.valmistusvuosi = valmistusvuosi;
	}

	public Auto() {
		super();
		this.automalli = null;
		this.valmistusvuosi = null;
	}


	// setterit
	
	public void setAutomalli(String automalli) {
		this.automalli = automalli;
	}

	public void setValmistusvuosi(Integer valmistusvuosi) {
		this.valmistusvuosi = valmistusvuosi;
	}
	
	// getterit

	public String getAutomalli() {
		return automalli;
	}

	public Integer getValmistusvuosi() {
		return valmistusvuosi;
	}
	
	// toString

	@Override
	public String toString() {
		return "automalli=" + automalli + ", valmistusvuosi=" + valmistusvuosi;
	}
	
	
	
	

}
