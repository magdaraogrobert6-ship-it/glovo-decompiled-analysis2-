package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$DeclineButtonV2$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getFocusedChild;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "decline_v2")
public final class FocusGroupPropertiesElement extends accessgetCurrentlyFocusedRect {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final setFocusedChild confirmation;
    public final List events;
    public final String title;
    public static final StateV3$AcceptData$DeclineButtonV2$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$DeclineButtonV2$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 117;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getFocusedChild.read;
            }
            getFocusedChild getfocusedchild = getFocusedChild.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(2))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$DeclineButtonV2$Companion] */
    static {
        int i = write + 3;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
    }

    public /* synthetic */ FocusGroupPropertiesElement(int i, String str, setFocusedChild setfocusedchild, List list) {
        if (3 == (i & 3)) {
            this.title = str;
            this.confirmation = setfocusedchild;
            if ((i & 4) == 0) {
                this.events = instance_delegatelambda0.write;
                int i2 = serializer + 99;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 47 / 0;
                    return;
                }
                return;
            }
            this.events = list;
            int i4 = read + 23;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getFocusedChild.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.events.hashCode() + ((this.confirmation.hashCode() + (iHashCode * 31)) * 31);
        int i4 = serializer + 29;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeclineButtonV2(title=");
        sb.append(this.title);
        sb.append(", confirmation=");
        sb.append(this.confirmation);
        sb.append(", events=");
        String str = MediaSessionCompatQueueItem.read(sb, this.events, ")");
        int i2 = serializer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 33;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 121;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof FocusGroupPropertiesElement)) {
            int i7 = i2 + 25;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        FocusGroupPropertiesElement focusGroupPropertiesElement = (FocusGroupPropertiesElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, focusGroupPropertiesElement.title}, getCieXyz.write())).booleanValue()) {
            int i9 = read + 109;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmation, focusGroupPropertiesElement.confirmation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.events, focusGroupPropertiesElement.events}, getCieXyz.write())).booleanValue();
    }
}
