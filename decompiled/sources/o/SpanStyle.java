package o;

/* JADX INFO: loaded from: classes3.dex */
public final class SpanStyle {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final boolean IconCompatParcelizer;

    public SpanStyle(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Boolean.hashCode(this.IconCompatParcelizer);
            iHashCode = 0;
        } else {
            iHashCode = Boolean.hashCode(this.IconCompatParcelizer) * 31;
        }
        int i3 = RemoteActionCompatParcelizer + 25;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("AutoAcceptSection(autoAcceptDescription=, isAutoAcceptOn=", ", autoAcceptToggleTitle=)", this.IconCompatParcelizer);
        int i4 = RemoteActionCompatParcelizer + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strSerializer;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj && (!(obj instanceof SpanStyle) || this.IconCompatParcelizer != ((SpanStyle) obj).IconCompatParcelizer)) {
            return false;
        }
        int i4 = i3 + 119;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
