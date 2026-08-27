package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.Compression$Companion;
import kotlinx.serialization.Serializable;
import o.Fontvxs03AY;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class loadCached {
    public static final Compression$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.Compression$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 15;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Fontvxs03AY fontvxs03AY = Fontvxs03AY.read;
            int i4 = serializer + 77;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fontvxs03AY;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final int maxDimension;
    public final float quality;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.Compression$Companion] */
    static {
        int i = IconCompatParcelizer + 99;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 119;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.maxDimension;
        int i5 = i2 + 87;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final float write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.quality;
        int i4 = i3 + 113;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return f;
    }

    public /* synthetic */ loadCached(float f, int i, int i2) {
        if (3 == (i & 3)) {
            this.quality = f;
            this.maxDimension = i2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, Fontvxs03AY.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 5;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = Float.hashCode(this.quality);
            iHashCode = Integer.hashCode(this.maxDimension);
            i = iHashCode2 - 59;
        } else {
            int iHashCode3 = Float.hashCode(this.quality);
            iHashCode = Integer.hashCode(this.maxDimension);
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public loadCached() {
        this.quality = 0.3f;
        this.maxDimension = 1920;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof loadCached) {
            loadCached loadcached = (loadCached) obj;
            if (Float.compare(this.quality, loadcached.quality) == 0) {
                return this.maxDimension == loadcached.maxDimension;
            }
            int i2 = RemoteActionCompatParcelizer + 97;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Compression(quality=" + this.quality + ", maxDimension=" + this.maxDimension + ")";
        int i2 = serializer + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
