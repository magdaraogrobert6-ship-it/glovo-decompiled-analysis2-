package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class generateEotflambda3 {
    public final setRootFocusNodeui RemoteActionCompatParcelizer;
    public final List read;
    public final String serializer;

    public final generateOetf write(int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics, getOetfOrigui_graphics getoetforigui_graphics, computePrimariesui_graphics computeprimariesui_graphics) {
        setRootFocusNodeui setrootfocusnodeui = this.RemoteActionCompatParcelizer;
        List list = (List) setrootfocusnodeui.write();
        UrlUtils.serializer(list, "Argument must not be null");
        try {
            List list2 = this.read;
            int size = list2.size();
            generateOetf generateoetfSerializer = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    generateoetfSerializer = ((accesscomputeXYZMatrix) list2.get(i3)).serializer(i, i2, geteotffuncui_graphics, getoetforigui_graphics, computeprimariesui_graphics);
                } catch (com.bumptech.glide.load.engine.GlideException e) {
                    list.add(e);
                }
                if (generateoetfSerializer != null) {
                    break;
                }
            }
            if (generateoetfSerializer == null) {
                throw new com.bumptech.glide.load.engine.GlideException(this.serializer, new ArrayList(list));
            }
            setrootfocusnodeui.IconCompatParcelizer(list);
            return generateoetfSerializer;
        } catch (Throwable th) {
            setrootfocusnodeui.IconCompatParcelizer(list);
            throw th;
        }
    }

    public generateEotflambda3(Class cls, Class cls2, Class cls3, List list, setRootFocusNodeui setrootfocusnodeui) {
        this.RemoteActionCompatParcelizer = setrootfocusnodeui;
        if (list.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must not be empty.");
            throw null;
        }
        this.read = list;
        this.serializer = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.read.toArray()) + '}';
    }
}
