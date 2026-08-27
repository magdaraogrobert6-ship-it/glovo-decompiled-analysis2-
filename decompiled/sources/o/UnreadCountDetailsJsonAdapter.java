package o;

import java.io.File;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UnreadCountDetailsJsonAdapter {
    public static final ThreadLocal RemoteActionCompatParcelizer;
    public static final byte[] serializer;

    static {
        char c = File.separatorChar;
        System.lineSeparator();
        HelpCenterHttpAuthInterceptorKt.LF.getString();
        HelpCenterHttpAuthInterceptorKt.CRLF.getString();
        final int i = 0;
        RemoteActionCompatParcelizer = ThreadLocal.withInitial(new Supplier() { // from class: o.fromJson
            @Override // java.util.function.Supplier
            public final Object get() {
                return i != 0 ? new char[8192] : new byte[8192];
            }
        });
        serializer = new byte[8192];
        final int i2 = 1;
        ThreadLocal.withInitial(new Supplier() { // from class: o.fromJson
            @Override // java.util.function.Supplier
            public final Object get() {
                return i2 != 0 ? new char[8192] : new byte[8192];
            }
        });
    }
}
