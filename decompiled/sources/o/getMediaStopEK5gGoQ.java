package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import androidx.camera.video.Recorder$3;
import androidx.cardview.widget.CardView$1;
import androidx.transition.Transition$1;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.location.zzak;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationListener;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.Timestamp;
import com.huawei.location.Vw$Vw;
import java.util.concurrent.Executor;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaStopEK5gGoQ extends accessgetNumPad7cp implements FusedLocationProviderClient {
    public static Object serializer;
    public static final accessgetNumLockcp RemoteActionCompatParcelizer = new accessgetNumLockcp("LocationServices.API", new getMenuEK5gGoQ(), new io.sentry.hints.PlaybackStateCompatCustomAction(8));
    public static final Object IconCompatParcelizer = new Object();

    public final zzw IconCompatParcelizer(LocationRequest locationRequest, scale0AR0LA0default scale0ar0la0default) {
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, scale0ar0la0default, speculativeHit.write);
        zzbv zzbvVar = new zzbv(r8lambdalmkbrrgswwtv97obrsj7trj7ai, 6, locationRequest);
        accessgetNumPadEqualscp accessgetnumpadequalscpIconCompatParcelizer = CardView$1.IconCompatParcelizer();
        accessgetnumpadequalscpIconCompatParcelizer.write = zzbvVar;
        accessgetnumpadequalscpIconCompatParcelizer.RemoteActionCompatParcelizer = r8lambdalmkbrrgswwtv97obrsj7trj7ai;
        accessgetnumpadequalscpIconCompatParcelizer.read = scale0ar0la0default;
        accessgetnumpadequalscpIconCompatParcelizer.IconCompatParcelizer = 2436;
        return RemoteActionCompatParcelizer(accessgetnumpadequalscpIconCompatParcelizer.serializer());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getCurrentLocation(int i, ParentDataModifier parentDataModifier) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        builder.setPriority(i);
        CurrentLocationRequest currentLocationRequestBuild = builder.build();
        int i2 = 1;
        if (parentDataModifier != null) {
            accessgetSystemNavigationDowncp.write("cancellationToken may not be already canceled", !parentDataModifier.serializer());
        }
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new Vw$Vw(currentLocationRequestBuild, i2, parentDataModifier);
        taskApiCall$BuilderIconCompatParcelizer.write = 2415;
        zzw zzwVar = read(0, taskApiCall$BuilderIconCompatParcelizer.read());
        if (parentDataModifier == null) {
            return zzwVar;
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls(parentDataModifier);
        zzwVar.continueWith(new getMeasurementConstraintsmsEJaDk(parentDataModifierDefaultImpls));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeDeviceOrientationUpdates(DeviceOrientationListener deviceOrientationListener) {
        return write((accessgetNumPadEntercp) MathKt.RemoteActionCompatParcelizer(new Object[]{deviceOrientationListener, "DeviceOrientationListener"}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write()), 2440).continueWith(accessgetSubCompositionViewjd.RemoteActionCompatParcelizer, toContentCaptureSession.IconCompatParcelizer);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, DeviceOrientationListener deviceOrientationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            accessgetSystemNavigationDowncp.serializer(looper, "invalid null looper");
        }
        return read(deviceOrientationRequest, MathKt.serializer(deviceOrientationListener, looper, "DeviceOrientationListener"));
    }

    public final zzw serializer(LocationRequest locationRequest, scale0AR0LA0default scale0ar0la0default) {
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, scale0ar0la0default, Transition$1.serializer);
        Recorder$3 recorder$3 = new Recorder$3(r8lambdalmkbrrgswwtv97obrsj7trj7ai, locationRequest, false, 28);
        accessgetNumPadEqualscp accessgetnumpadequalscpIconCompatParcelizer = CardView$1.IconCompatParcelizer();
        accessgetnumpadequalscpIconCompatParcelizer.write = recorder$3;
        accessgetnumpadequalscpIconCompatParcelizer.RemoteActionCompatParcelizer = r8lambdalmkbrrgswwtv97obrsj7trj7ai;
        accessgetnumpadequalscpIconCompatParcelizer.read = scale0ar0la0default;
        accessgetnumpadequalscpIconCompatParcelizer.IconCompatParcelizer = 2435;
        return RemoteActionCompatParcelizer(accessgetnumpadequalscpIconCompatParcelizer.serializer());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task setMockMode(boolean z) {
        synchronized (IconCompatParcelizer) {
            try {
                if (!z) {
                    Object obj = serializer;
                    if (obj != null) {
                        serializer = null;
                        return write((accessgetNumPadEntercp) MathKt.RemoteActionCompatParcelizer(new Object[]{obj, "Object"}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write()), 2420).continueWith(accessgetSubCompositionViewjd.serializer, Transition$1.RemoteActionCompatParcelizer);
                    }
                } else if (serializer == null) {
                    Object obj2 = new Object();
                    serializer = obj2;
                    accessgetNumPadEqualscp accessgetnumpadequalscpIconCompatParcelizer = CardView$1.IconCompatParcelizer();
                    accessgetnumpadequalscpIconCompatParcelizer.write = com.huawei.hmf.tasks.a.j.RemoteActionCompatParcelizer;
                    accessgetnumpadequalscpIconCompatParcelizer.RemoteActionCompatParcelizer = Timestamp.Companion.MediaMetadataCompat;
                    accessgetnumpadequalscpIconCompatParcelizer.read = MathKt.serializer(obj2, Looper.getMainLooper(), "Object");
                    accessgetnumpadequalscpIconCompatParcelizer.IconCompatParcelizer = 2420;
                    return RemoteActionCompatParcelizer(accessgetnumpadequalscpIconCompatParcelizer.serializer());
                }
                return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzw read(DeviceOrientationRequest deviceOrientationRequest, scale0AR0LA0default scale0ar0la0default) {
        getMicrophoneMuteEK5gGoQ getmicrophonemuteek5ggoq = new getMicrophoneMuteEK5gGoQ(scale0ar0la0default, deviceOrientationRequest, 0);
        getMediaPreviousEK5gGoQ getmediapreviousek5ggoq = new getMediaPreviousEK5gGoQ(scale0ar0la0default, 1);
        accessgetNumPadEqualscp accessgetnumpadequalscpIconCompatParcelizer = CardView$1.IconCompatParcelizer();
        accessgetnumpadequalscpIconCompatParcelizer.write = getmicrophonemuteek5ggoq;
        accessgetnumpadequalscpIconCompatParcelizer.RemoteActionCompatParcelizer = getmediapreviousek5ggoq;
        accessgetnumpadequalscpIconCompatParcelizer.read = scale0ar0la0default;
        accessgetnumpadequalscpIconCompatParcelizer.IconCompatParcelizer = 2434;
        return RemoteActionCompatParcelizer(accessgetnumpadequalscpIconCompatParcelizer.serializer());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task flushLocations() {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = toContentCaptureSession.serializer;
        taskApiCall$BuilderIconCompatParcelizer.write = 2422;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLocationAvailability() {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = com.huawei.hmf.tasks.a.j.write;
        taskApiCall$BuilderIconCompatParcelizer.write = 2416;
        return read(0, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task setMockLocation(Location location) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(location != null);
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new getMediaStepForwardEK5gGoQ(location);
        taskApiCall$BuilderIconCompatParcelizer.write = 2421;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new zzak(3, pendingIntent);
        taskApiCall$BuilderIconCompatParcelizer.write = 2418;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLastLocation(LastLocationRequest lastLocationRequest) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new getExponentimpl(28, lastLocationRequest);
        taskApiCall$BuilderIconCompatParcelizer.write = 2414;
        taskApiCall$BuilderIconCompatParcelizer.read = new Feature[]{zzo.zzf};
        return read(0, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new colorResource(pendingIntent, locationRequest, false, 24);
        taskApiCall$BuilderIconCompatParcelizer.write = 2417;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, Executor executor, DeviceOrientationListener deviceOrientationListener) {
        return read(deviceOrientationRequest, MathKt.serializer(deviceOrientationListener, executor, "DeviceOrientationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(LocationCallback locationCallback) {
        return write((accessgetNumPadEntercp) MathKt.RemoteActionCompatParcelizer(new Object[]{locationCallback, "LocationCallback"}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write()), 2418).continueWith(accessgetSubCompositionViewjd.write, Transition$1.IconCompatParcelizer);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            accessgetSystemNavigationDowncp.serializer(looper, "invalid null looper");
        }
        return IconCompatParcelizer(locationRequest, MathKt.serializer(locationCallback, looper, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(LocationListener locationListener) {
        return write((accessgetNumPadEntercp) MathKt.RemoteActionCompatParcelizer(new Object[]{locationListener, "LocationListener"}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write()), 2418).continueWith(accessgetSubCompositionViewjd.read, Timestamp.Companion.RemoteActionCompatParcelizer);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            accessgetSystemNavigationDowncp.serializer(looper, "invalid null looper");
        }
        return serializer(locationRequest, MathKt.serializer(locationListener, looper, "LocationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLastLocation() {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = accessgetVcp.write;
        taskApiCall$BuilderIconCompatParcelizer.write = 2414;
        return read(0, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return IconCompatParcelizer(locationRequest, MathKt.serializer(locationCallback, executor, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        return serializer(locationRequest, MathKt.serializer(locationListener, executor, "LocationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getCurrentLocation(CurrentLocationRequest currentLocationRequest, ParentDataModifier parentDataModifier) {
        int i = 1;
        if (parentDataModifier != null) {
            accessgetSystemNavigationDowncp.write("cancellationToken may not be already canceled", !parentDataModifier.serializer());
        }
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new Vw$Vw(currentLocationRequest, i, parentDataModifier);
        taskApiCall$BuilderIconCompatParcelizer.write = 2415;
        zzw zzwVar = read(0, taskApiCall$BuilderIconCompatParcelizer.read());
        if (parentDataModifier == null) {
            return zzwVar;
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls(parentDataModifier);
        zzwVar.continueWith(new getMeasurementConstraintsmsEJaDk(parentDataModifierDefaultImpls));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public getMediaStopEK5gGoQ(Context context, Activity activity, accessgetNumLockcp accessgetnumlockcp, accessgetNumPad2cp accessgetnumpad2cp, accessgetNumPad8cp accessgetnumpad8cp) {
        super(context, activity, accessgetnumlockcp, accessgetnumpad2cp, accessgetnumpad8cp);
    }
}
