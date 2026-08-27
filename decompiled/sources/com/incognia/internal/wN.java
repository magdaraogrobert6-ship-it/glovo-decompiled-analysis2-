package com.incognia.internal;

import com.incognia.RequestTokenStatus;
import com.incognia.RequestTokenWithStatus;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class wN extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ long BGx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wN(long j) {
        super(0);
        this.BGx = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        RequestTokenWithStatus requestTokenWithStatusBGx = SAF.BGx("generateRequestTokenSync", this.BGx, true);
        if (requestTokenWithStatusBGx.getStatus() == RequestTokenStatus.SUCCESS) {
            return requestTokenWithStatusBGx.getToken();
        }
        return null;
    }
}
