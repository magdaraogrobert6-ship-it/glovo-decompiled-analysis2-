package o;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class a9 {
    private static int serializer = 0;
    private static int write = 1;
    public final Application read;

    public a9(Application application, int i) {
        application.getClass();
        if (i == 3) {
            this.read = application;
            return;
        }
        if (i == 4) {
            this.read = application;
            return;
        }
        if (i == 5) {
            this.read = application;
            return;
        }
        if (i == 6) {
            this.read = application;
        } else if (i != 8) {
            this.read = application;
        } else {
            this.read = application;
        }
    }

    public /* synthetic */ a9(Application application, boolean z, byte b) {
        this.read = application;
    }

    public safeSetClipToOutline IconCompatParcelizer() {
        int i = 2 % 2;
        Application application = this.read;
        android.graphics.Typeface typefaceSerializer = setLeft.serializer(application, com.logistics.rider.glovo.R.font.notosans_regular);
        android.graphics.Typeface typefaceSerializer2 = setLeft.serializer(application, com.logistics.rider.glovo.R.font.notosans_bold);
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        if (typefaceSerializer2 != null) {
            int i2 = write + 71;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        if (typefaceSerializer != null) {
            safesetcliptooutline.put("NotoSans-Regular", typefaceSerializer);
            int i4 = write + 125;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        safeSetClipToOutline safesetcliptooutlineIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
        int i6 = write + 83;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 42 / 0;
        }
        return safesetcliptooutlineIconCompatParcelizer;
    }
}
