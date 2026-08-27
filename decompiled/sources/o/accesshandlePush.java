package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DiskQuotaMonitor")
public class accesshandlePush implements removeGeofencesRegisteredWithGeofencingClientlambda2, migrateBlocklistedLists {
    private boolean MediaBrowserCompatMediaItem;
    private long MediaMetadataCompat;
    private final handleAdmRegistrationIntentlambda3 MediaSessionCompatQueueItem;
    private int RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final ConfigurationManager read;
    private final readandroid_sdk_base_release serializer;
    private final parseLonglambda0 write;
    private final ArrayList IconCompatParcelizer = new ArrayList();
    private final HashMap<File, Long> MediaDescriptionCompat = new HashMap<>();

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface serializer {
    }

    private long MediaMetadataCompat() {
        long jLongValue;
        synchronized (this) {
            jLongValue = 0;
            for (Long l : this.MediaDescriptionCompat.values()) {
                if (l != null) {
                    jLongValue += l.longValue();
                }
            }
        }
        return jLongValue;
    }

    private void RatingCompat() {
        synchronized (this) {
            long jMediaMetadataCompat = MediaMetadataCompat();
            if (jMediaMetadataCompat >= MediaBrowserCompatMediaItem() || this.MediaSessionCompatQueueItem.write() < 104857600) {
                this.RatingCompat = 4;
            } else {
                float f = jMediaMetadataCompat;
                if (f >= MediaBrowserCompatMediaItem() * 0.95f) {
                    this.RatingCompat = 3;
                } else if (f >= MediaBrowserCompatMediaItem() * 0.9f) {
                    this.RatingCompat = 2;
                } else if (f >= MediaBrowserCompatMediaItem() * 0.8f) {
                    this.RatingCompat = 1;
                } else {
                    this.RatingCompat = 0;
                }
            }
            if (this.MediaMetadataCompat != jMediaMetadataCompat) {
                this.write.IconCompatParcelizer("Total disk usage is %d / %d KB", Long.valueOf(jMediaMetadataCompat / 1024), Long.valueOf(MediaBrowserCompatMediaItem() / 1024));
                this.MediaMetadataCompat = jMediaMetadataCompat;
            }
        }
    }

    public static void write(accesshandlePush accesshandlepush) {
        synchronized (accesshandlepush) {
            int i = accesshandlepush.RatingCompat;
            accesshandlepush.RatingCompat();
            accesshandlepush.IconCompatParcelizer(i);
        }
    }

    public final long IconCompatParcelizer() {
        return (long) (MediaBrowserCompatMediaItem() * 0.95f);
    }

    public final long MediaDescriptionCompat() {
        return MediaMetadataCompat();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    public final int read() {
        return this.RatingCompat;
    }

    public final void write() {
        this.write.IconCompatParcelizer("SQLiteFullException received", new Object[0]);
        this.serializer.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(2, this));
    }

