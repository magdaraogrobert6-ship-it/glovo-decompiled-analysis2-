package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.data.models.AutoAcceptParams$Companion;
import kotlinx.serialization.Serializable;
import o.mergeZ1GrekIdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class copyaIRg9q4default {
    public static final AutoAcceptParams$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.data.models.AutoAcceptParams$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 59;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            mergeZ1GrekIdefault mergez1grekidefault = mergeZ1GrekIdefault.RemoteActionCompatParcelizer;
            int i4 = serializer + 69;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return mergez1grekidefault;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String source;
    public final String trigger;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.data.models.AutoAcceptParams$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ copyaIRg9q4default(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.trigger = str;
            this.source = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, mergeZ1GrekIdefault.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AutoAcceptParams(trigger=", this.trigger, ", source=", this.source, ")");
        int i4 = write + 85;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.source.hashCode() % (this.trigger.hashCode() % 76);
        }
        return this.source.hashCode() + (this.trigger.hashCode() * 31);
    }

    public copyaIRg9q4default(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.trigger = str;
        this.source = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof copyaIRg9q4default) {
            copyaIRg9q4default copyairg9q4default = (copyaIRg9q4default) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trigger, copyairg9q4default.trigger}, getCieXyz.write())).booleanValue()) {
                int i2 = serializer + 45;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.source, copyairg9q4default.source}, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 13;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
            int i5 = write + 83;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i6 = write + 23;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
