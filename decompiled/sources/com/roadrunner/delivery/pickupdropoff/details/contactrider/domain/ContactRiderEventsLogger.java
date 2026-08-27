package com.roadrunner.delivery.pickupdropoff.details.contactrider.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.decode;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class ContactRiderEventsLogger {
    private static int serializer = 0;
    private static int write = 1;
    public final decode RemoteActionCompatParcelizer;

    public ContactRiderEventsLogger(decode decodeVar) {
        decodeVar.getClass();
        this.RemoteActionCompatParcelizer = decodeVar;
    }

    public final void write(List list) {
        int i = 2 % 2;
        int i2 = write + 91;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            int i4 = write + 87;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            while (!(!it.hasNext())) {
                Object next = it.next();
                Trigger.Companion companion = Trigger.Companion;
                String str = ((TrackingEvent) next).trigger;
                companion.getClass();
                if (Trigger.Companion.write(str) == Trigger.BUTTON_CLICK) {
                    int i6 = serializer + 15;
                    write = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        arrayList.add(next);
                        throw null;
                    }
                    arrayList.add(next);
                }
            }
            RemoteActionCompatParcelizer(arrayList);
        }
    }

    public final void RemoteActionCompatParcelizer(ArrayList arrayList) {
        int i = 2 % 2;
        Iterator it = arrayList.iterator();
        while (!(!it.hasNext())) {
            int i2 = write + 115;
            serializer = i2 % Fields.SpotShadowColor;
            Map mapSerializer = null;
            if (i2 % 2 != 0) {
                Map map = ((TrackingEvent) it.next()).parameters;
                throw null;
            }
            TrackingEvent trackingEvent = (TrackingEvent) it.next();
            Map map2 = trackingEvent.parameters;
            if (map2 != null) {
                ArrayList arrayList2 = new ArrayList(map2.size());
                Iterator it2 = map2.entrySet().iterator();
                int i3 = write + 31;
                serializer = i3 % Fields.SpotShadowColor;
                while (true) {
                    int i4 = i3 % 2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    arrayList2.add(new onViewAttachedToWindowlambda0((String) entry.getKey(), entry.getValue().toString()));
                    i3 = serializer + 1;
                    write = i3 % Fields.SpotShadowColor;
                }
                mapSerializer = onMove.serializer(arrayList2);
            }
            this.RemoteActionCompatParcelizer.logEvent(trackingEvent.name, mapSerializer);
        }
    }
}
