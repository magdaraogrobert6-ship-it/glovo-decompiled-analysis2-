package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdasetOfflineMode8 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String IconCompatParcelizer;

    public lambdasetOfflineMode8(String str) {
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() - 775111143;
        int i4 = RemoteActionCompatParcelizer + 57;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("JsonMessage(event=server:delivery_updated, content=", this.IconCompatParcelizer, ")");
        }
        ff$$ExternalSyntheticOutline0.m("JsonMessage(event=server:delivery_updated, content=", this.IconCompatParcelizer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj || ((obj instanceof lambdasetOfflineMode8) && !(!this.IconCompatParcelizer.equals(((lambdasetOfflineMode8) obj).IconCompatParcelizer)))) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 101;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
