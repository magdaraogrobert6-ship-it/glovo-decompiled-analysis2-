package com.deliveryhero.fwf_evaluator.util;

import o.onContentCardClicked;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonHashKt {
    public static final void arraycopy(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        onContentCardClicked.IconCompatParcelizer(iArr, i2, iArr2, i, i3 + i);
    }

    public static final Hash hash(byte[] bArr, HasherFactory hasherFactory) {
        bArr.getClass();
        hasherFactory.getClass();
        return hasherFactory.digest(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void arraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        onContentCardClicked.write(bArr, i2, bArr2, i, i3 + i);
    }
}
