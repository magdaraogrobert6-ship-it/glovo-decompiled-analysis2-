package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ CA BGx;
    public final /* synthetic */ SQLiteDatabase mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(CA ca, SQLiteDatabase sQLiteDatabase) {
        super(0);
        this.BGx = ca;
        this.mbG = sQLiteDatabase;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        CA ca = this.BGx;
        SQLiteDatabase sQLiteDatabase = this.mbG;
        Iterator it = ca.N.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(((Pu0) it.next()).HQ());
        }
        return createFromParcel.INSTANCE;
    }
}
