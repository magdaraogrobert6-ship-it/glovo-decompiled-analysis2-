package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.inappcamera.api.model.PictureTags$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.r8lambdayoAm4_omYXKQFjh8_hOm5ZBGYI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getLockui_text {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String mainIcon;
    public final List tags;
    public final String title;
    public static final PictureTags$Companion Companion = new Object() { // from class: com.roadrunner.delivery.inappcamera.api.model.PictureTags$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            r8lambdayoAm4_omYXKQFjh8_hOm5ZBGYI r8lambdayoam4_omyxkqfjh8_hom5zbgyi;
            int i = 2 % 2;
            int i2 = write + 69;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambdayoam4_omyxkqfjh8_hom5zbgyi = r8lambdayoAm4_omYXKQFjh8_hOm5ZBGYI.read;
                int i3 = 37 / 0;
            } else {
                r8lambdayoam4_omyxkqfjh8_hom5zbgyi = r8lambdayoAm4_omYXKQFjh8_hOm5ZBGYI.read;
            }
            int i4 = write + 45;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 59 / 0;
            }
            return r8lambdayoam4_omyxkqfjh8_hom5zbgyi;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(28))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.inappcamera.api.model.PictureTags$Companion] */
    static {
        int i = write + 107;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getLockui_text(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.title = "";
            int i2 = IconCompatParcelizer + 57;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.mainIcon = "";
        } else {
            this.mainIcon = str2;
            int i5 = 2 % 2;
        }
        if ((i & 4) != 0) {
            this.tags = list;
            return;
        }
        int i6 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        this.tags = instance_delegatelambda0.write;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("PictureTags(title=", this.title, ", mainIcon=", this.mainIcon, ", tags="), this.tags, ")");
        int i4 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.title;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 85;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.mainIcon;
        if (str2 == null) {
            int i4 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        List list = this.tags;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        int i6 = IconCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getLockui_text) {
            getLockui_text getlockui_text = (getLockui_text) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getlockui_text.title}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mainIcon, getlockui_text.mainIcon}, getCieXyz.write())).booleanValue()) {
                    int i2 = RemoteActionCompatParcelizer + 53;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tags, getlockui_text.tags}, getCieXyz.write())).booleanValue();
            }
            int i4 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = IconCompatParcelizer + 67;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
