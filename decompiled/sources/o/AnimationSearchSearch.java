package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationSearchSearch {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final Map IconCompatParcelizer;
    public final String read;

    public AnimationSearchSearch(String str, Map map) {
        str.getClass();
        map.getClass();
        this.read = str;
        this.IconCompatParcelizer = map;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() * (this.read.hashCode() << 100);
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
        }
        int i3 = write + 7;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ApiCallParams(url=" + this.read + ", request=" + this.IconCompatParcelizer + ")";
        int i2 = write + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationSearchSearch)) {
            int i2 = RemoteActionCompatParcelizer + 55;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        AnimationSearchSearch animationSearchSearch = (AnimationSearchSearch) obj;
        Object[] objArr = {this.read, animationSearchSearch.read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.IconCompatParcelizer, animationSearchSearch.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = write + 53;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 35;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
