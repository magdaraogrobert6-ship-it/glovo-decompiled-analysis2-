package com.incognia.internal;

import android.location.Location;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.security.SecureRandom;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class UrX implements PG {
    public final SecureRandom BGx;
    public final C HQ;
    public final E7V N;
    public final BvF mbG;
    public final onViewDetachedFromWindowlambda1 x;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        Boolean boolValueOf;
        try {
            String str = (String) this.x.MediaSessionCompatResultReceiverWrapper();
            boolean zHQ = HQ();
            try {
                boolean z = false;
                if (!this.HQ.BGx()) {
                    try {
                        this.mbG.mbG();
                        z = true;
                        this.mbG.q();
                    } catch (SecurityException unused) {
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            } catch (Throwable unused2) {
                boolValueOf = null;
            }
            isitemdismissable = new CoN(str, new dvP(Boolean.valueOf(zHQ), boolValueOf));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.x.MediaSessionCompatResultReceiverWrapper();
    }

    public UrX(SecureRandom secureRandom, BvF bvF, C c, E7V e7v) {
        this.BGx = secureRandom;
        this.mbG = bvF;
        this.HQ = c;
        this.N = e7v;
        Object[] objArr = {LQG.BGx};
        this.x = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    public final boolean HQ() {
        Location location = new Location("");
        double dNextDouble = this.BGx.nextDouble();
        double dNextDouble2 = this.BGx.nextDouble();
        location.setLatitude(dNextDouble);
        location.setLongitude(dNextDouble2);
        if (XUh.BGx(XUh.BGx, 31, 0, 2)) {
            location.setMock(true);
            this.N.getClass();
            if (!location.isMock()) {
                return true;
            }
        }
        return (location.getLatitude() == dNextDouble && location.getLongitude() == dNextDouble2) ? false : true;
    }
}
