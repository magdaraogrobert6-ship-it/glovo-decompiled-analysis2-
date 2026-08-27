package com.roadrunner.home.nest;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class NestLoadingServiceImpl$special$$inlined$map$1 implements Flow {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ Flow read;
    public final /* synthetic */ int write;

    public /* synthetic */ NestLoadingServiceImpl$special$$inlined$map$1(Flow flow, int i) {
        this.write = i;
        this.read = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Flow flow = this.read;
        int i4 = 29;
        int i5 = 26;
        int i6 = 28;
        int i7 = 5;
        int i8 = 27;
        int i9 = 16;
        int i10 = 9;
        Object obj = null;
        switch (i3) {
            case 0:
                Object objCollect = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 17), shortNewsContentCardView);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createfromparcel;
            case 1:
                Object objCollect2 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : createfromparcel;
            case 2:
                Object objCollect3 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i7), shortNewsContentCardView);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : createfromparcel;
            case 3:
                Object objCollect4 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 6), shortNewsContentCardView);
                if (objCollect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i11 = serializer + 103;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return objCollect4;
            case 4:
                Object objCollect5 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 8), shortNewsContentCardView);
                if (objCollect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i13 = serializer + 59;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    int i14 = 16 / 0;
                }
                return objCollect5;
            case 5:
                Object objCollect6 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i10), shortNewsContentCardView);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : createfromparcel;
            case 6:
                Object objCollect7 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 10), shortNewsContentCardView);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : createfromparcel;
            case 7:
                Object objCollect8 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 14), shortNewsContentCardView);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : createfromparcel;
            case 8:
                Object objCollect9 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i9), shortNewsContentCardView);
                if (objCollect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i15 = IconCompatParcelizer + 51;
                serializer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    return objCollect9;
                }
                obj.hashCode();
                throw null;
            case 9:
                Object objCollect10 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 18), shortNewsContentCardView);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : createfromparcel;
            case 10:
                Object objCollect11 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 20), shortNewsContentCardView);
                if (objCollect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i16 = serializer + 113;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    return objCollect11;
                }
                obj.hashCode();
                throw null;
            case 11:
                Object objCollect12 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 22), shortNewsContentCardView);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : createfromparcel;
            case 12:
                Object objCollect13 = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i6), shortNewsContentCardView);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : createfromparcel;
            case 13:
                Object objCollect14 = flow.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, i10), shortNewsContentCardView);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : createfromparcel;
            case 14:
                Object objCollect15 = flow.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 11), shortNewsContentCardView);
                if (objCollect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i17 = serializer + 31;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    int i18 = 52 / 0;
                }
                return objCollect15;
            case 15:
                Object objCollect16 = flow.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 23), shortNewsContentCardView);
                if (objCollect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i19 = serializer + 119;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    return objCollect16;
                }
                throw null;
            case 16:
                Object objCollect17 = flow.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, i5), shortNewsContentCardView);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : createfromparcel;
            case 17:
                Object objCollect18 = flow.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, i8), shortNewsContentCardView);
                if (objCollect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i20 = IconCompatParcelizer + 31;
                serializer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                return objCollect18;
            case 18:
                Object objCollect19 = flow.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, i6), shortNewsContentCardView);
                return objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect19 : createfromparcel;
            case 19:
                Object objCollect20 = flow.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, i4), shortNewsContentCardView);
                return objCollect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect20 : createfromparcel;
            case 20:
                Object objCollect21 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 3), shortNewsContentCardView);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : createfromparcel;
            case 21:
                Object objCollect22 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 4), shortNewsContentCardView);
                return objCollect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect22 : createfromparcel;
            case 22:
                Object objCollect23 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i7), shortNewsContentCardView);
                return objCollect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect23 : createfromparcel;
            case 23:
                Object objCollect24 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i10), shortNewsContentCardView);
                if (objCollect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i22 = IconCompatParcelizer + 27;
                serializer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                return objCollect24;
            case 24:
                Object objCollect25 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 12), shortNewsContentCardView);
                if (objCollect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i24 = serializer + 105;
                IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                return objCollect25;
            case 25:
                Object objCollect26 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i9), shortNewsContentCardView);
                return objCollect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect26 : createfromparcel;
            case 26:
                Object objCollect27 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i5), shortNewsContentCardView);
                return objCollect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect27 : createfromparcel;
            case 27:
                Object objCollect28 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i8), shortNewsContentCardView);
                return objCollect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect28 : createfromparcel;
            case 28:
                Object objCollect29 = flow.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i4), shortNewsContentCardView);
                return objCollect29 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect29 : createfromparcel;
            default:
                Object objCollect30 = flow.collect(new GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i), shortNewsContentCardView);
                if (objCollect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i26 = serializer + 81;
                IconCompatParcelizer = i26 % Fields.SpotShadowColor;
                int i27 = i26 % 2;
                return objCollect30;
        }
    }
}
