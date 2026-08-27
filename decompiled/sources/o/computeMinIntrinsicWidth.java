package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class computeMinIntrinsicWidth implements LayoutIntrinsics {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final long read;
    public final String write;

    public computeMinIntrinsicWidth(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.read = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.write) + androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.read);
        }
        return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.read) >> af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() / 120, 11, this.write);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Available(highlightedText=", this.IconCompatParcelizer, ", text=", this.write, ", highlightColor="), androidx.compose.ui.graphics.Color.m730toStringimpl(this.read), ")");
        }
        int i3 = 63 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Available(highlightedText=", this.IconCompatParcelizer, ", text=", this.write, ", highlightColor="), androidx.compose.ui.graphics.Color.m730toStringimpl(this.read), ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 93;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof computeMinIntrinsicWidth)) {
            return false;
        }
        computeMinIntrinsicWidth computeminintrinsicwidth = (computeMinIntrinsicWidth) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, computeminintrinsicwidth.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 59;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, computeminintrinsicwidth.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (androidx.compose.ui.graphics.Color.m723equalsimpl0(this.read, computeminintrinsicwidth.read)) {
            return true;
        }
        int i7 = serializer + 19;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }
}
