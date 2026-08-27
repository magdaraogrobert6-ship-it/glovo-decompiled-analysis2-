package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class a4 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final RectListDebuggerModifierNode IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final androidx.compose.ui.text.AnnotatedString RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a4(String str, String str2, String str3, String str4, androidx.compose.ui.text.AnnotatedString annotatedString, RectListDebuggerModifierNode rectListDebuggerModifierNode, int i) {
        String str5;
        String str6;
        String str7;
        if ((i & 2) != 0) {
            int i2 = MediaMetadataCompat + 61;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            } else {
                int i4 = 2 % 2;
            }
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 4) != 0) {
            int i5 = RatingCompat + 121;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        String str8 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            int i7 = 2 % 2;
            str7 = "";
        } else {
            str7 = str4;
        }
        this(false, str5, str6, str8, str7, (i & 32) != 0 ? new androidx.compose.ui.text.AnnotatedString("", null, 2, null) : annotatedString, (i & 64) != 0 ? new RectListDebuggerModifierNode(null, 3) : rectListDebuggerModifierNode);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 71;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.MediaBrowserCompatMediaItem) * 31, 31, this.MediaDescriptionCompat), 31, this.serializer), 31, this.read), 31, this.write);
        int iHashCode = this.IconCompatParcelizer.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + iM) * 31);
        int i4 = MediaMetadataCompat + 103;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return iHashCode;
    }

    public static a4 serializer(a4 a4Var, boolean z, RectListDebuggerModifierNode rectListDebuggerModifierNode, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 75;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            z = a4Var.MediaBrowserCompatMediaItem;
        }
        boolean z2 = z;
        String str = a4Var.MediaDescriptionCompat;
        String str2 = a4Var.serializer;
        String str3 = a4Var.read;
        String str4 = a4Var.write;
        androidx.compose.ui.text.AnnotatedString annotatedString = a4Var.RemoteActionCompatParcelizer;
        if ((i & 64) != 0) {
            int i6 = i4 + 9;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            rectListDebuggerModifierNode = a4Var.IconCompatParcelizer;
            int i8 = i4 + 77;
            RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        RectListDebuggerModifierNode rectListDebuggerModifierNode2 = rectListDebuggerModifierNode;
        a4Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        annotatedString.getClass();
        rectListDebuggerModifierNode2.getClass();
        return new a4(z2, str, str2, str3, str4, annotatedString, rectListDebuggerModifierNode2);
    }

    public a4(boolean z, String str, String str2, String str3, String str4, androidx.compose.ui.text.AnnotatedString annotatedString, RectListDebuggerModifierNode rectListDebuggerModifierNode) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        annotatedString.getClass();
        rectListDebuggerModifierNode.getClass();
        this.MediaBrowserCompatMediaItem = z;
        this.MediaDescriptionCompat = str;
        this.serializer = str2;
        this.read = str3;
        this.write = str4;
        this.RemoteActionCompatParcelizer = annotatedString;
        this.IconCompatParcelizer = rectListDebuggerModifierNode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CheckEmailViewState(showLoading=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", title=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", requestEmailIntro=");
        c8$$ExternalSyntheticOutline0.m(sb, this.serializer, ", requestAgain=", this.read, ", btnPrimaryText=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append((Object) this.RemoteActionCompatParcelizer);
        sb.append(", countDownState=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        String string = sb.toString();
        int i2 = RatingCompat + 45;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 83;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof a4))) {
            a4 a4Var = (a4) obj;
            if (this.MediaBrowserCompatMediaItem != a4Var.MediaBrowserCompatMediaItem) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, a4Var.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, a4Var.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, a4Var.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, a4Var.write}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, a4Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    int i3 = RatingCompat + 121;
                    MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i3 % 2 != 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, a4Var.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i4 = MediaMetadataCompat + 119;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        }
        return false;
    }
}
