package o;

import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.compose.ConfirmButtonContentKt;
import com.roadrunner.rrds.compose.component.forms.ToggleKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class extractJsonInt implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaMetadataCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ extractJsonInt(String str, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.write = str;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaBrowserCompatMediaItem;
        if (i4 != 0) {
            ((Integer) obj2).getClass();
            ConfirmButtonContentKt.serializer(this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.MediaMetadataCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            int i6 = MediaDescriptionCompat + 61;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        ToggleKt.ToggleCell(this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.MediaMetadataCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i8 = MediaDescriptionCompat + 59;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 61 / 0;
        }
        return createfromparcel;
    }
}
