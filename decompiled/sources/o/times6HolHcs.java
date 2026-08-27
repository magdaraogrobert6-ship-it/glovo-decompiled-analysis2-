package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.DeliveryDetailsKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.PickUpDropOffTasksUiModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.TasksComposableV2Kt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class times6HolHcs implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ isInvalidIndex RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ times6HolHcs(PickUpDropOffTasksUiModelV2 pickUpDropOffTasksUiModelV2, takeOrElsegVKV90s takeorelsegvkv90s, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, boolean z, boolean z2, androidx.compose.ui.Modifier modifier, int i) {
        this.IconCompatParcelizer = pickUpDropOffTasksUiModelV2;
        this.serializer = takeorelsegvkv90s;
        this.RemoteActionCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.write = z;
        this.MediaSessionCompatQueueItem = z2;
        this.MediaMetadataCompat = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ times6HolHcs(String str, boolean z, boolean z2, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.IconCompatParcelizer = str;
        this.write = z;
        this.MediaSessionCompatQueueItem = z2;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.RatingCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 113;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RatingCompat;
        Object obj3 = this.MediaMetadataCompat;
        isInvalidIndex isinvalidindex = this.RemoteActionCompatParcelizer;
        Object obj4 = this.serializer;
        Object obj5 = this.IconCompatParcelizer;
        if (i4 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            DeliveryDetailsKt.DeliveryNotesSection((String) obj5, this.write, this.MediaSessionCompatQueueItem, (String) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        TasksComposableV2Kt.TasksComposableV2((PickUpDropOffTasksUiModelV2) obj5, (takeOrElsegVKV90s) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) isinvalidindex, this.write, this.MediaSessionCompatQueueItem, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i6 = MediaBrowserCompatMediaItem + 95;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
