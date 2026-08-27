package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.NestNavBarItem$Companion;
import kotlinx.serialization.Serializable;
import o.BuildConfig;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class access000 {
    public static final NestNavBarItem$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.NestNavBarItem$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 75;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return BuildConfig.RemoteActionCompatParcelizer;
            }
            int i3 = 12 / 0;
            return BuildConfig.RemoteActionCompatParcelizer;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String type;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.NestNavBarItem$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 3;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ access000(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.url = str;
            this.type = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, BuildConfig.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NestNavBarItem(url=", this.url, ", type=", this.type, ")");
        }
        int i3 = 7 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NestNavBarItem(url=", this.url, ", type=", this.type, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.type.hashCode() >> (this.url.hashCode() >>> 87);
        }
        return (this.url.hashCode() * 31) + this.type.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof access000)) {
                int i2 = read + 31;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            access000 access000Var = (access000) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, access000Var.url}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, access000Var.type}, getCieXyz.write())).booleanValue())) {
                    return true;
                }
                int i3 = read + 43;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = serializer + 67;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = read + 53;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
