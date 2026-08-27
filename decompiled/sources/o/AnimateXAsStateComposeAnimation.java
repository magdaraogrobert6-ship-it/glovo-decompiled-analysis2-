package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimateXAsStateComposeAnimation {
    private static int read = 1;
    private static int serializer;
    public final findGroupsThatMatchPredicatedefault IconCompatParcelizer;
    public final Uri write;

    public AnimateXAsStateComposeAnimation(Uri uri, findGroupsThatMatchPredicatedefault findgroupsthatmatchpredicatedefault) {
        this.write = uri;
        this.IconCompatParcelizer = findgroupsthatmatchpredicatedefault;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 29;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = this.write.hashCode();
        findGroupsThatMatchPredicatedefault findgroupsthatmatchpredicatedefault = this.IconCompatParcelizer;
        if (findgroupsthatmatchpredicatedefault == null) {
            int i5 = read + 117;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i5 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode2 = findgroupsthatmatchpredicatedefault.hashCode();
            int i6 = serializer + 107;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Deeplink(deeplink=" + this.write + ", testing=" + this.IconCompatParcelizer + ")";
        int i2 = read + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof AnimateXAsStateComposeAnimation)) {
                return false;
            }
            AnimateXAsStateComposeAnimation animateXAsStateComposeAnimation = (AnimateXAsStateComposeAnimation) obj;
            if (!this.write.equals(animateXAsStateComposeAnimation.write)) {
                int i3 = serializer + 73;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, animateXAsStateComposeAnimation.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
