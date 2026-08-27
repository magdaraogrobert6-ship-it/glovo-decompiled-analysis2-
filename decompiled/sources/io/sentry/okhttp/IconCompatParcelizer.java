package io.sentry.okhttp;

import java.net.InetAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final IconCompatParcelizer IconCompatParcelizer;
    public static final IconCompatParcelizer serializer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IconCompatParcelizer(int i, int i2) {
        super(i);
        this.read = i2;
    }

    static {
        int i = 1;
        serializer = new IconCompatParcelizer(i, 0);
        IconCompatParcelizer = new IconCompatParcelizer(i, i);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        if (this.read != 0) {
            Proxy proxy = (Proxy) obj;
            proxy.getClass();
            String string = proxy.toString();
            string.getClass();
            return string;
        }
        InetAddress inetAddress = (InetAddress) obj;
        inetAddress.getClass();
        String string2 = inetAddress.toString();
        string2.getClass();
        return string2;
    }
}
