package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class BPj extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ dC BGx;
    public final /* synthetic */ List mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BPj(dC dCVar, List list) {
        super(1);
        this.BGx = dCVar;
        this.mbG = list;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        this.BGx.BGx((SQLiteDatabase) obj, this.mbG);
        return createFromParcel.INSTANCE;
    }
}
