package com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveImageSharingUiState$invoke$$inlined$map$1 implements Flow {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ ObserveDivider$invoke$$inlined$map$1 IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ ObserveImageSharingUiState$invoke$$inlined$map$1(ObserveDivider$invoke$$inlined$map$1 observeDivider$invoke$$inlined$map$1, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = observeDivider$invoke$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ObserveDivider$invoke$$inlined$map$1 observeDivider$invoke$$inlined$map$1 = this.IconCompatParcelizer;
        if (i2 == 0) {
            Object objCollect = observeDivider$invoke$$inlined$map$1.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 19), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel;
            }
            int i3 = read;
            int i4 = i3 + 19;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            int i6 = i3 + 89;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return objCollect;
        }
        if (i2 == 1) {
            Object objCollect2 = observeDivider$invoke$$inlined$map$1.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 13), shortNewsContentCardView);
            if (objCollect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel;
            }
            int i8 = read + 81;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 81 / 0;
            }
            return objCollect2;
        }
        if (i2 == 2) {
            Object objCollect3 = observeDivider$invoke$$inlined$map$1.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 18), shortNewsContentCardView);
            return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : createfromparcel;
        }
        Object objCollect4 = observeDivider$invoke$$inlined$map$1.collect(new ObserveTagsUiState$invoke$$inlined$map$1$2(flowCollector, 20), shortNewsContentCardView);
        if (objCollect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createfromparcel;
        }
        int i10 = read + 29;
        write = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return objCollect4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
