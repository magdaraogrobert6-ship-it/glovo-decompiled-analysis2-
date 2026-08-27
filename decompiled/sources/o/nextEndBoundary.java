package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nextEndBoundary {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final List read;
    public final String write;

    public nextEndBoundary(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = arrayList;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("OrderItemProduct(quantity=", this.write, ", name=", this.RemoteActionCompatParcelizer, ", orderItemExtraProducts="), this.read, ")");
        int i4 = IconCompatParcelizer + 53;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        List list = this.read;
        if (list == null) {
            int i2 = IconCompatParcelizer + 29;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = list.hashCode();
        }
        int i3 = iM + iHashCode;
        int i4 = serializer + 87;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return i3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (obj instanceof nextEndBoundary) {
            nextEndBoundary nextendboundary = (nextEndBoundary) obj;
            Object[] objArr = {this.write, nextendboundary.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.RemoteActionCompatParcelizer, nextendboundary.RemoteActionCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.read, nextendboundary.read};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        int i2 = IconCompatParcelizer + 89;
                        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                    } else {
                        int i4 = serializer + 45;
                        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            return true;
                        }
                        throw null;
                    }
                }
                return false;
            }
            int i5 = serializer + 109;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = IconCompatParcelizer;
        int i8 = i7 + 23;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        int i10 = i7 + 23;
        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
