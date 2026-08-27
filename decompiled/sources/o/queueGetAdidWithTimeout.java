package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.recentdeliveries.data.model.ProxyPhoneNumberResponse$Companion;
import kotlinx.serialization.Serializable;
import o.readActivityStateI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class queueGetAdidWithTimeout {
    public static final ProxyPhoneNumberResponse$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.ProxyPhoneNumberResponse$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 39;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                readActivityStateI readactivitystatei = readActivityStateI.RemoteActionCompatParcelizer;
                throw null;
            }
            readActivityStateI readactivitystatei2 = readActivityStateI.RemoteActionCompatParcelizer;
            int i3 = serializer + 121;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
            }
            return readactivitystatei2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String customerProxyNumber;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.ProxyPhoneNumberResponse$Companion] */
    static {
        int i = write + 121;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ queueGetAdidWithTimeout(int i, String str) {
        if (1 == (i & 1)) {
            this.customerProxyNumber = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, readActivityStateI.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.customerProxyNumber.hashCode();
        }
        this.customerProxyNumber.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = ff$$ExternalSyntheticOutline0.m("ProxyPhoneNumberResponse(customerProxyNumber=", this.customerProxyNumber, ")");
            int i3 = 96 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("ProxyPhoneNumberResponse(customerProxyNumber=", this.customerProxyNumber, ")");
        }
        int i4 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof queueGetAdidWithTimeout) {
                Object[] objArr = {this.customerProxyNumber, ((queueGetAdidWithTimeout) obj).customerProxyNumber};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = RemoteActionCompatParcelizer + 37;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer + 117;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
