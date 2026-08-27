package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.data.models.AutoAcceptEarningsResponse$RootComponent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.substringFDrldGo;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class copyHL5avdYdefault {
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final List components;
    public final String type;
    public static final AutoAcceptEarningsResponse$RootComponent$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.data.models.AutoAcceptEarningsResponse$RootComponent$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 115;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            substringFDrldGo substringfdrldgo = substringFDrldGo.write;
            int i4 = RemoteActionCompatParcelizer + 85;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return substringfdrldgo;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(11))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.data.models.AutoAcceptEarningsResponse$RootComponent$Companion] */
    static {
        int i = serializer + 101;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    public /* synthetic */ copyHL5avdYdefault(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.type = str;
            this.components = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, substringFDrldGo.write.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("RootComponent(type=", this.type, ", components=", this.components, ")");
        int i4 = write + 1;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.components.hashCode() + (this.type.hashCode() * 31);
        int i4 = write + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 111;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof copyHL5avdYdefault)) {
            int i4 = write;
            int i5 = i4 + 75;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 43;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        copyHL5avdYdefault copyhl5avdydefault = (copyHL5avdYdefault) obj;
        Object[] objArr = {this.type, copyhl5avdydefault.type};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i8 = read + 9;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        Object[] objArr2 = {this.components, copyhl5avdydefault.components};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i10 = read + 29;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
