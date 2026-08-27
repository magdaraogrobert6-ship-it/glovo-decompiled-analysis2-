package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setAllowReturnTransitionOverlap implements setAnimations {
    private static int read = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final setEnterSharedElementCallback write;

    public setAllowReturnTransitionOverlap(setEnterSharedElementCallback setentersharedelementcallback, String str, String str2) {
        this.write = setentersharedelementcallback;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        int i4 = serializer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DefaultExpandedBubbleItem(imageSource=");
        sb.append(this.write);
        sb.append(", title=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", description=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
        int i2 = read + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAllowReturnTransitionOverlap)) {
            return false;
        }
        setAllowReturnTransitionOverlap setallowreturntransitionoverlap = (setAllowReturnTransitionOverlap) obj;
        if (this.write.equals(setallowreturntransitionoverlap.write)) {
            return this.RemoteActionCompatParcelizer.equals(setallowreturntransitionoverlap.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(setallowreturntransitionoverlap.IconCompatParcelizer);
        }
        int i3 = serializer + 99;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
