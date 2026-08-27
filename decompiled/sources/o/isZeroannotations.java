package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$TapToPayCardUiItem$Companion;
import kotlinx.serialization.Serializable;
import o.getValueannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isZeroannotations {
    public static final TapToPayTaskUiItem$TapToPayCardUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$TapToPayCardUiItem$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 97;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getValueannotations.write;
            }
            int i3 = 26 / 0;
            return getValueannotations.write;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String collectActionTitle;
    public final String description;
    public final String key;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$TapToPayCardUiItem$Companion] */
    static {
        int i = serializer + 109;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
    }

    public /* synthetic */ isZeroannotations(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.title = str;
            this.key = str2;
            this.collectActionTitle = str3;
            this.description = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getValueannotations.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("TapToPayCardUiItem(title=", this.title, ", key=", this.key, ", collectActionTitle="), this.collectActionTitle, ", description=", this.description, ")");
        int i4 = write + 89;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.description.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.key), 31, this.collectActionTitle);
        int i4 = IconCompatParcelizer + 7;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public isZeroannotations(String str, String str2, String str3, String str4) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.title = str;
        this.key = str2;
        this.collectActionTitle = str3;
        this.description = str4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isZeroannotations)) {
            return false;
        }
        isZeroannotations iszeroannotations = (isZeroannotations) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, iszeroannotations.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, iszeroannotations.key}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 57;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.collectActionTitle, iszeroannotations.collectActionTitle}, getCieXyz.write())).booleanValue()) {
            int i5 = IconCompatParcelizer + 101;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, iszeroannotations.description}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = write + 1;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
