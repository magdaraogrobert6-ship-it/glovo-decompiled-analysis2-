package com.incognia.internal;

import com.huawei.hms.support.api.location.common.LocationConstant;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class MuL implements PG {
    public final YZr BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final ovj N;
    public final iLf mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x000e, B:9:0x001c, B:10:0x0024, B:12:0x002a, B:14:0x0036, B:15:0x0039, B:17:0x003d, B:20:0x0061, B:24:0x006e, B:29:0x0081, B:31:0x0086, B:33:0x008b, B:34:0x008e, B:23:0x0069), top: B:40:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x000e, B:9:0x001c, B:10:0x0024, B:12:0x002a, B:14:0x0036, B:15:0x0039, B:17:0x003d, B:20:0x0061, B:24:0x006e, B:29:0x0081, B:31:0x0086, B:33:0x008b, B:34:0x008e, B:23:0x0069), top: B:40:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x000e, B:9:0x001c, B:10:0x0024, B:12:0x002a, B:14:0x0036, B:15:0x0039, B:17:0x003d, B:20:0x0061, B:24:0x006e, B:29:0x0081, B:31:0x0086, B:33:0x008b, B:34:0x008e, B:23:0x0069), top: B:40:0x0002 }] */
    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        long j;
        boolean zContains;
        boolean zBGx;
        long j2;
        try {
            dCe dceMbG = this.BGx.mbG();
            List list = dceMbG != null ? dceMbG.VV3 : null;
            this.N.getClass();
            boolean z = false;
            if (list != null) {
                Iterator it = ovj.BGx.iterator();
                j = 0;
                int i = 0;
                while (it.hasNext()) {
                    if (list.contains((String) it.next())) {
                        j |= 1 << i;
                    }
                    i++;
                }
            } else {
                j = 0;
            }
            ovj ovjVar = this.N;
            boolean zBGx2 = this.mbG.BGx("android.permission.ACCESS_FINE_LOCATION");
            boolean zBGx3 = this.mbG.BGx("android.permission.ACCESS_COARSE_LOCATION");
            iLf ilf = this.mbG;
            ilf.getClass();
            if (!XUh.BGx(XUh.BGx, 29, 0, 2)) {
                if (list != null) {
                    zContains = list.contains(LocationConstant.BACKGROUND_PERMISSION);
                }
                zBGx = this.mbG.BGx("android.permission.READ_PHONE_STATE");
                ovjVar.getClass();
                if (zBGx2) {
                    j2 = 1;
                } else {
                    j2 = 0;
                }
                if (zBGx3) {
                    j2 |= 2;
                }
                if (z) {
                    j2 |= 4;
                }
                if (zBGx) {
                    j2 |= 8;
                }
                isitemdismissable = new mbl((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), new MQs(j, j2));
                Bq.BGx(isitemdismissable, ltx);
            }
            zContains = ilf.BGx(LocationConstant.BACKGROUND_PERMISSION);
            z = zContains;
            zBGx = this.mbG.BGx("android.permission.READ_PHONE_STATE");
            ovjVar.getClass();
            if (zBGx2) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            if (zBGx3) {
                j2 |= 2;
            }
            if (z) {
                j2 |= 4;
            }
            if (zBGx) {
                j2 |= 8;
            }
            isitemdismissable = new mbl((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), new MQs(j, j2));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public MuL(YZr yZr, iLf ilf) {
        this.BGx = yZr;
        this.mbG = ilf;
        Object[] objArr = {Jsl.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        this.N = new ovj();
    }
}
