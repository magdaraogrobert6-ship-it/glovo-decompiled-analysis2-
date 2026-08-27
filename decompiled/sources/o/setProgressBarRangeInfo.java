package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setProgressBarRangeInfo extends setInputTextSuggestionState {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final setTestTag read;

    public setProgressBarRangeInfo(setTestTag settesttag) {
        super(setSelection.LOGGED_IN);
        this.read = settesttag;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = IconCompatParcelizer + 91;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LoggedIn(userData=" + this.read + ")";
        int i2 = write + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setProgressBarRangeInfo)) {
            int i2 = write + 81;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        Object[] objArr = {this.read, ((setProgressBarRangeInfo) obj).read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i4 = IconCompatParcelizer + 91;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
