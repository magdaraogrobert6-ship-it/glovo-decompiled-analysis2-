package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.inappnotifications.data.RowComponent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.shouldAbsorb;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "row")
public final class setViewCacheExtension implements setLayoutManager {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final List components;
    public final Float weight;
    public static final RowComponent$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.RowComponent$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 51;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            shouldAbsorb shouldabsorb = shouldAbsorb.IconCompatParcelizer;
            int i4 = read + 23;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return shouldabsorb;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(27)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.RowComponent$Companion] */
    static {
        Object obj = null;
        int i = serializer + 109;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ setViewCacheExtension(int i, List list, Float f) {
        if (1 == (i & 1)) {
            this.components = list;
            if ((i & 2) == 0) {
                this.weight = null;
                int i2 = write + 81;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.weight = f;
            int i4 = write + 103;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, shouldAbsorb.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.components.hashCode();
        Float f = this.weight;
        if (f == null) {
            int i2 = write + 5;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 67;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = f.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RowComponent(components=" + this.components + ", weight=" + this.weight + ")";
        int i2 = write + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 111;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 51;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        if (!(obj instanceof setViewCacheExtension)) {
            int i7 = i4 + 3;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        setViewCacheExtension setviewcacheextension = (setViewCacheExtension) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, setviewcacheextension.components}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.weight, setviewcacheextension.weight}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = write + 101;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
