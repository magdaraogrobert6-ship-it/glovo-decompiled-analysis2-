package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class QTL extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final QTL BGx = new QTL();

    public QTL() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!sQLiteDatabase.inTransaction()) {
            sQLiteDatabase.execSQL("VACUUM");
        }
        return createFromParcel.INSTANCE;
    }
}
