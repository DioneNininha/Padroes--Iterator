package iterator;

public class ControleIterator {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		SomMp3 mp3 = new SomMp3();

		mp3.buscaAcessivelFaixas();

		for (Integer faixa : mp3) {

			System.out.println(String.format("Troca aleatória de faixa de mp3 #%d", faixa));
		}
	}
}
