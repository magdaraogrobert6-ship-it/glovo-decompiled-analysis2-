package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String serializer;
    public final String write;

    public r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk(String str, String str2) {
        this.write = str;
        this.serializer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("UiState(title=", this.write, ", description=", this.serializer, ")");
        int i4 = read + 29;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer.hashCode() >>> (this.write.hashCode() / 10);
        }
        return (this.write.hashCode() * 31) + this.serializer.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk)) {
                return false;
            }
            r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk r8lambdaylzrzvfm4mk2pbhbucln0oaovsk = (r8lambdayLzRZVFM4MK2pbhBUcln0OaOVsk) obj;
            if (!this.write.equals(r8lambdaylzrzvfm4mk2pbhbucln0oaovsk.write) || (!this.serializer.equals(r8lambdaylzrzvfm4mk2pbhbucln0oaovsk.serializer))) {
                return false;
            }
        }
        int i4 = read + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
