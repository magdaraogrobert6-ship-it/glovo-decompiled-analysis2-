package com.incognia.internal;

import android.net.DhcpInfo;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class SZ implements PG {
    public final yI3 BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final UsU mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SZ sz) {
        Object isitemdismissable;
        Qa qa;
        try {
            String str = (String) sz.HQ.MediaSessionCompatResultReceiverWrapper();
            yI3 yi3 = sz.BGx;
            yi3.getClass();
            try {
                MD md = yi3.S;
                DhcpInfo dhcpInfo = yi3.A1.getDhcpInfo();
                md.getClass();
                qa = new Qa(Integer.valueOf(dhcpInfo.ipAddress), Integer.valueOf(dhcpInfo.gateway), Integer.valueOf(dhcpInfo.netmask), Integer.valueOf(dhcpInfo.dns1), Integer.valueOf(dhcpInfo.dns2), Integer.valueOf(dhcpInfo.serverAddress));
            } catch (Throwable unused) {
                qa = null;
            }
            isitemdismissable = new qin(str, qa);
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(isitemdismissable));
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public SZ(yI3 yi3, UsU usU) {
        this.BGx = yi3;
        this.mbG = usU;
        Object[] objArr = {KY.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.mbG.BGx(new N6$$ExternalSyntheticLambda0(ltx, 10, this));
    }
}
