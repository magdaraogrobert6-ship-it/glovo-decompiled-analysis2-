package com.google.common.io;

import androidx.compose.ui.graphics.Fields;
import bo.app.w$$ExternalSyntheticLambda0;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseEncoding$Base16Encoding extends BaseEncoding$StandardBaseEncoding {
    public final char[] RemoteActionCompatParcelizer;

    public BaseEncoding$Base16Encoding(BaseEncoding$Alphabet baseEncoding$Alphabet) {
        super(baseEncoding$Alphabet, (Character) null);
        this.RemoteActionCompatParcelizer = new char[Fields.RotationY];
        char[] cArr = baseEncoding$Alphabet.RemoteActionCompatParcelizer;
        TextStreamsKt.write(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.RemoteActionCompatParcelizer;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | Fields.RotationX] = cArr[i & 15];
        }
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final void IconCompatParcelizer(StringBuilder sb, byte[] bArr, int i) {
        Object[] objArr = {0, Integer.valueOf(i), Integer.valueOf(bArr.length)};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        TextStreamsKt.read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, iWrite);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.RemoteActionCompatParcelizer;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | Fields.RotationX]);
        }
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final BaseEncoding$StandardBaseEncoding write(BaseEncoding$Alphabet baseEncoding$Alphabet, Character ch) {
        return new BaseEncoding$Base16Encoding(baseEncoding$Alphabet);
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final int write(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        if (charSequence.length() % 2 == 1) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.serializer;
            bArr[i2] = (byte) ((baseEncoding$Alphabet.RemoteActionCompatParcelizer(cCharAt) << 4) | baseEncoding$Alphabet.RemoteActionCompatParcelizer(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }
}
