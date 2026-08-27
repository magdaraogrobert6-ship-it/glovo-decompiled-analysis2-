package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.ItemComponent$Item$Extra$Companion;
import kotlinx.serialization.Serializable;
import o.PopupLayoutCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setPopupContentSizefhxjrPA {
    public static final ItemComponent$Item$Extra$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.ItemComponent$Item$Extra$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 33;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                PopupLayoutCompanion popupLayoutCompanion = PopupLayoutCompanion.RemoteActionCompatParcelizer;
                throw null;
            }
            PopupLayoutCompanion popupLayoutCompanion2 = PopupLayoutCompanion.RemoteActionCompatParcelizer;
            int i3 = serializer + 21;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return popupLayoutCompanion2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final String price;
    public final String quantity;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.ItemComponent$Item$Extra$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ setPopupContentSizefhxjrPA(int i, String str, String str2, String str3) {
        if (3 == (i & 3)) {
            this.title = str;
            this.price = str2;
            if ((i & 4) == 0) {
                this.quantity = null;
                int i2 = read + 93;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.quantity = str3;
            int i4 = write + 11;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PopupLayoutCompanion.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Extra(title=", this.title, ", price=", this.price, ", quantity="), this.quantity, ")");
        int i4 = read + 39;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.price);
        String str = this.quantity;
        if (str == null) {
            int i4 = read + 45;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = iM + iHashCode;
        int i7 = read + 117;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return i6;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPopupContentSizefhxjrPA)) {
            return false;
        }
        setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa = (setPopupContentSizefhxjrPA) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, setpopupcontentsizefhxjrpa.title}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.price, setpopupcontentsizefhxjrpa.price}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.quantity, setpopupcontentsizefhxjrpa.quantity}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = write;
            int i3 = i2 + 3;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i3 % 2 == 0;
            int i4 = i2 + 29;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return z;
            }
            throw null;
        }
        int i5 = write + 81;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
