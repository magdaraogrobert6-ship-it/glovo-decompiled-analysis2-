package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$NewPicture$Companion;
import kotlinx.serialization.Serializable;
import o.getHasFixedHeightannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getHasBoundedWidthimpl implements getFocusIndeximpl {
    public static final TakePictureTaskUiItem$PictureStatus$NewPicture$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$NewPicture$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 103;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getHasFixedHeightannotations gethasfixedheightannotations = getHasFixedHeightannotations.serializer;
            int i4 = serializer + 81;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return gethasfixedheightannotations;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final int icon;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$NewPicture$Companion] */
    static {
        int i = write + 73;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getHasBoundedWidthimpl(int i, int i2) {
        if (1 == (i & 1)) {
            this.icon = i2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getHasFixedHeightannotations.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.icon);
        int i4 = serializer + 19;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = d$$ExternalSyntheticOutline0.m(this.icon, "NewPicture(icon=", ")");
            int i3 = RemoteActionCompatParcelizer + 57;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strM;
            }
            throw null;
        }
        d$$ExternalSyntheticOutline0.m(this.icon, "NewPicture(icon=", ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 31;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getHasBoundedWidthimpl)) {
            return false;
        }
        if (this.icon == ((getHasBoundedWidthimpl) obj).icon) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 43;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public getHasBoundedWidthimpl(int i) {
        this.icon = i;
    }
}
