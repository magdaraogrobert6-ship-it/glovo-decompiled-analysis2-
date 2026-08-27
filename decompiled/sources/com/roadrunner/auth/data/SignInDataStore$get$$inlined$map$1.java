package com.roadrunner.auth.data;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import androidx.compose.ui.graphics.Fields;
import coil3.ImageLoader$Builder;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.roadrunner.auth.domain.state.GetUserAuthStateImpl;
import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1;
import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.ObserveImageSharingUiState$invoke$$inlined$map$1;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.ObserveContentSharingConfig$invoke$$inlined$map$1$2;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.upload.usecases.ObserveUploadCompletionUseCase;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.UtccTaskStateRepositoryImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.TextInputServiceAndroid_androidKtExternalSyntheticLambda1;
import o.accessgetFalseyp;
import o.copy3r_uNRQdefault;
import o.createFromParcel;
import o.gapLength;
import o.getComposePaint;
import o.getLayoutannotations;
import o.isPunctuationui_text;
import o.isRoot;
import o.r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I;
import o.setSpan;
import o.setTextIndent;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInDataStore$get$$inlined$map$1 implements Flow {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ Flow RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ SignInDataStore$get$$inlined$map$1(Flow flow, Object obj, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = flow;
        this.read = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        Object obj = createFromParcel.INSTANCE;
        Object obj2 = this.read;
        Flow flow = this.RemoteActionCompatParcelizer;
        int i4 = 3;
        int i5 = 25;
        int i6 = 1;
        int i7 = 7;
        int i8 = 6;
        int i9 = 8;
        int i10 = 24;
        Object obj3 = null;
        switch (i3) {
            case 0:
                Object objCollect = ((FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) flow).collect(new ThumbNode$onAttach$1$1(flowCollector, i9, (SignInDataStore) obj2), shortNewsContentCardView);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : obj;
            case 1:
                Object objCollect2 = flow.collect(new ThumbNode$onAttach$1$1(flowCollector, i8, (String[]) obj2), shortNewsContentCardView);
                if (objCollect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i11 = IconCompatParcelizer + 35;
                int i12 = i11 % Fields.SpotShadowColor;
                serializer = i12;
                int i13 = i11 % 2;
                int i14 = i12 + 117;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return objCollect2;
            case 2:
                Object objCollect3 = flow.collect(new ThumbNode$onAttach$1$1(flowCollector, i7, (ImageLoader$Builder) obj2), shortNewsContentCardView);
                if (objCollect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i16 = serializer + 3;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    return objCollect3;
                }
                obj3.hashCode();
                throw null;
            case 3:
                Object objCollect4 = flow.collect(new ThumbNode$onAttach$1$1(flowCollector, 10, (GetUserAuthStateImpl) obj2), shortNewsContentCardView);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : obj;
            case 4:
                Object objCollect5 = ((FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) flow).collect(new HeatmapDataStore$getBoolean$$inlined$map$1.AnonymousClass2(flowCollector, (isRoot) obj2, i6), shortNewsContentCardView);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : obj;
            case 5:
                Object objCollect6 = ((SignInDataStore$get$$inlined$map$1) flow).collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, (getLayoutannotations) obj2, i10), shortNewsContentCardView);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : obj;
            case 6:
                Object objCollect7 = flow.collect(new ThumbNode$onAttach$1$1(flowCollector, 17, (RecentLastStopsDatastoreImpl) obj2), shortNewsContentCardView);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : obj;
            case 7:
                Object objCollect8 = ((ObserveDeliveryInformation$invoke$$inlined$map$1) flow).collect(new ThumbNode$onAttach$1$1(flowCollector, 18, (isPunctuationui_text) obj2), shortNewsContentCardView);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : obj;
            case 8:
                Object objCollect9 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ThumbNode$onAttach$1$1(flowCollector, 20, (gapLength) obj2), shortNewsContentCardView);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : obj;
            case 9:
                Object objCollect10 = flow.collect(new ThumbNode$onAttach$1$1(flowCollector, 22, (CrowdSourcingFloatingImageCameraOnlyUiModelImpl) obj2), shortNewsContentCardView);
                if (objCollect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i17 = IconCompatParcelizer + 43;
                serializer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                return objCollect10;
            case 10:
                Object objCollect11 = flow.collect(new ThumbNode$onAttach$1$1(flowCollector, 23, (g0) obj2), shortNewsContentCardView);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : obj;
            case 11:
                Object objCollect12 = flow.collect(new ThumbNode$onAttach$1$1(flowCollector, i10, (SignInDataStore) obj2), shortNewsContentCardView);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : obj;
            case 12:
                Object objCollect13 = ((ObserveImageSharingUiState$invoke$$inlined$map$1) flow).collect(new ObserveContentSharingConfig$invoke$$inlined$map$1$2(flowCollector, (copy3r_uNRQdefault) obj2, 0), shortNewsContentCardView);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : obj;
            case 13:
                Object objCollect14 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, (ObserveUploadCompletionUseCase) obj2, 21), shortNewsContentCardView);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : obj;
            case 14:
                Object objCollect15 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, (TextInputServiceAndroid_androidKtExternalSyntheticLambda1) obj2, i10), shortNewsContentCardView);
                if (objCollect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i19 = serializer + 73;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    return objCollect15;
                }
                obj3.hashCode();
                throw null;
            case 15:
                Object objCollect16 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, (SendTestPushUseCase) obj2, i5), shortNewsContentCardView);
                return objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect16 : obj;
            case 16:
                Object objCollect17 = ((HeatmapDataStore$get$$inlined$map$1) flow).collect(new ThumbNode$onAttach$1$1(flowCollector, i5, (SignInDataStore) obj2), shortNewsContentCardView);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : obj;
            case 17:
                Object objCollect18 = flow.collect(new ThumbNode$onAttach$1$1(flowCollector, 26, (m) obj2), shortNewsContentCardView);
                if (objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj = objCollect18;
                }
                int i20 = serializer + 69;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                return obj;
            case 18:
                Object objCollect19 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ThumbNode$onAttach$1$1(flowCollector, 27, (getComposePaint) obj2), shortNewsContentCardView);
                if (objCollect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i22 = IconCompatParcelizer + 15;
                serializer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                return objCollect19;
            case 19:
                Object objCollect20 = ((NestLoadingServiceImpl$special$$inlined$map$1) flow).collect(new ThumbNode$onAttach$1$1(flowCollector, 29, (accessgetFalseyp) obj2), shortNewsContentCardView);
                return objCollect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect20 : obj;
            case 20:
                Object objCollect21 = flow.collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, i6, (setSpan) obj2), shortNewsContentCardView);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : obj;
            case 21:
                Object objCollect22 = flow.collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, i, (setTextIndent) obj2), shortNewsContentCardView);
                return objCollect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect22 : obj;
            case 22:
                Object objCollect23 = ((SettingsViewModel$special$$inlined$map$1) flow).collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, (SendTestPushUseCase) obj2, i), shortNewsContentCardView);
                return objCollect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect23 : obj;
            case 23:
                Object objCollect24 = flow.collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, i4, (r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I) obj2), shortNewsContentCardView);
                return objCollect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect24 : obj;
            case 24:
                Object objCollect25 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, (SendTestPushUseCase) obj2, i8), shortNewsContentCardView);
                return objCollect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect25 : obj;
            case 25:
                Object objCollect26 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, (SendTestPushUseCase) obj2, i7), shortNewsContentCardView);
                if (objCollect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i24 = IconCompatParcelizer + 69;
                serializer = i24 % Fields.SpotShadowColor;
                if (i24 % 2 == 0) {
                    return objCollect26;
                }
                obj3.hashCode();
                throw null;
            case 26:
                Object objCollect27 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, (SendTestPushUseCase) obj2, i9), shortNewsContentCardView);
                return objCollect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect27 : obj;
            case 27:
                Object objCollect28 = ((ObserveDivider$invoke$$inlined$map$1) flow).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 4, (Parser.Pair) obj2), shortNewsContentCardView);
                return objCollect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect28 : obj;
            case 28:
                Object objCollect29 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, (SendTestPushUseCase) obj2, 11), shortNewsContentCardView);
                return objCollect29 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect29 : obj;
            default:
                Object objCollect30 = ((HeatmapDataStore$getBoolean$$inlined$map$1) flow).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 5, (UtccTaskStateRepositoryImpl) obj2), shortNewsContentCardView);
                if (objCollect30 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    int i25 = serializer + 121;
                    IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    obj = objCollect30;
                }
                int i27 = serializer + 33;
                IconCompatParcelizer = i27 % Fields.SpotShadowColor;
                if (i27 % 2 != 0) {
                    return obj;
                }
                throw null;
        }
    }
}
