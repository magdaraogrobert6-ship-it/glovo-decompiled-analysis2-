package o;

import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public final class WrapPreview {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final TagColorToken write;

    public WrapPreview(TagColorToken tagColorToken, String str) {
        tagColorToken.getClass();
        str.getClass();
        this.write = tagColorToken;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 117;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 103;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof WrapPreview)) {
                return false;
            }
            WrapPreview wrapPreview = (WrapPreview) obj;
            if (this.write != wrapPreview.write) {
                return false;
            }
            Object[] objArr = {this.IconCompatParcelizer, wrapPreview.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i5 = RemoteActionCompatParcelizer + 25;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = serializer + 97;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 62 / 0;
            }
            return true;
        }
        int i9 = i2 + 45;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderStatusItemUiV1(style=" + this.write + ", text=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
