package o;

import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardComponentsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class refreshFeatureFlags implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ isInvalidIndex RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ refreshFeatureFlags(Object obj, isInvalidIndex isinvalidindex, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.read = obj;
        this.RemoteActionCompatParcelizer = isinvalidindex;
        this.write = modifier;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.serializer;
        androidx.compose.ui.Modifier modifier = this.write;
        isInvalidIndex isinvalidindex = this.RemoteActionCompatParcelizer;
        Object obj3 = this.read;
        if (i2 != 0) {
            ((Integer) obj2).getClass();
            ActionableMessageCardComponentsKt.CustomerHeaderRow((recordmLhObY) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = RatingCompat + 49;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        removeSingleSubscription.IconCompatParcelizer((logPushDeliveryandroid_sdk_base_release) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) isinvalidindex, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i6 = MediaMetadataCompat + 35;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 47 / 0;
        }
        return createfromparcel;
    }
}
