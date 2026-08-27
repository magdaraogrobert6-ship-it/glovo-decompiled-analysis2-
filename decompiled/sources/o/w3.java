package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.data.Opportunity$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.w4;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class w3 {
    public static final Opportunity$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.data.Opportunity$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 33;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                w4 w4Var = w4.write;
                throw null;
            }
            w4 w4Var2 = w4.write;
            int i3 = IconCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return w4Var2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String description;
    public final String id;
    public final w7ExternalSyntheticLambda0 startingPoint;
    public final String type;
    public final Boolean upcomingSession;
    public final String url;
    public final int zoneId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.data.Opportunity$Companion] */
    static {
        int i = write + 65;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    public /* synthetic */ w3(int i, String str, String str2, w7ExternalSyntheticLambda0 w7externalsyntheticlambda0, String str3, int i2, String str4, Boolean bool) {
        if (59 == (i & 59)) {
            this.id = str;
            this.type = str2;
            if ((i & 4) == 0) {
                this.startingPoint = null;
                int i3 = RemoteActionCompatParcelizer + 43;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                }
                this.description = str3;
                this.zoneId = i2;
                this.url = str4;
                if ((i & 64) == 0) {
                    this.upcomingSession = Boolean.FALSE;
                    return;
                } else {
                    this.upcomingSession = bool;
                    return;
                }
            }
            this.startingPoint = w7externalsyntheticlambda0;
            int i4 = read + 111;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            this.description = str3;
            this.zoneId = i2;
            this.url = str4;
            if ((i & 64) == 0) {
                this.upcomingSession = Boolean.FALSE;
                return;
            } else {
                this.upcomingSession = bool;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 59, w4.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.type);
        w7ExternalSyntheticLambda0 w7externalsyntheticlambda0 = this.startingPoint;
        int iHashCode2 = 0;
        if (w7externalsyntheticlambda0 == null) {
            iHashCode = 0;
        } else {
            iHashCode = w7externalsyntheticlambda0.hashCode();
            int i2 = RemoteActionCompatParcelizer + 85;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.zoneId, af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.description), 31), 31, this.url);
        Boolean bool = this.upcomingSession;
        if (bool == null) {
            int i4 = read + 7;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 17 / 0;
            }
        } else {
            iHashCode2 = bool.hashCode();
        }
        return iM2 + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Opportunity(id=", this.id, ", type=", this.type, ", startingPoint=");
        sbM.append(this.startingPoint);
        sbM.append(", description=");
        sbM.append(this.description);
        sbM.append(", zoneId=");
        sbM.append(this.zoneId);
        sbM.append(", url=");
        sbM.append(this.url);
        sbM.append(", upcomingSession=");
        String strM = c8$$ExternalSyntheticOutline0.m(sbM, ")", this.upcomingSession);
        int i4 = read + 125;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 71;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            int i4 = i2 + 25;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        w3 w3Var = (w3) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, w3Var.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, w3Var.type}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 59;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startingPoint, w3Var.startingPoint}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, w3Var.description}, getCieXyz.write())).booleanValue() || this.zoneId != w3Var.zoneId) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, w3Var.url}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.upcomingSession, w3Var.upcomingSession}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = read + 97;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
