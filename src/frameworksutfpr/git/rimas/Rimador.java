package frameworksutfpr.git.rimas;

public abstract class Rimador {
	private String verso;
	
	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public abstract void versejar();
}
