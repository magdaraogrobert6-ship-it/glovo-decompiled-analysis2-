package com.incognia.internal;

import java.util.Comparator;
import o.setNativeShader;

/* JADX INFO: loaded from: classes2.dex */
public final class OH implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return setNativeShader.RemoteActionCompatParcelizer(Long.valueOf(((X1) obj2).HQ), Long.valueOf(((X1) obj).HQ));
    }
}
