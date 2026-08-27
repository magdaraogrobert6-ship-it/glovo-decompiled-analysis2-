package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.database.converters.Tags$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getPlaceholderVerticalAlignJ6kI3mc;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class PlaceholderVerticalAlign {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final List tags;
    public static final Tags$Companion Companion = new Object() { // from class: com.roadrunner.database.converters.Tags$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            getPlaceholderVerticalAlignJ6kI3mc getplaceholderverticalalignj6ki3mc;
            int i = 2 % 2;
            int i2 = write + 53;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                getplaceholderverticalalignj6ki3mc = getPlaceholderVerticalAlignJ6kI3mc.serializer;
                int i3 = 29 / 0;
            } else {
                getplaceholderverticalalignj6ki3mc = getPlaceholderVerticalAlignJ6kI3mc.serializer;
            }
            int i4 = RemoteActionCompatParcelizer + 47;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 18 / 0;
            }
            return getplaceholderverticalalignj6ki3mc;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(0))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.converters.Tags$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 113;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.tags.hashCode();
            int i3 = 10 / 0;
        } else {
            iHashCode = this.tags.hashCode();
        }
        int i4 = serializer + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public /* synthetic */ PlaceholderVerticalAlign(int i, List list) {
        if ((i & 1) == 0) {
            this.tags = instance_delegatelambda0.write;
            int i2 = serializer + 23;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 95 / 0;
                return;
            }
            return;
        }
        this.tags = list;
        int i4 = read + 105;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatQueueItem.read("Tags(tags=", ")", this.tags);
        }
        MediaSessionCompatQueueItem.read("Tags(tags=", ")", this.tags);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 55;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof PlaceholderVerticalAlign)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, ((PlaceholderVerticalAlign) obj).tags}, getCieXyz.write())).booleanValue()) {
                int i5 = serializer + 45;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = read + 53;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 24 / 0;
            }
            return true;
        }
        int i9 = i2 + 69;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }
}
