package com.roadrunner.home.nest.divider;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveDivider$invoke$$inlined$extractValue$1 implements Flow {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ SettingsViewModel$special$$inlined$map$1 serializer;

    public /* synthetic */ ObserveDivider$invoke$$inlined$extractValue$1(SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$1, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = settingsViewModel$special$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 13;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$1 = this.serializer;
        int i5 = 21;
        int i6 = 25;
        switch (i4) {
            case 0:
                Object objCollect = settingsViewModel$special$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 18), shortNewsContentCardView);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createfromparcel;
            case 1:
                Object objCollect2 = settingsViewModel$special$$inlined$map$1.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 7), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : createfromparcel;
            case 2:
                Object objCollect3 = settingsViewModel$special$$inlined$map$1.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, i6), shortNewsContentCardView);
                if (objCollect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i7 = read + 51;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return objCollect3;
            case 3:
                Object objCollect4 = settingsViewModel$special$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 20), shortNewsContentCardView);
                if (objCollect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i9 = write + 71;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 91 / 0;
                }
                return objCollect4;
            case 4:
                Object objCollect5 = settingsViewModel$special$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i5), shortNewsContentCardView);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : createfromparcel;
            case 5:
                Object objCollect6 = settingsViewModel$special$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 22), shortNewsContentCardView);
                if (objCollect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i11 = read + 115;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return objCollect6;
            case 6:
                Object objCollect7 = settingsViewModel$special$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 23), shortNewsContentCardView);
                if (objCollect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i13 = write + 85;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return objCollect7;
            case 7:
                Object objCollect8 = settingsViewModel$special$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 24), shortNewsContentCardView);
                if (objCollect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i15 = write + 73;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                return objCollect8;
            default:
                Object objCollect9 = settingsViewModel$special$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, i6), shortNewsContentCardView);
                if (objCollect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i17 = write + 21;
                read = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    int i18 = 85 / 0;
                }
                return objCollect9;
        }
    }
}
