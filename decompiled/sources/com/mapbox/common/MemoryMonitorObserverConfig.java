package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryMonitorObserverConfig implements Serializable {
    private final long maxUsedMemoryPercentThreshold;
    private final long maxUsedMemoryThreshold;
    private final boolean sendAppRunningInBackgroundNotification;
    private final long thresholdReachedNotificationTimeout;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private boolean sendAppRunningInBackgroundNotification = true;
        private long maxUsedMemoryPercentThreshold = 75;
        private long maxUsedMemoryThreshold = 0;
        private long thresholdReachedNotificationTimeout = 300000;

        public Builder maxUsedMemoryPercentThreshold(long j) {
            this.maxUsedMemoryPercentThreshold = j;
            return this;
        }

        public Builder maxUsedMemoryThreshold(long j) {
            this.maxUsedMemoryThreshold = j;
            return this;
        }

        public Builder sendAppRunningInBackgroundNotification(boolean z) {
            this.sendAppRunningInBackgroundNotification = z;
            return this;
        }

        public Builder thresholdReachedNotificationTimeout(long j) {
            this.thresholdReachedNotificationTimeout = j;
            return this;
        }

        public MemoryMonitorObserverConfig build() {
            return new MemoryMonitorObserverConfig(this.sendAppRunningInBackgroundNotification, this.maxUsedMemoryPercentThreshold, this.maxUsedMemoryThreshold, this.thresholdReachedNotificationTimeout);
        }
    }

    public long getMaxUsedMemoryPercentThreshold() {
        return this.maxUsedMemoryPercentThreshold;
    }

    public long getMaxUsedMemoryThreshold() {
        return this.maxUsedMemoryThreshold;
    }

    public boolean getSendAppRunningInBackgroundNotification() {
        return this.sendAppRunningInBackgroundNotification;
    }

    public long getThresholdReachedNotificationTimeout() {
        return this.thresholdReachedNotificationTimeout;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Builder toBuilder() {
        return new Builder().sendAppRunningInBackgroundNotification(this.sendAppRunningInBackgroundNotification).maxUsedMemoryPercentThreshold(this.maxUsedMemoryPercentThreshold).maxUsedMemoryThreshold(this.maxUsedMemoryThreshold).thresholdReachedNotificationTimeout(this.thresholdReachedNotificationTimeout);
    }

    private MemoryMonitorObserverConfig() {
        this.sendAppRunningInBackgroundNotification = true;
        this.maxUsedMemoryPercentThreshold = 75L;
        this.maxUsedMemoryThreshold = 0L;
        this.thresholdReachedNotificationTimeout = 300000L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sendAppRunningInBackgroundNotification: ");
        MediaSessionCompatQueueItem.write(sb, this.sendAppRunningInBackgroundNotification, ", maxUsedMemoryPercentThreshold: ");
        af$$ExternalSyntheticOutline1.m(this.maxUsedMemoryPercentThreshold, ", maxUsedMemoryThreshold: ", sb);
        af$$ExternalSyntheticOutline1.m(this.maxUsedMemoryThreshold, ", thresholdReachedNotificationTimeout: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.thresholdReachedNotificationTimeout, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.sendAppRunningInBackgroundNotification), Long.valueOf(this.maxUsedMemoryPercentThreshold), Long.valueOf(this.maxUsedMemoryThreshold), Long.valueOf(this.thresholdReachedNotificationTimeout));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorObserverConfig.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorObserverConfig memoryMonitorObserverConfig = (MemoryMonitorObserverConfig) obj;
        return this.sendAppRunningInBackgroundNotification == memoryMonitorObserverConfig.sendAppRunningInBackgroundNotification && this.maxUsedMemoryPercentThreshold == memoryMonitorObserverConfig.maxUsedMemoryPercentThreshold && this.maxUsedMemoryThreshold == memoryMonitorObserverConfig.maxUsedMemoryThreshold && this.thresholdReachedNotificationTimeout == memoryMonitorObserverConfig.thresholdReachedNotificationTimeout;
    }

    private MemoryMonitorObserverConfig(boolean z, long j, long j2, long j3) {
        this.sendAppRunningInBackgroundNotification = z;
        this.maxUsedMemoryPercentThreshold = j;
        this.maxUsedMemoryThreshold = j2;
        this.thresholdReachedNotificationTimeout = j3;
    }
}
