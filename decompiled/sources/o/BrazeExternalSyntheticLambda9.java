package o;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda9 implements BrazeCompanion {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final fieldToInteger serializer;

    public BrazeExternalSyntheticLambda9(fieldToInteger fieldtointeger) {
        this.serializer = fieldtointeger;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NoInternetError(errorViewEntity=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 5;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if ((obj instanceof BrazeExternalSyntheticLambda9) && this.serializer.equals(((BrazeExternalSyntheticLambda9) obj).serializer)) {
            return true;
        }
        int i4 = write + 21;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
