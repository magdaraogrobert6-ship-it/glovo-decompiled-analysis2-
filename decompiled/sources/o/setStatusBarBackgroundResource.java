package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class setStatusBarBackgroundResource implements resizeToBitmapDimensionslambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final boolean serializer;

    public setStatusBarBackgroundResource(String str, boolean z) {
        this.IconCompatParcelizer = str;
        this.serializer = z;
        androidx.compose.runtime.CompositionKt.serializer(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(21, this));
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.IconCompatParcelizer;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = read + 35;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return Boolean.hashCode(this.serializer) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, false), 31, false);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 121;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 31;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            int i6 = 3 / 5;
            return true;
        }
        if (obj instanceof setStatusBarBackgroundResource) {
            setStatusBarBackgroundResource setstatusbarbackgroundresource = (setStatusBarBackgroundResource) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setstatusbarbackgroundresource.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == setstatusbarbackgroundresource.serializer;
        }
        int i7 = i2 + 87;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "IdentityPopupViewState(privacyPolicyUrl=" + this.IconCompatParcelizer + ", showLoading=false, isScreenStateLoaded=false, isDismissable=" + this.serializer + ")";
        int i2 = read + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
