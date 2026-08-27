package o;

import android.content.Context;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.services.ServiceType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdayNnfP9OWdJ6S3Hy631x_brBzgQA extends r8lambdarI00A69l7k7NAO4I9NDF7haFpGI {
    private final setNotificationBadgeNumber IconCompatParcelizer;
    private boolean MediaMetadataCompat;
    private final clearAllData MediaSessionCompatQueueItem;
    private final retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release RatingCompat;
    private final migrateSealedSessionsMapToJsonlambda20 RemoteActionCompatParcelizer;
    private final r8lambdazmDtqPjRUbwDy4jaRuHv97mCORE read;
    private final r8lambdaneqB_Y1GXUov9UPyhECVyz4pmfM serializer;
    private final ServiceManager write;
    private final ArrayList MediaDescriptionCompat = new ArrayList();
    private int MediaBrowserCompatMediaItem = 0;

    private void RemoteActionCompatParcelizer() {
        synchronized (this) {
            for (String str : this.serializer.RemoteActionCompatParcelizer()) {
                this.serializer.read(str);
                write(str);
                this.RemoteActionCompatParcelizer.write(str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:9:0x0013, B:10:0x0029, B:12:0x0031), top: B:23:0x0013, outer: #0 }] */
    @Override // o.r8lambdarI00A69l7k7NAO4I9NDF7haFpGI
    public final void read(String str) {
        synchronized (this) {
            if (this.serializer.write(str)) {
                if (!this.serializer.read(str)) {
                    if (this.serializer.read()) {
                        this.read.RemoteActionCompatParcelizer(this);
                    }
                    this.RemoteActionCompatParcelizer.write(str);
                    return;
                }
                try {
                    this.write.write(str + ":Guarding");
                    if (this.serializer.read()) {
                        this.read.RemoteActionCompatParcelizer(this);
                    }
                    this.RemoteActionCompatParcelizer.write(str);
                    return;
                } catch (Throwable th) {
                    this.RemoteActionCompatParcelizer.write(str);
                    throw th;
                }
                throw th;
            }
        }
    }

    @Override // o.r8lambdarI00A69l7k7NAO4I9NDF7haFpGI
    public final void write(String str) {
        Boolean boolSerializer;
        synchronized (this) {
            if (this.IconCompatParcelizer.MediaDescriptionCompat()) {
                if (this.serializer.write(str)) {
                    return;
                }
                migrateSealedSessionsMapToJsonlambda20 migratesealedsessionsmaptojsonlambda20 = this.RemoteActionCompatParcelizer;
                synchronized (migratesealedsessionsmaptojsonlambda20) {
                    migratesealedsessionsmaptojsonlambda20.read(-1L, str);
                }
                boolean z = !this.MediaMetadataCompat && ((boolSerializer = this.RatingCompat.IconCompatParcelizer().serializer()) == null || !boolSerializer.booleanValue()) && !(this.read.read() && this.serializer.IconCompatParcelizer().isEmpty());
                if (z) {
                    this.write.read(str + ":Guarding");
                }
                this.serializer.RemoteActionCompatParcelizer(str, z);
                if (!z && this.read.read() && this.serializer.IconCompatParcelizer().isEmpty()) {
                    this.read.write(this, this.MediaSessionCompatQueueItem);
                }
            }
        }
    }

    @Override // o.r8lambdarI00A69l7k7NAO4I9NDF7haFpGI
    public final boolean serializer() {
        return !this.serializer.read() && this.write.RemoteActionCompatParcelizer(ServiceType.FOREGROUND);
    }

    public r8lambdayNnfP9OWdJ6S3Hy631x_brBzgQA(Context context, ServiceManager serviceManager, r8lambdaneqB_Y1GXUov9UPyhECVyz4pmfM r8lambdaneqb_y1gxuov9upyhecvyz4pmfm, migrateSealedSessionsMapToJsonlambda20 migratesealedsessionsmaptojsonlambda20, r8lambdazmDtqPjRUbwDy4jaRuHv97mCORE r8lambdazmdtqpjrubwdy4jaruhv97mcore, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, clearAllData clearalldata, setNotificationBadgeNumber setnotificationbadgenumber) {
        this.MediaSessionCompatQueueItem = clearalldata;
        this.IconCompatParcelizer = setnotificationbadgenumber;
        this.serializer = r8lambdaneqb_y1gxuov9upyhecvyz4pmfm;
        this.write = serviceManager;
        this.RemoteActionCompatParcelizer = migratesealedsessionsmaptojsonlambda20;
        this.read = r8lambdazmdtqpjrubwdy4jaruhv97mcore;
        this.RatingCompat = retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release;
    }

    @Override // o.r8lambdarI00A69l7k7NAO4I9NDF7haFpGI
    public final void write() {
        ArrayList arrayList;
        synchronized (this.MediaDescriptionCompat) {
            arrayList = new ArrayList(this.MediaDescriptionCompat);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4) it.next()).write();
        }
    }

    @Override // o.r8lambdarI00A69l7k7NAO4I9NDF7haFpGI
    public final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 IconCompatParcelizer(String str, boolean z) {
        ArrayList arrayList;
        r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdaubr5yzuzjutxrplc5ra84pkhdyo;
        synchronized (this.MediaDescriptionCompat) {
            synchronized (this.MediaDescriptionCompat) {
                arrayList = new ArrayList(this.MediaDescriptionCompat);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4) it.next()).serializer().equals(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(":");
                    int i = this.MediaBrowserCompatMediaItem;
                    this.MediaBrowserCompatMediaItem = i + 1;
                    sb.append(i);
                    str = sb.toString();
                    break;
                }
            }
            if (z) {
                r8lambdaubr5yzuzjutxrplc5ra84pkhdyo = new r8lambdadEffzF9DFVZFXWDLh9SCAahN2QA(this, str);
            } else {
                r8lambdaubr5yzuzjutxrplc5ra84pkhdyo = new r8lambdaubR5YzuZjuTxrplc5ra84pKHdyo(this, str);
            }
            this.MediaDescriptionCompat.add(r8lambdaubr5yzuzjutxrplc5ra84pkhdyo);
        }
        return r8lambdaubr5yzuzjutxrplc5ra84pkhdyo;
    }

    @Override // o.r8lambdarI00A69l7k7NAO4I9NDF7haFpGI
    public final void write(int i) {
        synchronized (this) {
            boolean z = i > 0;
            this.MediaMetadataCompat = z;
            if (!z) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void read() {
        RemoteActionCompatParcelizer();
    }
}
