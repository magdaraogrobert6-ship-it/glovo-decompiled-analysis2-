package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.password_rules.entity.Rule$Companion;
import kotlinx.serialization.Serializable;
import o.ContextsKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class colorToRgbaArray {
    public static final Rule$Companion Companion = new Object() { // from class: com.roadrunner.password_rules.entity.Rule$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 97;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return ContextsKt.serializer;
            }
            ContextsKt contextsKt = ContextsKt.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final int order;
    public final String pattern;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.password_rules.entity.Rule$Companion] */
    static {
        int i = read + 9;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ colorToRgbaArray(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.pattern = str;
            this.order = i2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ContextsKt.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Integer.hashCode(this.order) >>> (this.pattern.hashCode() % 16);
        }
        return (this.pattern.hashCode() * 31) + Integer.hashCode(this.order);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof colorToRgbaArray)) {
            return false;
        }
        colorToRgbaArray colortorgbaarray = (colorToRgbaArray) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pattern, colortorgbaarray.pattern}, getCieXyz.write())).booleanValue()) {
            if (this.order != colortorgbaarray.order) {
                int i2 = RemoteActionCompatParcelizer + 89;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RemoteActionCompatParcelizer + 13;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Rule(pattern=" + this.pattern + ", order=" + this.order + ")";
        int i2 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
