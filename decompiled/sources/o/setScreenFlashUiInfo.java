package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class setScreenFlashUiInfo {
    public final int RemoteActionCompatParcelizer;
    public final Map write;

    public final int hashCode() {
        return Integer.hashCode(this.RemoteActionCompatParcelizer) + (this.write.hashCode() * 31);
    }

    public setScreenFlashUiInfo(Map map, int i) {
        map.getClass();
        this.write = map;
        this.RemoteActionCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setScreenFlashUiInfo)) {
            return false;
        }
        setScreenFlashUiInfo setscreenflashuiinfo = (setScreenFlashUiInfo) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setscreenflashuiinfo.write}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == setscreenflashuiinfo.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.write);
        sb.append(", maxSupportedFrameRate=");
        return af$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
