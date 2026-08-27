package com.incognia.internal;

import java.util.Comparator;
import o.setNativeShader;

/* JADX INFO: loaded from: classes2.dex */
public final class Y4 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return setNativeShader.RemoteActionCompatParcelizer(((qVf) obj).mbG, ((qVf) obj2).mbG);
    }
}
