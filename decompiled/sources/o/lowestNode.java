package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes.dex */
public final class lowestNode extends BroadcastReceiver {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ lowestNode(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj = this.write;
        context.getClass();
        if (i4 != 0) {
            setVerticalStyle setverticalstyle = (setVerticalStyle) obj;
            ((TraceTimeMeasurementWithPerformanceKit) setverticalstyle.write).read("broadcast_airplane", new DeviceManager$$ExternalSyntheticLambda1(context, 0, setverticalstyle));
            return;
        }
        intent.getClass();
        getColor getcolor = (getColor) obj;
        int i5 = getcolor.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            if (intent.getAction() == null) {
                return;
            }
            setRotationX setrotationx = setRotationX.read();
            String str = setParent.write;
            intent.getAction();
            setrotationx.getClass();
            String action = intent.getAction();
            if (action != null) {
                int i6 = RemoteActionCompatParcelizer + 49;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int iHashCode = action.hashCode();
                if (iHashCode == -1980154005) {
                    if (action.equals("android.intent.action.BATTERY_OKAY")) {
                        getcolor.serializer(Boolean.TRUE);
                        return;
                    }
                    return;
                } else {
                    if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        getcolor.serializer(Boolean.FALSE);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i5 == 1) {
            String action2 = intent.getAction();
            if (action2 == null) {
                return;
            }
            setRotationX setrotationx2 = setRotationX.read();
            String str2 = IntervalTreeNode.RemoteActionCompatParcelizer;
            setrotationx2.getClass();
            switch (action2.hashCode()) {
                case -1886648615:
                    if (action2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        getcolor.serializer(Boolean.FALSE);
                        break;
                    }
                    break;
                case -54942926:
                    if (action2.equals("android.os.action.DISCHARGING")) {
                        getcolor.serializer(Boolean.FALSE);
                        break;
                    }
                    break;
                case 948344062:
                    if (action2.equals("android.os.action.CHARGING")) {
                        getcolor.serializer(Boolean.TRUE);
                        break;
                    }
                    break;
                case 1019184907:
                    if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        getcolor.serializer(Boolean.TRUE);
                        break;
                    }
                    break;
            }
            return;
        }
        if (intent.getAction() == null) {
            return;
        }
        setRotationX setrotationx3 = setRotationX.read();
        int i8 = setMin.IconCompatParcelizer;
        intent.getAction();
        setrotationx3.getClass();
        String action3 = intent.getAction();
        if (action3 != null) {
            int i9 = read + 81;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            int iHashCode2 = action3.hashCode();
            if (iHashCode2 == -1181163412) {
                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    getcolor.serializer(Boolean.FALSE);
                    return;
                }
                return;
            }
            int i11 = read + 69;
            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                getcolor.serializer(Boolean.TRUE);
            }
        }
    }
}
