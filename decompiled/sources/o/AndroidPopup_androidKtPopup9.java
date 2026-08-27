package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$Host$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtPopuppopupLayout111;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidPopup_androidKtPopup9 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final List components;
    public final String type;
    public static final StateV3$Host$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$Host$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 33;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return AndroidPopup_androidKtPopuppopupLayout111.IconCompatParcelizer;
            }
            int i3 = 60 / 0;
            return AndroidPopup_androidKtPopuppopupLayout111.IconCompatParcelizer;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3$$ExternalSyntheticLambda0(22))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$Host$Companion] */
    static {
        int i = read + 117;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidPopup_androidKtPopup9(List list, int i, String str) {
        if (1 == (i & 1)) {
            this.type = str;
            if ((i & 2) == 0) {
                this.components = instance_delegatelambda0.write;
                int i2 = write + 89;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 8 / 0;
                    return;
                }
                return;
            }
            this.components = list;
            int i4 = write + 109;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidPopup_androidKtPopuppopupLayout111.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str = IconCompatParcelizer.read("Host(type=", this.type, ", components=", this.components, ")");
            int i3 = 20 / 0;
        } else {
            str = IconCompatParcelizer.read("Host(type=", this.type, ", components=", this.components, ")");
        }
        int i4 = write + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.components.hashCode() * (this.type.hashCode() + 36);
        } else {
            iHashCode = this.components.hashCode() + (this.type.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 37;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidPopup_androidKtPopup9) {
            AndroidPopup_androidKtPopup9 androidPopup_androidKtPopup9 = (AndroidPopup_androidKtPopup9) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, androidPopup_androidKtPopup9.type}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, androidPopup_androidKtPopup9.components}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 89;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = write + 103;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = write + 121;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
