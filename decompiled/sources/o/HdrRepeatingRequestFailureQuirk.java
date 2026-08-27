package o;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HdrRepeatingRequestFailureQuirk implements Enumeration {
    public final Enumeration read;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.read.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.read.nextElement());
    }

    public HdrRepeatingRequestFailureQuirk(ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk) {
        this.read = Collections.enumeration(excludeStretchedVideoQualityQuirk.serializer);
    }
}
