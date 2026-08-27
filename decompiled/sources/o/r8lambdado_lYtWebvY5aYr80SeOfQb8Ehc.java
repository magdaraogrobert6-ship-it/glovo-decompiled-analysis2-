package o;

import java.net.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r8lambdado_lYtWebvY5aYr80SeOfQb8Ehc {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
    }
}
