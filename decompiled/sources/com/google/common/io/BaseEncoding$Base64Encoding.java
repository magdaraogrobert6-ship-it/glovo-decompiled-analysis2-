package com.google.common.io;

import bo.app.w$$ExternalSyntheticLambda0;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseEncoding$Base64Encoding extends BaseEncoding$StandardBaseEncoding {
    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final void IconCompatParcelizer(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        TextStreamsKt.read(new Object[]{0, Integer.valueOf(i), Integer.valueOf(bArr.length)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, w$$ExternalSyntheticLambda0.write());
        int i3 = i;
        while (i3 >= 3) {
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 1];
            int i4 = i2 + 3;
            int i5 = (bArr[i2 + 2] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
            char[] cArr = baseEncoding$Alphabet.RemoteActionCompatParcelizer;
            char[] cArr2 = baseEncoding$Alphabet.RemoteActionCompatParcelizer;
            sb.append(cArr[i5 >>> 18]);
            sb.append(cArr2[(i5 >>> 12) & 63]);
            sb.append(cArr2[(i5 >>> 6) & 63]);
            sb.append(cArr2[i5 & 63]);
            i3 -= 3;
            i2 = i4;
        }
        if (i2 < i) {
            IconCompatParcelizer(sb, bArr, i2, i - i2);
        }
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final BaseEncoding$StandardBaseEncoding write(BaseEncoding$Alphabet baseEncoding$Alphabet, Character ch) {
        return new BaseEncoding$Base64Encoding(baseEncoding$Alphabet, ch);
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final int write(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        CharSequence charSequenceIconCompatParcelizer = IconCompatParcelizer(charSequence);
        int length = charSequenceIconCompatParcelizer.length();
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
        if (!baseEncoding$Alphabet.MediaDescriptionCompat[length % baseEncoding$Alphabet.read]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequenceIconCompatParcelizer.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceIconCompatParcelizer.length()) {
            int i3 = i + 2;
            int iRemoteActionCompatParcelizer = (baseEncoding$Alphabet.RemoteActionCompatParcelizer(charSequenceIconCompatParcelizer.charAt(i)) << 18) | (baseEncoding$Alphabet.RemoteActionCompatParcelizer(charSequenceIconCompatParcelizer.charAt(i + 1)) << 12);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iRemoteActionCompatParcelizer >>> 16);
            if (i3 < charSequenceIconCompatParcelizer.length()) {
                int i5 = i + 3;
                int iRemoteActionCompatParcelizer2 = iRemoteActionCompatParcelizer | (baseEncoding$Alphabet.RemoteActionCompatParcelizer(charSequenceIconCompatParcelizer.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iRemoteActionCompatParcelizer2 >>> 8) & 255);
                if (i5 < charSequenceIconCompatParcelizer.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iRemoteActionCompatParcelizer2 | baseEncoding$Alphabet.RemoteActionCompatParcelizer(charSequenceIconCompatParcelizer.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i3;
                i2 = i4;
            }
        }
        return i2;
    }

    public BaseEncoding$Base64Encoding(String str, String str2) {
        this(new BaseEncoding$Alphabet(str, str2.toCharArray()), (Character) '=');
    }

    public BaseEncoding$Base64Encoding(BaseEncoding$Alphabet baseEncoding$Alphabet, Character ch) {
        super(baseEncoding$Alphabet, ch);
        TextStreamsKt.write(baseEncoding$Alphabet.RemoteActionCompatParcelizer.length == 64);
    }
}
