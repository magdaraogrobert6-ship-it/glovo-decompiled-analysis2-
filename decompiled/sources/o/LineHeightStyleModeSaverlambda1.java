package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleModeSaverlambda1 extends FontWeightSaverlambda0 implements HyphensSaverlambda0 {
    private static int RatingCompat = 1;
    private static int serializer;
    public final List IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final LineHeightStyleModeSaverlambda0 read;
    public final String write;

    public LineHeightStyleModeSaverlambda1(String str, ArrayList arrayList, long j) {
        LineHeightStyleModeSaverlambda0 lineHeightStyleModeSaverlambda0 = new LineHeightStyleModeSaverlambda0();
        str.getClass();
        this.write = str;
        this.IconCompatParcelizer = arrayList;
        this.RemoteActionCompatParcelizer = j;
        this.read = lineHeightStyleModeSaverlambda0;
    }

    @Override // o.HyphensSaverlambda0
    public final List read() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        List list = this.IconCompatParcelizer;
        int i5 = i3 + 5;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.write.hashCode() * 31, 31), 31, false), 31, this.RemoteActionCompatParcelizer);
        int i4 = serializer + 37;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 37;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("SwipeButtonWithCountDown(title=", this.write, ", trackingEvents=", this.IconCompatParcelizer, ", isLoading=false, totalSecondsLeft=");
        sbSerializer.append(this.RemoteActionCompatParcelizer);
        sbSerializer.append(", countdownState=");
        sbSerializer.append(this.read);
        sbSerializer.append(")");
        String string = sbSerializer.toString();
        int i4 = serializer + 91;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 83;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LineHeightStyleModeSaverlambda1) {
            LineHeightStyleModeSaverlambda1 lineHeightStyleModeSaverlambda1 = (LineHeightStyleModeSaverlambda1) obj;
            Object[] objArr = {this.write, lineHeightStyleModeSaverlambda1.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer.equals(lineHeightStyleModeSaverlambda1.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == lineHeightStyleModeSaverlambda1.RemoteActionCompatParcelizer && this.read.equals(lineHeightStyleModeSaverlambda1.read)) {
                return true;
            }
        }
        int i4 = RatingCompat + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
