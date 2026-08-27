package o;

import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;
import com.roadrunner.rider.state.ondemand.resumepause.OnDemandResumePauseFloatingContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getFacebookAttributionId implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaSessionCompatQueueItem;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ getFacebookAttributionId(String str, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.IconCompatParcelizer = str;
        this.serializer = z;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaSessionCompatQueueItem = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ getFacebookAttributionId(boolean z, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = z;
        this.IconCompatParcelizer = str;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaSessionCompatQueueItem = modifier;
        this.RatingCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.RatingCompat;
        if (i3 != 0) {
            ((Integer) obj2).getClass();
            EntrancePictureScreenKt.read(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), (getBirthDateFull) obj, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.serializer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        OnDemandResumePauseFloatingContentKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), (getBirthDateFull) obj, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.serializer);
        int i5 = MediaMetadataCompat + 103;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
