package o;

/* JADX INFO: loaded from: classes3.dex */
public final class withTopLeftBottomRight {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final retrofit2.HttpException read;

    public withTopLeftBottomRight(retrofit2.HttpException httpException, String str) {
        this.read = httpException;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HttpExceptionWithAggregatedMessage(exception=" + this.read + ", message=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 65;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof withTopLeftBottomRight) {
            withTopLeftBottomRight withtopleftbottomright = (withTopLeftBottomRight) obj;
            if (this.read.equals(withtopleftbottomright.read) && this.IconCompatParcelizer.equals(withtopleftbottomright.IconCompatParcelizer)) {
                return true;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
