package o;

import com.mapbox.maps.Style;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hh implements Style.OnStyleLoaded, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    public hh(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        throw null;
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final /* synthetic */ void onStyleLoaded(Style style) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read.invoke(style);
        int i4 = RemoteActionCompatParcelizer + 85;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 25;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof Style.OnStyleLoaded)) {
            return false;
        }
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            boolean z = obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
            throw null;
        }
        if (!(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
            return false;
        }
        boolean zEquals = this.read.equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
        int i3 = serializer + 63;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zEquals;
    }
}
