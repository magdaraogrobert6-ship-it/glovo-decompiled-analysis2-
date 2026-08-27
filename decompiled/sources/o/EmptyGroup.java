package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.location.ActivityIdentificationData;
import com.roadrunner.delivery.pickupdropoff.tasks.model.ConfirmButtonTaskUiItem$DoubleConfirmationData$Companion;
import kotlinx.serialization.Serializable;
import o.getContextsui_tooling_data;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EmptyGroup {
    public static final ConfirmButtonTaskUiItem$DoubleConfirmationData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.ConfirmButtonTaskUiItem$DoubleConfirmationData$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 89;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getContextsui_tooling_data getcontextsui_tooling_data = getContextsui_tooling_data.serializer;
            int i4 = IconCompatParcelizer + 27;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getcontextsui_tooling_data;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String doneButtonTitle;
    public final String skipButtonTitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.ConfirmButtonTaskUiItem$DoubleConfirmationData$Companion] */
    static {
        int i = read + 107;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ EmptyGroup(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.title = str;
            this.doneButtonTitle = str2;
            this.skipButtonTitle = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getContextsui_tooling_data.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.doneButtonTitle) + this.skipButtonTitle.hashCode();
        }
        int iHashCode = this.title.hashCode();
        return this.skipButtonTitle.hashCode() >>> af$$ExternalSyntheticOutline0.m(iHashCode * ActivityIdentificationData.RUNNING, 20, this.doneButtonTitle);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DoubleConfirmationData(title=", this.title, ", doneButtonTitle=", this.doneButtonTitle, ", skipButtonTitle="), this.skipButtonTitle, ")");
        int i4 = write + 87;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public EmptyGroup(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.title = str;
        this.doneButtonTitle = str2;
        this.skipButtonTitle = str3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmptyGroup) {
            EmptyGroup emptyGroup = (EmptyGroup) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, emptyGroup.title}, getCieXyz.write())).booleanValue()) {
                int i2 = write + 1;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.doneButtonTitle, emptyGroup.doneButtonTitle}, getCieXyz.write())).booleanValue()) {
                int i4 = write;
                int i5 = i4 + 103;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i4 + 63;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 25 / 0;
                }
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.skipButtonTitle, emptyGroup.skipButtonTitle}, getCieXyz.write())).booleanValue();
        }
        int i9 = IconCompatParcelizer + 95;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