    public static void IconCompatParcelizer(accesshandlePush accesshandlepush) {
        String str;
        synchronized (accesshandlepush) {
            accesshandlepush.MediaBrowserCompatMediaItem = true;
            ArrayList<File> arrayList = new ArrayList();
            Iterator it = getPublicNotificationExtras.b().RemoteActionCompatParcelizer().iterator();
            while (it.hasNext()) {
                r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q r8lambda9t5rqbxiyzswjwkuj3tyq12mq_q = (r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q) setPushUniqueId.read((Class) it.next());
                if (r8lambda9t5rqbxiyzswjwkuj3tyq12mq_q != null) {
                    arrayList.addAll(r8lambda9t5rqbxiyzswjwkuj3tyq12mq_q.getStoredFiles());
                }
            }
            for (File file : arrayList) {
                handleAdmRegistrationEventIfEnabledlambda1 handleadmregistrationeventifenabledlambda1 = new handleAdmRegistrationEventIfEnabledlambda1(accesshandlepush, file);
                accesshandlepush.IconCompatParcelizer.add(handleadmregistrationeventifenabledlambda1);
                handleadmregistrationeventifenabledlambda1.startWatching();
                accesshandlepush.MediaDescriptionCompat.put(file, Long.valueOf(file.exists() ? file.isDirectory() ? migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file) : file.length() : 0L));
            }
            accesshandlepush.RatingCompat();
            parseLonglambda0 parselonglambda0 = accesshandlepush.write;
            int i = accesshandlepush.RatingCompat;
            if (i == 1) {
                str = "CLEANUP";
            } else if (i == 2) {
                str = "WARNING";
            } else if (i != 3) {
                str = i != 4 ? "OK" : "EXCEEDED";
            } else {
                str = "CRITICAL";
            }
            parselonglambda0.IconCompatParcelizer("Disk quota status initialized to %s", str);
        }
    }

    private long MediaBrowserCompatMediaItem() {
        double dRemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        ConfigurationManager configurationManager = this.read;
        return Math.min((long) (configurationManager.fullyDrawnReporter_delegatelambda0() * dRemoteActionCompatParcelizer), configurationManager.getSavedStateRegistryControllerannotations());
    }

    public final long RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatQueueItem.write();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.MediaBrowserCompatMediaItem = false;
            Iterator it = this.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((handleAdmRegistrationEventIfEnabledlambda1) it.next()).stopWatching();
            }
            this.IconCompatParcelizer.clear();
            this.MediaDescriptionCompat.clear();
            this.RatingCompat = 0;
            this.MediaMetadataCompat = 0L;
        }
    }

    public final long serializer() {
        return this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new handleAdmRegistrationEventIfEnabledlambda2(this, this.serializer));
    }

    public accesshandlePush(Context context, parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, handleAdmRegistrationIntentlambda3 handleadmregistrationintentlambda3) {
        this.write = parselonglambda0;
        this.read = configurationManager;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.serializer = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = handleadmregistrationintentlambda3;
        serverConfigDataStoreProviderCompanionExternalSyntheticLambda1.read(this);
    }

    public static void RemoteActionCompatParcelizer(accesshandlePush accesshandlepush, File file) {
        int i;
        Long l;
        long length;
        boolean z;
        String str;
        Long l2 = 0L;
        synchronized (accesshandlepush) {
            i = accesshandlepush.RatingCompat;
            l = accesshandlepush.MediaDescriptionCompat.get(file);
            if (l == null) {
                l = l2;
            }
            synchronized (accesshandlepush) {
                Long l3 = accesshandlepush.MediaDescriptionCompat.get(file);
                if (l3 != null) {
                    l2 = l3;
                }
                if (!file.exists()) {
                    length = 0;
                } else if (file.isDirectory()) {
                    length = migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file);
                } else {
                    length = file.length();
                }
                accesshandlepush.MediaDescriptionCompat.put(file, Long.valueOf(length));
                z = length != l2.longValue();
            }
        }
        if (z) {
            accesshandlepush.RatingCompat();
            Long l4 = accesshandlepush.MediaDescriptionCompat.get(file);
            if (l4 == null) {
                return;
            }
            parseLonglambda0 parselonglambda0 = accesshandlepush.write;
            String strIconCompatParcelizer = IconCompatParcelizer(file);
            if (l.longValue() - l4.longValue() > 0) {
                str = "decreased";
            } else {
                str = "increased";
            }
            parselonglambda0.IconCompatParcelizer("File %s %s by %,d bytes. New size is %,d bytes.", strIconCompatParcelizer, str, Long.valueOf(Math.abs(l.longValue() - l4.longValue())), l4);
            accesshandlepush.IconCompatParcelizer(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String IconCompatParcelizer(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return file.getName();
        }
        return parentFile.getName() + "/" + file.getName();
    }

    private void IconCompatParcelizer(int i) {
        String str;
        synchronized (this) {
            int i2 = this.RatingCompat;
            if (i != i2) {
                long jMax = 0;
                if (i2 == 1) {
                    jMax = Math.max(0L, MediaMetadataCompat() - ((long) (MediaBrowserCompatMediaItem() * 0.8f)));
                    this.write.IconCompatParcelizer("Usage above cleanup threshold is %d bytes.", Long.valueOf(jMax));
                }
                parseLonglambda0 parselonglambda0 = this.write;
                int i3 = this.RatingCompat;
                if (i3 == 1) {
                    str = "CLEANUP";
                } else if (i3 == 2) {
                    str = "WARNING";
                } else if (i3 == 3) {
                    str = "CRITICAL";
                } else if (i3 != 4) {
                    str = "OK";
                } else {
                    str = "EXCEEDED";
                }
                parselonglambda0.IconCompatParcelizer("Disk quota status changed to %s", str);
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(ControlMessage.DISK_QUOTA_STATUS_UPDATED, Long.valueOf(jMax));
            }
        }
    }
}
