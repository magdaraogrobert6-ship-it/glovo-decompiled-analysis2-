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
public final class aEQ extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ GH BGx;
    public final /* synthetic */ createInAppMessageEventSubscriber mbG;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws IOException {
        String string = null;
        Cursor cursorQuery = ((SQLiteDatabase) obj).query(this.BGx.mbG.x(), null, null, null, null, null, null);
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.mbG;
        GH gh = this.BGx;
        gh.getClass();
        B0 b0 = B0.BGx;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(B0.x));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(B0.N));
                    JSONObject jSONObject = new JSONObject(dDH.BGx(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(B0.HQ))));
                    String str = X1.hIl;
                    arrayList.add(new Mj(Long.valueOf(j), string, j2, lbM.BGx(jSONObject)));
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
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        if (!arrayList4.isEmpty()) {
            gh.BGx.BGx(new BPj(gh, arrayList4));
        }
        createinappmessageeventsubscriber.IconCompatParcelizer = arrayList3;
        return createfromparcel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aEQ(GH gh, createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        super(1);
        this.BGx = gh;
        this.mbG = createinappmessageeventsubscriber;
    }
}
