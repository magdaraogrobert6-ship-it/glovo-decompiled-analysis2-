package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$EarningsDetails$Companion;
import kotlinx.serialization.Serializable;
import o.registerSaveStateProvider;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FocusTargetInteropNoderetrievePinnableContainer1 {
    public static final StateV3$AcceptData$Earnings$EarningsDetails$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$EarningsDetails$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 101;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            registerSaveStateProvider registersavestateprovider = registerSaveStateProvider.IconCompatParcelizer;
            int i4 = serializer + 27;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return registersavestateprovider;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String paidDistance;
    public final String primary;
    public final PopupTestTag promoBonus;
    public final accessunregisterSaveStateProvider secondary;
    public final String tagName;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$EarningsDetails$Companion] */
    static {
        int i = serializer + 41;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ FocusTargetInteropNoderetrievePinnableContainer1(int i, String str, String str2, String str3, accessunregisterSaveStateProvider accessunregistersavestateprovider, PopupTestTag popupTestTag, String str4) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.primary = null;
        } else {
            this.primary = str2;
            int i2 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i3 = read + 45;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                this.paidDistance = null;
                int i4 = 87 / 0;
            } else {
                this.paidDistance = null;
            }
        } else {
            this.paidDistance = str3;
        }
        if ((i & 8) == 0) {
            this.secondary = null;
        } else {
            this.secondary = accessunregistersavestateprovider;
        }
        int i5 = 2 % 2;
        if ((i & 16) == 0) {
            this.promoBonus = null;
        } else {
            this.promoBonus = popupTestTag;
            int i6 = IconCompatParcelizer + 89;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 32) == 0) {
            this.tagName = null;
        } else {
            this.tagName = str4;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("EarningsDetails(title=", this.title, ", primary=", this.primary, ", paidDistance=");
        sbM.append(this.paidDistance);
        sbM.append(", secondary=");
        sbM.append(this.secondary);
        sbM.append(", promoBonus=");
        sbM.append(this.promoBonus);
        sbM.append(", tagName=");
        sbM.append(this.tagName);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 113;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.title;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.primary;
        if (str2 == null) {
            int i2 = read + 41;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.paidDistance;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        accessunregisterSaveStateProvider accessunregistersavestateprovider = this.secondary;
        int iHashCode6 = accessunregistersavestateprovider == null ? 0 : accessunregistersavestateprovider.hashCode();
        PopupTestTag popupTestTag = this.promoBonus;
        if (popupTestTag == null) {
            int i4 = IconCompatParcelizer;
            int i5 = i4 + 73;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i5 % 2 != 0 ? 1 : 0;
            int i6 = i4 + 71;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = popupTestTag.hashCode();
        }
        String str4 = this.tagName;
        if (str4 != null) {
            iHashCode3 = str4.hashCode();
            int i8 = read + 75;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return (((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 115;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof FocusTargetInteropNoderetrievePinnableContainer1)) {
            int i3 = read + 19;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        FocusTargetInteropNoderetrievePinnableContainer1 focusTargetInteropNoderetrievePinnableContainer1 = (FocusTargetInteropNoderetrievePinnableContainer1) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, focusTargetInteropNoderetrievePinnableContainer1.title}, getCieXyz.write())).booleanValue()) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.primary, focusTargetInteropNoderetrievePinnableContainer1.primary}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paidDistance, focusTargetInteropNoderetrievePinnableContainer1.paidDistance}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.secondary, focusTargetInteropNoderetrievePinnableContainer1.secondary}, getCieXyz.write())).booleanValue()) {
                        int i5 = read + 45;
                        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.promoBonus, focusTargetInteropNoderetrievePinnableContainer1.promoBonus}, getCieXyz.write())).booleanValue()) {
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tagName, focusTargetInteropNoderetrievePinnableContainer1.tagName}, getCieXyz.write())).booleanValue();
                    }
                }
            }
            return false;
        }
        int i7 = IconCompatParcelizer + 39;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
