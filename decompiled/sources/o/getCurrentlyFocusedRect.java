package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$AcceptData$BoostedEarningsSecondaryView$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getEmbeddedView;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getCurrentlyFocusedRect {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List icons;
    public final Boolean includesBoost;
    public final Boolean includesTip;
    public final String text;
    public static final StateV3$AcceptData$BoostedEarningsSecondaryView$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$BoostedEarningsSecondaryView$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 23;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getEmbeddedView getembeddedview = getEmbeddedView.write;
                throw null;
            }
            getEmbeddedView getembeddedview2 = getEmbeddedView.write;
            int i3 = read + 111;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return getembeddedview2;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(27))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$BoostedEarningsSecondaryView$Companion] */
    static {
        Object obj = null;
        int i = IconCompatParcelizer + 71;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 115;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.icons;
        int i5 = i2 + 61;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = write + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.text;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean serializer() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.includesBoost;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 91;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Boolean bool = this.includesTip;
        int i5 = i2 + 125;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getCurrentlyFocusedRect(int i, String str, Boolean bool, Boolean bool2, List list) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getEmbeddedView.write.getDescriptor());
            throw null;
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.includesTip = null;
            int i2 = serializer + 1;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            this.includesTip = bool;
            int i4 = serializer + 29;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = 2 % 2;
        if ((i & 4) == 0) {
            this.includesBoost = null;
        } else {
            this.includesBoost = bool2;
        }
        if ((i & 8) != 0) {
            this.icons = list;
            return;
        }
        int i7 = write + 31;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            this.icons = null;
        } else {
            this.icons = null;
            throw null;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.text.hashCode();
        Boolean bool = this.includesTip;
        if (bool == null) {
            int i3 = serializer + 77;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i3 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode2 = bool.hashCode();
            int i4 = serializer + 93;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        Boolean bool2 = this.includesBoost;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        List list = this.icons;
        return (((((iHashCode * 31) + i) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BoostedEarningsSecondaryView(text=" + this.text + ", includesTip=" + this.includesTip + ", includesBoost=" + this.includesBoost + ", icons=" + this.icons + ")";
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentlyFocusedRect)) {
            int i2 = serializer + 67;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        getCurrentlyFocusedRect getcurrentlyfocusedrect = (getCurrentlyFocusedRect) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, getcurrentlyfocusedrect.text}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.includesTip, getcurrentlyfocusedrect.includesTip}, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 17;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.includesBoost, getcurrentlyfocusedrect.includesBoost}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icons, getcurrentlyfocusedrect.icons}, getCieXyz.write())).booleanValue();
        }
        int i6 = serializer + 57;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
