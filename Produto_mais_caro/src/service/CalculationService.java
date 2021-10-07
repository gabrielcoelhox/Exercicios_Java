package service;

import java.util.List;

public class CalculationService<T> {

	public static<T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty"); // prog defensiva caso ocorra erro
		}
		T max = list.get(0);                   // Pega o primeiro item da lista
		for (T item : list) {                  // Cada item da lista comparar com o máximo
			if (item.compareTo(max) > 0) {     // Se for maior do que 0 atualiza o máximo
				max = item;
			}
		}
		return max;                            // Retorna o máximo atualizado
	}
}
