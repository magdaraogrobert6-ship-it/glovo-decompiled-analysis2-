package o;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class readList {
    private final createOrGetDataStore MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final readAllData serializer;
    private final readInt write;
    private final HashMap read = new HashMap();
    private final HashMap IconCompatParcelizer = new HashMap();

    public final void IconCompatParcelizer() {
        Collection<containsandroid_sdk_base_release> collectionValues;
        synchronized (this) {
            collectionValues = this.read.values();
        }
        createOrGetDataStore createorgetdatastore = this.MediaMetadataCompat;
        int size = collectionValues.size();
        createorgetdatastore.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(size);
        for (containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar : collectionValues) {
            containsandroid_sdk_base_releaseVar.write();
            containsandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(new readFloat(this, containsandroid_sdk_base_releaseVar, countDownLatch));
        }
        try {
            this.RemoteActionCompatParcelizer.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            while (!countDownLatch.await(100L, TimeUnit.MILLISECONDS) && SystemClock.uptimeMillis() - jUptimeMillis < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void MediaDescriptionCompat() {
        Collection collectionValues;
        synchronized (this) {
            collectionValues = this.read.values();
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((containsandroid_sdk_base_release) it.next()).serializer();
        }
    }

    public final void write(String str) {
        synchronized (this) {
            this.write.IconCompatParcelizer(str);
            HashMap map = this.read;
            if (((containsandroid_sdk_base_release) map.get(str)) != null) {
                map.remove(str);
            }
        }
    }

    private containsandroid_sdk_base_release serializer(String str) {
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = (containsandroid_sdk_base_release) this.IconCompatParcelizer.get(str);
        return containsandroid_sdk_base_releaseVar == null ? IconCompatParcelizer(str, true) : containsandroid_sdk_base_releaseVar;
    }

    public final containsandroid_sdk_base_release read() {
        return serializer("Receiver");
    }

    public final containsandroid_sdk_base_release write() {
        return serializer("Service");
    }

    public readList(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, readAllData readalldata, readInt readint, createOrGetDataStore createorgetdatastore) {
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = readalldata;
        this.write = readint;
        this.MediaMetadataCompat = createorgetdatastore;
    }

    public final containsandroid_sdk_base_release RemoteActionCompatParcelizer() {
        return serializer("Sentiance");
    }

    public final containsandroid_sdk_base_release serializer() {
        return serializer("Executor");
    }

    public final containsandroid_sdk_base_release IconCompatParcelizer(String str, boolean z) {
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar;
        synchronized (this) {
            try {
                HashMap map = z ? this.IconCompatParcelizer : this.read;
                containsandroid_sdk_base_releaseVar = (containsandroid_sdk_base_release) map.get(str);
                if (containsandroid_sdk_base_releaseVar == null) {
                    HandlerThread handlerThreadWrite = this.write.write("sent:" + str);
                    readAllData readalldata = this.serializer;
                    Looper looper = handlerThreadWrite.getLooper();
                    readalldata.getClass();
                    containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar2 = new containsandroid_sdk_base_release(str, looper);
                    map.put(str, containsandroid_sdk_base_releaseVar2);
                    containsandroid_sdk_base_releaseVar = containsandroid_sdk_base_releaseVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return containsandroid_sdk_base_releaseVar;
    }
}
