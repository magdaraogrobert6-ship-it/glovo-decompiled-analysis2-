package o;

/* JADX INFO: loaded from: classes4.dex */
public enum _get_messageWebView_lambda2 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    private final String javaName;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    public static final getWebViewViewId Companion = new getWebViewViewId();

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m5150deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }

    public static final _get_messageWebView_lambda2 forJavaName(String str) {
        Companion.getClass();
        return getWebViewViewId.RemoteActionCompatParcelizer(str);
    }

    _get_messageWebView_lambda2(String str) {
        this.javaName = str;
    }
}
