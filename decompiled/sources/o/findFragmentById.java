package o;

/* JADX INFO: loaded from: classes3.dex */
public final class findFragmentById {
    private static int read = 1;
    private static int serializer;
    public final supportStartPostponedEnterTransition IconCompatParcelizer;
    public final supportStartPostponedEnterTransition RemoteActionCompatParcelizer;

    public findFragmentById(supportStartPostponedEnterTransition supportstartpostponedentertransition, supportStartPostponedEnterTransition supportstartpostponedentertransition2) {
        this.RemoteActionCompatParcelizer = supportstartpostponedentertransition;
        this.IconCompatParcelizer = supportstartpostponedentertransition2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.IconCompatParcelizer.hashCode() + (this.RemoteActionCompatParcelizer.IconCompatParcelizer.hashCode() * 31);
        int i4 = read + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FloatingLayerUiState(top=" + this.RemoteActionCompatParcelizer + ", bottom=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 93;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            if (!(obj instanceof findFragmentById)) {
                return false;
            }
            findFragmentById findfragmentbyid = (findFragmentById) obj;
            if (!this.RemoteActionCompatParcelizer.equals(findfragmentbyid.RemoteActionCompatParcelizer) || (!this.IconCompatParcelizer.equals(findfragmentbyid.IconCompatParcelizer))) {
                return false;
            }
        }
        return true;
    }
}
