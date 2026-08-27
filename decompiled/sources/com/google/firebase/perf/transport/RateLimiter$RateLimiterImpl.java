package com.google.firebase.perf.transport;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.TimeUnit;
import o.accesssetAddChangeCallbackMethodcp;
import o.accesssetRelayoutTimep;
import o.component1VKZWuLQ;
import o.findNextViewInEmbeddedView3ESFkO8;
import o.getFontWeightAdjustmentCompat;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getWindowInfoannotations;
import o.rotateRad0AR0LA0default;
import o.sendMotionEvent8iAsVTc;
import o.sendSimulatedEventdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class RateLimiter$RateLimiterImpl {
    public static final long write;
    public final long IconCompatParcelizer;
    public final rotateRad0AR0LA0default MediaMetadataCompat;
    public rotateRad0AR0LA0default RatingCompat;
    public final rotateRad0AR0LA0default read;
    public final long serializer;
    public long RemoteActionCompatParcelizer = 500;
    public double MediaDescriptionCompat = 500.0d;
    public Timer MediaBrowserCompatMediaItem = new Timer();

    /* JADX WARN: Code duplicated, block: B:16:0x005b A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x002c, B:14:0x0050, B:16:0x005b, B:17:0x0069, B:19:0x0071, B:10:0x0034, B:13:0x004e, B:11:0x003d, B:12:0x0046), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x002c, B:14:0x0050, B:16:0x005b, B:17:0x0069, B:19:0x0071, B:10:0x0034, B:13:0x004e, B:11:0x003d, B:12:0x0046), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0076 A[DONT_GENERATE] */
    public final boolean IconCompatParcelizer() {
        double d;
        double d2;
        double seconds;
        double d3;
        double d4;
        synchronized (this) {
            Timer timer = new Timer();
            Timer timer2 = this.MediaBrowserCompatMediaItem;
            timer2.getClass();
            double d5 = timer.serializer - timer2.serializer;
            rotateRad0AR0LA0default rotaterad0ar0la0default = this.RatingCompat;
            long j = rotaterad0ar0la0default.read;
            long j2 = rotaterad0ar0la0default.RemoteActionCompatParcelizer;
            int[] iArr = sendSimulatedEventdefault.serializer;
            TimeUnit timeUnit = (TimeUnit) rotaterad0ar0la0default.IconCompatParcelizer;
            int i = iArr[timeUnit.ordinal()];
            if (i == 1) {
                d = j / j2;
                d2 = 1.0E9d;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        seconds = j / timeUnit.toSeconds(j2);
                    } else {
                        d = j / j2;
                        d2 = 1000.0d;
                    }
                    d3 = (d5 * seconds) / write;
                    if (d3 > 0.0d) {
                        this.MediaDescriptionCompat = Math.min(this.MediaDescriptionCompat + d3, this.RemoteActionCompatParcelizer);
                        this.MediaBrowserCompatMediaItem = timer;
                    }
                    d4 = this.MediaDescriptionCompat;
                    if (d4 >= 1.0d) {
                        return false;
                    }
                    this.MediaDescriptionCompat = d4 - 1.0d;
                    return true;
                }
                d = j / j2;
                d2 = 1000000.0d;
            }
            seconds = d * d2;
            d3 = (d5 * seconds) / write;
            if (d3 > 0.0d) {
                this.MediaDescriptionCompat = Math.min(this.MediaDescriptionCompat + d3, this.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatMediaItem = timer;
            }
            d4 = this.MediaDescriptionCompat;
            if (d4 >= 1.0d) {
                return false;
            }
            this.MediaDescriptionCompat = d4 - 1.0d;
            return true;
        }
    }

    public final void serializer(boolean z) {
        synchronized (this) {
            try {
                this.RatingCompat = z ? this.MediaMetadataCompat : this.read;
                this.RemoteActionCompatParcelizer = z ? this.IconCompatParcelizer : this.serializer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RateLimiter$RateLimiterImpl(rotateRad0AR0LA0default rotaterad0ar0la0default, getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4, accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp, String str) {
        component1VKZWuLQ component1vkzwulq;
        long jLongValue;
        accesssetRelayoutTimep accesssetrelayouttimep;
        long jLongValue2;
        getFontWeightAdjustmentCompat getfontweightadjustmentcompat;
        findNextViewInEmbeddedView3ESFkO8 findnextviewinembeddedview3esfko8;
        this.RatingCompat = rotaterad0ar0la0default;
        long jIconCompatParcelizer = str == "Trace" ? accesssetaddchangecallbackmethodcp.IconCompatParcelizer() : accesssetaddchangecallbackmethodcp.IconCompatParcelizer();
        if (str == "Trace") {
            synchronized (findNextViewInEmbeddedView3ESFkO8.class) {
                if (findNextViewInEmbeddedView3ESFkO8.RemoteActionCompatParcelizer == null) {
                    findNextViewInEmbeddedView3ESFkO8.RemoteActionCompatParcelizer = new findNextViewInEmbeddedView3ESFkO8();
                }
                findnextviewinembeddedview3esfko8 = findNextViewInEmbeddedView3ESFkO8.RemoteActionCompatParcelizer;
            }
            RemoteConfigManager remoteConfigManager = accesssetaddchangecallbackmethodcp.serializer;
            findnextviewinembeddedview3esfko8.getClass();
            sendMotionEvent8iAsVTc sendmotionevent8iasvtc = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (sendmotionevent8iasvtc.serializer() && accesssetAddChangeCallbackMethodcp.read(((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue())) {
                accesssetaddchangecallbackmethodcp.read.write(((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                jLongValue = ((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue();
            } else {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite = accesssetaddchangecallbackmethodcp.write(findnextviewinembeddedview3esfko8);
                jLongValue = (sendmotionevent8iasvtcWrite.serializer() && accesssetAddChangeCallbackMethodcp.read(((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue())) ? ((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue() : 300L;
            }
        } else {
            synchronized (component1VKZWuLQ.class) {
                if (component1VKZWuLQ.serializer == null) {
                    component1VKZWuLQ.serializer = new component1VKZWuLQ();
                }
                component1vkzwulq = component1VKZWuLQ.serializer;
            }
            RemoteConfigManager remoteConfigManager2 = accesssetaddchangecallbackmethodcp.serializer;
            component1vkzwulq.getClass();
            sendMotionEvent8iAsVTc sendmotionevent8iasvtc2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
            if (sendmotionevent8iasvtc2.serializer() && accesssetAddChangeCallbackMethodcp.read(((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue())) {
                accesssetaddchangecallbackmethodcp.read.write(((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                jLongValue = ((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue();
            } else {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite2 = accesssetaddchangecallbackmethodcp.write(component1vkzwulq);
                jLongValue = (sendmotionevent8iasvtcWrite2.serializer() && accesssetAddChangeCallbackMethodcp.read(((Long) sendmotionevent8iasvtcWrite2.RemoteActionCompatParcelizer()).longValue())) ? ((Long) sendmotionevent8iasvtcWrite2.RemoteActionCompatParcelizer()).longValue() : 700L;
            }
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.MediaMetadataCompat = new rotateRad0AR0LA0default(jLongValue, jIconCompatParcelizer, timeUnit);
        this.IconCompatParcelizer = jLongValue;
        long jIconCompatParcelizer2 = str == "Trace" ? accesssetaddchangecallbackmethodcp.IconCompatParcelizer() : accesssetaddchangecallbackmethodcp.IconCompatParcelizer();
        if (str == "Trace") {
            synchronized (getFontWeightAdjustmentCompat.class) {
                if (getFontWeightAdjustmentCompat.read == null) {
                    getFontWeightAdjustmentCompat.read = new getFontWeightAdjustmentCompat();
                }
                getfontweightadjustmentcompat = getFontWeightAdjustmentCompat.read;
            }
            RemoteConfigManager remoteConfigManager3 = accesssetaddchangecallbackmethodcp.serializer;
            getfontweightadjustmentcompat.getClass();
            sendMotionEvent8iAsVTc sendmotionevent8iasvtc3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
            if (sendmotionevent8iasvtc3.serializer() && accesssetAddChangeCallbackMethodcp.read(((Long) sendmotionevent8iasvtc3.RemoteActionCompatParcelizer()).longValue())) {
                accesssetaddchangecallbackmethodcp.read.write(((Long) sendmotionevent8iasvtc3.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                jLongValue2 = ((Long) sendmotionevent8iasvtc3.RemoteActionCompatParcelizer()).longValue();
            } else {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite3 = accesssetaddchangecallbackmethodcp.write(getfontweightadjustmentcompat);
                jLongValue2 = (sendmotionevent8iasvtcWrite3.serializer() && accesssetAddChangeCallbackMethodcp.read(((Long) sendmotionevent8iasvtcWrite3.RemoteActionCompatParcelizer()).longValue())) ? ((Long) sendmotionevent8iasvtcWrite3.RemoteActionCompatParcelizer()).longValue() : 30L;
            }
        } else {
            synchronized (accesssetRelayoutTimep.class) {
                if (accesssetRelayoutTimep.IconCompatParcelizer == null) {
                    accesssetRelayoutTimep.IconCompatParcelizer = new accesssetRelayoutTimep();
                }
                accesssetrelayouttimep = accesssetRelayoutTimep.IconCompatParcelizer;
            }
            RemoteConfigManager remoteConfigManager4 = accesssetaddchangecallbackmethodcp.serializer;
            accesssetrelayouttimep.getClass();
            sendMotionEvent8iAsVTc sendmotionevent8iasvtc4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
            if (sendmotionevent8iasvtc4.serializer() && accesssetAddChangeCallbackMethodcp.read(((Long) sendmotionevent8iasvtc4.RemoteActionCompatParcelizer()).longValue())) {
                accesssetaddchangecallbackmethodcp.read.write(((Long) sendmotionevent8iasvtc4.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                jLongValue2 = ((Long) sendmotionevent8iasvtc4.RemoteActionCompatParcelizer()).longValue();
            } else {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite4 = accesssetaddchangecallbackmethodcp.write(accesssetrelayouttimep);
                jLongValue2 = (sendmotionevent8iasvtcWrite4.serializer() && accesssetAddChangeCallbackMethodcp.read(((Long) sendmotionevent8iasvtcWrite4.RemoteActionCompatParcelizer()).longValue())) ? ((Long) sendmotionevent8iasvtcWrite4.RemoteActionCompatParcelizer()).longValue() : 70L;
            }
        }
        this.read = new rotateRad0AR0LA0default(jLongValue2, jIconCompatParcelizer2, timeUnit);
        this.serializer = jLongValue2;
    }

    static {
        getWindowInfoannotations.write();
        write = 1000000L;
    }
}
