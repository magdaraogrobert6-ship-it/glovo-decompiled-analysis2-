package o;

import android.location.Location;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class InputModeManager extends updatePathOutline {
    private static int serializer = 0;
    private static int write = 1;

    @SerializedName("accuracy")
    private final double acc;

    @SerializedName("battery")
    private final getSegmentTick5zf0vsI batteryInfo;

    @SerializedName("bluetooth_signal_strength")
    private final Integer bluetoothSignalStrength;

    @SerializedName("connection_info")
    private final InputMode connectionInfo;

    @SerializedName("created_at")
    private final long createdAt;

    @SerializedName("heading")
    private final double heading;

    @SerializedName("app_in_foreground")
    private final boolean isAppInForeground;

    @SerializedName("mock_location")
    private final boolean isMocked;

    @SerializedName("lat")
    private final double latitude;
    public final Location location;

    @SerializedName(com.adjust.sdk.Constants.LONG)
    private final double longitude;

    @SerializedName("activities")
    private final List<getInputModeaOaMEAU> motionActivity;

    @SerializedName("sensors_data")
    private final accesssetDrawStyle sensorData;

    @SerializedName("speed")
    private final double speed;

    public InputModeManager(Location location, getSegmentTick5zf0vsI getsegmenttick5zf0vsi, List list, InputMode inputMode, boolean z, Integer num) {
        location.getClass();
        this.location = location;
        this.batteryInfo = getsegmenttick5zf0vsi;
        this.motionActivity = list;
        this.connectionInfo = inputMode;
        this.isAppInForeground = z;
        this.sensorData = null;
        this.bluetoothSignalStrength = num;
        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
        this.acc = location.getAccuracy();
        this.speed = location.getSpeed();
        this.heading = location.getBearing();
        this.isMocked = location.isFromMockProvider();
        this.createdAt = location.getTime();
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.location.hashCode();
        getSegmentTick5zf0vsI getsegmenttick5zf0vsi = this.batteryInfo;
        int iHashCode3 = 0;
        int iM = d$$ExternalSyntheticOutline0.m((this.connectionInfo.hashCode() + c8$$ExternalSyntheticOutline0.m(this.motionActivity, ((iHashCode2 * 31) + (getsegmenttick5zf0vsi == null ? 0 : getsegmenttick5zf0vsi.hashCode())) * 31, 31)) * 31, 31, this.isAppInForeground);
        accesssetDrawStyle accesssetdrawstyle = this.sensorData;
        if (accesssetdrawstyle == null) {
            int i4 = serializer + 83;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accesssetdrawstyle.hashCode();
        }
        Integer num = this.bluetoothSignalStrength;
        if (num != null) {
            iHashCode3 = num.hashCode();
            int i6 = write + 79;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return ((iM + iHashCode) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        getSegmentTick5zf0vsI getsegmenttick5zf0vsi = this.batteryInfo;
        List<getInputModeaOaMEAU> list = this.motionActivity;
        InputMode inputMode = this.connectionInfo;
        boolean z = this.isAppInForeground;
        accesssetDrawStyle accesssetdrawstyle = this.sensorData;
        Integer num = this.bluetoothSignalStrength;
        StringBuilder sb = new StringBuilder("RiderLocation(location=");
        sb.append(this.location);
        sb.append(", batteryInfo=");
        sb.append(getsegmenttick5zf0vsi);
        sb.append(", motionActivity=");
        sb.append(list);
        sb.append(", connectionInfo=");
        sb.append(inputMode);
        sb.append(", isAppInForeground=");
        sb.append(z);
        sb.append(", sensorData=");
        sb.append(accesssetdrawstyle);
        sb.append(", bluetoothSignalStrength=");
        String strWrite = IconCompatParcelizer.write(num, ")", sb);
        int i2 = write + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strWrite;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputModeManager)) {
            return false;
        }
        InputModeManager inputModeManager = (InputModeManager) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, inputModeManager.location}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.batteryInfo, inputModeManager.batteryInfo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.motionActivity, inputModeManager.motionActivity}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.connectionInfo, inputModeManager.connectionInfo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.isAppInForeground == inputModeManager.isAppInForeground) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sensorData, inputModeManager.sensorData}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bluetoothSignalStrength, inputModeManager.bluetoothSignalStrength}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = write + 89;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
