package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetNumPadDividecp {
    public final accessgetNumPad2cp IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final accessgetNumLockcp write;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer;
    }

    public accessgetNumPadDividecp(accessgetNumLockcp accessgetnumlockcp, accessgetNumPad2cp accessgetnumpad2cp, String str) {
        this.write = accessgetnumlockcp;
        this.IconCompatParcelizer = accessgetnumpad2cp;
        this.read = str;
        this.RemoteActionCompatParcelizer = Arrays.hashCode(new Object[]{accessgetnumlockcp, accessgetnumpad2cp, str, null});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetNumPadDividecp)) {
            return false;
        }
        accessgetNumPadDividecp accessgetnumpaddividecp = (accessgetNumPadDividecp) obj;
        return TuplesKt.write(this.write, accessgetnumpaddividecp.write) && TuplesKt.write(this.IconCompatParcelizer, accessgetnumpaddividecp.IconCompatParcelizer) && TuplesKt.write((Object) this.read, (Object) accessgetnumpaddividecp.read) && TuplesKt.write((Object) null, (Object) null);
    }
}
