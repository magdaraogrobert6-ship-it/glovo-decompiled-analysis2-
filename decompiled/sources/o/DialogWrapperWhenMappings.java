package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$Companion;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getParamsuiannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "split_order")
public final class DialogWrapperWhenMappings extends accessgetPropertiesp {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final setParentLayoutCoordinates actionSheet;
    public final TagIconTokenV1 icon;
    public final List otherRiders;
    public final String title;
    public static final Instruction$SplitOrder$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 55;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getParamsuiannotations getparamsuiannotations = getParamsuiannotations.RemoteActionCompatParcelizer;
            int i4 = write + 117;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return getparamsuiannotations;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(12)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$SplitOrder$Companion] */
    static {
        int i = read + 123;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
    }

    public /* synthetic */ DialogWrapperWhenMappings(int i, String str, TagIconTokenV1 tagIconTokenV1, List list, setParentLayoutCoordinates setparentlayoutcoordinates) {
        if (15 == (i & 15)) {
            this.title = str;
            this.icon = tagIconTokenV1;
            this.otherRiders = list;
            this.actionSheet = setparentlayoutcoordinates;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getParamsuiannotations.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.actionSheet.hashCode() + c8$$ExternalSyntheticOutline0.m(this.otherRiders, (this.icon.hashCode() + (iHashCode * 31)) * 31, 31);
        int i4 = RemoteActionCompatParcelizer + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SplitOrder(title=" + this.title + ", icon=" + this.icon + ", otherRiders=" + this.otherRiders + ", actionSheet=" + this.actionSheet + ")";
        int i2 = write + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 119;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof DialogWrapperWhenMappings) {
            DialogWrapperWhenMappings dialogWrapperWhenMappings = (DialogWrapperWhenMappings) obj;
            Object[] objArr = {this.title, dialogWrapperWhenMappings.title};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i4 = write + 17;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (this.icon != dialogWrapperWhenMappings.icon) {
                return false;
            }
            Object[] objArr2 = {this.otherRiders, dialogWrapperWhenMappings.otherRiders};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.actionSheet, dialogWrapperWhenMappings.actionSheet};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i6 = write + 71;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = write + 29;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
