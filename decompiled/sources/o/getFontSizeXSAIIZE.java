package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getFontSizeXSAIIZE {
    public final getFontStyle4Lr2A7w serializer;
    public final int[] write;

    public final int RemoteActionCompatParcelizer() {
        return this.write.length - 1;
    }

    public final getFontSizeXSAIIZE serializer(getFontSizeXSAIIZE getfontsizexsaiize) {
        getFontStyle4Lr2A7w getfontstyle4lr2a7w = getfontsizexsaiize.serializer;
        getFontStyle4Lr2A7w getfontstyle4lr2a7w2 = this.serializer;
        if (!getfontstyle4lr2a7w2.equals(getfontstyle4lr2a7w)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (read()) {
            return getfontsizexsaiize;
        }
        if (getfontsizexsaiize.read()) {
            return this;
        }
        int[] iArr = getfontsizexsaiize.write;
        int[] iArr2 = this.write;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new getFontSizeXSAIIZE(getfontstyle4lr2a7w2, iArr3);
    }

    public getFontSizeXSAIIZE(getFontStyle4Lr2A7w getfontstyle4lr2a7w, int[] iArr) {
        if (iArr.length == 0) {
            DrawableTransformation.write();
            throw null;
        }
        this.serializer = getfontstyle4lr2a7w;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.write = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.write = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.write = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final boolean read() {
        return this.write[0] == 0;
    }

    public final String toString() {
        if (read()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(RemoteActionCompatParcelizer() * 8);
        for (int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(); iRemoteActionCompatParcelizer >= 0; iRemoteActionCompatParcelizer--) {
            int[] iArr = this.write;
            int i = iArr[(iArr.length - 1) - iRemoteActionCompatParcelizer];
            if (i != 0) {
                if (i < 0) {
                    if (iRemoteActionCompatParcelizer == RemoteActionCompatParcelizer()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iRemoteActionCompatParcelizer == 0 || i != 1) {
                    getFontStyle4Lr2A7w getfontstyle4lr2a7w = this.serializer;
                    if (i == 0) {
                        getfontstyle4lr2a7w.getClass();
                        DrawableTransformation.write();
                        return null;
                    }
                    int i2 = getfontstyle4lr2a7w.IconCompatParcelizer[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
                    }
                }
                if (iRemoteActionCompatParcelizer != 0) {
                    if (iRemoteActionCompatParcelizer == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iRemoteActionCompatParcelizer);
                    }
                }
            }
        }
        return sb.toString();
    }
}
