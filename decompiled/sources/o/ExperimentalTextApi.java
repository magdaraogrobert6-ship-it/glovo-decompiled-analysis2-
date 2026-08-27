package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentalTextApi extends applyPausedPrecomposition {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final Throwable read;

    public ExperimentalTextApi(Throwable th) {
        this.read = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = RemoteActionCompatParcelizer + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Error(error=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 61;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if (!(obj instanceof ExperimentalTextApi) || !this.read.equals(((ExperimentalTextApi) obj).read)) {
            int i4 = serializer + 3;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        int i5 = serializer + 103;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
