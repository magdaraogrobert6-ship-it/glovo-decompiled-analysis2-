package com.google.firebase.perf.util;

import com.google.firebase.perf.metrics.Trace;
import o.getLegacyTextInputServiceAndroid;
import o.getWindowInfoannotations;
import o.recalculateWindowPosition;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ScreenTraceUtil {
    public static final getWindowInfoannotations RemoteActionCompatParcelizer = getWindowInfoannotations.write();

    public static void IconCompatParcelizer(Trace trace, getLegacyTextInputServiceAndroid getlegacytextinputserviceandroid) {
        int i = getlegacytextinputserviceandroid.RemoteActionCompatParcelizer;
        int i2 = getlegacytextinputserviceandroid.read;
        int i3 = getlegacytextinputserviceandroid.write;
        if (i > 0) {
            trace.putMetric(recalculateWindowPosition.FRAMES_TOTAL.toString(), i);
        }
        if (i3 > 0) {
            trace.putMetric(recalculateWindowPosition.FRAMES_SLOW.toString(), i3);
        }
        if (i2 > 0) {
            trace.putMetric(recalculateWindowPosition.FRAMES_FROZEN.toString(), i2);
        }
        String str = trace.MediaBrowserCompatMediaItem;
        RemoteActionCompatParcelizer.read();
    }
}
