package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.location.LocationRequest;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigDataSending implements Serializable {
    private final boolean continuePathOnOffsetOverflow;
    private final boolean enableRetransmission;
    private final int messageIntervalMs;
    private final int messagesInPackage;
    private final int metadataCycleSeconds;
    private final MessageBinaryFormat outputBinaryFormat;
    private final int retransmissionMeters;
    private final boolean setRouteIsReset;
    private final int treeTrailingLength;
    private final boolean updatesEnabled;

    @Deprecated
    public boolean getContinuePathOnOffsetOverflow() {
        return this.continuePathOnOffsetOverflow;
    }

    public boolean getEnableRetransmission() {
        return this.enableRetransmission;
    }

    public int getMessageIntervalMs() {
        return this.messageIntervalMs;
    }

    public int getMessagesInPackage() {
        return this.messagesInPackage;
    }

    public int getMetadataCycleSeconds() {
        return this.metadataCycleSeconds;
    }

    public MessageBinaryFormat getOutputBinaryFormat() {
        return this.outputBinaryFormat;
    }

    public int getRetransmissionMeters() {
        return this.retransmissionMeters;
    }

    public boolean getSetRouteIsReset() {
        return this.setRouteIsReset;
    }

    public int getTreeTrailingLength() {
        return this.treeTrailingLength;
    }

    public boolean getUpdatesEnabled() {
        return this.updatesEnabled;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.outputBinaryFormat, Integer.valueOf(this.messageIntervalMs), Integer.valueOf(this.messagesInPackage), Integer.valueOf(this.metadataCycleSeconds), Boolean.valueOf(this.enableRetransmission), Integer.valueOf(this.retransmissionMeters), Integer.valueOf(this.treeTrailingLength), Boolean.valueOf(this.updatesEnabled), Boolean.valueOf(this.continuePathOnOffsetOverflow), Boolean.valueOf(this.setRouteIsReset));
    }

    public AdasisConfigDataSending(MessageBinaryFormat messageBinaryFormat) {
        this.outputBinaryFormat = messageBinaryFormat;
        this.messageIntervalMs = 100;
        this.messagesInPackage = 4;
        this.metadataCycleSeconds = 5;
        this.enableRetransmission = false;
        this.retransmissionMeters = 100;
        this.treeTrailingLength = LocationRequest.PRIORITY_INDOOR;
        this.updatesEnabled = true;
        this.continuePathOnOffsetOverflow = true;
        this.setRouteIsReset = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[outputBinaryFormat: ");
        sb.append(RecordUtils.fieldToString(this.outputBinaryFormat));
        sb.append(", messageIntervalMs: ");
        IconCompatParcelizer.write(this.messageIntervalMs, ", messagesInPackage: ", sb);
        IconCompatParcelizer.write(this.messagesInPackage, ", metadataCycleSeconds: ", sb);
        IconCompatParcelizer.write(this.metadataCycleSeconds, ", enableRetransmission: ", sb);
        MediaSessionCompatQueueItem.write(sb, this.enableRetransmission, ", retransmissionMeters: ");
        IconCompatParcelizer.write(this.retransmissionMeters, ", treeTrailingLength: ", sb);
        IconCompatParcelizer.write(this.treeTrailingLength, ", updatesEnabled: ", sb);
        MediaSessionCompatQueueItem.write(sb, this.updatesEnabled, ", continuePathOnOffsetOverflow: ");
        MediaSessionCompatQueueItem.write(sb, this.continuePathOnOffsetOverflow, ", setRouteIsReset: ");
        return ff$$ExternalSyntheticOutline0.m(this.setRouteIsReset, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigDataSending adasisConfigDataSending = (AdasisConfigDataSending) obj;
        return Objects.equals(this.outputBinaryFormat, adasisConfigDataSending.outputBinaryFormat) && this.messageIntervalMs == adasisConfigDataSending.messageIntervalMs && this.messagesInPackage == adasisConfigDataSending.messagesInPackage && this.metadataCycleSeconds == adasisConfigDataSending.metadataCycleSeconds && this.enableRetransmission == adasisConfigDataSending.enableRetransmission && this.retransmissionMeters == adasisConfigDataSending.retransmissionMeters && this.treeTrailingLength == adasisConfigDataSending.treeTrailingLength && this.updatesEnabled == adasisConfigDataSending.updatesEnabled && this.continuePathOnOffsetOverflow == adasisConfigDataSending.continuePathOnOffsetOverflow && this.setRouteIsReset == adasisConfigDataSending.setRouteIsReset;
    }

    public AdasisConfigDataSending(MessageBinaryFormat messageBinaryFormat, int i, int i2, int i3, boolean z, int i4, int i5, boolean z2, boolean z3, boolean z4) {
        this.outputBinaryFormat = messageBinaryFormat;
        this.messageIntervalMs = i;
        this.messagesInPackage = i2;
        this.metadataCycleSeconds = i3;
        this.enableRetransmission = z;
        this.retransmissionMeters = i4;
        this.treeTrailingLength = i5;
        this.updatesEnabled = z2;
        this.continuePathOnOffsetOverflow = z3;
        this.setRouteIsReset = z4;
    }
}
