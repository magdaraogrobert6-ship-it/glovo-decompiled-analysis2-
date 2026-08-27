package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class accesscreateCache {
    public int[] IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public C0184logger read;

    public final int[] RemoteActionCompatParcelizer(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return iArr3;
            }
            C0184logger c0184logger = this.read;
            int i = iArr3[length];
            int i2 = iArr[length];
            c0184logger.getClass();
            iArr3[length] = i ^ i2;
        }
    }

    public final int RemoteActionCompatParcelizer(int i) {
        if (i < 0 || i > this.RemoteActionCompatParcelizer) {
            return 0;
        }
        return this.IconCompatParcelizer[i];
    }

    public final int hashCode() {
        int i = this.read.write;
        int i2 = 0;
        while (true) {
            int[] iArr = this.IconCompatParcelizer;
            if (i2 >= iArr.length) {
                return i;
            }
            i = (i * 31) + iArr[i2];
            i2++;
        }
    }

    public final void serializer() {
        int length = this.IconCompatParcelizer.length;
        do {
            length--;
            this.RemoteActionCompatParcelizer = length;
            if (length < 0) {
                return;
            }
        } while (this.IconCompatParcelizer[length] == 0);
    }

    public accesscreateCache(C0184logger c0184logger, int[] iArr) {
        int[] iArr2;
        this.read = c0184logger;
        int iSerializer = serializer(iArr);
        if (iSerializer == -1) {
            iArr2 = new int[1];
        } else {
            int i = iSerializer + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.IconCompatParcelizer = iArr2;
        serializer();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof accesscreateCache)) {
            accesscreateCache accesscreatecache = (accesscreateCache) obj;
            if (this.read.equals(accesscreatecache.read) && this.RemoteActionCompatParcelizer == accesscreatecache.RemoteActionCompatParcelizer) {
                int[] iArr = this.IconCompatParcelizer;
                int[] iArr2 = accesscreatecache.IconCompatParcelizer;
                int iSerializer = serializer(iArr);
                if (iSerializer == serializer(iArr2)) {
                    for (int i = 0; i <= iSerializer; i++) {
                        if (iArr[i] == iArr2[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(" Polynomial over ");
        C0184logger c0184logger = this.read;
        sb.append(c0184logger.toString());
        sb.append(": \n");
        String string = sb.toString();
        for (int i = 0; i < this.IconCompatParcelizer.length; i++) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m(string);
            int i2 = this.IconCompatParcelizer[i];
            String strConcat = "";
            for (int i3 = 0; i3 < c0184logger.IconCompatParcelizer; i3++) {
                if ((((byte) i2) & 1) == 0) {
                    str = "0";
                } else {
                    str = "1";
                }
                strConcat = str.concat(strConcat);
                i2 >>>= 1;
            }
            sbM.append(strConcat);
            sbM.append("Y^");
            sbM.append(i);
            sbM.append("+");
            string = sbM.toString();
        }
        return string.concat(";");
    }

    public final int[] serializer(int[] iArr, int i) {
        int iSerializer = serializer(iArr);
        if (iSerializer == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        int[] iArr3 = new int[iSerializer + 1];
        while (iSerializer >= 0) {
            iArr3[iSerializer] = setPlacementApproachInProgress.read(iArr[iSerializer], i, this.read.write);
            iSerializer--;
        }
        return iArr3;
    }

    public static int serializer(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public accesscreateCache() {
    }
}
