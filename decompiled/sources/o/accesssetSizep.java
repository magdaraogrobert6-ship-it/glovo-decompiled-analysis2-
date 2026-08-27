package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Companion;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.insetToLayoutPosition;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accesssetSizep {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 79;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                insetToLayoutPosition insettolayoutposition = insetToLayoutPosition.IconCompatParcelizer;
                throw null;
            }
            insetToLayoutPosition insettolayoutposition2 = insetToLayoutPosition.IconCompatParcelizer;
            int i3 = write + 47;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 64 / 0;
            }
            return insettolayoutposition2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final List components;
    public final String label;
    public final String pictureId;
    public final List tags;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(6)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(7))};
        int i = read + 95;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 3;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.url;
        int i4 = i2 + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    public /* synthetic */ accesssetSizep(int i, String str, String str2, String str3, List list, List list2) {
        instance_delegatelambda0 instance_delegatelambda0Var;
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, insetToLayoutPosition.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.pictureId = null;
        } else {
            this.pictureId = str2;
        }
        if ((i & 4) != 0) {
            this.label = str3;
            int i2 = RemoteActionCompatParcelizer + 7;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 4 % 5;
            }
            instance_delegatelambda0Var = instance_delegatelambda0.write;
            if ((i & 8) == 0) {
                int i4 = serializer + 13;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                this.tags = instance_delegatelambda0Var;
            } else {
                this.tags = list;
            }
            if ((i & 16) == 0) {
                this.components = list2;
                return;
            }
            int i6 = serializer + 57;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            this.components = instance_delegatelambda0Var;
        }
        int i8 = RemoteActionCompatParcelizer + 1;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        this.label = null;
        int i10 = 2 % 2;
        instance_delegatelambda0Var = instance_delegatelambda0.write;
        if ((i & 8) == 0) {
            int i11 = serializer + 13;
            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            this.tags = instance_delegatelambda0Var;
        } else {
            this.tags = list;
        }
        if ((i & 16) == 0) {
            this.components = list2;
            return;
        }
        int i13 = serializer + 57;
        RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        this.components = instance_delegatelambda0Var;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Picture(url=", this.url, ", pictureId=", this.pictureId, ", label=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.label, ", tags=", this.tags, ", components=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.components, ")");
        int i4 = serializer + 9;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.url.hashCode();
            str = this.pictureId;
            iHashCode2 = 1;
            if (str != null) {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = this.url.hashCode();
            str = this.pictureId;
            if (str == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = iHashCode3;
                iHashCode3 = str.hashCode();
            }
        }
        String str2 = this.label;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        int iHashCode4 = this.components.hashCode() + c8$$ExternalSyntheticOutline0.m(this.tags, ((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31, 31);
        int i3 = serializer + 95;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode4;
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
        if (!(obj instanceof accesssetSizep)) {
            return false;
        }
        accesssetSizep accesssetsizep = (accesssetSizep) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, accesssetsizep.url}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pictureId, accesssetsizep.pictureId}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, accesssetsizep.label}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, accesssetsizep.tags}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, accesssetsizep.components}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = RemoteActionCompatParcelizer + 97;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RemoteActionCompatParcelizer + 37;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = serializer + 33;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
