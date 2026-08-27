package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final androidx.compose.ui.text.AnnotatedString IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final setFirstVerticalStyle serializer;
    public final String write;

    public r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY(String str, androidx.compose.ui.text.AnnotatedString annotatedString, setFirstVerticalStyle setfirstverticalstyle, List list) {
        annotatedString.getClass();
        setfirstverticalstyle.getClass();
        this.write = str;
        this.IconCompatParcelizer = annotatedString;
        this.serializer = setfirstverticalstyle;
        this.RemoteActionCompatParcelizer = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode() + ((this.serializer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        int i4 = MediaMetadataCompat + 111;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AppearanceUiState(title=" + this.write + ", description=" + ((Object) this.IconCompatParcelizer) + ", selectedMode=" + this.serializer + ", options=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 117;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 39;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (obj instanceof r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY) {
                r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY r8lambdatq96bk0bbdzjodkqhvdnbn_apy = (r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY) obj;
                if (!this.write.equals(r8lambdatq96bk0bbdzjodkqhvdnbn_apy.write)) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdatq96bk0bbdzjodkqhvdnbn_apy.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || this.serializer != r8lambdatq96bk0bbdzjodkqhvdnbn_apy.serializer || (!this.RemoteActionCompatParcelizer.equals(r8lambdatq96bk0bbdzjodkqhvdnbn_apy.RemoteActionCompatParcelizer))) {
                    return false;
                }
            } else {
                int i5 = i2 + 111;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }
}
