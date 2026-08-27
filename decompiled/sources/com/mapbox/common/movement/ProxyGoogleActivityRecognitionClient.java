package com.mapbox.common.movement;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.location.FailedTask;
import com.mapbox.common.location.GoogleDeviceLocationProviderKt;
import com.mapbox.common.location.IncompatibleGooglePlayServicesActivityRecognitionVersion;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.lang.reflect.Method;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class ProxyGoogleActivityRecognitionClient {
    public static final Companion Companion = new Companion(null);
    private static final onViewDetachedFromWindowlambda1 available$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.movement.ProxyGoogleActivityRecognitionClient$Companion$available$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Boolean invoke() {
            return Boolean.valueOf(GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayActivityRecognitionAvailable());
        }
    }});
    private static Method removeActivityTransitionUpdates;
    private static Method removeActivityUpdates;
    private static Method requestActivityTransitionUpdates;
    private static Method requestActivityUpdates;
    private final Object googleActivityRecognitionClient;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getAvailable$common_release() {
            return ((Boolean) ProxyGoogleActivityRecognitionClient.available$delegate.MediaSessionCompatResultReceiverWrapper()).booleanValue();
        }

        public final void verifyAndCacheMethods$common_release() throws IncompatibleGooglePlayServicesActivityRecognitionVersion {
            try {
                Companion companion = ProxyGoogleActivityRecognitionClient.Companion;
                Method method = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("requestActivityTransitionUpdates", ActivityTransitionRequest.class, PendingIntent.class);
                method.getClass();
                ProxyGoogleActivityRecognitionClient.requestActivityTransitionUpdates = method;
                Method method2 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("requestActivityUpdates", Long.TYPE, PendingIntent.class);
                method2.getClass();
                ProxyGoogleActivityRecognitionClient.requestActivityUpdates = method2;
                Method method3 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("removeActivityTransitionUpdates", PendingIntent.class);
                method3.getClass();
                ProxyGoogleActivityRecognitionClient.removeActivityTransitionUpdates = method3;
                Method method4 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("removeActivityUpdates", PendingIntent.class);
                method4.getClass();
                ProxyGoogleActivityRecognitionClient.removeActivityUpdates = method4;
            } catch (ClassNotFoundException e) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e);
            } catch (NoSuchMethodException e2) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e2);
            } catch (SecurityException e3) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e3);
            }
        }
    }

    public ProxyGoogleActivityRecognitionClient(Context context) {
        context.getClass();
        com.google.android.gms.location.ActivityRecognitionClient client = ActivityRecognition.getClient(context);
        client.getClass();
        this.googleActivityRecognitionClient = client;
    }

    public final Task removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        try {
            Method method = removeActivityTransitionUpdates;
            if (method == null) {
                removeNodeAtDepth.serializer("removeActivityTransitionUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, pendingIntent);
            objInvoke.getClass();
            return (Task) objInvoke;
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }

    public final Task removeActivityUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        try {
            Method method = removeActivityUpdates;
            if (method == null) {
                removeNodeAtDepth.serializer("removeActivityUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, pendingIntent);
            objInvoke.getClass();
            return (Task) objInvoke;
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }

    public final Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        activityTransitionRequest.getClass();
        pendingIntent.getClass();
        try {
            Method method = requestActivityTransitionUpdates;
            if (method == null) {
                removeNodeAtDepth.serializer("requestActivityTransitionUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, activityTransitionRequest, pendingIntent);
            objInvoke.getClass();
            return (Task) objInvoke;
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }

    public final Task requestActivityUpdates(long j, PendingIntent pendingIntent) {
        pendingIntent.getClass();
        try {
            Method method = requestActivityUpdates;
            if (method == null) {
                removeNodeAtDepth.serializer("requestActivityUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, Long.valueOf(j), pendingIntent);
            objInvoke.getClass();
            return (Task) objInvoke;
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }
}
