package com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.logger;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.FontMuC2MFsdefault;
import o.SimpleItemTouchHelperCallback;
import o.decode;
import o.getCieXyz;
import o.onMove;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PinValidationEventLoggerImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final decode RemoteActionCompatParcelizer;

    public PinValidationEventLoggerImpl(decode decodeVar) {
        this.RemoteActionCompatParcelizer = decodeVar;
    }

    public final void read(List list, Trigger trigger, Map map) {
        int i = 2 % 2;
        ArrayList<TrackingEvent> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((TrackingEvent) next).trigger, trigger.getSerialName()}, getCieXyz.write())).booleanValue()) {
                arrayList.add(next);
                int i2 = write + 125;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
        }
        for (TrackingEvent trackingEvent : arrayList) {
            Map map2 = trackingEvent.parameters;
            if (map2 == null) {
                map2 = SimpleItemTouchHelperCallback.serializer;
                int i4 = write + 83;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            this.RemoteActionCompatParcelizer.logEvent(trackingEvent.name, FontMuC2MFsdefault.RemoteActionCompatParcelizer(onMove.RemoteActionCompatParcelizer(map2, map)));
        }
    }
}
