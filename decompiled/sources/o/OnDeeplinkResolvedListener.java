package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.provider.database.entity.GeoJsonEntity$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.onAttributionRead;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class OnDeeplinkResolvedListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final List coordinates;
    public final String type;
    public static final GeoJsonEntity$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.database.entity.GeoJsonEntity$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            onAttributionRead onattributionread;
            int i = 2 % 2;
            int i2 = serializer + 101;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                onattributionread = onAttributionRead.IconCompatParcelizer;
                int i3 = 30 / 0;
            } else {
                onattributionread = onAttributionRead.IconCompatParcelizer;
            }
            int i4 = serializer + 109;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onattributionread;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(15))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.database.entity.GeoJsonEntity$Companion] */
    static {
        Object obj = null;
        int i = read + 125;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.coordinates;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ OnDeeplinkResolvedListener(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.type = str;
            this.coordinates = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, onAttributionRead.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("GeoJsonEntity(type=", this.type, ", coordinates=", this.coordinates, ")");
        int i4 = write + 111;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.coordinates.hashCode() + (this.type.hashCode() * 31);
        int i4 = serializer + 19;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public OnDeeplinkResolvedListener(String str, List list) {
        str.getClass();
        list.getClass();
        this.type = str;
        this.coordinates = list;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 121;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 3;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof OnDeeplinkResolvedListener)) {
            return false;
        }
        OnDeeplinkResolvedListener onDeeplinkResolvedListener = (OnDeeplinkResolvedListener) obj;
        Object[] objArr = {this.type, onDeeplinkResolvedListener.type};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 113;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        Object[] objArr2 = {this.coordinates, onDeeplinkResolvedListener.coordinates};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i9 = write + 67;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = write + 25;
        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
