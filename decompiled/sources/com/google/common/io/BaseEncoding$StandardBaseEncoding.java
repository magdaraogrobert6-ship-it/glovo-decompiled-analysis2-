package com.google.common.io;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.w$$ExternalSyntheticLambda0;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import kotlin.io.TextStreamsKt;
import okio.Options;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes2.dex */
public class BaseEncoding$StandardBaseEncoding {
    public static final BaseEncoding$Base64Encoding IconCompatParcelizer = new BaseEncoding$Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final BaseEncoding$Base16Encoding read;
    public volatile BaseEncoding$StandardBaseEncoding MediaMetadataCompat;
    public final BaseEncoding$Alphabet serializer;
    public final Character write;

    public final String serializer(byte[] bArr) {
        int length = bArr.length;
        Object[] objArr = {0, Integer.valueOf(length), Integer.valueOf(bArr.length)};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        TextStreamsKt.read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, iWrite);
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
        int i = baseEncoding$Alphabet.read;
        int i2 = baseEncoding$Alphabet.write;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(UriKt.RemoteActionCompatParcelizer(length, i2) * i);
        try {
            IconCompatParcelizer(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public void IconCompatParcelizer(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        Object[] objArr = {0, Integer.valueOf(i), Integer.valueOf(bArr.length)};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        TextStreamsKt.read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, iWrite);
        while (i2 < i) {
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
            IconCompatParcelizer(sb, bArr, i2, Math.min(baseEncoding$Alphabet.write, i - i2));
            i2 += baseEncoding$Alphabet.write;
        }
    }

    public final void IconCompatParcelizer(StringBuilder sb, byte[] bArr, int i, int i2) {
        TextStreamsKt.read(new Object[]{Integer.valueOf(i), Integer.valueOf(i + i2), Integer.valueOf(bArr.length)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, w$$ExternalSyntheticLambda0.write());
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
        int i3 = baseEncoding$Alphabet.write;
        int i4 = baseEncoding$Alphabet.IconCompatParcelizer;
        int i5 = 0;
        TextStreamsKt.write(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        while (i5 < i2 * 8) {
            sb.append(baseEncoding$Alphabet.RemoteActionCompatParcelizer[((int) (j >>> ((((i2 + 1) * 8) - i4) - i5))) & baseEncoding$Alphabet.RatingCompat]);
            i5 += i4;
        }
        Character ch = this.write;
        if (ch != null) {
            while (i5 < baseEncoding$Alphabet.write * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public final int hashCode() {
        return this.serializer.hashCode() ^ Objects.hashCode(this.write);
    }

    public BaseEncoding$StandardBaseEncoding write(BaseEncoding$Alphabet baseEncoding$Alphabet, Character ch) {
        return new BaseEncoding$StandardBaseEncoding(baseEncoding$Alphabet, ch);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public BaseEncoding$StandardBaseEncoding(BaseEncoding$Alphabet baseEncoding$Alphabet, Character ch) {
        boolean z;
        baseEncoding$Alphabet.getClass();
        this.serializer = baseEncoding$Alphabet;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = baseEncoding$Alphabet.serializer;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        Object[] objArr = {"Padding character %s was already in alphabet", ch, Boolean.valueOf(z)};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        TextStreamsKt.read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, iWrite);
        this.write = ch;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ce A[EDGE_INSN: B:44:0x00ce->B:46:0x00d4 BREAK  A[LOOP:0: B:5:0x000b->B:45:0x00d0]] */
    public final BaseEncoding$StandardBaseEncoding read() {
        int i;
        boolean z;
        BaseEncoding$StandardBaseEncoding baseEncoding$StandardBaseEncodingWrite = this.MediaMetadataCompat;
        if (baseEncoding$StandardBaseEncodingWrite == null) {
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
            char[] cArr = baseEncoding$Alphabet.RemoteActionCompatParcelizer;
            for (char c : cArr) {
                if (Options.Companion.RemoteActionCompatParcelizer(c)) {
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i2];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    TextStreamsKt.RemoteActionCompatParcelizer("Cannot call upperCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c3 = cArr[i3];
                        if (Options.Companion.RemoteActionCompatParcelizer(c3)) {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i3] = c3;
                    }
                    BaseEncoding$Alphabet baseEncoding$Alphabet2 = new BaseEncoding$Alphabet(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), baseEncoding$Alphabet.MediaMetadataCompat, ".upperCase()"), cArr2);
                    if (!baseEncoding$Alphabet.MediaBrowserCompatMediaItem) {
                        baseEncoding$Alphabet = baseEncoding$Alphabet2;
                        break;
                    }
                    byte[] bArr = baseEncoding$Alphabet2.serializer;
                    if (!baseEncoding$Alphabet2.MediaBrowserCompatMediaItem) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i4 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i4];
                            if (b == -1) {
                                bArrCopyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i4;
                                if (!(b2 == -1)) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, MaybeObserveOn.write(), new Object[]{"Can't ignoreCase() since '%s' and '%s' encode different values", new Object[]{Character.valueOf(c4), Character.valueOf(c5)}}, MaybeObserveOn.write()));
                                    return null;
                                }
                                bArrCopyOf[i4] = b;
                            }
                        }
                        baseEncoding$Alphabet = new BaseEncoding$Alphabet(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), baseEncoding$Alphabet2.MediaMetadataCompat, ".ignoreCase()"), baseEncoding$Alphabet2.RemoteActionCompatParcelizer, bArrCopyOf, true);
                        break;
                    }
                    baseEncoding$Alphabet = baseEncoding$Alphabet2;
                    break;
                }
            }
            baseEncoding$StandardBaseEncodingWrite = baseEncoding$Alphabet == this.serializer ? this : write(baseEncoding$Alphabet, this.write);
            this.MediaMetadataCompat = baseEncoding$StandardBaseEncodingWrite;
        }
        return baseEncoding$StandardBaseEncodingWrite;
    }

    public final byte[] serializer(String str) {
        try {
            CharSequence charSequenceIconCompatParcelizer = IconCompatParcelizer(str);
            int length = (int) (((((long) this.serializer.IconCompatParcelizer) * ((long) charSequenceIconCompatParcelizer.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iWrite = write(bArr, charSequenceIconCompatParcelizer);
            if (iWrite == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iWrite];
            System.arraycopy(bArr, 0, bArr2, 0, iWrite);
            return bArr2;
        } catch (BaseEncoding$DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
        sb.append(baseEncoding$Alphabet);
        if (8 % baseEncoding$Alphabet.IconCompatParcelizer != 0) {
            Character ch = this.write;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public int write(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        CharSequence charSequenceIconCompatParcelizer = IconCompatParcelizer(charSequence);
        int length = charSequenceIconCompatParcelizer.length();
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
        boolean[] zArr = baseEncoding$Alphabet.MediaDescriptionCompat;
        int i = baseEncoding$Alphabet.IconCompatParcelizer;
        int i2 = baseEncoding$Alphabet.read;
        if (zArr[length % i2]) {
            int i3 = 0;
            for (int i4 = 0; i4 < charSequenceIconCompatParcelizer.length(); i4 += i2) {
                long jRemoteActionCompatParcelizer = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    jRemoteActionCompatParcelizer <<= i;
                    if (i4 + i6 < charSequenceIconCompatParcelizer.length()) {
                        jRemoteActionCompatParcelizer |= (long) baseEncoding$Alphabet.RemoteActionCompatParcelizer(charSequenceIconCompatParcelizer.charAt(i5 + i4));
                        i5++;
                    }
                }
                int i7 = baseEncoding$Alphabet.write;
                int i8 = (i7 - 1) * 8;
                while (i8 >= (i7 * 8) - (i5 * i)) {
                    bArr[i3] = (byte) ((jRemoteActionCompatParcelizer >>> i8) & 255);
                    i8 -= 8;
                    i3++;
                }
            }
            return i3;
        }
        throw new BaseEncoding$DecodingException("Invalid input length " + charSequenceIconCompatParcelizer.length());
    }

    public final CharSequence IconCompatParcelizer(CharSequence charSequence) {
        Character ch = this.write;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == cCharValue);
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BaseEncoding$StandardBaseEncoding)) {
            return false;
        }
        BaseEncoding$StandardBaseEncoding baseEncoding$StandardBaseEncoding = (BaseEncoding$StandardBaseEncoding) obj;
        return this.serializer.equals(baseEncoding$StandardBaseEncoding.serializer) && Objects.equals(this.write, baseEncoding$StandardBaseEncoding.write);
    }

    static {
        new BaseEncoding$Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new BaseEncoding$StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new BaseEncoding$StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        read = new BaseEncoding$Base16Encoding(new BaseEncoding$Alphabet("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public BaseEncoding$StandardBaseEncoding(String str, String str2) {
        this(new BaseEncoding$Alphabet(str, str2.toCharArray()), (Character) '=');
    }
}
