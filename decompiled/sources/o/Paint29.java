package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class Paint29 extends PaintExtensions_androidKt {
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;

    public Paint29(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = i;
    }

    public final int hashCode() {
        int iM;
        int i = 2 % 2;
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM = Integer.hashCode(this.RemoteActionCompatParcelizer) << af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() % 33, 88, this.read);
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.read) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        }
        int i3 = write + 95;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iM;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
            return af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, ")", c8$$ExternalSyntheticOutline0.m("Visible(title=", this.IconCompatParcelizer, ", description=", this.read, ", animation="));
        }
        return af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, ")", c8$$ExternalSyntheticOutline0.m("Visible(title=", this.IconCompatParcelizer, ", description=", this.read, ", animation="));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 43;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof Paint29) {
            Paint29 paint29 = (Paint29) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, paint29.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, paint29.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == paint29.RemoteActionCompatParcelizer) {
                return true;
            }
            int i4 = write + 75;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 5;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
