package com.sentiance.sdk.threading.executors;

import android.annotation.SuppressLint;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.SdkException;
import com.sentiance.sdk.processguard.Guard$Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o.batchUpdatesandroid_sdk_base_release;
import o.clearAllData;
import o.clearData;
import o.containsandroid_sdk_base_release;
import o.migratePushDeliveryEventsToJsonlambda0;
import o.parseLonglambda0;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.readAllandroid_sdk_base_release;
import o.readIntlambda0;
import o.readList;
import o.readandroid_sdk_base_release;
import o.writeData;
import o.writeDatalambda0;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "Executors", guardType = Guard$Type.REFERENCE_COUNTED)
public class Executors implements writeData {
    private final int IconCompatParcelizer;
    private final AtomicInteger MediaBrowserCompatMediaItem;
    private final readAllandroid_sdk_base_release MediaDescriptionCompat;
    private final ArrayList MediaMetadataCompat;
    private volatile boolean MediaSessionCompatQueueItem;
    private final SparseArray<clearData> RatingCompat;
    private final write RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final AtomicInteger serializer;
    private final containsandroid_sdk_base_release write;

    /* JADX INFO: loaded from: classes4.dex */
    public static class ExecutableList extends ArrayList<readIntlambda0> {
    }

    public static class write extends migratePushDeliveryEventsToJsonlambda0 {
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaSessionCompatQueueItem = false;
    }

