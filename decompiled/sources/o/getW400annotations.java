package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$DeliveryNotesLink$Companion;
import kotlinx.serialization.Serializable;
import o.getW300annotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "delivery_notes_link")
public final class getW400annotations extends getMediumannotations {
    public static final ScrollableComponent$DeliveryNotesLink$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$DeliveryNotesLink$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 31;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getW300annotations getw300annotations = getW300annotations.read;
            int i4 = write + 75;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getw300annotations;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$DeliveryNotesLink$Companion] */
    static {
        int i = write + 99;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getW400annotations(String str, int i, String str2, String str3, String str4) {
        if (13 != (i & 13)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 13, getW300annotations.read.getDescriptor());
            throw null;
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.text = null;
            int i2 = read + 31;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
            }
            this.pageTitle = str3;
            this.link = str4;
            int i3 = IconCompatParcelizer + 7;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.text = str2;
        int i5 = 2 % 2;
        this.pageTitle = str3;
        this.link = str4;
        int i6 = IconCompatParcelizer + 7;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DeliveryNotesLink(title=", this.title, ", text=", this.text, ", pageTitle="), this.pageTitle, ", link=", this.link, ")");
        int i4 = IconCompatParcelizer + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        String str = this.text;
        if (str == null) {
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 31;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.link.hashCode() + af$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + iHashCode) * 31, 31, this.pageTitle);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 19;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getW400annotations)) {
            return false;
        }
        getW400annotations getw400annotations = (getW400annotations) obj;
        Object[] objArr = {this.title, getw400annotations.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.text, getw400annotations.text};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.pageTitle, getw400annotations.pageTitle};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            Object[] objArr4 = {this.link, getw400annotations.link};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i7 = read + 53;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = read + 21;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
