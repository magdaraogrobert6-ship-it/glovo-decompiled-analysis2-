package com.roadrunner.rider.safety.report.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.addPartnerParameter;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class SafetyPreferencesDataStore {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final performCustomExitMxy_nc0 read;

    public SafetyPreferencesDataStore(performCustomExitMxy_nc0 performcustomexitmxy_nc0, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.read = performcustomexitmxy_nc0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    public final Object get(isRoot isroot, ContinuationImpl continuationImpl) {
        addPartnerParameter addpartnerparameter;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 123;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            boolean z = continuationImpl instanceof addPartnerParameter;
            throw null;
        }
        if (continuationImpl instanceof addPartnerParameter) {
            int i4 = i2 + 33;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            addpartnerparameter = (addPartnerParameter) continuationImpl;
            int i6 = addpartnerparameter.serializer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                int i7 = RemoteActionCompatParcelizer + 35;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                addpartnerparameter.serializer = i6 - Integer.MIN_VALUE;
            } else {
                addpartnerparameter = new addPartnerParameter(this, continuationImpl);
            }
        } else {
            addpartnerparameter = new addPartnerParameter(this, continuationImpl);
        }
        Object objFirstOrNull = addpartnerparameter.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = addpartnerparameter.serializer;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            HeatmapDataStore$getBoolean$$inlined$map$1 heatmapDataStore$getBoolean$$inlined$map$1 = new HeatmapDataStore$getBoolean$$inlined$map$1(this.read.serializer(), isroot, 4);
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(heatmapDataStore$getBoolean$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
            addpartnerparameter.serializer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowRemoteActionCompatParcelizer, addpartnerparameter);
            if (objFirstOrNull == coroutineSingletons) {
                int i10 = write + 105;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 76 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        Integer num = (Integer) objFirstOrNull;
        return new Integer(num != null ? num.intValue() : 0);
    }
}
