package o;

import android.graphics.Bitmap;
import android.util.Log;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class getGamma implements getD {
    public static final Bitmap.Config IconCompatParcelizer = Bitmap.Config.ARGB_8888;
    public final accessgetVcp MediaMetadataCompat;
    public long RemoteActionCompatParcelizer;
    public final long read;
    public final Set serializer;
    public final TransferParametersKt write;

    public final Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapIconCompatParcelizer;
        synchronized (this) {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapIconCompatParcelizer = this.write.IconCompatParcelizer(i, i2, config != null ? config : IconCompatParcelizer);
            if (bitmapIconCompatParcelizer != null) {
                long j = this.RemoteActionCompatParcelizer;
                this.write.getClass();
                this.RemoteActionCompatParcelizer = j - ((long) Fill.RemoteActionCompatParcelizer(bitmapIconCompatParcelizer));
                this.MediaMetadataCompat.getClass();
                bitmapIconCompatParcelizer.setHasAlpha(true);
                bitmapIconCompatParcelizer.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.write.getClass();
                TransferParametersKt.serializer(Fill.serializer(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.write.getClass();
                TransferParametersKt.serializer(Fill.serializer(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.write);
            }
        }
        return bitmapIconCompatParcelizer;
    }

    public final void read(long j) {
        synchronized (this) {
            while (this.RemoteActionCompatParcelizer > j) {
                TransferParametersKt transferParametersKt = this.write;
                Bitmap bitmap = (Bitmap) transferParametersKt.MediaSessionCompatQueueItem.serializer();
                if (bitmap != null) {
                    transferParametersKt.RemoteActionCompatParcelizer(Integer.valueOf(Fill.RemoteActionCompatParcelizer(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        SentryLogcatAdapter.IconCompatParcelizer("LruBitmapPool", "Size mismatch, resetting");
                        Objects.toString(this.write);
                    }
                    this.RemoteActionCompatParcelizer = 0L;
                    return;
                }
                this.MediaMetadataCompat.getClass();
                long j2 = this.RemoteActionCompatParcelizer;
                this.write.getClass();
                this.RemoteActionCompatParcelizer = j2 - ((long) Fill.RemoteActionCompatParcelizer(bitmap));
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.write.getClass();
                    TransferParametersKt.serializer(Fill.RemoteActionCompatParcelizer(bitmap), bitmap.getConfig());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.write);
                }
                bitmap.recycle();
            }
        }
    }

    public getGamma(long j) {
        TransferParametersKt transferParametersKt = new TransferParametersKt();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.read = j;
        this.write = transferParametersKt;
        this.serializer = setUnmodifiableSet;
        this.MediaMetadataCompat = new accessgetVcp(6);
    }

    @Override // o.getD
    public final Bitmap read(int i, int i2) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapIconCompatParcelizer = IconCompatParcelizer(i, i2, config);
        if (bitmapIconCompatParcelizer != null) {
            bitmapIconCompatParcelizer.eraseColor(0);
            return bitmapIconCompatParcelizer;
        }
        if (config == null) {
            config = IconCompatParcelizer;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.getD
    public final void IconCompatParcelizer(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            o_();
        } else if (i >= 20 || i == 15) {
            read(this.read / 2);
        }
    }

    @Override // o.getD
    public final void o_() {
        Log.isLoggable("LruBitmapPool", 3);
        read(0L);
    }

    @Override // o.getD
    public final void read(Bitmap bitmap) {
        synchronized (this) {
            try {
                if (bitmap == null) {
                    throw new NullPointerException("Bitmap must not be null");
                }
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Cannot pool recycled bitmap");
                }
                if (bitmap.isMutable()) {
                    this.write.getClass();
                    if (Fill.RemoteActionCompatParcelizer(bitmap) <= this.read && this.serializer.contains(bitmap.getConfig())) {
                        this.write.getClass();
                        int iRemoteActionCompatParcelizer = Fill.RemoteActionCompatParcelizer(bitmap);
                        this.write.read(bitmap);
                        this.MediaMetadataCompat.getClass();
                        this.RemoteActionCompatParcelizer += (long) iRemoteActionCompatParcelizer;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            this.write.getClass();
                            TransferParametersKt.serializer(Fill.RemoteActionCompatParcelizer(bitmap), bitmap.getConfig());
                        }
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Objects.toString(this.write);
                        }
                        read(this.read);
                        return;
                    }
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.write.getClass();
                    TransferParametersKt.serializer(Fill.RemoteActionCompatParcelizer(bitmap), bitmap.getConfig());
                    bitmap.isMutable();
                    this.serializer.contains(bitmap.getConfig());
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.getD
    public final Bitmap read(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapIconCompatParcelizer = IconCompatParcelizer(i, i2, config);
        if (bitmapIconCompatParcelizer != null) {
            return bitmapIconCompatParcelizer;
        }
        if (config == null) {
            config = IconCompatParcelizer;
        }
        return Bitmap.createBitmap(i, i2, config);
    }
}
