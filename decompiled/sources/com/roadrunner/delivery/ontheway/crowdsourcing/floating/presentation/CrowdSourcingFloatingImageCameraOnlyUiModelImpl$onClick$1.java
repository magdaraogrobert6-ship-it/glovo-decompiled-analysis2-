package com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.InputMethodManagerImplimm2;
import o.ShortNewsContentCardView;
import o.copyYTHSh70;
import o.copyYTHSh70default;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getSendeUduSuo;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ copyYTHSh70 RemoteActionCompatParcelizer;
    public final /* synthetic */ CrowdSourcingFloatingImageCameraOnlyUiModelImpl read;
    public int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1(CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl, copyYTHSh70 copyythsh70, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = crowdSourcingFloatingImageCameraOnlyUiModelImpl;
        this.RemoteActionCompatParcelizer = copyythsh70;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        copyYTHSh70 copyythsh70 = this.RemoteActionCompatParcelizer;
        CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl = this.read;
        if (i4 == 0) {
            CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1 crowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1 = new CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1(crowdSourcingFloatingImageCameraOnlyUiModelImpl, copyythsh70, shortNewsContentCardView, 0);
            int i5 = MediaMetadataCompat + 101;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return crowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1;
        }
        CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1 crowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$2 = new CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1(crowdSourcingFloatingImageCameraOnlyUiModelImpl, copyythsh70, shortNewsContentCardView, 1);
        int i7 = MediaMetadataCompat + 29;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return crowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$2;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = IconCompatParcelizer + 125;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object obj2;
        Object objRemoteActionCompatParcelizer;
        copyYTHSh70 copyythsh70;
        int i = 2 % 2;
        int i2 = this.write;
        Object obj3 = createFromParcel.INSTANCE;
        copyYTHSh70 copyythsh71 = this.RemoteActionCompatParcelizer;
        CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl = this.read;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.serializer;
            if (i3 != 0) {
                int i4 = IconCompatParcelizer + 97;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                GetCrowdSourcingEntryPointScreenImpl getCrowdSourcingEntryPointScreenImpl = crowdSourcingFloatingImageCameraOnlyUiModelImpl.PlaybackStateCompatCustomAction;
                this.serializer = 1;
                obj = GetCrowdSourcingEntryPointScreenImpl.IconCompatParcelizer(getCrowdSourcingEntryPointScreenImpl, false, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            crowdSourcingFloatingImageCameraOnlyUiModelImpl.IconCompatParcelizer.write(new getSendeUduSuo((InputMethodManagerImplimm2) obj, copyythsh71.IconCompatParcelizer()));
            return obj3;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.serializer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = 1;
            if (CrowdSourcingFloatingImageCameraOnlyUiModelImpl.access$saveTooltipShownRecord(crowdSourcingFloatingImageCameraOnlyUiModelImpl, copyythsh71, this) != coroutineSingletons2) {
            }
            obj3 = coroutineSingletons2;
            int i6 = IconCompatParcelizer + 123;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return obj3;
        }
        int i8 = IconCompatParcelizer + 39;
        MediaMetadataCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        if (i5 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else if (i5 == 2) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            mutableStateFlow = crowdSourcingFloatingImageCameraOnlyUiModelImpl.write;
            do {
                obj2 = mutableStateFlow.read();
                objRemoteActionCompatParcelizer = (copyYTHSh70default) obj2;
                if (!(objRemoteActionCompatParcelizer instanceof copyYTHSh70)) {
                    copyythsh70 = null;
                } else {
                    int i10 = MediaMetadataCompat + 21;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    copyythsh70 = (copyYTHSh70) objRemoteActionCompatParcelizer;
                }
                if (copyythsh70 == null) {
                    int i12 = IconCompatParcelizer + 3;
                    MediaMetadataCompat = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } else {
                    objRemoteActionCompatParcelizer = copyythsh70.RemoteActionCompatParcelizer(false);
                }
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, objRemoteActionCompatParcelizer));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj3 = null;
        }
        int i14 = IconCompatParcelizer + 123;
        MediaMetadataCompat = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return obj3;
        this.serializer = 2;
        if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) == coroutineSingletons2) {
            obj3 = coroutineSingletons2;
        } else {
            mutableStateFlow = crowdSourcingFloatingImageCameraOnlyUiModelImpl.write;
            do {
                obj2 = mutableStateFlow.read();
                objRemoteActionCompatParcelizer = (copyYTHSh70default) obj2;
                if (!(objRemoteActionCompatParcelizer instanceof copyYTHSh70)) {
                    copyythsh70 = null;
                } else {
                    int i16 = MediaMetadataCompat + 21;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    copyythsh70 = (copyYTHSh70) objRemoteActionCompatParcelizer;
                }
                if (copyythsh70 == null) {
                    int i18 = IconCompatParcelizer + 3;
                    MediaMetadataCompat = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                } else {
                    objRemoteActionCompatParcelizer = copyythsh70.RemoteActionCompatParcelizer(false);
                }
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, objRemoteActionCompatParcelizer));
        }
        int i110 = IconCompatParcelizer + 123;
        MediaMetadataCompat = i110 % Fields.SpotShadowColor;
        int i111 = i110 % 2;
        return obj3;
    }
}
