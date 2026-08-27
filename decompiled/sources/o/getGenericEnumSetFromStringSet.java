package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.okhttp3.internal.http2.ErrorCode;
import com.sentiance.okhttp3.internal.http2.e$h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class getGenericEnumSetFromStringSet implements Closeable {
    public static final ThreadPoolExecutor IconCompatParcelizer;
    public final getFirebaseCloudMessagingSenderIdKey ComponentActivity;
    public final boolean MediaBrowserCompatMediaItem;
    public final getCustomHtmlWebViewActivityClassName MediaDescriptionCompat;
    public final getContextandroid_sdk_base_release MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final ScheduledThreadPoolExecutor PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public final LinkedHashSet RatingCompat;
    public final onFling RemoteActionCompatParcelizer;
    public final ThreadPoolExecutor r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final Socket read;
    public final onFling serializer;
    public final com.sentiance.okhttp3.internal.http2.h write;
    public final LinkedHashMap MediaMetadataCompat = new LinkedHashMap();
    public long ResultReceiver = 0;
    public long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
    public long r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
    public long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
    public long r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0;

    public final int IconCompatParcelizer() {
        int i;
        synchronized (this) {
            onFling onfling = this.serializer;
            i = (onfling.read & 16) != 0 ? onfling.write[4] : Integer.MAX_VALUE;
        }
        return i;
    }

    public final getDeviceObjectAllowlist serializer(int i) {
        getDeviceObjectAllowlist getdeviceobjectallowlist;
        synchronized (this) {
            getdeviceobjectallowlist = (getDeviceObjectAllowlist) this.MediaMetadataCompat.remove(Integer.valueOf(i));
            notifyAll();
        }
        return getdeviceobjectallowlist;
    }

    public final void serializer(long j) {
        synchronized (this) {
            long j2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + j;
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = j2;
            if (j2 >= this.RemoteActionCompatParcelizer.IconCompatParcelizer() / 2) {
                read(0, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0L;
            }
        }
    }

    public final getDeviceObjectAllowlist write(int i) {
        getDeviceObjectAllowlist getdeviceobjectallowlist;
        synchronized (this) {
            getdeviceobjectallowlist = (getDeviceObjectAllowlist) this.MediaMetadataCompat.get(Integer.valueOf(i));
        }
        return getdeviceobjectallowlist;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        serializer(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public final void read() {
        this.write.read();
    }

    public final void serializer(int i, ErrorCode errorCode) {
        try {
            this.PlaybackStateCompat.execute(new getBaseUrlForRequests(this, new Object[]{this.ParcelableVolumeInfo, Integer.valueOf(i)}, i, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    static {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        IconCompatParcelizer = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, synchronousQueue, new r8lambdaST4AYLA9Q2b7l2QguExdjNYtig("OkHttp Http2Connection", true));
    }

    public getGenericEnumSetFromStringSet(e$h e_h) {
        onFling onfling = new onFling(1);
        this.RemoteActionCompatParcelizer = onfling;
        onFling onfling2 = new onFling(1);
        this.serializer = onfling2;
        this.RatingCompat = new LinkedHashSet();
        this.ComponentActivity = getFirebaseCloudMessagingSenderIdKey.write;
        boolean z = e_h.MediaSessionCompatQueueItem;
        this.MediaBrowserCompatMediaItem = z;
        this.MediaSessionCompatQueueItem = (getContextandroid_sdk_base_release) e_h.IconCompatParcelizer;
        int i = z ? 1 : 2;
        this.MediaSessionCompatToken = i;
        if (z) {
            this.MediaSessionCompatToken = i + 2;
        }
        if (z) {
            onfling.IconCompatParcelizer(7, 16777216);
        }
        String str = (String) e_h.read;
        this.ParcelableVolumeInfo = str;
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        java.util.Locale locale = java.util.Locale.US;
        this.PlaybackStateCompat = new ScheduledThreadPoolExecutor(1, new r8lambdaST4AYLA9Q2b7l2QguExdjNYtig(ff$$ExternalSyntheticOutline0.m("OkHttp ", str, " Writer"), false));
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r8lambdaST4AYLA9Q2b7l2QguExdjNYtig(ff$$ExternalSyntheticOutline0.m("OkHttp ", str, " Push Observer"), true));
        onfling2.IconCompatParcelizer(7, 65535);
        onfling2.IconCompatParcelizer(5, androidx.compose.ui.graphics.Fields.Clip);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = onfling2.IconCompatParcelizer();
        this.read = (Socket) e_h.write;
        this.write = new com.sentiance.okhttp3.internal.http2.h((readResourceValuelambda2) e_h.serializer, z);
        this.MediaDescriptionCompat = new getCustomHtmlWebViewActivityClassName(this, new getDefaultNotificationAccentColor((readResourceValuelambda1) e_h.RemoteActionCompatParcelizer, z));
    }

    public final void read(int i, boolean z, r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.write.RemoteActionCompatParcelizer(z, i, r8lambdabeyrnr8p6809bwlboro_stans, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        if (j2 <= 0) {
                            if (this.MediaMetadataCompat.containsKey(Integer.valueOf(i))) {
                                wait();
                            } else {
                                throw new IOException("stream closed");
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j, j2), this.write.read);
                j3 = iMin;
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM -= j3;
            }
            j -= j3;
            this.write.RemoteActionCompatParcelizer(z && j == 0, i, r8lambdabeyrnr8p6809bwlboro_stans, iMin);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            serializer(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    public final void read(int i, long j) {
        try {
            this.PlaybackStateCompat.execute(new getBrazeApiKey(this, new Object[]{this.ParcelableVolumeInfo, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void RemoteActionCompatParcelizer(ErrorCode errorCode) {
        synchronized (this.write) {
            synchronized (this) {
                if (this.PlaybackStateCompatCustomAction) {
                    return;
                }
                this.PlaybackStateCompatCustomAction = true;
                this.write.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, errorCode, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer);
            }
        }
    }

    public final void serializer(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        getDeviceObjectAllowlist[] getdeviceobjectallowlistArr = null;
        try {
            RemoteActionCompatParcelizer(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.MediaMetadataCompat.isEmpty()) {
                getdeviceobjectallowlistArr = (getDeviceObjectAllowlist[]) this.MediaMetadataCompat.values().toArray(new getDeviceObjectAllowlist[this.MediaMetadataCompat.size()]);
                this.MediaMetadataCompat.clear();
            }
        }
        if (getdeviceobjectallowlistArr != null) {
            for (getDeviceObjectAllowlist getdeviceobjectallowlist : getdeviceobjectallowlistArr) {
                try {
                    getdeviceobjectallowlist.write(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.write.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.read.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.PlaybackStateCompat.shutdown();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void write(r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 r8lambda0s3kvx2wuurb_som2dk25cpetl8) {
        synchronized (this) {
            if (!this.PlaybackStateCompatCustomAction) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.execute(r8lambda0s3kvx2wuurb_som2dk25cpetl8);
            }
        }
    }
}
