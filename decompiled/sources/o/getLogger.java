package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getLogger {
    private static int read = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public getLogger(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ReportDetails(startDate=", this.RemoteActionCompatParcelizer, ", lastUpdated=", this.write, ")");
            int i3 = serializer + 7;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ReportDetails(startDate=", this.RemoteActionCompatParcelizer, ", lastUpdated=", this.write, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        String str = this.write;
        if (str == null) {
            int i4 = read + 47;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getLogger) {
            getLogger getlogger = (getLogger) obj;
            if (this.RemoteActionCompatParcelizer.equals(getlogger.RemoteActionCompatParcelizer)) {
                Object[] objArr = {this.write, getlogger.write};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        int i4 = serializer + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
