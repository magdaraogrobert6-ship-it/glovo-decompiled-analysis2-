package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class iPG extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Lambda BGx;
    public final /* synthetic */ SQLiteDatabase mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iPG(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SQLiteDatabase sQLiteDatabase) {
        super(0);
        this.BGx = (Lambda) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.mbG = sQLiteDatabase;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        this.BGx.invoke(this.mbG);
        return createFromParcel.INSTANCE;
    }
}
