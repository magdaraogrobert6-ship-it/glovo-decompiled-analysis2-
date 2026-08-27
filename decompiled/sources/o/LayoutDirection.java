package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.PictureTags$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.toSizeozmzZPI;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class LayoutDirection {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String mainIcon;
    public final List tags;
    public final String title;
    public static final PictureTags$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.PictureTags$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 85;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return toSizeozmzZPI.write;
            }
            toSizeozmzZPI tosizeozmzzpi = toSizeozmzZPI.write;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(5))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.PictureTags$Companion] */
    static {
        Object obj = null;
        int i = write + 123;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    public /* synthetic */ LayoutDirection(int i, String str, String str2, List list) {
        int i2;
        if ((i & 1) == 0) {
            this.title = "";
            int i3 = RemoteActionCompatParcelizer + 25;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
            }
            if ((i & 2) == 0) {
                int i4 = RemoteActionCompatParcelizer + 103;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                this.mainIcon = "";
            } else {
                this.mainIcon = str2;
                i2 = RemoteActionCompatParcelizer + 21;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            }
            if ((i & 4) == 0) {
                this.tags = instance_delegatelambda0.write;
            } else {
                this.tags = list;
            }
        }
        this.title = str;
        int i7 = RemoteActionCompatParcelizer + 35;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = 2 % 2;
        if ((i & 2) == 0) {
            int i10 = RemoteActionCompatParcelizer + 103;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            this.mainIcon = "";
        } else {
            this.mainIcon = str2;
            i2 = RemoteActionCompatParcelizer + 21;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i12 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            this.tags = instance_delegatelambda0.write;
        } else {
            this.tags = list;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("PictureTags(title=", this.title, ", mainIcon=", this.mainIcon, ", tags="), this.tags, ")");
        int i4 = RemoteActionCompatParcelizer + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return str;
    }

    public LayoutDirection(String str, String str2, List list) {
        this.title = str;
        this.mainIcon = str2;
        this.tags = list;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            str = this.title;
            iHashCode = 1;
            iHashCode2 = str == null ? 0 : str.hashCode();
        } else {
            str = this.title;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = 0;
            }
        }
        String str2 = this.mainIcon;
        if (str2 == null) {
            int i3 = serializer + 91;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode3 = str2.hashCode();
        }
        List list = this.tags;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof LayoutDirection) {
                LayoutDirection layoutDirection = (LayoutDirection) obj;
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, layoutDirection.title}, getCieXyz.write())).booleanValue())) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mainIcon, layoutDirection.mainIcon}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, layoutDirection.tags}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i2 = RemoteActionCompatParcelizer + 71;
                        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    int i4 = serializer + 83;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 == 0;
                }
                int i5 = RemoteActionCompatParcelizer + 25;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = RemoteActionCompatParcelizer + 67;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i8 = RemoteActionCompatParcelizer + 97;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
