package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.io.File;
import kotlin.LazyKt__LazyJVMKt;
import o.ensureSubscribedToInAppMessageEvents;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;

/* JADX INFO: loaded from: classes2.dex */
public final class ghT implements PG {
    public final onViewDetachedFromWindowlambda1 BGx;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        Object isitemdismissable2;
        try {
            try {
                isitemdismissable2 = r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(new File((String) W4i.Z3.MediaSessionCompatResultReceiverWrapper()), ensureSubscribedToInAppMessageEvents.write);
            } catch (Throwable th) {
                isitemdismissable2 = new isItemDismissable(th);
            }
            if (isitemdismissable2 instanceof isItemDismissable) {
                isitemdismissable2 = null;
            }
            String str = (String) isitemdismissable2;
            isitemdismissable = new JWV((String) this.BGx.MediaSessionCompatResultReceiverWrapper(), str, new bMs(new Ap7(str)));
        } catch (Throwable th2) {
            isitemdismissable = new isItemDismissable(th2);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.BGx.MediaSessionCompatResultReceiverWrapper();
    }

    public ghT(fhq fhqVar) {
        Object[] objArr = {MFe.BGx};
        this.BGx = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
