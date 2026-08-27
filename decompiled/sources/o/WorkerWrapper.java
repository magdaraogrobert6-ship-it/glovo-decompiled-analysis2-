package o;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkerWrapper extends SchedulersExternalSyntheticLambda1 {
    private static int IconCompatParcelizer = 0;
    public static final WorkerWrapper RemoteActionCompatParcelizer = new WorkerWrapper();
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = write + 109;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 36 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "NotDisplayable";
        }
        int i3 = 49 / 0;
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return -282540110;
        }
        int i3 = 19 / 0;
        return -282540110;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj || !(!(obj instanceof WorkerWrapper))) {
            return true;
        }
        int i5 = i2 + 21;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
