package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$Address$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetSizep;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class accessgetOnCommitAffectingUpdatecp {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$Address$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$Address$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 125;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                accessgetSizep accessgetsizep = accessgetSizep.IconCompatParcelizer;
                throw null;
            }
            accessgetSizep accessgetsizep2 = accessgetSizep.IconCompatParcelizer;
            int i3 = RemoteActionCompatParcelizer + 31;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return accessgetsizep2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String description;
    public final long id;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$Address$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 87;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ accessgetOnCommitAffectingUpdatecp(int i, long j, String str) {
        if (3 == (i & 3)) {
            this.description = str;
            this.id = j;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accessgetSizep.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Long.hashCode(this.id) % (this.description.hashCode() << 113);
        } else {
            iHashCode = Long.hashCode(this.id) + (this.description.hashCode() * 31);
        }
        int i3 = read + 85;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Address(description=", this.description, this.id, ", id=");
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 25;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof accessgetOnCommitAffectingUpdatecp) {
                accessgetOnCommitAffectingUpdatecp accessgetoncommitaffectingupdatecp = (accessgetOnCommitAffectingUpdatecp) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, accessgetoncommitaffectingupdatecp.description}, getCieXyz.write())).booleanValue()) {
                    return this.id == accessgetoncommitaffectingupdatecp.id;
                }
                int i2 = read + 125;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            int i3 = serializer + 31;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = read + 7;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return true;
    }
}
