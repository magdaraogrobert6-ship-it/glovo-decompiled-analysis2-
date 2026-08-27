package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientChatTranslationToggled$Payload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class PathNodeReflectiveQuadTo {
    public static final BridgeMessage$ClientChatTranslationToggled$Payload$Companion Companion = new BridgeMessage$ClientChatTranslationToggled$Payload$Companion();
    public final boolean translationEnabled;

    public final boolean RemoteActionCompatParcelizer() {
        return this.translationEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.translationEnabled);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PathNodeReflectiveQuadTo) && this.translationEnabled == ((PathNodeReflectiveQuadTo) obj).translationEnabled;
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("Payload(translationEnabled="), this.translationEnabled, ')');
    }

    public /* synthetic */ PathNodeReflectiveQuadTo(int i, boolean z) {
        if (1 == (i & 1)) {
            this.translationEnabled = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getArcStartDy.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }
}
