package o;

import com.roadrunner.settings.ui.components.PreferenceItemKt;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambda_BrHbJgy26xbUfRhb7KNVM0oWTE implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatToken = 1;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ Integer MediaSessionCompatQueueItem;
    public final /* synthetic */ String RatingCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ r8lambda_BrHbJgy26xbUfRhb7KNVM0oWTE(String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, Integer num, String str3, int i, int i2) {
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = modifier;
        this.MediaSessionCompatQueueItem = num;
        this.RatingCompat = str3;
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
    }

    public /* synthetic */ r8lambda_BrHbJgy26xbUfRhb7KNVM0oWTE(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, String str2, Integer num, String str3, int i, int i2) {
        this.serializer = str;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = modifier;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaSessionCompatQueueItem = num;
        this.RatingCompat = str3;
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaDescriptionCompat;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            PreferenceItemKt.RemoteActionCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, this.read, this.MediaSessionCompatQueueItem, this.serializer, this.RemoteActionCompatParcelizer, this.RatingCompat, this.write);
            int i4 = MediaMetadataCompat + 7;
            MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        FrequentlyUsedItemKt.FrequentlyUsedItem(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, this.read, this.MediaSessionCompatQueueItem, this.serializer, this.RemoteActionCompatParcelizer, this.RatingCompat, this.write);
        int i6 = MediaMetadataCompat + 15;
        MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
