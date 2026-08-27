package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImagePreviewHandlerCompanionDefault1 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;

    public AsyncImagePreviewHandlerCompanionDefault1(String str, String str2, String str3) {
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("OverlayVisibilityBannerUiState(title=", this.read, ", description=", this.IconCompatParcelizer, ", buttonText="), this.serializer, ", animationRes=2131951623)");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("OverlayVisibilityBannerUiState(title=", this.read, ", description=", this.IconCompatParcelizer, ", buttonText="), this.serializer, ", animationRes=2131951623)");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Integer.hashCode(com.logistics.rider.glovo.R.raw.enable_overlay) >> af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() % 66, 61, this.IconCompatParcelizer), 86, this.serializer);
        }
        return Integer.hashCode(com.logistics.rider.glovo.R.raw.enable_overlay) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.serializer);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 59;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (this != obj) {
            if (obj instanceof AsyncImagePreviewHandlerCompanionDefault1) {
                AsyncImagePreviewHandlerCompanionDefault1 asyncImagePreviewHandlerCompanionDefault1 = (AsyncImagePreviewHandlerCompanionDefault1) obj;
                if (!this.read.equals(asyncImagePreviewHandlerCompanionDefault1.read)) {
                    i = write + 109;
                    RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else if (!this.IconCompatParcelizer.equals(asyncImagePreviewHandlerCompanionDefault1.IconCompatParcelizer)) {
                    i = RemoteActionCompatParcelizer + 107;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else if (this.serializer.equals(asyncImagePreviewHandlerCompanionDefault1.serializer)) {
                    return true;
                }
                int i6 = i % 2;
            }
            return false;
        }
        int i7 = i3 + 55;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
