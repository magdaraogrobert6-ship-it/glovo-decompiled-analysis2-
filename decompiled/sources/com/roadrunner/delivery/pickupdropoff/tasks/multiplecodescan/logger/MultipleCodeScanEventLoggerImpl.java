package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import java.util.ArrayList;
import java.util.List;
import o.FontMuC2MFsdefault;
import o.decode;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class MultipleCodeScanEventLoggerImpl {
    private static int serializer = 1;
    private static int write;
    public final decode RemoteActionCompatParcelizer;

    public MultipleCodeScanEventLoggerImpl(decode decodeVar) {
        decodeVar.getClass();
        this.RemoteActionCompatParcelizer = decodeVar;
    }

    public final void serializer(List list, Trigger trigger) {
        int i = 2 % 2;
        ArrayList<TrackingEvent> arrayList = new ArrayList();
        for (Object obj : list) {
            Object[] objArr = {((TrackingEvent) obj).trigger, trigger.getSerialName()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        for (TrackingEvent trackingEvent : arrayList) {
            int i2 = serializer + 37;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.RemoteActionCompatParcelizer.logEvent(trackingEvent.name, FontMuC2MFsdefault.RemoteActionCompatParcelizer(trackingEvent.parameters));
            int i4 = serializer + 65;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }
}
