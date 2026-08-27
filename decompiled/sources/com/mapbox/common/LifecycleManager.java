package com.mapbox.common;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCieXyz;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleManager {
    private static final String TAG = "LifecycleManager";
    private static Callback lifecycleCallback;
    public static final LifecycleManager INSTANCE = new LifecycleManager();
    private static final HashMap<WeakReference<Activity>, ActivityState> registeredActivities = new HashMap<>();
    private static LifecycleState currentLifecycleState = LifecycleState.UNKNOWN;
    private static final LifecycleManager$callback$1 callback = new Application.ActivityLifecycleCallbacks() { // from class: com.mapbox.common.LifecycleManager$callback$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            synchronized (this) {
                activity.getClass();
                LifecycleManager.INSTANCE.registerActivityWithState(activity, LifecycleManager.ActivityState.Created);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            synchronized (this) {
                activity.getClass();
                LifecycleManager.INSTANCE.unregisterActivity(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            synchronized (this) {
                activity.getClass();
                LifecycleManager.INSTANCE.registerActivityWithState(activity, LifecycleManager.ActivityState.Paused);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            synchronized (this) {
                activity.getClass();
                LifecycleManager.INSTANCE.registerActivityWithState(activity, LifecycleManager.ActivityState.Resumed);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            synchronized (this) {
                activity.getClass();
                bundle.getClass();
                LifecycleManager.INSTANCE.registerActivityWithState(activity, LifecycleManager.ActivityState.SaveInstanceState);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            synchronized (this) {
                activity.getClass();
                LifecycleManager.INSTANCE.registerActivityWithState(activity, LifecycleManager.ActivityState.Started);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            synchronized (this) {
                activity.getClass();
                LifecycleManager.INSTANCE.registerActivityWithState(activity, LifecycleManager.ActivityState.Stopped);
            }
        }
    };
    private static final LifecycleManager$componentCallback$1 componentCallback = new ComponentCallbacks2() { // from class: com.mapbox.common.LifecycleManager$componentCallback$1
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            configuration.getClass();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i == 10 || i == 15 || i == 40 || i == 60) {
                Log.debug("Got onTrimMemory in LifecycleManager: " + i, "LifecycleManager");
                MemoryMonitorFactory.getOrCreate().notifySystemMemoryWarningReceived();
            }
        }
    };

    /* JADX INFO: loaded from: classes5.dex */
    public enum ActivityState {
        Unknown,
        Created,
        Started,
        Resumed,
        Paused,
        Stopped,
        SaveInstanceState,
        Destroyed
    }

    public interface Callback {
        void onLifecycleStateChanged(LifecycleState lifecycleState);
    }

    private LifecycleManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerActivityWithState(Activity activity, ActivityState activityState) {
        synchronized (this) {
            HashMap<WeakReference<Activity>, ActivityState> map = registeredActivities;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WeakReference<Activity>, ActivityState> entry : map.entrySet()) {
                Object[] objArr = {entry.getKey().get(), activity};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                registeredActivities.put(new WeakReference<>(activity), activityState);
            } else {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    registeredActivities.put((WeakReference<Activity>) ((Map.Entry) it.next()).getKey(), activityState);
                }
            }
        }
        getLifecycleState(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.LifecycleManager.registerActivityWithState.2
            public final void invoke(LifecycleState lifecycleState) {
                lifecycleState.getClass();
                LifecycleManager.INSTANCE.updateLifecycleState(lifecycleState);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LifecycleState) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterActivity(Activity activity) {
        synchronized (this) {
            HashMap<WeakReference<Activity>, ActivityState> map = registeredActivities;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WeakReference<Activity>, ActivityState> entry : map.entrySet()) {
                WeakReference<Activity> key = entry.getKey();
                if (key.get() != null) {
                    Object[] objArr = {key.get(), activity};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                registeredActivities.remove(((Map.Entry) it.next()).getKey());
            }
        }
        getLifecycleState(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.LifecycleManager.unregisterActivity.2
            public final void invoke(LifecycleState lifecycleState) {
                lifecycleState.getClass();
                LifecycleManager.INSTANCE.updateLifecycleState(lifecycleState);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LifecycleState) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLifecycleState(LifecycleState lifecycleState) {
        synchronized (this) {
            if (currentLifecycleState == lifecycleState) {
                return;
            }
            currentLifecycleState = lifecycleState;
            Callback callback2 = lifecycleCallback;
            if (callback2 != null) {
                callback2.onLifecycleStateChanged(lifecycleState);
            }
        }
    }

    public final void setCallback(final Callback callback2) {
        synchronized (this) {
            lifecycleCallback = callback2;
        }
        if (callback2 != null) {
            INSTANCE.getLifecycleState(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.LifecycleManager$setCallback$2$1
                {
                    super(1);
                }

                public final void invoke(LifecycleState lifecycleState) {
                    lifecycleState.getClass();
                    callback2.onLifecycleStateChanged(lifecycleState);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LifecycleState) obj);
                    return createFromParcel.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LifecycleState toLifecycleState(ActivityState activityState) {
        switch (WhenMappings.$EnumSwitchMapping$0[activityState.ordinal()]) {
            case 1:
                return LifecycleState.UNKNOWN;
            case 2:
                return LifecycleState.MOVING_FOREGROUND;
            case 3:
                return LifecycleState.MOVING_FOREGROUND;
            case 4:
                return LifecycleState.FOREGROUND;
            case 5:
                return LifecycleState.INACTIVE;
            case 6:
                return LifecycleState.MOVING_BACKGROUND;
            case 7:
                return LifecycleState.BACKGROUND;
            case 8:
                return LifecycleState.BACKGROUND;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }

    public final void start$common_release() {
        Context applicationContext = MapboxSDKCommon.INSTANCE.getContext().getApplicationContext();
        applicationContext.getClass();
        Application application = (Application) applicationContext;
        LifecycleUtils.INSTANCE.getLifecycleState(application, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.LifecycleManager$start$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LifecycleState) obj);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(LifecycleState lifecycleState) {
                lifecycleState.getClass();
                LifecycleManager.currentLifecycleState = lifecycleState;
            }
        });
        application.registerActivityLifecycleCallbacks(callback);
        application.registerComponentCallbacks(componentCallback);
    }

    public final void stop$common_release() {
        Context applicationContext = MapboxSDKCommon.INSTANCE.getContext().getApplicationContext();
        applicationContext.getClass();
        Application application = (Application) applicationContext;
        application.unregisterActivityLifecycleCallbacks(callback);
        application.unregisterComponentCallbacks(componentCallback);
        currentLifecycleState = LifecycleState.UNKNOWN;
        registeredActivities.clear();
    }

    /* JADX INFO: loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivityState.values().length];
            try {
                iArr[ActivityState.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityState.Created.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityState.Started.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityState.Resumed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActivityState.Paused.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActivityState.Stopped.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ActivityState.SaveInstanceState.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ActivityState.Destroyed.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$10$lambda$9(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(LifecycleState.FOREGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$14$lambda$13$lambda$12(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(LifecycleState.UNKNOWN);
    }

    public final void getLifecycleState(Looper looper, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Object isitemdismissable;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        Collection<ActivityState> collectionValues = registeredActivities.values();
        collectionValues.getClass();
        Collection<ActivityState> collection = collectionValues;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(collection, 10));
        for (ActivityState activityState : collection) {
            LifecycleManager lifecycleManager = INSTANCE;
            activityState.getClass();
            arrayList.add(lifecycleManager.toLifecycleState(activityState));
        }
        LifecycleState lifecycleState = LifecycleState.FOREGROUND;
        if (arrayList.contains(lifecycleState)) {
            updateLifecycleState(lifecycleState);
            if (looper != null) {
                new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda5(1, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
                return;
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(lifecycleState);
                return;
            }
        }
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        if (arrayList.isEmpty()) {
            LifecycleUtils.INSTANCE.getLifecycleState(context, looper, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.LifecycleManager.getLifecycleState.2
                {
                    super(1);
                }

                public final void invoke(LifecycleState lifecycleState2) {
                    lifecycleState2.getClass();
                    LifecycleManager.INSTANCE.updateLifecycleState(lifecycleState2);
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(lifecycleState2);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LifecycleState) obj);
                    return createFromParcel.INSTANCE;
                }
            });
            return;
        }
        try {
            LifecycleUtils.INSTANCE.hasServiceRunningInForeground(context, looper, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.LifecycleManager$getLifecycleState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(boolean z) {
                    if (z) {
                        LifecycleManager lifecycleManager2 = this.$this_runCatching;
                        LifecycleState lifecycleState2 = LifecycleState.FOREGROUND;
                        lifecycleManager2.updateLifecycleState(lifecycleState2);
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(lifecycleState2);
                        return;
                    }
                    Collection collectionValues2 = LifecycleManager.registeredActivities.values();
                    collectionValues2.getClass();
                    Collection<LifecycleManager.ActivityState> collection2 = collectionValues2;
                    LifecycleManager lifecycleManager3 = this.$this_runCatching;
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(collection2, 10));
                    for (LifecycleManager.ActivityState activityState2 : collection2) {
                        activityState2.getClass();
                        arrayList2.add(lifecycleManager3.toLifecycleState(activityState2));
                    }
                    LifecycleState[] lifecycleStateArr = {LifecycleState.FOREGROUND, LifecycleState.MOVING_FOREGROUND, LifecycleState.INACTIVE, LifecycleState.MOVING_BACKGROUND};
                    for (int i = 0; i < 4; i++) {
                        LifecycleState lifecycleState3 = lifecycleStateArr[i];
                        if (arrayList2.contains(lifecycleState3)) {
                            this.$this_runCatching.updateLifecycleState(lifecycleState3);
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(lifecycleState3);
                            return;
                        }
                    }
                    LifecycleManager lifecycleManager4 = this.$this_runCatching;
                    LifecycleState lifecycleState4 = LifecycleState.BACKGROUND;
                    lifecycleManager4.updateLifecycleState(lifecycleState4);
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(lifecycleState4);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return createFromParcel.INSTANCE;
                }
            });
            isitemdismissable = createFromParcel.INSTANCE;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer != null) {
            Log.error("Failed to get application state: " + thSerializer, TAG);
            if (looper != null) {
                new Handler(looper).post(new LifecycleUtils$$ExternalSyntheticLambda5(2, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(LifecycleState.UNKNOWN);
            }
        }
    }
}
