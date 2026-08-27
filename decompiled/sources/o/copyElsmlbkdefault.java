package o;

/* JADX INFO: loaded from: classes3.dex */
public final class copyElsmlbkdefault extends Paragraph_EkL_Ydefault {
    private static int read = 0;
    private static int serializer = 1;
    public final boolean IconCompatParcelizer;

    @Override // o.Paragraph_EkL_Ydefault
    public final String read() {
        int i = 2 % 2;
        int i2 = read + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return "customer_chat_open";
    }

    public copyElsmlbkdefault(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Boolean.hashCode(this.IconCompatParcelizer);
        }
        int i3 = 77 / 0;
        return Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("Open(isChatPreloaded=", ")", this.IconCompatParcelizer);
        int i4 = read + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            return !((obj instanceof copyElsmlbkdefault) ^ true) && this.IconCompatParcelizer == ((copyElsmlbkdefault) obj).IconCompatParcelizer;
        }
        int i2 = read + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return true;
    }
}
