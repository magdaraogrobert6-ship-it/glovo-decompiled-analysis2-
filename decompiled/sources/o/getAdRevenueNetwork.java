package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.safety.report.data.entity.RemoteSafetyRecommendation$Companion;
import kotlinx.serialization.Serializable;
import o.getRevenue;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getAdRevenueNetwork {
    public static final RemoteSafetyRecommendation$Companion Companion = new Object() { // from class: com.roadrunner.rider.safety.report.data.entity.RemoteSafetyRecommendation$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 7;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getRevenue getrevenue = getRevenue.serializer;
            int i4 = write + 15;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getrevenue;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final String callToAction;
    public final String communicationId;
    public final String evaluationId;
    public final String message;
    public final int priority;
    public final String tag;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.safety.report.data.entity.RemoteSafetyRecommendation$Companion] */
    static {
        int i = write + 121;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 43 / 0;
        }
    }

    public /* synthetic */ getAdRevenueNetwork(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        if (119 == (i & 119)) {
            this.tag = str;
            this.title = str2;
            this.message = str3;
            if ((i & 8) == 0) {
                this.callToAction = null;
                int i3 = RemoteActionCompatParcelizer + 17;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } else {
                this.callToAction = str4;
            }
            this.priority = i2;
            this.communicationId = str5;
            this.evaluationId = str6;
            int i5 = read + 125;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 119, getRevenue.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.tag.hashCode() * 31, 31, this.title), 31, this.message);
        String str = this.callToAction;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 41;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.evaluationId.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.priority, (iM + iHashCode) * 31, 31), 31, this.communicationId);
        int i4 = read + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 63;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RemoteSafetyRecommendation(tag=", this.tag, ", title=", this.title, ", message=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.message, ", callToAction=", this.callToAction, ", priority=");
        sbM.append(this.priority);
        sbM.append(", communicationId=");
        sbM.append(this.communicationId);
        sbM.append(", evaluationId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.evaluationId, ")");
        int i4 = read + 17;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAdRevenueNetwork)) {
            return false;
        }
        getAdRevenueNetwork getadrevenuenetwork = (getAdRevenueNetwork) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tag, getadrevenuenetwork.tag}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getadrevenuenetwork.title}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, getadrevenuenetwork.message}, getCieXyz.write())).booleanValue())) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callToAction, getadrevenuenetwork.callToAction}, getCieXyz.write())).booleanValue()) {
                        int i2 = read + 21;
                        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        RemoteActionCompatParcelizer = i3;
                        int i4 = i2 % 2;
                        int i5 = i3 + 89;
                        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            int i6 = 17 / 0;
                        }
                        return false;
                    }
                    if (this.priority != getadrevenuenetwork.priority) {
                        int i7 = RemoteActionCompatParcelizer + 75;
                        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.communicationId, getadrevenuenetwork.communicationId}, getCieXyz.write())).booleanValue()) {
                        int i9 = read + 47;
                        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.evaluationId, getadrevenuenetwork.evaluationId}, getCieXyz.write())).booleanValue();
                }
                int i11 = RemoteActionCompatParcelizer + 73;
                read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return false;
            }
            int i13 = read + 71;
            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return false;
        }
        int i15 = RemoteActionCompatParcelizer + 103;
        read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i15 % 2 != 0;
    }
}
