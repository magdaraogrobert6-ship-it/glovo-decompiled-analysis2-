package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DeliveriesList$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.normalizedAngleCos;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "deliveries_list")
public final class AndroidViewBindingKt implements fastCoerceIn {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final List components;
    public static final DeliveriesList$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DeliveriesList$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 15;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                normalizedAngleCos normalizedanglecos = normalizedAngleCos.write;
                obj.hashCode();
                throw null;
            }
            normalizedAngleCos normalizedanglecos2 = normalizedAngleCos.write;
            int i3 = read + 73;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return normalizedanglecos2;
            }
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(21))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DeliveriesList$Companion] */
    static {
        int i = IconCompatParcelizer + 71;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        List list = this.components;
        int i5 = i3 + 39;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AndroidViewBindingKt(int i, List list) {
        if (1 == (i & 1)) {
            this.components = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, normalizedAngleCos.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.components.hashCode();
        }
        this.components.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return MediaSessionCompatQueueItem.read("DeliveriesList(components=", ")", this.components);
        }
        int i3 = 79 / 0;
        return MediaSessionCompatQueueItem.read("DeliveriesList(components=", ")", this.components);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidViewBindingKt)) {
            return false;
        }
        Object[] objArr = {this.components, ((AndroidViewBindingKt) obj).components};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i3 = serializer + 53;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
