package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ButtonWithPrompt$ConfirmationPrompt$Companion;
import kotlinx.serialization.Serializable;
import o.fastJoinToString;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "confirmation_prompt")
public final class fastJoinTo {
    public static final Deliveries$Delivery$DeliveriesComponent$ButtonWithPrompt$ConfirmationPrompt$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ButtonWithPrompt$ConfirmationPrompt$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 61;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return fastJoinToString.read;
            }
            int i3 = 60 / 0;
            return fastJoinToString.read;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final getDismissOnBackPress cancelButton;
    public final getDismissOnBackPress confirmButton;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ButtonWithPrompt$ConfirmationPrompt$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ fastJoinTo(int i, getDismissOnBackPress getdismissonbackpress, getDismissOnBackPress getdismissonbackpress2, String str) {
        if (7 == (i & 7)) {
            this.cancelButton = getdismissonbackpress;
            this.confirmButton = getdismissonbackpress2;
            this.title = str;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, fastJoinToString.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.cancelButton.hashCode();
        int iHashCode2 = this.title.hashCode() + ((this.confirmButton.hashCode() + (iHashCode * 31)) * 31);
        int i4 = read + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ConfirmationPrompt(cancelButton=");
        sb.append(this.cancelButton);
        sb.append(", confirmButton=");
        sb.append(this.confirmButton);
        sb.append(", title=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.title, ")");
        int i2 = read + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 45;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof fastJoinTo)) {
                int i6 = i4 + 61;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i6 % 2 == 0;
            }
            fastJoinTo fastjointo = (fastJoinTo) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cancelButton, fastjointo.cancelButton}, getCieXyz.write())).booleanValue()) {
                int i7 = read + 9;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 18 / 0;
                }
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmButton, fastjointo.confirmButton}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fastjointo.title}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i9 = i2 + 91;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 == 0;
    }
}
