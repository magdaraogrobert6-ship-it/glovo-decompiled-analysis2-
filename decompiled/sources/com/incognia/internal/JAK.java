package com.incognia.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class JAK extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ iR9 BGx;
    public final /* synthetic */ QB mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JAK(iR9 ir9, QB qb) {
        super(1);
        this.BGx = ir9;
        this.mbG = qb;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        aJf ajf = aJf.BGx;
        iR9 ir9 = this.BGx;
        ContentValues contentValues = new ContentValues();
        try {
            String str = aJf.HQ;
            String str2 = Bp.BGx;
            contentValues.put(str, dDH.mbG(Bp.BGx(ir9.N).toString()));
            contentValues.put(aJf.x, ir9.mbG);
            contentValues.put(aJf.N, Long.valueOf(ir9.HQ));
        } catch (Throwable unused) {
        }
        this.mbG.BGx(sQLiteDatabase, contentValues);
        return createFromParcel.INSTANCE;
    }
}
