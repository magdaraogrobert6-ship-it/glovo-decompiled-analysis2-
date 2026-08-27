package com.incognia.internal;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import kotlin.jvm.internal.Lambda;
import o.ContentCardsDividerItemDecoration;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.resetAfterInAppMessageCloselambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class C7T extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final C7T BGx = new C7T();

    public C7T() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        NetworkInterface networkInterface = (NetworkInterface) obj;
        String name = networkInterface.getName();
        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
        inetAddresses.getClass();
        return new QMF(name, resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(resetAfterInAppMessageCloselambda2.serializer(new ContentCardsDividerItemDecoration(inetAddresses)), k8B.BGx)));
    }
}