    public final void write() {
        this.MediaSessionCompatQueueItem = true;
        this.write.write();
        this.write.IconCompatParcelizer();
        this.read.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this.RemoteActionCompatParcelizer) {
            while (this.MediaBrowserCompatMediaItem.get() > 0) {
                this.read.getClass();
                if (SystemClock.uptimeMillis() - jUptimeMillis >= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                    break;
                }
                try {
                    this.RemoteActionCompatParcelizer.wait(10L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.MediaBrowserCompatMediaItem.get();
                }
            }
        }
        this.MediaBrowserCompatMediaItem.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer() {
        this.MediaBrowserCompatMediaItem.decrementAndGet();
        if (this.MediaSessionCompatQueueItem && this.MediaBrowserCompatMediaItem.get() == 0) {
            synchronized (this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer.notifyAll();
            }
        }
    }

    public final readandroid_sdk_base_release read() {
        return new readandroid_sdk_base_release(this.serializer.getAndIncrement(), this, this.read);
    }

    public Executors(parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, readList readlist, write writeVar, batchUpdatesandroid_sdk_base_release batchupdatesandroid_sdk_base_release) {
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RemoteActionCompatParcelizer = writeVar;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.serializer = atomicInteger;
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVarSerializer = readlist.serializer();
        this.write = containsandroid_sdk_base_releaseVarSerializer;
        this.MediaMetadataCompat = new ArrayList(32);
        this.RatingCompat = new SparseArray<>(Fields.SpotShadowColor);
        this.MediaBrowserCompatMediaItem = new AtomicInteger(0);
        this.IconCompatParcelizer = atomicInteger.getAndIncrement();
        this.MediaDescriptionCompat = batchupdatesandroid_sdk_base_release.IconCompatParcelizer();
        containsandroid_sdk_base_releaseVarSerializer.RemoteActionCompatParcelizer(this);
    }

    private void MediaMetadataCompat() {
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = this.write;
        containsandroid_sdk_base_releaseVar.IconCompatParcelizer(5);
        ArrayList arrayList = this.MediaMetadataCompat;
        readIntlambda0 readintlambda0 = (readIntlambda0) (!arrayList.isEmpty() ? arrayList.get(0) : null);
        if (readintlambda0 != null) {
            long j = readintlambda0.read();
            this.read.getClass();
            containsandroid_sdk_base_releaseVar.read(5, j - SystemClock.uptimeMillis());
        }
    }

    private void RemoteActionCompatParcelizer(readIntlambda0 readintlambda0) {
        long j = readintlambda0.read();
        this.read.getClass();
        if (j - SystemClock.uptimeMillis() > 0) {
            ArrayList arrayList = this.MediaMetadataCompat;
            arrayList.add(readintlambda0);
            Collections.sort(arrayList, readIntlambda0.RemoteActionCompatParcelizer);
            MediaMetadataCompat();
            return;
        }
        int iSerializer = readintlambda0.serializer();
        SparseArray<clearData> sparseArray = this.RatingCompat;
        clearData cleardata = sparseArray.get(iSerializer);
        if (cleardata == null) {
            cleardata = new clearData();
            sparseArray.put(iSerializer, cleardata);
        }
        cleardata.write(readintlambda0);
        RemoteActionCompatParcelizer(cleardata);
    }

    public final void IconCompatParcelizer(readIntlambda0 readintlambda0) {
        if (this.MediaSessionCompatQueueItem) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = readintlambda0;
        this.write.serializer(messageObtain);
    }

    public final void read(readIntlambda0 readintlambda0) {
        if (this.MediaSessionCompatQueueItem) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = readintlambda0;
        this.write.serializer(messageObtain);
    }

    @Override // o.writeData
    @SuppressLint
    public final void handleMessage(Message message) {
        if (!this.MediaSessionCompatQueueItem || message.what == 6) {
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof readIntlambda0) {
                    RemoteActionCompatParcelizer((readIntlambda0) obj);
                    return;
                }
            }
            if (i == 2) {
                Object obj2 = message.obj;
                if (obj2 instanceof ExecutableList) {
                    Iterator<readIntlambda0> it = ((ExecutableList) obj2).iterator();
                    while (it.hasNext()) {
                        RemoteActionCompatParcelizer(it.next());
                    }
                    return;
                }
            }
            if (i == 3) {
                Object obj3 = message.obj;
                if (obj3 instanceof readIntlambda0) {
                    readIntlambda0 readintlambda0 = (readIntlambda0) obj3;
                    List listSingletonList = Collections.singletonList(readintlambda0);
                    int iSerializer = readintlambda0.serializer();
                    SparseArray<clearData> sparseArray = this.RatingCompat;
                    clearData cleardata = sparseArray.get(iSerializer);
                    if (cleardata == null) {
                        cleardata = new clearData();
                        sparseArray.put(iSerializer, cleardata);
                    }
                    cleardata.RemoteActionCompatParcelizer(listSingletonList);
                    this.MediaMetadataCompat.removeAll(listSingletonList);
                    MediaMetadataCompat();
                    return;
                }
            }
            if (i == 4) {
                Object obj4 = message.obj;
                if (obj4 instanceof clearData) {
                    clearData cleardata2 = (clearData) obj4;
                    cleardata2.read(false);
                    RemoteActionCompatParcelizer(cleardata2);
                    return;
                }
            }
            if (i != 5) {
                if (i == 6) {
                    this.write.write();
                    this.MediaMetadataCompat.clear();
                    this.RatingCompat.clear();
                    return;
                } else {
                    throw new SdkException("Cannot process unknown message of type " + message.what + " and object of type " + message.obj);
                }
            }
            this.read.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            ExecutableList executableList = new ExecutableList();
            Iterator it2 = this.MediaMetadataCompat.iterator();
            while (it2.hasNext()) {
                readIntlambda0 readintlambda1 = (readIntlambda0) it2.next();
                if (readintlambda1.read() > jUptimeMillis) {
                    break;
                }
                System.currentTimeMillis();
                SystemClock.uptimeMillis();
                executableList.add(readintlambda1);
                it2.remove();
            }
            if (!this.MediaSessionCompatQueueItem) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 2;
                messageObtain.obj = executableList;
                this.write.serializer(messageObtain);
            }
            MediaMetadataCompat();
        }
    }

    private void RemoteActionCompatParcelizer(clearData cleardata) {
        readIntlambda0 readintlambda0Write;
        if (cleardata.read() || (readintlambda0Write = cleardata.write()) == null) {
            return;
        }
        this.MediaBrowserCompatMediaItem.incrementAndGet();
        if (this.MediaSessionCompatQueueItem) {
            serializer();
        } else {
            cleardata.read(readintlambda0Write.serializer() != this.IconCompatParcelizer);
            this.MediaDescriptionCompat.submit(new writeDatalambda0(this, readintlambda0Write, cleardata));
        }
    }

    public final clearAllData IconCompatParcelizer() {
        return new clearAllData(this.IconCompatParcelizer, this, this.read);
    }

    public static void read(Executors executors, clearData cleardata) {
        if (executors.MediaSessionCompatQueueItem) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = cleardata;
        executors.write.serializer(messageObtain);
    }
}
