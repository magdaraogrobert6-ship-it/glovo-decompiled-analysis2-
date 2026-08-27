package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ah {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final List IconCompatParcelizer;

    public ah(List list) {
        list.getClass();
        this.IconCompatParcelizer = list;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("FilterableSelectionState(placeholder=2132018384, data=", ")", this.IconCompatParcelizer);
        int i4 = RemoteActionCompatParcelizer + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (Integer.hashCode(com.logistics.rider.glovo.R.string.login_country_selection_search_placeholder) * 31);
        int i4 = read + 81;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 5;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof ah) {
            Object[] objArr = {this.IconCompatParcelizer, ((ah) obj).IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        int i6 = RemoteActionCompatParcelizer + 43;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
