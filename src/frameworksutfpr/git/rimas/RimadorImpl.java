package frameworksutfpr.git.rimas;

public class RimadorImpl extends Rimador {
	
	public RimadorImpl(String verso) {
		setVerso(verso);
	}

	@Override
	public void versejar() {
		System.out.println(getVerso());
	}
}