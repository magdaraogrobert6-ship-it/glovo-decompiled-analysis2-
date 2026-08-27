package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$Destination$Companion;
import kotlinx.serialization.Serializable;
import o.InteropViewFactoryHolder_androidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FocusTargetPropertiesElement {
    public static final StateV3$AcceptData$Destination$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Destination$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 81;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            InteropViewFactoryHolder_androidKt interopViewFactoryHolder_androidKt = InteropViewFactoryHolder_androidKt.write;
            int i4 = read + 105;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return interopViewFactoryHolder_androidKt;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String address;
    public final String estimatedTimeDistance;
    public final String name;
    public final getLocalIsInPopupLayout tags;
    public final String title;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Destination$Companion] */
    static {
        int i = serializer + 5;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 50 / 0;
        }
    }

    public /* synthetic */ FocusTargetPropertiesElement(int i, String str, String str2, String str3, String str4, String str5, getLocalIsInPopupLayout getlocalisinpopuplayout) {
        Object obj = null;
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, InteropViewFactoryHolder_androidKt.write.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.title = null;
            int i2 = RemoteActionCompatParcelizer + 107;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            int i4 = RemoteActionCompatParcelizer + 17;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.address = null;
                obj.hashCode();
                throw null;
            }
            this.address = null;
        } else {
            this.address = str4;
            int i5 = write + 47;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.estimatedTimeDistance = null;
            int i8 = RemoteActionCompatParcelizer + 19;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            this.estimatedTimeDistance = str5;
        }
        if ((i & 32) == 0) {
            this.tags = null;
        } else {
            this.tags = getlocalisinpopuplayout;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Destination(type=", this.type, ", title=", this.title, ", name=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.name, ", address=", this.address, ", estimatedTimeDistance=");
        sbM.append(this.estimatedTimeDistance);
        sbM.append(", tags=");
        sbM.append(this.tags);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.type.hashCode();
        String str = this.title;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 113;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.name;
        if (str2 == null) {
            int i4 = RemoteActionCompatParcelizer + 33;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.address;
        if (str3 == null) {
            int i6 = write + 49;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.estimatedTimeDistance;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        getLocalIsInPopupLayout getlocalisinpopuplayout = this.tags;
        return (((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + (getlocalisinpopuplayout != null ? getlocalisinpopuplayout.items.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusTargetPropertiesElement)) {
            return false;
        }
        FocusTargetPropertiesElement focusTargetPropertiesElement = (FocusTargetPropertiesElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, focusTargetPropertiesElement.type}, getCieXyz.write())).booleanValue()) {
            int i3 = RemoteActionCompatParcelizer + 73;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, focusTargetPropertiesElement.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, focusTargetPropertiesElement.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, focusTargetPropertiesElement.address}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 51;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.estimatedTimeDistance, focusTargetPropertiesElement.estimatedTimeDistance}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 59;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, focusTargetPropertiesElement.tags}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 111;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
