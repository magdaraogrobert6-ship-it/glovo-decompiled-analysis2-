package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class mapAnnotationsui_text {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final androidx.lifecycle.BlockRunner IconCompatParcelizer;
    public final String read;
    public final String write;

    public mapAnnotationsui_text(androidx.lifecycle.BlockRunner blockRunner, String str, String str2) {
        blockRunner.getClass();
        str2.getClass();
        this.IconCompatParcelizer = blockRunner;
        this.write = str;
        this.read = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.write);
        int i4 = RemoteActionCompatParcelizer + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ActiveSession(index=" + this.IconCompatParcelizer + ", baseUrl=" + this.write + ", token=REDACTED)";
        int i2 = RemoteActionCompatParcelizer + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 61;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            int i3 = 5 / 4;
            return true;
        }
        if (!(obj instanceof mapAnnotationsui_text)) {
            return false;
        }
        mapAnnotationsui_text mapannotationsui_text = (mapAnnotationsui_text) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, mapannotationsui_text.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (!this.write.equals(mapannotationsui_text.write)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, mapannotationsui_text.read}, getCieXyz.write())).booleanValue();
        }
        int i4 = RemoteActionCompatParcelizer + 51;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
