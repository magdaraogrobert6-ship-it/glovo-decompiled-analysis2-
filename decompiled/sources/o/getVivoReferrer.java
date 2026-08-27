package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.shiftextension.data.entity.ShiftExtensionRequest$Companion;
import kotlinx.serialization.Serializable;
import o.getMetaReferrer;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getVivoReferrer {
    public static final ShiftExtensionRequest$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.shiftextension.data.entity.ShiftExtensionRequest$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            getMetaReferrer getmetareferrer;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 117;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getmetareferrer = getMetaReferrer.write;
                int i3 = 9 / 0;
            } else {
                getmetareferrer = getMetaReferrer.write;
            }
            int i4 = write + 79;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getmetareferrer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final boolean agreedToExtendCurrentShift;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.shiftextension.data.entity.ShiftExtensionRequest$Companion] */
    static {
        int i = read + 87;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getVivoReferrer(int i, boolean z) {
        if (1 == (i & 1)) {
            this.agreedToExtendCurrentShift = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getMetaReferrer.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.agreedToExtendCurrentShift);
        int i4 = serializer + 15;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("ShiftExtensionRequest(agreedToExtendCurrentShift=", ")", this.agreedToExtendCurrentShift);
        int i4 = serializer + 49;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getVivoReferrer) {
                if (this.agreedToExtendCurrentShift == ((getVivoReferrer) obj).agreedToExtendCurrentShift) {
                    return true;
                }
                int i2 = serializer + 125;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = serializer + 17;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 21;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public getVivoReferrer(boolean z) {
        this.agreedToExtendCurrentShift = z;
    }
}
