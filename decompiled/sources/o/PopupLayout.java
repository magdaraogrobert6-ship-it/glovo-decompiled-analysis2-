package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.Instruction$InstructionV2$Link$Companion;
import kotlinx.serialization.Serializable;
import o.createLayoutParams;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PopupLayout {
    public static final Instruction$InstructionV2$Link$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$InstructionV2$Link$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 37;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createLayoutParams createlayoutparams = createLayoutParams.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            createLayoutParams createlayoutparams2 = createLayoutParams.write;
            int i3 = write + 49;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createlayoutparams2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String errorMessage;
    public final String packageName;
    public final String text;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$InstructionV2$Link$Companion] */
    static {
        int i = serializer + 87;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ PopupLayout(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.text = str;
            this.url = str2;
            this.packageName = str3;
            this.errorMessage = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, createLayoutParams.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Link(text=", this.text, ", url=", this.url, ", packageName="), this.packageName, ", errorMessage=", this.errorMessage, ")");
            int i3 = IconCompatParcelizer + 27;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Link(text=", this.text, ", url=", this.url, ", packageName="), this.packageName, ", errorMessage=", this.errorMessage, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.errorMessage.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.url), 31, this.packageName);
        int i4 = IconCompatParcelizer + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 87;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof PopupLayout)) {
            return false;
        }
        PopupLayout popupLayout = (PopupLayout) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, popupLayout.text}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, popupLayout.url}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.packageName, popupLayout.packageName}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, popupLayout.errorMessage}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i3 = IconCompatParcelizer + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
