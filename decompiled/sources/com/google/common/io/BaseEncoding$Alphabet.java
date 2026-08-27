package com.google.common.io;

import androidx.compose.ui.graphics.Fields;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.math.RoundingMode;
import java.util.Arrays;
import o.accessunpack;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseEncoding$Alphabet {
    public final int IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final boolean[] MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final int RatingCompat;
    public final char[] RemoteActionCompatParcelizer;
    public final int read;
    public final byte[] serializer;
    public final int write;

    public final String toString() {
        return this.MediaMetadataCompat;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.RemoteActionCompatParcelizer) + (this.MediaBrowserCompatMediaItem ? 1231 : 1237);
    }

    public BaseEncoding$Alphabet(String str, char[] cArr, byte[] bArr, boolean z) {
        this.MediaMetadataCompat = str;
        cArr.getClass();
        this.RemoteActionCompatParcelizer = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iIntValue = ((Integer) UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 971707443, -971707439, new Object[]{Integer.valueOf(length)}, accessunpack.serializer(), accessunpack.serializer())).intValue();
            this.IconCompatParcelizer = iIntValue;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iIntValue);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.read = i;
            this.write = iIntValue >> iNumberOfTrailingZeros;
            this.RatingCompat = cArr.length - 1;
            this.serializer = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.write; i2++) {
                int i3 = this.IconCompatParcelizer;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[UriKt.RemoteActionCompatParcelizer(i2 * 8, i3)] = true;
            }
            this.MediaDescriptionCompat = zArr;
            this.MediaBrowserCompatMediaItem = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final int RemoteActionCompatParcelizer(char c) throws BaseEncoding$DecodingException {
        if (c <= 127) {
            byte b = this.serializer[c];
            if (b != -1) {
                return b;
            }
            if (c > ' ' && c != 127) {
                throw new BaseEncoding$DecodingException("Unrecognized character: " + c);
            }
            throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BaseEncoding$Alphabet)) {
            return false;
        }
        BaseEncoding$Alphabet baseEncoding$Alphabet = (BaseEncoding$Alphabet) obj;
        return this.MediaBrowserCompatMediaItem == baseEncoding$Alphabet.MediaBrowserCompatMediaItem && Arrays.equals(this.RemoteActionCompatParcelizer, baseEncoding$Alphabet.RemoteActionCompatParcelizer);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseEncoding$Alphabet(String str, char[] cArr) {
        byte[] bArr = new byte[Fields.SpotShadowColor];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    Object[] objArr = {"Duplicate character: %s", new Object[]{Character.valueOf(c)}};
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, MaybeObserveOn.write(), objArr, MaybeObserveOn.write()));
                    throw null;
                }
            } else {
                Object[] objArr2 = {"Non-ASCII character: %s", new Object[]{Character.valueOf(c)}};
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, MaybeObserveOn.write(), objArr2, MaybeObserveOn.write()));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
