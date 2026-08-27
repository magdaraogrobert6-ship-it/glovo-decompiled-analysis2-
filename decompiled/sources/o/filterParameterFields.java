package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.DatePickerTaskUiItem$ErrorData$Companion;
import kotlinx.serialization.Serializable;
import o.findParametersdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class filterParameterFields {
    public static final DatePickerTaskUiItem$ErrorData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.DatePickerTaskUiItem$ErrorData$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 113;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            findParametersdefault findparametersdefault = findParametersdefault.IconCompatParcelizer;
            int i4 = serializer + 73;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return findparametersdefault;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String errorMessage;
    public final String errorTitle;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.DatePickerTaskUiItem$ErrorData$Companion] */
    static {
        int i = serializer + 103;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ filterParameterFields(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.errorTitle = str;
            this.errorMessage = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, findParametersdefault.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ErrorData(errorTitle=", this.errorTitle, ", errorMessage=", this.errorMessage, ")");
            int i3 = RemoteActionCompatParcelizer + 81;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ErrorData(errorTitle=", this.errorTitle, ", errorMessage=", this.errorMessage, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.errorMessage.hashCode() - (this.errorTitle.hashCode() / 110);
        } else {
            iHashCode = this.errorMessage.hashCode() + (this.errorTitle.hashCode() * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public filterParameterFields(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.errorTitle = str;
        this.errorMessage = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof filterParameterFields)) {
            return false;
        }
        filterParameterFields filterparameterfields = (filterParameterFields) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorTitle, filterparameterfields.errorTitle}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, filterparameterfields.errorMessage}, getCieXyz.write())).booleanValue();
        }
        int i3 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
