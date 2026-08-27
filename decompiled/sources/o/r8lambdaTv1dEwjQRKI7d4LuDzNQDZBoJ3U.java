package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.model.UploadContentResponse$Companion;
import kotlinx.serialization.Serializable;
import o.Saverlambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class r8lambdaTv1dEwjQRKI7d4LuDzNQDZBoJ3U {
    public static final UploadContentResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.model.UploadContentResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 71;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return Saverlambda0.RemoteActionCompatParcelizer;
            }
            int i3 = 6 / 0;
            return Saverlambda0.RemoteActionCompatParcelizer;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String assetId;
    public final String status;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.model.UploadContentResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 123;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdaTv1dEwjQRKI7d4LuDzNQDZBoJ3U(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.assetId = str;
            this.url = str2;
            this.status = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, Saverlambda0.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.status.hashCode() / af$$ExternalSyntheticOutline0.m(this.assetId.hashCode() << 122, 61, this.url);
        }
        return this.status.hashCode() + af$$ExternalSyntheticOutline0.m(this.assetId.hashCode() * 31, 31, this.url);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("UploadContentResponse(assetId=", this.assetId, ", url=", this.url, ", status="), this.status, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("UploadContentResponse(assetId=", this.assetId, ", url=", this.url, ", status="), this.status, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof r8lambdaTv1dEwjQRKI7d4LuDzNQDZBoJ3U) {
                r8lambdaTv1dEwjQRKI7d4LuDzNQDZBoJ3U r8lambdatv1dewjqrki7d4ludznqdzboj3u = (r8lambdaTv1dEwjQRKI7d4LuDzNQDZBoJ3U) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.assetId, r8lambdatv1dewjqrki7d4ludznqdzboj3u.assetId}, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 59;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, r8lambdatv1dewjqrki7d4ludznqdzboj3u.url}, getCieXyz.write())).booleanValue()) {
                    int i4 = read + 95;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, r8lambdatv1dewjqrki7d4ludznqdzboj3u.status}, getCieXyz.write())).booleanValue()) {
                    int i6 = read + 53;
                    write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i6 % 2 == 0;
                }
                int i7 = write + 107;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 49 / 0;
                }
                return true;
            }
            int i9 = write + 123;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 != 0;
        }
        int i10 = write + 77;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 == 0;
    }
}
