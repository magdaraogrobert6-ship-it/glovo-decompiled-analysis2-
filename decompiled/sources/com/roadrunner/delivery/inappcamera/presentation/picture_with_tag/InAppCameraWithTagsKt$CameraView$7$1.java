package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentInsetStart;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraWithTagsKt$CameraView$7$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppCameraWithTagsKt$CameraView$7$1(boolean z, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = z;
        this.read = populateViewStructure_androidKtpopulate7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.read;
        boolean z = this.write;
        if (i4 != 0) {
            InAppCameraWithTagsKt$CameraView$7$1 inAppCameraWithTagsKt$CameraView$7$1 = new InAppCameraWithTagsKt$CameraView$7$1(z, populateViewStructure_androidKtpopulate7, shortNewsContentCardView, 1);
            inAppCameraWithTagsKt$CameraView$7$1.serializer = obj;
            return inAppCameraWithTagsKt$CameraView$7$1;
        }
        InAppCameraWithTagsKt$CameraView$7$1 inAppCameraWithTagsKt$CameraView$7$2 = new InAppCameraWithTagsKt$CameraView$7$1(z, populateViewStructure_androidKtpopulate7, shortNewsContentCardView, 0);
        inAppCameraWithTagsKt$CameraView$7$2.serializer = obj;
        int i5 = RatingCompat + 23;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return inAppCameraWithTagsKt$CameraView$7$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            ((InAppCameraWithTagsKt$CameraView$7$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((InAppCameraWithTagsKt$CameraView$7$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RemoteActionCompatParcelizer + 43;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z = this.write;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.read;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            float f = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt.read;
            getContentInsetStart getcontentinsetstart = (getContentInsetStart) populateViewStructure_androidKtpopulate7.getValue();
            if (getcontentinsetstart == null) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("InAppCameraWithTags: Torch couldn't be toggled. Camera is not initialized yet.", new Object[0]);
            } else if (getcontentinsetstart.ResultReceiver().ComponentActivity()) {
                getcontentinsetstart.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().read(z).getClass();
            } else {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("InAppCameraWithTags: Camera Flash is not available", Timber.RemoteActionCompatParcelizer);
                int i3 = RatingCompat + 119;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        float f2 = InAppCameraWithTagsKt.read;
        getContentInsetStart getcontentinsetstart2 = (getContentInsetStart) populateViewStructure_androidKtpopulate7.getValue();
        if (getcontentinsetstart2 != null) {
            int i5 = RemoteActionCompatParcelizer + 17;
            RatingCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getcontentinsetstart2.ResultReceiver().ComponentActivity();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!getcontentinsetstart2.ResultReceiver().ComponentActivity()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("InAppCameraWithTags: Camera Flash is not available", Timber.RemoteActionCompatParcelizer);
            } else {
                getcontentinsetstart2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().read(z).getClass();
            }
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("InAppCameraWithTags: Torch couldn't be toggled. Camera is not initialized yet.", new Object[0]);
        }
        return createfromparcel;
    }
}
