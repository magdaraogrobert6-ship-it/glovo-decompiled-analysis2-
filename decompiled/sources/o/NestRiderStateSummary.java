package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class NestRiderStateSummary extends StaggeredGridLayoutManager {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String IconCompatParcelizer;
    public final String serializer;
    public final String write;

    public NestRiderStateSummary(String str, String str2, String str3) {
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer) + this.serializer.hashCode();
        }
        return this.serializer.hashCode() >> af$$ExternalSyntheticOutline0.m(this.write.hashCode() + 11, 17, this.IconCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("NoBookableShifts(title=", this.write, ", subTitle=", this.IconCompatParcelizer, ", buttonText="), this.serializer, ")");
            int i3 = RemoteActionCompatParcelizer + 15;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 62 / 0;
            }
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("NoBookableShifts(title=", this.write, ", subTitle=", this.IconCompatParcelizer, ", buttonText="), this.serializer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NestRiderStateSummary)) {
            return false;
        }
        NestRiderStateSummary nestRiderStateSummary = (NestRiderStateSummary) obj;
        if (this.write.equals(nestRiderStateSummary.write)) {
            return this.IconCompatParcelizer.equals(nestRiderStateSummary.IconCompatParcelizer) && this.serializer.equals(nestRiderStateSummary.serializer);
        }
        int i3 = read + 21;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
