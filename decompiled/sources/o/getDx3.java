package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesCallButtonClick$Payload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class getDx3 {
    public static final BridgeMessage$ClientNotifiesCallButtonClick$Payload$Companion Companion = new BridgeMessage$ClientNotifiesCallButtonClick$Payload$Companion();
    public final String phoneNumber;

    public final String serializer() {
        return this.phoneNumber;
    }

    public final int hashCode() {
        return this.phoneNumber.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDx3)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, ((getDx3) obj).phoneNumber}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Payload(phoneNumber="), this.phoneNumber, ')');
    }

    public /* synthetic */ getDx3(int i, String str) {
        if (1 == (i & 1)) {
            this.phoneNumber = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, PathNodeRelativeLineTo.write.getDescriptor());
            throw null;
        }
    }
}
