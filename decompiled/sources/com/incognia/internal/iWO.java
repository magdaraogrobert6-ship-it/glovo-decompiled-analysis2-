package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.ContentCardsDividerItemDecoration;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.resetAfterInAppMessageCloselambda2;
import o.resumeWebviewIfNecessarylambda0;
import o.verifyOrientationStatuslambda3;

/* JADX INFO: loaded from: classes2.dex */
public final class iWO implements PG {
    public final onViewDetachedFromWindowlambda1 BGx;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        List list;
        try {
            String str = (String) this.BGx.MediaSessionCompatResultReceiverWrapper();
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0Serializer = resetAfterInAppMessageCloselambda2.serializer(new ContentCardsDividerItemDecoration(networkInterfaces));
                    C7T c7t = C7T.BGx;
                    c7t.getClass();
                    list = resetAfterInAppMessageCloselambda2.read(new verifyOrientationStatuslambda3(resumewebviewifnecessarylambda0Serializer, c7t));
                } else {
                    list = null;
                }
            } catch (Throwable unused) {
            }
            isitemdismissable = new vGX(str, list);
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.BGx.MediaSessionCompatResultReceiverWrapper();
    }

    public iWO(HUn hUn) {
        Object[] objArr = {Xp.BGx};
        this.BGx = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
