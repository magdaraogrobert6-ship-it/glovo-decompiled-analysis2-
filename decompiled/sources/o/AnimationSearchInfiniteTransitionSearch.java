package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationSearchInfiniteTransitionSearch extends AnimationSearchRememberSearch {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String serializer;

    public AnimationSearchInfiniteTransitionSearch(String str) {
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer.hashCode();
        }
        int i3 = 59 / 0;
        return this.serializer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("InProgress(timerText=", this.serializer, ")");
        }
        ff$$ExternalSyntheticOutline0.m("InProgress(timerText=", this.serializer, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 61;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof AnimationSearchInfiniteTransitionSearch)) {
                int i4 = i2 + 71;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!this.serializer.equals(((AnimationSearchInfiniteTransitionSearch) obj).serializer)) {
                return false;
            }
        }
        return true;
    }
}
