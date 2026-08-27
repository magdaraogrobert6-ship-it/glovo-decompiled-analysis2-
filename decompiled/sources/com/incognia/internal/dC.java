package com.incognia.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dC {
    public final CA BGx;
    public final Pu0 mbG;

    public dC(CA ca, Pu0 pu0) {
        this.BGx = ca;
        this.mbG = pu0;
    }

    public final void BGx(SQLiteDatabase sQLiteDatabase, List list) {
        if (list.isEmpty()) {
            return;
        }
        sQLiteDatabase.execSQL("DELETE FROM " + this.mbG.x() + " WHERE " + this.mbG.N() + " IN (" + onContentCardDismissed.IconCompatParcelizer(list, ",", null, null, da.BGx, 30) + ");", list.toArray(new Object[0]));
    }

    public final boolean BGx(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        return !contentValues.keySet().isEmpty() && sQLiteDatabase.insert(this.mbG.x(), null, contentValues) >= 0;
    }
}
