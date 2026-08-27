package o;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class incrementPermissionRequestCountlambda0 {
    public static final AtomicLong write = new AtomicLong();
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final String read;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer + "<" + this.RemoteActionCompatParcelizer + ">");
        String str = this.read;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }

    public incrementPermissionRequestCountlambda0(String str, String str2, long j) {
        TextStreamsKt.read("empty type", !str.isEmpty());
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = j;
    }

    public static incrementPermissionRequestCountlambda0 IconCompatParcelizer(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new incrementPermissionRequestCountlambda0(simpleName, str, write.incrementAndGet());
    }
}
