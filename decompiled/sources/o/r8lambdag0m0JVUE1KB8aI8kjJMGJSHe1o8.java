package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8 implements r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk serializer;
    public final String write;

    public r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8(String str, String str2, String str3, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z) {
        str.getClass();
        str2.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.read = str3;
        this.serializer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041 A[PHI: r1 r3
  0x0041: PHI (r1v12 int) = (r1v7 int), (r1v16 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r3v9 java.lang.String) = (r3v1 java.lang.String), (r3v11 java.lang.String) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v16 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 51;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() - 3, 72, this.write);
            str = this.read;
            if (str == null) {
                int i3 = MediaMetadataCompat + 105;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write);
            str = this.read;
            if (str == null) {
                int i5 = MediaMetadataCompat + 105;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        return Boolean.hashCode(this.IconCompatParcelizer) + ((this.serializer.hashCode() + ((iM + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 77;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AccordionUiState(title=", this.RemoteActionCompatParcelizer, ", iconUrl=", this.write, ", newTag=");
        sbM.append(this.read);
        sbM.append(", nestedItems=");
        sbM.append(this.serializer);
        sbM.append(", isExpanded=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ")");
        int i4 = MediaMetadataCompat + 43;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8)) {
            return false;
        }
        r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8 r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8 = (r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i2 = RatingCompat + 43;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.write}, getCieXyz.write())).booleanValue()) {
            int i4 = MediaMetadataCompat + 119;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.read}, getCieXyz.write())).booleanValue()) {
            int i6 = RatingCompat + 79;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.serializer}, getCieXyz.write())).booleanValue()) {
            return this.IconCompatParcelizer == r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.IconCompatParcelizer;
        }
        int i8 = MediaMetadataCompat + 9;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
