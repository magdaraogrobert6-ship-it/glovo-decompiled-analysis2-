package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class StateProviderImpl$special$$inlined$map$4 implements Flow {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ Flow serializer;

    public /* synthetic */ StateProviderImpl$special$$inlined$map$4(Flow flow, int i) {
        this.read = i;
        this.serializer = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 71;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Flow flow = this.serializer;
        Object obj = null;
        switch (i4) {
            case 0:
                Object objCollect = flow.collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, 27), shortNewsContentCardView);
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i5 = IconCompatParcelizer + 79;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objCollect;
            case 1:
                Object objCollect2 = flow.collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, 28), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : createfromparcel;
            case 2:
                Object objCollect3 = flow.collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, 29), shortNewsContentCardView);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : createfromparcel;
            case 3:
                Object objCollect4 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 0), shortNewsContentCardView);
                if (objCollect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i7 = IconCompatParcelizer + 107;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return objCollect4;
            case 4:
                Object objCollect5 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 8), shortNewsContentCardView);
                if (objCollect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i9 = IconCompatParcelizer + 17;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return objCollect5;
            case 5:
                Object objCollect6 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 9), shortNewsContentCardView);
                if (objCollect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i11 = IconCompatParcelizer + 37;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return objCollect6;
                }
                throw null;
            case 6:
                Object objCollect7 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 10), shortNewsContentCardView);
                if (objCollect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i12 = write + 63;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    return objCollect7;
                }
                obj.hashCode();
                throw null;
            default:
                Object objCollect8 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 11), shortNewsContentCardView);
                if (objCollect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i13 = IconCompatParcelizer + 65;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return objCollect8;
        }
    }
}
