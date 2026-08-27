package com.incognia.internal;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onContentCardDismissed;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class lx extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ dC BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws IOException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, this.BGx.mbG.x()) / 2;
        dC dCVar = this.BGx;
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT " + dCVar.mbG.N() + " FROM " + dCVar.mbG.x() + " ORDER BY " + dCVar.mbG.mbG() + " ASC LIMIT ?;", new String[]{String.valueOf(jQueryNumEntries)});
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(dCVar.mbG.N());
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndexOrThrow));
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            cursorRawQuery.close();
            if (!arrayList.isEmpty()) {
                sQLiteDatabase.execSQL("DELETE FROM " + dCVar.mbG.x() + " WHERE " + dCVar.mbG.N() + " IN (" + onContentCardDismissed.IconCompatParcelizer(arrayList, ",", null, null, t9w.BGx, 30) + ");", arrayList.toArray(new String[0]));
            }
            return createfromparcel;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorRawQuery, th}, sourceInformationContextOfdefault.read());
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(dC dCVar) {
        super(1);
        this.BGx = dCVar;
    }
}
