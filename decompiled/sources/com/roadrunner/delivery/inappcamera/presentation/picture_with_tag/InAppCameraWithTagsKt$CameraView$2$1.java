package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onViewAttachedToWindow;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setNavigationOnClickListener;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraWithTagsKt$CameraView$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ onViewAttachedToWindow RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ setNavigationOnClickListener write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppCameraWithTagsKt$CameraView$2$1(setNavigationOnClickListener setnavigationonclicklistener, onViewAttachedToWindow onviewattachedtowindow, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = setnavigationonclicklistener;
        this.RemoteActionCompatParcelizer = onviewattachedtowindow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        onViewAttachedToWindow onviewattachedtowindow = this.RemoteActionCompatParcelizer;
        setNavigationOnClickListener setnavigationonclicklistener = this.write;
        if (i3 == 0) {
            InAppCameraWithTagsKt$CameraView$2$1 inAppCameraWithTagsKt$CameraView$2$1 = new InAppCameraWithTagsKt$CameraView$2$1(setnavigationonclicklistener, onviewattachedtowindow, shortNewsContentCardView, 0);
            inAppCameraWithTagsKt$CameraView$2$1.IconCompatParcelizer = obj;
            int i4 = MediaBrowserCompatMediaItem + 99;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return inAppCameraWithTagsKt$CameraView$2$1;
            }
            throw null;
        }
        InAppCameraWithTagsKt$CameraView$2$1 inAppCameraWithTagsKt$CameraView$2$2 = new InAppCameraWithTagsKt$CameraView$2$1(setnavigationonclicklistener, onviewattachedtowindow, shortNewsContentCardView, 1);
        inAppCameraWithTagsKt$CameraView$2$2.IconCompatParcelizer = obj;
        int i5 = MediaBrowserCompatMediaItem + 79;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return inAppCameraWithTagsKt$CameraView$2$2;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 != 0) {
            Object objInvokeSuspend = ((InAppCameraWithTagsKt$CameraView$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = MediaBrowserCompatMediaItem + 35;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        Object objInvokeSuspend2 = ((InAppCameraWithTagsKt$CameraView$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaDescriptionCompat + 39;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        setNavigationOnClickListener setnavigationonclicklistener = this.write;
        onViewAttachedToWindow onviewattachedtowindow = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.read;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.IconCompatParcelizer = getcontentviewgroupparentlayout;
                this.read = 1;
                if (DelayKt.delay(300L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            YieldKt.IconCompatParcelizer(getcontentviewgroupparentlayout);
            int iMediaSessionCompatResultReceiverWrapper = setnavigationonclicklistener.MediaSessionCompatResultReceiverWrapper();
            float f = InAppCameraWithTagsKt.read;
            if (iMediaSessionCompatResultReceiverWrapper == ((Number) onviewattachedtowindow.getValue()).intValue()) {
                return createfromparcel;
            }
            setnavigationonclicklistener.read(((Number) onviewattachedtowindow.getValue()).intValue());
            return createfromparcel;
        }
        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = getcontentviewgroupparentlayout2;
            this.read = 1;
            if (DelayKt.delay(300L, this) == coroutineSingletons2) {
                int i7 = MediaDescriptionCompat + 105;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons2;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i9 = MediaBrowserCompatMediaItem + 97;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i11 = MediaDescriptionCompat + 125;
            MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        YieldKt.IconCompatParcelizer(getcontentviewgroupparentlayout2);
        int iMediaSessionCompatResultReceiverWrapper2 = setnavigationonclicklistener.MediaSessionCompatResultReceiverWrapper();
        float f2 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt.read;
        if (iMediaSessionCompatResultReceiverWrapper2 == ((Number) onviewattachedtowindow.getValue()).intValue()) {
            return createfromparcel;
        }
        int i13 = MediaBrowserCompatMediaItem + 19;
        MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        setnavigationonclicklistener.read(((Number) onviewattachedtowindow.getValue()).intValue());
        return createfromparcel;
    }
}
