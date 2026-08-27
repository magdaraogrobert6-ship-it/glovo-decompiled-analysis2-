package com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.FontMuC2MFsdefault;
import o.decode;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class QrPaymentEventLoggerImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final decode IconCompatParcelizer;

    public QrPaymentEventLoggerImpl(decode decodeVar) {
        decodeVar.getClass();
        this.IconCompatParcelizer = decodeVar;
    }

    public final void read(List list, Trigger trigger) {
        int i = 2 % 2;
        ArrayList<TrackingEvent> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((TrackingEvent) next).trigger, trigger.getSerialName()}, getCieXyz.write())).booleanValue()) {
                int i2 = read + 27;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    arrayList.add(next);
                    int i3 = 10 / 0;
                } else {
                    arrayList.add(next);
                }
            }
        }
        for (TrackingEvent trackingEvent : arrayList) {
            int i4 = RemoteActionCompatParcelizer + 101;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.IconCompatParcelizer.logEvent(trackingEvent.name, FontMuC2MFsdefault.RemoteActionCompatParcelizer(trackingEvent.parameters));
        }
    }
}
