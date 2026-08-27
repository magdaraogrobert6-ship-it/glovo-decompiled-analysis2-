package com.incognia.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o.accessgetInstancedelegatecp;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class B9m {
    public final Context BGx;
    public final onViewDetachedFromWindowlambda1 HQ = new isAdapterPositionOnScreen(new QS(this));
    public final vGK N = new vGK();
    public final iLf mbG;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [o.isItemDismissable] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public final List BGx() {
        ?? isitemdismissable;
        Set<BluetoothDevice> bondedDevices;
        try {
            BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.HQ.MediaSessionCompatResultReceiverWrapper();
            if (bluetoothAdapter == null) {
                return null;
            }
            iLf ilf = this.mbG;
            ilf.getClass();
            if (!(XUh.BGx(XUh.BGx, 31, 0, 2) ? ilf.BGx("android.permission.BLUETOOTH_CONNECT") : ilf.BGx("android.permission.BLUETOOTH")) || (bondedDevices = bluetoothAdapter.getBondedDevices()) == null) {
                return null;
            }
            isitemdismissable = new ArrayList(accessgetInstancedelegatecp.write(bondedDevices, 10));
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                this.N.getClass();
                isitemdismissable.add(vGK.BGx(bluetoothDevice));
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        return (List) (isitemdismissable instanceof isItemDismissable ? 0 : isitemdismissable);
    }

    public B9m(Context context, iLf ilf) {
        this.BGx = context;
        this.mbG = ilf;
    }
}
