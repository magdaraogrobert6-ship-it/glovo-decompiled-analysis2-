package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class logErrorui_tooling {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final long write;

    public logErrorui_tooling(long j, ArrayList arrayList) {
        this.write = j;
        this.read = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(Boolean.hashCode(true) * 31, 31, this.write);
        int i4 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Params(usePath=true, deliveryId=" + this.write + ", uploadTasks=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof logErrorui_tooling) {
            logErrorui_tooling logerrorui_tooling = (logErrorui_tooling) obj;
            if (this.write == logerrorui_tooling.write && this.read.equals(logerrorui_tooling.read)) {
                return true;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String read(r8lambdatGneqyXrP1uOJD5LacwlDLETgw8 r8lambdatgneqyxrp1uojd5lacwldletgw8) {
        int i = 2 % 2;
        r8lambdatgneqyxrp1uojd5lacwldletgw8.getClass();
        boolean z = r8lambdatgneqyxrp1uojd5lacwldletgw8 instanceof setComposableContentlambda1;
        long j = this.write;
        if (z) {
            String str = j + "-" + ((setComposableContentlambda1) r8lambdatgneqyxrp1uojd5lacwldletgw8).IconCompatParcelizer;
            int i2 = IconCompatParcelizer + 87;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }
        if (!(r8lambdatgneqyxrp1uojd5lacwldletgw8 instanceof setParameterizedContentlambda01)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Executable task is not a picture task");
            int i4 = IconCompatParcelizer + 49;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        return j + "-" + ((setParameterizedContentlambda01) r8lambdatgneqyxrp1uojd5lacwldletgw8).read;
    }
}
