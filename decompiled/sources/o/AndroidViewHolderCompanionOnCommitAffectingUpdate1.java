package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$TermsAndConditions$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "terms_and_conditions")
public final class AndroidViewHolderCompanionOnCommitAffectingUpdate1 implements insetValue {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$TermsAndConditions$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$TermsAndConditions$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 63;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return AndroidViewHolderCompanion.RemoteActionCompatParcelizer;
            }
            AndroidViewHolderCompanion androidViewHolderCompanion = AndroidViewHolderCompanion.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$TermsAndConditions$Companion] */
    static {
        int i = read + 83;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AndroidViewHolderCompanionOnCommitAffectingUpdate1(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidViewHolderCompanion.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.url.hashCode();
        }
        this.url.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("TermsAndConditions(url=", this.url, ")");
        }
        int i3 = 85 / 0;
        return ff$$ExternalSyntheticOutline0.m("TermsAndConditions(url=", this.url, ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof AndroidViewHolderCompanionOnCommitAffectingUpdate1)) {
                int i5 = i3 + 39;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, ((AndroidViewHolderCompanionOnCommitAffectingUpdate1) obj).url}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i7 = RemoteActionCompatParcelizer + 23;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i8 = i3 + 87;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }
}
