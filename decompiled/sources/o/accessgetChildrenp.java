package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatUrlConfiguration$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class accessgetChildrenp {
    public static final ChatUrlConfiguration$Companion Companion = new ChatUrlConfiguration$Companion();
    public final String country;
    public final String hostPerseusSessionId;
    public final String locale;
    public final String orderID;
    public final String p2pChatToken;
    public final long timestamp;
    public final String url;
    public final String verificationToken;

    public final int hashCode() {
        return this.hostPerseusSessionId.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.p2pChatToken), 31, this.verificationToken), 31, this.locale), 31, this.orderID), 31, this.country), 31, this.timestamp);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetChildrenp)) {
            return false;
        }
        accessgetChildrenp accessgetchildrenp = (accessgetChildrenp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, accessgetchildrenp.url}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pChatToken, accessgetchildrenp.p2pChatToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.verificationToken, accessgetchildrenp.verificationToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locale, accessgetchildrenp.locale}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderID, accessgetchildrenp.orderID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, accessgetchildrenp.country}, getCieXyz.write())).booleanValue() || this.timestamp != accessgetchildrenp.timestamp) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hostPerseusSessionId, accessgetchildrenp.hostPerseusSessionId}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatUrlConfiguration(url=");
        sb.append(this.url);
        sb.append(", p2pChatToken=");
        sb.append(this.p2pChatToken);
        sb.append(", verificationToken=");
        sb.append(this.verificationToken);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", orderID=");
        sb.append(this.orderID);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", hostPerseusSessionId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.hostPerseusSessionId, ')');
    }

    public /* synthetic */ accessgetChildrenp(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.p2pChatToken = "";
        } else {
            this.p2pChatToken = str2;
        }
        if ((i & 4) == 0) {
            this.verificationToken = "";
        } else {
            this.verificationToken = str3;
        }
        if ((i & 8) == 0) {
            this.locale = "";
        } else {
            this.locale = str4;
        }
        if ((i & 16) == 0) {
            this.orderID = "";
        } else {
            this.orderID = str5;
        }
        if ((i & 32) == 0) {
            this.country = "";
        } else {
            this.country = str6;
        }
        this.timestamp = (i & 64) == 0 ? 0L : j;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.hostPerseusSessionId = "";
        } else {
            this.hostPerseusSessionId = str7;
        }
    }

    public accessgetChildrenp(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7) {
        str.getClass();
        this.url = str;
        this.p2pChatToken = str2;
        this.verificationToken = str3;
        this.locale = str4;
        this.orderID = str5;
        this.country = str6;
        this.timestamp = j;
        this.hostPerseusSessionId = str7;
    }
}
