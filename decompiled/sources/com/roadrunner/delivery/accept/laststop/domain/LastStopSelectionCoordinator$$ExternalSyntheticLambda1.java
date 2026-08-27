package com.roadrunner.delivery.accept.laststop.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.state.TrackingEvent;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.SimpleItemTouchHelperCallback;
import o.createFromParcel;
import o.drawLine;
import o.drawTextOnPath;
import o.ef;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LastStopSelectionCoordinator$$ExternalSyntheticLambda1 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ LastStopSelectionCoordinator write;

    public /* synthetic */ LastStopSelectionCoordinator$$ExternalSyntheticLambda1(LastStopSelectionCoordinator lastStopSelectionCoordinator) {
        this.write = lastStopSelectionCoordinator;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        ef efVar = (ef) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Boolean bool = (Boolean) obj3;
        bool.getClass();
        efVar.getClass();
        LastStopSelectionCoordinator lastStopSelectionCoordinator = this.write;
        MutableStateFlow mutableStateFlow = lastStopSelectionCoordinator.write;
        DeliveryAcceptanceLogger deliveryAcceptanceLogger = lastStopSelectionCoordinator.read;
        drawLine drawline = (drawLine) mutableStateFlow.read();
        if (drawline instanceof drawTextOnPath) {
            int i2 = IconCompatParcelizer + 9;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            for (TrackingEvent trackingEvent : ((drawTextOnPath) drawline).serializer) {
                int i4 = serializer + 41;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Map map = trackingEvent.parameters;
                if (map == null) {
                    map = SimpleItemTouchHelperCallback.serializer;
                    int i6 = IconCompatParcelizer + 47;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
                deliveryAcceptanceLogger.serializer(TrackingEvent.IconCompatParcelizer(trackingEvent, null, onMove.serializer(onMove.serializer(map, new onViewAttachedToWindowlambda0("provider", efVar.getTrackingValue())), new onViewAttachedToWindowlambda0("is_fallback", bool)), 3));
            }
        } else {
            int i8 = IconCompatParcelizer + 115;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 3 % 3;
            }
        }
        if (!zBooleanValue) {
            deliveryAcceptanceLogger.serializer(new TrackingEvent("LAST_STOP_GEOCODING_FAILURE", "end_session_area_geocoding_failure", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("provider", efVar.getTrackingValue()), new onViewAttachedToWindowlambda0("is_fallback", bool))));
            int i10 = serializer + 43;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
