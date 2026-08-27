package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class updateFlagsFor {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public final executeAsList IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final RectListDebuggerModifierElement read;
    public final String write;

    public updateFlagsFor(String str, String str2, executeAsList executeaslist, RectListDebuggerModifierElement rectListDebuggerModifierElement) {
        executeaslist.getClass();
        rectListDebuggerModifierElement.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = executeaslist;
        this.read = rectListDebuggerModifierElement;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write);
        int iHashCode = this.read.hashCode() + ((this.IconCompatParcelizer.hashCode() + iM) * 31);
        int i4 = serializer + 31;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CriticalEndpointIssue(path=", this.RemoteActionCompatParcelizer, ", key=", this.write, ", owner=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", requestMethod=");
        sbM.append(this.read);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 29;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 77;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof updateFlagsFor) {
            updateFlagsFor updateflagsfor = (updateFlagsFor) obj;
            if (this.RemoteActionCompatParcelizer.equals(updateflagsfor.RemoteActionCompatParcelizer) && this.write.equals(updateflagsfor.write) && this.IconCompatParcelizer == updateflagsfor.IconCompatParcelizer && this.read == updateflagsfor.read) {
                return true;
            }
        }
        int i4 = MediaMetadataCompat + 85;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
