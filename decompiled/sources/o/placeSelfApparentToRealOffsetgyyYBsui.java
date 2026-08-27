package o;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class placeSelfApparentToRealOffsetgyyYBsui {
    public static final placeSelfApparentToRealOffsetgyyYBsui IconCompatParcelizer = new placeSelfApparentToRealOffsetgyyYBsui();

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
            measureAndLayout measureandlayout = new measureAndLayout();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null processName");
                return null;
            }
            measureandlayout.IconCompatParcelizer = str2;
            measureandlayout.write = runningAppProcessInfo.pid;
            byte b = (byte) (measureandlayout.read | 1);
            measureandlayout.serializer = runningAppProcessInfo.importance;
            measureandlayout.read = (byte) (b | 2);
            measureandlayout.RemoteActionCompatParcelizer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, str}, getCieXyz.write())).booleanValue();
            measureandlayout.read = (byte) (measureandlayout.read | 4);
            arrayList2.add(measureandlayout.read());
        }
        return arrayList2;
    }

    public final markLayoutPending write(Context context) {
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
        } while (((getUncaughtExceptionHandlerui) ((markLayoutPending) next)).serializer != iMyPid);
        markLayoutPending marklayoutpending = (markLayoutPending) next;
        if (marklayoutpending != null) {
            return marklayoutpending;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        measureAndLayout measureandlayout = new measureAndLayout();
        measureandlayout.IconCompatParcelizer = processName;
        measureandlayout.write = iMyPid;
        byte b = (byte) (measureandlayout.read | 1);
        measureandlayout.serializer = 0;
        measureandlayout.RemoteActionCompatParcelizer = false;
        measureandlayout.read = (byte) (((byte) (b | 2)) | 4);
        return measureandlayout.read();
    }
}
