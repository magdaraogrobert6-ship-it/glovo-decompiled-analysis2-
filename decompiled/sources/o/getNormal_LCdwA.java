package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.TaskData$Companion;
import kotlinx.serialization.Serializable;
import o.getNoneGVVA2EU;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getNormal_LCdwA {
    public static final TaskData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.TaskData$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 27;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getNoneGVVA2EU getnonegvva2eu = getNoneGVVA2EU.write;
            int i4 = RemoteActionCompatParcelizer + 71;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getnonegvva2eu;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String calculatorTitle;
    public final String changeAmountText;
    public final String description;
    public final String descriptionTitle;
    public final String enterAmountMessage;
    public final String inputAmountPlaceholder;
    public final String title;
    public final String transferChangeButtonText;
    public final String validationErrorMessage;
    public final String validationRegex;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i11 = ~i3;
        int i12 = (~(i11 | i8 | i)) | (~(i7 | i11 | i2));
        int i13 = i + i2 + i4 + ((-195996979) * i6) + ((-904719387) * i5);
        int i14 = i13 * i13;
        int i15 = (i * 1886715248) + 940376064 + (1886715248 * i2) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i4) + ((-1389494272) * i6) + (1623064576 * i5) + (1510801408 * i14);
        int i16 = (i * 1590984816) + 1398186415 + (i2 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i4 * 1590985553) + (i6 * (-1025631779)) + (i5 * 1121679989) + (i14 * 622657536);
        return i15 + ((i16 * i16) * (-1928134656)) != 1 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.TaskData$Companion] */
    static {
        int i = write + 125;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        String str;
        getNormal_LCdwA getnormal_lcdwa = (getNormal_LCdwA) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            str = getnormal_lcdwa.changeAmountText;
            int i4 = 86 / 0;
        } else {
            str = getnormal_lcdwa.changeAmountText;
        }
        int i5 = i3 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaBrowserCompatMediaItem() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            str = this.validationRegex;
            int i4 = 94 / 0;
        } else {
            str = this.validationRegex;
        }
        int i5 = i3 + 79;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.transferChangeButtonText;
        int i5 = i3 + 15;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaSessionCompatQueueItem() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 115;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.inputAmountPlaceholder;
            int i4 = 38 / 0;
        } else {
            str = this.inputAmountPlaceholder;
        }
        int i5 = i2 + 11;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RatingCompat() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            str = this.validationErrorMessage;
            int i4 = 39 / 0;
        } else {
            str = this.validationErrorMessage;
        }
        int i5 = i3 + 75;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.calculatorTitle;
        int i5 = i2 + 123;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.descriptionTitle;
        int i5 = i3 + 17;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 1;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.enterAmountMessage;
        int i5 = i2 + 67;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ getNormal_LCdwA(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (1023 == (i & 1023)) {
            this.title = str;
            this.descriptionTitle = str2;
            this.description = str3;
            this.enterAmountMessage = str4;
            this.inputAmountPlaceholder = str5;
            this.calculatorTitle = str6;
            this.validationRegex = str7;
            this.validationErrorMessage = str8;
            this.changeAmountText = str9;
            this.transferChangeButtonText = str10;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1023, getNoneGVVA2EU.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TaskData(title=", this.title, ", descriptionTitle=", this.descriptionTitle, ", description=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.description, ", enterAmountMessage=", this.enterAmountMessage, ", inputAmountPlaceholder=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.inputAmountPlaceholder, ", calculatorTitle=", this.calculatorTitle, ", validationRegex=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.validationRegex, ", validationErrorMessage=", this.validationErrorMessage, ", changeAmountText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.changeAmountText, ", transferChangeButtonText=", this.transferChangeButtonText, ")");
        int i4 = serializer + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getNormal_LCdwA getnormal_lcdwa = (getNormal_LCdwA) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = getnormal_lcdwa.transferChangeButtonText.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getnormal_lcdwa.title.hashCode() * 31, 31, getnormal_lcdwa.descriptionTitle), 31, getnormal_lcdwa.description), 31, getnormal_lcdwa.enterAmountMessage), 31, getnormal_lcdwa.inputAmountPlaceholder), 31, getnormal_lcdwa.calculatorTitle), 31, getnormal_lcdwa.validationRegex), 31, getnormal_lcdwa.validationErrorMessage), 31, getnormal_lcdwa.changeAmountText);
        int i4 = serializer + 3;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Integer.valueOf(iHashCode);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNormal_LCdwA)) {
            int i2 = serializer + 51;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 47 / 0;
            }
            return false;
        }
        getNormal_LCdwA getnormal_lcdwa = (getNormal_LCdwA) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getnormal_lcdwa.title}, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 121;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionTitle, getnormal_lcdwa.descriptionTitle}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 25;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getnormal_lcdwa.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.enterAmountMessage, getnormal_lcdwa.enterAmountMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.inputAmountPlaceholder, getnormal_lcdwa.inputAmountPlaceholder}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calculatorTitle, getnormal_lcdwa.calculatorTitle}, getCieXyz.write())).booleanValue()) {
            int i7 = RemoteActionCompatParcelizer + 93;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.validationRegex, getnormal_lcdwa.validationRegex}, getCieXyz.write())).booleanValue()) {
            int i9 = serializer + 13;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.validationErrorMessage, getnormal_lcdwa.validationErrorMessage}, getCieXyz.write())).booleanValue()) {
            int i11 = RemoteActionCompatParcelizer + 11;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.changeAmountText, getnormal_lcdwa.changeAmountText}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.transferChangeButtonText, getnormal_lcdwa.transferChangeButtonText}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i13 = serializer + 1;
        RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return false;
    }

    public final int hashCode() {
        return ((Integer) RemoteActionCompatParcelizer(1453649912, -1453649911, new Object[]{this}, getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer())).intValue();
    }

    public final String IconCompatParcelizer() {
        return (String) RemoteActionCompatParcelizer(515181934, -515181934, new Object[]{this}, getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer(), getShouldOptInWhenPushAuthorized.IconCompatParcelizer());
    }
}
