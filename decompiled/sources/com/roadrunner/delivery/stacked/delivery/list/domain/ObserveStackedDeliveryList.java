package com.roadrunner.delivery.stacked.delivery.list.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.accessgetMiddleEllipsiscp;
import o.accesstoNestedScrollSource;
import o.getMToDpValuesannotations;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveStackedDeliveryList {
    private static int read = 0;
    private static int write = 1;
    public final getMToDpValuesannotations RemoteActionCompatParcelizer;
    public final accessgetMiddleEllipsiscp serializer;

    public ObserveStackedDeliveryList(getMToDpValuesannotations getmtodpvaluesannotations, accessgetMiddleEllipsiscp accessgetmiddleellipsiscp, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.RemoteActionCompatParcelizer = getmtodpvaluesannotations;
        this.serializer = accessgetmiddleellipsiscp;
    }

    public final Flow read() {
        int i = 2 % 2;
        accessgetMiddleEllipsiscp accessgetmiddleellipsiscp = this.serializer;
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(new HeatmapDataStore$get$$inlined$map$1(new HeatmapDataStore$get$$inlined$map$1(new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) accessgetmiddleellipsiscp.serializer)).MediaBrowserCompatMediaItem, 27), accessgetmiddleellipsiscp, 21), this.RemoteActionCompatParcelizer, 22), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
        int i2 = write + 101;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return flowRemoteActionCompatParcelizer;
    }
}
