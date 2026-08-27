package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$Map$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setResetBlock;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "map")
public final class unregisterSaveStateProvider extends accessgetCurrentlyFocusedRect {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final boolean enablePinConnections;
    public final List pins;
    public final boolean showRiderPin;
    public final String style;
    public static final StateV3$AcceptData$Map$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Map$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setResetBlock setresetblock = setResetBlock.write;
            int i4 = RemoteActionCompatParcelizer + 7;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setresetblock;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(13)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Map$Companion] */
    static {
        int i = serializer + 35;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ unregisterSaveStateProvider(int i, String str, List list, boolean z, boolean z2) {
        if (7 == (i & 7)) {
            this.pins = list;
            this.showRiderPin = z;
            this.style = str;
            if ((i & 8) == 0) {
                this.enablePinConnections = false;
                int i2 = RemoteActionCompatParcelizer + 59;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.enablePinConnections = z2;
            int i4 = read + 95;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, setResetBlock.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.enablePinConnections) + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.pins.hashCode() * 31, 31, this.showRiderPin), 31, this.style);
        int i4 = RemoteActionCompatParcelizer + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 105;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof unregisterSaveStateProvider) {
            unregisterSaveStateProvider unregistersavestateprovider = (unregisterSaveStateProvider) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pins, unregistersavestateprovider.pins}, getCieXyz.write())).booleanValue() || this.showRiderPin != unregistersavestateprovider.showRiderPin) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, unregistersavestateprovider.style}, getCieXyz.write())).booleanValue()) {
                return this.enablePinConnections == unregistersavestateprovider.enablePinConnections;
            }
            int i4 = read + 37;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i5 = read + 77;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Map(pins=" + this.pins + ", showRiderPin=" + this.showRiderPin + ", style=" + this.style + ", enablePinConnections=" + this.enablePinConnections + ")";
        int i2 = read + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
