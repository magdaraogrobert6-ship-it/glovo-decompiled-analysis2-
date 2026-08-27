package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentCaptureSessionui;
import o.getContentInsetStart;
import o.getContentViewGroupParentLayout;
import o.populate;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraWithTagsKt$CameraView$6$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ populate read;
    public final /* synthetic */ float serializer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCameraWithTagsKt$CameraView$6$1(float f, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, populate populateVar, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = f;
        this.write = populateViewStructure_androidKtpopulate7;
        this.read = populateVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        InAppCameraWithTagsKt$CameraView$6$1 inAppCameraWithTagsKt$CameraView$6$1 = new InAppCameraWithTagsKt$CameraView$6$1(this.serializer, this.write, this.read, shortNewsContentCardView);
        int i2 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return inAppCameraWithTagsKt$CameraView$6$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        InAppCameraWithTagsKt$CameraView$6$1 inAppCameraWithTagsKt$CameraView$6$1 = (InAppCameraWithTagsKt$CameraView$6$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        inAppCameraWithTagsKt$CameraView$6$1.invokeSuspend(createfromparcel);
        int i4 = RemoteActionCompatParcelizer + 125;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float f = this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        float f2 = InAppCameraWithTagsKt.read;
        getContentInsetStart getcontentinsetstart = (getContentInsetStart) this.write.getValue();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (getcontentinsetstart == null) {
            int i4 = IconCompatParcelizer + 9;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return createfromparcel;
            }
            throw null;
        }
        try {
            getcontentinsetstart.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().serializer(f).getClass();
        } catch (IllegalArgumentException e) {
            Timber.RemoteActionCompatParcelizer.serializer(e, "InAppCameraWithTags: Unable to apply zoom ratio " + f, new Object[0]);
        } catch (IllegalStateException e2) {
            Timber.RemoteActionCompatParcelizer.serializer(e2, "InAppCameraWithTags: Unable to apply zoom ratio " + f, new Object[0]);
        }
        ((getContentCaptureSessionui) this.read).IconCompatParcelizer(f);
        return createfromparcel;
    }
}
