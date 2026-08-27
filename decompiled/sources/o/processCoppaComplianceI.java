package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.recentdeliveries.data.model.Helpdesk$Companion;
import kotlinx.serialization.Serializable;
import o.processRemoteTriggersI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class processCoppaComplianceI {
    public static final Helpdesk$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.Helpdesk$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 23;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            processRemoteTriggersI processremotetriggersi = processRemoteTriggersI.read;
            int i4 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return processremotetriggersi;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String logo;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.Helpdesk$Companion] */
    static {
        int i = write + 49;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ processCoppaComplianceI(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.logo = str;
            this.url = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, processRemoteTriggersI.read.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Helpdesk(logo=", this.logo, ", url=", this.url, ")");
            int i3 = 9 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Helpdesk(logo=", this.logo, ", url=", this.url, ")");
        }
        int i4 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.url.hashCode() % (this.logo.hashCode() * 30);
        } else {
            iHashCode = this.url.hashCode() + (this.logo.hashCode() * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 93;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof processCoppaComplianceI)) {
            int i3 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        processCoppaComplianceI processcoppacompliancei = (processCoppaComplianceI) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.logo, processcoppacompliancei.logo}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, processcoppacompliancei.url}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
