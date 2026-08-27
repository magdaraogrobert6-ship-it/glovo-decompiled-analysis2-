package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class JI3 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ boolean BGx;
    public final /* synthetic */ bV mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JI3(bV bVVar, boolean z) {
        super(1);
        this.BGx = z;
        this.mbG = bVVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean z;
        Gbn gbn = (Gbn) obj;
        if (this.BGx) {
            PAZ paz = this.mbG.hIl;
            Gbn gbnQ = bV.q();
            if (gbnQ != null && gbn != null && gbnQ.x == gbn.x && gbnQ.BGx == gbn.BGx && gbnQ.mbG == gbn.mbG && gbnQ.HQ == gbn.HQ && gbnQ.N == gbn.N) {
                Object[] objArr = {gbnQ.S, gbn.S};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
