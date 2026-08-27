package com.incognia.internal;

import java.util.Comparator;
import o.setNativeShader;

/* JADX INFO: loaded from: classes2.dex */
public final class qu implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return setNativeShader.RemoteActionCompatParcelizer(Long.valueOf(((dCe) obj).HQ), Long.valueOf(((dCe) obj2).HQ));
    }
}
