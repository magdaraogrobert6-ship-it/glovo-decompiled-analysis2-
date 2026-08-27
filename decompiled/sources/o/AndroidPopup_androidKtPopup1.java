package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$ExternalComponents$BackToBackOrders$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtPopup21;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "b2b")
public final class AndroidPopup_androidKtPopup1 implements AndroidPopup_androidKtPopup31 {
    public static final StateV3$ExternalComponents$BackToBackOrders$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$ExternalComponents$BackToBackOrders$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            AndroidPopup_androidKtPopup21 androidPopup_androidKtPopup21;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 101;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                androidPopup_androidKtPopup21 = AndroidPopup_androidKtPopup21.IconCompatParcelizer;
                int i3 = 20 / 0;
            } else {
                androidPopup_androidKtPopup21 = AndroidPopup_androidKtPopup21.IconCompatParcelizer;
            }
            int i4 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return androidPopup_androidKtPopup21;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String animation;
    public final String description;
    public final String dismissIcon;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$ExternalComponents$BackToBackOrders$Companion] */
    static {
        int i = write + 63;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidPopup_androidKtPopup1(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.title = str;
            this.description = str2;
            this.animation = str3;
            this.dismissIcon = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, AndroidPopup_androidKtPopup21.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BackToBackOrders(title=", this.title, ", description=", this.description, ", animation="), this.animation, ", dismissIcon=", this.dismissIcon, ")");
        int i4 = IconCompatParcelizer + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.dismissIcon.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.animation);
        int i4 = read + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 103;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AndroidPopup_androidKtPopup1)) {
            return false;
        }
        AndroidPopup_androidKtPopup1 androidPopup_androidKtPopup1 = (AndroidPopup_androidKtPopup1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidPopup_androidKtPopup1.title}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 97;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, androidPopup_androidKtPopup1.description}, getCieXyz.write())).booleanValue()) {
            int i6 = read + 99;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 94 / 0;
            }
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.animation, androidPopup_androidKtPopup1.animation}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dismissIcon, androidPopup_androidKtPopup1.dismissIcon}, getCieXyz.write())).booleanValue();
        }
        int i8 = IconCompatParcelizer + 117;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
