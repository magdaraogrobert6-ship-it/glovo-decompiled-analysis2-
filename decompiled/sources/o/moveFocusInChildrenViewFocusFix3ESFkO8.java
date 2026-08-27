package o;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.transport.TransportManager$$ExternalSyntheticLambda0;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.text.DecimalFormat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class moveFocusInChildrenViewFocusFix3ESFkO8 implements accesssetDispatchOnScrollChangedMethodcp {
    public static final getWindowInfoannotations IconCompatParcelizer = getWindowInfoannotations.write();
    public static final moveFocusInChildrenViewFocusFix3ESFkO8 write = new moveFocusInChildrenViewFocusFix3ESFkO8();
    public recalculateWindowViewTransforms ComponentActivity;
    public accesssetInstancecp MediaDescriptionCompat;
    public FirebaseApp MediaMetadataCompat;
    public final ConcurrentHashMap MediaSessionCompatQueueItem;
    public FirebasePerformance ParcelableVolumeInfo;
    public AbstractComposeViewExternalSyntheticLambda0 PlaybackStateCompat;
    public isInBounds PlaybackStateCompatCustomAction;
    public accesssetAddChangeCallbackMethodcp RatingCompat;
    public updateWindowMetrics RemoteActionCompatParcelizer;
    public String ResultReceiver;
    public String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Context read;
    public AppStateMonitor serializer;
    public final ConcurrentLinkedQueue r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ConcurrentLinkedQueue();
    public final AtomicBoolean MediaSessionCompatToken = new AtomicBoolean(false);
    public boolean MediaSessionCompatResultReceiverWrapper = false;
    public final ThreadPoolExecutor MediaBrowserCompatMediaItem = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX WARN: Code duplicated, block: B:113:0x02db  */
    /* JADX WARN: Code duplicated, block: B:124:0x0324  */
    /* JADX WARN: Code duplicated, block: B:129:0x035e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0368  */
    /* JADX WARN: Code duplicated, block: B:134:0x0383  */
    /* JADX WARN: Code duplicated, block: B:141:0x039c  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x040d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0416  */
    /* JADX WARN: Code duplicated, block: B:160:0x041e  */
    /* JADX WARN: Code duplicated, block: B:165:0x044b  */
    /* JADX WARN: Code duplicated, block: B:172:0x047e  */
    /* JADX WARN: Code duplicated, block: B:177:0x048b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0492  */
    /* JADX WARN: Code duplicated, block: B:180:0x0498  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:188:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:189:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:191:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:194:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:196:0x0506  */
    /* JADX WARN: Code duplicated, block: B:197:0x051f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0528  */
    /* JADX WARN: Code duplicated, block: B:201:0x0536  */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x042a, code lost:
    
        if (o.recalculateWindowViewTransforms.RemoteActionCompatParcelizer(r11.getNetworkRequestMetric().getPerfSessionsList()) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04a0, code lost:
    
        if ((!r12) != false) goto L203;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(o.getLastMatrixRecalculationAnimationTimeui r11, o.EnumC0151autofill r12) {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.moveFocusInChildrenViewFocusFix3ESFkO8.write(o.getLastMatrixRecalculationAnimationTimeui, o.autofill):void");
    }

    public final void serializer(TraceMetric traceMetric, EnumC0151autofill enumC0151autofill) {
        this.MediaBrowserCompatMediaItem.execute(new accessgetAlpha8cp(this, traceMetric, enumC0151autofill, 8));
    }

    public moveFocusInChildrenViewFocusFix3ESFkO8() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.MediaSessionCompatQueueItem = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public final void RemoteActionCompatParcelizer(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.serializer.RemoteActionCompatParcelizer(recalculateWindowPosition.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.serializer.RemoteActionCompatParcelizer(recalculateWindowPosition.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    @Override // o.accesssetDispatchOnScrollChangedMethodcp
    public final void onUpdateAppState(EnumC0151autofill enumC0151autofill) {
        int i = 0;
        this.MediaSessionCompatResultReceiverWrapper = enumC0151autofill == EnumC0151autofill.FOREGROUND;
        if (this.MediaSessionCompatToken.get()) {
            this.MediaBrowserCompatMediaItem.execute(new TransportManager$$ExternalSyntheticLambda0(this, i));
        }
    }

    public static String RemoteActionCompatParcelizer(getPrimaryDirectionalMotionAxisOverridedqNNBbUui getprimarydirectionalmotionaxisoverridedqnnbbuui) {
        if (getprimarydirectionalmotionaxisoverridedqnnbbuui.hasTraceMetric()) {
            TraceMetric traceMetric = getprimarydirectionalmotionaxisoverridedqnnbbuui.getTraceMetric();
            long durationUs = traceMetric.getDurationUs();
            java.util.Locale locale = java.util.Locale.ENGLISH;
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("trace metric: ", traceMetric.getName(), " (duration: ", new DecimalFormat("#.####").format(durationUs / 1000.0d), "ms)");
        }
        if (getprimarydirectionalmotionaxisoverridedqnnbbuui.hasNetworkRequestMetric()) {
            NetworkRequestMetric networkRequestMetric = getprimarydirectionalmotionaxisoverridedqnnbbuui.getNetworkRequestMetric();
            long timeToResponseCompletedUs = networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L;
            String strValueOf = networkRequestMetric.hasHttpResponseCode() ? String.valueOf(networkRequestMetric.getHttpResponseCode()) : GrsBaseInfo.CountryCodeSource.UNKNOWN;
            java.util.Locale locale2 = java.util.Locale.ENGLISH;
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("network request trace: ", networkRequestMetric.getUrl(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(timeToResponseCompletedUs / 1000.0d), "ms)");
        }
        if (!getprimarydirectionalmotionaxisoverridedqnnbbuui.hasGaugeMetric()) {
            return "log";
        }
        GaugeMetric gaugeMetric = getprimarydirectionalmotionaxisoverridedqnnbbuui.getGaugeMetric();
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        boolean zHasGaugeMetadata = gaugeMetric.hasGaugeMetadata();
        int cpuMetricReadingsCount = gaugeMetric.getCpuMetricReadingsCount();
        int androidMemoryReadingsCount = gaugeMetric.getAndroidMemoryReadingsCount();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(zHasGaugeMetadata);
        sb.append(", cpuGaugeCount: ");
        sb.append(cpuMetricReadingsCount);
        sb.append(", memoryGaugeCount: ");
        return af$$ExternalSyntheticOutline0.m(androidMemoryReadingsCount, ")", sb);
    }
}
