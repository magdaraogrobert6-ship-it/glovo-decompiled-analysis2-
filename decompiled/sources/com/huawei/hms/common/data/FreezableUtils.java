package com.huawei.hms.common.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o.r8lambdaPRM2tcY0gMp3x1zosH4ODWDaM;

/* JADX INFO: loaded from: classes4.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        r8lambdaPRM2tcY0gMp3x1zosH4ODWDaM r8lambdaprm2tcy0gmp3x1zosh4odwdam = (ArrayList<T>) new ArrayList();
        if (iterable != null) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                r8lambdaprm2tcy0gmp3x1zosh4odwdam.add(it.next().freeze());
            }
        }
        return r8lambdaprm2tcy0gmp3x1zosh4odwdam;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        return freezeIterable(Arrays.asList(eArr));
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        return freezeIterable(arrayList);
    }
}
