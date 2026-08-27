package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class onPreviewKeyEvent implements Iterable, Serializable {
    public static final onPreviewKeyEvent IconCompatParcelizer = new onPreviewKeyEvent(accessonPreScrollOzD1aCkjd.serializer);
    public int RemoteActionCompatParcelizer = 0;
    public final byte[] serializer;

    static {
        int i = isShiftPressedZmokQxo.read;
    }

    public static onPreviewKeyEvent IconCompatParcelizer(byte[] bArr, int i, int i2) {
        serializer(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new onPreviewKeyEvent(bArr2);
    }

    public int RemoteActionCompatParcelizer() {
        return this.serializer.length;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM(this);
    }

    public byte read(int i) {
        return this.serializer[i];
    }

    public final String toString() {
        String strConcat;
        java.util.Locale locale = java.util.Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (RemoteActionCompatParcelizer() <= 50) {
            strConcat = accessgetNestedCoroutineScope.RemoteActionCompatParcelizer(this);
        } else {
            int iSerializer = serializer(0, 47, RemoteActionCompatParcelizer());
            strConcat = accessgetNestedCoroutineScope.RemoteActionCompatParcelizer(iSerializer == 0 ? IconCompatParcelizer : new onPreKeyEventZmokQxo(this.serializer, iSerializer)).concat("...");
        }
        return ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("<ByteString@", iRemoteActionCompatParcelizer, hexString, " size=", " contents=\""), strConcat, "\">");
    }

    public byte write(int i) {
        return this.serializer[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z = obj instanceof onPreviewKeyEvent;
        if (z) {
            onPreviewKeyEvent onpreviewkeyevent = (onPreviewKeyEvent) obj;
            if (RemoteActionCompatParcelizer() == onpreviewkeyevent.RemoteActionCompatParcelizer()) {
                if (RemoteActionCompatParcelizer() == 0) {
                    return true;
                }
                if (z) {
                    int i = this.RemoteActionCompatParcelizer;
                    int i2 = onpreviewkeyevent.RemoteActionCompatParcelizer;
                    if (i == 0 || i2 == 0 || i == i2) {
                        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                        if (iRemoteActionCompatParcelizer <= onpreviewkeyevent.RemoteActionCompatParcelizer()) {
                            if (iRemoteActionCompatParcelizer <= onpreviewkeyevent.RemoteActionCompatParcelizer()) {
                                byte[] bArr = onpreviewkeyevent.serializer;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < iRemoteActionCompatParcelizer) {
                                    if (this.serializer[i3] == bArr[i4]) {
                                        i3++;
                                        i4++;
                                    }
                                }
                                return true;
                            }
                            int iRemoteActionCompatParcelizer2 = onpreviewkeyevent.RemoteActionCompatParcelizer();
                            StringBuilder sb = new StringBuilder(String.valueOf(iRemoteActionCompatParcelizer).length() + 27 + String.valueOf(iRemoteActionCompatParcelizer2).length());
                            sb.append("Ran off end of other: 0, ");
                            sb.append(iRemoteActionCompatParcelizer);
                            sb.append(", ");
                            sb.append(iRemoteActionCompatParcelizer2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iRemoteActionCompatParcelizer).length() + 18 + String.valueOf(iRemoteActionCompatParcelizer3).length());
                        sb2.append("Length too large: ");
                        sb2.append(iRemoteActionCompatParcelizer);
                        sb2.append(iRemoteActionCompatParcelizer3);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    return obj.equals(this);
                }
            }
        }
        return false;
    }

    public onPreviewKeyEvent(byte[] bArr) {
        bArr.getClass();
        this.serializer = bArr;
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i2 = iRemoteActionCompatParcelizer;
        for (int i3 = 0; i3 < iRemoteActionCompatParcelizer; i3++) {
            i2 = (i2 * 31) + this.serializer[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.RemoteActionCompatParcelizer = i2;
        return i2;
    }

    public static int serializer(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
}
