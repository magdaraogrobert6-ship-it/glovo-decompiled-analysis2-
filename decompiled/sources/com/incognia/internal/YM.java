package com.incognia.internal;

import android.content.Context;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.List;
import o.isItemDismissable;
import o.onItemDismiss;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class YM {
    public static final String BGx = (String) W4i.Vg.MediaSessionCompatResultReceiverWrapper();
    public static final List mbG = SQLite.read(new B9R(), new dpL(), new N0q(), new Tqc(), new AOq(), new HcQ(), new j89(), new N4c(), new qXV(), new oM1(), new AO());

    public static final void mbG(Context context) {
        List list = mbG;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Xeg) obj).mbG()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Xeg xeg = (Xeg) obj2;
            if (xeg.BGx() > BGx()) {
                try {
                    xeg.BGx(context);
                } catch (Throwable unused) {
                }
            }
        }
        Ay.N.BGx(BGx, 8);
    }

    public static void BGx(Context context) {
        if (8 > BGx()) {
            List list = mbG;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Xeg) obj).mbG()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                Xeg xeg = (Xeg) obj2;
                if (xeg.BGx() > BGx()) {
                    try {
                        xeg.BGx(context);
                    } catch (Throwable unused) {
                    }
                }
            }
            new UsU(U2.BGx, true).BGx(new Q$$ExternalSyntheticLambda4(context, 1));
        }
    }

    public static int BGx() {
        Object isitemdismissable;
        sSc ssc = Ay.N;
        String str = BGx;
        ssc.getClass();
        Object obj = null;
        try {
            String string = ssc.BGx.getString(ssc.HQ(str), null);
            if (string != null) {
                String strBGx = dDH.BGx(string);
                if (strBGx != null) {
                    string = strBGx;
                }
                isitemdismissable = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, string);
                if (isitemdismissable == null) {
                    ssc.BGx(str);
                }
                if (onItemDismiss.serializer(isitemdismissable) == null) {
                    obj = isitemdismissable;
                } else {
                    ssc.BGx(str);
                }
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
