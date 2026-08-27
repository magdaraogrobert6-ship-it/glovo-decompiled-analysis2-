package com.incognia.internal;

import java.net.InetAddress;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class k8B extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final k8B BGx = new k8B();

    public k8B() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((InetAddress) obj).getHostAddress();
    }
}
