package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Tag$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.heightDp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: renamed from: o.device, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class C0158device implements backgroundColor {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final List tags;
    public final String title;
    public static final OverlayItems$Tag$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Tag$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 1;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            heightDp heightdp = heightDp.serializer;
            int i4 = serializer + 7;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return heightdp;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(0))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Tag$Companion] */
    static {
        int i = write + 61;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public /* synthetic */ C0158device(List list, int i, String str) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.title = null;
            int i2 = RemoteActionCompatParcelizer + 27;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.title = str;
            int i4 = serializer + 53;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 / 3;
            } else {
                int i6 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            this.tags = list;
            return;
        }
        int i7 = serializer + 65;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            this.tags = null;
        } else {
            this.tags = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("Tag(title=", this.title, ", tags=", this.tags, ")");
        int i4 = serializer + 17;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return str;
    }

    public C0158device(String str, List list) {
        this.title = str;
        this.tags = list;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            str = this.title;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.title;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        }
        List list = this.tags;
        if (list != null) {
            iHashCode = list.hashCode();
            int i3 = serializer + 111;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0158device) {
            C0158device c0158device = (C0158device) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, c0158device.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, c0158device.tags}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 89;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 67;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
