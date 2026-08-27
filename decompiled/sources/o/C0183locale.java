package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Config$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Config$Trim;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.name;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: renamed from: o.locale, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class C0183locale {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final OverlayItems$Instruction$Config$Trim trim;
    public static final OverlayItems$Instruction$Config$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Config$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 55;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                name nameVar = name.RemoteActionCompatParcelizer;
                throw null;
            }
            name nameVar2 = name.RemoteActionCompatParcelizer;
            int i3 = read + 75;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 74 / 0;
            }
            return nameVar2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(2))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Config$Companion] */
    static {
        int i = IconCompatParcelizer + 43;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ C0183locale(int i, OverlayItems$Instruction$Config$Trim overlayItems$Instruction$Config$Trim) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.trim = null;
            int i2 = RemoteActionCompatParcelizer + 39;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.trim = overlayItems$Instruction$Config$Trim;
        int i4 = RemoteActionCompatParcelizer + 93;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        OverlayItems$Instruction$Config$Trim overlayItems$Instruction$Config$Trim = this.trim;
        if (overlayItems$Instruction$Config$Trim != null) {
            return overlayItems$Instruction$Config$Trim.hashCode();
        }
        int i5 = i3 + 83;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0 ? 1 : 0;
    }

    public C0183locale(OverlayItems$Instruction$Config$Trim overlayItems$Instruction$Config$Trim) {
        this.trim = overlayItems$Instruction$Config$Trim;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0183locale)) {
            return false;
        }
        if (this.trim == ((C0183locale) obj).trim) {
            return true;
        }
        int i4 = i3 + 27;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Config(trim=" + this.trim + ")";
        int i2 = RemoteActionCompatParcelizer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
