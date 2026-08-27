package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$PicturePending$Companion;
import kotlinx.serialization.Serializable;
import o.getMaxWidthimpl;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMinHeightimpl implements getFocusIndeximpl {
    public static final TakePictureTaskUiItem$PictureStatus$PicturePending$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$PicturePending$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 31;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getMaxWidthimpl.IconCompatParcelizer;
            }
            getMaxWidthimpl getmaxwidthimpl = getMaxWidthimpl.IconCompatParcelizer;
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final getHasFixedHeightimpl photoData;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$PicturePending$Companion] */
    static {
        int i = read + 55;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    public /* synthetic */ getMinHeightimpl(int i, getHasFixedHeightimpl gethasfixedheightimpl) {
        if (1 == (i & 1)) {
            this.photoData = gethasfixedheightimpl;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getMaxWidthimpl.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.photoData.hashCode();
        int i4 = write + 49;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PicturePending(photoData=" + this.photoData + ")";
        int i2 = write + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    public getMinHeightimpl(getHasFixedHeightimpl gethasfixedheightimpl) {
        this.photoData = gethasfixedheightimpl;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 21;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof getMinHeightimpl) {
            Object[] objArr = {this.photoData, ((getMinHeightimpl) obj).photoData};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i3 = RemoteActionCompatParcelizer + 73;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = write + 65;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
