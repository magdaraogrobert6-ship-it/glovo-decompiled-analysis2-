package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$PictureAdded$Companion;
import kotlinx.serialization.Serializable;
import o.getHasFixedWidthannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getHasFixedWidthimpl implements getFocusIndeximpl {
    public static final TakePictureTaskUiItem$PictureStatus$PictureAdded$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$PictureAdded$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 75;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getHasFixedWidthannotations gethasfixedwidthannotations = getHasFixedWidthannotations.read;
            int i4 = IconCompatParcelizer + 37;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return gethasfixedwidthannotations;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String filePath;
    public final String thumbnailPath;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PictureStatus$PictureAdded$Companion] */
    static {
        int i = write + 111;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getHasFixedWidthimpl(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.thumbnailPath = str;
            this.filePath = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getHasFixedWidthannotations.read.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PictureAdded(thumbnailPath=", this.thumbnailPath, ", filePath=", this.filePath, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PictureAdded(thumbnailPath=", this.thumbnailPath, ", filePath=", this.filePath, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.filePath.hashCode() / (this.thumbnailPath.hashCode() << 59);
        }
        return this.filePath.hashCode() + (this.thumbnailPath.hashCode() * 31);
    }

    public getHasFixedWidthimpl(String str, String str2) {
        this.thumbnailPath = str;
        this.filePath = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHasFixedWidthimpl)) {
            return false;
        }
        getHasFixedWidthimpl gethasfixedwidthimpl = (getHasFixedWidthimpl) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.thumbnailPath, gethasfixedwidthimpl.thumbnailPath}, getCieXyz.write())).booleanValue())) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.filePath, gethasfixedwidthimpl.filePath}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i2 = serializer + 45;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
