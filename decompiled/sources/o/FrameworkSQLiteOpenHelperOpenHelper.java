package o;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameworkSQLiteOpenHelperOpenHelper {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final String write;

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.IconCompatParcelizer;
        int i4 = i3 + 95;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write;
        }
        throw null;
    }

    public FrameworkSQLiteOpenHelperOpenHelper(String str, boolean z) {
        this.write = str;
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + (this.write.hashCode() * 31);
        int i4 = serializer + 69;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 21;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof FrameworkSQLiteOpenHelperOpenHelper) {
            FrameworkSQLiteOpenHelperOpenHelper frameworkSQLiteOpenHelperOpenHelper = (FrameworkSQLiteOpenHelperOpenHelper) obj;
            if (this.write.equals(frameworkSQLiteOpenHelperOpenHelper.write) && this.IconCompatParcelizer == frameworkSQLiteOpenHelperOpenHelper.IconCompatParcelizer) {
                return true;
            }
        } else {
            int i4 = serializer + 53;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = RemoteActionCompatParcelizer + 113;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LivenessDetectionViewState(startDestination=" + this.write + ", showLoading=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
