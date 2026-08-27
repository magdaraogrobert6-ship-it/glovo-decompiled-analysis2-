package o;

import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContentType_androidKt {
    public static final LayoutNode$$ExternalSyntheticLambda1 serializer = new LayoutNode$$ExternalSyntheticLambda1(1);

    public static final int RemoteActionCompatParcelizer(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void IconCompatParcelizer(getType gettype, int i, Object obj) {
        int iRemoteActionCompatParcelizer = gettype.RemoteActionCompatParcelizer(i);
        Object[] objArr = gettype.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Object obj2 = objArr[iRemoteActionCompatParcelizer];
        objArr[iRemoteActionCompatParcelizer] = getCreditCardExpirationMonth.write;
        if (obj == obj2) {
            return;
        }
        getCreditCardExpirationDay.read("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final Object IconCompatParcelizer(Object obj, Integer num, Object obj2) {
        createFromBoolean createfromboolean = obj instanceof createFromBoolean ? (createFromBoolean) obj : null;
        if (createfromboolean == null) {
            return null;
        }
        Object obj3 = createfromboolean.read;
        Integer num2 = createfromboolean.RemoteActionCompatParcelizer;
        if (num2.equals(num)) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, obj2}, getCieXyz.write())).booleanValue()) {
                return obj;
            }
        }
        Object objIconCompatParcelizer = IconCompatParcelizer(num2, num, obj2);
        return objIconCompatParcelizer == null ? IconCompatParcelizer(obj3, num, obj2) : objIconCompatParcelizer;
    }

    public static final void read(List list, int i, int i2) {
        int iWrite = write(i, list);
        if (iWrite < 0) {
            iWrite = -(iWrite + 1);
        }
        while (iWrite < list.size() && ((FillableDataCompanion) list.get(iWrite)).RemoteActionCompatParcelizer < i2) {
        }
    }

    public static final int write(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iSerializer = removeNodeAtDepth.serializer(((FillableDataCompanion) list.get(i3)).RemoteActionCompatParcelizer, i);
            if (iSerializer < 0) {
                i2 = i3 + 1;
            } else {
                if (iSerializer <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}
