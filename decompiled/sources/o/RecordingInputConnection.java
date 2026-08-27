package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordingInputConnection implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.ScrollState IconCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ RecordingInputConnection(androidx.compose.foundation.ScrollState scrollState, boolean z, int i, int i2) {
        this.serializer = i2;
        this.IconCompatParcelizer = scrollState;
        this.read = z;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.write;
        boolean z = this.read;
        androidx.compose.foundation.ScrollState scrollState = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).intValue();
        if (i4 != 0) {
            EntrancePictureScreenKt.IconCompatParcelizer(scrollState, z, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        GalleryScreenKt.IconCompatParcelizer(scrollState, z, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = RemoteActionCompatParcelizer + 53;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
