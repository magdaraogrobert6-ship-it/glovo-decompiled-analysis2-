package o;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetExclusioncp {
    public static ArrayList read(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = instance_delegatelambda0.write;
        }
        ArrayList arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListRemoteActionCompatParcelizer) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new AndroidComposeViewgetFocusedRect1(str2, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{runningAppProcessInfo.processName, str}, getCieXyz.write())).booleanValue(), runningAppProcessInfo.pid, runningAppProcessInfo.importance));
        }
        return arrayList2;
    }

    public static AndroidComposeViewgetFocusedRect1 write(Context context) {
        Object next;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = read(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AndroidComposeViewgetFocusedRect1) next).IconCompatParcelizer != iMyPid);
        AndroidComposeViewgetFocusedRect1 androidComposeViewgetFocusedRect1 = (AndroidComposeViewgetFocusedRect1) next;
        if (androidComposeViewgetFocusedRect1 != null) {
            return androidComposeViewgetFocusedRect1;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else {
            processName = Application.getProcessName();
            if (processName == null && (processName = MemoryCachedecodeFeatures11.IconCompatParcelizer()) == null) {
                processName = "";
            }
        }
        return new AndroidComposeViewgetFocusedRect1(processName, false, iMyPid, 0);
    }

    public static PackageInfo read(Context context, PackageManager packageManager) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
