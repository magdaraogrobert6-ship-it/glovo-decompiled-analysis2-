package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes3.dex */
public final class getSharedValues extends Emitter {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final String IconCompatParcelizer;

    public getSharedValues(String str) {
        super(str);
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = RemoteActionCompatParcelizer + 81;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("Passed(passedText=", this.IconCompatParcelizer, ")");
        int i4 = write + 117;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getSharedValues) {
            return this.IconCompatParcelizer.equals(((getSharedValues) obj).IconCompatParcelizer);
        }
        int i5 = i3 + 103;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
