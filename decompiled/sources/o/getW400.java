package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$Address$Companion;
import kotlinx.serialization.Serializable;
import o.getW500;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getW400 {
    public static final ScrollableComponent$LocationDetail$Address$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$Address$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 3;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getW500 getw500 = getW500.RemoteActionCompatParcelizer;
            int i4 = write + 71;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getw500;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String description;
    public final long id;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$Address$Companion] */
    static {
        int i = write + 61;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getW400(int i, long j, String str) {
        if (3 == (i & 3)) {
            this.description = str;
            this.id = j;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getW500.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.id) + (this.description.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Address(description=", this.description, this.id, ", id=");
            sbM.append(")");
            String string = sbM.toString();
            int i3 = 50 / 0;
            return string;
        }
        StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m("Address(description=", this.description, this.id, ", id=");
        sbM2.append(")");
        return sbM2.toString();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getW400) {
            getW400 getw400 = (getW400) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getw400.description}, getCieXyz.write())).booleanValue()) {
                return this.id == getw400.id;
            }
            int i2 = serializer + 101;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = serializer + 115;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 == 0;
    }
}
