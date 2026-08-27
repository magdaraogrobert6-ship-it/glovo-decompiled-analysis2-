package com.mapbox.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.createFromParcel;
import o.getCieXyz;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleUtils {
    public static final LifecycleUtils INSTANCE = new LifecycleUtils();
    private static final String TAG = "LifecycleUtils";
    private static ExecutorService threadPool;

    private LifecycleUtils() {
    }

    static {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
        executorServiceNewFixedThreadPool.getClass();
        threadPool = executorServiceNewFixedThreadPool;
    }

    private final LifecycleState getAppStateLollipopAndHigher(Context context) {
        Object isitemdismissable;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        LifecycleState lifecycleState = LifecycleState.BACKGROUND;
        Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            try {
                if (it.next().getTaskInfo().id != -1) {
                    lifecycleState = LifecycleState.FOREGROUND;
                }
                isitemdismissable = createFromParcel.INSTANCE;
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer != null) {
                Log.error("Failed to get task properties: " + thSerializer, TAG);
            }
        }
        return lifecycleState;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    private final LifecycleState getAppStatePreLollipop(Context context) {
        Object isitemdismissable;
        String packageName;
        createFromParcel createfromparcel;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        String packageName2 = context.getApplicationContext().getPackageName();
        LifecycleState lifecycleState = LifecycleState.UNKNOWN;
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(32);
        for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
            if (runningTaskInfo != null) {
                try {
                    ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName == null || (packageName = componentName.getPackageName()) == null) {
                        createfromparcel = null;
                    } else {
                        if (packageName.equals(packageName2)) {
                            lifecycleState = LifecycleState.FOREGROUND;
                        }
                        createfromparcel = createFromParcel.INSTANCE;
                    }
                } catch (Throwable th) {
                    isitemdismissable = new isItemDismissable(th);
                }
            } else {
                createfromparcel = null;
            }
            isitemdismissable = createfromparcel;
            Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer != null) {
                Log.error("Failed to get task properties: " + thSerializer, TAG);
            }
        }
        return (runningTasks.size() >= 32 || lifecycleState != LifecycleState.UNKNOWN) ? lifecycleState : LifecycleState.BACKGROUND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24(Context context, Looper looper, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Object isitemdismissable;
        context.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        LifecycleUtils lifecycleUtils = INSTANCE;
        try {
            boolean zHasServiceRunningInForeground = lifecycleUtils.hasServiceRunningInForeground(context);
            isitemdismissable = createFromParcel.INSTANCE;
            if (!zHasServiceRunningInForeground) {
                LifecycleState appLifecycleStateFromActivityManager = lifecycleUtils.getAppLifecycleStateFromActivityManager(context);
                if (looper != null) {
                    isitemdismissable = Boolean.valueOf(new Handler(looper).post(new ND$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 25, appLifecycleStateFromActivityManager)));
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(appLifecycleStateFromActivityManager);
                }
            } else if (looper != null) {
                isitemdismissable = Boolean.valueOf(new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda5(0, r8lambdaunavo3sxub_pc9xroryotnrlvsm)));
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(LifecycleState.FOREGROUND);
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer != null) {
            Log.error("Failed to get application state: " + thSerializer, TAG);
            if (looper != null) {
                new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda5(3, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(LifecycleState.UNKNOWN);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(LifecycleState.FOREGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$19$lambda$18(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, LifecycleState lifecycleState) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        lifecycleState.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(lifecycleState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(LifecycleState.UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15(Context context, Looper looper, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        context.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        boolean zHasServiceRunningInForeground = INSTANCE.hasServiceRunningInForeground(context);
        if (looper != null) {
            new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, zHasServiceRunningInForeground));
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(zHasServiceRunningInForeground));
        }
    }

    @SuppressLint
    public final LifecycleState getAppLifecycleStateFromActivityManager(int i, Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT < 29 || i < 29) {
            return i >= 21 ? getAppStateLollipopAndHigher(context) : getAppStatePreLollipop(context);
        }
        return getAppStateQAndHigher(context);
    }

    @onItemDismisslambda0
    public final LifecycleState getLifecycleState(Context context) {
        context.getClass();
        try {
            return hasServiceRunningInForeground(context) ? LifecycleState.FOREGROUND : getAppLifecycleStateFromActivityManager(context);
        } catch (Throwable th) {
            Throwable thSerializer = onItemDismiss.serializer(new isItemDismissable(th));
            if (thSerializer != null) {
                Log.error("Failed to get application state: " + thSerializer, TAG);
            }
            return LifecycleState.UNKNOWN;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.mapbox.common.LifecycleState] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final LifecycleState getAppStateQAndHigher(Context context) {
        Object isitemdismissable;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        ?? it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.AppTask appTask = (ActivityManager.AppTask) it.next();
            try {
                Log.info("Task: " + appTask.getTaskInfo(), TAG);
                if (appTask.getTaskInfo().isRunning) {
                    it = LifecycleState.FOREGROUND;
                    return it;
                }
                isitemdismissable = createFromParcel.INSTANCE;
                it = it;
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
                it = it;
            }
            Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer != null) {
                Log.error("Failed to get task properties: " + thSerializer, TAG);
            }
        }
        return LifecycleState.BACKGROUND;
    }

    @onItemDismisslambda0
    public final boolean hasServiceRunningInForeground(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        context.getClass();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String packageName = context.getPackageName();
        if (activityManager != null && (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) != null) {
            List<ActivityManager.RunningServiceInfo> list = runningServices;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : list) {
                if (runningServiceInfo != null) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{runningServiceInfo.service.getPackageName(), packageName}, getCieXyz.write())).booleanValue() && runningServiceInfo.foreground) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(z));
    }

    @SuppressLint
    public final LifecycleState getAppLifecycleStateFromActivityManager(Context context) {
        context.getClass();
        return getAppLifecycleStateFromActivityManager(Build.VERSION.SDK_INT, context);
    }

    public final void getLifecycleState(Context context, Looper looper, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        context.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        threadPool.submit(new LifecycleUtils$$ExternalSyntheticLambda2(context, looper, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1));
    }

    public final void hasServiceRunningInForeground(Context context, Looper looper, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        context.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        threadPool.submit(new LifecycleUtils$$ExternalSyntheticLambda2(context, looper, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0));
    }
}
