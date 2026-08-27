package com.incognia.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class eF extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ArrayList BGx;
    public final /* synthetic */ GH mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eF(ArrayList arrayList, GH gh) {
        super(1);
        this.BGx = arrayList;
        this.mbG = gh;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList arrayList = this.BGx;
        GH gh = this.mbG;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Mj mj = (Mj) obj2;
            B0 b0 = B0.BGx;
            ContentValues contentValues = new ContentValues();
            try {
                contentValues.put(B0.HQ, dDH.mbG(mj.N.mbG().toString()));
                contentValues.put(B0.x, mj.mbG);
                contentValues.put(B0.N, Long.valueOf(mj.HQ));
            } catch (Throwable unused) {
            }
            gh.BGx(sQLiteDatabase, contentValues);
        }
        return createFromParcel.INSTANCE;
    }
}
