package o;

import android.util.SparseArray;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.NonFatalSdkException;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.util.Optional;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "EventBus", guardType = Guard$Type.REFERENCE_COUNTED)
public class getAnalyticsEnabledEnterannotations {
    private final clearAllData IconCompatParcelizer;
    private final component4android_sdk_base_release MediaDescriptionCompat;
    private final parseLonglambda0 MediaSessionCompatQueueItem;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 MediaSessionCompatToken;
    private final r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg ParcelableVolumeInfo;
    private final r8lambdarI00A69l7k7NAO4I9NDF7haFpGI PlaybackStateCompat;
    private final getCooldownEnterSeconds RemoteActionCompatParcelizer;
    private final readandroid_sdk_base_release read;
    private final getVerticalAccuracy serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;
    private final SparseArray<Set<getLatitudeannotations>> MediaBrowserCompatMediaItem = new SparseArray<>();
    private final SparseArray<Set<getJsonObjectannotations>> MediaMetadataCompat = new SparseArray<>();
    private final EnumMap<ControlMessage, Set<deepcopyandroid_sdk_base_release>> RatingCompat = new EnumMap<>(ControlMessage.class);
    private final HashMap PlaybackStateCompatCustomAction = new HashMap();
    private boolean MediaSessionCompatResultReceiverWrapper = false;

