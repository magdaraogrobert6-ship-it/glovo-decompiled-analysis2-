package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.routepreview.naver.data.model.NaverRoutePreviewResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGeometricTransform;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setColorRPmYEkk {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final List routes;
    public static final NaverRoutePreviewResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.ontheway.routepreview.naver.data.model.NaverRoutePreviewResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 125;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return setGeometricTransform.IconCompatParcelizer;
            }
            setGeometricTransform setgeometrictransform = setGeometricTransform.IconCompatParcelizer;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(2))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.ontheway.routepreview.naver.data.model.NaverRoutePreviewResponse$Companion] */
    static {
        int i = serializer + 71;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ setColorRPmYEkk(int i, List list) {
        if (1 == (i & 1)) {
            this.routes = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, setGeometricTransform.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.routes.hashCode();
        }
        int i3 = 58 / 0;
        return this.routes.hashCode();
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = write + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str = MediaSessionCompatQueueItem.read("NaverRoutePreviewResponse(routes=", ")", this.routes);
            int i3 = 15 / 0;
        } else {
            str = MediaSessionCompatQueueItem.read("NaverRoutePreviewResponse(routes=", ")", this.routes);
        }
        int i4 = IconCompatParcelizer + 119;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 105;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setColorRPmYEkk)) {
            return false;
        }
        Object[] objArr = {this.routes, ((setColorRPmYEkk) obj).routes};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = write + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
