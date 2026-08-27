package o;

import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.VerticalIndicatorKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isSpecified4Dl_Bck implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ isSpecified4Dl_Bck(Object obj, boolean z, boolean z2, Object obj2, int i, int i2) {
        this.serializer = i2;
        this.IconCompatParcelizer = obj;
        this.write = z;
        this.read = z2;
        this.RemoteActionCompatParcelizer = obj2;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaBrowserCompatMediaItem;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.IconCompatParcelizer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            VerticalIndicatorKt.VerticalIndicator((DrawStyleSpan_androidKt) obj4, this.write, this.read, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        boolean z = this.write;
        boolean z2 = this.read;
        UnsupportedComposeAnimation.serializer((ComposeAnimationState) obj4, z, z2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
        int i6 = RatingCompat + 45;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
        return createfromparcel;
    }
}
