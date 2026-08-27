package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.TermsAndConditions$Companion;
import kotlinx.serialization.Serializable;
import o.onInstallReferrerSetupFinishedIntI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class retryI {
    public static final TermsAndConditions$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.TermsAndConditions$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 59;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onInstallReferrerSetupFinishedIntI oninstallreferrersetupfinishedinti = onInstallReferrerSetupFinishedIntI.serializer;
            int i4 = serializer + 121;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return oninstallreferrersetupfinishedinti;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.TermsAndConditions$Companion] */
    static {
        int i = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    public /* synthetic */ retryI(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, onInstallReferrerSetupFinishedIntI.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.url.hashCode();
        }
        this.url.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("TermsAndConditions(url=", this.url, ")");
        }
        ff$$ExternalSyntheticOutline0.m("TermsAndConditions(url=", this.url, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof retryI)) {
            return false;
        }
        Object[] objArr = {this.url, ((retryI) obj).url};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i3 = write + 99;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
