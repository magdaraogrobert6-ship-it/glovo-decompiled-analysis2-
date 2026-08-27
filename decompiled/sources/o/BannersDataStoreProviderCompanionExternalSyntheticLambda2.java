package o;

import android.app.ActivityManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BannersDataStoreProviderCompanionExternalSyntheticLambda2 {
    private final ActivityManager IconCompatParcelizer;

    public final boolean IconCompatParcelizer() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.IconCompatParcelizer.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (it.next().importance == 100) {
                return true;
            }
        }
        return false;
    }

    public BannersDataStoreProviderCompanionExternalSyntheticLambda2(ActivityManager activityManager) {
        this.IconCompatParcelizer = activityManager;
    }
}
