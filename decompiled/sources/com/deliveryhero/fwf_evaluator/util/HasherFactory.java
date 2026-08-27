package com.deliveryhero.fwf_evaluator.util;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public class HasherFactory {
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 create;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getCreate() {
        return this.create;
    }

    public HasherFactory(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        this.create = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final Hash digest(byte[] bArr) {
        bArr.getClass();
        Hasher hasher = (Hasher) this.create.invoke();
        hasher.update(bArr, 0, bArr.length);
        return hasher.digest();
    }
}
