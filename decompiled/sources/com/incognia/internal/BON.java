package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class BON extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ C2w BGx;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return Boolean.valueOf(((Boolean) this.BGx.x.hs.MediaSessionCompatResultReceiverWrapper()).booleanValue() && ((JSONObject) this.BGx.mbG.BGx.get()).optBoolean(C2w.e, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BON(C2w c2w) {
        super(0);
        this.BGx = c2w;
    }
}
