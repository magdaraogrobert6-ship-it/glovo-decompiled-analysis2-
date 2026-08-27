package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.SoftPosPayment$Error$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetOptionalLocalcp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontLoadingStrategyCompanion {
    public static final SoftPosPayment$Error$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.SoftPosPayment$Error$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 19;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetOptionalLocalcp accessgetoptionallocalcp = accessgetOptionalLocalcp.IconCompatParcelizer;
            int i4 = write + 7;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
            }
            return accessgetoptionallocalcp;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String description;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.SoftPosPayment$Error$Companion] */
    static {
        int i = write + 93;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 83;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 117;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ FontLoadingStrategyCompanion(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.description = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accessgetOptionalLocalcp.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Error(title=", this.title, ", description=", this.description, ")");
        }
        int i3 = 81 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Error(title=", this.title, ", description=", this.description, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.description.hashCode() % (this.title.hashCode() >>> 8);
        }
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 123;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FontLoadingStrategyCompanion)) {
            return false;
        }
        FontLoadingStrategyCompanion fontLoadingStrategyCompanion = (FontLoadingStrategyCompanion) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fontLoadingStrategyCompanion.title}, getCieXyz.write())).booleanValue()) {
            Object obj2 = null;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, fontLoadingStrategyCompanion.description}, getCieXyz.write())).booleanValue())) {
                int i4 = IconCompatParcelizer + 75;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i5 = serializer + 61;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        int i6 = IconCompatParcelizer + 81;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
