package com.incognia.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o.isItemDismissable;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes2.dex */
public final class sSc {
    public final SharedPreferences BGx;

    public final String HQ(String str) {
        String strBGx = wiU.BGx(str);
        return strBGx == null ? str : strBGx;
    }

    public final String mbG(String str) {
        Object obj;
        Object isitemdismissable;
        Object obj2 = null;
        obj2 = null;
        try {
            String string = this.BGx.getString(HQ(str), null);
            if (string != null) {
                String strBGx = dDH.BGx(string);
                if (strBGx != null) {
                    isitemdismissable = strBGx;
                    obj = string;
                    obj = isitemdismissable;
                }
                isitemdismissable = strBGx;
                obj = string;
                if (onItemDismiss.serializer(obj) == null) {
                    obj2 = obj;
                } else {
                    BGx(str);
                }
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        return (String) obj2;
    }

    public final void BGx(Set set) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(HQ((String) it.next()));
            }
            Set<String> setKeySet = this.BGx.getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (!linkedHashSet.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            SharedPreferences.Editor editorEdit = this.BGx.edit();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                editorEdit.remove((String) obj2);
            }
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public sSc(Context context, String str, CeJ ceJ) {
        this.BGx = context.getSharedPreferences(str, 0);
    }

    public final void BGx(String str) {
        try {
            SharedPreferences.Editor editorEdit = this.BGx.edit();
            editorEdit.remove(HQ(str));
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public final void BGx() {
        try {
            SharedPreferences.Editor editorEdit = this.BGx.edit();
            editorEdit.clear();
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public final void BGx(String str, Object obj) {
        try {
            String strHQ = HQ(str);
            String string = obj != null ? obj.toString() : null;
            String strMbG = string != null ? dDH.mbG(string) : null;
            if (strMbG != null) {
                string = strMbG;
            }
            SharedPreferences.Editor editorEdit = this.BGx.edit();
            if (string == null) {
                editorEdit.remove(strHQ);
            } else {
                editorEdit.putString(strHQ, string);
            }
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }
}
