package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$InstructionLink$Companion;
import kotlinx.serialization.Serializable;
import o.getW500annotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "instruction_link")
public final class getW200annotations extends getMediumannotations {
    public static final ScrollableComponent$InstructionLink$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$InstructionLink$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 97;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getW500annotations getw500annotations = getW500annotations.serializer;
            int i4 = IconCompatParcelizer + 43;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getw500annotations;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String link;
    public final String pageTitle;
    public final String text;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$InstructionLink$Companion] */
    static {
        int i = serializer + 55;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getW200annotations(String str, int i, String str2, String str3, String str4) {
        if (13 == (i & 13)) {
            this.title = str;
            if ((i & 2) == 0) {
                this.text = null;
                int i2 = read + 77;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                }
                this.pageTitle = str3;
                this.link = str4;
                return;
            }
            this.text = str2;
            int i3 = IconCompatParcelizer + 39;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            this.pageTitle = str3;
            this.link = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 13, getW500annotations.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("InstructionLink(title=", this.title, ", text=", this.text, ", pageTitle="), this.pageTitle, ", link=", this.link, ")");
        }
        int i3 = 40 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("InstructionLink(title=", this.title, ", text=", this.text, ", pageTitle="), this.pageTitle, ", link=", this.link, ")");
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.title.hashCode();
        String str = this.text;
        if (str == null) {
            int i3 = IconCompatParcelizer + 53;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = IconCompatParcelizer + 7;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return this.link.hashCode() + af$$ExternalSyntheticOutline0.m(((iHashCode * 31) + i) * 31, 31, this.pageTitle);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getW200annotations)) {
            return false;
        }
        getW200annotations getw200annotations = (getW200annotations) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getw200annotations.title}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, getw200annotations.text}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pageTitle, getw200annotations.pageTitle}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.link, getw200annotations.link}, getCieXyz.write())).booleanValue();
            }
            int i2 = IconCompatParcelizer + 113;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 49;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return false;
    }
}
