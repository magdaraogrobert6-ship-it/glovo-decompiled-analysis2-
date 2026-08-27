package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.quests.data.QuestsResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getInfoParameters {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final getAttributionParameters banner;
    public final String footerActionText;
    public final String footerActionUrl;
    public final String headerActionText;
    public final String headerActionUrl;
    public final List quests;
    public final String title;
    public static final QuestsResponse$Companion Companion = new QuestsResponse$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(20))};

    static {
        int i = write + 77;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getInfoParameters(int i, String str, String str2, String str3, String str4, String str5, getAttributionParameters getattributionparameters, List list) {
        if (31 == (i & 31)) {
            this.title = str;
            this.headerActionText = str2;
            this.headerActionUrl = str3;
            this.footerActionText = str4;
            this.footerActionUrl = str5;
            if ((i & 32) == 0) {
                this.banner = null;
            } else {
                this.banner = getattributionparameters;
                int i2 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 64) == 0) {
                int i4 = IconCompatParcelizer + 117;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                this.quests = null;
                return;
            }
            this.quests = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, buildAdRevenuePackage.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("QuestsResponse(title=", this.title, ", headerActionText=", this.headerActionText, ", headerActionUrl=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.headerActionUrl, ", footerActionText=", this.footerActionText, ", footerActionUrl=");
        sbM.append(this.footerActionUrl);
        sbM.append(", banner=");
        sbM.append(this.banner);
        sbM.append(", quests=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.quests, ")");
        int i4 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.headerActionText), 31, this.headerActionUrl), 31, this.footerActionText), 31, this.footerActionUrl);
        getAttributionParameters getattributionparameters = this.banner;
        if (getattributionparameters == null) {
            int i2 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = getattributionparameters.hashCode();
        }
        List list = this.quests;
        int iHashCode2 = ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
        int i3 = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 93;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof getInfoParameters)) {
            return false;
        }
        getInfoParameters getinfoparameters = (getInfoParameters) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getinfoparameters.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object obj2 = null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.headerActionText, getinfoparameters.headerActionText}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.headerActionUrl, getinfoparameters.headerActionUrl}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.footerActionText, getinfoparameters.footerActionText}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.footerActionUrl, getinfoparameters.footerActionUrl}, getCieXyz.write())).booleanValue()) {
                    int i6 = IconCompatParcelizer + 101;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.banner, getinfoparameters.banner}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.quests, getinfoparameters.quests}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i8 = IconCompatParcelizer + 53;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            int i9 = RemoteActionCompatParcelizer + 91;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 != 0;
        }
        int i10 = IconCompatParcelizer + 87;
        int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 97;
        IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
