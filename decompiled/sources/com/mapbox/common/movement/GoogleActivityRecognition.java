package com.mapbox.common.movement;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.sqlite.SQLite;
import com.braze.Braze$Companion$$ExternalSyntheticLambda4;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.tasks.Task;
import com.incognia.internal.mn$$ExternalSyntheticLambda0;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementMode;
import com.mapbox.common.MovementModeProvider;
import com.mapbox.common.location.GoogleDeviceLocationProviderKt;
import com.mapbox.common.location.LocationServiceUtils;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.FocusListener;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.isAdapterPositionOnScreen;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleActivityRecognition implements ActivityRecognitionClient {
    private static final long ACTIVITY_DETECTION_INTERVAL_MILLIS = 1000;
    public static final String ACTIVITY_UPDATES_ACTION = "com.mapbox.common.movement.action.ACTIVITY_RECOGNITION_UPDATES";
    private static final int ACTIVITY_UPDATES_CODE = 1000;
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ActivityRecognitionObserver";
    private static final int TRANSITION_API_CONFIDENCE_SCORE = 85;
    private final ProxyGoogleActivityRecognitionClient activityClient;
    private final IntentFilter activityUpdatesIntentFilter;
    private final onViewDetachedFromWindowlambda1 activityUpdatesPendingIntent$delegate;
    private final GoogleActivityRecognition$broadcast$1 broadcast;
    private final Context context;
    private boolean isSubscribed;
    private final Mode mode;
    private final CopyOnWriteArrayList<ActivityRecognitionClient.Observer> observers;
    private static final onViewDetachedFromWindowlambda1 TRANSITION_API_MONITORING_TYPES$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final List<ActivityTransition> invoke() {
            List list = SQLite.read(0, 2, 8, 7, 1, 3);
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ActivityTransition.Builder().setActivityType(((Number) it.next()).intValue()).setActivityTransition(0).build());
            }
            return arrayList;
        }
    }});
    public static final String GOOGLE_ACTIVITY_RECOGNITION_CLIENT = "com.google.android.gms.location.ActivityRecognitionClient";
    private static boolean googlePlayActivityRecognitionBundled = LocationServiceUtils.isOnClasspath(GOOGLE_ACTIVITY_RECOGNITION_CLIENT);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getACTIVITY_UPDATES_ACTION$annotations() {
        }

        public static /* synthetic */ void getGooglePlayActivityRecognitionBundled$common_release$annotations() {
        }

        public final boolean getGooglePlayActivityRecognitionBundled$common_release() {
            return GoogleActivityRecognition.googlePlayActivityRecognitionBundled;
        }

        public final void setGooglePlayActivityRecognitionBundled$common_release(boolean z) {
            GoogleActivityRecognition.googlePlayActivityRecognitionBundled = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Task withLogs(Task task, final String str) {
            Task taskAddOnFailureListener = task.addOnSuccessListener(new mn$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$Companion$withLogs$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4584invoke(T t) {
                    MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, str + " success");
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m4584invoke(obj);
                    return createFromParcel.INSTANCE;
                }
            }, 12)).addOnFailureListener(new Braze$Companion$$ExternalSyntheticLambda4(str, 3));
            taskAddOnFailureListener.getClass();
            return taskAddOnFailureListener;
        }

        private final MovementInfo toMovementInfo(ActivityTransitionResult activityTransitionResult, MovementModeProvider movementModeProvider) {
            List<ActivityTransitionEvent> transitionEvents;
            MovementMode movementModeFromGmsType;
            if (activityTransitionResult == null || (transitionEvents = activityTransitionResult.getTransitionEvents()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (ActivityTransitionEvent activityTransitionEvent : transitionEvents) {
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (activityTransitionEvent.getTransitionType() == 0 && (movementModeFromGmsType = GoogleActivityRecognition.Companion.fromGmsType(activityTransitionEvent.getActivityType())) != null) ? new onViewAttachedToWindowlambda0(movementModeFromGmsType, Integer.valueOf(GoogleActivityRecognition.TRANSITION_API_CONFIDENCE_SCORE)) : null;
                if (onviewattachedtowindowlambda0 != null) {
                    arrayList.add(onviewattachedtowindowlambda0);
                }
            }
            return new MovementInfo(new HashMap(onMove.serializer(arrayList)), movementModeProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void withLogs$lambda$6(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void withLogs$lambda$7(String str, Exception exc) {
            str.getClass();
            exc.getClass();
            MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, str + " failure: " + exc);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<ActivityTransition> getTRANSITION_API_MONITORING_TYPES() {
            return (List) GoogleActivityRecognition.TRANSITION_API_MONITORING_TYPES$delegate.MediaSessionCompatResultReceiverWrapper();
        }

        public static /* synthetic */ MovementInfo toMovementInfo$default(Companion companion, ActivityTransitionResult activityTransitionResult, MovementModeProvider movementModeProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                movementModeProvider = MovementModeProvider.SYSTEM;
            }
            return companion.toMovementInfo(activityTransitionResult, movementModeProvider);
        }

        public final boolean isAvailable$common_release() {
            return LocationServiceUtils.getGooglePlayServicesBundled() && getGooglePlayActivityRecognitionBundled$common_release() && ProxyGoogleActivityRecognitionClient.Companion.getAvailable$common_release() && GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesReady();
        }

        public static /* synthetic */ MovementInfo toMovementInfo$default(Companion companion, ActivityRecognitionResult activityRecognitionResult, MovementModeProvider movementModeProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                movementModeProvider = MovementModeProvider.SYSTEM;
            }
            return companion.toMovementInfo(activityRecognitionResult, movementModeProvider);
        }

        private final MovementMode fromGmsType(int i) {
            if (i == 0) {
                return MovementMode.IN_VEHICLE;
            }
            if (i == 1) {
                return MovementMode.CYCLING;
            }
            if (i == 2) {
                return MovementMode.ON_FOOT;
            }
            if (i == 3) {
                return MovementMode.STATIONARY;
            }
            if (i == 7) {
                return MovementMode.WALKING;
            }
            if (i != 8) {
                return null;
            }
            return MovementMode.RUNNING;
        }

        private final MovementInfo toMovementInfo(ActivityRecognitionResult activityRecognitionResult, MovementModeProvider movementModeProvider) {
            List<DetectedActivity> probableActivities;
            if (activityRecognitionResult == null || (probableActivities = activityRecognitionResult.getProbableActivities()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (DetectedActivity detectedActivity : probableActivities) {
                MovementMode movementModeFromGmsType = GoogleActivityRecognition.Companion.fromGmsType(detectedActivity.getType());
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = movementModeFromGmsType != null ? new onViewAttachedToWindowlambda0(movementModeFromGmsType, Integer.valueOf(detectedActivity.getConfidence())) : null;
                if (onviewattachedtowindowlambda0 != null) {
                    arrayList.add(onviewattachedtowindowlambda0);
                }
            }
            return new MovementInfo(new HashMap(onMove.serializer(arrayList)), movementModeProvider);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum Mode {
        TRANSITION_API,
        SAMPLING_API
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public boolean isPlatformActivityRecognitionAvailable() {
        return hasActivityRecognitionPermission();
    }

    private final PendingIntent getActivityUpdatesPendingIntent() {
        Object objMediaSessionCompatResultReceiverWrapper = this.activityUpdatesPendingIntent$delegate.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return (PendingIntent) objMediaSessionCompatResultReceiverWrapper;
    }

    private final boolean hasActivityRecognitionPermission() {
        return FocusListener.write(this.context, activityRecognitionPermissionName()) == 0;
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    @SuppressLint
    public void start() {
        synchronized (this) {
            if (!this.isSubscribed && hasActivityRecognitionPermission()) {
                this.isSubscribed = true;
                int i = Build.VERSION.SDK_INT;
                Context context = this.context;
                if (i >= 31) {
                    context.registerReceiver(this.broadcast, this.activityUpdatesIntentFilter, 2);
                } else {
                    context.registerReceiver(this.broadcast, this.activityUpdatesIntentFilter);
                }
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
                if (i2 == 1) {
                    Companion companion = Companion;
                    companion.withLogs(this.activityClient.requestActivityTransitionUpdates(new ActivityTransitionRequest(companion.getTRANSITION_API_MONITORING_TYPES()), getActivityUpdatesPendingIntent()), "requestActivityTransitionUpdates");
                } else if (i2 == 2) {
                    Companion.withLogs(this.activityClient.requestActivityUpdates(1000L, getActivityUpdatesPendingIntent()), "requestActivityUpdates");
                }
                return;
            }
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "start() skipped. isSubscribed: " + this.isSubscribed + ", has permission: " + hasActivityRecognitionPermission());
        }
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    @SuppressLint
    public void stop() {
        synchronized (this) {
            if (this.isSubscribed && hasActivityRecognitionPermission()) {
                this.isSubscribed = false;
                this.context.unregisterReceiver(this.broadcast);
                int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
                if (i == 1) {
                    Companion.withLogs(this.activityClient.removeActivityTransitionUpdates(getActivityUpdatesPendingIntent()), "removeActivityTransitionUpdates");
                } else if (i == 2) {
                    Companion.withLogs(this.activityClient.removeActivityUpdates(getActivityUpdatesPendingIntent()), "removeActivityUpdates");
                }
                return;
            }
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "stop() skipped. isSubscribed: " + this.isSubscribed + ", has permission: " + hasActivityRecognitionPermission());
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.TRANSITION_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.SAMPLING_API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1] */
    public GoogleActivityRecognition(Context context, Mode mode) {
        context.getClass();
        mode.getClass();
        this.context = context;
        this.mode = mode;
        this.observers = new CopyOnWriteArrayList<>();
        this.activityClient = new ProxyGoogleActivityRecognitionClient(context);
        this.activityUpdatesIntentFilter = new IntentFilter(ACTIVITY_UPDATES_ACTION);
        this.activityUpdatesPendingIntent$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$activityUpdatesPendingIntent$2
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final PendingIntent invoke() {
                int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                Intent intent = new Intent(GoogleActivityRecognition.ACTIVITY_UPDATES_ACTION);
                intent.setPackage(this.this$0.context.getPackageName());
                return PendingIntent.getBroadcast(this.this$0.context, 1000, intent, i);
            }
        });
        this.broadcast = new BroadcastReceiver() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1

            /* JADX INFO: loaded from: classes5.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GoogleActivityRecognition.Mode.values().length];
                    try {
                        iArr[GoogleActivityRecognition.Mode.TRANSITION_API.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GoogleActivityRecognition.Mode.SAMPLING_API.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                MovementInfo movementInfo$default;
                MovementInfo movementInfo$default2;
                context2.getClass();
                intent.getClass();
                int i = WhenMappings.$EnumSwitchMapping$0[this.this$0.mode.ordinal()];
                if (i == 1) {
                    if (ActivityTransitionResult.hasResult(intent)) {
                        MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, "Activity transition result received");
                        ActivityTransitionResult activityTransitionResultExtractResult = ActivityTransitionResult.extractResult(intent);
                        if (activityTransitionResultExtractResult == null || (movementInfo$default = GoogleActivityRecognition.Companion.toMovementInfo$default(GoogleActivityRecognition.Companion, activityTransitionResultExtractResult, (MovementModeProvider) null, 1, (Object) null)) == null) {
                            return;
                        }
                        Iterator it = this.this$0.observers.iterator();
                        while (it.hasNext()) {
                            ((ActivityRecognitionClient.Observer) it.next()).onMovementInfo(movementInfo$default);
                        }
                        return;
                    }
                    return;
                }
                if (i == 2 && ActivityRecognitionResult.hasResult(intent)) {
                    MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, "Activity recognition result received");
                    ActivityRecognitionResult activityRecognitionResultExtractResult = ActivityRecognitionResult.extractResult(intent);
                    if (activityRecognitionResultExtractResult == null || (movementInfo$default2 = GoogleActivityRecognition.Companion.toMovementInfo$default(GoogleActivityRecognition.Companion, activityRecognitionResultExtractResult, (MovementModeProvider) null, 1, (Object) null)) == null) {
                        return;
                    }
                    Iterator it2 = this.this$0.observers.iterator();
                    while (it2.hasNext()) {
                        ((ActivityRecognitionClient.Observer) it2.next()).onMovementInfo(movementInfo$default2);
                    }
                }
            }
        };
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void addObserver(ActivityRecognitionClient.Observer observer) {
        observer.getClass();
        this.observers.add(observer);
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void removeObserver(ActivityRecognitionClient.Observer observer) {
        observer.getClass();
        this.observers.remove(observer);
    }

    private final String activityRecognitionPermissionName() {
        return Build.VERSION.SDK_INT >= 29 ? "android.permission.ACTIVITY_RECOGNITION" : "com.google.android.gms.permission.ACTIVITY_RECOGNITION";
    }

    public /* synthetic */ GoogleActivityRecognition(Context context, Mode mode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Mode.TRANSITION_API : mode);
    }
}
