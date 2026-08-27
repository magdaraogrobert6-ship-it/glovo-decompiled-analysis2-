package o;

/* JADX INFO: loaded from: classes3.dex */
public final class readContentProviderIntentAction extends getPayloadFromSystemPropertyReflection {
    private static int IconCompatParcelizer = 1;
    public static final readContentProviderIntentAction RemoteActionCompatParcelizer = new readContentProviderIntentAction();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 17;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 31;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 113;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "NotAvailable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1684841318;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 73;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readContentProviderIntentAction)) {
            return false;
        }
        int i4 = i2 + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
