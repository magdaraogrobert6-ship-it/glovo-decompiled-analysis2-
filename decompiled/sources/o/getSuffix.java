package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.safety.authentication.data.SentianceAuthCodeResponse$Companion;
import kotlinx.serialization.Serializable;
import o.getPartnerParameters;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getSuffix {
    public static final SentianceAuthCodeResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.safety.authentication.data.SentianceAuthCodeResponse$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 105;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPartnerParameters getpartnerparameters = getPartnerParameters.read;
            int i4 = read + 37;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return getpartnerparameters;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String authCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.safety.authentication.data.SentianceAuthCodeResponse$Companion] */
    static {
        int i = serializer + 107;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getSuffix(int i, String str) {
        if (1 == (i & 1)) {
            this.authCode = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getPartnerParameters.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.authCode.hashCode();
        int i4 = write + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("SentianceAuthCodeResponse(authCode=", this.authCode, ")");
        }
        int i3 = 77 / 0;
        return ff$$ExternalSyntheticOutline0.m("SentianceAuthCodeResponse(authCode=", this.authCode, ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 101;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getSuffix)) {
            return false;
        }
        Object[] objArr = {this.authCode, ((getSuffix) obj).authCode};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = write + 45;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = write + 29;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
