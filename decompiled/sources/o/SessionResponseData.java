package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionResponseData implements SdkClickHandler2 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final SdkClickHandler1 RemoteActionCompatParcelizer;
    public final List read;
    public final boolean write;

    public SessionResponseData(SdkClickHandler1 sdkClickHandler1, List list, boolean z) {
        this.RemoteActionCompatParcelizer = sdkClickHandler1;
        this.read = list;
        this.write = z;
    }

    public static SessionResponseData read(SessionResponseData sessionResponseData, boolean z) {
        int i = 2 % 2;
        SdkClickHandler1 sdkClickHandler1 = sessionResponseData.RemoteActionCompatParcelizer;
        List list = sessionResponseData.read;
        sessionResponseData.getClass();
        SessionResponseData sessionResponseData2 = new SessionResponseData(sdkClickHandler1, list, z);
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return sessionResponseData2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        SdkClickHandler1 sdkClickHandler1 = this.RemoteActionCompatParcelizer;
        if (sdkClickHandler1 == null) {
            iHashCode = 0;
        } else {
            iHashCode = sdkClickHandler1.hashCode();
            int i2 = IconCompatParcelizer + 83;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int iHashCode2 = Boolean.hashCode(this.write) + c8$$ExternalSyntheticOutline0.m(this.read, iHashCode * 31, 31);
        int i4 = IconCompatParcelizer + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Available(description=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", actions=");
        sb.append(this.read);
        sb.append(", actionsEnabled=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.write, ")");
        int i2 = serializer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 107;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof SessionResponseData) {
            SessionResponseData sessionResponseData = (SessionResponseData) obj;
            Object[] objArr = {this.RemoteActionCompatParcelizer, sessionResponseData.RemoteActionCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.read.equals(sessionResponseData.read) && this.write == sessionResponseData.write) {
                return true;
            }
        } else {
            int i5 = i2 + 21;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return false;
    }
}
