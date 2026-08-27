package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.BalanceLimitResponse$Companion;
import kotlinx.serialization.Serializable;
import o.Assert;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class GooglePlayServicesClientGooglePlayServicesInterface {
    public static final BalanceLimitResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.BalanceLimitResponse$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 63;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Assert r1 = Assert.write;
            int i4 = write + 117;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r1;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String link;
    public final String linkLabel;
    public final String subTitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.BalanceLimitResponse$Companion] */
    static {
        int i = read + 117;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ GooglePlayServicesClientGooglePlayServicesInterface(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.link = str;
            this.linkLabel = str2;
            this.title = str3;
            this.subTitle = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, Assert.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BalanceLimitResponse(link=", this.link, ", linkLabel=", this.linkLabel, ", title="), this.title, ", subTitle=", this.subTitle, ")");
            int i3 = write + 117;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BalanceLimitResponse(link=", this.link, ", linkLabel=", this.linkLabel, ", title="), this.title, ", subTitle=", this.subTitle, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.subTitle.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.link.hashCode() * 31, 31, this.linkLabel), 31, this.title);
        int i4 = serializer + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof GooglePlayServicesClientGooglePlayServicesInterface) {
                GooglePlayServicesClientGooglePlayServicesInterface googlePlayServicesClientGooglePlayServicesInterface = (GooglePlayServicesClientGooglePlayServicesInterface) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.link, googlePlayServicesClientGooglePlayServicesInterface.link}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.linkLabel, googlePlayServicesClientGooglePlayServicesInterface.linkLabel}, getCieXyz.write())).booleanValue()) {
                    int i5 = serializer + 121;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, googlePlayServicesClientGooglePlayServicesInterface.title}, getCieXyz.write())).booleanValue()) {
                    int i7 = serializer + 35;
                    write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subTitle, googlePlayServicesClientGooglePlayServicesInterface.subTitle}, getCieXyz.write())).booleanValue();
            }
            int i9 = i3 + 97;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = i3 + 29;
        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i11 % 2 == 0;
    }
}
