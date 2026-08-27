package o;

import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetAssertivecp {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static void write(div7Ah8Wj8 div7ah8wj8) {
        int i = 2 % 2;
        int i2 = serializer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (div7ah8wj8.findFragmentByTag("com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment") == null) {
            new BluetoothScanPermissionDialogFragment().RemoteActionCompatParcelizer(div7ah8wj8, "com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment");
            return;
        }
        int i4 = RemoteActionCompatParcelizer + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
