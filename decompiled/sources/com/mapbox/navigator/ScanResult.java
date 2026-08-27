package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class ScanResult implements Serializable {
    private final String id;
    private final boolean isConnectable;
    private final String localName;
    private final List<ManufacturerData> manufacturerData;
    private final long monotonicTimestampNanoseconds;
    private final List<String> overflowServiceUUIDs;
    private final int rssi;
    private final List<ServiceData> serviceData;
    private final List<String> serviceUUIDs;
    private final List<String> solicitedServiceUUIDs;
    private final int txPowerLevel;

    public String getId() {
        return this.id;
    }

    public boolean getIsConnectable() {
        return this.isConnectable;
    }

    public String getLocalName() {
        return this.localName;
    }

    public List<ManufacturerData> getManufacturerData() {
        return this.manufacturerData;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public List<String> getOverflowServiceUUIDs() {
        return this.overflowServiceUUIDs;
    }

    public int getRssi() {
        return this.rssi;
    }

    public List<ServiceData> getServiceData() {
        return this.serviceData;
    }

    public List<String> getServiceUUIDs() {
        return this.serviceUUIDs;
    }

    public List<String> getSolicitedServiceUUIDs() {
        return this.solicitedServiceUUIDs;
    }

    public int getTxPowerLevel() {
        return this.txPowerLevel;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.id;
        String str2 = this.localName;
        List<ManufacturerData> list = this.manufacturerData;
        List<ServiceData> list2 = this.serviceData;
        int i = this.txPowerLevel;
        return Objects.hash(str, str2, list, list2, Integer.valueOf(i), this.serviceUUIDs, this.overflowServiceUUIDs, this.solicitedServiceUUIDs, Boolean.valueOf(this.isConnectable), Integer.valueOf(this.rssi), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public ScanResult(String str, String str2, List<ManufacturerData> list, List<ServiceData> list2, int i, List<String> list3, List<String> list4, List<String> list5, boolean z, int i2, long j) {
        this.id = str;
        this.localName = str2;
        this.manufacturerData = list;
        this.serviceData = list2;
        this.txPowerLevel = i;
        this.serviceUUIDs = list3;
        this.overflowServiceUUIDs = list4;
        this.solicitedServiceUUIDs = list5;
        this.isConnectable = z;
        this.rssi = i2;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", localName: ");
        IconCompatParcelizer.read(sb, this.localName, ", manufacturerData: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.manufacturerData, ", serviceData: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.serviceData, ", txPowerLevel: ");
        IconCompatParcelizer.write(this.txPowerLevel, ", serviceUUIDs: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.serviceUUIDs, ", overflowServiceUUIDs: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.overflowServiceUUIDs, ", solicitedServiceUUIDs: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.solicitedServiceUUIDs, ", isConnectable: ");
        MediaSessionCompatQueueItem.write(sb, this.isConnectable, ", rssi: ");
        IconCompatParcelizer.write(this.rssi, ", monotonicTimestampNanoseconds: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanResult scanResult = (ScanResult) obj;
        return Objects.equals(this.id, scanResult.id) && Objects.equals(this.localName, scanResult.localName) && Objects.equals(this.manufacturerData, scanResult.manufacturerData) && Objects.equals(this.serviceData, scanResult.serviceData) && this.txPowerLevel == scanResult.txPowerLevel && Objects.equals(this.serviceUUIDs, scanResult.serviceUUIDs) && Objects.equals(this.overflowServiceUUIDs, scanResult.overflowServiceUUIDs) && Objects.equals(this.solicitedServiceUUIDs, scanResult.solicitedServiceUUIDs) && this.isConnectable == scanResult.isConnectable && this.rssi == scanResult.rssi && this.monotonicTimestampNanoseconds == scanResult.monotonicTimestampNanoseconds;
    }
}
