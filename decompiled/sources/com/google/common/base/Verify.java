package com.google.common.base;

import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Verify {
    public static void IconCompatParcelizer(String str, Object obj, boolean z) {
        if (z) {
            return;
        }
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        throw new VerifyException((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, iWrite2, -1556036116, iWrite, new Object[]{str, new Object[]{obj}}, iWrite3), 0);
    }
}
