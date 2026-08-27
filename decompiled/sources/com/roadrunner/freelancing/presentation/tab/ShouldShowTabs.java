package com.roadrunner.freelancing.presentation.tab;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.WindowInsetsCompatImpl31;
import o.subscribeToBannersUpdateslambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class ShouldShowTabs {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final GetStatusUseCaseImpl IconCompatParcelizer;
    public final subscribeToBannersUpdateslambda2 serializer;

    public ShouldShowTabs(GetStatusUseCaseImpl getStatusUseCaseImpl, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2) {
        this.IconCompatParcelizer = getStatusUseCaseImpl;
        this.serializer = subscribetobannersupdateslambda2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        WindowInsetsCompatImpl31 windowInsetsCompatImpl31;
        int i = 2 % 2;
        int i2 = read + 85;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof WindowInsetsCompatImpl31;
            obj.hashCode();
            throw null;
        }
        if (!(continuationImpl instanceof WindowInsetsCompatImpl31)) {
            windowInsetsCompatImpl31 = new WindowInsetsCompatImpl31(this, continuationImpl);
        } else {
            windowInsetsCompatImpl31 = (WindowInsetsCompatImpl31) continuationImpl;
            int i3 = windowInsetsCompatImpl31.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                windowInsetsCompatImpl31.read = i3 - Integer.MIN_VALUE;
            } else {
                windowInsetsCompatImpl31 = new WindowInsetsCompatImpl31(this, continuationImpl);
            }
        }
        Object obj2 = windowInsetsCompatImpl31.serializer;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = windowInsetsCompatImpl31.read;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            windowInsetsCompatImpl31.read = 1;
            obj2 = this.IconCompatParcelizer.read();
            if (obj2 == obj3) {
                int i5 = read + 87;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return obj3;
                }
                throw null;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = RemoteActionCompatParcelizer + 115;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        return FlowKt.serializer(new HeatmapDataStore$get$$inlined$map$1((Flow) obj2, this, 26));
    }
}
