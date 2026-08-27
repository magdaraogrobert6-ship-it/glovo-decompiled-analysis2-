package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayTag$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontFamilyTypefaceAdapter;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "overlay_tags")
public final class resolveAsTypefaceWqqsr6A implements FontFamilyResolverKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final List tags;
    public final String title;
    public static final OverlayComponent$OverlayTag$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayTag$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 79;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontFamilyTypefaceAdapter fontFamilyTypefaceAdapter = FontFamilyTypefaceAdapter.IconCompatParcelizer;
            int i4 = read + 83;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return fontFamilyTypefaceAdapter;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(28))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayTag$Companion] */
    static {
        int i = serializer + 53;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.tags;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 49;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.title;
            int i4 = 45 / 0;
        } else {
            str = this.title;
        }
        int i5 = i2 + 89;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ resolveAsTypefaceWqqsr6A(List list, int i, String str) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.title = null;
            int i2 = 2 % 2;
        } else {
            this.title = str;
        }
        if ((i & 2) != 0) {
            this.tags = list;
            int i3 = RemoteActionCompatParcelizer + 59;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = IconCompatParcelizer + 59;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i5;
        int i6 = i4 % 2;
        this.tags = null;
        int i7 = i5 + 13;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return IconCompatParcelizer.read("OverlayTag(title=", this.title, ", tags=", this.tags, ")");
        }
        IconCompatParcelizer.read("OverlayTag(title=", this.title, ", tags=", this.tags, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 == 0 ? (str = this.title) != null : (str = this.title) != null) ? str.hashCode() : 0;
        List list = this.tags;
        if (list == null) {
            int i3 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode = list.hashCode();
            int i5 = IconCompatParcelizer + 109;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 35;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 43;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return true;
        }
        if (!(obj instanceof resolveAsTypefaceWqqsr6A)) {
            return false;
        }
        resolveAsTypefaceWqqsr6A resolveastypefacewqqsr6a = (resolveAsTypefaceWqqsr6A) obj;
        Object[] objArr = {this.title, resolveastypefacewqqsr6a.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.tags, resolveastypefacewqqsr6a.tags};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i10 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
