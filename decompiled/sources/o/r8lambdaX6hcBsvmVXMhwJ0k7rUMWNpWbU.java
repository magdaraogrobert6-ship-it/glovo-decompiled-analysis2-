package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaX6hcBsvmVXMhwJ0k7rUMWNpWbU {
    private static int read = 1;
    private static int serializer;

    @SerializedName("url")
    private final String url;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.url;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.url.hashCode();
        }
        int i3 = 77 / 0;
        return this.url.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("HelpCenterInitResponse(url=", this.url, ")");
        int i4 = serializer + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (obj instanceof r8lambdaX6hcBsvmVXMhwJ0k7rUMWNpWbU) {
            Object[] objArr = {this.url, ((r8lambdaX6hcBsvmVXMhwJ0k7rUMWNpWbU) obj).url};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = read + 11;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        int i6 = i3 + 107;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
