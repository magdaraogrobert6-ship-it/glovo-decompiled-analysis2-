package com.incognia.internal;

import java.util.Comparator;
import java.util.Map;
import o.setNativeShader;

/* JADX INFO: loaded from: classes2.dex */
public final class T5 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return setNativeShader.RemoteActionCompatParcelizer((Long) ((Map.Entry) obj2).getValue(), (Long) ((Map.Entry) obj).getValue());
    }
}
