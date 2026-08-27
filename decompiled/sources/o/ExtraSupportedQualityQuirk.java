package o;

import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ExtraSupportedQualityQuirk implements Enumeration {
    public int IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    @Override // java.util.Enumeration
    public final Object nextElement() {
        if (this.serializer != 0) {
            this.IconCompatParcelizer++;
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (ExtraSupportedResolutionQuirk extraSupportedResolutionQuirk : CodecStuckOnFlushQuirk.serializer[this.IconCompatParcelizer]) {
            map.put(extraSupportedResolutionQuirk.RemoteActionCompatParcelizer, extraSupportedResolutionQuirk);
        }
        this.IconCompatParcelizer++;
        return map;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        if (this.serializer != 0) {
            int i = this.IconCompatParcelizer;
            ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr = CodecStuckOnFlushQuirk.read;
            return i < 4;
        }
        int i2 = this.IconCompatParcelizer;
        ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr2 = CodecStuckOnFlushQuirk.read;
        return i2 < 4;
    }
}
