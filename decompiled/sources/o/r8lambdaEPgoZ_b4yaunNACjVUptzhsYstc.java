package o;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.SdkException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "GooglePlayServicesClient")
public class r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc {
    private final ActivityRecognitionClient IconCompatParcelizer;
    private final Method MediaBrowserCompatMediaItem;
    private final Method MediaDescriptionCompat;
    private final Method MediaMetadataCompat;
    private final Method MediaSessionCompatQueueItem;
    private final Method MediaSessionCompatResultReceiverWrapper;
    private final Method MediaSessionCompatToken;
    private final Method ParcelableVolumeInfo;
    private final Method PlaybackStateCompat;
    private final Method PlaybackStateCompatCustomAction;
    private final migrateTriggersReeligibilityToJsonlambda1<Boolean> RatingCompat;
    private final GeofencingClient RemoteActionCompatParcelizer;
    private final FusedLocationProviderClient read;
    private final postGeofenceReportlambda0 serializer;
    private final parseLonglambda0 write;

    public final Task serializer(PendingIntent pendingIntent) {
        return serializer(this.IconCompatParcelizer, this.PlaybackStateCompat, pendingIntent);
    }

    public final Task write(PendingIntent pendingIntent) {
        Task taskSerializer = serializer(this.read, this.MediaMetadataCompat, pendingIntent);
        this.serializer.read(taskSerializer);
        return taskSerializer;
    }

    public final boolean write() {
        return this.RatingCompat.read().booleanValue();
    }

    public r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc(Context context, parseLonglambda0 parselonglambda0, postGeofenceReportlambda0 postgeofencereportlambda0) {
        this.write = parselonglambda0;
        this.serializer = postgeofencereportlambda0;
        GeofencingClient geofencingClient = LocationServices.getGeofencingClient(context);
        this.RemoteActionCompatParcelizer = geofencingClient;
        ActivityRecognitionClient client = ActivityRecognition.getClient(context);
        this.IconCompatParcelizer = client;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        this.read = fusedLocationProviderClient;
        this.RatingCompat = new TriggerDataStoreProviderCompanion(this);
        this.MediaSessionCompatQueueItem = serializer(geofencingClient, "removeGeofences", List.class);
        serializer(geofencingClient, "removeGeofences", PendingIntent.class);
        this.MediaBrowserCompatMediaItem = serializer(geofencingClient, "addGeofences", GeofencingRequest.class, PendingIntent.class);
        this.MediaDescriptionCompat = serializer(fusedLocationProviderClient, "getLastLocation", new Class[0]);
        this.MediaMetadataCompat = serializer(fusedLocationProviderClient, "removeLocationUpdates", PendingIntent.class);
        this.PlaybackStateCompatCustomAction = serializer(fusedLocationProviderClient, "requestLocationUpdates", LocationRequest.class, PendingIntent.class);
        this.PlaybackStateCompat = serializer(client, "removeActivityUpdates", PendingIntent.class);
        this.MediaSessionCompatToken = serializer(client, "requestActivityUpdates", Long.TYPE, PendingIntent.class);
        this.MediaSessionCompatResultReceiverWrapper = serializer(client, "requestActivityTransitionUpdates", ActivityTransitionRequest.class, PendingIntent.class);
        this.ParcelableVolumeInfo = serializer(client, "removeActivityTransitionUpdates", PendingIntent.class);
    }

    @SuppressLint
    private static Method serializer(accessgetNumPadAddcp accessgetnumpadaddcp, String str, Class... clsArr) {
        try {
            Method declaredMethod = accessgetnumpadaddcp.getClass().getDeclaredMethod(str, clsArr);
            if (Task.class.isAssignableFrom(declaredMethod.getReturnType())) {
                return declaredMethod;
            }
            throw new SdkException("Could not load method " + str + " from class " + accessgetnumpadaddcp.getClass().getName() + " with a Task return type");
        } catch (NoSuchMethodException | SecurityException e) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Could not load method ", str, " from class ");
            sbM.append(accessgetnumpadaddcp.getClass().getName());
            throw new SdkException(sbM.toString(), e);
        }
    }

    public final Task read(List<String> list) {
        return serializer(this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, list);
    }

    public final Task write(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return serializer(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, geofencingRequest, pendingIntent);
    }

    public final Task serializer() {
        return serializer(this.read, this.MediaDescriptionCompat, new Object[0]);
    }

    public final Task IconCompatParcelizer(LocationRequest locationRequest, PendingIntent pendingIntent) {
        Task taskSerializer = serializer(this.read, this.PlaybackStateCompatCustomAction, locationRequest, pendingIntent);
        this.serializer.RemoteActionCompatParcelizer(locationRequest, taskSerializer);
        return taskSerializer;
    }

    public final Task IconCompatParcelizer(long j, PendingIntent pendingIntent) {
        return serializer(this.IconCompatParcelizer, this.MediaSessionCompatToken, Long.valueOf(j), pendingIntent);
    }

    public final Task read(PendingIntent pendingIntent) {
        return serializer(this.IconCompatParcelizer, this.ParcelableVolumeInfo, pendingIntent);
    }

    public final Task serializer(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        return serializer(this.IconCompatParcelizer, this.MediaSessionCompatResultReceiverWrapper, activityTransitionRequest, pendingIntent);
    }

    public static boolean write(r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc) {
        try {
            int i = ActivityTransition.ACTIVITY_TRANSITION_ENTER;
            return true;
        } catch (ClassNotFoundException e) {
            r8lambdaepgoz_b4yaunnacjvuptzhsystc.write.IconCompatParcelizer(false, e, "Activity transition is not supported", new Object[0]);
            return false;
        }
    }

    private Task serializer(accessgetNumPadAddcp accessgetnumpadaddcp, Method method, Object... objArr) {
        Exception exc;
        String message;
        try {
            Object objInvoke = method.invoke(accessgetnumpadaddcp, objArr);
            if (objInvoke != null) {
                return (Task) objInvoke;
            }
            message = "Result was null";
            exc = null;
        } catch (Exception e) {
            exc = e;
            message = e.getMessage();
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Failed to invoke ", method.getName(), " for class ", accessgetnumpadaddcp.getClass().getName(), ". ");
        sbM.append(message);
        String string = sbM.toString();
        parseLonglambda0 parselonglambda0 = this.write;
        if (exc != null) {
            parselonglambda0.IconCompatParcelizer(false, exc, string, new Object[0]);
        } else {
            parselonglambda0.RemoteActionCompatParcelizer(string, new Object[0]);
        }
        return new com.sentiance.sdk.util.f(string, exc);
    }
}
