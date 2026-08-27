package com.incognia.internal;

import android.location.Location;
import o.isItemDismissable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class F5b {
    public final NvL BGx;

    public F5b(E7V e7v, NvL nvL) {
        this.BGx = nvL;
    }

    public final rwU BGx(Location location) {
        Object isitemdismissable;
        String str;
        Object isitemdismissable2;
        Integer num = null;
        if (location == null) {
            return null;
        }
        if (((JSONObject) this.BGx.BGx.get()).optBoolean((String) W4i.OYD.MediaSessionCompatResultReceiverWrapper(), true)) {
            try {
                isitemdismissable = location.toString();
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            boolean z = isitemdismissable instanceof isItemDismissable;
            Object obj = isitemdismissable;
            if (z) {
                obj = null;
            }
            str = (String) obj;
        } else {
            str = null;
        }
        if (((JSONObject) this.BGx.BGx.get()).optBoolean((String) W4i.qdY.MediaSessionCompatResultReceiverWrapper(), true)) {
            try {
                isitemdismissable2 = E7V.BGx(location);
            } catch (Throwable th2) {
                isitemdismissable2 = new isItemDismissable(th2);
            }
            num = (Integer) (isitemdismissable2 instanceof isItemDismissable ? null : isitemdismissable2);
        }
        return new rwU(str, num);
    }
}
