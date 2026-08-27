package o;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LocationServicesAPI")
public class r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final isGeofencesEnabledFromEnvironmentlambda1 read;
    private final Context serializer;
    private final r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc write;

    @SuppressLint
    public final Location read(long j) {
        Object result = null;
        if (this.read.MediaMetadataCompat()) {
            Task taskSerializer = this.write.serializer();
            r8lambdaQb7XQwxp_OYP0coB4URxbNrtsHY.read(taskSerializer, this.RemoteActionCompatParcelizer, "getLastLocation", this.IconCompatParcelizer, j);
            if (taskSerializer.isSuccessful()) {
                try {
                    result = taskSerializer.getResult();
                } catch (RuntimeExecutionException | IllegalStateException unused) {
                }
                return (Location) result;
            }
            r8lambdaQb7XQwxp_OYP0coB4URxbNrtsHY.read(taskSerializer, this.RemoteActionCompatParcelizer, "Failed to get last location");
        }
        return null;
    }

    @SuppressLint
    public final void write(long j, PendingIntent pendingIntent) {
        if (this.read.MediaMetadataCompat()) {
            this.write.IconCompatParcelizer(IconCompatParcelizer(j, (Long) null), pendingIntent).addOnFailureListener(new getDEFAULT_PUSH_DELIVERY_MAX_FLUSHandroid_sdk_base_releaseannotations(this, 1));
        }
    }

    public r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY(Context context, parseLonglambda0 parselonglambda0, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc) {
        this.serializer = context;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = isgeofencesenabledfromenvironmentlambda1;
        this.write = r8lambdaepgoz_b4yaunnacjvuptzhsystc;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public static void IconCompatParcelizer(r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, Exception exc) {
        r8lambdalvr3ms6iw1pdnawn92rvcukzrsy.RemoteActionCompatParcelizer.IconCompatParcelizer(false, exc, "Failed to request location updates", new Object[0]);
    }

    public static void RemoteActionCompatParcelizer(r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, Exception exc) {
        r8lambdalvr3ms6iw1pdnawn92rvcukzrsy.RemoteActionCompatParcelizer.IconCompatParcelizer(false, exc, "Failed to remove location updates", new Object[0]);
    }

    public static void read(r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, Exception exc) {
        r8lambdalvr3ms6iw1pdnawn92rvcukzrsy.RemoteActionCompatParcelizer.IconCompatParcelizer(false, exc, "Failed to request location updates", new Object[0]);
    }

    public final void write(PendingIntent pendingIntent) {
        this.write.write(pendingIntent).addOnFailureListener(new getDEFAULT_PUSH_DELIVERY_MAX_FLUSHandroid_sdk_base_releaseannotations(this, 0));
    }

    @SuppressLint
    public final void read(long j, PendingIntent pendingIntent) {
        if (this.read.MediaMetadataCompat()) {
            this.write.IconCompatParcelizer(IconCompatParcelizer(1000L, Long.valueOf(j)), pendingIntent).addOnFailureListener(new getDEFAULT_PUSH_DELIVERY_MAX_FLUSHandroid_sdk_base_releaseannotations(this, 2));
        }
    }

    public final boolean write() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.serializer) == 0;
        } catch (Exception e) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to check google play services availability", new Object[0]);
            return false;
        }
    }

    private static LocationRequest IconCompatParcelizer(long j, Long l) {
        if (l == null) {
            return LocationRequest.create().setInterval(j).setFastestInterval(j).setPriority(100);
        }
        return LocationRequest.create().setExpirationDuration(l.longValue()).setInterval(j).setFastestInterval(j).setPriority(100);
    }
}
