package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Translation$Companion;
import java.util.List;
import kotlinx.serialization.Serializable;
import o.Group;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class Path9cdaXJ4 {
    public final List supportedLanguages;
    public final String userPreferredLanguage;
    public static final HostMessage$HostAppProvidesChatConfig$Payload$Translation$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Translation$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return Group.IconCompatParcelizer;
        }
    };
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), null};

    public final int hashCode() {
        int iHashCode = this.supportedLanguages.hashCode();
        String str = this.userPreferredLanguage;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Path9cdaXJ4)) {
            return false;
        }
        Path9cdaXJ4 path9cdaXJ4 = (Path9cdaXJ4) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.supportedLanguages, path9cdaXJ4.supportedLanguages}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userPreferredLanguage, path9cdaXJ4.userPreferredLanguage}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Translation(supportedLanguages=");
        sb.append(this.supportedLanguages);
        sb.append(", userPreferredLanguage=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.userPreferredLanguage, ')');
    }

    public /* synthetic */ Path9cdaXJ4(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.supportedLanguages = list;
            this.userPreferredLanguage = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, Group.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public Path9cdaXJ4(List list, String str) {
        this.supportedLanguages = list;
        this.userPreferredLanguage = str;
    }
}
