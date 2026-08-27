package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class calculateWindowSize {
    public final int IconCompatParcelizer;

    public /* synthetic */ calculateWindowSize(int i) {
        this.IconCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof calculateWindowSize) && this.IconCompatParcelizer == ((calculateWindowSize) obj).IconCompatParcelizer && TuplesKt.write((Object) null, (Object) null) && TuplesKt.write((Object) null, (Object) null);
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Boolean.FALSE, null, null});
    }
}
