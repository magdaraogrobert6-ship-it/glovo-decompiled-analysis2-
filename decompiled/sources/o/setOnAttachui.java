package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setOnAttachui implements Iterable, Serializable {
    public static final setOnDetachui IconCompatParcelizer = new setOnDetachui(getMinimumTouchTargetSizeMYxV2XQ.IconCompatParcelizer);
    public static final setIntrinsicsUsageByParentui write;
    public int RemoteActionCompatParcelizer;

    public abstract byte IconCompatParcelizer(int i);

    public abstract int IconCompatParcelizer();

    public abstract byte RemoteActionCompatParcelizer(int i);

    public abstract void serializer(int i, byte[] bArr);

    static {
        write = setHasPositionalLayerTransformationsInOffsetFromRootui.serializer() ? new setSemanticsId() : new com.huawei.hmf.tasks.a.j(24);
    }

    public static setOnDetachui RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        IconCompatParcelizer(i, i + i2, bArr.length);
        return new setOnDetachui(write.read(bArr, i, i2));
    }

    public final String toString() {
        String strConcat;
        java.util.Locale locale = java.util.Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iIconCompatParcelizer = IconCompatParcelizer();
        if (IconCompatParcelizer() <= 50) {
            strConcat = getMeasureBlock.RemoteActionCompatParcelizer(this);
        } else {
            setOnDetachui setondetachui = (setOnDetachui) this;
            int iIconCompatParcelizer2 = IconCompatParcelizer(0, 47, setondetachui.IconCompatParcelizer());
            strConcat = getMeasureBlock.RemoteActionCompatParcelizer(iIconCompatParcelizer2 == 0 ? IconCompatParcelizer : new setNeedsOnGloballyPositionedDispatchui(setondetachui.RatingCompat, setondetachui.write(), iIconCompatParcelizer2)).concat("...");
        }
        return ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("<ByteString@", iIconCompatParcelizer, hexString, " size=", " contents=\""), strConcat, "\">");
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i;
        }
        int iIconCompatParcelizer = IconCompatParcelizer();
        setOnDetachui setondetachui = (setOnDetachui) this;
        int iWrite = setondetachui.write();
        int i2 = iIconCompatParcelizer;
        for (int i3 = iWrite; i3 < iWrite + iIconCompatParcelizer; i3++) {
            i2 = (i2 * 31) + setondetachui.RatingCompat[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.RemoteActionCompatParcelizer = i2;
        return i2;
    }

    public final byte[] read() {
        int iIconCompatParcelizer = IconCompatParcelizer();
        if (iIconCompatParcelizer == 0) {
            return getMinimumTouchTargetSizeMYxV2XQ.IconCompatParcelizer;
        }
        byte[] bArr = new byte[iIconCompatParcelizer];
        serializer(iIconCompatParcelizer, bArr);
        return bArr;
    }

    public static int IconCompatParcelizer(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i2, "End index: ", i3, " >= "));
        return 0;
    }
}
