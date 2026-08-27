package o;

import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.face.verification.presentation.selfie.camera.SelfieCameraControlsKt;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TooltipStateImplshow2 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ Object MediaSessionCompatToken;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ TooltipStateImplshow2(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, SwitchDefaults switchDefaults, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, constructorimpl constructorimplVar, boolean z, isNotGestureActionfoundation isnotgestureactionfoundation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = lazyListState;
        this.write = switchDefaults;
        this.MediaDescriptionCompat = horizontal;
        this.MediaBrowserCompatMediaItem = vertical;
        this.MediaMetadataCompat = constructorimplVar;
        this.MediaSessionCompatQueueItem = z;
        this.RatingCompat = isnotgestureactionfoundation;
        this.MediaSessionCompatToken = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = i;
    }

    public /* synthetic */ TooltipStateImplshow2(androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, NestFragment.AnonymousClass1 anonymousClass1, NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, NestFragment.AnonymousClass1 anonymousClass2, setWidgetBaseline setwidgetbaseline, CameraImage cameraImage, boolean z, int i) {
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = anonymousClass1;
        this.MediaDescriptionCompat = nestScreenKt$NestScreen$1$1;
        this.MediaBrowserCompatMediaItem = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
        this.MediaMetadataCompat = anonymousClass2;
        this.RatingCompat = setwidgetbaseline;
        this.MediaSessionCompatToken = cameraImage;
        this.MediaSessionCompatQueueItem = z;
        this.serializer = i;
    }

    public /* synthetic */ TooltipStateImplshow2(CursorAnchorInfoApi34Helper cursorAnchorInfoApi34Helper, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, boolean z, androidx.compose.ui.Modifier modifier, int i) {
        this.IconCompatParcelizer = cursorAnchorInfoApi34Helper;
        this.write = setnavigationonclicklistener;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatToken = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.MediaSessionCompatQueueItem = z;
        this.RemoteActionCompatParcelizer = modifier;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 71;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.serializer;
        Object obj3 = this.MediaSessionCompatToken;
        Object obj4 = this.RatingCompat;
        Object obj5 = this.MediaMetadataCompat;
        Object obj6 = this.MediaBrowserCompatMediaItem;
        Object obj7 = this.MediaDescriptionCompat;
        Object obj8 = this.write;
        Object obj9 = this.IconCompatParcelizer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            androidx.compose.foundation.lazy.LazyDslKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (androidx.compose.foundation.lazy.LazyListState) obj9, (SwitchDefaults) obj8, (androidx.compose.foundation.layout.Arrangement.Horizontal) obj7, (androidx.compose.ui.Alignment.Vertical) obj6, (constructorimpl) obj5, this.MediaSessionCompatQueueItem, (isNotGestureActionfoundation) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i4 != 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            SelfieCameraControlsKt.CameraControls(this.RemoteActionCompatParcelizer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9, (NestFragment.AnonymousClass1) obj8, (NestScreenKt$NestScreen$1$1) obj7, (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj6, (NestFragment.AnonymousClass1) obj5, (setWidgetBaseline) obj4, (CameraImage) obj3, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        InAppCameraWithTagsKt.serializer((CursorAnchorInfoApi34Helper) obj9, (setNavigationOnClickListener) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, this.MediaSessionCompatQueueItem, this.RemoteActionCompatParcelizer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
        int i6 = PlaybackStateCompat + 121;
        ParcelableVolumeInfo = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        Object obj10 = null;
        obj10.hashCode();
        throw null;
    }
}
