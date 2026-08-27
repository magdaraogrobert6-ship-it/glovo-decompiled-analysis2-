package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class updateHandlersStatusAndSendI {
    private static int read = 0;
    private static int serializer = 1;
    public final Object IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public updateHandlersStatusAndSendI(Object obj, String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = obj;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 105;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write);
        int iHashCode = writeAttributionI.serializer.hashCode();
        Object obj = this.IconCompatParcelizer;
        if (obj == null) {
            i = 0;
        } else {
            int iHashCode2 = obj.hashCode();
            int i5 = serializer + 69;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            }
            i = iHashCode2;
        }
        return ((iHashCode + iM) * 31) + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Config(key=", this.RemoteActionCompatParcelizer, ", description=", this.write, ", type=");
        sbM.append(writeAttributionI.serializer);
        sbM.append(", defaultValue=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 55;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 65;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updateHandlersStatusAndSendI)) {
            int i4 = i2 + 47;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        updateHandlersStatusAndSendI updatehandlersstatusandsendi = (updateHandlersStatusAndSendI) obj;
        if (!this.RemoteActionCompatParcelizer.equals(updatehandlersstatusandsendi.RemoteActionCompatParcelizer) || !this.write.equals(updatehandlersstatusandsendi.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, updatehandlersstatusandsendi.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
