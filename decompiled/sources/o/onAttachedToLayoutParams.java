package o;

import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.presentation.selfie.camera.SelfieCameraContentKt;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onAttachedToLayoutParams implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ setWidgetBaseline MediaMetadataCompat;
    public final /* synthetic */ onDependentViewRemoved MediaSessionCompatQueueItem;
    public final /* synthetic */ NestScreenKt$NestScreen$1$1 RatingCompat;
    public final /* synthetic */ DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 RemoteActionCompatParcelizer;
    public final /* synthetic */ NestFragment.AnonymousClass1 read;
    public final /* synthetic */ int serializer = 1;
    public final /* synthetic */ NestFragment.AnonymousClass1 write;

    public /* synthetic */ onAttachedToLayoutParams(NestFragment.AnonymousClass1 anonymousClass1, NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1, NestFragment.AnonymousClass1 anonymousClass2, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onDependentViewRemoved ondependentviewremoved, setWidgetBaseline setwidgetbaseline, androidx.compose.ui.Modifier modifier, int i) {
        this.write = anonymousClass1;
        this.RatingCompat = nestScreenKt$NestScreen$1$1;
        this.read = anonymousClass2;
        this.RemoteActionCompatParcelizer = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = ondependentviewremoved;
        this.MediaMetadataCompat = setwidgetbaseline;
        this.MediaBrowserCompatMediaItem = modifier;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ onAttachedToLayoutParams(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, NestFragment.AnonymousClass1 anonymousClass1, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, NestFragment.AnonymousClass1 anonymousClass2, NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1, onDependentViewRemoved ondependentviewremoved, setWidgetBaseline setwidgetbaseline, androidx.compose.ui.Modifier modifier, int i) {
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = anonymousClass1;
        this.RemoteActionCompatParcelizer = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
        this.read = anonymousClass2;
        this.RatingCompat = nestScreenKt$NestScreen$1$1;
        this.MediaSessionCompatQueueItem = ondependentviewremoved;
        this.MediaMetadataCompat = setwidgetbaseline;
        this.MediaBrowserCompatMediaItem = modifier;
        this.MediaDescriptionCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 63;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaDescriptionCompat;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            getScrimOpacity.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), (getBirthDateFull) obj, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.write, this.read, this.RatingCompat, this.IconCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        SelfieCameraContentKt.SelfieCameraContent(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), (getBirthDateFull) obj, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.write, this.read, this.RatingCompat, this.IconCompatParcelizer);
        int i5 = ParcelableVolumeInfo + 7;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
