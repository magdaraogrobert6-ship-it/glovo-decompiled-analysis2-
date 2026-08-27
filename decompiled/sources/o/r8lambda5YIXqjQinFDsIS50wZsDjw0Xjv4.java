package o;

import com.roadrunner.delivery.ontheway.observer.OnTheWayLifecycleObserverImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.permission.api.model.PermissionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4 {
    private static int read = 1;
    private static int serializer;
    public final RouterLogger IconCompatParcelizer;

    public r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4(RouterLogger routerLogger) {
        this.IconCompatParcelizer = routerLogger;
    }

    public final OnTheWayLifecycleObserverImpl serializer(androidx.fragment.app.FragmentActivity fragmentActivity, androidx.activity.result.ActivityResultRegistry activityResultRegistry, PermissionModel permissionModel) {
        int i = 2 % 2;
        RouterLogger routerLogger = this.IconCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) routerLogger.read).write();
        objWrite.getClass();
        OnTheWayLifecycleObserverImpl onTheWayLifecycleObserverImpl = new OnTheWayLifecycleObserverImpl((r8lambda93nPh_UiO6LLly5QJWhviIL_k) objWrite, (r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) routerLogger.serializer).write(), fragmentActivity, activityResultRegistry, permissionModel);
        int i2 = read + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return onTheWayLifecycleObserverImpl;
    }
}
