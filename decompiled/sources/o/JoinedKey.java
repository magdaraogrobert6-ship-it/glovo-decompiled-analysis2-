package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerChat$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.NodeGroup;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class JoinedKey {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailableTaskUiItem$CustomerChat$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerChat$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                NodeGroup nodeGroup = NodeGroup.IconCompatParcelizer;
                throw null;
            }
            NodeGroup nodeGroup2 = NodeGroup.IconCompatParcelizer;
            int i3 = RemoteActionCompatParcelizer + 125;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return nodeGroup2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final List chatTrackingEvents;
    public final String customerChatButtonTitle;
    public final String id;
    public final List requiredSteps;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerChat$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(3)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(4))};
        int i = read + 45;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }

    public /* synthetic */ JoinedKey(int i, String str, String str2, List list, List list2) {
        if (15 == (i & 15)) {
            this.customerChatButtonTitle = str;
            this.chatTrackingEvents = list;
            this.id = str2;
            this.requiredSteps = list2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, NodeGroup.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("CustomerChat(customerChatButtonTitle=", this.customerChatButtonTitle, ", chatTrackingEvents=", this.chatTrackingEvents, ", id="), this.id, ", requiredSteps=", this.requiredSteps, ")");
            int i3 = write + 7;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("CustomerChat(customerChatButtonTitle=", this.customerChatButtonTitle, ", chatTrackingEvents=", this.chatTrackingEvents, ", id="), this.id, ", requiredSteps=", this.requiredSteps, ")");
        throw null;
    }

    public JoinedKey(List list, String str, List list2, String str2) {
        str.getClass();
        list.getClass();
        this.customerChatButtonTitle = str;
        this.chatTrackingEvents = list;
        this.id = str2;
        this.requiredSteps = list2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.chatTrackingEvents, this.customerChatButtonTitle.hashCode() * 31, 31);
        String str = this.id;
        if (str == null) {
            int i4 = IconCompatParcelizer + 69;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 4 % 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        List list = this.requiredSteps;
        return ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerChatButtonTitle, joinedKey.customerChatButtonTitle}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatTrackingEvents, joinedKey.chatTrackingEvents}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, joinedKey.id}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, joinedKey.requiredSteps}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = write + 123;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = IconCompatParcelizer + 33;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IconCompatParcelizer + 41;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
