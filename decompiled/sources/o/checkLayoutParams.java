package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes3.dex */
public final class checkLayoutParams extends Emitter {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final String serializer;

    public checkLayoutParams(String str) {
        super(str);
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer.hashCode();
            throw null;
        }
        int iHashCode = this.serializer.hashCode();
        int i3 = write + 83;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m("NotStarted(notStartedText=", this.serializer, ")");
            int i3 = 32 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("NotStarted(notStartedText=", this.serializer, ")");
        }
        int i4 = RemoteActionCompatParcelizer + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 39;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
            if (this == obj) {
                int i5 = i2 + 83;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else if ((obj instanceof checkLayoutParams) || !this.serializer.equals(((checkLayoutParams) obj).serializer)) {
                return false;
            }
        } else {
            if (this != obj) {
                if (obj instanceof checkLayoutParams) {
                }
                return false;
            }
            int i7 = i2 + 83;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        int i9 = write + 91;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
