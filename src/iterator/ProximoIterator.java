package iterator;

import java.util.Iterator;

/**
 * 
 * @author Dione
 *
 */
public class ProximoIterator implements Iterator<Integer> {

	private Integer[] faixas;
	private int indice;

	public ProximoIterator(Integer[] faixas) {

		this.faixas = faixas;
		this.indice = 0;
	}

	@Override
	public boolean hasNext() {

		if (faixas == null)
			return false;

		return faixas[indice] != null;
	}

	@Override
	public Integer next() {

		return faixas[indice++];
	}
}
