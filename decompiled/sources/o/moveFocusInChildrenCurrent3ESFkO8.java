package o;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class moveFocusInChildrenCurrent3ESFkO8 {
    public final ActivityManager.MemoryInfo IconCompatParcelizer;
    public final Runtime RemoteActionCompatParcelizer = Runtime.getRuntime();
    public final ActivityManager read;

    static {
        getWindowInfoannotations.write();
    }

    public moveFocusInChildrenCurrent3ESFkO8(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.read = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.IconCompatParcelizer = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
