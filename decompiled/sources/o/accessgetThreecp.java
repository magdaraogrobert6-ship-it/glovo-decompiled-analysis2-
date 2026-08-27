package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetThreecp {
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final boolean write;

    public accessgetThreecp(String str, boolean z) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.serializer = str;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("com.google.android.gms");
        this.RemoteActionCompatParcelizer = "com.google.android.gms";
        this.write = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetThreecp)) {
            return false;
        }
        accessgetThreecp accessgetthreecp = (accessgetThreecp) obj;
        return TuplesKt.write((Object) this.serializer, (Object) accessgetthreecp.serializer) && TuplesKt.write((Object) this.RemoteActionCompatParcelizer, (Object) accessgetthreecp.RemoteActionCompatParcelizer) && TuplesKt.write((Object) null, (Object) null) && this.write == accessgetthreecp.write && TuplesKt.write((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, this.RemoteActionCompatParcelizer, null, 4225, Boolean.valueOf(this.write), null});
    }

    public final String toString() {
        String str = this.serializer;
        if (str != null) {
            return str;
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) null);
        throw null;
    }
}
