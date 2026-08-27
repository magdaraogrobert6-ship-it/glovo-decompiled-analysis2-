package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$Compression$Companion;
import kotlinx.serialization.Serializable;
import o.copyZbe2FdAdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class copyZbe2FdA {
    public static final TakePictureTaskUiItem$Compression$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$Compression$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 5;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                copyZbe2FdAdefault copyzbe2fdadefault = copyZbe2FdAdefault.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            copyZbe2FdAdefault copyzbe2fdadefault2 = copyZbe2FdAdefault.serializer;
            int i3 = read + 15;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return copyzbe2fdadefault2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final int maxDimension;
    public final float quality;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$Compression$Companion] */
    static {
        int i = read + 97;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ copyZbe2FdA(float f, int i, int i2) {
        if (3 == (i & 3)) {
            this.quality = f;
            this.maxDimension = i2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, copyZbe2FdAdefault.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Integer.hashCode(this.maxDimension) << (Float.hashCode(this.quality) << 112);
        }
        return (Float.hashCode(this.quality) * 31) + Integer.hashCode(this.maxDimension);
    }

    public copyZbe2FdA(float f, int i) {
        this.quality = f;
        this.maxDimension = i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 73;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 13;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof copyZbe2FdA)) {
            int i8 = i4 + 49;
            int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 7;
            IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 95 / 0;
            }
            return false;
        }
        copyZbe2FdA copyzbe2fda = (copyZbe2FdA) obj;
        if (Float.compare(this.quality, copyzbe2fda.quality) != 0) {
            int i13 = RemoteActionCompatParcelizer + 79;
            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return false;
        }
        if (this.maxDimension == copyzbe2fda.maxDimension) {
            return true;
        }
        int i15 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i15 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Compression(quality=" + this.quality + ", maxDimension=" + this.maxDimension + ")";
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
