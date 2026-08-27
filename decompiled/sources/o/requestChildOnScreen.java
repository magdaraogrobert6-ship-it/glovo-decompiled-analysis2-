package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.inappnotifications.data.ImageComponent$Companion;
import kotlinx.serialization.Serializable;
import o.removeItemDecoration;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "image")
public final class requestChildOnScreen implements setLayoutManager, setRecyclerListener {
    public static final ImageComponent$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.ImageComponent$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 87;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            removeItemDecoration removeitemdecoration = removeItemDecoration.IconCompatParcelizer;
            int i4 = serializer + 89;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return removeitemdecoration;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String scaleType;
    public final String source;
    public final Float weight;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.ImageComponent$Companion] */
    static {
        int i = IconCompatParcelizer + 3;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public /* synthetic */ requestChildOnScreen(int i, String str, Float f, String str2) {
        int i2;
        if (5 != (i & 5)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, removeItemDecoration.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.source = str;
        if ((i & 2) == 0) {
            this.weight = null;
            int i3 = RemoteActionCompatParcelizer + 29;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
            }
            this.scaleType = str2;
            i2 = serializer + 19;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i4 = 56 / 0;
            }
        }
        this.weight = f;
        int i5 = 2 % 2;
        this.scaleType = str2;
        i2 = serializer + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.source.hashCode();
        Float f = this.weight;
        if (f == null) {
            int i3 = serializer + 77;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = f.hashCode();
            int i5 = RemoteActionCompatParcelizer + 125;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return this.scaleType.hashCode() + (((iHashCode * 31) + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ImageComponent(source=");
        sb.append(this.source);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", scaleType=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.scaleType, ")");
        int i2 = serializer + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 73;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof requestChildOnScreen) {
            requestChildOnScreen requestchildonscreen = (requestChildOnScreen) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.source, requestchildonscreen.source}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.weight, requestchildonscreen.weight}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scaleType, requestchildonscreen.scaleType}, getCieXyz.write())).booleanValue();
            }
            int i4 = RemoteActionCompatParcelizer + 1;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = RemoteActionCompatParcelizer + 29;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return false;
    }
}
