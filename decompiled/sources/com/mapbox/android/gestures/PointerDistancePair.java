package com.mapbox.android.gestures;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class PointerDistancePair extends Pair {
    public PointerDistancePair(Integer num, Integer num2) {
        super(num, num2);
    }

    @Override // android.util.Pair
    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerDistancePair)) {
            return false;
        }
        PointerDistancePair pointerDistancePair = (PointerDistancePair) obj;
        if (((Integer) ((Pair) this).first).equals(((Pair) pointerDistancePair).first) && ((Integer) ((Pair) this).second).equals(((Pair) pointerDistancePair).second)) {
            return true;
        }
        return ((Integer) ((Pair) this).first).equals(((Pair) pointerDistancePair).second) && ((Integer) ((Pair) this).second).equals(((Pair) pointerDistancePair).first);
    }
}
