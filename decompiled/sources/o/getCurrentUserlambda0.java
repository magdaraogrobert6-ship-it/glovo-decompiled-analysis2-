package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$PrimaryButton$Companion;
import kotlinx.serialization.Serializable;
import o.getOutboundNetworkRequestsOffline;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "primary_button")
public final class getCurrentUserlambda0 extends getContentCardCountlambda0 {
    public static final StartWorkingComponent$PrimaryButton$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$PrimaryButton$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 93;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getOutboundNetworkRequestsOffline getoutboundnetworkrequestsoffline = getOutboundNetworkRequestsOffline.write;
            int i4 = read + 29;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getoutboundnetworkrequestsoffline;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String key;
    public final enableDelayedInitialization label;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$PrimaryButton$Companion] */
    static {
        int i = serializer + 93;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getCurrentUserlambda0(int i, String str, enableDelayedInitialization enabledelayedinitialization) {
        if (3 == (i & 3)) {
            this.key = str;
            this.label = enabledelayedinitialization;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getOutboundNetworkRequestsOffline.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.label.text.hashCode() + (this.key.hashCode() * 31);
        int i4 = IconCompatParcelizer + 87;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PrimaryButton(key=" + this.key + ", label=" + this.label + ")";
        int i2 = write + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof getCurrentUserlambda0))) {
                getCurrentUserlambda0 getcurrentuserlambda0 = (getCurrentUserlambda0) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, getcurrentuserlambda0.key}, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 29;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, getcurrentuserlambda0.label}, getCieXyz.write())).booleanValue())) {
                    return true;
                }
                int i4 = IconCompatParcelizer + 47;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = write + 59;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        int i7 = IconCompatParcelizer + 17;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
