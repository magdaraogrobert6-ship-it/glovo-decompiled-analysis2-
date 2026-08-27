package o;

import com.roadrunner.permission.api.model.PermissionModel;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU implements r8lambda2vBtwyPX8g68gaqnZ343rZwzI {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final PermissionModel IconCompatParcelizer;
    public final r8lambda43nB7leLWjup6aTdW2xmA7XSAs RemoteActionCompatParcelizer;
    public final r8lambda93nPh_UiO6LLly5QJWhviIL_k read;
    public final androidx.activity.result.ActivityResultRegistry serializer;
    public onBackPressed write;

    public r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU(r8lambda93nPh_UiO6LLly5QJWhviIL_k r8lambda93nph_uio6llly5qjwhviil_k, r8lambda43nB7leLWjup6aTdW2xmA7XSAs r8lambda43nb7lelwjup6atdw2xma7xsas, androidx.activity.result.ActivityResultRegistry activityResultRegistry, PermissionModel permissionModel) {
        activityResultRegistry.getClass();
        permissionModel.getClass();
        this.read = r8lambda93nph_uio6llly5qjwhviil_k;
        this.RemoteActionCompatParcelizer = r8lambda43nb7lelwjup6atdw2xma7xsas;
        this.serializer = activityResultRegistry;
        this.IconCompatParcelizer = permissionModel;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        onBackPressed onbackpressedRegister = this.serializer.register("common_permission_launch_activity", accessisrendernodecompatiblecp, this.read.write, new d0$$ExternalSyntheticLambda0(1, this));
        onbackpressedRegister.getClass();
        this.write = onbackpressedRegister;
        int i2 = MediaBrowserCompatMediaItem + 77;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
    }
}
