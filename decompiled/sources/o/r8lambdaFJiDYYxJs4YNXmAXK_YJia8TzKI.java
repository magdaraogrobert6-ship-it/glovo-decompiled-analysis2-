package o;

import android.annotation.SuppressLint;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesCallButtonClick$Payload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class r8lambdaFJiDYYxJs4YNXmAXK_YJia8TzKI {
    public static final BridgeMessage$ClientNotifiesCallButtonClick$Payload$Companion Companion = new BridgeMessage$ClientNotifiesCallButtonClick$Payload$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String phoneNumber;

    static {
        int i = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
    }

    public /* synthetic */ r8lambdaFJiDYYxJs4YNXmAXK_YJia8TzKI(int i, String str) {
        if (1 == (i & 1)) {
            this.phoneNumber = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ToggleableStateKt.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.phoneNumber.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.phoneNumber.hashCode();
        int i3 = write + 79;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = serializer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = ff$$ExternalSyntheticOutline0.m("Payload(phoneNumber=", this.phoneNumber, ")");
            int i3 = 18 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("Payload(phoneNumber=", this.phoneNumber, ")");
        }
        int i4 = serializer + 33;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 113;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (obj instanceof r8lambdaFJiDYYxJs4YNXmAXK_YJia8TzKI) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, ((r8lambdaFJiDYYxJs4YNXmAXK_YJia8TzKI) obj).phoneNumber}, getCieXyz.write())).booleanValue();
        }
        int i3 = serializer + 45;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
