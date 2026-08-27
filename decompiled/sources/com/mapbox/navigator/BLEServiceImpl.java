package com.mapbox.navigator;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.ParcelUuid;
import android.util.SparseArray;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.FocusListener;
import o.accessgetInstancedelegatecp;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes5.dex */
final class BLEServiceImpl implements BLEService {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "MBNNBLEService";
    private BluetoothAdapter bluetoothAdapter;
    private final Map<Integer, ScanResultCallback> callbacks;
    private final Context context;
    private final AtomicInteger nextCallbackId;
    private final BLEServiceImpl$scanCallback$1 scanCallback;
    private BluetoothLeScanner scanner;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BLEService createPlatformBLEService() {
            return new BLEServiceImpl(MapboxNavigationNative.INSTANCE.getAppContext$dash_native_release());
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyCallbacks(ScanResult scanResult) {
        synchronized (this) {
            Iterator<Map.Entry<Integer, ScanResultCallback>> it = this.callbacks.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().run(scanResult);
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.mapbox.navigator.BLEService
    public int registerScanResultCallback(ScanResultCallback scanResultCallback) {
        int iMakeNextCallbackId;
        synchronized (this) {
            scanResultCallback.getClass();
            iMakeNextCallbackId = makeNextCallbackId();
            this.callbacks.put(Integer.valueOf(iMakeNextCallbackId), scanResultCallback);
            startScan();
        }
        return iMakeNextCallbackId;
    }

    @Override // com.mapbox.navigator.BLEService
    public void unregisterCallback(int i) {
        synchronized (this) {
            this.callbacks.remove(Integer.valueOf(i));
            if (this.callbacks.isEmpty()) {
                stopScan();
            }
        }
    }

    public static final BLEService createPlatformBLEService() {
        return Companion.createPlatformBLEService();
    }

    private final boolean hasPermission(String str) {
        return FocusListener.write(this.context, str) == 0;
    }

    private final boolean hasPermissions() {
        return hasPermission("android.permission.BLUETOOTH") && hasPermission("android.permission.BLUETOOTH_ADMIN") && hasPermission("android.permission.ACCESS_FINE_LOCATION") && hasPermission("android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.mapbox.navigator.BLEServiceImpl$scanCallback$1] */
    public BLEServiceImpl(Context context) {
        context.getClass();
        this.context = context;
        this.nextCallbackId = new AtomicInteger(0);
        this.callbacks = new LinkedHashMap();
        this.scanCallback = new ScanCallback() { // from class: com.mapbox.navigator.BLEServiceImpl$scanCallback$1
            public final void handle(android.bluetooth.le.ScanResult scanResult) {
                ArrayList arrayList;
                scanResult.getClass();
                ScanRecord scanRecord = scanResult.getScanRecord();
                if (scanRecord == null) {
                    return;
                }
                SparseArray<byte[]> manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
                if (manufacturerSpecificData == null) {
                    manufacturerSpecificData = new SparseArray<>();
                }
                ArrayList arrayList2 = new ArrayList();
                int size = manufacturerSpecificData.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(new ManufacturerData(manufacturerSpecificData.keyAt(i), manufacturerSpecificData.valueAt(i)));
                }
                Map<ParcelUuid, byte[]> serviceData = scanRecord.getServiceData();
                ArrayList arrayList3 = new ArrayList();
                if (serviceData != null) {
                    for (Map.Entry<ParcelUuid, byte[]> entry : serviceData.entrySet()) {
                        ParcelUuid key = entry.getKey();
                        arrayList3.add(new ServiceData(key.toString(), entry.getValue()));
                    }
                }
                String address = scanResult.getDevice().getAddress();
                String deviceName = scanRecord.getDeviceName();
                if (deviceName == null) {
                    deviceName = "";
                }
                String str = deviceName;
                ArrayList arrayList4 = new ArrayList(arrayList2);
                ArrayList arrayList5 = new ArrayList(arrayList3);
                int txPowerLevel = scanRecord.getTxPowerLevel();
                List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
                if (serviceUuids != null) {
                    List<ParcelUuid> list = serviceUuids;
                    ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList6.add(((ParcelUuid) it.next()).toString());
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = new ArrayList();
                }
                List<ParcelUuid> listCompatGetServiceSolicitationUuids = BLEServiceKt.compatGetServiceSolicitationUuids(scanRecord);
                ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(listCompatGetServiceSolicitationUuids, 10));
                Iterator<T> it2 = listCompatGetServiceSolicitationUuids.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((ParcelUuid) it2.next()).toString());
                }
                this.this$0.notifyCallbacks(new ScanResult(address, str, arrayList4, arrayList5, txPowerLevel, arrayList, instance_delegatelambda0.write, arrayList7, BLEServiceKt.compatIsConnectable(scanResult), scanResult.getRssi(), scanResult.getTimestampNanos()));
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<android.bluetooth.le.ScanResult> list) {
                list.getClass();
                Iterator<android.bluetooth.le.ScanResult> it = list.iterator();
                while (it.hasNext()) {
                    handle(it.next());
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int i, android.bluetooth.le.ScanResult scanResult) {
                scanResult.getClass();
                handle(scanResult);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int i) {
                SentryLogcatAdapter.serializer(BLEServiceImpl.TAG, "onScanFailed: " + i);
            }
        };
    }

    private final int makeNextCallbackId() {
        return this.nextCallbackId.addAndGet(1);
    }

    private final void startScan() {
        if (hasPermissions() && this.scanner == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.bluetoothAdapter = defaultAdapter;
            if (defaultAdapter == null) {
                SentryLogcatAdapter.serializer(TAG, "BluetoothAdapter.getDefaultAdapter() is null");
                return;
            }
            defaultAdapter.getClass();
            if (!defaultAdapter.isEnabled()) {
                SentryLogcatAdapter.serializer(TAG, "bluetoothAdapter.isEnabled() is false");
                return;
            }
            ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
            BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
            bluetoothAdapter.getClass();
            BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
            this.scanner = bluetoothLeScanner;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.startScan(instance_delegatelambda0.write, scanSettingsBuild, this.scanCallback);
            }
        }
    }

    private final void stopScan() {
        if (hasPermissions()) {
            BluetoothLeScanner bluetoothLeScanner = this.scanner;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.scanCallback);
            }
            this.scanner = null;
        }
    }
}
