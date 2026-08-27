package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import kotlin.collections.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setOptionalTextView {
    public static final Registry RemoteActionCompatParcelizer = new Registry();

    public static final boolean write(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String IconCompatParcelizer(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = ApiException.RemoteActionCompatParcelizer;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        AbstractList.MediaDescriptionCompat.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.write(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final void RemoteActionCompatParcelizer(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "size=", " offset=");
            sbM.append(j2);
            sbM.append(" byteCount=");
            sbM.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM.toString());
        }
    }

    public static final String write(byte b) {
        char[] cArr = ApiException.RemoteActionCompatParcelizer;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }
}
