package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$StaleManifestBehavior$Companion;
import kotlinx.serialization.Serializable;
import o.mapEachParagraphStyle;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getLocalParagraphStyles {
    public static final ManifestResponse$Config$StaleManifestBehavior$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$StaleManifestBehavior$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 37;
            write = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                mapEachParagraphStyle mapeachparagraphstyle = mapEachParagraphStyle.serializer;
                throw null;
            }
            mapEachParagraphStyle mapeachparagraphstyle2 = mapEachParagraphStyle.serializer;
            int i3 = serializer + 29;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return mapeachparagraphstyle2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final int capPercentage;
    public final int giveUpAfterSeconds;
    public final int staleAfterSeconds;
    public final String strategy;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$Config$StaleManifestBehavior$Companion] */
    static {
        int i = read + 47;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 75;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.giveUpAfterSeconds;
        int i6 = i2 + 61;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 15 / 0;
        }
        return i5;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = this.staleAfterSeconds;
        int i6 = i3 + 89;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final int serializer() {
        int i;
        int i2 = 2 % 2;
        int i3 = write;
        int i4 = i3 + 111;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            i = this.capPercentage;
            int i5 = 8 / 0;
        } else {
            i = this.capPercentage;
        }
        int i6 = i3 + 73;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 53 / 0;
        }
        return i;
    }

    public /* synthetic */ getLocalParagraphStyles(int i, int i2, int i3, int i4, String str) {
        if (15 == (i & 15)) {
            this.capPercentage = i2;
            this.giveUpAfterSeconds = i3;
            this.staleAfterSeconds = i4;
            this.strategy = str;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, mapEachParagraphStyle.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.strategy.hashCode() + af$$ExternalSyntheticOutline0.m(this.staleAfterSeconds, af$$ExternalSyntheticOutline0.m(this.giveUpAfterSeconds, Integer.hashCode(this.capPercentage) * 31, 31), 31);
        int i4 = write + 37;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.capPercentage, this.giveUpAfterSeconds, "StaleManifestBehavior(capPercentage=", ", giveUpAfterSeconds=", ", staleAfterSeconds=");
        sbM.append(this.staleAfterSeconds);
        sbM.append(", strategy=");
        sbM.append(this.strategy);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof getLocalParagraphStyles)) {
                return false;
            }
            getLocalParagraphStyles getlocalparagraphstyles = (getLocalParagraphStyles) obj;
            if (this.capPercentage == getlocalparagraphstyles.capPercentage) {
                if (this.giveUpAfterSeconds == getlocalparagraphstyles.giveUpAfterSeconds) {
                    if (this.staleAfterSeconds != getlocalparagraphstyles.staleAfterSeconds) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.strategy, getlocalparagraphstyles.strategy}, getCieXyz.write())).booleanValue()) {
                        int i2 = write + 69;
                        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i3 = 35 / 0;
                        }
                        return true;
                    }
                    int i4 = serializer + 13;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = serializer + 125;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = write + 73;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 != 0;
        }
        int i9 = write + 87;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
