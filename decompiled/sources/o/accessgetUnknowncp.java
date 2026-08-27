package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetUnknowncp {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final Set read = RangesKt.write((Object) "name");
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final String serializer(Map map) {
        int i = 2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("{");
        for (Map.Entry entry : map.entrySet()) {
            if (sbM.length() > 1) {
                sbM.append(", ");
            }
            sbM.append((String) entry.getKey());
            sbM.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Set set = read;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int i2 = serializer + 47;
                        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        if (!(!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) entry.getKey(), (CharSequence) it.next(), true))) {
                            int i4 = write + 15;
                            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                sbM.append("REDACTED");
                                int i5 = 17 / 0;
                                break;
                            }
                            sbM.append("REDACTED");
                            break;
                        }
                    }
                }
            }
            sbM.append((String) entry.getValue());
        }
        sbM.append("}");
        return sbM.toString();
    }
}
