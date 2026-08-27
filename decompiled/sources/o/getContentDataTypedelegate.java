package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.RefreshTokenResponse$Companion;
import kotlinx.serialization.Serializable;
import o.getCollectionItemInfodelegate;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class getContentDataTypedelegate {
    public static final RefreshTokenResponse$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.RefreshTokenResponse$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 33;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getCollectionItemInfodelegate getcollectioniteminfodelegate = getCollectionItemInfodelegate.IconCompatParcelizer;
            int i4 = serializer + 97;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getcollectioniteminfodelegate;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String accessToken;
    public final long expiresIn;
    public final String refreshToken;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.RefreshTokenResponse$Companion] */
    static {
        int i = serializer + 23;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            str = this.accessToken;
            int i4 = 27 / 0;
        } else {
            str = this.accessToken;
        }
        int i5 = i3 + 121;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 125;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.refreshToken;
        int i5 = i2 + 43;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final long write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.expiresIn;
        int i4 = i2 + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return j;
    }

    public /* synthetic */ getContentDataTypedelegate(int i, long j, String str, String str2) {
        if (7 == (i & 7)) {
            this.accessToken = str;
            this.refreshToken = str2;
            this.expiresIn = j;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getCollectionItemInfodelegate.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.expiresIn) + af$$ExternalSyntheticOutline0.m(this.accessToken.hashCode() * 31, 31, this.refreshToken);
        int i4 = IconCompatParcelizer + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
            return c8$$ExternalSyntheticOutline0.m(this.expiresIn, ")", c8$$ExternalSyntheticOutline0.m("RefreshTokenResponse(accessToken=", this.accessToken, ", refreshToken=", this.refreshToken, ", expiresIn="));
        }
        return c8$$ExternalSyntheticOutline0.m(this.expiresIn, ")", c8$$ExternalSyntheticOutline0.m("RefreshTokenResponse(accessToken=", this.accessToken, ", refreshToken=", this.refreshToken, ", expiresIn="));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getContentDataTypedelegate) {
            getContentDataTypedelegate getcontentdatatypedelegate = (getContentDataTypedelegate) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, getcontentdatatypedelegate.accessToken}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshToken, getcontentdatatypedelegate.refreshToken}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (this.expiresIn == getcontentdatatypedelegate.expiresIn) {
                    return true;
                }
                int i2 = IconCompatParcelizer + 77;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer + 13;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = read + 89;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
