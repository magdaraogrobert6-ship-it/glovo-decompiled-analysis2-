package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$Multiplier$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setReleaseBlock;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "multiplier")
public final class setUpdateBlock extends accessgetCurrentlyFocusedRect {
    public static final StateV3$AcceptData$Multiplier$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Multiplier$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                setReleaseBlock setreleaseblock = setReleaseBlock.RemoteActionCompatParcelizer;
                throw null;
            }
            setReleaseBlock setreleaseblock2 = setReleaseBlock.RemoteActionCompatParcelizer;
            int i3 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return setreleaseblock2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String multiplier;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Multiplier$Companion] */
    static {
        int i = IconCompatParcelizer + 1;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.multiplier;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.text;
        int i5 = i3 + 57;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ setUpdateBlock(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.multiplier = str;
            this.text = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setReleaseBlock.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Multiplier(multiplier=", this.multiplier, ", text=", this.text, ")");
        int i4 = serializer + 101;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.text.hashCode() % (this.multiplier.hashCode() % 21);
        }
        return this.text.hashCode() + (this.multiplier.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof setUpdateBlock)) {
                int i2 = serializer + 45;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            setUpdateBlock setupdateblock = (setUpdateBlock) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.multiplier, setupdateblock.multiplier}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, setupdateblock.text}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = serializer + 19;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = write + 33;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = serializer + 3;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 != 0;
    }
}
