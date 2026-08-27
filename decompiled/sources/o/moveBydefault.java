package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class moveBydefault {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final int read(int i, onRelease onrelease, Object obj) {
        int iSerializer;
        int i2 = 2 % 2;
        int i3 = serializer + 79;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
            if (obj != null) {
                if (onrelease.serializer() != 0) {
                    if (i < onrelease.serializer()) {
                        int i5 = IconCompatParcelizer + 87;
                        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        if (!obj.equals(onrelease.write(i))) {
                            iSerializer = onrelease.serializer(obj);
                            if (iSerializer != -1) {
                                return iSerializer;
                            }
                        }
                    } else {
                        iSerializer = onrelease.serializer(obj);
                        if (iSerializer != -1) {
                            return iSerializer;
                        }
                    }
                }
            }
        } else if (obj != null) {
            if (onrelease.serializer() != 0) {
                if (i < onrelease.serializer()) {
                    int i7 = IconCompatParcelizer + 87;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (!obj.equals(onrelease.write(i))) {
                        iSerializer = onrelease.serializer(obj);
                        if (iSerializer != -1) {
                            return iSerializer;
                        }
                    }
                } else {
                    iSerializer = onrelease.serializer(obj);
                    if (iSerializer != -1) {
                        return iSerializer;
                    }
                }
            }
        }
        return i;
    }

    public static final markAsRead read(PackageHandler3 packageHandler3) {
        int i = 2 % 2;
        String str = packageHandler3.startTime;
        hasNotBeenRead hasnotbeenread = new hasNotBeenRead(str, str);
        List<writePackageQueueI> list = packageHandler3.endTimes;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (writePackageQueueI writepackagequeuei : list) {
            String str2 = writepackagequeuei.endTime;
            hasNotBeenRead hasnotbeenread2 = new hasNotBeenRead(str2, str2);
            Boolean bool = writepackagequeuei.isDefault;
            boolean zBooleanValue = false;
            if (bool != null) {
                int i2 = IconCompatParcelizer + 43;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 52 / 0;
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = bool.booleanValue();
                }
            } else {
                int i4 = serializer + 95;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            arrayList.add(new readContentProvider(hasnotbeenread2, zBooleanValue));
        }
        return new markAsRead(hasnotbeenread, arrayList);
    }
}
