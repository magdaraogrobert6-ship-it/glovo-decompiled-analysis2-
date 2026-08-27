package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class cvy implements PG {
    public final sjz BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        ArrayList arrayListBGx;
        ArrayList arrayListBGx2;
        ArrayList arrayListBGx3;
        ArrayList arrayListBGx4;
        String networkOperator;
        Integer numValueOf;
        try {
            sjz sjzVar = this.BGx;
            sjzVar.getClass();
            try {
                String simOperatorName = sjzVar.hs.getSimOperatorName();
                arrayListBGx = simOperatorName != null ? jPX.BGx(simOperatorName) : null;
            } catch (Throwable th) {
                sjzVar.mbG.BGx(th, false);
            }
            sjz sjzVar2 = this.BGx;
            sjzVar2.getClass();
            try {
                String networkOperatorName = sjzVar2.hs.getNetworkOperatorName();
                arrayListBGx2 = networkOperatorName != null ? jPX.BGx(networkOperatorName) : null;
            } catch (Throwable th2) {
                sjzVar2.mbG.BGx(th2, false);
            }
            sjz sjzVar3 = this.BGx;
            sjzVar3.getClass();
            try {
                String simCountryIso = sjzVar3.hs.getSimCountryIso();
                arrayListBGx3 = simCountryIso != null ? jPX.BGx(simCountryIso) : null;
            } catch (Throwable th3) {
                sjzVar3.mbG.BGx(th3, false);
            }
            sjz sjzVar4 = this.BGx;
            sjzVar4.getClass();
            try {
                String networkCountryIso = sjzVar4.hs.getNetworkCountryIso();
                arrayListBGx4 = networkCountryIso != null ? jPX.BGx(networkCountryIso) : null;
            } catch (Throwable th4) {
                sjzVar4.mbG.BGx(th4, false);
            }
            sjz sjzVar5 = this.BGx;
            sjzVar5.getClass();
            try {
                networkOperator = sjzVar5.hs.getNetworkOperator();
            } catch (Throwable th5) {
                sjzVar5.mbG.BGx(th5, false);
                networkOperator = null;
            }
            sjz sjzVar6 = this.BGx;
            sjzVar6.getClass();
            try {
                numValueOf = Integer.valueOf(sjzVar6.hs.getPhoneType());
            } catch (Throwable th6) {
                sjzVar6.mbG.BGx(th6, false);
                numValueOf = null;
            }
            isitemdismissable = new Vd3((String) W4i.Op.MediaSessionCompatResultReceiverWrapper(), new p2k(arrayListBGx, arrayListBGx2, arrayListBGx3, arrayListBGx4, networkOperator, numValueOf, this.BGx.x()));
        } catch (Throwable th7) {
            isitemdismissable = new isItemDismissable(th7);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public cvy(sjz sjzVar) {
        this.BGx = sjzVar;
        Object[] objArr = {e9g.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
