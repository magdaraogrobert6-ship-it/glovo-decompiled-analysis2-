package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes3.dex */
public final class setReferenceTags extends Emitter {
    private static int read = 0;
    private static int write = 1;
    public final String serializer;

    public setReferenceTags(String str) {
        super(str);
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("Checking(checkingText=", this.serializer, ")");
        }
        int i3 = 37 / 0;
        return ff$$ExternalSyntheticOutline0.m("Checking(checkingText=", this.serializer, ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 107;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            return (obj instanceof setReferenceTags) && this.serializer.equals(((setReferenceTags) obj).serializer);
        }
        int i5 = i2 + 75;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
