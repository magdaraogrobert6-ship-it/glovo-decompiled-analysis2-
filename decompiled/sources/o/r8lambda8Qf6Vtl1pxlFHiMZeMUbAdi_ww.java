package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww implements VerbatimTtsAnnotation {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final setAttachedViewTreeObserver IconCompatParcelizer;
    public final List serializer;
    public final String write;

    public r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww(String str, List list, setAttachedViewTreeObserver setattachedviewtreeobserver) {
        str.getClass();
        list.getClass();
        setattachedviewtreeobserver.getClass();
        this.write = str;
        this.serializer = list;
        this.IconCompatParcelizer = setattachedviewtreeobserver;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + c8$$ExternalSyntheticOutline0.m(this.serializer, this.write.hashCode() * 31, 31);
        int i4 = RemoteActionCompatParcelizer + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("DefaultDeclineButton(title=", this.write, ", events=", this.serializer, ", confirmation=");
        sbSerializer.append(this.IconCompatParcelizer);
        sbSerializer.append(")");
        String string = sbSerializer.toString();
        int i4 = read + 109;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww)) {
            return false;
        }
        r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww r8lambda8qf6vtl1pxlfhimzemubadi_ww = (r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambda8qf6vtl1pxlfhimzemubadi_ww.write}, getCieXyz.write())).booleanValue()) {
            int i3 = RemoteActionCompatParcelizer + 61;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambda8qf6vtl1pxlfhimzemubadi_ww.serializer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambda8qf6vtl1pxlfhimzemubadi_ww.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i5 = RemoteActionCompatParcelizer + 27;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
