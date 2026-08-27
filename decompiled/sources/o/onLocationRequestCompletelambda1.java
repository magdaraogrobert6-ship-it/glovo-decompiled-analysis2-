package o;

import android.content.Context;
import android.os.Build;
import com.sentiance.sdk.devicestate.LocationPermissionLevel;
import com.sentiance.sdk.devicestate.Permission;

/* JADX INFO: loaded from: classes3.dex */
public class onLocationRequestCompletelambda1 {
    private final Context IconCompatParcelizer;

    public final LocationPermissionLevel write() {
        boolean z = write(Permission.COARSE_LOCATION) || write(Permission.FINE_LOCATION);
        if (!z || (Build.VERSION.SDK_INT >= 29 && !write(Permission.ACCESS_BACKGROUND_LOCATION))) {
            return z ? LocationPermissionLevel.ONLY_WHILE_IN_USE : LocationPermissionLevel.NEVER;
        }
        return LocationPermissionLevel.ALWAYS;
    }

    public onLocationRequestCompletelambda1(Context context) {
        this.IconCompatParcelizer = context;
    }

    public final boolean serializer() {
        return Build.VERSION.SDK_INT < 29 || write(Permission.ACTIVITY_RECOGNITION);
    }

    public final boolean write(Permission permission) {
        return this.IconCompatParcelizer.checkSelfPermission(permission.fullName) == 0;
    }
}
