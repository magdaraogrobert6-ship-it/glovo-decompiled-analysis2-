package o;

import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DataStoreProviderk;

/* JADX INFO: loaded from: classes3.dex */
public final class writeandroid_sdk_base_release<T extends DataStoreProviderk> {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final LinkedHashMap MediaDescriptionCompat;
    private final LinkedHashMap MediaMetadataCompat;
    private final e$$ExternalSyntheticLambda0 MediaSessionCompatQueueItem;
    private final int RemoteActionCompatParcelizer;
    private final long read;
    private final Object serializer;
    private final clearandroid_sdk_base_release write;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static void RemoteActionCompatParcelizer(writeandroid_sdk_base_release writeandroid_sdk_base_releaseVar) {
        synchronized (writeandroid_sdk_base_releaseVar.serializer) {
            writeandroid_sdk_base_releaseVar.IconCompatParcelizer.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            LinkedHashMap linkedHashMap = writeandroid_sdk_base_releaseVar.MediaDescriptionCompat;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((Number) entry.getValue()).longValue() + writeandroid_sdk_base_releaseVar.read <= jCurrentTimeMillis) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            for (String str : linkedHashMap2.keySet()) {
                writeandroid_sdk_base_releaseVar.MediaMetadataCompat.remove(str);
                writeandroid_sdk_base_releaseVar.MediaDescriptionCompat.remove(str);
            }
            if (!writeandroid_sdk_base_releaseVar.MediaMetadataCompat.isEmpty()) {
                writeandroid_sdk_base_releaseVar.read();
            }
        }
    }

    private final void read() {
        Object obj;
        Iterator it = this.MediaDescriptionCompat.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long jLongValue = ((Number) ((Map.Entry) next).getValue()).longValue();
                do {
                    Object next2 = it.next();
                    long jLongValue2 = ((Number) ((Map.Entry) next2).getValue()).longValue();
                    if (jLongValue > jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            long jLongValue3 = ((Number) entry.getValue()).longValue();
            long j = this.read;
            this.IconCompatParcelizer.getClass();
            this.write.serializer(this.MediaSessionCompatQueueItem, Math.max(0L, (jLongValue3 + j) - System.currentTimeMillis()));
        }
    }

    private final void read(String str, T t) {
        Object next;
        synchronized (this.serializer) {
            if (this.MediaMetadataCompat.size() >= this.RemoteActionCompatParcelizer) {
                Iterator it = this.MediaDescriptionCompat.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long jLongValue = ((Number) ((Map.Entry) next).getValue()).longValue();
                        do {
                            Object next2 = it.next();
                            long jLongValue2 = ((Number) ((Map.Entry) next2).getValue()).longValue();
                            if (jLongValue > jLongValue2) {
                                next = next2;
                                jLongValue = jLongValue2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry = (Map.Entry) next;
                String str2 = entry != null ? (String) entry.getKey() : null;
                if (str2 != null) {
                    this.MediaMetadataCompat.remove(str2);
                    this.MediaDescriptionCompat.remove(str2);
                }
            }
            this.MediaMetadataCompat.put(str, t);
            LinkedHashMap linkedHashMap = this.MediaDescriptionCompat;
            this.IconCompatParcelizer.getClass();
            linkedHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
            if (this.MediaMetadataCompat.size() == 1) {
                read();
            }
        }
    }

    static {
        new read(null);
    }

    public writeandroid_sdk_base_release(clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, long j, int i) {
        clearandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.write = clearandroid_sdk_base_releaseVar;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.read = j;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = new Object();
        this.MediaMetadataCompat = new LinkedHashMap();
        this.MediaDescriptionCompat = new LinkedHashMap();
        this.MediaSessionCompatQueueItem = new e$$ExternalSyntheticLambda0(6, this);
    }

    public /* synthetic */ writeandroid_sdk_base_release(clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(clearandroid_sdk_base_releaseVar, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, (i2 & 4) != 0 ? 60000L : j, (i2 & 8) != 0 ? 1 : i);
    }

    public final DataStoreProviderk RemoteActionCompatParcelizer(DataStoreProviderhExternalSyntheticLambda0 dataStoreProviderhExternalSyntheticLambda0, String str) {
        boolean zContainsKey;
        DataStoreProviderk dataStoreProviderk;
        DataStoreProviderk dataStoreProviderkSerializer;
        dataStoreProviderhExternalSyntheticLambda0.getClass();
        synchronized (this.serializer) {
            synchronized (this.serializer) {
                zContainsKey = this.MediaMetadataCompat.containsKey(str);
            }
            if (!zContainsKey && (dataStoreProviderkSerializer = dataStoreProviderhExternalSyntheticLambda0.serializer(str)) != null) {
                read(str, dataStoreProviderkSerializer);
            }
            synchronized (this.serializer) {
                LinkedHashMap linkedHashMap = this.MediaDescriptionCompat;
                this.IconCompatParcelizer.getClass();
                linkedHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
                dataStoreProviderk = (DataStoreProviderk) this.MediaMetadataCompat.get(str);
            }
        }
        return dataStoreProviderk;
    }

    public final void IconCompatParcelizer() {
        synchronized (this.serializer) {
            this.MediaMetadataCompat.clear();
            this.MediaDescriptionCompat.clear();
            this.write.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
    }
}
