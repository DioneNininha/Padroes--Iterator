package iterator;

import java.util.Iterator;
import java.util.Random;

/**
 * 
 * @author Dione
 *
 */
public class SomMp3 implements Iterable<Integer> {

	private Integer[] faixas;

	public void buscaAcessivelFaixas() {

		this.faixas = new Integer[10];
		Random aleatorio = new Random();

		int faixasCount = 0;

		for (int y = 0 ; y < faixas.length; y++) {

			if (aleatorio.nextInt(2) == 1) {

				faixas[faixasCount++] = y;
			}
		}
		System.out.println(String.format("Executar mais que uma vez!\nEncontradas %d faixas aleatórias", faixasCount));
	}

	public Iterator<Integer> iterator() {

		return new ProximoIterator(faixas);
	}
}