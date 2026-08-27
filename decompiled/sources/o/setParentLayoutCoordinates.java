package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$ActionSheet$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.superSetLayoutDirection;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setParentLayoutCoordinates {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final getCanCalculatePosition callButton;
    public final getCanCalculatePosition cancelButtonData;
    public final getCanCalculatePosition copyButton;
    public final String title;
    public final List trackingEvents;
    public static final Instruction$SplitOrder$ActionSheet$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$ActionSheet$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 85;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            superSetLayoutDirection supersetlayoutdirection = superSetLayoutDirection.IconCompatParcelizer;
            int i4 = serializer + 9;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return supersetlayoutdirection;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(13))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$ActionSheet$Companion] */
    static {
        int i = write + 39;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setParentLayoutCoordinates(int i, String str, getCanCalculatePosition getcancalculateposition, getCanCalculatePosition getcancalculateposition2, getCanCalculatePosition getcancalculateposition3, List list) {
        Object obj = null;
        if (15 == (i & 15)) {
            this.title = str;
            this.callButton = getcancalculateposition;
            this.copyButton = getcancalculateposition2;
            this.cancelButtonData = getcancalculateposition3;
            if ((i & 16) == 0) {
                this.trackingEvents = null;
                int i2 = serializer + 21;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.trackingEvents = list;
            int i3 = read + 75;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, superSetLayoutDirection.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.callButton.hashCode();
        int iHashCode4 = this.copyButton.hashCode();
        int iHashCode5 = this.cancelButtonData.hashCode();
        List list = this.trackingEvents;
        if (list == null) {
            int i2 = serializer + 47;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        int i4 = ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + (iHashCode2 * 31)) * 31)) * 31)) * 31) + iHashCode;
        int i5 = serializer + 49;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ActionSheet(title=");
        sb.append(this.title);
        sb.append(", callButton=");
        sb.append(this.callButton);
        sb.append(", copyButton=");
        sb.append(this.copyButton);
        sb.append(", cancelButtonData=");
        sb.append(this.cancelButtonData);
        sb.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sb, this.trackingEvents, ")");
        int i2 = serializer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = read + 35;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 57;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof setParentLayoutCoordinates)) {
            int i6 = read + 7;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        setParentLayoutCoordinates setparentlayoutcoordinates = (setParentLayoutCoordinates) obj;
        Object[] objArr = {this.title, setparentlayoutcoordinates.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i8 = read + 101;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        Object[] objArr2 = {this.callButton, setparentlayoutcoordinates.callButton};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i10 = serializer + 85;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        Object[] objArr3 = {this.copyButton, setparentlayoutcoordinates.copyButton};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            int i12 = read + 57;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return false;
        }
        Object[] objArr4 = {this.cancelButtonData, setparentlayoutcoordinates.cancelButtonData};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.trackingEvents, setparentlayoutcoordinates.trackingEvents};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            int i14 = serializer + 23;
            read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            return false;
        }
        int i16 = read + 83;
        serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i16 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
