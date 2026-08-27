package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.RootComponent$OnTheWayScreen$Companion;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getBlackannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "on_the_way")
public final class FontWeightCompanion extends accessgetW900cp {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final List components;
    public final String title;
    public static final RootComponent$OnTheWayScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.RootComponent$OnTheWayScreen$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getBlackannotations getblackannotations = getBlackannotations.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
            return getblackannotations;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(3))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.RootComponent$OnTheWayScreen$Companion] */
    static {
        int i = serializer + 57;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ FontWeightCompanion(List list, int i, String str) {
        if (1 == (i & 1)) {
            this.title = str;
            if ((i & 2) == 0) {
                this.components = instance_delegatelambda0.write;
                int i2 = read + 99;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 65 / 0;
                    return;
                }
                return;
            }
            this.components = list;
            int i4 = RemoteActionCompatParcelizer + 69;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getBlackannotations.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String str = IconCompatParcelizer.read("OnTheWayScreen(title=", this.title, ", components=", this.components, ")");
            int i3 = RemoteActionCompatParcelizer + 117;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return str;
        }
        IconCompatParcelizer.read("OnTheWayScreen(title=", this.title, ", components=", this.components, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.components.hashCode() * (this.title.hashCode() + 55);
        }
        return this.components.hashCode() + (this.title.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 123;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof FontWeightCompanion)) {
            int i3 = read + 95;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        FontWeightCompanion fontWeightCompanion = (FontWeightCompanion) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fontWeightCompanion.title}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 17;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, fontWeightCompanion.components}, getCieXyz.write())).booleanValue() ^ true);
    }
}
