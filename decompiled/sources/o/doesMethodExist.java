package o;

import com.huawei.hms.android.SystemUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class doesMethodExist {
    public static doesMethodExist read;
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(doesMethodExist.class.getName());
    public String IconCompatParcelizer = SystemUtils.UNKNOWN;
    public final LinkedHashSet RemoteActionCompatParcelizer = new LinkedHashSet();
    public accessgetLookaheadAndAncestorMeasureSetp serializer = accessgetLookaheadAndAncestorMeasureSetp.write;

    public final void serializer() {
        int size;
        synchronized (this) {
            HashMap map = new HashMap();
            String str = SystemUtils.UNKNOWN;
            byte b = -2147483648;
            for (getDeclaredMethodQuietlylambda0 getdeclaredmethodquietlylambda0 : this.RemoteActionCompatParcelizer) {
                getdeclaredmethodquietlylambda0.getClass();
                if (((getDeclaredMethodQuietlylambda0) map.get("dns")) == null) {
                    map.put("dns", getdeclaredmethodquietlylambda0);
                }
                if (b < 5) {
                    str = "dns";
                    b = 5;
                }
            }
            Set setEntrySet = map.entrySet();
            if (setEntrySet instanceof Collection) {
                Set set = setEntrySet;
                size = setEntrySet.size();
            } else {
                size = 4;
            }
            resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = new resizeGraphicFrameIfAppropriate(size);
            resizegraphicframeifappropriate.read(setEntrySet);
            this.serializer = resizegraphicframeifappropriate.RemoteActionCompatParcelizer();
            this.IconCompatParcelizer = str;
        }
    }
}
