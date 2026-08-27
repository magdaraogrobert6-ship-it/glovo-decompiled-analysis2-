package o;

import com.roadrunner.settings.ui.components.PreferenceItemKt;
import com.roadrunner.settings.ui.components.SettingsCardKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaaZeww41FyAYboAqgx1AJ5KYAyU implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaMetadataCompat;
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer = 0;
    public final /* synthetic */ String write;

    public /* synthetic */ r8lambdaaZeww41FyAYboAqgx1AJ5KYAyU(int i, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = modifier;
        this.MediaSessionCompatQueueItem = i2;
    }

    public /* synthetic */ r8lambdaaZeww41FyAYboAqgx1AJ5KYAyU(String str, int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, String str2, String str3, int i2) {
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = modifier;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.MediaSessionCompatQueueItem = i2;
    }

    public /* synthetic */ r8lambdaaZeww41FyAYboAqgx1AJ5KYAyU(String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, androidx.compose.ui.Modifier modifier, int i2) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = i;
        this.MediaMetadataCompat = modifier;
        this.MediaSessionCompatQueueItem = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 61;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaSessionCompatQueueItem;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            SettingsCardKt.SettingsCard(this.read, iRemoteActionCompatParcelizer, (getBirthDateFull) obj, this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.MediaBrowserCompatMediaItem);
            return createfromparcel;
        }
        if (i4 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            getOnEventTrackingSucceededListener.serializer(this.read, iRemoteActionCompatParcelizer2, (getBirthDateFull) obj, this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.MediaBrowserCompatMediaItem);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        PreferenceItemKt.write(this.read, iRemoteActionCompatParcelizer3, (getBirthDateFull) obj, this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.MediaBrowserCompatMediaItem);
        int i6 = RatingCompat + 67;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return createfromparcel;
    }
}
