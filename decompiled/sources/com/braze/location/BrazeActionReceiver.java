package com.braze.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Keep;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.braze.BrazeInternal;
import com.braze.BrazeUser$$ExternalSyntheticLambda3;
import com.braze.Constants;
import com.braze.enums.GeofenceTransitionType;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setViewAccessibilityFlagMap;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class BrazeActionReceiver extends BroadcastReceiver {

    public static final class ActionReceiver {
        public static final Companion Companion = new Companion(null);
        private final String action;
        private final Context applicationContext;
        private final Intent intent;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String handleGeofenceEvent$lambda$0(int i) {
                return c8$$ExternalSyntheticOutline0.m(i, "Location Services error: ");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String handleGeofenceEvent$lambda$3(int i) {
                return c8$$ExternalSyntheticOutline0.m(i, "Unsupported transition type received: ");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean handleSingleLocationUpdate(Context context, Location location) {
                try {
                    BrazeInternal.logLocationRecordedEvent(context, new BrazeLocation(location));
                    return true;
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(28), 4, (Object) null);
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String handleSingleLocationUpdate$lambda$0() {
                return "Exception while processing single location update";
            }

            public final boolean handleGeofenceEvent(Context context, GeofencingEvent geofencingEvent) {
                context.getClass();
                geofencingEvent.getClass();
                if (geofencingEvent.hasError()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(geofencingEvent.getErrorCode(), 8), 6, (Object) null);
                    return false;
                }
                int geofenceTransition = geofencingEvent.getGeofenceTransition();
                List<Geofence> triggeringGeofences = geofencingEvent.getTriggeringGeofences();
                if (1 == geofenceTransition) {
                    if (triggeringGeofences != null) {
                        Iterator<T> it = triggeringGeofences.iterator();
                        while (it.hasNext()) {
                            String requestId = ((Geofence) it.next()).getRequestId();
                            requestId.getClass();
                            BrazeInternal.recordGeofenceTransition(context, requestId, GeofenceTransitionType.ENTER);
                        }
                    }
                } else {
                    if (2 != geofenceTransition) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(geofenceTransition, 9), 6, (Object) null);
                        return false;
                    }
                    if (triggeringGeofences != null) {
                        Iterator<T> it2 = triggeringGeofences.iterator();
                        while (it2.hasNext()) {
                            String requestId2 = ((Geofence) it2.next()).getRequestId();
                            requestId2.getClass();
                            BrazeInternal.recordGeofenceTransition(context, requestId2, GeofenceTransitionType.EXIT);
                        }
                    }
                }
                return true;
            }

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$1() {
            return "Received intent with null action. Doing nothing.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String run$lambda$0(ActionReceiver actionReceiver) {
            return "Caught exception while performing the BrazeActionReceiver work. Action: " + actionReceiver.action + " Intent: " + actionReceiver.intent;
        }

        public ActionReceiver(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            this.applicationContext = context;
            this.intent = intent;
            this.action = intent.getAction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$0(ActionReceiver actionReceiver) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Received intent with action ", actionReceiver.action);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$2(ActionReceiver actionReceiver) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("BrazeActionReceiver received intent with geofence transition: ", actionReceiver.action);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$4(ActionReceiver actionReceiver) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("BrazeActionReceiver received intent with single location update: ", actionReceiver.action);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String performWork$lambda$6(ActionReceiver actionReceiver) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unknown intent received in BrazeActionReceiver with action: ", actionReceiver.action);
        }

        public final void performWork() {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActionReceiver$ActionReceiver$$ExternalSyntheticLambda0(this, 0), 7, (Object) null);
            String str = this.action;
            if (str == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(27), 7, (Object) null);
                return;
            }
            if (str.equals(Constants.BRAZE_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActionReceiver$ActionReceiver$$ExternalSyntheticLambda0(this, 1), 7, (Object) null);
                GeofencingEvent geofencingEventFromIntent = GeofencingEvent.fromIntent(this.intent);
                if (geofencingEventFromIntent != null) {
                    Companion.handleGeofenceEvent(this.applicationContext, geofencingEventFromIntent);
                    return;
                }
                return;
            }
            if (!str.equals(Constants.BRAZE_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActionReceiver$ActionReceiver$$ExternalSyntheticLambda0(this, 3), 6, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActionReceiver$ActionReceiver$$ExternalSyntheticLambda0(this, 2), 7, (Object) null);
            int i = Build.VERSION.SDK_INT;
            Intent intent = this.intent;
            Location location = null;
            if (i >= 33) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    location = (Location) extras.getParcelable("location", Location.class);
                }
            } else {
                Bundle extras2 = intent.getExtras();
                location = (Location) (extras2 != null ? extras2.get("location") : null);
            }
            if (location != null) {
                Companion.handleSingleLocationUpdate(this.applicationContext, location);
            }
        }

        public final void run() {
            try {
                performWork();
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActionReceiver$ActionReceiver$$ExternalSyntheticLambda0(this, 4), 4, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.braze.location.BrazeActionReceiver$onReceive$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ ActionReceiver $actionReceiver;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ActionReceiver actionReceiver, BroadcastReceiver.PendingResult pendingResult, ShortNewsContentCardView<? super AnonymousClass3> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$actionReceiver = actionReceiver;
            this.$pendingResult = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass3(this.$actionReceiver, this.$pendingResult, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.$actionReceiver.run();
            this.$pendingResult.finish();
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0() {
        return "BrazeActionReceiver received null intent. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$1() {
        return "BrazeActionReceiver received null context. Doing nothing.";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(25), 6, (Object) null);
            return;
        }
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(26), 6, (Object) null);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        applicationContext.getClass();
        ActionReceiver actionReceiver = new ActionReceiver(applicationContext, intent);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(setViewAccessibilityFlagMap.serializer, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new AnonymousClass3(actionReceiver, pendingResultGoAsync, null), 2);
    }
}
