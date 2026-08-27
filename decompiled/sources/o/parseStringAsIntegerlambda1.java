package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.services.ServiceType;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(dataLogTag = "services")
public class parseStringAsIntegerlambda1 {
    private final r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final readandroid_sdk_base_release read;
    private final migrateBannerImpressionMapToJsonlambda20 serializer;
    private final Runnable MediaSessionCompatQueueItem = new parseStringAsLonglambda1(this);
    private boolean write = false;
    private final EnumMap MediaMetadataCompat = new EnumMap(ServiceType.class);

    public final void serializer(ServiceType serviceType) {
        synchronized (this) {
            Long l = (Long) this.MediaMetadataCompat.get(serviceType);
            if (l != null) {
                this.MediaMetadataCompat.remove(serviceType);
                this.RemoteActionCompatParcelizer.getClass();
                write(serviceType.toString(), "stop", Long.toString(System.currentTimeMillis() - l.longValue()));
            }
            synchronized (this) {
                if (this.MediaMetadataCompat.size() == 0) {
                    this.read.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
                    this.write = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer() {
        EnumMap enumMapWrite = this.serializer.write();
        for (ServiceType serviceType : ServiceType.values()) {
            List list = (List) enumMapWrite.get(serviceType);
            if (list != null && !list.isEmpty()) {
                write(serviceType.toString(), "running", list.toString().replace(" ", ""));
            }
        }
    }

    public parseStringAsIntegerlambda1(r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY r8lambdagt3ok5kqtheeii2u7flzq1_mnqy, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, migrateBannerImpressionMapToJsonlambda20 migratebannerimpressionmaptojsonlambda20) {
        this.IconCompatParcelizer = r8lambdagt3ok5kqtheeii2u7flzq1_mnqy;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = migratebannerimpressionmaptojsonlambda20;
        this.read = readandroid_sdk_base_releaseVar;
    }

    public final void IconCompatParcelizer(ServiceType serviceType) {
        synchronized (this) {
            if (!this.MediaMetadataCompat.containsKey(serviceType)) {
                EnumMap enumMap = this.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer.getClass();
                enumMap.put(serviceType, Long.valueOf(System.currentTimeMillis()));
            }
            write(serviceType.toString(), "start", "");
            IconCompatParcelizer();
            write(false);
        }
    }

    private void write(String str, String str2, String str3) {
        this.RemoteActionCompatParcelizer.getClass();
        this.IconCompatParcelizer.serializer(System.currentTimeMillis(), str + "," + str2 + "," + str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x000f A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000f), top: B:14:0x0003 }] */
    public void write(boolean z) {
        synchronized (this) {
            if (!z) {
                if (!this.write && this.MediaMetadataCompat.size() > 0) {
                    this.write = true;
                    this.read.IconCompatParcelizer("ServiceLogger", 60000L, this.MediaSessionCompatQueueItem);
                }
            } else {
                this.write = true;
                this.read.IconCompatParcelizer("ServiceLogger", 60000L, this.MediaSessionCompatQueueItem);
            }
        }
    }
}
