package o;

import com.mapbox.maps.plugin.animation.CameraAnimatorChangeListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i2ExternalSyntheticLambda2 implements CameraAnimatorChangeListener, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;

    public i2ExternalSyntheticLambda2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        int i = 2 % 2;
        int i2 = read + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        int i3 = 63 / 0;
        return this.RemoteActionCompatParcelizer;
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimatorChangeListener
    public final /* synthetic */ void onChanged(Object obj) {
        int i = 2 % 2;
        int i2 = read + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer.invoke(obj);
        int i4 = read + 9;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = serializer + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (!(obj instanceof CameraAnimatorChangeListener) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
            int i5 = i2 + 75;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        Object[] objArr = {this.RemoteActionCompatParcelizer, ((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
