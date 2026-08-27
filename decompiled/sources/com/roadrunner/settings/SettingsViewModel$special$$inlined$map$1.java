package com.roadrunner.settings;

import androidx.compose.ui.graphics.Fields;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$extractValue$1;
import com.roadrunner.map.integration.mapbox.camera.CalculateSafeAreaUseCase;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$collectRoutesUpdated$$inlined$filter$1$2;
import com.roadrunner.nafath.data.NafathTimerDataStore;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import com.roadrunner.rider.state.quests.data.QuestsCache;
import com.roadrunner.sidemenu.presentation.SideMenuViewModel;
import com.roadrunner.twofa.data.entity.TwoFaTimerDataStore$get$$inlined$map$1$2;
import com.roadrunner.vendor.review.data.cache.VendorReviewConfigCache;
import com.sentiance.core.model.events.H$b;
import io.socket.parser.IOParser$Decoder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import o.FragmentManagerLaunchedFragmentInfo;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.lambda39;
import o.logPushDeliverylambda1;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsViewModel$special$$inlined$map$1 implements Flow {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ SettingsViewModel$special$$inlined$map$1(Object obj, int i, Object obj2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        int i4 = 1;
        int i5 = 4;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        int i6 = 0;
        switch (i3) {
            case 0:
                Object objCollect = ((ChannelFlow) ((Flow) obj2)).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 26, (SettingsViewModel) obj), shortNewsContentCardView);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createfromparcel;
            case 1:
                Object objCollect2 = ((HeatmapDataStore$get$$inlined$map$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 6, (CustomerUnavailableViewModel) obj), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : createfromparcel;
            case 2:
                Object objCollect3 = ((HeatmapDataStore$get$$inlined$map$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 8, (CustomerUnavailableViewModelV2) obj), shortNewsContentCardView);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : createfromparcel;
            case 3:
                Object objCollect4 = ((Flow) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 10, (FragmentManagerLaunchedFragmentInfo) obj), shortNewsContentCardView);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : createfromparcel;
            case 4:
                Object objCollect5 = ((Flow) obj2).collect(new NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2(flowCollector, (String) obj, 0), shortNewsContentCardView);
                if (objCollect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i7 = serializer + 95;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return objCollect5;
                }
                throw null;
            case 5:
                Object objCollect6 = ((ObserveDivider$invoke$$inlined$extractValue$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 12, (SignInDataStore) obj), shortNewsContentCardView);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : createfromparcel;
            case 6:
                Object objCollect7 = ((ObserveDivider$invoke$$inlined$extractValue$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 13, (SignInDataStore) obj), shortNewsContentCardView);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : createfromparcel;
            case 7:
                Object objCollect8 = ((ObserveDivider$invoke$$inlined$extractValue$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 14, (Parser.Pair) obj), shortNewsContentCardView);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : createfromparcel;
            case 8:
                Object objCollect9 = ((ObserveDivider$invoke$$inlined$extractValue$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 15, (m) obj), shortNewsContentCardView);
                if (objCollect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i8 = serializer + 59;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return objCollect9;
            case 9:
                Object objCollect10 = ((ObserveDivider$invoke$$inlined$extractValue$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 16, (H$b) obj), shortNewsContentCardView);
                if (objCollect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i10 = serializer + 31;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 32 / 0;
                }
                return objCollect10;
            case 10:
                Object objCollect11 = ((Flow) obj2).collect(new GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2(flowCollector, (CalculateSafeAreaUseCase) obj, i5), shortNewsContentCardView);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : createfromparcel;
            case 11:
                Object objCollect12 = ((ChannelFlow) ((Flow) obj2)).collect(new MapNavigationImpl$collectRoutesUpdated$$inlined$filter$1$2(flowCollector, (MapboxNavigation) obj, 1), shortNewsContentCardView);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : createfromparcel;
            case 12:
                Object objCollect13 = ((FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 19, (NafathTimerDataStore) obj), shortNewsContentCardView);
                if (objCollect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i12 = IconCompatParcelizer + 111;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return objCollect13;
            case 13:
                Object objCollect14 = ((Flow) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 22, (QuestsCache) obj), shortNewsContentCardView);
                if (objCollect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i14 = serializer + 51;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return objCollect14;
            case 14:
                Flow[] flowArr = (Flow[]) obj2;
                Object objCombineInternal = CombineKt.combineInternal(shortNewsContentCardView, new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(i6, flowArr), new SettingsViewModel$special$$inlined$combine$1$3(shortNewsContentCardView2, (SettingsViewModel) obj, i6), flowCollector, flowArr);
                if (objCombineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i16 = serializer + 7;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                return objCombineInternal;
            case 15:
                Object objCollect15 = ((GetAppStateImpl$invoke$$inlined$map$1) obj2).collect(new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 29, (IOParser$Decoder) obj), shortNewsContentCardView);
                return objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect15 : createfromparcel;
            case 16:
                Object objCollect16 = ((Flow) obj2).collect(new TwoFaTimerDataStore$get$$inlined$map$1$2(flowCollector, (SideMenuViewModel) obj, i4), shortNewsContentCardView);
                return objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect16 : createfromparcel;
            case 17:
                Object objCollect17 = ((Flow) obj2).collect(new TwoFaTimerDataStore$get$$inlined$map$1$2(flowCollector, (lambda39) obj, i), shortNewsContentCardView);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : createfromparcel;
            case 18:
                Object objCollect18 = ((Flow) obj2).collect(new TwoFaTimerDataStore$get$$inlined$map$1$2(flowCollector, (logPushDeliverylambda1) obj, 3), shortNewsContentCardView);
                if (objCollect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i18 = IconCompatParcelizer + 31;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return objCollect18;
            case 19:
                Object objCollect19 = ((FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) obj2).collect(new TwoFaTimerDataStore$get$$inlined$map$1$2(flowCollector, (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) obj, i5), shortNewsContentCardView);
                return objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect19 : createfromparcel;
            case 20:
                Object objCollect20 = ((FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) obj2).collect(new TwoFaTimerDataStore$get$$inlined$map$1$2(flowCollector, (NafathTimerDataStore) obj, i6), shortNewsContentCardView);
                if (objCollect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i20 = IconCompatParcelizer + 75;
                serializer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 != 0) {
                    return objCollect20;
                }
                shortNewsContentCardView2.hashCode();
                throw null;
            default:
                Object objCollect21 = ((Flow) obj2).collect(new TwoFaTimerDataStore$get$$inlined$map$1$2(flowCollector, (VendorReviewConfigCache) obj, 5), shortNewsContentCardView);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : createfromparcel;
        }
    }
}
