package o;

import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes.dex */
public final class getBitmapui_graphics {
    public final LinkedHashMap RemoteActionCompatParcelizer;
    public final ComponentRegistry$Builder read;

    public final Object write(String str) {
        Object obj;
        ComponentRegistry$Builder componentRegistry$Builder = this.read;
        LinkedHashMap linkedHashMap = (LinkedHashMap) componentRegistry$Builder.write;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) componentRegistry$Builder.IconCompatParcelizer;
        try {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) linkedHashMap2.get(str);
            if (mutableStateFlow != null && (obj = mutableStateFlow.read()) != null) {
                return obj;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) componentRegistry$Builder.RemoteActionCompatParcelizer).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public getBitmapui_graphics() {
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.read = new ComponentRegistry$Builder(SimpleItemTouchHelperCallback.serializer);
    }

    public final void RemoteActionCompatParcelizer(String str, Object obj) {
        if (!setFilterQualityvDHp3xo.write(obj)) {
            obj.getClass();
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't put value with type ", obj.getClass(), " into saved state");
            return;
        }
        Object obj2 = this.RemoteActionCompatParcelizer.get(str);
        AndroidGraphicsContext2 androidGraphicsContext2 = obj2 instanceof AndroidGraphicsContext2 ? (AndroidGraphicsContext2) obj2 : null;
        if (androidGraphicsContext2 != null) {
            androidGraphicsContext2.RemoteActionCompatParcelizer(obj);
        }
        this.read.RemoteActionCompatParcelizer(str, obj);
    }

    public getBitmapui_graphics(safeSetClipToOutline safesetcliptooutline) {
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.read = new ComponentRegistry$Builder(safesetcliptooutline);
    }
}
