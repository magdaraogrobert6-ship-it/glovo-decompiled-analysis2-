package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.recentdeliveries.data.model.Earnings$Companion;
import kotlinx.serialization.Serializable;
import o.preLaunchActionsI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class pauseSendingI {
    public static final Earnings$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.Earnings$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 119;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            preLaunchActionsI prelaunchactionsi = preLaunchActionsI.RemoteActionCompatParcelizer;
            int i4 = write + 113;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return prelaunchactionsi;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String label;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.Earnings$Companion] */
    static {
        int i = serializer + 13;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 89 / 0;
        }
    }

    public /* synthetic */ pauseSendingI(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.label = str;
            this.url = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, preLaunchActionsI.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Earnings(label=", this.label, ", url=", this.url, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Earnings(label=", this.label, ", url=", this.url, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.url.hashCode() + (this.label.hashCode() * 31);
        int i4 = write + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 65;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof pauseSendingI)) {
            return false;
        }
        pauseSendingI pausesendingi = (pauseSendingI) obj;
        Object[] objArr = {this.label, pausesendingi.label};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.url, pausesendingi.url};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                int i7 = read + 111;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return true;
            }
            int i9 = read + 55;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = write + 111;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
