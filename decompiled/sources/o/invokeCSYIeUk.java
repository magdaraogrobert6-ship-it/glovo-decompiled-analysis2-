package o;

import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostNotifiesAboutVisibilityChange$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.VectorComposeKtPath214;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class invokeCSYIeUk {
    public static final HostMessage$HostNotifiesAboutVisibilityChange$Payload$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostNotifiesAboutVisibilityChange$Payload$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorComposeKtPath214.serializer;
        }
    };
    public final boolean isWebViewVisible;

    public final int hashCode() {
        return Boolean.hashCode(this.isWebViewVisible);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof invokeCSYIeUk) && this.isWebViewVisible == ((invokeCSYIeUk) obj).isWebViewVisible;
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("Payload(isWebViewVisible="), this.isWebViewVisible, ')');
    }

    public /* synthetic */ invokeCSYIeUk(int i, boolean z) {
        if (1 == (i & 1)) {
            this.isWebViewVisible = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, VectorComposeKtPath214.serializer.getDescriptor());
            throw null;
        }
    }

    public invokeCSYIeUk(boolean z) {
        this.isWebViewVisible = z;
    }
}
