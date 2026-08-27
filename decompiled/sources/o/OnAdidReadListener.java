package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.database.entity.BalanceLimitEntity$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class OnAdidReadListener {
    public static final BalanceLimitEntity$Companion Companion = new BalanceLimitEntity$Companion();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String link;
    public final String linkLabel;
    public final String subTitle;
    public final String title;

    static {
        int i = serializer + 59;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ OnAdidReadListener(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.link = str;
            this.linkLabel = str2;
            this.title = str3;
            this.subTitle = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, OnAttributionReadListener.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BalanceLimitEntity(link=", this.link, ", linkLabel=", this.linkLabel, ", title="), this.title, ", subTitle=", this.subTitle, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BalanceLimitEntity(link=", this.link, ", linkLabel=", this.linkLabel, ", title="), this.title, ", subTitle=", this.subTitle, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.subTitle.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.link.hashCode() * 31, 31, this.linkLabel), 31, this.title);
        int i4 = write + 67;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public OnAdidReadListener(String str, String str2, String str3, String str4) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.link = str;
        this.linkLabel = str2;
        this.title = str3;
        this.subTitle = str4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof OnAdidReadListener)) {
                int i5 = i3 + 11;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i5 % 2 == 0;
            }
            OnAdidReadListener onAdidReadListener = (OnAdidReadListener) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.link, onAdidReadListener.link}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.linkLabel, onAdidReadListener.linkLabel}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, onAdidReadListener.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subTitle, onAdidReadListener.subTitle}, getCieXyz.write())).booleanValue()) {
                int i6 = RemoteActionCompatParcelizer + 81;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i7 = RemoteActionCompatParcelizer + 41;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = i3 + 91;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
