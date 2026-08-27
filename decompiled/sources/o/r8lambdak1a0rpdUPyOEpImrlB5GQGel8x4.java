package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.sidemenu.data.model.PhotoIdComponent$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 {
    public static final PhotoIdComponent$Companion Companion = new Object() { // from class: com.roadrunner.sidemenu.data.model.PhotoIdComponent$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 111;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ r8lambdajrjsajiwftcmdebhz2y6rlsl7mq = r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ.IconCompatParcelizer;
                throw null;
            }
            r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ r8lambdajrjsajiwftcmdebhz2y6rlsl7mq2 = r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 3;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
            }
            return r8lambdajrjsajiwftcmdebhz2y6rlsl7mq2;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String idImage;
    public final String logo;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.sidemenu.data.model.PhotoIdComponent$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 111;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.logo = str;
            this.idImage = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PhotoIdComponent(logo=", this.logo, ", idImage=", this.idImage, ")");
        int i4 = read + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.idImage.hashCode() << (this.logo.hashCode() << 119);
        } else {
            iHashCode = (this.logo.hashCode() * 31) + this.idImage.hashCode();
        }
        int i3 = read + 101;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 45;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 105;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4)) {
            int i6 = i2 + 101;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 21;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return false;
            }
            throw null;
        }
        r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 r8lambdak1a0rpdupyoepimrlb5gqgel8x4 = (r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.logo, r8lambdak1a0rpdupyoepimrlb5gqgel8x4.logo}, getCieXyz.write())).booleanValue()) {
            int i10 = write + 89;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.idImage, r8lambdak1a0rpdupyoepimrlb5gqgel8x4.idImage}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i12 = read + 85;
        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
