package o;

import android.content.Context;
import android.content.Intent;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import com.roadrunner.permission.presentation.PermissionActivity;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaDq44v2nxKlyM2yb_Rh9Rq5jRnTY extends onNewIntent {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final transferSessionPackageI read;

    public r8lambdaDq44v2nxKlyM2yb_Rh9Rq5jRnTY(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.read = transfersessionpackagei;
    }

    @Override // o.onNewIntent
    public final Object serializer(int i, Intent intent) {
        boolean z;
        int i2 = 2 % 2;
        if (i == -1) {
            int i3 = IconCompatParcelizer + 19;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 63;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 4 / 4;
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // o.onNewIntent
    public final Intent RemoteActionCompatParcelizer(Context context, Object obj) {
        int i = 2 % 2;
        int i2 = write + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((PermissionModel) obj).getClass();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
            firebaseRemoteConfigImpl.getClass();
            firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NEW_PERMISSIONS_FLOW_ENABLED);
            throw null;
        }
        PermissionModel permissionModel = (PermissionModel) obj;
        permissionModel.getClass();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.read;
        firebaseRemoteConfigImpl2.getClass();
        Intent intentPutExtra = (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_NEW_PERMISSIONS_FLOW_ENABLED) ? new Intent(context, (Class<?>) NonFloatablePermissionActivity.class) : new Intent(context, (Class<?>) PermissionActivity.class)).putExtra("permission_model_key", permissionModel);
        intentPutExtra.getClass();
        int i3 = write + 19;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return intentPutExtra;
        }
        throw null;
    }
}
