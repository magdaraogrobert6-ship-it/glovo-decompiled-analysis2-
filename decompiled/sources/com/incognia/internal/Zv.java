package com.incognia.internal;

import android.media.MediaDrm;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class Zv extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final Zv BGx = new Zv();

    public Zv() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return yEy.HQ(2, ((MediaDrm) obj).getPropertyByteArray("deviceUniqueId"));
    }
}
