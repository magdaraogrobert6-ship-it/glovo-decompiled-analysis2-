package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.instant.shifts.data.entity.StartingPointResponse$Companion;
import kotlinx.serialization.Serializable;
import o.isTmpDetached;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isRecyclable {
    public static final StartingPointResponse$Companion Companion = new Object() { // from class: com.roadrunner.instant.shifts.data.entity.StartingPointResponse$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 1;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return isTmpDetached.serializer;
            }
            isTmpDetached istmpdetached = isTmpDetached.serializer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final int id;
    public final String name;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.instant.shifts.data.entity.StartingPointResponse$Companion] */
    static {
        int i = serializer + 55;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 73;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 111;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.id;
        int i6 = i2 + 67;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
        return i5;
    }

    public /* synthetic */ isRecyclable(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.id = i2;
            this.name = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, isTmpDetached.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 101;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = Integer.hashCode(this.id);
            iHashCode = this.name.hashCode();
            i = iHashCode2 >> 17;
        } else {
            int iHashCode3 = Integer.hashCode(this.id);
            iHashCode = this.name.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 17;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isRecyclable)) {
            return false;
        }
        isRecyclable isrecyclable = (isRecyclable) obj;
        if (this.id != isrecyclable.id) {
            return false;
        }
        Object[] objArr = {this.name, isrecyclable.name};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i4 = read + 75;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartingPointResponse(id=" + this.id + ", name=" + this.name + ")";
        int i2 = IconCompatParcelizer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
