package o;

import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.presentation.selfie.review.ReviewSelfieContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onRequestChildRectangleOnScreen implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 IconCompatParcelizer;
    public final /* synthetic */ DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaMetadataCompat;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ onDependentViewRemoved serializer;
    public final /* synthetic */ DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 write;

    public /* synthetic */ onRequestChildRectangleOnScreen(onDependentViewRemoved ondependentviewremoved, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = ondependentviewremoved;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
        this.IconCompatParcelizer = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2;
        this.MediaBrowserCompatMediaItem = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3;
        this.MediaMetadataCompat = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ onRequestChildRectangleOnScreen(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, onDependentViewRemoved ondependentviewremoved, androidx.compose.ui.Modifier modifier, int i) {
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
        this.IconCompatParcelizer = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2;
        this.MediaBrowserCompatMediaItem = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3;
        this.serializer = ondependentviewremoved;
        this.MediaMetadataCompat = modifier;
        this.RatingCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 113;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RatingCompat;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            onInterceptTouchEvent.read(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), (getBirthDateFull) obj, this.MediaMetadataCompat, this.write, this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, this.serializer, this.read);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        ReviewSelfieContentKt.ReviewSelfieContent(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), (getBirthDateFull) obj, this.MediaMetadataCompat, this.write, this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, this.serializer, this.read);
        int i6 = MediaDescriptionCompat + 35;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
