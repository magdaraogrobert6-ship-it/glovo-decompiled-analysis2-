package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.TuplesKt;
import kotlin.ranges.RangesKt;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class GifDrawableTransformation implements RegistryNoSourceEncoderAvailableException {
    public final RegistryMissingComponentException bufferField;
    public boolean closed;
    public final ItemSingleChoiceBinding source;

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final RegistryMissingComponentException MediaSessionCompatQueueItem() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.closed;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final short ComponentActivity() {
        MediaMetadataCompat(2L);
        return this.bufferField.ComponentActivity();
    }

    public final int IconCompatParcelizer() throws EOFException {
        MediaMetadataCompat(4L);
        int iMediaSessionCompatResultReceiverWrapper = this.bufferField.MediaSessionCompatResultReceiverWrapper();
        return ((iMediaSessionCompatResultReceiverWrapper & 65280) << 8) | (((-16777216) & iMediaSessionCompatResultReceiverWrapper) >>> 24) | ((16711680 & iMediaSessionCompatResultReceiverWrapper) >>> 8) | ((iMediaSessionCompatResultReceiverWrapper & 255) << 24);
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final void IconCompatParcelizer(byte[] bArr) throws EOFException {
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        bArr.getClass();
        try {
            MediaMetadataCompat(bArr.length);
            registryMissingComponentException.IconCompatParcelizer(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = registryMissingComponentException.size;
                if (j <= 0) {
                    throw e;
                }
                int iSerializer = registryMissingComponentException.serializer(bArr, i, (int) j);
                if (iSerializer == -1) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                    return;
                }
                i += iSerializer;
            }
        }
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final byte MediaBrowserCompatMediaItem() {
        MediaMetadataCompat(1L);
        return this.bufferField.MediaBrowserCompatMediaItem();
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final GifDrawableTransformation MediaDescriptionCompat() {
        return new GifDrawableTransformation(new GifFrameLoader(this));
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final int MediaSessionCompatResultReceiverWrapper() {
        MediaMetadataCompat(4L);
        return this.bufferField.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long ParcelableVolumeInfo() {
        MediaMetadataCompat(8L);
        return this.bufferField.ParcelableVolumeInfo();
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final byte[] PlaybackStateCompat() {
        ItemSingleChoiceBinding itemSingleChoiceBinding = this.source;
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        registryMissingComponentException.IconCompatParcelizer(itemSingleChoiceBinding);
        return registryMissingComponentException.read(registryMissingComponentException.size);
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long PlaybackStateCompatCustomAction() {
        RegistryMissingComponentException registryMissingComponentException;
        MediaMetadataCompat(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zWrite = write(i2);
            registryMissingComponentException = this.bufferField;
            if (!zWrite) {
                break;
            }
            byte bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(i);
            if ((bIconCompatParcelizer < 48 || bIconCompatParcelizer > 57) && ((bIconCompatParcelizer < 97 || bIconCompatParcelizer > 102) && (bIconCompatParcelizer < 65 || bIconCompatParcelizer > 70))) {
                if (i != 0) {
                    break;
                }
                TuplesKt.RemoteActionCompatParcelizer(16);
                String string = Integer.toString(bIconCompatParcelizer, 16);
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return registryMissingComponentException.PlaybackStateCompatCustomAction();
    }

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.source.RemoteActionCompatParcelizer();
    }

    public final short read() {
        MediaMetadataCompat(2L);
        return this.bufferField.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
    }

    public final long write() throws EOFException {
        MediaMetadataCompat(8L);
        long jParcelableVolumeInfo = this.bufferField.ParcelableVolumeInfo();
        return ((jParcelableVolumeInfo & 65280) << 40) | (((-72057594037927936L) & jParcelableVolumeInfo) >>> 56) | ((71776119061217280L & jParcelableVolumeInfo) >>> 40) | ((280375465082880L & jParcelableVolumeInfo) >>> 24) | ((1095216660480L & jParcelableVolumeInfo) >>> 8) | ((4278190080L & jParcelableVolumeInfo) << 8) | ((16711680 & jParcelableVolumeInfo) << 24) | ((255 & jParcelableVolumeInfo) << 56);
    }

    public GifDrawableTransformation(ItemSingleChoiceBinding itemSingleChoiceBinding) {
        itemSingleChoiceBinding.getClass();
        this.source = itemSingleChoiceBinding;
        this.bufferField = new RegistryMissingComponentException();
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final String IconCompatParcelizer(Charset charset) {
        charset.getClass();
        ItemSingleChoiceBinding itemSingleChoiceBinding = this.source;
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        registryMissingComponentException.IconCompatParcelizer(itemSingleChoiceBinding);
        return registryMissingComponentException.read(registryMissingComponentException.size, charset);
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final InputStream MediaMetadataCompat() {
        return new Glide(this, 1);
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long RemoteActionCompatParcelizer(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        RegistryMissingComponentException registryMissingComponentException;
        long j = 0;
        while (true) {
            ItemSingleChoiceBinding itemSingleChoiceBinding = this.source;
            registryMissingComponentException = this.bufferField;
            if (itemSingleChoiceBinding.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1) {
                break;
            }
            long jIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer();
            if (jIconCompatParcelizer > 0) {
                j += jIconCompatParcelizer;
                registryNoImageHeaderParserException.write(registryMissingComponentException, jIconCompatParcelizer);
            }
        }
        long j2 = registryMissingComponentException.size;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        registryNoImageHeaderParserException.write(registryMissingComponentException, j2);
        return j3;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final RequestBuilder RemoteActionCompatParcelizer(long j) {
        MediaMetadataCompat(j);
        return this.bufferField.RemoteActionCompatParcelizer(j);
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final boolean RemoteActionCompatParcelizer(long j, RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        int iSerializer = requestBuilder.serializer();
        if (!this.closed) {
            return iSerializer >= 0 && iSerializer <= requestBuilder.serializer() && (iSerializer == 0 || RangesKt.serializer(this, requestBuilder, iSerializer, 1L) != -1);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return false;
    }

    public final String read(long j) {
        MediaMetadataCompat(j);
        return this.bufferField.read(j, ensureSubscribedToInAppMessageEvents.write);
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final int serializer(Options options) throws EOFException {
        RegistryMissingComponentException registryMissingComponentException;
        options.getClass();
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0;
        }
        do {
            registryMissingComponentException = this.bufferField;
            int iRemoteActionCompatParcelizer = ApiErrorV3Companion.RemoteActionCompatParcelizer(registryMissingComponentException, options, true);
            if (iRemoteActionCompatParcelizer != -2) {
                if (iRemoteActionCompatParcelizer == -1) {
                    break;
                }
                registryMissingComponentException.RatingCompat(options.read[iRemoteActionCompatParcelizer].serializer());
                return iRemoteActionCompatParcelizer;
            }
        } while (this.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) != -1);
        return -1;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long write(RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        long jMax = 0;
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        while (true) {
            RegistryMissingComponentException registryMissingComponentException = this.bufferField;
            long jSerializer = registryMissingComponentException.serializer(jMax, requestBuilder);
            if (jSerializer != -1) {
                return jSerializer;
            }
            long j = registryMissingComponentException.size;
            if (this.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    public final String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final boolean RatingCompat() {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return false;
        }
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        return registryMissingComponentException.RatingCompat() && this.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.serializer();
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final void MediaMetadataCompat(long j) {
        if (write(j)) {
            return;
        }
        DrawableTransformation.IconCompatParcelizer();
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final boolean write(long j) {
        RegistryMissingComponentException registryMissingComponentException;
        if (j >= 0) {
            if (this.closed) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
                return false;
            }
            do {
                registryMissingComponentException = this.bufferField;
                if (registryMissingComponentException.size >= j) {
                    return true;
                }
            } while (this.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) != -1);
            return false;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
        return false;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        registryMissingComponentException.getClass();
        if (j < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        RegistryMissingComponentException registryMissingComponentException2 = this.bufferField;
        if (registryMissingComponentException2.size == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.source.RemoteActionCompatParcelizer(registryMissingComponentException2, 8192L) == -1) {
                return -1L;
            }
        }
        return registryMissingComponentException2.RemoteActionCompatParcelizer(registryMissingComponentException, Math.min(j, registryMissingComponentException2.size));
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final void RatingCompat(long j) throws EOFException {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return;
        }
        while (j > 0) {
            RegistryMissingComponentException registryMissingComponentException = this.bufferField;
            if (registryMissingComponentException.size == 0 && this.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1) {
                DrawableTransformation.IconCompatParcelizer();
                return;
            } else {
                long jMin = Math.min(j, registryMissingComponentException.size);
                registryMissingComponentException.RatingCompat(jMin);
                j -= jMin;
            }
        }
    }

    public final long write(byte b, long j, long j2) {
        long jMax = 0;
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        if (0 > j2) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        while (jMax < j2) {
            RegistryMissingComponentException registryMissingComponentException = this.bufferField;
            long jWrite = registryMissingComponentException.write(b, jMax, j2);
            if (jWrite != -1) {
                return jWrite;
            }
            long j3 = registryMissingComponentException.size;
            if (j3 >= j2 || this.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final String serializer(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long jWrite = write((byte) 10, 0L, j2);
            RegistryMissingComponentException registryMissingComponentException = this.bufferField;
            if (jWrite != -1) {
                return ApiErrorV3Companion.RemoteActionCompatParcelizer(registryMissingComponentException, jWrite);
            }
            if (j2 < Long.MAX_VALUE && write(j2) && registryMissingComponentException.IconCompatParcelizer(j2 - 1) == 13 && write(1 + j2) && registryMissingComponentException.IconCompatParcelizer(j2) == 10) {
                return ApiErrorV3Companion.RemoteActionCompatParcelizer(registryMissingComponentException, j2);
            }
            RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
            registryMissingComponentException.IconCompatParcelizer(registryMissingComponentException2, 0L, Math.min(32L, registryMissingComponentException.size));
            DrawableTransformation.IconCompatParcelizer(Math.min(registryMissingComponentException.size, j), registryMissingComponentException2.RemoteActionCompatParcelizer(registryMissingComponentException2.size).IconCompatParcelizer());
            return null;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "limit < 0: "));
        return null;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final void IconCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws EOFException {
        RegistryMissingComponentException registryMissingComponentException2 = this.bufferField;
        try {
            MediaMetadataCompat(j);
            registryMissingComponentException2.IconCompatParcelizer(registryMissingComponentException, j);
        } catch (EOFException e) {
            registryMissingComponentException.IconCompatParcelizer(registryMissingComponentException2);
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        if (registryMissingComponentException.size == 0 && this.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1) {
            return -1;
        }
        return registryMissingComponentException.read(byteBuffer);
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long RemoteActionCompatParcelizer(RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        return RangesKt.serializer(this, requestBuilder, requestBuilder.serializer(), Long.MAX_VALUE);
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final String ResultReceiver() {
        return serializer(Long.MAX_VALUE);
    }
}
