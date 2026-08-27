package com.incognia.internal;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class vGK {
    public static ng0 BGx(BluetoothDevice bluetoothDevice) {
        ArrayList arrayList;
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        String alias = XUh.BGx(XUh.BGx, 30, 0, 2) ? bluetoothDevice.getAlias() : null;
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids != null) {
            ArrayList arrayList2 = new ArrayList(uuids.length);
            for (ParcelUuid parcelUuid : uuids) {
                arrayList2.add(parcelUuid.getUuid().toString());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new ng0(bluetoothDevice.getName(), bluetoothDevice.getAddress(), alias, bluetoothDevice.getBondState(), bluetoothDevice.getType(), bluetoothClass != null ? Integer.valueOf(bluetoothClass.getMajorDeviceClass()) : null, bluetoothClass != null ? Integer.valueOf(bluetoothClass.getDeviceClass()) : null, arrayList, XUh.BGx(XUh.BGx, 35, 0, 2) ? Integer.valueOf(bluetoothDevice.getAddressType()) : null);
    }
}
