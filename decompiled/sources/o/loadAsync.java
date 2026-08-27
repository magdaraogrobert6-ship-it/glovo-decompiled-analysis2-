package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class loadAsync {
    private static int read = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean write;

    public loadAsync(boolean z, boolean z2, boolean z3) {
        this.write = z;
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
    }

    public final int hashCode() {
        int iM;
        boolean z;
        int i = 2 % 2;
        int i2 = serializer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM = d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.write) << 4, 113, this.IconCompatParcelizer);
            z = this.RemoteActionCompatParcelizer;
        } else {
            iM = d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.write) * 31, 31, this.IconCompatParcelizer);
            z = this.RemoteActionCompatParcelizer;
        }
        return Boolean.hashCode(z) + iM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof loadAsync) {
            loadAsync loadasync = (loadAsync) obj;
            if (this.write != loadasync.write) {
                return false;
            }
            if (this.IconCompatParcelizer != loadasync.IconCompatParcelizer) {
                int i2 = read + 7;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            Object obj2 = null;
            if (this.RemoteActionCompatParcelizer != loadasync.RemoteActionCompatParcelizer) {
                int i4 = serializer + 63;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            int i5 = read + 31;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        int i6 = read + 35;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("AutoAcceptState(canShowAutoAccept=");
        sb.append(this.write);
        sb.append(", isChecked=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isInteractionEnabled=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = read + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return strM;
    }
}
