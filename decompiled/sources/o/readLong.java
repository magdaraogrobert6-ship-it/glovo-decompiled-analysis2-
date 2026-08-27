package o;

import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.getLongitudeannotations;
import o.r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU;

/* JADX INFO: loaded from: classes4.dex */
public abstract class readLong implements removeGeofencesRegisteredWithGeofencingClientlambda2, DataStoreProviderCompanion {
    private final parseLonglambda0 IconCompatParcelizer;
    private int MediaBrowserCompatMediaItem;
    private boolean MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private final LinkedHashMap MediaSessionCompatQueueItem;
    private long RatingCompat;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 read;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw write;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final void IconCompatParcelizer() {
        synchronized (this) {
            if (!this.MediaDescriptionCompat && !this.MediaSessionCompatQueueItem.isEmpty()) {
                this.MediaDescriptionCompat = true;
                String str = ((String[]) this.MediaSessionCompatQueueItem.keySet().toArray(new String[0]))[0];
                String strSerializer = shutdownAllDataStoresdefault.serializer(str, serializer());
                if (IconCompatParcelizer(strSerializer)) {
                    return;
                }
                this.read.read();
                this.IconCompatParcelizer.IconCompatParcelizer("Request to download tile %s", strSerializer);
                this.write.serializer(new r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer(strSerializer, str, this, this.RemoteActionCompatParcelizer));
            }
        }
    }

    public abstract boolean IconCompatParcelizer(String str);

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompatMediaItem = 1;
        this.write.RemoteActionCompatParcelizer();
        synchronized (this) {
            this.MediaSessionCompatQueueItem.clear();
            this.MediaDescriptionCompat = false;
        }
    }

    public abstract String read();

    public abstract int serializer();

    public abstract int write();

    static {
        new serializer(null);
    }

    public readLong(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw r8lambdaudd4yj05v3iuqbjewtce3mt1riw) {
        parselonglambda0.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        getanalyticsenabledenterannotations.getClass();
        getverticalaccuracy.getClass();
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdaudd4yj05v3iuqbjewtce3mt1riw.getClass();
        this.IconCompatParcelizer = parselonglambda0;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.serializer = getanalyticsenabledenterannotations;
        this.read = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.write = r8lambdaudd4yj05v3iuqbjewtce3mt1riw;
        this.MediaBrowserCompatMediaItem = 1;
        this.MediaSessionCompatQueueItem = new LinkedHashMap();
    }

    public final void RemoteActionCompatParcelizer(getLongitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> getlongitudeannotations) {
        getlongitudeannotations.getClass();
        Location locationWrite = getVerticalAccuracy.write(getlongitudeannotations.read().RemoteActionCompatParcelizer);
        String strRemoteActionCompatParcelizer = shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(locationWrite.getLatitude(), locationWrite.getLongitude(), write()));
        String strRemoteActionCompatParcelizer2 = shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(locationWrite.getLatitude(), locationWrite.getLongitude(), serializer()));
        this.IconCompatParcelizer.IconCompatParcelizer("New location: %f, %f, quadKey: %s, parentQuadKey: %s", Double.valueOf(locationWrite.getLatitude()), Double.valueOf(locationWrite.getLongitude()), strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2);
        boolean zEquals = strRemoteActionCompatParcelizer2.equals(this.MediaMetadataCompat);
        if (zEquals) {
            if (this.RatingCompat + (((long) this.MediaBrowserCompatMediaItem) * 30000) > System.currentTimeMillis()) {
                return;
            }
        }
        this.MediaMetadataCompat = strRemoteActionCompatParcelizer2;
        this.RatingCompat = System.currentTimeMillis();
        this.MediaBrowserCompatMediaItem = zEquals ? Math.min(10, this.MediaBrowserCompatMediaItem + 1) : 1;
        for (String str : shutdownAllDataStoresdefault.read(locationWrite, write())) {
            String strSerializer = shutdownAllDataStoresdefault.serializer(str, serializer());
            synchronized (this) {
                Iterator it = this.MediaSessionCompatQueueItem.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!IconCompatParcelizer(strSerializer)) {
                            getOrCreateScopeForKeylambda11 getorcreatescopeforkeylambda11 = new getOrCreateScopeForKeylambda11();
                            synchronized (this) {
                                List arrayList = (List) this.MediaSessionCompatQueueItem.get(str);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(getorcreatescopeforkeylambda11);
                            }
                            break;
                        }
                        this.IconCompatParcelizer.IconCompatParcelizer("Parent tile with quad key %s already exists", strSerializer);
                        break;
                    }
                    if (shutdownAllDataStoresdefault.serializer((String) it.next(), serializer()).equals(strSerializer)) {
                        this.IconCompatParcelizer.IconCompatParcelizer("Pending request already exists for tile with quad key %s", strSerializer);
                        break;
                    }
                }
            }
        }
        IconCompatParcelizer();
    }

    @Override // o.DataStoreProviderCompanion
    public final void serializer(String str, String str2) {
        str.getClass();
        str2.getClass();
        write(str2, false);
        this.read.IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        getEnterEventsannotations.IconCompatParcelizer(this.serializer, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, this.RemoteActionCompatParcelizer, read(), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.tile.LocationBasedTileDownloader$subscribe$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                getLongitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> getlongitudeannotations = (getLongitudeannotations) obj;
                getlongitudeannotations.getClass();
                this.this$0.RemoteActionCompatParcelizer(getlongitudeannotations);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }
        });
    }

    @Override // o.DataStoreProviderCompanion
    public final void write(String str, String str2) {
        str.getClass();
        str2.getClass();
        write(str2, true);
        this.read.IconCompatParcelizer();
    }

    private final void write(String str, boolean z) {
        ArrayList<getOrCreateScopeForKeylambda11> arrayList = new ArrayList();
        synchronized (this) {
            List list = (List) this.MediaSessionCompatQueueItem.remove(str);
            if (list != null) {
                arrayList.addAll(list);
            }
            this.MediaDescriptionCompat = false;
        }
        for (getOrCreateScopeForKeylambda11 getorcreatescopeforkeylambda11 : arrayList) {
            if (z) {
                getorcreatescopeforkeylambda11.getClass();
            } else {
                getorcreatescopeforkeylambda11.getClass();
            }
        }
        IconCompatParcelizer();
    }
}
