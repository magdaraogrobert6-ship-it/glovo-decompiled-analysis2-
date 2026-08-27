package com.incognia.internal;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Lambda;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class tNX extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ cancelPendingWebViewPause BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        this.BGx.IconCompatParcelizer = DatabaseUtils.queryNumEntries((SQLiteDatabase) obj, B0.mbG) == 0;
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tNX(cancelPendingWebViewPause cancelpendingwebviewpause) {
        super(1);
        this.BGx = cancelpendingwebviewpause;
    }
}
