package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class invoke4WTKRHQ {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public invoke4WTKRHQ(String str, String str2, String str3, String str4) {
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.serializer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ErrorDialogState(title=", this.RemoteActionCompatParcelizer, ", description=", this.write, ", mainActionButtonTitle="), this.IconCompatParcelizer, ", tag=", this.serializer, ")");
        }
        int i3 = 49 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ErrorDialogState(title=", this.RemoteActionCompatParcelizer, ", description=", this.write, ", mainActionButtonTitle="), this.IconCompatParcelizer, ", tag=", this.serializer, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write), 31, this.IconCompatParcelizer);
        int i4 = MediaSessionCompatQueueItem + 13;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 117;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if (obj instanceof invoke4WTKRHQ) {
            invoke4WTKRHQ invoke4wtkrhq = (invoke4WTKRHQ) obj;
            if (!this.RemoteActionCompatParcelizer.equals(invoke4wtkrhq.RemoteActionCompatParcelizer) || !this.write.equals(invoke4wtkrhq.write) || !this.IconCompatParcelizer.equals(invoke4wtkrhq.IconCompatParcelizer) || !this.serializer.equals(invoke4wtkrhq.serializer)) {
                return false;
            }
        } else {
            int i4 = read + 67;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = MediaSessionCompatQueueItem + 83;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
