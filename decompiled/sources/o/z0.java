package o;

import java.util.ArrayList;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final ArrayList IconCompatParcelizer;
    public final LocalDate write;

    public z0(LocalDate localDate, ArrayList arrayList) {
        localDate.getClass();
        this.write = localDate;
        this.IconCompatParcelizer = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer.hashCode() << (this.write.hashCode() - 126);
        }
        return (this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "History(date=" + this.write + ", deliveries=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 91;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 0 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            Object[] objArr = {this.write, z0Var.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i5 = serializer + 101;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 5;
                }
            } else if (this.IconCompatParcelizer.equals(z0Var.IconCompatParcelizer)) {
                return true;
            }
        } else {
            int i7 = i2 + 125;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return false;
    }
}
