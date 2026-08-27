package com.incognia.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CA extends SQLiteOpenHelper {
    public final Context BGx;
    public final String HQ;
    public final List N;
    public final AtomicInteger hIl;
    public final KWh mbG;
    public final xaE x;

    public CA(Context context, KWh kWh, String str, List list, xaE xae) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.BGx = context;
        this.mbG = kWh;
        this.HQ = str;
        this.N = list;
        this.x = xae;
        this.hIl = new AtomicInteger(0);
    }

    public final void BGx(SQLiteDatabase sQLiteDatabase, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            try {
                BGx(th);
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public final void mbG(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabaseBGx = BGx();
            BGx(sQLiteDatabaseBGx, new iPG(r8lambdaunavo3sxub_pc9xroryotnrlvsm, sQLiteDatabaseBGx));
            this.hIl.decrementAndGet();
        } catch (Throwable th) {
            BGx(th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            BGx(sQLiteDatabase, new o3(this, sQLiteDatabase));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase != null) {
            BGx(sQLiteDatabase, new mX(this, sQLiteDatabase));
        }
    }

    public final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            return;
        }
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(BGx());
            this.hIl.decrementAndGet();
        } catch (Throwable th) {
            BGx(th);
        }
    }

    public final SQLiteDatabase BGx() {
        this.hIl.incrementAndGet();
        for (int i = 0; i < 6; i++) {
            try {
                return getWritableDatabase();
            } catch (Throwable th) {
                if (i != 5) {
                    this.mbG.getClass();
                    SystemClock.sleep(100L);
                } else {
                    throw th;
                }
            }
        }
        return null;
    }

    public final void BGx(Throwable th) {
        this.hIl.set(0);
        try {
            close();
            this.BGx.deleteDatabase(this.HQ);
            this.x.BGx(th);
        } catch (Throwable th2) {
            this.x.BGx(th2);
        }
    }
}
