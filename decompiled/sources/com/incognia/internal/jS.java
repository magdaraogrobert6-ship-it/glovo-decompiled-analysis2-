package com.incognia.internal;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class jS extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ cancelPendingWebViewPause BGx;
    public final /* synthetic */ dC mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jS(cancelPendingWebViewPause cancelpendingwebviewpause, dC dCVar) {
        super(1);
        this.BGx = cancelpendingwebviewpause;
        this.mbG = dCVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean z;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        cancelPendingWebViewPause cancelpendingwebviewpause = this.BGx;
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, this.mbG.mbG.x());
        this.mbG.getClass();
        if (jQueryNumEntries < 500) {
            long length = new File(sQLiteDatabase.getPath()).length();
            this.mbG.getClass();
            if (length >= 1048576) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        cancelpendingwebviewpause.IconCompatParcelizer = z;
        return createFromParcel.INSTANCE;
    }
}
