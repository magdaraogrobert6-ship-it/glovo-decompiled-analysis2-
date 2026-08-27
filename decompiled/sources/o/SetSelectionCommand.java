package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.model.ClientMetadata$CaptureLocation$Companion;
import kotlinx.serialization.Serializable;
import o.Saverlambda1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class SetSelectionCommand {
    public static final ClientMetadata$CaptureLocation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.model.ClientMetadata$CaptureLocation$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            Saverlambda1 saverlambda1;
            int i = 2 % 2;
            int i2 = write + 59;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                saverlambda1 = Saverlambda1.serializer;
                int i3 = 82 / 0;
            } else {
                saverlambda1 = Saverlambda1.serializer;
            }
            int i4 = write + 5;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return saverlambda1;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final double latitude;
    public final double longitude;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.model.ClientMetadata$CaptureLocation$Companion] */
    static {
        int i = write + 65;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ SetSelectionCommand(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, Saverlambda1.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        int i4 = RemoteActionCompatParcelizer + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "CaptureLocation(latitude=", ", longitude="));
            int i3 = RemoteActionCompatParcelizer + 25;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "CaptureLocation(latitude=", ", longitude="));
        obj.hashCode();
        throw null;
    }

    public SetSelectionCommand(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        if (Double.compare(this.latitude, setSelectionCommand.latitude) == 0) {
            return Double.compare(this.longitude, setSelectionCommand.longitude) == 0;
        }
        int i3 = serializer + 75;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
