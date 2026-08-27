package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class RegistryMissingComponentException implements RegistryNoSourceEncoderAvailableException, RegistryNoImageHeaderParserException, Cloneable, ByteChannel {
    public SVGParseException head;
    public long size;

    public final void MediaBrowserCompatMediaItem(int i) {
        SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(2);
        byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
        int i2 = sVGParseExceptionRemoteActionCompatParcelizer.limit;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        sVGParseExceptionRemoteActionCompatParcelizer.limit = i2 + 2;
        this.size += 2;
    }

    public final void MediaMetadataCompat(int i) {
        SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(4);
        byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
        int i2 = sVGParseExceptionRemoteActionCompatParcelizer.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        sVGParseExceptionRemoteActionCompatParcelizer.limit = i2 + 4;
        this.size += 4;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final RegistryMissingComponentException MediaSessionCompatQueueItem() {
        return this;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final boolean RatingCompat() {
        return this.size == 0;
    }

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return ApiErrorResponseCompanion.PlaybackStateCompat;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.DateTimeConverter
    public final void close() {
    }

    @Override // o.RegistryNoImageHeaderParserException, o.DateTimeConverter, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final short r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() throws EOFException {
        short sComponentActivity = ComponentActivity();
        return (short) (((sComponentActivity & 65280) >>> 8) | ((sComponentActivity & 255) << 8));
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException read() {
        return this;
    }

    public final void read(int i) {
        SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1);
        byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
        int i2 = sVGParseExceptionRemoteActionCompatParcelizer.limit;
        sVGParseExceptionRemoteActionCompatParcelizer.limit = i2 + 1;
        bArr[i2] = (byte) i;
        this.size++;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final boolean write(long j) {
        return this.size >= j;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final GifDrawableTransformation MediaDescriptionCompat() {
        return new GifDrawableTransformation(new GifFrameLoader(this));
    }

    public final long MediaSessionCompatToken() {
        if (this.size == 0) {
            DrawableTransformation.IconCompatParcelizer();
            return 0L;
        }
        boolean z = false;
        int i = 0;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            SVGParseException sVGParseException = this.head;
            sVGParseException.getClass();
            byte[] bArr = sVGParseException.data;
            int i2 = sVGParseException.pos;
            int i3 = sVGParseException.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                        registryMissingComponentException.MediaBrowserCompatMediaItem(j);
                        registryMissingComponentException.read((int) b);
                        if (!z2) {
                            registryMissingComponentException.MediaBrowserCompatMediaItem();
                        }
                        throw new NumberFormatException("Number too large: ".concat(registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        z = true;
                        break;
                    }
                    j2--;
                    z2 = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.head = sVGParseException.read();
                ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
            } else {
                sVGParseException.pos = i2;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        long j3 = this.size - ((long) i);
        this.size = j3;
        if (i >= (z2 ? 2 : 1)) {
            return z2 ? j : -j;
        }
        if (j3 == 0) {
            DrawableTransformation.IconCompatParcelizer();
            return 0L;
        }
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(z2 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbM.append(setOptionalTextView.write(IconCompatParcelizer(0L)));
        throw new NumberFormatException(sbM.toString());
    }

    public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return read(this.size, ensureSubscribedToInAppMessageEvents.write);
    }

    public final void serializer() throws EOFException {
        RatingCompat(this.size);
    }

    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final RegistryMissingComponentException clone() {
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        if (this.size == 0) {
            return registryMissingComponentException;
        }
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        SVGParseException sVGParseExceptionSerializer = sVGParseException.serializer();
        registryMissingComponentException.head = sVGParseExceptionSerializer;
        sVGParseExceptionSerializer.prev = sVGParseExceptionSerializer;
        sVGParseExceptionSerializer.next = sVGParseExceptionSerializer;
        for (SVGParseException sVGParseException2 = sVGParseException.next; sVGParseException2 != sVGParseException; sVGParseException2 = sVGParseException2.next) {
            SVGParseException sVGParseException3 = sVGParseExceptionSerializer.prev;
            sVGParseException3.getClass();
            sVGParseException2.getClass();
            sVGParseException3.IconCompatParcelizer(sVGParseException2.serializer());
        }
        registryMissingComponentException.size = this.size;
        return registryMissingComponentException;
    }

    public final RequestBuilder write(int i) {
        if (i == 0) {
            return RequestBuilder.EMPTY;
        }
        setOptionalTextView.RemoteActionCompatParcelizer(this.size, 0L, i);
        SVGParseException sVGParseException = this.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            sVGParseException.getClass();
            int i5 = sVGParseException.limit;
            int i6 = sVGParseException.pos;
            if (i5 == i6) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            sVGParseException = sVGParseException.next;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        SVGParseException sVGParseException2 = this.head;
        int i7 = 0;
        while (i2 < i) {
            sVGParseException2.getClass();
            bArr[i7] = sVGParseException2.data;
            i2 += sVGParseException2.limit - sVGParseException2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = sVGParseException2.pos;
            sVGParseException2.shared = true;
            i7++;
            sVGParseException2 = sVGParseException2.next;
        }
        return new LayoutTileBinding(bArr, iArr);
    }

    public final void IconCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j, long j2) {
        registryMissingComponentException.getClass();
        setOptionalTextView.RemoteActionCompatParcelizer(this.size, j, j2);
        if (j2 == 0) {
            return;
        }
        registryMissingComponentException.size += j2;
        SVGParseException sVGParseException = this.head;
        while (true) {
            sVGParseException.getClass();
            long j3 = sVGParseException.limit - sVGParseException.pos;
            if (j < j3) {
                break;
            }
            j -= j3;
            sVGParseException = sVGParseException.next;
        }
        while (j2 > 0) {
            sVGParseException.getClass();
            SVGParseException sVGParseExceptionSerializer = sVGParseException.serializer();
            int i = sVGParseExceptionSerializer.pos + ((int) j);
            sVGParseExceptionSerializer.pos = i;
            sVGParseExceptionSerializer.limit = Math.min(i + ((int) j2), sVGParseExceptionSerializer.limit);
            SVGParseException sVGParseException2 = registryMissingComponentException.head;
            if (sVGParseException2 == null) {
                sVGParseExceptionSerializer.prev = sVGParseExceptionSerializer;
                sVGParseExceptionSerializer.next = sVGParseExceptionSerializer;
                registryMissingComponentException.head = sVGParseExceptionSerializer;
            } else {
                SVGParseException sVGParseException3 = sVGParseException2.prev;
                sVGParseException3.getClass();
                sVGParseException3.IconCompatParcelizer(sVGParseExceptionSerializer);
            }
            j2 -= (long) (sVGParseExceptionSerializer.limit - sVGParseExceptionSerializer.pos);
            sVGParseException = sVGParseException.next;
            j = 0;
        }
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final InputStream MediaMetadataCompat() {
        return new Glide(this, 0);
    }

    public final int serializer(byte[] bArr, int i, int i2) {
        bArr.getClass();
        setOptionalTextView.RemoteActionCompatParcelizer(bArr.length, i, i2);
        SVGParseException sVGParseException = this.head;
        if (sVGParseException == null) {
            return -1;
        }
        int iMin = Math.min(i2, sVGParseException.limit - sVGParseException.pos);
        byte[] bArr2 = sVGParseException.data;
        int i3 = sVGParseException.pos;
        onContentCardClicked.write(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = sVGParseException.pos + iMin;
        sVGParseException.pos = i4;
        this.size -= (long) iMin;
        if (i4 == sVGParseException.limit) {
            this.head = sVGParseException.read();
            ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
        }
        return iMin;
    }

    public final Registry write(Registry registry) {
        registry.getClass();
        byte[] bArr = ApiErrorV3Companion.serializer;
        if (registry == setOptionalTextView.RemoteActionCompatParcelizer) {
            registry = new Registry();
        }
        if (registry.IconCompatParcelizer != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("already attached to a buffer");
            return null;
        }
        registry.IconCompatParcelizer = this;
        registry.write = true;
        return registry;
    }

    public final void write(OutputStream outputStream, long j) throws IOException {
        outputStream.getClass();
        setOptionalTextView.RemoteActionCompatParcelizer(this.size, 0L, j);
        SVGParseException sVGParseException = this.head;
        while (j > 0) {
            sVGParseException.getClass();
            int iMin = (int) Math.min(j, sVGParseException.limit - sVGParseException.pos);
            outputStream.write(sVGParseException.data, sVGParseException.pos, iMin);
            int i = sVGParseException.pos + iMin;
            sVGParseException.pos = i;
            long j2 = iMin;
            this.size -= j2;
            j -= j2;
            if (i == sVGParseException.limit) {
                SVGParseException sVGParseException2 = sVGParseException.read();
                this.head = sVGParseException2;
                ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
                sVGParseException = sVGParseException2;
            }
        }
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final void IconCompatParcelizer(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int iSerializer = serializer(bArr, i, bArr.length - i);
            if (iSerializer == -1) {
                DrawableTransformation.IconCompatParcelizer();
                return;
            }
            i += iSerializer;
        }
    }

    public final void RatingCompat(int i) {
        if (i < 128) {
            read(i);
            return;
        }
        if (i < 2048) {
            SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(2);
            byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
            int i2 = sVGParseExceptionRemoteActionCompatParcelizer.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            sVGParseExceptionRemoteActionCompatParcelizer.limit = i2 + 2;
            this.size += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            read(63);
            return;
        }
        if (i < 65536) {
            SVGParseException sVGParseExceptionRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(3);
            byte[] bArr2 = sVGParseExceptionRemoteActionCompatParcelizer2.data;
            int i3 = sVGParseExceptionRemoteActionCompatParcelizer2.limit;
            bArr2[i3] = (byte) ((i >> 12) | Constant.ERROR_WSS_INVALID);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            bArr2[i3 + 2] = (byte) ((i & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            sVGParseExceptionRemoteActionCompatParcelizer2.limit = i3 + 3;
            this.size += 3;
            return;
        }
        if (i <= 1114111) {
            SVGParseException sVGParseExceptionRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(4);
            byte[] bArr3 = sVGParseExceptionRemoteActionCompatParcelizer3.data;
            int i4 = sVGParseExceptionRemoteActionCompatParcelizer3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            bArr3[i4 + 3] = (byte) ((i & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            sVGParseExceptionRemoteActionCompatParcelizer3.limit = i4 + 4;
            this.size += 4;
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected code point: 0x".concat(setOptionalTextView.IconCompatParcelizer(i)));
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final int serializer(Options options) throws EOFException {
        options.getClass();
        int iRemoteActionCompatParcelizer = ApiErrorV3Companion.RemoteActionCompatParcelizer(this, options, false);
        if (iRemoteActionCompatParcelizer == -1) {
            return -1;
        }
        RatingCompat(options.read[iRemoteActionCompatParcelizer].serializer());
        return iRemoteActionCompatParcelizer;
    }

    public final String toString() {
        return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg().toString();
    }

    public final byte IconCompatParcelizer(long j) {
        setOptionalTextView.RemoteActionCompatParcelizer(this.size, j, 1L);
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        long j2 = this.size;
        if (j2 - j < j) {
            while (j2 > j) {
                sVGParseException = sVGParseException.prev;
                sVGParseException.getClass();
                j2 -= (long) (sVGParseException.limit - sVGParseException.pos);
            }
            return sVGParseException.data[(int) ((((long) sVGParseException.pos) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = sVGParseException.limit;
            int i2 = sVGParseException.pos;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return sVGParseException.data[(int) ((((long) i2) + j) - j3)];
            }
            sVGParseException = sVGParseException.next;
            sVGParseException.getClass();
            j3 = j4;
        }
    }

    @Override // o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) {
        SVGParseException sVGParseExceptionIconCompatParcelizer;
        registryMissingComponentException.getClass();
        if (registryMissingComponentException == this) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source == this");
            return;
        }
        setOptionalTextView.RemoteActionCompatParcelizer(registryMissingComponentException.size, 0L, j);
        while (j > 0) {
            SVGParseException sVGParseException = registryMissingComponentException.head;
            sVGParseException.getClass();
            int i = sVGParseException.limit;
            SVGParseException sVGParseException2 = registryMissingComponentException.head;
            sVGParseException2.getClass();
            long j2 = i - sVGParseException2.pos;
            int i2 = 0;
            if (j < j2) {
                SVGParseException sVGParseException3 = this.head;
                SVGParseException sVGParseException4 = sVGParseException3 != null ? sVGParseException3.prev : null;
                if (sVGParseException4 != null && sVGParseException4.owner) {
                    if ((((long) sVGParseException4.limit) + j) - ((long) (sVGParseException4.shared ? 0 : sVGParseException4.pos)) <= 8192) {
                        SVGParseException sVGParseException5 = registryMissingComponentException.head;
                        sVGParseException5.getClass();
                        sVGParseException5.RemoteActionCompatParcelizer(sVGParseException4, (int) j);
                        registryMissingComponentException.size -= j;
                        this.size += j;
                        return;
                    }
                }
                SVGParseException sVGParseException6 = registryMissingComponentException.head;
                sVGParseException6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > sVGParseException6.limit - sVGParseException6.pos) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    sVGParseExceptionIconCompatParcelizer = sVGParseException6.serializer();
                } else {
                    sVGParseExceptionIconCompatParcelizer = ApiErrorCompanion.IconCompatParcelizer();
                    byte[] bArr = sVGParseException6.data;
                    byte[] bArr2 = sVGParseExceptionIconCompatParcelizer.data;
                    int i4 = sVGParseException6.pos;
                    onContentCardClicked.IconCompatParcelizer(bArr, i4, bArr2, i4 + i3, 2);
                }
                sVGParseExceptionIconCompatParcelizer.limit = sVGParseExceptionIconCompatParcelizer.pos + i3;
                sVGParseException6.pos += i3;
                SVGParseException sVGParseException7 = sVGParseException6.prev;
                sVGParseException7.getClass();
                sVGParseException7.IconCompatParcelizer(sVGParseExceptionIconCompatParcelizer);
                registryMissingComponentException.head = sVGParseExceptionIconCompatParcelizer;
            }
            SVGParseException sVGParseException8 = registryMissingComponentException.head;
            sVGParseException8.getClass();
            long j3 = sVGParseException8.limit - sVGParseException8.pos;
            registryMissingComponentException.head = sVGParseException8.read();
            SVGParseException sVGParseException9 = this.head;
            if (sVGParseException9 == null) {
                this.head = sVGParseException8;
                sVGParseException8.prev = sVGParseException8;
                sVGParseException8.next = sVGParseException8;
            } else {
                SVGParseException sVGParseException10 = sVGParseException9.prev;
                sVGParseException10.getClass();
                sVGParseException10.IconCompatParcelizer(sVGParseException8);
                SVGParseException sVGParseException11 = sVGParseException8.prev;
                if (sVGParseException11 == sVGParseException8) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("cannot compact");
                    return;
                }
                sVGParseException11.getClass();
                if (sVGParseException11.owner) {
                    int i5 = sVGParseException8.limit - sVGParseException8.pos;
                    SVGParseException sVGParseException12 = sVGParseException8.prev;
                    sVGParseException12.getClass();
                    int i6 = sVGParseException12.limit;
                    SVGParseException sVGParseException13 = sVGParseException8.prev;
                    sVGParseException13.getClass();
                    if (!sVGParseException13.shared) {
                        SVGParseException sVGParseException14 = sVGParseException8.prev;
                        sVGParseException14.getClass();
                        i2 = sVGParseException14.pos;
                    }
                    if (i5 <= (8192 - i6) + i2) {
                        SVGParseException sVGParseException15 = sVGParseException8.prev;
                        sVGParseException15.getClass();
                        sVGParseException8.RemoteActionCompatParcelizer(sVGParseException15, i5);
                        sVGParseException8.read();
                        ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException8);
                    }
                }
            }
            registryMissingComponentException.size -= j3;
            this.size += j3;
            j -= j3;
        }
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final void RatingCompat(long j) throws EOFException {
        while (j > 0) {
            SVGParseException sVGParseException = this.head;
            if (sVGParseException != null) {
                int iMin = (int) Math.min(j, sVGParseException.limit - sVGParseException.pos);
                long j2 = iMin;
                this.size -= j2;
                j -= j2;
                int i = sVGParseException.pos + iMin;
                sVGParseException.pos = i;
                if (i == sVGParseException.limit) {
                    this.head = sVGParseException.read();
                    ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
                }
            } else {
                DrawableTransformation.IconCompatParcelizer();
                return;
            }
        }
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final long IconCompatParcelizer(ItemSingleChoiceBinding itemSingleChoiceBinding) {
        itemSingleChoiceBinding.getClass();
        long j = 0;
        while (true) {
            long jRemoteActionCompatParcelizer = itemSingleChoiceBinding.RemoteActionCompatParcelizer(this, 8192L);
            if (jRemoteActionCompatParcelizer == -1) {
                return j;
            }
            j += jRemoteActionCompatParcelizer;
        }
    }

    public final void IconCompatParcelizer(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i2, "endIndex < beginIndex: ", i, " < "));
            return;
        }
        if (i2 > str.length()) {
            DrawableTransformation.write(str.length(), ff$$ExternalSyntheticOutline0.m(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1);
                byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
                int i3 = sVGParseExceptionRemoteActionCompatParcelizer.limit - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = sVGParseExceptionRemoteActionCompatParcelizer.limit;
                int i6 = (i3 + i) - i5;
                sVGParseExceptionRemoteActionCompatParcelizer.limit = i5 + i6;
                this.size += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    SVGParseException sVGParseExceptionRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(2);
                    byte[] bArr2 = sVGParseExceptionRemoteActionCompatParcelizer2.data;
                    int i7 = sVGParseExceptionRemoteActionCompatParcelizer2.limit;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    sVGParseExceptionRemoteActionCompatParcelizer2.limit = i7 + 2;
                    this.size += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    SVGParseException sVGParseExceptionRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(3);
                    byte[] bArr3 = sVGParseExceptionRemoteActionCompatParcelizer3.data;
                    int i8 = sVGParseExceptionRemoteActionCompatParcelizer3.limit;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | Constant.ERROR_WSS_INVALID);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    sVGParseExceptionRemoteActionCompatParcelizer3.limit = i8 + 3;
                    this.size += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        read(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        SVGParseException sVGParseExceptionRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(4);
                        byte[] bArr4 = sVGParseExceptionRemoteActionCompatParcelizer4.data;
                        int i11 = sVGParseExceptionRemoteActionCompatParcelizer4.limit;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                        sVGParseExceptionRemoteActionCompatParcelizer4.limit = i11 + 4;
                        this.size += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final void MediaMetadataCompat(long j) throws EOFException {
        if (this.size >= j) {
            return;
        }
        DrawableTransformation.IconCompatParcelizer();
    }

    public final SVGParseException RemoteActionCompatParcelizer(int i) {
        if (i >= 1 && i <= 8192) {
            SVGParseException sVGParseException = this.head;
            if (sVGParseException == null) {
                SVGParseException sVGParseExceptionIconCompatParcelizer = ApiErrorCompanion.IconCompatParcelizer();
                this.head = sVGParseExceptionIconCompatParcelizer;
                sVGParseExceptionIconCompatParcelizer.prev = sVGParseExceptionIconCompatParcelizer;
                sVGParseExceptionIconCompatParcelizer.next = sVGParseExceptionIconCompatParcelizer;
                return sVGParseExceptionIconCompatParcelizer;
            }
            SVGParseException sVGParseException2 = sVGParseException.prev;
            sVGParseException2.getClass();
            if (sVGParseException2.limit + i <= 8192 && sVGParseException2.owner) {
                return sVGParseException2;
            }
            SVGParseException sVGParseExceptionIconCompatParcelizer2 = ApiErrorCompanion.IconCompatParcelizer();
            sVGParseException2.IconCompatParcelizer(sVGParseExceptionIconCompatParcelizer2);
            return sVGParseExceptionIconCompatParcelizer2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unexpected capacity");
        return null;
    }

    public final int hashCode() {
        SVGParseException sVGParseException = this.head;
        if (sVGParseException == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = sVGParseException.limit;
            for (int i3 = sVGParseException.pos; i3 < i2; i3++) {
                i = (i * 31) + sVGParseException.data[i3];
            }
            sVGParseException = sVGParseException.next;
            sVGParseException.getClass();
        } while (sVGParseException != this.head);
        return i;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final short ComponentActivity() throws EOFException {
        if (this.size < 2) {
            DrawableTransformation.IconCompatParcelizer();
            return (short) 0;
        }
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        int i = sVGParseException.pos;
        int i2 = sVGParseException.limit;
        if (i2 - i < 2) {
            return (short) (((MediaBrowserCompatMediaItem() & 255) << 8) | (MediaBrowserCompatMediaItem() & 255));
        }
        byte[] bArr = sVGParseException.data;
        byte b = bArr[i];
        int i3 = i + 2;
        byte b2 = bArr[i + 1];
        this.size -= 2;
        if (i3 == i2) {
            this.head = sVGParseException.read();
            ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
        } else {
            sVGParseException.pos = i3;
        }
        return (short) ((b2 & 255) | ((b & 255) << 8));
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final byte MediaBrowserCompatMediaItem() {
        if (this.size == 0) {
            DrawableTransformation.IconCompatParcelizer();
            return (byte) 0;
        }
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        int i = sVGParseException.pos;
        int i2 = sVGParseException.limit;
        int i3 = i + 1;
        byte b = sVGParseException.data[i];
        this.size--;
        if (i3 != i2) {
            sVGParseException.pos = i3;
            return b;
        }
        this.head = sVGParseException.read();
        ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
        return b;
    }

    public final void MediaBrowserCompatMediaItem(long j) {
        boolean z;
        if (j == 0) {
            read(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                IconCompatParcelizer("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = ApiErrorV3Companion.serializer;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > ApiErrorV3Companion.read[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        byte[] bArr2 = sVGParseExceptionRemoteActionCompatParcelizer.data;
        int i2 = sVGParseExceptionRemoteActionCompatParcelizer.limit + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = ApiErrorV3Companion.serializer[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        sVGParseExceptionRemoteActionCompatParcelizer.limit += i;
        this.size += (long) i;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final int MediaSessionCompatResultReceiverWrapper() throws EOFException {
        if (this.size < 4) {
            DrawableTransformation.IconCompatParcelizer();
            return 0;
        }
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        int i = sVGParseException.pos;
        int i2 = sVGParseException.limit;
        if (i2 - i < 4) {
            return ((MediaBrowserCompatMediaItem() & 255) << 24) | ((MediaBrowserCompatMediaItem() & 255) << 16) | ((MediaBrowserCompatMediaItem() & 255) << 8) | (MediaBrowserCompatMediaItem() & 255);
        }
        byte[] bArr = sVGParseException.data;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        this.size -= 4;
        if (i3 != i2) {
            sVGParseException.pos = i3;
            return i4;
        }
        this.head = sVGParseException.read();
        ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
        return i4;
    }

    public final void MediaSessionCompatResultReceiverWrapper(long j) {
        if (j == 0) {
            read(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
        int i2 = sVGParseExceptionRemoteActionCompatParcelizer.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = ApiErrorV3Companion.serializer[(int) (15 & j)];
            j >>>= 4;
        }
        sVGParseExceptionRemoteActionCompatParcelizer.limit += i;
        this.size += (long) i;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long ParcelableVolumeInfo() throws EOFException {
        if (this.size < 8) {
            DrawableTransformation.IconCompatParcelizer();
            return 0L;
        }
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        int i = sVGParseException.pos;
        int i2 = sVGParseException.limit;
        if (i2 - i < 8) {
            return ((((long) MediaSessionCompatResultReceiverWrapper()) & 4294967295L) << 32) | (((long) MediaSessionCompatResultReceiverWrapper()) & 4294967295L);
        }
        byte[] bArr = sVGParseException.data;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i3 = i + 8;
        long j7 = ((bArr[i + 6] & 255) << 8) | ((j5 & 255) << 24) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j6 & 255) << 16) | (bArr[i + 7] & 255);
        this.size -= 8;
        if (i3 != i2) {
            sVGParseException.pos = i3;
            return j7;
        }
        this.head = sVGParseException.read();
        ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
        return j7;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long RemoteActionCompatParcelizer(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        long j = this.size;
        if (j > 0) {
            registryNoImageHeaderParserException.write(this, j);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegistryMissingComponentException)) {
            return false;
        }
        long j = this.size;
        RegistryMissingComponentException registryMissingComponentException = (RegistryMissingComponentException) obj;
        if (j != registryMissingComponentException.size) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        SVGParseException sVGParseException2 = registryMissingComponentException.head;
        sVGParseException2.getClass();
        int i = sVGParseException.pos;
        int i2 = sVGParseException2.pos;
        long j3 = 0;
        while (j3 < this.size) {
            long jMin = Math.min(sVGParseException.limit - i, sVGParseException2.limit - i2);
            long j4 = j2;
            while (j4 < jMin) {
                if (sVGParseException.data[i] != sVGParseException2.data[i2]) {
                    return false;
                }
                j4++;
                i++;
                i2++;
            }
            if (i == sVGParseException.limit) {
                sVGParseException = sVGParseException.next;
                sVGParseException.getClass();
                i = sVGParseException.pos;
            }
            if (i2 == sVGParseException2.limit) {
                sVGParseException2 = sVGParseException2.next;
                sVGParseException2.getClass();
                i2 = sVGParseException2.pos;
            }
            j3 += jMin;
            j2 = 0;
        }
        return true;
    }

    public final long IconCompatParcelizer() {
        long j = this.size;
        if (j == 0) {
            return 0L;
        }
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        SVGParseException sVGParseException2 = sVGParseException.prev;
        sVGParseException2.getClass();
        int i = sVGParseException2.limit;
        return (i >= 8192 || !sVGParseException2.owner) ? j : j - ((long) (i - sVGParseException2.pos));
    }

    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i;
        int i2;
        int i3;
        if (this.size == 0) {
            DrawableTransformation.IconCompatParcelizer();
            return 0;
        }
        byte bIconCompatParcelizer = IconCompatParcelizer(0L);
        if ((bIconCompatParcelizer & 128) == 0) {
            i = bIconCompatParcelizer & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bIconCompatParcelizer & 224) == 192) {
            i = bIconCompatParcelizer & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bIconCompatParcelizer & 240) == 224) {
            i = bIconCompatParcelizer & 15;
            i2 = 3;
            i3 = androidx.compose.ui.graphics.Fields.CameraDistance;
        } else {
            if ((bIconCompatParcelizer & 248) != 240) {
                RatingCompat(1L);
                return 65533;
            }
            i = bIconCompatParcelizer & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.size < j) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i2, "size < ", ": ");
            sbM.append(this.size);
            sbM.append(" (to read code point prefixed 0x");
            sbM.append(setOptionalTextView.write(bIconCompatParcelizer));
            sbM.append(')');
            throw new EOFException(sbM.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bIconCompatParcelizer2 = IconCompatParcelizer(j2);
            if ((bIconCompatParcelizer2 & 192) != 128) {
                RatingCompat(j2);
                return 65533;
            }
            i = (i << 6) | (bIconCompatParcelizer2 & 63);
        }
        RatingCompat(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final long serializer(long j, RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        long j2 = 0;
        if (j < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "fromIndex < 0: "));
            return 0L;
        }
        SVGParseException sVGParseException = this.head;
        if (sVGParseException == null) {
            return -1L;
        }
        long j3 = this.size;
        if (j3 - j < j) {
            while (j3 > j) {
                sVGParseException = sVGParseException.prev;
                sVGParseException.getClass();
                j3 -= (long) (sVGParseException.limit - sVGParseException.pos);
            }
            if (requestBuilder.serializer() == 2) {
                byte bWrite = requestBuilder.write(0);
                byte bWrite2 = requestBuilder.write(1);
                while (j3 < this.size) {
                    byte[] bArr = sVGParseException.data;
                    int i = sVGParseException.limit;
                    for (int i2 = (int) ((((long) sVGParseException.pos) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bWrite || b == bWrite2) {
                            return ((long) (i2 - sVGParseException.pos)) + j3;
                        }
                    }
                    j3 += (long) (sVGParseException.limit - sVGParseException.pos);
                    sVGParseException = sVGParseException.next;
                    sVGParseException.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrRemoteActionCompatParcelizer = requestBuilder.RemoteActionCompatParcelizer();
                while (j3 < this.size) {
                    byte[] bArr2 = sVGParseException.data;
                    int i3 = sVGParseException.limit;
                    for (int i4 = (int) ((((long) sVGParseException.pos) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrRemoteActionCompatParcelizer) {
                            if (b2 == b3) {
                                return ((long) (i4 - sVGParseException.pos)) + j3;
                            }
                        }
                    }
                    j3 += (long) (sVGParseException.limit - sVGParseException.pos);
                    sVGParseException = sVGParseException.next;
                    sVGParseException.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (sVGParseException.limit - sVGParseException.pos)) + j2;
            if (j4 > j) {
                break;
            }
            sVGParseException = sVGParseException.next;
            sVGParseException.getClass();
            j2 = j4;
        }
        if (requestBuilder.serializer() == 2) {
            byte bWrite3 = requestBuilder.write(0);
            byte bWrite4 = requestBuilder.write(1);
            while (j2 < this.size) {
                byte[] bArr3 = sVGParseException.data;
                int i5 = sVGParseException.limit;
                for (int i6 = (int) ((((long) sVGParseException.pos) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bWrite3 || b4 == bWrite4) {
                        return ((long) (i6 - sVGParseException.pos)) + j2;
                    }
                }
                j2 += (long) (sVGParseException.limit - sVGParseException.pos);
                sVGParseException = sVGParseException.next;
                sVGParseException.getClass();
                j = j2;
            }
        } else {
            byte[] bArrRemoteActionCompatParcelizer2 = requestBuilder.RemoteActionCompatParcelizer();
            while (j2 < this.size) {
                byte[] bArr4 = sVGParseException.data;
                int i7 = sVGParseException.limit;
                for (int i8 = (int) ((((long) sVGParseException.pos) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrRemoteActionCompatParcelizer2) {
                        if (b5 == b6) {
                            return ((long) (i8 - sVGParseException.pos)) + j2;
                        }
                    }
                }
                j2 += (long) (sVGParseException.limit - sVGParseException.pos);
                sVGParseException = sVGParseException.next;
                sVGParseException.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    public final long write(byte b, long j, long j2) {
        SVGParseException sVGParseException;
        long j3 = 0;
        if (0 <= j && j <= j2) {
            long j4 = this.size;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j == j2 || (sVGParseException = this.head) == null) {
                return -1L;
            }
            if (j4 - j < j) {
                while (j4 > j) {
                    sVGParseException = sVGParseException.prev;
                    sVGParseException.getClass();
                    j4 -= (long) (sVGParseException.limit - sVGParseException.pos);
                }
                while (j4 < j2) {
                    byte[] bArr = sVGParseException.data;
                    int iMin = (int) Math.min(sVGParseException.limit, (((long) sVGParseException.pos) + j2) - j4);
                    for (int i = (int) ((((long) sVGParseException.pos) + j) - j4); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - sVGParseException.pos)) + j4;
                        }
                    }
                    j4 += (long) (sVGParseException.limit - sVGParseException.pos);
                    sVGParseException = sVGParseException.next;
                    sVGParseException.getClass();
                    j = j4;
                }
                return -1L;
            }
            while (true) {
                long j5 = ((long) (sVGParseException.limit - sVGParseException.pos)) + j3;
                if (j5 > j) {
                    break;
                }
                sVGParseException = sVGParseException.next;
                sVGParseException.getClass();
                j3 = j5;
            }
            while (j3 < j2) {
                byte[] bArr2 = sVGParseException.data;
                int iMin2 = (int) Math.min(sVGParseException.limit, (((long) sVGParseException.pos) + j2) - j3);
                for (int i2 = (int) ((((long) sVGParseException.pos) + j) - j3); i2 < iMin2; i2++) {
                    if (bArr2[i2] == b) {
                        return ((long) (i2 - sVGParseException.pos)) + j3;
                    }
                }
                j3 += (long) (sVGParseException.limit - sVGParseException.pos);
                sVGParseException = sVGParseException.next;
                sVGParseException.getClass();
                j = j3;
            }
            return -1L;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.size);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, " fromIndex=", j, " toIndex=");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long PlaybackStateCompatCustomAction() throws EOFException {
        int i;
        if (this.size == 0) {
            DrawableTransformation.IconCompatParcelizer();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            SVGParseException sVGParseException = this.head;
            sVGParseException.getClass();
            byte[] bArr = sVGParseException.data;
            int i3 = sVGParseException.pos;
            int i4 = sVGParseException.limit;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(setOptionalTextView.write(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                    registryMissingComponentException.MediaSessionCompatResultReceiverWrapper(j);
                    registryMissingComponentException.read((int) b);
                    throw new NumberFormatException("Number too large: ".concat(registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.head = sVGParseException.read();
                ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
            } else {
                sVGParseException.pos = i3;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        this.size -= (long) i2;
        return j;
    }

    public final byte[] read(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount: "));
            return null;
        }
        if (this.size >= j) {
            byte[] bArr = new byte[(int) j];
            IconCompatParcelizer(bArr);
            return bArr;
        }
        DrawableTransformation.IconCompatParcelizer();
        return null;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final RequestBuilder RemoteActionCompatParcelizer(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount: "));
            return null;
        }
        if (this.size < j) {
            DrawableTransformation.IconCompatParcelizer();
            return null;
        }
        if (j >= 4096) {
            RequestBuilder requestBuilderWrite = write((int) j);
            RatingCompat(j);
            return requestBuilderWrite;
        }
        return new RequestBuilder(read(j));
    }

    public final boolean read(int i, long j, RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.size && i <= requestBuilder.serializer()) {
            return i == 0 || ApiErrorV3Companion.write(this, requestBuilder, j, j + 1, i) != -1;
        }
        return false;
    }

    public final String read(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount: "));
            return null;
        }
        if (this.size < j) {
            DrawableTransformation.IconCompatParcelizer();
            return null;
        }
        if (j == 0) {
            return "";
        }
        SVGParseException sVGParseException = this.head;
        sVGParseException.getClass();
        int i = sVGParseException.pos;
        if (((long) i) + j > sVGParseException.limit) {
            return new String(read(j), charset);
        }
        int i2 = (int) j;
        String str = new String(sVGParseException.data, i, i2, charset);
        int i3 = sVGParseException.pos + i2;
        sVGParseException.pos = i3;
        this.size -= j;
        if (i3 == sVGParseException.limit) {
            this.head = sVGParseException.read();
            ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
        }
        return str;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final void IconCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws EOFException {
        long j2 = this.size;
        if (j2 >= j) {
            registryMissingComponentException.write(this, j);
        } else {
            registryMissingComponentException.write(this, j2);
            DrawableTransformation.IconCompatParcelizer();
        }
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException serializer(int i) {
        read(i);
        return this;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final String serializer(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long jWrite = write((byte) 10, 0L, j2);
            if (jWrite != -1) {
                return ApiErrorV3Companion.RemoteActionCompatParcelizer(this, jWrite);
            }
            if (j2 < this.size && IconCompatParcelizer(j2 - 1) == 13 && IconCompatParcelizer(j2) == 10) {
                return ApiErrorV3Companion.RemoteActionCompatParcelizer(this, j2);
            }
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            IconCompatParcelizer(registryMissingComponentException, 0L, Math.min(32L, this.size));
            DrawableTransformation.IconCompatParcelizer(Math.min(this.size, j), registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size).IconCompatParcelizer());
            return null;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "limit < 0: "));
        return null;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException MediaSessionCompatQueueItem(int i) {
        MediaBrowserCompatMediaItem(i);
        return this;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final byte[] PlaybackStateCompat() {
        return read(this.size);
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException IconCompatParcelizer(int i) {
        MediaMetadataCompat(i);
        return this;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final boolean RemoteActionCompatParcelizer(long j, RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        return read(requestBuilder.serializer(), j, requestBuilder);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        SVGParseException sVGParseException = this.head;
        if (sVGParseException == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), sVGParseException.limit - sVGParseException.pos);
        byteBuffer.put(sVGParseException.data, sVGParseException.pos, iMin);
        int i = sVGParseException.pos + iMin;
        sVGParseException.pos = i;
        this.size -= (long) iMin;
        if (i == sVGParseException.limit) {
            this.head = sVGParseException.read();
            ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
        }
        return iMin;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        registryMissingComponentException.getClass();
        if (j >= 0) {
            long j2 = this.size;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            registryMissingComponentException.write(this, j);
            return j;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
        return 0L;
    }

    public final RequestBuilder r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        long j = this.size;
        if (j <= 2147483647L) {
            return write((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + j).toString());
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final String IconCompatParcelizer(Charset charset) {
        charset.getClass();
        return read(this.size, charset);
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException MediaDescriptionCompat(long j) {
        MediaBrowserCompatMediaItem(j);
        return this;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final String ResultReceiver() {
        return serializer(Long.MAX_VALUE);
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException MediaSessionCompatQueueItem(long j) {
        MediaSessionCompatResultReceiverWrapper(j);
        return this;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long RemoteActionCompatParcelizer(RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        byte[] bArr = ApiErrorV3Companion.serializer;
        return ApiErrorV3Companion.write(this, requestBuilder, 0L, Long.MAX_VALUE, requestBuilder.serializer());
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException RemoteActionCompatParcelizer(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException IconCompatParcelizer(RequestBuilder requestBuilder) {
        serializer(requestBuilder);
        return this;
    }

    public final void serializer(RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        requestBuilder.serializer(this, requestBuilder.serializer());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1);
            int iMin = Math.min(i, 8192 - sVGParseExceptionRemoteActionCompatParcelizer.limit);
            byteBuffer.get(sVGParseExceptionRemoteActionCompatParcelizer.data, sVGParseExceptionRemoteActionCompatParcelizer.limit, iMin);
            i -= iMin;
            sVGParseExceptionRemoteActionCompatParcelizer.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        setOptionalTextView.RemoteActionCompatParcelizer(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1);
            int iMin = Math.min(i3 - i, 8192 - sVGParseExceptionRemoteActionCompatParcelizer.limit);
            int i4 = i + iMin;
            onContentCardClicked.write(bArr, sVGParseExceptionRemoteActionCompatParcelizer.limit, sVGParseExceptionRemoteActionCompatParcelizer.data, i, i4);
            sVGParseExceptionRemoteActionCompatParcelizer.limit += iMin;
            i = i4;
        }
        this.size += j;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException read(String str) {
        IconCompatParcelizer(str);
        return this;
    }

    public final void IconCompatParcelizer(String str) {
        str.getClass();
        IconCompatParcelizer(0, str.length(), str);
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final /* synthetic */ RegistryNoImageHeaderParserException write(int i, int i2, String str) {
        IconCompatParcelizer(i, i2, str);
        return this;
    }

    @Override // o.RegistryNoSourceEncoderAvailableException
    public final long write(RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        return serializer(0L, requestBuilder);
    }
}
