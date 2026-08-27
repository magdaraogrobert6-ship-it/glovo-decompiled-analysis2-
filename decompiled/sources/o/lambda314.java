package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda314 extends lambda311 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final List RemoteActionCompatParcelizer;
    public final String write;

    public lambda314(String str, List list) {
        str.getClass();
        list.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = list;
    }

    public static lambda314 write(lambda314 lambda314Var, ArrayList arrayList) {
        int i = 2 % 2;
        String str = lambda314Var.write;
        str.getClass();
        lambda314 lambda314Var2 = new lambda314(str, arrayList);
        int i2 = serializer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return lambda314Var2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String str = IconCompatParcelizer.read("SelectViewEntity(key=", this.write, ", options=", this.RemoteActionCompatParcelizer, ")");
            int i3 = serializer + 115;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return str;
        }
        IconCompatParcelizer.read("SelectViewEntity(key=", this.write, ", options=", this.RemoteActionCompatParcelizer, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        int i4 = IconCompatParcelizer + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 99;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof lambda314)) {
            int i3 = serializer + 35;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        lambda314 lambda314Var = (lambda314) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, lambda314Var.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, lambda314Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = serializer + 47;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
