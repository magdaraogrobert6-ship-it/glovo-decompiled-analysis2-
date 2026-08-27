package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.DeliveryConfirmationState$ActionAnalytics$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.mapTreelambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getPosition {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final String method;
    public final Map params;
    public final String path;
    public static final DeliveryConfirmationState$ActionAnalytics$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.DeliveryConfirmationState$ActionAnalytics$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 109;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            mapTreelambda0 maptreelambda0 = mapTreelambda0.RemoteActionCompatParcelizer;
            int i4 = serializer + 111;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return maptreelambda0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new sourceInformationContextOfdefault(15))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.DeliveryConfirmationState$ActionAnalytics$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 43;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getPosition(String str, int i, Map map, String str2) {
        if (7 == (i & 7)) {
            this.method = str;
            this.path = str2;
            this.params = map;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, mapTreelambda0.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.params.hashCode() * af$$ExternalSyntheticOutline0.m(this.method.hashCode() >>> 38, 16, this.path);
        }
        return this.params.hashCode() + af$$ExternalSyntheticOutline0.m(this.method.hashCode() * 31, 31, this.path);
    }

    public final String toString() {
        String strRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m("ActionAnalytics(method=", this.method, ", path=", this.path, ", params="), this.params, ")");
            int i3 = 17 / 0;
        } else {
            strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m("ActionAnalytics(method=", this.method, ", path=", this.path, ", params="), this.params, ")");
        }
        int i4 = IconCompatParcelizer + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strRemoteActionCompatParcelizer;
    }

    public getPosition(String str, String str2, Map map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.method = str;
        this.path = str2;
        this.params = map;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPosition)) {
            int i4 = i3 + 65;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        getPosition getposition = (getPosition) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.method, getposition.method}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 75;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.path, getposition.path}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.params, getposition.params}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = IconCompatParcelizer + 77;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }
}
