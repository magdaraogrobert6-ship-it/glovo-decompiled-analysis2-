package com.roadrunner.freelancing.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.deleteNotificationChannelGroup;
import o.isRoot;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes3.dex */
public final class GoAndStartRepository {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final isRoot RemoteActionCompatParcelizer = new isRoot("dont_show_again_go_and_start_disclaimer");
    public final GoAndStartDataStoreImpl read;

    public GoAndStartRepository(GoAndStartDataStoreImpl goAndStartDataStoreImpl) {
        this.read = goAndStartDataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object isDontShowAgainEnabled(ContinuationImpl continuationImpl) {
        deleteNotificationChannelGroup deletenotificationchannelgroup;
        boolean zBooleanValue;
        int i = 2 % 2;
        if (continuationImpl instanceof deleteNotificationChannelGroup) {
            deletenotificationchannelgroup = (deleteNotificationChannelGroup) continuationImpl;
            int i2 = deletenotificationchannelgroup.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletenotificationchannelgroup.write = i2 - Integer.MIN_VALUE;
            } else {
                deletenotificationchannelgroup = new deleteNotificationChannelGroup(this, continuationImpl);
            }
        } else {
            deletenotificationchannelgroup = new deleteNotificationChannelGroup(this, continuationImpl);
        }
        Object objFirstOrNull = deletenotificationchannelgroup.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = deletenotificationchannelgroup.write;
        Object obj = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            isRoot isroot = this.RemoteActionCompatParcelizer;
            isroot.getClass();
            HeatmapDataStore$getBoolean$$inlined$map$1 heatmapDataStore$getBoolean$$inlined$map$1 = new HeatmapDataStore$getBoolean$$inlined$map$1(((performCustomExitMxy_nc0) this.read.serializer.MediaSessionCompatResultReceiverWrapper()).serializer(), isroot, 3);
            deletenotificationchannelgroup.write = 1;
            objFirstOrNull = FlowKt.firstOrNull(heatmapDataStore$getBoolean$$inlined$map$1, deletenotificationchannelgroup);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i4 = IconCompatParcelizer + 69;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i5 = serializer + 51;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        Boolean bool = (Boolean) objFirstOrNull;
        if (bool != null) {
            int i7 = serializer + 111;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                bool.booleanValue();
                obj.hashCode();
                throw null;
            }
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
