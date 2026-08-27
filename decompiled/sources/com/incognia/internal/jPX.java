package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jPX {
    public static final ArrayList BGx(String str) {
        if (str.length() == 0) {
            return null;
        }
        List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSerializer) {
            String str2 = (String) obj;
            if (str2.length() > 0 && !str2.equals("null")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
