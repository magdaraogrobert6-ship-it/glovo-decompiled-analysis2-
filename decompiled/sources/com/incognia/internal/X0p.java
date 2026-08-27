package com.incognia.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.sourceInformationContextOfdefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class X0p extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ QB BGx;
    public final /* synthetic */ createInAppMessageEventSubscriber mbG;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws IOException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        String string = null;
        Cursor cursorQuery = sQLiteDatabase.query(this.BGx.mbG.x(), null, null, null, null, null, null);
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.mbG;
        QB qb = this.BGx;
        aJf ajf = aJf.BGx;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(aJf.x));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                    arrayList.add(new iR9(Long.valueOf(j), string, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(aJf.N)), Bp.BGx(new JSONObject(dDH.BGx(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(aJf.HQ)))))));
                } catch (Throwable unused) {
                    if (string != null) {
                        arrayList2.add(string);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorQuery, th}, i3);
                    throw th2;
                }
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        cursorQuery.close();
        qb.BGx(sQLiteDatabase, arrayList2);
        createinappmessageeventsubscriber.IconCompatParcelizer = arrayList;
        return createfromparcel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0p(QB qb, createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        super(1);
        this.BGx = qb;
        this.mbG = createinappmessageeventsubscriber;
    }
}
