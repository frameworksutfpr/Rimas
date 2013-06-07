package frameworksutfpr.git.rimas;

public class RimadorDecorator extends Rimador {
	private Rimador rimador;

	public RimadorDecorator(Rimador rimador, String verso){
		this.rimador = rimador;
		setVerso(verso);
	}

	@Override
	public void versejar() {
		this.rimador.versejar();
		System.out.println(getVerso());
	}
}
