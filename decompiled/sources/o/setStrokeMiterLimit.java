package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class setStrokeMiterLimit extends setStrokeCapBeK7IIE {
    @Override // o.setStrokeCapBeK7IIE
    public final Object write(setStrokeWidth setstrokewidth) {
        return this.read.get(setstrokewidth);
    }

    public setStrokeMiterLimit(setStrokeCapBeK7IIE setstrokecapbek7iie) {
        setstrokecapbek7iie.getClass();
        LinkedHashMap linkedHashMap = setstrokecapbek7iie.read;
        linkedHashMap.getClass();
        this.read.putAll(linkedHashMap);
    }

    public /* synthetic */ setStrokeMiterLimit(int i) {
        this(setPathEffect.IconCompatParcelizer);
    }
}
