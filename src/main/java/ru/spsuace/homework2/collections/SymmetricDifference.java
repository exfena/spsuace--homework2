package ru.spsuace.homework2.collections;

import java.util.Set;
import java.util.HashSet;


/**
 * Реализуйте симметричную разность двух множеств: https://ru.wikipedia.org/wiki/Симметрическая_разность
 * Исходные множества модифицировать нельзя.
 * Пример: {1, 2, 3} и {0, 1, 2} -> {0, 3}.
 *
 */
public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> SetA = new HashSet<T>(set1);
        Set<T> SetB = new HashSet<T>(set2);
        SetA.removeAll(set2);
        SetB.removeAll(set1);
        SetA.addAll(SetB);
        return SetA;
    }
}
