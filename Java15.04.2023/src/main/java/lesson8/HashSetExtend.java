package lesson8;

import java.util.HashSet;
import java.util.Set;

public class HashSetExtend<E> extends HashSet<E> {
    public Set<E> union(Set<E> set) {
        Set<E> result = new HashSet<>(this);
        result.addAll(set);
        return result;
    }

    public Set<E> intersect(Set<E> set) {
        Set<E> res = new HashSet<>(this);
        res.retainAll(set);
        return res;
    }

    public static void main(String[] args) {
        HashSetExtend<Integer> hashSetExtend1 = new HashSetExtend<>();
        hashSetExtend1.add(4);
        hashSetExtend1.add(5);
        hashSetExtend1.add(6);
        HashSetExtend<Integer> hashSetExtend2 = new HashSetExtend<>();
        hashSetExtend2.add(5);
        hashSetExtend2.add(6);
        hashSetExtend2.add(7);

        Set<Integer> unionSet = hashSetExtend1.union(hashSetExtend2);
        System.out.println("Union" + unionSet);
        Set<Integer> intersectSet = hashSetExtend1.intersect(hashSetExtend2);
        System.out.println("Intersect" + intersectSet);

    }
}
