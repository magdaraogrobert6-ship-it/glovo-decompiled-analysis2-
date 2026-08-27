package com.sentiance.core.model.events;

import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.Map;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class R0$b {
    public Map read;

    public static boolean isLaneLeftward(String str, String str2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "uturn"}, iWrite3)).booleanValue()) {
            int iWrite4 = getCieXyz.write();
            int iWrite5 = getCieXyz.write();
            int iWrite6 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str2, "right"}, iWrite6)).booleanValue();
        }
        return hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "left", false);
    }

    public static void prependOpposite(String str, ArrayList arrayList, boolean z) {
        boolean zIconCompatParcelizer;
        int i = 0;
        if (z) {
            for (Object obj : arrayList) {
                if (i >= 0) {
                    String str2 = (String) obj;
                    if (isLaneLeftward(str2, str)) {
                        arrayList.set(i, "opposite " + str2);
                    }
                    i++;
                } else {
                    SQLite.serializer();
                    throw null;
                }
            }
            return;
        }
        if (z) {
            return;
        }
        int i2 = 0;
        for (Object obj2 : arrayList) {
            if (i2 >= 0) {
                String str3 = (String) obj2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "uturn"}, getCieXyz.write())).booleanValue()) {
                    zIconCompatParcelizer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "left"}, getCieXyz.write())).booleanValue();
                } else {
                    zIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str3, (CharSequence) "right", false);
                }
                if (zIconCompatParcelizer) {
                    arrayList.set(i2, "opposite " + str3);
                }
                i2++;
            } else {
                SQLite.serializer();
                throw null;
            }
        }
    }
}