    private <T> void write(r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, Object obj, boolean z) {
        try {
            Long lIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            this.write.getClass();
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.serializer = Long.valueOf(System.currentTimeMillis());
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.RemoteActionCompatParcelizer = lIconCompatParcelizer;
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer = r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.IconCompatParcelizer();
            this.serializer.getClass();
            r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite = getVerticalAccuracy.write(r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer);
            Optional optionalMediaSessionCompatQueueItem = r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite == null ? Optional.MediaSessionCompatQueueItem() : getVerticalAccuracy.IconCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite.getClass());
            if (optionalMediaSessionCompatQueueItem.read()) {
                return;
            }
            this.serializer.getClass();
            r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite2 = getVerticalAccuracy.write(r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer);
            if (r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite2 == null) {
                return;
            }
            this.MediaSessionCompatQueueItem.IconCompatParcelizer("Publishing event: %s", getTrackingStringandroid_sdk_base_releaseannotations.RemoteActionCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite2));
            this.RemoteActionCompatParcelizer.read(r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer);
            getLongitudeannotations getlongitudeannotationsSerializer = getLongitudeannotations.serializer(this.serializer, r8lambdaqtf70aj7a5o7b4yj33reyelsuIconCompatParcelizer, lIconCompatParcelizer.longValue(), obj);
            if (getlongitudeannotationsSerializer != null) {
                int iIntValue = ((Integer) optionalMediaSessionCompatQueueItem.write()).intValue();
                synchronized (this.MediaMetadataCompat) {
                    Set<getJsonObjectannotations> set = this.MediaMetadataCompat.get(iIntValue);
                    if (set != null) {
                        for (getJsonObjectannotations getjsonobjectannotations : new HashSet(set)) {
                            if (getjsonobjectannotations != null) {
                                List listWrite = getjsonobjectannotations.write();
                                if (listWrite != null) {
                                    Iterator it = listWrite.iterator();
                                    while (it.hasNext()) {
                                        write((r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM) it.next(), null, z);
                                    }
                                }
                            } else {
                                this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Encountered an invalid event injector for eventInfo: " + getlongitudeannotationsSerializer, new Object[0]);
                            }
                        }
                    }
                }
                synchronized (this.MediaBrowserCompatMediaItem) {
                    Set<getLatitudeannotations> set2 = this.MediaBrowserCompatMediaItem.get(((Integer) optionalMediaSessionCompatQueueItem.write()).intValue());
                    if (set2 != null) {
                        for (getLatitudeannotations getlatitudeannotations : set2) {
                            if (getlatitudeannotations != null) {
                                r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer = IconCompatParcelizer((getHtml) getlatitudeannotations);
                                if (z) {
                                    r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer.read();
                                }
                                getlatitudeannotations.write().RemoteActionCompatParcelizer(new getExitEventsannotations(this, getlatitudeannotations, getlongitudeannotationsSerializer, z, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer), "EventBus-PostEvent");
                            } else {
                                this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Encountered an invalid event consumer for eventInfo: " + getlongitudeannotationsSerializer, new Object[0]);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            this.MediaSessionCompatQueueItem.IconCompatParcelizer(false, e, "Failed to generate new event id", new Object[0]);
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, Runnable runnable, boolean z) {
        if (runnable != null) {
            runnable.run();
        }
        if (z) {
            getanalyticsenabledenterannotations.MediaSessionCompatToken.IconCompatParcelizer();
        }
    }

    public final void serializer(Class cls, getLatitudeannotations getlatitudeannotations) {
        this.serializer.getClass();
        Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(cls);
        if (optionalIconCompatParcelizer.read()) {
            return;
        }
        serializer(((Integer) optionalIconCompatParcelizer.write()).intValue(), getlatitudeannotations);
    }

    public getAnalyticsEnabledEnterannotations(getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, clearAllData clearalldata, parseLonglambda0 parselonglambda0, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg, r8lambdarI00A69l7k7NAO4I9NDF7haFpGI r8lambdari00a69l7k7nao4i9ndf7hafpgi, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.IconCompatParcelizer = clearalldata;
        this.read = readandroid_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = getcooldownenterseconds;
        this.serializer = getverticalaccuracy;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = component4android_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = parselonglambda0;
        this.MediaSessionCompatToken = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.ParcelableVolumeInfo = r8lambdafxbjord4rv7hbevein3jpfseg;
        this.PlaybackStateCompat = r8lambdari00a69l7k7nao4i9ndf7hafpgi;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, Object obj, boolean z, Runnable runnable) {
        getanalyticsenabledenterannotations.write(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, obj, z);
        getanalyticsenabledenterannotations.IconCompatParcelizer.RemoteActionCompatParcelizer(new f$$ExternalSyntheticLambda1(getanalyticsenabledenterannotations, runnable, z, 0), "EventBus-OnPublishComplete");
    }

    private void read(Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls, getLatitudeannotations<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> getlatitudeannotations) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            this.serializer.getClass();
            Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(cls);
            if (optionalIconCompatParcelizer.read()) {
                return;
            }
            synchronized (this.MediaBrowserCompatMediaItem) {
                Set<getLatitudeannotations> hashSet = this.MediaBrowserCompatMediaItem.get(((Integer) optionalIconCompatParcelizer.write()).intValue());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.MediaBrowserCompatMediaItem.put(((Integer) optionalIconCompatParcelizer.write()).intValue(), hashSet);
                }
                hashSet.add(getlatitudeannotations);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer(Map map, Long l, Long l2) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                Class cls = (Class) entry.getKey();
                getLatitudeannotations getlatitudeannotations = (getLatitudeannotations) entry.getValue();
                if (cls == null || getlatitudeannotations == null) {
                    String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Invalid event subscription parameters (", cls != null ? cls.getCanonicalName() : "null", ", ", getlatitudeannotations != null ? getlatitudeannotations.getClass().getCanonicalName() : "null", ")");
                    NonFatalSdkException nonFatalSdkException = new NonFatalSdkException(strWrite);
                    this.MediaSessionCompatQueueItem.IconCompatParcelizer(false, nonFatalSdkException, strWrite, new Object[0]);
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.serializer.serializer(nonFatalSdkException));
                } else {
                    map2.put(cls, getlatitudeannotations);
                }
            }
            this.MediaSessionCompatToken.read();
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(new writeSelfandroid_sdk_base_release(this, map2, l2, l), "EventBus-StickySubscription");
        }
    }

    public final void serializer() {
        this.MediaSessionCompatResultReceiverWrapper = true;
    }

