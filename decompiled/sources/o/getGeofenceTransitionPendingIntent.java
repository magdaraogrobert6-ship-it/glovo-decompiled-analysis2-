package o;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class getGeofenceTransitionPendingIntent implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private boolean IconCompatParcelizer;
    private final BrazeInternalLocationApi MediaBrowserCompatMediaItem;
    private Class<? extends BrazeInternalLocationApi> MediaDescriptionCompat;
    private Class MediaMetadataCompat;
    private Intent MediaSessionCompatQueueItem;
    private long ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private boolean PlaybackStateCompatCustomAction;
    private Bundle RatingCompat;
    private long RemoteActionCompatParcelizer;
    private String read;
    private boolean serializer;
    private long write;

    public static final class RemoteActionCompatParcelizer {
        private final Context IconCompatParcelizer;
        private Class MediaBrowserCompatMediaItem;
        private BrazeInternalLocationApi MediaDescriptionCompat;
        private Bundle MediaMetadataCompat;
        private boolean MediaSessionCompatQueueItem;
        private Intent RatingCompat;
        private long RemoteActionCompatParcelizer;
        private final String read;
        private boolean serializer;
        private long write;

        public final void write(boolean z) {
            this.MediaSessionCompatQueueItem = z;
        }

        public final void serializer(Bundle bundle, Class cls) {
            this.MediaMetadataCompat = bundle;
            this.MediaBrowserCompatMediaItem = cls;
            Intent intent = new Intent(this.IconCompatParcelizer, (Class<?>) cls);
            this.RatingCompat = intent;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        }

        @SuppressLint
        public final getGeofenceTransitionPendingIntent write() {
            if (this.MediaBrowserCompatMediaItem == null && this.MediaDescriptionCompat == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("No broadcast, service, callback class or callback set.");
                return null;
            }
            if (this.RemoteActionCompatParcelizer < 0) {
                this.RemoteActionCompatParcelizer = this.write;
            }
            return new getGeofenceTransitionPendingIntent(this);
        }

        @SuppressLint
        public RemoteActionCompatParcelizer(String str, Context context) {
            if (str == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("id must not be null");
                throw null;
            }
            this.read = str;
            this.IconCompatParcelizer = context;
            this.RemoteActionCompatParcelizer = -1L;
            this.MediaSessionCompatQueueItem = false;
        }

        public final void RemoteActionCompatParcelizer(boolean z) {
            this.serializer = z;
        }

        public final void read(long j) {
            this.write = j;
        }

        public final void IconCompatParcelizer(BrazeInternalLocationApi brazeInternalLocationApi) {
            this.MediaDescriptionCompat = brazeInternalLocationApi;
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompatMediaItem = null;
            this.RatingCompat = null;
            if (brazeInternalLocationApi != null) {
                return;
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Callback must not be null");
        }
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final boolean serializer() {
        return this.PlaybackStateCompat;
    }

    private Bundle IconCompatParcelizer(String str) throws JSONException {
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj.getClass() == Integer.class) {
                bundle.putInt(next, ((Integer) obj).intValue());
            } else if (obj.getClass() == Long.class) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj.getClass() == String.class) {
                bundle.putString(next, (String) obj);
            } else if (obj.getClass() == Boolean.class) {
                bundle.putBoolean(next, ((Boolean) obj).booleanValue());
            } else {
                if (obj.getClass() != Float.class && obj.getClass() != Double.class) {
                    throw new JSONException("Caching arrays is not supported from alarm %s" + this.read);
                }
                bundle.putFloat(next, ((Float) obj).floatValue());
                bundle.putDouble(next, ((Double) obj).doubleValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        Class<?> clsLoadClass;
        Class<? extends BrazeInternalLocationApi> cls;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        JSONObject jSONObject = new JSONObject(str);
        this.read = jSONObject.getString("id");
        this.IconCompatParcelizer = jSONObject.getBoolean("recurring");
        this.serializer = jSONObject.getBoolean("exact");
        this.RemoteActionCompatParcelizer = jSONObject.getLong("initial_delay");
        this.write = jSONObject.getLong("delay");
        this.PlaybackStateCompatCustomAction = jSONObject.getBoolean("using_initial_delay");
        this.ParcelableVolumeInfo = jSONObject.getLong("last_time_fired");
        this.PlaybackStateCompat = jSONObject.getBoolean(com.braze.storage.DataStoreProvider.PERSISTENT_DATASTORE_PREFIX);
        Bundle bundleIconCompatParcelizer = null;
        if (!jSONObject.has("intent_class") || (classLoader2 = getClass().getClassLoader()) == null) {
            clsLoadClass = null;
        } else {
            try {
                clsLoadClass = classLoader2.loadClass(jSONObject.getString("intent_class"));
            } catch (ClassNotFoundException | JSONException unused) {
                clsLoadClass = null;
            }
        }
        this.MediaMetadataCompat = clsLoadClass;
        if (!jSONObject.has("callback_class") || (classLoader = getClass().getClassLoader()) == null) {
            cls = 0;
        } else {
            try {
                Class<?> clsLoadClass2 = classLoader.loadClass(jSONObject.getString("callback_class"));
                boolean zIsAssignableFrom = BrazeInternalLocationApi.class.isAssignableFrom(clsLoadClass2);
                cls = clsLoadClass2;
                if (!zIsAssignableFrom) {
                    cls = 0;
                }
            } catch (ClassNotFoundException | JSONException unused2) {
            }
        }
        this.MediaDescriptionCompat = cls;
        if (jSONObject.has(com.braze.models.inappmessage.InAppMessageBase.EXTRAS)) {
            try {
                bundleIconCompatParcelizer = IconCompatParcelizer(jSONObject.getString(com.braze.models.inappmessage.InAppMessageBase.EXTRAS));
            } catch (JSONException unused3) {
            }
        }
        this.RatingCompat = bundleIconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append(": recurring=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", exact=");
        sb.append(this.serializer);
        sb.append(", ");
        if (this.IconCompatParcelizer) {
            sb.append("initialDelay=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", ");
        }
        sb.append("delay=");
        sb.append(this.write);
        return sb.toString();
    }

    public getGeofenceTransitionPendingIntent(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.read = remoteActionCompatParcelizer.read;
        this.IconCompatParcelizer = false;
        this.serializer = remoteActionCompatParcelizer.serializer;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        this.write = remoteActionCompatParcelizer.write;
        this.MediaMetadataCompat = remoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = remoteActionCompatParcelizer.MediaDescriptionCompat;
        this.RatingCompat = remoteActionCompatParcelizer.MediaMetadataCompat;
        this.MediaSessionCompatQueueItem = remoteActionCompatParcelizer.RatingCompat;
        this.PlaybackStateCompat = remoteActionCompatParcelizer.MediaSessionCompatQueueItem;
        this.MediaDescriptionCompat = null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == null || !(obj instanceof getGeofenceTransitionPendingIntent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str2 = ((getGeofenceTransitionPendingIntent) obj).read;
        if (str2 == null || (str = this.read) == null) {
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public getGeofenceTransitionPendingIntent() {
    }

    public final void IconCompatParcelizer(Context context, AlarmManager alarmManager, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg, parseLonglambda0 parselonglambda0) {
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.ParcelableVolumeInfo = System.currentTimeMillis();
        parselonglambda0.IconCompatParcelizer("Scheduling alarm %s", this);
        if (this.serializer) {
            this.PlaybackStateCompatCustomAction = true;
            read(context, alarmManager, this.RemoteActionCompatParcelizer, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdafxbjord4rv7hbevein3jpfseg, parselonglambda0);
        } else {
            if (this.IconCompatParcelizer) {
                alarmManager.setInexactRepeating(0, System.currentTimeMillis() + this.RemoteActionCompatParcelizer, this.write, serializer(context, false));
                return;
            }
            alarmManager.set(0, System.currentTimeMillis() + this.write, serializer(context, false));
        }
    }

    public final void RemoteActionCompatParcelizer(Context context, AlarmManager alarmManager, parseLonglambda0 parselonglambda0) {
        try {
            parselonglambda0.IconCompatParcelizer("Cancelling alarm " + this, new Object[0]);
            alarmManager.cancel(serializer(context, false));
        } catch (Exception unused) {
        }
    }

    private PendingIntent serializer(Context context, boolean z) {
        String str = ((ServerConfigDataStoreProviderCompanion) setPushUniqueId.read(ServerConfigDataStoreProviderCompanion.class)).read();
        Intent intent = new Intent(context, (Class<?>) handleSingleLocationUpdate.class);
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str);
        sbM.append(this.read);
        intent.setAction(sbM.toString());
        intent.putExtra("is_exact_alarm", z);
        return PendingIntent.getBroadcast(context, 0, intent, r8lambdaFCWpTejCW5kVaf7ggoc6ZelEIk.IconCompatParcelizer(134217728));
    }

    private void read(Context context, AlarmManager alarmManager, long j, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg, parseLonglambda0 parselonglambda0) {
        if (Build.VERSION.SDK_INT < 31 || r8lambdafxbjord4rv7hbevein3jpfseg.serializer(parselonglambda0) < 31 || alarmManager.canScheduleExactAlarms()) {
            try {
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + j, serializer(context, true));
                return;
            } catch (SecurityException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to schedule the exact alarm %s. Scheduling an inexact one instead.", this.read);
            }
        }
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        alarmManager.set(0, System.currentTimeMillis() + j, serializer(context, false));
    }

    public final boolean read(Context context, parseLonglambda0 parselonglambda0, AlarmManager alarmManager, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, clearAllData clearalldata, long j, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg) {
        Intent intent;
        this.PlaybackStateCompatCustomAction = false;
        this.ParcelableVolumeInfo = j;
        Class cls = this.MediaMetadataCompat;
        if (cls != null && removeGeofencesRegisteredWithGeofencingClientlambda22.class.isAssignableFrom(cls) && (intent = this.MediaSessionCompatQueueItem) != null) {
            intent.putExtra("alarm_trigger_time", j);
            removeGeofencesRegisteredWithGeofencingClientlambda22.read(context, this.MediaSessionCompatQueueItem, this.read);
        } else {
            BrazeInternalLocationApi brazeInternalLocationApi = this.MediaBrowserCompatMediaItem;
            if (brazeInternalLocationApi != null) {
                clearandroid_sdk_base_release clearandroid_sdk_base_releaseVarRemoteActionCompatParcelizer = brazeInternalLocationApi.RemoteActionCompatParcelizer();
                if (clearandroid_sdk_base_releaseVarRemoteActionCompatParcelizer == null) {
                    clearandroid_sdk_base_releaseVarRemoteActionCompatParcelizer = clearalldata;
                }
                brazeInternalLocationApi.RemoteActionCompatParcelizer(clearandroid_sdk_base_releaseVarRemoteActionCompatParcelizer, this.RatingCompat, j);
            } else {
                Class<? extends BrazeInternalLocationApi> cls2 = this.MediaDescriptionCompat;
                if (cls2 != null) {
                    ((BrazeInternalLocationApi) setPushUniqueId.read(cls2)).RemoteActionCompatParcelizer(clearalldata, this.RatingCompat, j);
                }
            }
        }
        if (this.IconCompatParcelizer && this.serializer) {
            read(context, alarmManager, read(r8lambdaqv3gcjxzuxdig5g76qjuzxgjni), r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdafxbjord4rv7hbevein3jpfseg, parselonglambda0);
        }
        return !this.IconCompatParcelizer;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.read);
        jSONObject.put("recurring", this.IconCompatParcelizer);
        jSONObject.put("exact", this.serializer);
        jSONObject.put("initial_delay", this.RemoteActionCompatParcelizer);
        jSONObject.put("delay", this.write);
        jSONObject.put("using_initial_delay", this.PlaybackStateCompatCustomAction);
        jSONObject.put("last_time_fired", this.ParcelableVolumeInfo);
        jSONObject.put(com.braze.storage.DataStoreProvider.PERSISTENT_DATASTORE_PREFIX, this.PlaybackStateCompat);
        Class cls = this.MediaMetadataCompat;
        if (cls != null) {
            jSONObject.put("intent_class", cls.getName());
        }
        Bundle bundle = this.RatingCompat;
        if (bundle != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject2.put(str, JSONObject.wrap(bundle.get(str)));
            }
            jSONObject.put(com.braze.models.inappmessage.InAppMessageBase.EXTRAS, jSONObject2.toString());
        }
        Class<? extends BrazeInternalLocationApi> cls2 = this.MediaDescriptionCompat;
        if (cls2 != null) {
            jSONObject.put("callback_class", cls2.getName());
        }
        return jSONObject.toString();
    }

    public final long read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        long j = this.PlaybackStateCompatCustomAction ? this.RemoteActionCompatParcelizer : this.write;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        return j - (System.currentTimeMillis() - this.ParcelableVolumeInfo);
    }

    public final void write(Context context) {
        if (this.MediaMetadataCompat != null) {
            Intent intent = new Intent(context, (Class<?>) this.MediaMetadataCompat);
            this.MediaSessionCompatQueueItem = intent;
            Bundle bundle = this.RatingCompat;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        }
    }
}
