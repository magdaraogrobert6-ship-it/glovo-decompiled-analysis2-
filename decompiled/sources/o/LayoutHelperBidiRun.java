package o;

import com.google.android.play.core.appupdate.zzz;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutHelperBidiRun implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    private static int read = 1;
    private static int serializer;
    public static final LayoutHelperBidiRun write = new LayoutHelperBidiRun(1);
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ LayoutHelperBidiRun(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    static {
        int i = IconCompatParcelizer + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = serializer + 35;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return new zzz(new access500());
        }
        if (i4 == 1) {
            return new getParagraphEnd();
        }
        analyzeBidi analyzebidi = new analyzeBidi(new access500());
        int i5 = serializer + 107;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return analyzebidi;
    }
}
