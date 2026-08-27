package o;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;

/* JADX INFO: loaded from: classes3.dex */
public final class getEllipsisgIe3tQ8annotations {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final Application read;

    public getEllipsisgIe3tQ8annotations(Application application) {
        application.getClass();
        this.read = application;
    }

    public final boolean RemoteActionCompatParcelizer() {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        int i = 2 % 2;
        Object systemService = this.read.getSystemService("bluetooth");
        if (systemService instanceof BluetoothManager) {
            int i2 = RemoteActionCompatParcelizer + 61;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            bluetoothManager = (BluetoothManager) systemService;
        } else {
            bluetoothManager = null;
        }
        if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null || !adapter.isEnabled()) {
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 65;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
