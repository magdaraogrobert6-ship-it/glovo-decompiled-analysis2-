package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.okio.ByteString;
import com.sentiance.okio.SegmentedByteString;
import com.sentiance.okio.c$b;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaBEyrNr8p6809BwlBoRO_sTaNs implements r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k, r8lambdaMIqXXOzLMUUicX7GG348aw6pQE, Cloneable, ByteChannel {
    public static final byte[] IconCompatParcelizer = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public resetCachelambda0 read;
    public long serializer;

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs MediaDescriptionCompat() {
        return this;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final /* synthetic */ r8lambdaMIqXXOzLMUUicX7GG348aw6pQE MediaMetadataCompat(int i) {
        read(i);
        return this;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final /* synthetic */ r8lambdaMIqXXOzLMUUicX7GG348aw6pQE MediaSessionCompatQueueItem(int i) {
        write(i);
        return this;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return this.serializer == 0;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final /* synthetic */ r8lambdaMIqXXOzLMUUicX7GG348aw6pQE RatingCompat(int i) {
        RemoteActionCompatParcelizer(i);
        return this;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        resetCachelambda0 resetcachelambda0IconCompatParcelizer = IconCompatParcelizer(2);
        byte[] bArr = resetcachelambda0IconCompatParcelizer.serializer;
        int i2 = resetcachelambda0IconCompatParcelizer.read;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        resetcachelambda0IconCompatParcelizer.read = i2 + 2;
        this.serializer += 2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.getConfigurationValue
    public final void close() {
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE, o.getConfigurationValue, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void read(int i) {
        resetCachelambda0 resetcachelambda0IconCompatParcelizer = IconCompatParcelizer(4);
        byte[] bArr = resetcachelambda0IconCompatParcelizer.serializer;
        int i2 = resetcachelambda0IconCompatParcelizer.read;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        resetcachelambda0IconCompatParcelizer.read = i2 + 4;
        this.serializer += 4;
    }

    public final long PlaybackStateCompatCustomAction() {
        long j = this.serializer;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + j);
        }
        resetCachelambda0 resetcachelambda0 = this.read;
        int i = resetcachelambda0.IconCompatParcelizer;
        int i2 = resetcachelambda0.read;
        if (i2 - i < 8) {
            return ((((long) ParcelableVolumeInfo()) & 4294967295L) << 32) | (((long) ParcelableVolumeInfo()) & 4294967295L);
        }
        byte[] bArr = resetcachelambda0.serializer;
        long j2 = bArr[i];
        long j3 = bArr[i + 1];
        long j4 = bArr[i + 2];
        int i3 = i + 8;
        long j5 = (j4 & 255) << 40;
        long j6 = ((((long) bArr[i + 6]) & 255) << 8) | j5 | ((j2 & 255) << 56) | ((j3 & 255) << 48) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | (((long) bArr[i + 7]) & 255);
        this.serializer = j - 8;
        if (i3 != i2) {
            resetcachelambda0.IconCompatParcelizer = i3;
            return j6;
        }
        this.read = resetcachelambda0.IconCompatParcelizer();
        getColorValue.IconCompatParcelizer(resetcachelambda0);
        return j6;
    }

    public final byte[] RatingCompat() {
        try {
            return MediaSessionCompatQueueItem(this.serializer);
        } catch (EOFException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public final String RemoteActionCompatParcelizer() {
        try {
            return write(this.serializer, isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer);
        } catch (EOFException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final ByteString read(long j) {
        return new ByteString(MediaSessionCompatQueueItem(j));
    }

    public final void serializer() {
        try {
            IconCompatParcelizer(this.serializer);
        } catch (EOFException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source == null");
            return 0;
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            resetCachelambda0 resetcachelambda0IconCompatParcelizer = IconCompatParcelizer(1);
            int iMin = Math.min(i, 8192 - resetcachelambda0IconCompatParcelizer.read);
            byteBuffer.get(resetcachelambda0IconCompatParcelizer.serializer, resetcachelambda0IconCompatParcelizer.read, iMin);
            i -= iMin;
            resetcachelambda0IconCompatParcelizer.read += iMin;
        }
        this.serializer += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs clone() {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        if (this.serializer == 0) {
            return r8lambdabeyrnr8p6809bwlboro_stans;
        }
        resetCachelambda0 resetcachelambda0Write = this.read.write();
        r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0Write;
        resetcachelambda0Write.MediaMetadataCompat = resetcachelambda0Write;
        resetcachelambda0Write.RatingCompat = resetcachelambda0Write;
        for (resetCachelambda0 resetcachelambda0 = this.read.RatingCompat; resetcachelambda0 != this.read; resetcachelambda0 = resetcachelambda0.RatingCompat) {
            r8lambdabeyrnr8p6809bwlboro_stans.read.MediaMetadataCompat.serializer(resetcachelambda0.write());
        }
        r8lambdabeyrnr8p6809bwlboro_stans.serializer = this.serializer;
        return r8lambdabeyrnr8p6809bwlboro_stans;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final OutputStream PlaybackStateCompat() {
        return new r8lambdaYgnAHvVqxbe1bV82PponR7zRwo(this, 0);
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final InputStream r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return new c$b(this, 0);
    }

    public final int IconCompatParcelizer(byte[] bArr, int i, int i2) {
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(bArr.length, i, i2);
        resetCachelambda0 resetcachelambda0 = this.read;
        if (resetcachelambda0 == null) {
            return -1;
        }
        int iMin = Math.min(i2, resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer);
        System.arraycopy(resetcachelambda0.serializer, resetcachelambda0.IconCompatParcelizer, bArr, i, iMin);
        int i3 = resetcachelambda0.IconCompatParcelizer + iMin;
        resetcachelambda0.IconCompatParcelizer = i3;
        this.serializer -= (long) iMin;
        if (i3 == resetcachelambda0.read) {
            this.read = resetcachelambda0.IconCompatParcelizer();
            getColorValue.IconCompatParcelizer(resetcachelambda0);
        }
        return iMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaBEyrNr8p6809BwlBoRO_sTaNs)) {
            return false;
        }
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = (r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) obj;
        long j = this.serializer;
        if (j != r8lambdabeyrnr8p6809bwlboro_stans.serializer) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        resetCachelambda0 resetcachelambda0 = this.read;
        resetCachelambda0 resetcachelambda1 = r8lambdabeyrnr8p6809bwlboro_stans.read;
        int i = resetcachelambda0.IconCompatParcelizer;
        int i2 = resetcachelambda1.IconCompatParcelizer;
        while (j2 < this.serializer) {
            long jMin = Math.min(resetcachelambda0.read - i, resetcachelambda1.read - i2);
            int i3 = 0;
            while (i3 < jMin) {
                if (resetcachelambda0.serializer[i] != resetcachelambda1.serializer[i2]) {
                    return false;
                }
                i3++;
                i++;
                i2++;
            }
            if (i == resetcachelambda0.read) {
                resetcachelambda0 = resetcachelambda0.RatingCompat;
                i = resetcachelambda0.IconCompatParcelizer;
            }
            if (i2 == resetcachelambda1.read) {
                resetcachelambda1 = resetcachelambda1.RatingCompat;
                i2 = resetcachelambda1.IconCompatParcelizer;
            }
            j2 += jMin;
        }
        return true;
    }

    public final void serializer(int i) {
        if (i < 128) {
            write(i);
            return;
        }
        if (i < 2048) {
            write((i >> 6) | 192);
            write((i & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            return;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                write(63);
                return;
            }
            write((i >> 12) | Constant.ERROR_WSS_INVALID);
            write(((i >> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            write((i & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            return;
        }
        if (i <= 1114111) {
            write((i >> 18) | 240);
            write(((i >> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            write(((i >> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            write((i & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
            return;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(Integer.toHexString(i), "Unexpected code point: ");
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        resetCachelambda0 resetcachelambda0Write;
        if (r8lambdabeyrnr8p6809bwlboro_stans == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source == null");
            return;
        }
        if (r8lambdabeyrnr8p6809bwlboro_stans != this) {
            isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans.serializer, 0L, j);
            while (j > 0) {
                resetCachelambda0 resetcachelambda0 = r8lambdabeyrnr8p6809bwlboro_stans.read;
                int i = resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer;
                if (j < i) {
                    resetCachelambda0 resetcachelambda1 = this.read;
                    resetCachelambda0 resetcachelambda2 = resetcachelambda1 != null ? resetcachelambda1.MediaMetadataCompat : null;
                    if (resetcachelambda2 != null && resetcachelambda2.write) {
                        if ((((long) resetcachelambda2.read) + j) - ((long) (resetcachelambda2.RemoteActionCompatParcelizer ? 0 : resetcachelambda2.IconCompatParcelizer)) <= 8192) {
                            resetcachelambda0.IconCompatParcelizer(resetcachelambda2, (int) j);
                            r8lambdabeyrnr8p6809bwlboro_stans.serializer -= j;
                            this.serializer += j;
                            return;
                        }
                    }
                    int i2 = (int) j;
                    if (i2 > 0 && i2 <= i) {
                        if (i2 >= 1024) {
                            resetcachelambda0Write = resetcachelambda0.write();
                        } else {
                            resetcachelambda0Write = getColorValue.read();
                            System.arraycopy(resetcachelambda0.serializer, resetcachelambda0.IconCompatParcelizer, resetcachelambda0Write.serializer, 0, i2);
                        }
                        resetcachelambda0Write.read = resetcachelambda0Write.IconCompatParcelizer + i2;
                        resetcachelambda0.IconCompatParcelizer += i2;
                        resetcachelambda0.MediaMetadataCompat.serializer(resetcachelambda0Write);
                        r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0Write;
                    } else {
                        DrawableTransformation.write();
                        return;
                    }
                }
                resetCachelambda0 resetcachelambda3 = r8lambdabeyrnr8p6809bwlboro_stans.read;
                long j2 = resetcachelambda3.read - resetcachelambda3.IconCompatParcelizer;
                r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda3.IconCompatParcelizer();
                resetCachelambda0 resetcachelambda4 = this.read;
                if (resetcachelambda4 == null) {
                    this.read = resetcachelambda3;
                    resetcachelambda3.MediaMetadataCompat = resetcachelambda3;
                    resetcachelambda3.RatingCompat = resetcachelambda3;
                } else {
                    resetcachelambda4.MediaMetadataCompat.serializer(resetcachelambda3);
                    resetCachelambda0 resetcachelambda5 = resetcachelambda3.MediaMetadataCompat;
                    if (resetcachelambda5 != resetcachelambda3) {
                        if (resetcachelambda5.write) {
                            int i3 = resetcachelambda3.read - resetcachelambda3.IconCompatParcelizer;
                            if (i3 <= (8192 - resetcachelambda5.read) + (resetcachelambda5.RemoteActionCompatParcelizer ? 0 : resetcachelambda5.IconCompatParcelizer)) {
                                resetcachelambda3.IconCompatParcelizer(resetcachelambda5, i3);
                                resetcachelambda3.IconCompatParcelizer();
                                getColorValue.IconCompatParcelizer(resetcachelambda3);
                            }
                        }
                    } else {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                        return;
                    }
                }
                r8lambdabeyrnr8p6809bwlboro_stans.serializer -= j2;
                this.serializer += j2;
                j -= j2;
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source == this");
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final String MediaSessionCompatQueueItem() {
        return RemoteActionCompatParcelizer(Long.MAX_VALUE);
    }

    public final byte[] MediaSessionCompatQueueItem(long j) throws EOFException {
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(this.serializer, 0L, j);
        if (j > 2147483647L) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "byteCount > Integer.MAX_VALUE: "));
            return null;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, i - i2);
            if (iIconCompatParcelizer == -1) {
                DrawableTransformation.IconCompatParcelizer();
                return null;
            }
            i2 += iIconCompatParcelizer;
        }
        return bArr;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final void IconCompatParcelizer(long j) throws EOFException {
        while (j > 0) {
            resetCachelambda0 resetcachelambda0 = this.read;
            if (resetcachelambda0 != null) {
                int iMin = (int) Math.min(j, resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer);
                long j2 = iMin;
                this.serializer -= j2;
                j -= j2;
                resetCachelambda0 resetcachelambda1 = this.read;
                int i = resetcachelambda1.IconCompatParcelizer + iMin;
                resetcachelambda1.IconCompatParcelizer = i;
                if (i == resetcachelambda1.read) {
                    this.read = resetcachelambda1.IconCompatParcelizer();
                    getColorValue.IconCompatParcelizer(resetcachelambda1);
                }
            } else {
                DrawableTransformation.IconCompatParcelizer();
                return;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, String str) {
        char cCharAt;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("string == null");
            return;
        }
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "beginIndex < 0: "));
            return;
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(str.length(), ff$$ExternalSyntheticOutline0.m(i2, "endIndex > string.length: ", " > "));
                return;
            }
            while (i < i2) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < 128) {
                    resetCachelambda0 resetcachelambda0IconCompatParcelizer = IconCompatParcelizer(1);
                    byte[] bArr = resetcachelambda0IconCompatParcelizer.serializer;
                    int i3 = resetcachelambda0IconCompatParcelizer.read - i;
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
                    int i5 = resetcachelambda0IconCompatParcelizer.read;
                    int i6 = (i3 + i) - i5;
                    resetcachelambda0IconCompatParcelizer.read = i5 + i6;
                    this.serializer += (long) i6;
                } else {
                    if (cCharAt2 < 2048) {
                        write((cCharAt2 >> 6) | 192);
                        write((cCharAt2 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i7 = i + 1;
                        char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            write((i8 >> 18) | 240);
                            write(((i8 >> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                            write(((i8 >> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                            write((i8 & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                            i += 2;
                        } else {
                            write(63);
                            i = i7;
                        }
                    } else {
                        write((cCharAt2 >> '\f') | Constant.ERROR_WSS_INVALID);
                        write(((cCharAt2 >> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                        write((cCharAt2 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    }
                    i++;
                }
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i2, "endIndex < beginIndex: ", i, " < "));
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final void MediaDescriptionCompat(long j) throws EOFException {
        if (this.serializer >= j) {
            return;
        }
        DrawableTransformation.IconCompatParcelizer();
    }

    public final int hashCode() {
        resetCachelambda0 resetcachelambda0 = this.read;
        if (resetcachelambda0 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = resetcachelambda0.read;
            for (int i3 = resetcachelambda0.IconCompatParcelizer; i3 < i2; i3++) {
                i = (i * 31) + resetcachelambda0.serializer[i3];
            }
            resetcachelambda0 = resetcachelambda0.RatingCompat;
        } while (resetcachelambda0 != this.read);
        return i;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final byte MediaBrowserCompatMediaItem() {
        long j = this.serializer;
        if (j == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("size == 0");
            return (byte) 0;
        }
        resetCachelambda0 resetcachelambda0 = this.read;
        int i = resetcachelambda0.IconCompatParcelizer;
        int i2 = resetcachelambda0.read;
        int i3 = i + 1;
        byte b = resetcachelambda0.serializer[i];
        this.serializer = j - 1;
        if (i3 != i2) {
            resetcachelambda0.IconCompatParcelizer = i3;
            return b;
        }
        this.read = resetcachelambda0.IconCompatParcelizer();
        getColorValue.IconCompatParcelizer(resetcachelambda0);
        return b;
    }

    public final void MediaMetadataCompat(long j) {
        if (j == 0) {
            write(48);
            return;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        resetCachelambda0 resetcachelambda0IconCompatParcelizer = IconCompatParcelizer(iNumberOfTrailingZeros);
        byte[] bArr = resetcachelambda0IconCompatParcelizer.serializer;
        int i = resetcachelambda0IconCompatParcelizer.read;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = IconCompatParcelizer[(int) (15 & j)];
            j >>>= 4;
        }
        resetcachelambda0IconCompatParcelizer.read += iNumberOfTrailingZeros;
        this.serializer += (long) iNumberOfTrailingZeros;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final short MediaSessionCompatToken() {
        int iMediaBrowserCompatMediaItem;
        long j = this.serializer;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + j);
        }
        resetCachelambda0 resetcachelambda0 = this.read;
        int i = resetcachelambda0.IconCompatParcelizer;
        int i2 = resetcachelambda0.read;
        if (i2 - i < 2) {
            iMediaBrowserCompatMediaItem = ((MediaBrowserCompatMediaItem() & 255) << 8) | (MediaBrowserCompatMediaItem() & 255);
        } else {
            byte[] bArr = resetcachelambda0.serializer;
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            this.serializer = j - 2;
            if (i3 == i2) {
                this.read = resetcachelambda0.IconCompatParcelizer();
                getColorValue.IconCompatParcelizer(resetcachelambda0);
            } else {
                resetcachelambda0.IconCompatParcelizer = i3;
            }
            iMediaBrowserCompatMediaItem = (b2 & 255) | ((b & 255) << 8);
        }
        return (short) iMediaBrowserCompatMediaItem;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final int ParcelableVolumeInfo() {
        long j = this.serializer;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + j);
        }
        resetCachelambda0 resetcachelambda0 = this.read;
        int i = resetcachelambda0.IconCompatParcelizer;
        int i2 = resetcachelambda0.read;
        if (i2 - i < 4) {
            return ((MediaBrowserCompatMediaItem() & 255) << 24) | ((MediaBrowserCompatMediaItem() & 255) << 16) | ((MediaBrowserCompatMediaItem() & 255) << 8) | (MediaBrowserCompatMediaItem() & 255);
        }
        byte[] bArr = resetcachelambda0.serializer;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        this.serializer = j - 4;
        if (i3 != i2) {
            resetcachelambda0.IconCompatParcelizer = i3;
            return i4;
        }
        this.read = resetcachelambda0.IconCompatParcelizer();
        getColorValue.IconCompatParcelizer(resetcachelambda0);
        return i4;
    }

    public final int MediaMetadataCompat() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.serializer == 0) {
            DrawableTransformation.IconCompatParcelizer();
            return 0;
        }
        byte bRatingCompat = RatingCompat(0L);
        if ((bRatingCompat & 128) == 0) {
            i = bRatingCompat & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bRatingCompat & 224) == 192) {
            i = bRatingCompat & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bRatingCompat & 240) == 224) {
            i = bRatingCompat & 15;
            i2 = 3;
            i3 = androidx.compose.ui.graphics.Fields.CameraDistance;
        } else {
            if ((bRatingCompat & 248) != 240) {
                IconCompatParcelizer(1L);
                return 65533;
            }
            i = bRatingCompat & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.serializer < j) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i2, "size < ", ": ");
            sbM.append(this.serializer);
            sbM.append(" (to read code point prefixed 0x");
            sbM.append(Integer.toHexString(bRatingCompat));
            sbM.append(")");
            throw new EOFException(sbM.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bRatingCompat2 = RatingCompat(j2);
            if ((bRatingCompat2 & 192) != 128) {
                IconCompatParcelizer(j2);
                return 65533;
            }
            i = (i << 6) | (bRatingCompat2 & 63);
        }
        IconCompatParcelizer(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((i < 55296 || i > 57343) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final long read() {
        long j = this.serializer;
        if (j == 0) {
            return 0L;
        }
        resetCachelambda0 resetcachelambda0 = this.read.MediaMetadataCompat;
        int i = resetcachelambda0.read;
        return (i >= 8192 || !resetcachelambda0.write) ? j : j - ((long) (i - resetcachelambda0.IconCompatParcelizer));
    }

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return isPushDeepLinkBackStackActivityEnabled.write;
    }

    public final String MediaBrowserCompatMediaItem(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (RatingCompat(j2) == 13) {
                String strWrite = write(j2, isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer);
                IconCompatParcelizer(2L);
                return strWrite;
            }
        }
        String strWrite2 = write(j, isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer);
        IconCompatParcelizer(1L);
        return strWrite2;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final long ComponentActivity() {
        int i;
        if (this.serializer == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("size == 0");
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            resetCachelambda0 resetcachelambda0 = this.read;
            byte[] bArr = resetcachelambda0.serializer;
            int i3 = resetcachelambda0.IconCompatParcelizer;
            int i4 = resetcachelambda0.read;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                    r8lambdabeyrnr8p6809bwlboro_stans.MediaMetadataCompat(j);
                    r8lambdabeyrnr8p6809bwlboro_stans.write((int) b);
                    throw new NumberFormatException("Number too large: ".concat(r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.read = resetcachelambda0.IconCompatParcelizer();
                getColorValue.IconCompatParcelizer(resetcachelambda0);
            } else {
                resetcachelambda0.IconCompatParcelizer = i3;
            }
            if (z) {
                break;
            }
        } while (this.read != null);
        this.serializer -= (long) i2;
        return j;
    }

    public final String toString() {
        long j = this.serializer;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? ByteString.write : new SegmentedByteString(this, i)).toString();
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer(j, "size > Integer.MAX_VALUE: ");
        return null;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final String RemoteActionCompatParcelizer(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long jWrite = write((byte) 10, 0L, j2);
            if (jWrite != -1) {
                return MediaBrowserCompatMediaItem(jWrite);
            }
            if (j2 < this.serializer && RatingCompat(j2 - 1) == 13 && RatingCompat(j2) == 10) {
                return MediaBrowserCompatMediaItem(j2);
            }
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
            read(r8lambdabeyrnr8p6809bwlboro_stans, 0L, Math.min(32L, this.serializer));
            DrawableTransformation.IconCompatParcelizer(Math.min(this.serializer, j), new ByteString(r8lambdabeyrnr8p6809bwlboro_stans.RatingCompat()).read());
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "limit < 0: "));
        return null;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final /* synthetic */ r8lambdaMIqXXOzLMUUicX7GG348aw6pQE RemoteActionCompatParcelizer(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final /* synthetic */ r8lambdaMIqXXOzLMUUicX7GG348aw6pQE write(byte[] bArr) {
        IconCompatParcelizer(bArr);
        return this;
    }

    public final resetCachelambda0 IconCompatParcelizer(int i) {
        if (i >= 1 && i <= 8192) {
            resetCachelambda0 resetcachelambda0 = this.read;
            if (resetcachelambda0 == null) {
                resetCachelambda0 resetcachelambda1 = getColorValue.read();
                this.read = resetcachelambda1;
                resetcachelambda1.MediaMetadataCompat = resetcachelambda1;
                resetcachelambda1.RatingCompat = resetcachelambda1;
                return resetcachelambda1;
            }
            resetCachelambda0 resetcachelambda2 = resetcachelambda0.MediaMetadataCompat;
            if (resetcachelambda2.read + i <= 8192 && resetcachelambda2.write) {
                return resetcachelambda2;
            }
            resetCachelambda0 resetcachelambda3 = getColorValue.read();
            resetcachelambda2.serializer(resetcachelambda3);
            return resetcachelambda3;
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        resetCachelambda0 resetcachelambda0 = this.read;
        if (resetcachelambda0 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer);
        byteBuffer.put(resetcachelambda0.serializer, resetcachelambda0.IconCompatParcelizer, iMin);
        int i = resetcachelambda0.IconCompatParcelizer + iMin;
        resetcachelambda0.IconCompatParcelizer = i;
        this.serializer -= (long) iMin;
        if (i == resetcachelambda0.read) {
            this.read = resetcachelambda0.IconCompatParcelizer();
            getColorValue.IconCompatParcelizer(resetcachelambda0);
        }
        return iMin;
    }

    public final byte RatingCompat(long j) {
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(this.serializer, j, 1L);
        long j2 = this.serializer;
        resetCachelambda0 resetcachelambda0 = this.read;
        if (j2 - j > j) {
            while (true) {
                int i = resetcachelambda0.read;
                int i2 = resetcachelambda0.IconCompatParcelizer;
                long j3 = i - i2;
                if (j < j3) {
                    return resetcachelambda0.serializer[i2 + ((int) j)];
                }
                j -= j3;
                resetcachelambda0 = resetcachelambda0.RatingCompat;
            }
        } else {
            long j4 = j - j2;
            resetCachelambda0 resetcachelambda1 = resetcachelambda0.MediaMetadataCompat;
            while (true) {
                int i3 = resetcachelambda1.read;
                int i4 = resetcachelambda1.IconCompatParcelizer;
                j4 += (long) (i3 - i4);
                if (j4 >= 0) {
                    return resetcachelambda1.serializer[i4 + ((int) j4)];
                }
                resetcachelambda1 = resetcachelambda1.MediaMetadataCompat;
            }
        }
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final boolean serializer(long j) {
        return this.serializer >= Long.MAX_VALUE;
    }

    public final void write(int i) {
        resetCachelambda0 resetcachelambda0IconCompatParcelizer = IconCompatParcelizer(1);
        byte[] bArr = resetcachelambda0IconCompatParcelizer.serializer;
        int i2 = resetcachelambda0IconCompatParcelizer.read;
        resetcachelambda0IconCompatParcelizer.read = i2 + 1;
        bArr[i2] = (byte) i;
        this.serializer++;
    }

    public final void read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j, long j2) {
        if (r8lambdabeyrnr8p6809bwlboro_stans != null) {
            isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(this.serializer, j, j2);
            if (j2 == 0) {
                return;
            }
            r8lambdabeyrnr8p6809bwlboro_stans.serializer += j2;
            resetCachelambda0 resetcachelambda0 = this.read;
            while (true) {
                long j3 = resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer;
                if (j < j3) {
                    break;
                }
                j -= j3;
                resetcachelambda0 = resetcachelambda0.RatingCompat;
            }
            while (j2 > 0) {
                resetCachelambda0 resetcachelambda0Write = resetcachelambda0.write();
                int i = (int) (((long) resetcachelambda0Write.IconCompatParcelizer) + j);
                resetcachelambda0Write.IconCompatParcelizer = i;
                resetcachelambda0Write.read = Math.min(i + ((int) j2), resetcachelambda0Write.read);
                resetCachelambda0 resetcachelambda1 = r8lambdabeyrnr8p6809bwlboro_stans.read;
                if (resetcachelambda1 == null) {
                    resetcachelambda0Write.MediaMetadataCompat = resetcachelambda0Write;
                    resetcachelambda0Write.RatingCompat = resetcachelambda0Write;
                    r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0Write;
                } else {
                    resetcachelambda1.MediaMetadataCompat.serializer(resetcachelambda0Write);
                }
                j2 -= (long) (resetcachelambda0Write.read - resetcachelambda0Write.IconCompatParcelizer);
                resetcachelambda0 = resetcachelambda0.RatingCompat;
                j = 0;
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("out == null");
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE IconCompatParcelizer(String str, Charset charset) {
        read(str, 0, str.length(), charset);
        return this;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final String write(Charset charset) {
        try {
            return write(this.serializer, charset);
        } catch (EOFException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public final String write(long j, Charset charset) {
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(this.serializer, 0L, j);
        if (charset == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("charset == null");
            return null;
        }
        if (j > 2147483647L) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "byteCount > Integer.MAX_VALUE: "));
            return null;
        }
        if (j == 0) {
            return "";
        }
        resetCachelambda0 resetcachelambda0 = this.read;
        int i = resetcachelambda0.IconCompatParcelizer;
        if (((long) i) + j > resetcachelambda0.read) {
            return new String(MediaSessionCompatQueueItem(j), charset);
        }
        String str = new String(resetcachelambda0.serializer, i, (int) j, charset);
        int i2 = (int) (((long) resetcachelambda0.IconCompatParcelizer) + j);
        resetcachelambda0.IconCompatParcelizer = i2;
        this.serializer -= j;
        if (i2 == resetcachelambda0.read) {
            this.read = resetcachelambda0.IconCompatParcelizer();
            getColorValue.IconCompatParcelizer(resetcachelambda0);
        }
        return str;
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final /* synthetic */ r8lambdaMIqXXOzLMUUicX7GG348aw6pQE write(long j) {
        MediaMetadataCompat(j);
        return this;
    }

    public final void read(String str, int i, int i2, Charset charset) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("string == null");
            return;
        }
        if (i < 0) {
            throw new IllegalAccessError(c8$$ExternalSyntheticOutline0.m(i, "beginIndex < 0: "));
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(str.length(), ff$$ExternalSyntheticOutline0.m(i2, "endIndex > string.length: ", " > "));
                return;
            } else {
                if (charset != null) {
                    if (charset.equals(isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer)) {
                        RemoteActionCompatParcelizer(i, i2, str);
                        return;
                    } else {
                        byte[] bytes = str.substring(i, i2).getBytes(charset);
                        write(bytes, 0, bytes.length);
                        return;
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("charset == null");
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i2, "endIndex < beginIndex: ", i, " < "));
    }

    public final void IconCompatParcelizer(getResourceConfigurationValue getresourceconfigurationvalue) {
        if (getresourceconfigurationvalue != null) {
            while (getresourceconfigurationvalue.read(this, 8192L) != -1) {
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source == null");
        }
    }

    @Override // o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE serializer(String str) {
        RemoteActionCompatParcelizer(0, str.length(), str);
        return this;
    }

    public final long write(byte b, long j, long j2) {
        resetCachelambda0 resetcachelambda0;
        long j3 = 0;
        if (j >= 0 && j2 >= j) {
            long j4 = this.serializer;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j == j2 || (resetcachelambda0 = this.read) == null) {
                return -1L;
            }
            if (j4 - j < j) {
                while (j4 > j) {
                    resetcachelambda0 = resetcachelambda0.MediaMetadataCompat;
                    j4 -= (long) (resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer);
                }
            } else {
                while (true) {
                    long j5 = ((long) (resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer)) + j3;
                    if (j5 >= j) {
                        break;
                    }
                    resetcachelambda0 = resetcachelambda0.RatingCompat;
                    j3 = j5;
                }
                j4 = j3;
            }
            while (j4 < j2) {
                byte[] bArr = resetcachelambda0.serializer;
                int iMin = (int) Math.min(resetcachelambda0.read, (((long) resetcachelambda0.IconCompatParcelizer) + j2) - j4);
                for (int i = (int) ((((long) resetcachelambda0.IconCompatParcelizer) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - resetcachelambda0.IconCompatParcelizer)) + j4;
                    }
                }
                j4 += (long) (resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer);
                resetcachelambda0 = resetcachelambda0.RatingCompat;
                j = j4;
            }
            return -1L;
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(this.serializer, "size=", " fromIndex=");
        sbM.append(j);
        sbM.append(" toIndex=");
        sbM.append(j2);
        throw new IllegalArgumentException(sbM.toString());
    }

    public final void IconCompatParcelizer(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source == null");
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                resetCachelambda0 resetcachelambda0IconCompatParcelizer = IconCompatParcelizer(1);
                int iMin = Math.min(i3 - i, 8192 - resetcachelambda0IconCompatParcelizer.read);
                System.arraycopy(bArr, i, resetcachelambda0IconCompatParcelizer.serializer, resetcachelambda0IconCompatParcelizer.read, iMin);
                i += iMin;
                resetcachelambda0IconCompatParcelizer.read += iMin;
            }
            this.serializer += j;
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source == null");
    }

    @Override // o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        if (r8lambdabeyrnr8p6809bwlboro_stans == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("sink == null");
            return 0L;
        }
        if (j >= 0) {
            long j2 = this.serializer;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            r8lambdabeyrnr8p6809bwlboro_stans.serializer(this, j);
            return j;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final boolean read(ByteString byteString) {
        int iWrite = byteString.write();
        if (iWrite >= 0 && this.serializer >= iWrite && byteString.write() >= iWrite) {
            for (int i = 0; i < iWrite; i++) {
                if (RatingCompat(i) == byteString.RemoteActionCompatParcelizer(i)) {
                }
            }
            return true;
        }
        return false;
    }
}
