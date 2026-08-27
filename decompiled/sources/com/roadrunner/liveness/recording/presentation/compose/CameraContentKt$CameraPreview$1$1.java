package com.roadrunner.liveness.recording.presentation.compose;

import android.content.Context;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidEdgeEffectOverscrollEffect;
import o.AuthenticatorUtils;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.createFromParcel;
import o.getCameraProvider;
import o.getContentViewGroupParentLayout;
import o.getLogoDescription;
import o.getWrapper;
import o.isItemDismissable;
import o.minIntrinsicWidth;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setNavigationOnClickListener;
import o.toColorLong8_81llA;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraContentKt$CameraPreview$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ getLogoDescription IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect MediaMetadataCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public final /* synthetic */ getWrapper RemoteActionCompatParcelizer;
    public final /* synthetic */ Context read;
    public final /* synthetic */ accessisRenderNodeCompatiblecp serializer;
    public final /* synthetic */ setNavigationOnClickListener write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraContentKt$CameraPreview$1$1(Context context, getLogoDescription getlogodescription, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getWrapper getwrapper, setNavigationOnClickListener setnavigationonclicklistener, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = context;
        this.IconCompatParcelizer = getlogodescription;
        this.serializer = accessisrendernodecompatiblecp;
        this.RemoteActionCompatParcelizer = getwrapper;
        this.write = setnavigationonclicklistener;
        this.MediaMetadataCompat = androidEdgeEffectOverscrollEffect;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((CameraContentKt$CameraPreview$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = RatingCompat + 103;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CameraContentKt$CameraPreview$1$1 cameraContentKt$CameraPreview$1$1 = new CameraContentKt$CameraPreview$1$1(this.read, this.IconCompatParcelizer, this.serializer, this.RemoteActionCompatParcelizer, this.write, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 111;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return cameraContentKt$CameraPreview$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$getCameraProvider;
        int i = 2 % 2;
        int i2 = RatingCompat + 33;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.MediaDescriptionCompat;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.MediaDescriptionCompat = 1;
                objAccess$getCameraProvider = CameraContentKt.access$getCameraProvider(this.read, this);
                if (objAccess$getCameraProvider == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objAccess$getCameraProvider = ((onItemDismiss) obj).IconCompatParcelizer;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getLogoDescription getlogodescription = this.IconCompatParcelizer;
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.serializer;
            getWrapper getwrapper = this.RemoteActionCompatParcelizer;
            setNavigationOnClickListener setnavigationonclicklistener = this.write;
            boolean z = objAccess$getCameraProvider instanceof isItemDismissable;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.MediaSessionCompatQueueItem;
            if (!z) {
                minIntrinsicWidth minintrinsicwidth = (minIntrinsicWidth) objAccess$getCameraProvider;
                AuthenticatorUtils authenticatorUtilsIconCompatParcelizer = new getCameraProvider(0).IconCompatParcelizer();
                AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.MediaMetadataCompat;
                authenticatorUtilsIconCompatParcelizer.IconCompatParcelizer(androidEdgeEffectOverscrollEffect.getSurfaceProvider());
                try {
                    minintrinsicwidth.read();
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.write(new CameraException("Failed to unbind use cases from camera provider", e));
                }
                try {
                    boolean z2 = minintrinsicwidth.read(getlogodescription);
                    int i4 = RatingCompat + 39;
                    int i5 = i4 % Fields.SpotShadowColor;
                    MediaBrowserCompatMediaItem = i5;
                    int i6 = i4 % 2;
                    if (z2) {
                        int i7 = i5 + 51;
                        RatingCompat = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        try {
                            if (((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.CREATED)) {
                                minintrinsicwidth.RemoteActionCompatParcelizer(accessisrendernodecompatiblecp, getlogodescription, authenticatorUtilsIconCompatParcelizer, getwrapper, setnavigationonclicklistener);
                                authenticatorUtilsIconCompatParcelizer.IconCompatParcelizer(androidEdgeEffectOverscrollEffect.getSurfaceProvider());
                            }
                        } catch (RuntimeException e2) {
                            Timber.RemoteActionCompatParcelizer.write(new CameraException("Failed to bind use cases from camera provider", e2));
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(e2);
                        }
                    } else {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Camera is unavailable!", new Object[0]);
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new CameraException("Camera is unavailable!", null));
                    }
                } catch (CameraInfoUnavailableException e3) {
                    Timber.RemoteActionCompatParcelizer.write(new CameraException("Camera is unavailable!", e3));
                }
            }
            Throwable thSerializer = onItemDismiss.serializer(objAccess$getCameraProvider);
            if (thSerializer != null) {
                Timber.RemoteActionCompatParcelizer.write(new CameraException("Camera is unavailable", thSerializer));
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(thSerializer);
            }
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        throw null;
    }
}
