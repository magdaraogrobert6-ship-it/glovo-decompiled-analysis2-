package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.DatePickerTaskUiItem$DateValidation$Companion;
import kotlinx.serialization.Serializable;
import o.buildParameterInfo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class extractFromLegacyFieldsextractedName {
    public static final DatePickerTaskUiItem$DateValidation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.DatePickerTaskUiItem$DateValidation$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 43;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return buildParameterInfo.IconCompatParcelizer;
            }
            int i3 = 81 / 0;
            return buildParameterInfo.IconCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String date;
    public final String format;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.DatePickerTaskUiItem$DateValidation$Companion] */
    static {
        int i = read + 37;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ extractFromLegacyFieldsextractedName(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.date = str;
            this.format = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, buildParameterInfo.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("DateValidation(date=", this.date, ", format=", this.format, ")");
            int i3 = serializer + 87;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("DateValidation(date=", this.date, ", format=", this.format, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.format.hashCode() + (this.date.hashCode() * 31);
        int i4 = serializer + 15;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public extractFromLegacyFieldsextractedName(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.date = str;
        this.format = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof extractFromLegacyFieldsextractedName))) {
            extractFromLegacyFieldsextractedName extractfromlegacyfieldsextractedname = (extractFromLegacyFieldsextractedName) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.date, extractfromlegacyfieldsextractedname.date}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.format, extractfromlegacyfieldsextractedname.format}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = serializer + 13;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = serializer + 113;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 53;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
