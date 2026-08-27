package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.net.BindException;
import java.net.ServerSocket;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class FJn implements PG {
    public final UsU BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final Ups mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, FJn fJn) {
        Object isitemdismissable;
        boolean z;
        try {
            synchronized (fJn.mbG) {
                try {
                    new ServerSocket(27042).close();
                } catch (BindException unused) {
                    z = false;
                }
            }
            z = true;
            boolean z2 = !z;
            isitemdismissable = new JWV((String) fJn.HQ.MediaSessionCompatResultReceiverWrapper(), Boolean.valueOf(z2), new HBR(new wzY(z2)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(isitemdismissable));
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public FJn(UsU usU, Ups ups) {
        this.BGx = usU;
        this.mbG = ups;
        Object[] objArr = {bCy.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.BGx.BGx(new Dd$$ExternalSyntheticLambda0(ltx, 3, this));
    }
}
