package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.appmigration.model.BannerAnalytics$Companion;
import kotlinx.serialization.Serializable;
import o.findOneLayerOfMergingSemanticsNodesdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getChildrenuidefault {
    public static final BannerAnalytics$Companion Companion = new Object() { // from class: com.roadrunner.appmigration.model.BannerAnalytics$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                findOneLayerOfMergingSemanticsNodesdefault findonelayerofmergingsemanticsnodesdefault = findOneLayerOfMergingSemanticsNodesdefault.RemoteActionCompatParcelizer;
                throw null;
            }
            findOneLayerOfMergingSemanticsNodesdefault findonelayerofmergingsemanticsnodesdefault2 = findOneLayerOfMergingSemanticsNodesdefault.RemoteActionCompatParcelizer;
            int i3 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return findonelayerofmergingsemanticsnodesdefault2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final String bannerVariant;
    public final int daysUntilMigration;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.appmigration.model.BannerAnalytics$Companion] */
    static {
        int i = serializer + 7;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getChildrenuidefault(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.daysUntilMigration = i2;
            this.bannerVariant = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, findOneLayerOfMergingSemanticsNodesdefault.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.bannerVariant.hashCode() + (Integer.hashCode(this.daysUntilMigration) * 31);
        int i4 = read + 91;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
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
        if (!(obj instanceof getChildrenuidefault)) {
            return false;
        }
        getChildrenuidefault getchildrenuidefault = (getChildrenuidefault) obj;
        if (this.daysUntilMigration == getchildrenuidefault.daysUntilMigration) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bannerVariant, getchildrenuidefault.bannerVariant}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i2 = RemoteActionCompatParcelizer + 67;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
            return true;
        }
        int i4 = read + 23;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BannerAnalytics(daysUntilMigration=" + this.daysUntilMigration + ", bannerVariant=" + this.bannerVariant + ")";
        int i2 = RemoteActionCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
