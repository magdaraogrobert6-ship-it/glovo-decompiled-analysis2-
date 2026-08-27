package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$Reasons$Reason$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setOnModifierChangedui;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class requestChildRectangleOnScreen {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$Reasons$Reason$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$Reasons$Reason$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 85;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return setOnModifierChangedui.serializer;
            }
            setOnModifierChangedui setonmodifierchangedui = setOnModifierChangedui.serializer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String id;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$Reasons$Reason$Companion] */
    static {
        int i = write + 91;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ requestChildRectangleOnScreen(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.id = str;
            this.title = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setOnModifierChangedui.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Reason(id=", this.id, ", title=", this.title, ")");
        }
        int i3 = 23 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Reason(id=", this.id, ", title=", this.title, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.title.hashCode() >>> (this.id.hashCode() * 48);
        }
        return (this.id.hashCode() * 31) + this.title.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof requestChildRectangleOnScreen)) {
            int i5 = i3 + 37;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        requestChildRectangleOnScreen requestchildrectangleonscreen = (requestChildRectangleOnScreen) obj;
        Object[] objArr = {this.id, requestchildrectangleonscreen.id};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i7 = RemoteActionCompatParcelizer + 25;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        Object[] objArr2 = {this.title, requestchildrectangleonscreen.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i9 = read + 43;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
