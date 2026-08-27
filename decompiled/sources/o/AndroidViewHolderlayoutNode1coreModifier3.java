package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationLocation;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.MapComponent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderlayoutNode15measure1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "map")
public final class AndroidViewHolderlayoutNode1coreModifier3 implements fastCoerceIn {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final MapComponent$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.MapComponent$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 5;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidViewHolderlayoutNode15measure1 androidViewHolderlayoutNode15measure1 = AndroidViewHolderlayoutNode15measure1.write;
            int i4 = IconCompatParcelizer + 77;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return androidViewHolderlayoutNode15measure1;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final List components;
    public final DestinationLocation destinationLocation;
    public final boolean enablePinConnections;
    public final String expandMapCaption;
    public final List pins;
    public final boolean riderLocationEnabled;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.MapComponent$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(0)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(13)), null, null, null};
        int i = write + 119;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidViewHolderlayoutNode1coreModifier3(int i, boolean z, List list, DestinationLocation destinationLocation, List list2, String str, String str2, boolean z2) {
        if (13 != (i & 13)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 13, AndroidViewHolderlayoutNode15measure1.write.getDescriptor());
            throw null;
        }
        this.riderLocationEnabled = z;
        if ((i & 2) == 0) {
            this.components = instance_delegatelambda0.write;
        } else {
            this.components = list;
        }
        this.destinationLocation = destinationLocation;
        this.pins = list2;
        if ((i & 16) == 0) {
            this.style = "mapbox://styles/mapbox/streets-v11";
        } else {
            this.style = str;
        }
        if ((i & 32) == 0) {
            int i2 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.expandMapCaption = null;
            int i4 = 2 % 2;
        } else {
            this.expandMapCaption = str2;
        }
        if ((i & 64) == 0) {
            this.enablePinConnections = false;
            return;
        }
        this.enablePinConnections = z2;
        int i5 = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.components, Boolean.hashCode(this.riderLocationEnabled) * 31, 31);
        int iM2 = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.pins, (this.destinationLocation.hashCode() + iM) * 31, 31), 31, this.style);
        String str = this.expandMapCaption;
        if (str == null) {
            int i5 = IconCompatParcelizer + 67;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i7 = IconCompatParcelizer + 97;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i = iHashCode;
        }
        return Boolean.hashCode(this.enablePinConnections) + ((iM2 + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("MapComponent(riderLocationEnabled=");
        sb.append(this.riderLocationEnabled);
        sb.append(", components=");
        sb.append(this.components);
        sb.append(", destinationLocation=");
        sb.append(this.destinationLocation);
        sb.append(", pins=");
        sb.append(this.pins);
        sb.append(", style=");
        c8$$ExternalSyntheticOutline0.m(sb, this.style, ", expandMapCaption=", this.expandMapCaption, ", enablePinConnections=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.enablePinConnections, ")");
        int i2 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidViewHolderlayoutNode1coreModifier3)) {
            return false;
        }
        AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3 = (AndroidViewHolderlayoutNode1coreModifier3) obj;
        if (this.riderLocationEnabled == androidViewHolderlayoutNode1coreModifier3.riderLocationEnabled) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, androidViewHolderlayoutNode1coreModifier3.components}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.destinationLocation, androidViewHolderlayoutNode1coreModifier3.destinationLocation}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pins, androidViewHolderlayoutNode1coreModifier3.pins}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, androidViewHolderlayoutNode1coreModifier3.style}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expandMapCaption, androidViewHolderlayoutNode1coreModifier3.expandMapCaption}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.enablePinConnections == androidViewHolderlayoutNode1coreModifier3.enablePinConnections) {
                return true;
            }
            int i2 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
