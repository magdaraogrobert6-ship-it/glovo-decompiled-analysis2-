package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.RootComponent$StepScreen$Companion;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getLightannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "deliveries_detail")
public final class getNormalannotations extends accessgetW900cp {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final List stepComponents;
    public final String title;
    public static final RootComponent$StepScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.RootComponent$StepScreen$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 75;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getLightannotations.read;
            }
            getLightannotations getlightannotations = getLightannotations.read;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(4))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.RootComponent$StepScreen$Companion] */
    static {
        Object obj = null;
        int i = write + 33;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getNormalannotations(List list, int i, String str) {
        if (1 == (i & 1)) {
            this.title = str;
            if ((i & 2) == 0) {
                this.stepComponents = null;
                int i2 = serializer + 47;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.stepComponents = list;
            int i4 = RemoteActionCompatParcelizer + 113;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getLightannotations.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str = IconCompatParcelizer.read("StepScreen(title=", this.title, ", stepComponents=", this.stepComponents, ")");
            int i3 = 33 / 0;
        } else {
            str = IconCompatParcelizer.read("StepScreen(title=", this.title, ", stepComponents=", this.stepComponents, ")");
        }
        int i4 = serializer + 121;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.title.hashCode();
        List list = this.stepComponents;
        if (list == null) {
            int i4 = serializer + 11;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 47;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 37;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 83;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof getNormalannotations) {
            getNormalannotations getnormalannotations = (getNormalannotations) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getnormalannotations.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stepComponents, getnormalannotations.stepComponents}, getCieXyz.write())).booleanValue();
        }
        int i10 = i2 + 55;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
