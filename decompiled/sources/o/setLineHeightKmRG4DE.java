package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.ontheway.routepreview.naver.data.model.NaverRoutePreviewResponse$Route$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setFontAttributeslambda2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setLineHeightKmRG4DE {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final List coordinates;
    public final AndroidViewHolderlayoutNode12 destination;
    public final String fromId;
    public final String toId;
    public static final NaverRoutePreviewResponse$Route$Companion Companion = new Object() { // from class: com.roadrunner.delivery.ontheway.routepreview.naver.data.model.NaverRoutePreviewResponse$Route$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 93;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                setFontAttributeslambda2 setfontattributeslambda2 = setFontAttributeslambda2.RemoteActionCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            setFontAttributeslambda2 setfontattributeslambda3 = setFontAttributeslambda2.RemoteActionCompatParcelizer;
            int i3 = serializer + 23;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return setfontattributeslambda3;
            }
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(3))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.ontheway.routepreview.naver.data.model.NaverRoutePreviewResponse$Route$Companion] */
    static {
        int i = write + 65;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setLineHeightKmRG4DE(int i, String str, String str2, AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, List list) {
        if (15 == (i & 15)) {
            this.fromId = str;
            this.toId = str2;
            this.destination = androidViewHolderlayoutNode12;
            this.coordinates = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, setFontAttributeslambda2.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.fromId.hashCode() * 31, 31, this.toId);
        int iHashCode = this.coordinates.hashCode() + ((this.destination.hashCode() + iM) * 31);
        int i4 = RemoteActionCompatParcelizer + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Route(fromId=", this.fromId, ", toId=", this.toId, ", destination=");
        sbM.append(this.destination);
        sbM.append(", coordinates=");
        sbM.append(this.coordinates);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 31;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLineHeightKmRG4DE)) {
            int i4 = i3 + 109;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        setLineHeightKmRG4DE setlineheightkmrg4de = (setLineHeightKmRG4DE) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fromId, setlineheightkmrg4de.fromId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.toId, setlineheightkmrg4de.toId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.destination, setlineheightkmrg4de.destination}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinates, setlineheightkmrg4de.coordinates}, getCieXyz.write())).booleanValue()) {
            int i6 = read + 65;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        int i7 = RemoteActionCompatParcelizer + 23;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
