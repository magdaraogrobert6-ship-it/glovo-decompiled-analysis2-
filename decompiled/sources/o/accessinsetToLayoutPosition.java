package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Companion;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accesssetBringIntoViewRequesterp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "guidance")
public final class accessinsetToLayoutPosition implements accessobtainMeasureSpec {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 93;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accesssetBringIntoViewRequesterp accesssetbringintoviewrequesterp = accesssetBringIntoViewRequesterp.write;
            int i4 = IconCompatParcelizer + 29;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return accesssetbringintoviewrequesterp;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final List components;
    public final accesssetDrawingp geofence;
    public final List pictures;
    public final int totalPictures;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(4)), null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(5))};
        int i = write + 101;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.pictures;
        }
        throw null;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = this.totalPictures;
        int i6 = i3 + 99;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        List list = this.components;
        int i4 = i2 + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return list;
    }

    public /* synthetic */ accessinsetToLayoutPosition(int i, List list, int i2, accesssetDrawingp accesssetdrawingp, List list2) {
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accesssetBringIntoViewRequesterp.write.getDescriptor());
            throw null;
        }
        this.pictures = list;
        this.totalPictures = i2;
        if ((i & 4) == 0) {
            this.geofence = null;
            int i3 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            this.geofence = accesssetdrawingp;
        }
        if ((i & 8) != 0) {
            this.components = list2;
            int i6 = RemoteActionCompatParcelizer + 29;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        int i8 = IconCompatParcelizer + 59;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            this.components = instance_delegatelambda0.write;
        } else {
            this.components = instance_delegatelambda0.write;
            int i9 = 74 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.totalPictures, this.pictures.hashCode() * 31, 31);
        accesssetDrawingp accesssetdrawingp = this.geofence;
        if (accesssetdrawingp == null) {
            int i4 = IconCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = accesssetdrawingp.hashCode();
        }
        int iHashCode2 = this.components.hashCode() + ((iM + iHashCode) * 31);
        int i5 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EntrancePicture(pictures=" + this.pictures + ", totalPictures=" + this.totalPictures + ", geofence=" + this.geofence + ", components=" + this.components + ")";
        int i2 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessinsetToLayoutPosition)) {
            return false;
        }
        accessinsetToLayoutPosition accessinsettolayoutposition = (accessinsetToLayoutPosition) obj;
        Object[] objArr = {this.pictures, accessinsettolayoutposition.pictures};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i2 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (this.totalPictures != accessinsettolayoutposition.totalPictures) {
            return false;
        }
        Object[] objArr2 = {this.geofence, accessinsettolayoutposition.geofence};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            Object[] objArr3 = {this.components, accessinsettolayoutposition.components};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i4 = RemoteActionCompatParcelizer + 23;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
