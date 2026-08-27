package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Companion;
import com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontFamilyResolver_androidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class emptyCacheFontFamilyResolver {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final OverlayComponent$OverlayInstruction$Config$Trim trim;
    public static final OverlayComponent$OverlayInstruction$Config$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 125;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontFamilyResolver_androidKt fontFamilyResolver_androidKt = FontFamilyResolver_androidKt.serializer;
            int i4 = RemoteActionCompatParcelizer + 121;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fontFamilyResolver_androidKt;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(26))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Companion] */
    static {
        int i = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final OverlayComponent$OverlayInstruction$Config$Trim write() {
        int i = 2 % 2;
        int i2 = read + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.trim;
        }
        int i3 = 10 / 0;
        return this.trim;
    }

    public /* synthetic */ emptyCacheFontFamilyResolver(int i, OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$Trim) {
        if ((i & 1) == 0) {
            this.trim = null;
            int i2 = serializer + 111;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.trim = overlayComponent$OverlayInstruction$Config$Trim;
        int i4 = read + 53;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$Trim = this.trim;
        if (overlayComponent$OverlayInstruction$Config$Trim == null) {
            int i2 = serializer + 79;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = overlayComponent$OverlayInstruction$Config$Trim.hashCode();
        int i4 = serializer + 67;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 61;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof emptyCacheFontFamilyResolver) || this.trim != ((emptyCacheFontFamilyResolver) obj).trim) {
            return false;
        }
        int i4 = read + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Config(trim=" + this.trim + ")";
        int i2 = read + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