    public final boolean read() {
        this.serializer.getClass();
        Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(logLocationRecordedEvent.class);
        boolean z = false;
        if (optionalIconCompatParcelizer.read()) {
            return false;
        }
        synchronized (this.MediaBrowserCompatMediaItem) {
            Set<getLatitudeannotations> set = this.MediaBrowserCompatMediaItem.get(((Integer) optionalIconCompatParcelizer.write()).intValue());
            if (set != null && !set.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    public final void IconCompatParcelizer(getLatitudeannotations<r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> getlatitudeannotations) {
        Iterator it = this.serializer.write().iterator();
        while (it.hasNext()) {
            read((Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>) it.next(), getlatitudeannotations);
        }
    }

    public final void IconCompatParcelizer(Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, getLatitudeannotations<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> map, long j) {
        serializer(map, Long.valueOf(j), null);
    }

    public final void RemoteActionCompatParcelizer(long j, HashMap map) {
        serializer(map, Long.valueOf(j), null);
    }

    public static void serializer(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, List list, Long l, Long l2) {
        if (l == null && l2 == null) {
            return;
        }
        getanalyticsenabledenterannotations.MediaSessionCompatQueueItem.IconCompatParcelizer("%d events since %s", Integer.valueOf(list.size()), l != null ? com.sentiance.sdk.util.x.c(l.longValue()) : Long.toString(l2.longValue()));
    }

    private void serializer(int i, getLatitudeannotations getlatitudeannotations) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            Set<getLatitudeannotations> set = this.MediaBrowserCompatMediaItem.get(i);
            if (set == null) {
                return;
            }
            set.remove(getlatitudeannotations);
        }
    }

    public final void read(ControlMessage controlMessage, deepcopyandroid_sdk_base_release deepcopyandroid_sdk_base_releaseVar) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            synchronized (this.RatingCompat) {
                Set<deepcopyandroid_sdk_base_release> hashSet = this.RatingCompat.get(controlMessage);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.RatingCompat.put(controlMessage, hashSet);
                }
                hashSet.add(deepcopyandroid_sdk_base_releaseVar);
            }
        }
    }

    public final void read(deepcopyandroid_sdk_base_release deepcopyandroid_sdk_base_releaseVar) {
        synchronized (this.RatingCompat) {
            for (K k : this.RatingCompat.keySet()) {
                synchronized (this.RatingCompat) {
                    Set<deepcopyandroid_sdk_base_release> set = this.RatingCompat.get(k);
                    if (set != null) {
                        set.remove(deepcopyandroid_sdk_base_releaseVar);
                    }
                }
            }
        }
    }

    public static SparseArray IconCompatParcelizer(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, HashMap map) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            getVerticalAccuracy getverticalaccuracy = getanalyticsenabledenterannotations.serializer;
            Class cls = (Class) entry.getKey();
            getverticalaccuracy.getClass();
            Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(cls);
            if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
                sparseArray.put(((Integer) optionalIconCompatParcelizer.write()).intValue(), (getLatitudeannotations) entry.getValue());
            }
        }
        return sparseArray;
    }

    public static void RemoteActionCompatParcelizer(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, List list, SparseArray sparseArray) {
        getLongitudeannotations getlongitudeannotationsSerializer;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getCooldownEnterSeconds.read readVar = (getCooldownEnterSeconds.read) it.next();
            getLatitudeannotations getlatitudeannotations = (getLatitudeannotations) sparseArray.get(readVar.MediaSessionCompatQueueItem());
            if (getlatitudeannotations != null) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer(getanalyticsenabledenterannotations.MediaDescriptionCompat);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (getlongitudeannotationsSerializer = getLongitudeannotations.serializer(getanalyticsenabledenterannotations.serializer, r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer, readVar.IconCompatParcelizer(), null)) != null) {
                    r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer = getanalyticsenabledenterannotations.IconCompatParcelizer((getHtml) getlatitudeannotations);
                    r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer.read();
                    getlatitudeannotations.write().RemoteActionCompatParcelizer(new getExitEventsannotations(getanalyticsenabledenterannotations, getlatitudeannotations, getlongitudeannotationsSerializer, true, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer), "EventBus-PostEvent");
                }
            } else {
                getanalyticsenabledenterannotations.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Encountered an invalid event consumer for metadata: " + readVar, new Object[0]);
            }
            if (!getanalyticsenabledenterannotations.MediaSessionCompatResultReceiverWrapper) {
                return;
            }
        }
    }

    public final void serializer(r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm) {
        serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, (Object) null, true, (Scopes$$ExternalSyntheticLambda0) null);
    }

    public static void read(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, ControlMessage controlMessage, Object obj) {
        getanalyticsenabledenterannotations.MediaSessionCompatQueueItem.IconCompatParcelizer("Publishing control message: %s", controlMessage.name());
        synchronized (getanalyticsenabledenterannotations.RatingCompat) {
            Set<deepcopyandroid_sdk_base_release> set = getanalyticsenabledenterannotations.RatingCompat.get(controlMessage);
            if (set != null) {
                for (deepcopyandroid_sdk_base_release deepcopyandroid_sdk_base_releaseVar : set) {
                    if (deepcopyandroid_sdk_base_releaseVar != null) {
                        r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer = getanalyticsenabledenterannotations.IconCompatParcelizer(deepcopyandroid_sdk_base_releaseVar);
                        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer.read();
                        deepcopyandroid_sdk_base_releaseVar.write().RemoteActionCompatParcelizer(new getCooldownEnterSecondsannotations(getanalyticsenabledenterannotations, deepcopyandroid_sdk_base_releaseVar, controlMessage, obj, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer), "EventBus-PostCtrlMsg");
                    } else {
                        getanalyticsenabledenterannotations.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Encountered an invalid control message consumer for control message: " + controlMessage.name(), new Object[0]);
                    }
                }
            }
        }
    }

    private r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 IconCompatParcelizer(getHtml gethtml) {
        r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer;
        synchronized (this.PlaybackStateCompatCustomAction) {
            String strSerializer = gethtml.serializer();
            r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer = (r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4) this.PlaybackStateCompatCustomAction.get(strSerializer);
            if (r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer == null) {
                r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer = this.PlaybackStateCompat.IconCompatParcelizer(strSerializer + ":EventBus", true);
                this.PlaybackStateCompatCustomAction.put(strSerializer, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer);
            }
        }
        return r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4IconCompatParcelizer;
    }

    public final void write() {
        this.MediaSessionCompatResultReceiverWrapper = false;
        this.RemoteActionCompatParcelizer.clearData();
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem.clear();
        }
        synchronized (this.RatingCompat) {
            this.RatingCompat.clear();
        }
        synchronized (this.MediaMetadataCompat) {
            this.MediaMetadataCompat.clear();
        }
    }

    public static void write(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls = (Class) entry.getKey();
            getLatitudeannotations<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> getlatitudeannotations = (getLatitudeannotations) entry.getValue();
            if (cls != null && getlatitudeannotations != null) {
                getanalyticsenabledenterannotations.read(cls, getlatitudeannotations);
            } else {
                getanalyticsenabledenterannotations.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Invalid event subscription parameters (%s, %s)", cls, getlatitudeannotations);
            }
        }
    }

    public final <T> void RemoteActionCompatParcelizer(Class<T> cls, getLatitudeannotations<T> getlatitudeannotations) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            this.serializer.getClass();
            Optional optionalIconCompatParcelizer = getVerticalAccuracy.IconCompatParcelizer(cls);
            if (optionalIconCompatParcelizer.read()) {
                return;
            }
            synchronized (this.MediaBrowserCompatMediaItem) {
                Set<getLatitudeannotations> hashSet = this.MediaBrowserCompatMediaItem.get(((Integer) optionalIconCompatParcelizer.write()).intValue());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.MediaBrowserCompatMediaItem.put(((Integer) optionalIconCompatParcelizer.write()).intValue(), hashSet);
                }
                hashSet.add(getlatitudeannotations);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(getLatitudeannotations getlatitudeannotations) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
                serializer(this.MediaBrowserCompatMediaItem.keyAt(i), getlatitudeannotations);
            }
        }
    }

    public final void serializer(r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, Object obj, boolean z, Scopes$$ExternalSyntheticLambda0 scopes$$ExternalSyntheticLambda0) {
        if (!this.MediaSessionCompatResultReceiverWrapper || r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm == null) {
            return;
        }
        boolean z2 = z || this.ParcelableVolumeInfo.serializer(this.MediaSessionCompatQueueItem) < 26;
        if (z2) {
            this.MediaSessionCompatToken.read();
        }
        this.read.RemoteActionCompatParcelizer(new BrazeGeofence(0, this, r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, obj, scopes$$ExternalSyntheticLambda0, z2), "EventBus-PublishEvent");
    }

    public final void IconCompatParcelizer(ControlMessage controlMessage, Object obj) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            this.MediaSessionCompatToken.read();
            this.read.RemoteActionCompatParcelizer(new getAnalyticsEnabledExitannotations(this, controlMessage, obj), "EventBus-PublishCtrlMsg");
        }
    }
}
