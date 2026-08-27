package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class getWidthXSAIIZE {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    @SerializedName("contact")
    private final accessgetDefaultPaddingcp contact;

    @SerializedName("event")
    private final copyw_4Rhrw event;

    @SerializedName("globalEntityId")
    private final String globalEntityId;

    @SerializedName("order")
    private final getPaddingXSAIIZE order;

    @SerializedName("product")
    private final getDrawStyle product;

    @SerializedName("timestamp")
    private final String timestamp;

    @SerializedName(FeedbackEvent.UI)
    private final BulletCompanion user;

    public final String write() {
        int i = 2 % 2;
        int i2 = write + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.globalEntityId;
        int i5 = i3 + 31;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public getWidthXSAIIZE(String str, String str2, copyw_4Rhrw copyw_4rhrw, getDrawStyle getdrawstyle, BulletCompanion bulletCompanion, getPaddingXSAIIZE getpaddingxsaiize, accessgetDefaultPaddingcp accessgetdefaultpaddingcp) {
        str.getClass();
        this.globalEntityId = str;
        this.timestamp = str2;
        this.event = copyw_4rhrw;
        this.product = getdrawstyle;
        this.user = bulletCompanion;
        this.order = getpaddingxsaiize;
        this.contact = accessgetdefaultpaddingcp;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.globalEntityId.hashCode() * 31, 31, this.timestamp);
        int iHashCode2 = this.event.hashCode();
        int iHashCode3 = this.product.hashCode();
        int iHashCode4 = this.user.hashCode();
        getPaddingXSAIIZE getpaddingxsaiize = this.order;
        if (getpaddingxsaiize == null) {
            int i4 = IconCompatParcelizer + 39;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = getpaddingxsaiize.hashCode();
        }
        accessgetDefaultPaddingcp accessgetdefaultpaddingcp = this.contact;
        return ((((iHashCode4 + ((iHashCode3 + ((iHashCode2 + iM) * 31)) * 31)) * 31) + iHashCode) * 31) + (accessgetdefaultpaddingcp != null ? accessgetdefaultpaddingcp.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.globalEntityId;
        String str2 = this.timestamp;
        copyw_4Rhrw copyw_4rhrw = this.event;
        getDrawStyle getdrawstyle = this.product;
        BulletCompanion bulletCompanion = this.user;
        getPaddingXSAIIZE getpaddingxsaiize = this.order;
        accessgetDefaultPaddingcp accessgetdefaultpaddingcp = this.contact;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("EventCreationRequest(globalEntityId=", str, ", timestamp=", str2, ", event=");
        sbM.append(copyw_4rhrw);
        sbM.append(", product=");
        sbM.append(getdrawstyle);
        sbM.append(", user=");
        sbM.append(bulletCompanion);
        sbM.append(", order=");
        sbM.append(getpaddingxsaiize);
        sbM.append(", contact=");
        sbM.append(accessgetdefaultpaddingcp);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getWidthXSAIIZE)) {
            return false;
        }
        getWidthXSAIIZE getwidthxsaiize = (getWidthXSAIIZE) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, getwidthxsaiize.globalEntityId}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, getwidthxsaiize.timestamp}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.event, getwidthxsaiize.event}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.product, getwidthxsaiize.product}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.user, getwidthxsaiize.user}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.order, getwidthxsaiize.order}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contact, getwidthxsaiize.contact}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = write + 55;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = write + 17;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 7;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
