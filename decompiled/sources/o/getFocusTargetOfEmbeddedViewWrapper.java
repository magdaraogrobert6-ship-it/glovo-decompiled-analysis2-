package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$DeclineButton$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FocusGroupPropertiesNode;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "decline")
public final class getFocusTargetOfEmbeddedViewWrapper extends accessgetCurrentlyFocusedRect {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final setAttachedViewTreeObserver confirmation;
    public final List events;
    public final String title;
    public static final StateV3$AcceptData$DeclineButton$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$DeclineButton$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            FocusGroupPropertiesNode focusGroupPropertiesNode;
            int i = 2 % 2;
            int i2 = read + 103;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                focusGroupPropertiesNode = FocusGroupPropertiesNode.write;
                int i3 = 19 / 0;
            } else {
                focusGroupPropertiesNode = FocusGroupPropertiesNode.write;
            }
            int i4 = read + 17;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return focusGroupPropertiesNode;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(1))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$DeclineButton$Companion] */
    static {
        int i = write + 67;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getFocusTargetOfEmbeddedViewWrapper(int i, String str, setAttachedViewTreeObserver setattachedviewtreeobserver, List list) {
        if (3 == (i & 3)) {
            this.title = str;
            this.confirmation = setattachedviewtreeobserver;
            if ((i & 4) == 0) {
                this.events = instance_delegatelambda0.write;
                int i2 = serializer + 15;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 32 / 0;
                    return;
                }
                return;
            }
            this.events = list;
            int i4 = serializer + 119;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, FocusGroupPropertiesNode.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iHashCode2 = this.title.hashCode();
            iHashCode = this.events.hashCode() >>> ((this.confirmation.hashCode() / (iHashCode2 >>> 123)) >> 53);
        } else {
            int iHashCode3 = this.title.hashCode();
            iHashCode = this.events.hashCode() + ((this.confirmation.hashCode() + (iHashCode3 * 31)) * 31);
        }
        int i3 = serializer + 75;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeclineButton(title=");
        sb.append(this.title);
        sb.append(", confirmation=");
        sb.append(this.confirmation);
        sb.append(", events=");
        String str = MediaSessionCompatQueueItem.read(sb, this.events, ")");
        int i2 = serializer + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 111;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof getFocusTargetOfEmbeddedViewWrapper)) {
            int i3 = serializer + 117;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        getFocusTargetOfEmbeddedViewWrapper getfocustargetofembeddedviewwrapper = (getFocusTargetOfEmbeddedViewWrapper) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getfocustargetofembeddedviewwrapper.title}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer;
            int i5 = i4 + 79;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 41;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmation, getfocustargetofembeddedviewwrapper.confirmation}, getCieXyz.write())).booleanValue()) {
            int i9 = IconCompatParcelizer + 27;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.events, getfocustargetofembeddedviewwrapper.events}, getCieXyz.write())).booleanValue() ^ true);
    }
}
