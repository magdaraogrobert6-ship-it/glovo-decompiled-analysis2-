package o;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.location.Location;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.devicestate.LocationPermissionLevel;
import com.sentiance.sdk.devicestate.Permission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "GeofenceApi")
public class getShouldFetchTestTriggers {
    private final onLocationRequestCompletelambda1 IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc read;
    private final getDismissalTimeMs serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    @SuppressLint
    private boolean IconCompatParcelizer(List<setConfigurationProvider> list, PendingIntent pendingIntent) {
        synchronized (this) {
            if (!read()) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer("addGeofencesSync: location permission not granted", new Object[0]);
                return false;
            }
            Task taskWrite = this.read.write(IconCompatParcelizer(list), pendingIntent);
            r8lambdaQb7XQwxp_OYP0coB4URxbNrtsHY.read(taskWrite, this.RemoteActionCompatParcelizer, "addGeofencesSync", this.write, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("addGeofencesSync result: %s", Boolean.valueOf(taskWrite.isSuccessful()));
            if (!taskWrite.isSuccessful()) {
                r8lambdaQb7XQwxp_OYP0coB4URxbNrtsHY.read(taskWrite, this.RemoteActionCompatParcelizer, "Failed to add geofences");
            }
            return taskWrite.isSuccessful();
        }
    }

    private static GeofencingRequest IconCompatParcelizer(List list) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.setInitialTrigger(7);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            setConfigurationProvider setconfigurationprovider = (setConfigurationProvider) it.next();
            Geofence.Builder loiteringDelay = new Geofence.Builder().setRequestId(setconfigurationprovider.write).setCircularRegion(setconfigurationprovider.read, setconfigurationprovider.IconCompatParcelizer, setconfigurationprovider.RemoteActionCompatParcelizer).setExpirationDuration(-1L).setLoiteringDelay(setconfigurationprovider.RatingCompat * 1000);
            boolean z = setconfigurationprovider.MediaMetadataCompat;
            int i = 0;
            int i2 = setconfigurationprovider.MediaSessionCompatQueueItem ? 2 : 0;
            if (setconfigurationprovider.MediaBrowserCompatMediaItem) {
                i = 4;
            }
            arrayList.add(loiteringDelay.setTransitionTypes((z ? 1 : 0) | i2 | i).build());
        }
        return builder.addGeofences(arrayList).build();
    }

    public final ArrayList RemoteActionCompatParcelizer(List list) {
        ArrayList arrayList = new ArrayList();
        if (!read()) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Cannot remove geofences. Location permission is not granted.", new Object[0]);
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            synchronized (this) {
                if (read()) {
                    Task task = this.read.read(Collections.singletonList(str));
                    r8lambdaQb7XQwxp_OYP0coB4URxbNrtsHY.read(task, this.RemoteActionCompatParcelizer, "removeGeofenceSync", this.write, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer("removeGeofenceSync result: %s", Boolean.valueOf(task.isSuccessful()));
                    if (!task.isSuccessful()) {
                        r8lambdaQb7XQwxp_OYP0coB4URxbNrtsHY.read(task, this.RemoteActionCompatParcelizer, "Failed to remove geofences");
                    }
                    task.isSuccessful();
                } else {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer("removeGeofenceSync: location permission not granted", new Object[0]);
                }
            }
        }
        return arrayList;
    }

    public getShouldFetchTestTriggers(parseLonglambda0 parselonglambda0, getDismissalTimeMs getdismissaltimems, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = getdismissaltimems;
        this.IconCompatParcelizer = onlocationrequestcompletelambda1;
        this.read = r8lambdaepgoz_b4yaunnacjvuptzhsystc;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final boolean serializer(List<setConfigurationProvider> list, PendingIntent pendingIntent) {
        boolean zIconCompatParcelizer;
        synchronized (this) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Adding geofences: " + list, new Object[0]);
            zIconCompatParcelizer = IconCompatParcelizer(list, pendingIntent);
        }
        return zIconCompatParcelizer;
    }

    public final boolean read() {
        onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = this.IconCompatParcelizer;
        if (onlocationrequestcompletelambda1.write() != LocationPermissionLevel.ALWAYS) {
            return false;
        }
        onlocationrequestcompletelambda1.getClass();
        return onlocationrequestcompletelambda1.write(Permission.FINE_LOCATION);
    }

    public final setConfigurationProvider read(Location location, int i, int i2) {
        return new setConfigurationProvider(this.serializer.serializer(), UUID.randomUUID().toString(), location.getLatitude(), location.getLongitude(), i, location.getProvider(), true, true, true, i2);
    }
}
