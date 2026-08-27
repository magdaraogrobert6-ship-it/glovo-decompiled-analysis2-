package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class Pxg implements PG {
    public final UsU BGx;
    public final AtomicReference HQ;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public static final void BGx(Pxg pxg, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new JWV((String) pxg.mbG.MediaSessionCompatResultReceiverWrapper(), (String) pxg.HQ.get(), new bMs(new u((String) pxg.HQ.get())))));
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public Pxg(UsU usU) {
        this.BGx = usU;
        Object[] objArr = {hij.BGx};
        isAdapterPositionOnScreen isadapterpositiononscreen = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        this.mbG = isadapterpositiononscreen;
        this.HQ = new AtomicReference(Ay.N.mbG((String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()));
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.BGx.BGx(new Dd$$ExternalSyntheticLambda0(this, 9, ltx));
    }

    public final void BGx(String str) {
        this.BGx.BGx(new N6$$ExternalSyntheticLambda0(this, 8, str));
    }

    public static final void BGx(Pxg pxg, String str) {
        pxg.HQ.set(str);
        Ay.N.BGx((String) pxg.mbG.MediaSessionCompatResultReceiverWrapper(), str);
    }
}
