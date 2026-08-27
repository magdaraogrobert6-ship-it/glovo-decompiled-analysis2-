package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.routepreview.naver.data.model.RoutePreviewRequestBody$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setLineHeightr9BaKPg;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setFontSizeKmRG4DE {
    public static final RoutePreviewRequestBody$Companion Companion = new Object() { // from class: com.roadrunner.delivery.ontheway.routepreview.naver.data.model.RoutePreviewRequestBody$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 29;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                setLineHeightr9BaKPg setlineheightr9bakpg = setLineHeightr9BaKPg.serializer;
                throw null;
            }
            setLineHeightr9BaKPg setlineheightr9bakpg2 = setLineHeightr9BaKPg.serializer;
            int i3 = RemoteActionCompatParcelizer + 73;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return setlineheightr9bakpg2;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final AndroidViewHolderlayoutNode12 riderLocation;
    public final r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k statePayload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.ontheway.routepreview.naver.data.model.RoutePreviewRequestBody$Companion] */
    static {
        int i = read + 3;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setFontSizeKmRG4DE(int i, AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k) {
        if (3 == (i & 3)) {
            this.riderLocation = androidViewHolderlayoutNode12;
            this.statePayload = r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setLineHeightr9BaKPg.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.statePayload.content.hashCode() + (this.riderLocation.hashCode() * 31);
        int i4 = serializer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public setFontSizeKmRG4DE(AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k) {
        androidViewHolderlayoutNode12.getClass();
        r8lambdaerwhggzq_gqgn8cultnvrcshm8k.getClass();
        this.riderLocation = androidViewHolderlayoutNode12;
        this.statePayload = r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RoutePreviewRequestBody(riderLocation=" + this.riderLocation + ", statePayload=" + this.statePayload + ")";
        int i2 = write + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFontSizeKmRG4DE)) {
            return false;
        }
        setFontSizeKmRG4DE setfontsizekmrg4de = (setFontSizeKmRG4DE) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.riderLocation, setfontsizekmrg4de.riderLocation}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.statePayload, setfontsizekmrg4de.statePayload}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = serializer + 69;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 91;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
