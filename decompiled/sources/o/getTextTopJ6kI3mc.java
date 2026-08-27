package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.database.entity.StartingArea$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getIncludeFontPadding;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getTextTopJ6kI3mc {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final List coordinates;
    public static final StartingArea$Companion Companion = new Object() { // from class: com.roadrunner.database.entity.StartingArea$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 67;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getIncludeFontPadding getincludefontpadding = getIncludeFontPadding.write;
            int i4 = RemoteActionCompatParcelizer + 77;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getincludefontpadding;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(7))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.entity.StartingArea$Companion] */
    static {
        int i = write + 81;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getTextTopJ6kI3mc(int i, List list) {
        if (1 == (i & 1)) {
            this.coordinates = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getIncludeFontPadding.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.coordinates.hashCode();
        }
        this.coordinates.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("StartingArea(coordinates=", ")", this.coordinates);
        int i4 = IconCompatParcelizer + 29;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTextTopJ6kI3mc)) {
            return false;
        }
        Object[] objArr = {this.coordinates, ((getTextTopJ6kI3mc) obj).coordinates};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = IconCompatParcelizer + 49;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
