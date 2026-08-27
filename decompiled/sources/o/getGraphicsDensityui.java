package o;

import com.deliveryhero.fwf_http.ConstantKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getGraphicsDensityui {
    public static final getGraphicsDensityui read = new getGraphicsDensityui(onMove.serializer(new LinkedHashMap()));
    public final Map serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public getGraphicsDensityui(Map map) {
        this.serializer = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getGraphicsDensityui) && this.serializer.equals(((getGraphicsDensityui) obj).serializer);
    }

    public final String RemoteActionCompatParcelizer() {
        String lowerCase = ConstantKt.CONTENT_TYPE_HEADER.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        List list = (List) this.serializer.get(lowerCase);
        if (list != null) {
            return (String) onContentCardDismissed.MediaBrowserCompatMediaItem(list);
        }
        return null;
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.serializer + ")";
    }
}
