package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSevencp implements accessgetNumPad2cp {
    public static final accessgetSevencp RemoteActionCompatParcelizer = new accessgetSevencp(null);
    public final String serializer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer});
    }

    public /* synthetic */ accessgetSevencp(String str) {
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof accessgetSevencp) {
            return TuplesKt.write((Object) this.serializer, (Object) ((accessgetSevencp) obj).serializer);
        }
        return false;
    }
}
