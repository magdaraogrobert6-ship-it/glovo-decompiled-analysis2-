package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.EnumC0151autofill;
import o.accessgetAlpha8cp;
import o.accesssetAddChangeCallbackMethodcp;
import o.component2VKZWuLQ;
import o.convertMeasureSpecI7RO_PI;
import o.dispatchConfigurationChangeIfNeeded;
import o.dispatchKeyEventPreIme;
import o.dispatchPendingInteropLayoutCallbacks;
import o.dispatchProvideStructure;
import o.getWindowInfoannotations;
import o.invalidateAlignmentLinesFromPositionChange;
import o.isDevicePressEvent;
import o.moveFocusInChildrenCurrent3ESFkO8;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.provideRulerValue;
import o.sendMotionEvent8iAsVTc;
import o.setAttached;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private EnumC0151autofill applicationProcessState;
    private final accesssetAddChangeCallbackMethodcp configResolver;
    private final provideRulerValue cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final provideRulerValue gaugeManagerExecutor;
    private moveFocusInChildrenCurrent3ESFkO8 gaugeMetadataManager;
    private final provideRulerValue memoryGaugeCollector;
    private String sessionId;
    private final moveFocusInChildrenViewFocusFix3ESFkO8 transportManager;
    private static final getWindowInfoannotations logger = getWindowInfoannotations.write();
    private static final GaugeManager instance = new GaugeManager();

    private long getCpuGaugeCollectionFrequencyMs(EnumC0151autofill enumC0151autofill) {
        long jLongValue;
        int i = isDevicePressEvent.IconCompatParcelizer[enumC0151autofill.ordinal()];
        if (i == 1) {
            accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp = this.configResolver;
            accesssetaddchangecallbackmethodcp.getClass();
            convertMeasureSpecI7RO_PI convertmeasurespeci7ro_piIconCompatParcelizer = convertMeasureSpecI7RO_PI.IconCompatParcelizer();
            sendMotionEvent8iAsVTc sendmotionevent8iasvtcMediaSessionCompatQueueItem = accesssetaddchangecallbackmethodcp.MediaSessionCompatQueueItem(convertmeasurespeci7ro_piIconCompatParcelizer);
            if (sendmotionevent8iasvtcMediaSessionCompatQueueItem.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem.RemoteActionCompatParcelizer()).longValue())) {
                jLongValue = ((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem.RemoteActionCompatParcelizer()).longValue();
            } else {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtc = accesssetaddchangecallbackmethodcp.serializer.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (sendmotionevent8iasvtc.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue())) {
                    accesssetaddchangecallbackmethodcp.read.write(((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue();
                } else {
                    sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite = accesssetaddchangecallbackmethodcp.write(convertmeasurespeci7ro_piIconCompatParcelizer);
                    jLongValue = (sendmotionevent8iasvtcWrite.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue())) ? ((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue() : 0L;
                }
            }
        } else if (i != 2) {
            jLongValue = -1;
        } else {
            accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp2 = this.configResolver;
            RemoteConfigManager remoteConfigManager = accesssetaddchangecallbackmethodcp2.serializer;
            dispatchConfigurationChangeIfNeeded dispatchconfigurationchangeifneededIconCompatParcelizer = dispatchConfigurationChangeIfNeeded.IconCompatParcelizer();
            sendMotionEvent8iAsVTc sendmotionevent8iasvtcMediaSessionCompatQueueItem2 = accesssetaddchangecallbackmethodcp2.MediaSessionCompatQueueItem(dispatchconfigurationchangeifneededIconCompatParcelizer);
            if (sendmotionevent8iasvtcMediaSessionCompatQueueItem2.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem2.RemoteActionCompatParcelizer()).longValue())) {
                jLongValue = ((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem2.RemoteActionCompatParcelizer()).longValue();
            } else {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtc2 = remoteConfigManager.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (sendmotionevent8iasvtc2.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue())) {
                    accesssetaddchangecallbackmethodcp2.read.write(((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue();
                } else {
                    sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite2 = accesssetaddchangecallbackmethodcp2.write(dispatchconfigurationchangeifneededIconCompatParcelizer);
                    if (sendmotionevent8iasvtcWrite2.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtcWrite2.RemoteActionCompatParcelizer()).longValue())) {
                        jLongValue = ((Long) sendmotionevent8iasvtcWrite2.RemoteActionCompatParcelizer()).longValue();
                    } else {
                        jLongValue = remoteConfigManager.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        }
        if (CpuGaugeCollector.RemoteActionCompatParcelizer(jLongValue)) {
            return -1L;
        }
        return jLongValue;
    }

    public static GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(EnumC0151autofill enumC0151autofill) {
        long jLongValue;
        int i = isDevicePressEvent.IconCompatParcelizer[enumC0151autofill.ordinal()];
        if (i == 1) {
            accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp = this.configResolver;
            accesssetaddchangecallbackmethodcp.getClass();
            dispatchPendingInteropLayoutCallbacks dispatchpendinginteroplayoutcallbacks = dispatchPendingInteropLayoutCallbacks.read();
            sendMotionEvent8iAsVTc sendmotionevent8iasvtcMediaSessionCompatQueueItem = accesssetaddchangecallbackmethodcp.MediaSessionCompatQueueItem(dispatchpendinginteroplayoutcallbacks);
            if (sendmotionevent8iasvtcMediaSessionCompatQueueItem.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem.RemoteActionCompatParcelizer()).longValue())) {
                jLongValue = ((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem.RemoteActionCompatParcelizer()).longValue();
            } else {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtc = accesssetaddchangecallbackmethodcp.serializer.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (sendmotionevent8iasvtc.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue())) {
                    accesssetaddchangecallbackmethodcp.read.write(((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue();
                } else {
                    sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite = accesssetaddchangecallbackmethodcp.write(dispatchpendinginteroplayoutcallbacks);
                    jLongValue = (sendmotionevent8iasvtcWrite.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue())) ? ((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue() : 0L;
                }
            }
        } else if (i != 2) {
            jLongValue = -1;
        } else {
            accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp2 = this.configResolver;
            RemoteConfigManager remoteConfigManager = accesssetaddchangecallbackmethodcp2.serializer;
            component2VKZWuLQ component2vkzwulqWrite = component2VKZWuLQ.write();
            sendMotionEvent8iAsVTc sendmotionevent8iasvtcMediaSessionCompatQueueItem2 = accesssetaddchangecallbackmethodcp2.MediaSessionCompatQueueItem(component2vkzwulqWrite);
            if (sendmotionevent8iasvtcMediaSessionCompatQueueItem2.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem2.RemoteActionCompatParcelizer()).longValue())) {
                jLongValue = ((Long) sendmotionevent8iasvtcMediaSessionCompatQueueItem2.RemoteActionCompatParcelizer()).longValue();
            } else {
                sendMotionEvent8iAsVTc sendmotionevent8iasvtc2 = remoteConfigManager.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (sendmotionevent8iasvtc2.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue())) {
                    accesssetaddchangecallbackmethodcp2.read.write(((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) sendmotionevent8iasvtc2.RemoteActionCompatParcelizer()).longValue();
                } else {
                    sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite2 = accesssetaddchangecallbackmethodcp2.write(component2vkzwulqWrite);
                    if (sendmotionevent8iasvtcWrite2.serializer() && accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(((Long) sendmotionevent8iasvtcWrite2.RemoteActionCompatParcelizer()).longValue())) {
                        jLongValue = ((Long) sendmotionevent8iasvtcWrite2.RemoteActionCompatParcelizer()).longValue();
                    } else {
                        jLongValue = remoteConfigManager.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        }
        if (MemoryGaugeCollector.RemoteActionCompatParcelizer(jLongValue)) {
            return -1L;
        }
        return jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CpuGaugeCollector lambda$new$0() {
        return new CpuGaugeCollector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MemoryGaugeCollector lambda$new$1() {
        return new MemoryGaugeCollector();
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((CpuGaugeCollector) this.cpuGaugeCollector.write(), (MemoryGaugeCollector) this.memoryGaugeCollector.write(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new moveFocusInChildrenCurrent3ESFkO8(context);
    }

    private GaugeMetadata getGaugeMetadata() {
        dispatchProvideStructure dispatchprovidestructureNewBuilder = GaugeMetadata.newBuilder();
        moveFocusInChildrenCurrent3ESFkO8 movefocusinchildrencurrent3esfko8 = this.gaugeMetadataManager;
        movefocusinchildrencurrent3esfko8.getClass();
        setAttached setattached = setAttached.BYTES;
        dispatchprovidestructureNewBuilder.serializer(((Integer) RangesKt.read(340022501, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Long.valueOf(setattached.toKilobytes(movefocusinchildrencurrent3esfko8.IconCompatParcelizer.totalMem))}, BackspaceCommand.write(), -340022497, BackspaceCommand.write())).intValue());
        moveFocusInChildrenCurrent3ESFkO8 movefocusinchildrencurrent3esfko9 = this.gaugeMetadataManager;
        movefocusinchildrencurrent3esfko9.getClass();
        dispatchprovidestructureNewBuilder.RemoteActionCompatParcelizer(((Integer) RangesKt.read(340022501, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Long.valueOf(setattached.toKilobytes(movefocusinchildrencurrent3esfko9.RemoteActionCompatParcelizer.maxMemory()))}, BackspaceCommand.write(), -340022497, BackspaceCommand.write())).intValue());
        moveFocusInChildrenCurrent3ESFkO8 movefocusinchildrencurrent3esfko10 = this.gaugeMetadataManager;
        movefocusinchildrencurrent3esfko10.getClass();
        dispatchprovidestructureNewBuilder.IconCompatParcelizer(((Integer) RangesKt.read(340022501, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Long.valueOf(setAttached.MEGABYTES.toKilobytes(movefocusinchildrencurrent3esfko10.read.getMemoryClass()))}, BackspaceCommand.write(), -340022497, BackspaceCommand.write())).intValue());
        return (GaugeMetadata) dispatchprovidestructureNewBuilder.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, EnumC0151autofill enumC0151autofill) {
        dispatchKeyEventPreIme dispatchkeyeventpreimeNewBuilder = GaugeMetric.newBuilder();
        while (!((CpuGaugeCollector) this.cpuGaugeCollector.write()).RatingCompat.isEmpty()) {
            dispatchkeyeventpreimeNewBuilder.IconCompatParcelizer((CpuMetricReading) ((CpuGaugeCollector) this.cpuGaugeCollector.write()).RatingCompat.poll());
        }
        while (!((MemoryGaugeCollector) this.memoryGaugeCollector.write()).read.isEmpty()) {
            dispatchkeyeventpreimeNewBuilder.RemoteActionCompatParcelizer((AndroidMemoryReading) ((MemoryGaugeCollector) this.memoryGaugeCollector.write()).read.poll());
        }
        dispatchkeyeventpreimeNewBuilder.serializer(str);
        moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = this.transportManager;
        movefocusinchildrenviewfocusfix3esfko8.MediaBrowserCompatMediaItem.execute(new WorkerKt$$ExternalSyntheticLambda2(movefocusinchildrenviewfocusfix3esfko8, (GaugeMetric) dispatchkeyeventpreimeNewBuilder.serializer(), enumC0151autofill, 28));
    }

    public boolean logGaugeMetadata(String str, EnumC0151autofill enumC0151autofill) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        dispatchKeyEventPreIme dispatchkeyeventpreimeNewBuilder = GaugeMetric.newBuilder();
        dispatchkeyeventpreimeNewBuilder.serializer(str);
        dispatchkeyeventpreimeNewBuilder.write(getGaugeMetadata());
        GaugeMetric gaugeMetric = (GaugeMetric) dispatchkeyeventpreimeNewBuilder.serializer();
        moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = this.transportManager;
        movefocusinchildrenviewfocusfix3esfko8.MediaBrowserCompatMediaItem.execute(new WorkerKt$$ExternalSyntheticLambda2(movefocusinchildrenviewfocusfix3esfko8, gaugeMetric, enumC0151autofill, 28));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, EnumC0151autofill enumC0151autofill) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(enumC0151autofill, perfSession.write);
        if (jStartCollectingGauges == -1) {
            logger.read("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = perfSession.IconCompatParcelizer;
        this.sessionId = str;
        this.applicationProcessState = enumC0151autofill;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.write()).scheduleAtFixedRate(new WorkerKt$$ExternalSyntheticLambda2(this, str, enumC0151autofill, 27), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.read("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    @SuppressLint
    private GaugeManager() {
        this(new provideRulerValue(new invalidateAlignmentLinesFromPositionChange(7)), moveFocusInChildrenViewFocusFix3ESFkO8.write, accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(), null, new provideRulerValue(new invalidateAlignmentLinesFromPositionChange(8)), new provideRulerValue(new invalidateAlignmentLinesFromPositionChange(9)));
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        EnumC0151autofill enumC0151autofill = this.applicationProcessState;
        ((CpuGaugeCollector) this.cpuGaugeCollector.write()).RemoteActionCompatParcelizer();
        ((MemoryGaugeCollector) this.memoryGaugeCollector.write()).read();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.write()).schedule(new accessgetAlpha8cp(this, str, enumC0151autofill, 7), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = EnumC0151autofill.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.read();
            return false;
        }
        ((CpuGaugeCollector) this.cpuGaugeCollector.write()).serializer(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.read();
            return false;
        }
        ((MemoryGaugeCollector) this.memoryGaugeCollector.write()).serializer(j, timer);
        return true;
    }

    private static void collectGaugeMetricOnce(CpuGaugeCollector cpuGaugeCollector, MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        cpuGaugeCollector.write(timer);
        memoryGaugeCollector.read(timer);
    }

    public GaugeManager(provideRulerValue providerulervalue, moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8, accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp, moveFocusInChildrenCurrent3ESFkO8 movefocusinchildrencurrent3esfko8, provideRulerValue providerulervalue2, provideRulerValue providerulervalue3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = EnumC0151autofill.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = providerulervalue;
        this.transportManager = movefocusinchildrenviewfocusfix3esfko8;
        this.configResolver = accesssetaddchangecallbackmethodcp;
        this.gaugeMetadataManager = movefocusinchildrencurrent3esfko8;
        this.cpuGaugeCollector = providerulervalue2;
        this.memoryGaugeCollector = providerulervalue3;
    }

    private long startCollectingGauges(EnumC0151autofill enumC0151autofill, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(enumC0151autofill);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(enumC0151autofill);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }
}
