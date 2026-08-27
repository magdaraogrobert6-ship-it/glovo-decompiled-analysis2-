package com.deliveryhero.customerchat.analytics.model;

import androidx.compose.ui.text.android.LayoutCompat;
import java.util.Map;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class Screen {
    private final Map<String, String> details;
    private final String name;

    public final String component1() {
        return this.name;
    }

    public final Map<String, String> component2() {
        return this.details;
    }

    public final Map<String, String> getDetails() {
        return this.details;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        Map<String, String> map = this.details;
        return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
    }

    public Screen(@getDensityDpi(serializer = "name") String str, @getDensityDpi(serializer = "details") Map<String, String> map) {
        str.getClass();
        this.name = str;
        this.details = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Screen copy$default(Screen screen, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = screen.name;
        }
        if ((i & 2) != 0) {
            map = screen.details;
        }
        return screen.copy(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Screen)) {
            return false;
        }
        Screen screen = (Screen) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, screen.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, screen.details}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Screen(name=");
        sb.append(this.name);
        sb.append(", details=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, (Map) this.details, ')');
    }

    public final Screen copy(@getDensityDpi(serializer = "name") String str, @getDensityDpi(serializer = "details") Map<String, String> map) {
        str.getClass();
        return new Screen(str, map);
    }
}
