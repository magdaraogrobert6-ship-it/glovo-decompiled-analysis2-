package o;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.huawei.hms.android.SystemUtils;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getPushDuration extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    private getUseWebView IconCompatParcelizer;
    private isGeofencesEnabledFromEnvironmentlambda1 RemoteActionCompatParcelizer;
    private r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private getVerticalAccuracy write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final boolean read(Intent intent) {
        return true;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "GeofenceTransitionsReceiver";
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0130  */
    /* JADX WARN: Code duplicated, block: B:40:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x014f A[LOOP:0: B:41:0x0149->B:43:0x014f, LOOP_END] */
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        String str;
        ArrayList arrayList;
        Iterator<Geofence> it;
        int i;
        this.write = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        this.read = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
        this.RemoteActionCompatParcelizer = (isGeofencesEnabledFromEnvironmentlambda1) setPushUniqueId.read(isGeofencesEnabledFromEnvironmentlambda1.class);
        this.IconCompatParcelizer = (getUseWebView) setPushUniqueId.read(getUseWebView.class);
        GeofencingEvent geofencingEventFromIntent = GeofencingEvent.fromIntent(intent);
        if (geofencingEventFromIntent == null) {
            RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer("GeofencingEvent is null. Intent was: %s", intent);
            return;
        }
        Optional<setConfigurationProvider> optionalSerializer = ((getPushUniqueId) setPushUniqueId.read(getPushUniqueId.class)).serializer("backup_geofence");
        Optional<setConfigurationProvider> optionalSerializer2 = ((getPushUniqueId) setPushUniqueId.read(getPushUniqueId.class)).serializer("geofence");
        Integer numValueOf = optionalSerializer2.IconCompatParcelizer() ? Integer.valueOf(optionalSerializer2.write().serializer) : null;
        boolean z = false;
        if (geofencingEventFromIntent.hasError()) {
            RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer("error in geofencing event: " + geofencingEventFromIntent.getErrorCode(), new Object[0]);
            getUseWebView getusewebview = this.IconCompatParcelizer;
            getVerticalAccuracy getverticalaccuracy = this.write;
            Optional optionalWrite = Optional.write(numValueOf);
            this.read.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            getverticalaccuracy.getClass();
            getusewebview.RemoteActionCompatParcelizer(getVerticalAccuracy.write(null, optionalWrite, null, 6, jCurrentTimeMillis));
            if (this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                return;
            }
            this.IconCompatParcelizer.read(ControlMessage.OTG_CHECK);
            return;
        }
        int geofenceTransition = geofencingEventFromIntent.getGeofenceTransition();
        parseLonglambda0 parselonglambda0RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context);
        int i2 = 1;
        if (geofenceTransition == 1) {
            str = "enter";
        } else if (geofenceTransition != 2) {
            str = geofenceTransition != 4 ? SystemUtils.UNKNOWN : "dwell";
        } else {
            str = "exit";
        }
        parselonglambda0RemoteActionCompatParcelizer.IconCompatParcelizer("Transition %s", str);
        if (optionalSerializer2.read()) {
            RemoteActionCompatParcelizer(context).write("Main geofence is absent. Cannot publish this transition event.", new Object[0]);
            return;
        }
        Location triggeringLocation = geofencingEventFromIntent.getTriggeringLocation();
        List<Geofence> triggeringGeofences = geofencingEventFromIntent.getTriggeringGeofences();
        if (optionalSerializer.IconCompatParcelizer()) {
            setConfigurationProvider setconfigurationproviderWrite = optionalSerializer2.write();
            setConfigurationProvider setconfigurationproviderWrite2 = optionalSerializer.write();
            if (!write(setconfigurationproviderWrite, triggeringGeofences) && write(setconfigurationproviderWrite2, triggeringGeofences)) {
                RemoteActionCompatParcelizer(context).IconCompatParcelizer("Transition was on the backup geofence with location %s", getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.RemoteActionCompatParcelizer(triggeringLocation));
                if (geofenceTransition != 2) {
                    return;
                } else {
                    z = true;
                }
            } else if (!write(optionalSerializer2.write(), triggeringGeofences)) {
                parseLonglambda0 parselonglambda0RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(context);
                arrayList = new ArrayList();
                it = triggeringGeofences.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getRequestId());
                }
                parselonglambda0RemoteActionCompatParcelizer2.IconCompatParcelizer("Geofence event triggered for geofence %s. Not our main or backup geofence.", r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList, ", "));
                return;
            }
        } else if (!write(optionalSerializer2.write(), triggeringGeofences)) {
            parseLonglambda0 parselonglambda0RemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(context);
            arrayList = new ArrayList();
            it = triggeringGeofences.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRequestId());
            }
            parselonglambda0RemoteActionCompatParcelizer3.IconCompatParcelizer("Geofence event triggered for geofence %s. Not our main or backup geofence.", r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList, ", "));
            return;
        }
        long time = triggeringLocation.getTime();
        this.read.getClass();
        if (time > System.currentTimeMillis()) {
            RemoteActionCompatParcelizer(context).write("Triggering location is in the future (%s)", com.sentiance.sdk.util.x.c(triggeringLocation.getTime()));
            this.read.getClass();
            triggeringLocation.setTime(System.currentTimeMillis());
        } else {
            long time2 = triggeringLocation.getTime();
            this.read.getClass();
            if (time2 < System.currentTimeMillis() - 600000) {
                RemoteActionCompatParcelizer(context).write("Triggering location is in the past (%s)", com.sentiance.sdk.util.x.c(triggeringLocation.getTime()));
                this.read.getClass();
                triggeringLocation.setTime(System.currentTimeMillis());
            }
        }
        getUseWebView getusewebview2 = this.IconCompatParcelizer;
        getVerticalAccuracy getverticalaccuracy2 = this.write;
        setConfigurationProvider setconfigurationproviderWrite3 = optionalSerializer2.write();
        Optional optionalWrite2 = Optional.write(numValueOf);
        if (geofenceTransition != 1) {
            if (geofenceTransition != 2) {
                if (geofenceTransition != 4) {
                    i = -1;
                } else {
                    i = z ? 8 : 3;
                }
            } else if (z) {
                i = 9;
            } else {
                i2 = 2;
            }
            i2 = i;
        }
        this.read.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        getverticalaccuracy2.getClass();
        getusewebview2.RemoteActionCompatParcelizer(getVerticalAccuracy.write(setconfigurationproviderWrite3, optionalWrite2, triggeringLocation, i2, jCurrentTimeMillis2));
    }

    private static boolean write(setConfigurationProvider setconfigurationprovider, List list) {
        String str = setconfigurationprovider.write;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Geofence) it.next()).getRequestId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
