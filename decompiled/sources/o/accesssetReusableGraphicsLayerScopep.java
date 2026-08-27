package o;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class accesssetReusableGraphicsLayerScopep {
    public static List serializer(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        sidecarWindowLayoutInfo.getClass();
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? instance_delegatelambda0Var : list;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            objInvoke.getClass();
            return (List) objInvoke;
        }
    }

    public static int IconCompatParcelizer(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            objInvoke.getClass();
            return ((Integer) objInvoke).intValue();
        }
    }

    public static int RemoteActionCompatParcelizer(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        int iIconCompatParcelizer = IconCompatParcelizer(sidecarDeviceState);
        if (iIconCompatParcelizer < 0 || iIconCompatParcelizer > 4) {
            return 0;
        }
        return iIconCompatParcelizer;
    }

    public static void serializer(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }
}
