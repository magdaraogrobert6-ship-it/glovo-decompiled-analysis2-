package o;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PhotoData$Companion;
import kotlinx.serialization.Serializable;
import o.getHasBoundedHeightimpl;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getHasFixedHeightimpl {
    public static final TakePictureTaskUiItem$PhotoData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PhotoData$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 61;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getHasBoundedHeightimpl.serializer;
            }
            int i3 = 44 / 0;
            return getHasBoundedHeightimpl.serializer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final String imagePath;
    public final Uri imageUri;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$PhotoData$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 109;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getHasFixedHeightimpl(int i, Uri uri, String str) {
        if (3 == (i & 3)) {
            this.imageUri = uri;
            this.imagePath = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getHasBoundedHeightimpl.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.imagePath.hashCode() % (this.imageUri.hashCode() / 15);
        }
        return this.imagePath.hashCode() + (this.imageUri.hashCode() * 31);
    }

    public getHasFixedHeightimpl(Uri uri, String str) {
        this.imageUri = uri;
        this.imagePath = str;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PhotoData(imageUri=" + this.imageUri + ", imagePath=" + this.imagePath + ")";
        int i2 = IconCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 41;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return true;
        }
        if (!(obj instanceof getHasFixedHeightimpl)) {
            return false;
        }
        getHasFixedHeightimpl gethasfixedheightimpl = (getHasFixedHeightimpl) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.imageUri, gethasfixedheightimpl.imageUri}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.imagePath, gethasfixedheightimpl.imagePath}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = read + 61;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
