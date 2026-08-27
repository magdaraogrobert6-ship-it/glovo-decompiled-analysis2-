package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerChatAndCall$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessboundsOfLayoutNode;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ParameterInformation {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailableTaskUiItem$CustomerChatAndCall$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerChatAndCall$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 25;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessboundsOfLayoutNode accessboundsoflayoutnode = accessboundsOfLayoutNode.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 61;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return accessboundsoflayoutnode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final List chatAndCallTrackingEvents;
    public final String customerChatAndCallButtonTitle;
    public final String id;
    public final List requiredSteps;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CustomerChatAndCall$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        Object obj = null;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(5)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(6))};
        int i = read + 35;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ParameterInformation(int i, String str, String str2, List list, List list2) {
        if (15 == (i & 15)) {
            this.customerChatAndCallButtonTitle = str;
            this.chatAndCallTrackingEvents = list;
            this.id = str2;
            this.requiredSteps = list2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, accessboundsOfLayoutNode.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("CustomerChatAndCall(customerChatAndCallButtonTitle=", this.customerChatAndCallButtonTitle, ", chatAndCallTrackingEvents=", this.chatAndCallTrackingEvents, ", id="), this.id, ", requiredSteps=", this.requiredSteps, ")");
        int i4 = write + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public ParameterInformation(List list, String str, List list2, String str2) {
        str.getClass();
        list.getClass();
        this.customerChatAndCallButtonTitle = str;
        this.chatAndCallTrackingEvents = list;
        this.id = str2;
        this.requiredSteps = list2;
    }

    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iM = c8$$ExternalSyntheticOutline0.m(this.chatAndCallTrackingEvents, this.customerChatAndCallButtonTitle.hashCode() >>> 10, 79);
            str = this.id;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        } else {
            iM = c8$$ExternalSyntheticOutline0.m(this.chatAndCallTrackingEvents, this.customerChatAndCallButtonTitle.hashCode() * 31, 31);
            str = this.id;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        }
        List list = this.requiredSteps;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        int i3 = ((iM + iHashCode2) * 31) + iHashCode;
        int i4 = IconCompatParcelizer + 95;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return i3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 45;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParameterInformation)) {
            int i5 = i2 + 111;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        ParameterInformation parameterInformation = (ParameterInformation) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerChatAndCallButtonTitle, parameterInformation.customerChatAndCallButtonTitle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatAndCallTrackingEvents, parameterInformation.chatAndCallTrackingEvents}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, parameterInformation.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, parameterInformation.requiredSteps}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = write + 57;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
