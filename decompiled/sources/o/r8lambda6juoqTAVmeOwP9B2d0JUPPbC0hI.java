package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI implements r8lambda56WtWDYfFxH1I9MfVEIOgBnACTY {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final r8lambda5weVaLnJrZw3JZ5gurH6kjpdo serializer;
    public final String write;

    public r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI(r8lambda5weVaLnJrZw3JZ5gurH6kjpdo r8lambda5wevalnjrzw3jz5gurh6kjpdo, int i, String str, String str2, String str3) {
        r8lambda5wevalnjrzw3jz5gurh6kjpdo.getClass();
        this.serializer = r8lambda5wevalnjrzw3jz5gurh6kjpdo;
        this.IconCompatParcelizer = i;
        this.read = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.serializer.hashCode() * 31, 31), 961, this.read);
        String str = this.write;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = MediaSessionCompatQueueItem + 31;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            int i4 = MediaSessionCompatQueueItem + 87;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return ((iM + iHashCode) * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ListPreferenceItem(key=");
        sb.append(this.serializer);
        sb.append(", icon=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", title=");
        c8$$ExternalSyntheticOutline0.m(sb, this.read, ", description=null, choice=", this.write, ", newTag=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = RatingCompat + 125;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI)) {
            return false;
        }
        r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI r8lambda6juoqtavmeowp9b2d0juppbc0hi = (r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI) obj;
        if (this.serializer == r8lambda6juoqtavmeowp9b2d0juppbc0hi.serializer) {
            if (this.IconCompatParcelizer != r8lambda6juoqtavmeowp9b2d0juppbc0hi.IconCompatParcelizer) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambda6juoqtavmeowp9b2d0juppbc0hi.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambda6juoqtavmeowp9b2d0juppbc0hi.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambda6juoqtavmeowp9b2d0juppbc0hi.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i5 = i3 + 7;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
