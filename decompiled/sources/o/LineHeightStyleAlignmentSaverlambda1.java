package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleAlignmentSaverlambda1 extends FontWeightSaverlambda0 implements HyphensSaverlambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final List serializer;
    public final boolean write;

    @Override // o.HyphensSaverlambda0
    public final List read() {
        int i = 2 % 2;
        int i2 = read + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        List list = this.serializer;
        int i5 = i3 + 75;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public LineHeightStyleAlignmentSaverlambda1(String str, List list, boolean z) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.serializer = list;
        this.write = z;
    }

    public /* synthetic */ LineHeightStyleAlignmentSaverlambda1(String str, ArrayList arrayList) {
        this(str, arrayList, false);
    }

    public static LineHeightStyleAlignmentSaverlambda1 serializer(LineHeightStyleAlignmentSaverlambda1 lineHeightStyleAlignmentSaverlambda1, boolean z) {
        int i = 2 % 2;
        String str = lineHeightStyleAlignmentSaverlambda1.IconCompatParcelizer;
        List list = lineHeightStyleAlignmentSaverlambda1.serializer;
        str.getClass();
        list.getClass();
        LineHeightStyleAlignmentSaverlambda1 lineHeightStyleAlignmentSaverlambda2 = new LineHeightStyleAlignmentSaverlambda1(str, list, z);
        int i2 = read + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return lineHeightStyleAlignmentSaverlambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.write) + c8$$ExternalSyntheticOutline0.m(this.serializer, this.IconCompatParcelizer.hashCode() * 31, 31);
        int i4 = read + 117;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("SwipeButton(title=", this.IconCompatParcelizer, ", trackingEvents=", this.serializer, ", isLoading="), this.write, ")");
            int i3 = RemoteActionCompatParcelizer + 5;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("SwipeButton(title=", this.IconCompatParcelizer, ", trackingEvents=", this.serializer, ", isLoading="), this.write, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyleAlignmentSaverlambda1)) {
            return false;
        }
        LineHeightStyleAlignmentSaverlambda1 lineHeightStyleAlignmentSaverlambda1 = (LineHeightStyleAlignmentSaverlambda1) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, lineHeightStyleAlignmentSaverlambda1.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, lineHeightStyleAlignmentSaverlambda1.serializer}, getCieXyz.write())).booleanValue() && this.write == lineHeightStyleAlignmentSaverlambda1.write;
        }
        int i4 = read + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
