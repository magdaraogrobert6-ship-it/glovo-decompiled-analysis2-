package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerData$Companion;
import kotlinx.serialization.Serializable;
import o.getInlineClass;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdakX1auGmjk4nKnxFqVYyTYqzkc {
    public static final CustomerUnavailableTaskUiItem$CustomerData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerData$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getInlineClass getinlineclass = getInlineClass.RemoteActionCompatParcelizer;
                throw null;
            }
            getInlineClass getinlineclass2 = getInlineClass.RemoteActionCompatParcelizer;
            int i3 = RemoteActionCompatParcelizer + 119;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return getinlineclass2;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final getCompared customerCall;
    public final JoinedKey customerChat;
    public final ParameterInformation customerChatAndCall;
    public final String customerTitle;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerData$Companion] */
    static {
        int i = IconCompatParcelizer + 109;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ r8lambdakX1auGmjk4nKnxFqVYyTYqzkc(int i, String str, JoinedKey joinedKey, ParameterInformation parameterInformation) {
        if (7 == (i & 7)) {
            this.customerTitle = str;
            this.customerChat = joinedKey;
            this.customerCall = null;
            this.customerChatAndCall = parameterInformation;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getInlineClass.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public r8lambdakX1auGmjk4nKnxFqVYyTYqzkc(String str, JoinedKey joinedKey, getCompared getcompared, ParameterInformation parameterInformation) {
        str.getClass();
        this.customerTitle = str;
        this.customerChat = joinedKey;
        this.customerCall = getcompared;
        this.customerChatAndCall = parameterInformation;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.customerTitle.hashCode();
        JoinedKey joinedKey = this.customerChat;
        if (joinedKey == null) {
            int i2 = RemoteActionCompatParcelizer + 105;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = joinedKey.hashCode();
            int i4 = RemoteActionCompatParcelizer + 115;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        getCompared getcompared = this.customerCall;
        if (getcompared == null) {
            int i6 = serializer + 33;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = getcompared.hashCode();
        }
        ParameterInformation parameterInformation = this.customerChatAndCall;
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (parameterInformation != null ? parameterInformation.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomerData(customerTitle=" + this.customerTitle + ", customerChat=" + this.customerChat + ", customerCall=" + this.customerCall + ", customerChatAndCall=" + this.customerChatAndCall + ")";
        int i2 = serializer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 81;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof r8lambdakX1auGmjk4nKnxFqVYyTYqzkc) {
            r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc = (r8lambdakX1auGmjk4nKnxFqVYyTYqzkc) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerTitle, r8lambdakx1augmjk4nknxfqvyytyqzkc.customerTitle}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerChat, r8lambdakx1augmjk4nknxfqvyytyqzkc.customerChat}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerCall, r8lambdakx1augmjk4nknxfqvyytyqzkc.customerCall}, getCieXyz.write())).booleanValue()) {
                    int i4 = serializer + 113;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 == 0;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerChatAndCall, r8lambdakx1augmjk4nknxfqvyytyqzkc.customerChatAndCall}, getCieXyz.write())).booleanValue();
            }
            int i5 = RemoteActionCompatParcelizer + 77;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 115;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
