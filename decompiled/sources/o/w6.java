package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.opportunities.data.PinResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.W;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class w6 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final boolean multiRow;
    public final List sections;
    public static final PinResponse$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.data.PinResponse$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return W.write;
            }
            W w = W.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(13))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.data.PinResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 63;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 87;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.sections;
        int i5 = i2 + 87;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.multiRow;
        int i5 = i2 + 41;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ w6(List list, boolean z, int i) {
        this.multiRow = (i & 1) == 0 ? false : z;
        if ((i & 2) != 0) {
            this.sections = list;
            int i2 = write + 59;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        int i4 = read + 79;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            this.sections = instance_delegatelambda0.write;
        } else {
            this.sections = instance_delegatelambda0.write;
            int i5 = 78 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.sections.hashCode() + (Boolean.hashCode(this.multiRow) * 31);
        int i4 = write + 27;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public w6() {
        this.multiRow = false;
        this.sections = instance_delegatelambda0.write;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        if (this.multiRow == w6Var.multiRow) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sections, w6Var.sections}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read + 37;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        int i3 = write + 83;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PinResponse(multiRow=" + this.multiRow + ", sections=" + this.sections + ")";
        int i2 = read + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
