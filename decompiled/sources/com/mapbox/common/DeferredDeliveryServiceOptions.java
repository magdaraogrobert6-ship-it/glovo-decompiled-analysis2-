package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredDeliveryServiceOptions implements Serializable {
    private final long batchFlushTimeout;
    private final long batchLengthToFlush;
    private final String dataStoragePath;
    private final Long maxStorageUsage;
    private final long memoryQueueFlushTimeout;
    private final long memoryQueueLengthToFlush;
    private final Long memoryQueueMaxLength;
    private final DeferredDeliveryOverflowPolicy memoryQueueOverflowPolicy;
    private final long persistentQueueFlushTimeout;
    private final long persistentQueueLengthToFlush;
    private final Long persistentQueueMaxLength;
    private final DeferredDeliveryOverflowPolicy persistentQueueOverflowPolicy;
    private final DeferredDeliveryOverflowPolicy storageOverflowPolicy;

    public long getBatchFlushTimeout() {
        return this.batchFlushTimeout;
    }

    public long getBatchLengthToFlush() {
        return this.batchLengthToFlush;
    }

    public String getDataStoragePath() {
        return this.dataStoragePath;
    }

    public Long getMaxStorageUsage() {
        return this.maxStorageUsage;
    }

    public long getMemoryQueueFlushTimeout() {
        return this.memoryQueueFlushTimeout;
    }

    public long getMemoryQueueLengthToFlush() {
        return this.memoryQueueLengthToFlush;
    }

    public Long getMemoryQueueMaxLength() {
        return this.memoryQueueMaxLength;
    }

    public DeferredDeliveryOverflowPolicy getMemoryQueueOverflowPolicy() {
        return this.memoryQueueOverflowPolicy;
    }

    public long getPersistentQueueFlushTimeout() {
        return this.persistentQueueFlushTimeout;
    }

    public long getPersistentQueueLengthToFlush() {
        return this.persistentQueueLengthToFlush;
    }

    public Long getPersistentQueueMaxLength() {
        return this.persistentQueueMaxLength;
    }

    public DeferredDeliveryOverflowPolicy getPersistentQueueOverflowPolicy() {
        return this.persistentQueueOverflowPolicy;
    }

    public DeferredDeliveryOverflowPolicy getStorageOverflowPolicy() {
        return this.storageOverflowPolicy;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DeferredDeliveryServiceOptions(Long l, Long l2, String str, Long l3) {
        this.memoryQueueMaxLength = l;
        this.persistentQueueMaxLength = l2;
        this.dataStoragePath = str;
        this.maxStorageUsage = l3;
        this.batchLengthToFlush = 180L;
        this.batchFlushTimeout = 180000L;
        this.memoryQueueLengthToFlush = 180L;
        this.memoryQueueFlushTimeout = 180000L;
        DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy = DeferredDeliveryOverflowPolicy.RETIRE_OLDEST;
        this.memoryQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.persistentQueueLengthToFlush = 180L;
        this.persistentQueueFlushTimeout = 180000L;
        this.persistentQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.storageOverflowPolicy = DeferredDeliveryOverflowPolicy.DISCARD_INCOMING;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[batchLengthToFlush: ");
        af$$ExternalSyntheticOutline1.m(this.batchLengthToFlush, ", batchFlushTimeout: ", sb);
        af$$ExternalSyntheticOutline1.m(this.batchFlushTimeout, ", memoryQueueMaxLength: ", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.memoryQueueMaxLength, sb, ", memoryQueueLengthToFlush: ");
        af$$ExternalSyntheticOutline1.m(this.memoryQueueLengthToFlush, ", memoryQueueFlushTimeout: ", sb);
        af$$ExternalSyntheticOutline1.m(this.memoryQueueFlushTimeout, ", memoryQueueOverflowPolicy: ", sb);
        sb.append(RecordUtils.fieldToString(this.memoryQueueOverflowPolicy));
        sb.append(", persistentQueueMaxLength: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.persistentQueueMaxLength, sb, ", persistentQueueLengthToFlush: ");
        af$$ExternalSyntheticOutline1.m(this.persistentQueueLengthToFlush, ", persistentQueueFlushTimeout: ", sb);
        af$$ExternalSyntheticOutline1.m(this.persistentQueueFlushTimeout, ", persistentQueueOverflowPolicy: ", sb);
        sb.append(RecordUtils.fieldToString(this.persistentQueueOverflowPolicy));
        sb.append(", dataStoragePath: ");
        IconCompatParcelizer.read(sb, this.dataStoragePath, ", maxStorageUsage: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.maxStorageUsage, sb, ", storageOverflowPolicy: ");
        sb.append(RecordUtils.fieldToString(this.storageOverflowPolicy));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.batchLengthToFlush;
        long j2 = this.batchFlushTimeout;
        Long l = this.memoryQueueMaxLength;
        long j3 = this.memoryQueueLengthToFlush;
        long j4 = this.memoryQueueFlushTimeout;
        DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy = this.memoryQueueOverflowPolicy;
        Long l2 = this.persistentQueueMaxLength;
        long j5 = this.persistentQueueLengthToFlush;
        long j6 = this.persistentQueueFlushTimeout;
        return Objects.hash(Long.valueOf(j), Long.valueOf(j2), l, Long.valueOf(j3), Long.valueOf(j4), deferredDeliveryOverflowPolicy, l2, Long.valueOf(j5), Long.valueOf(j6), this.persistentQueueOverflowPolicy, this.dataStoragePath, this.maxStorageUsage, this.storageOverflowPolicy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeferredDeliveryServiceOptions deferredDeliveryServiceOptions = (DeferredDeliveryServiceOptions) obj;
        return this.batchLengthToFlush == deferredDeliveryServiceOptions.batchLengthToFlush && this.batchFlushTimeout == deferredDeliveryServiceOptions.batchFlushTimeout && Objects.equals(this.memoryQueueMaxLength, deferredDeliveryServiceOptions.memoryQueueMaxLength) && this.memoryQueueLengthToFlush == deferredDeliveryServiceOptions.memoryQueueLengthToFlush && this.memoryQueueFlushTimeout == deferredDeliveryServiceOptions.memoryQueueFlushTimeout && Objects.equals(this.memoryQueueOverflowPolicy, deferredDeliveryServiceOptions.memoryQueueOverflowPolicy) && Objects.equals(this.persistentQueueMaxLength, deferredDeliveryServiceOptions.persistentQueueMaxLength) && this.persistentQueueLengthToFlush == deferredDeliveryServiceOptions.persistentQueueLengthToFlush && this.persistentQueueFlushTimeout == deferredDeliveryServiceOptions.persistentQueueFlushTimeout && Objects.equals(this.persistentQueueOverflowPolicy, deferredDeliveryServiceOptions.persistentQueueOverflowPolicy) && Objects.equals(this.dataStoragePath, deferredDeliveryServiceOptions.dataStoragePath) && Objects.equals(this.maxStorageUsage, deferredDeliveryServiceOptions.maxStorageUsage) && Objects.equals(this.storageOverflowPolicy, deferredDeliveryServiceOptions.storageOverflowPolicy);
    }

    public DeferredDeliveryServiceOptions(long j, long j2, Long l, long j3, long j4, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy, Long l2, long j5, long j6, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy2, String str, Long l3, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy3) {
        this.batchLengthToFlush = j;
        this.batchFlushTimeout = j2;
        this.memoryQueueMaxLength = l;
        this.memoryQueueLengthToFlush = j3;
        this.memoryQueueFlushTimeout = j4;
        this.memoryQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.persistentQueueMaxLength = l2;
        this.persistentQueueLengthToFlush = j5;
        this.persistentQueueFlushTimeout = j6;
        this.persistentQueueOverflowPolicy = deferredDeliveryOverflowPolicy2;
        this.dataStoragePath = str;
        this.maxStorageUsage = l3;
        this.storageOverflowPolicy = deferredDeliveryOverflowPolicy3;
    }
}
