package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.state.entity.HomeResponseItem$Companion;
import kotlinx.serialization.Serializable;
import o.getLayoutManager;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMaxFlingVelocity {
    public static final HomeResponseItem$Companion Companion = new Object() { // from class: com.roadrunner.home.state.entity.HomeResponseItem$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 115;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getLayoutManager getlayoutmanager = getLayoutManager.write;
            int i4 = serializer + 17;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getlayoutmanager;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final SwipeDismissTouchListenerVerticalDismissDirection jsonBody;
    public final int statusCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.state.entity.HomeResponseItem$Companion] */
    static {
        int i = write + 47;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getMaxFlingVelocity(int i, int i2, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        if (3 == (i & 3)) {
            this.statusCode = i2;
            this.jsonBody = swipeDismissTouchListenerVerticalDismissDirection;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getLayoutManager.write.getDescriptor());
            throw null;
        }
    }

    public final boolean IconCompatParcelizer() {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 77;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = false;
        if (i4 % 2 == 0 ? 200 <= (i = this.statusCode) : 28058 <= (i = this.statusCode)) {
            if (i < 300) {
                int i5 = i3 + 25;
                int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 1;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                z = true;
            }
        }
        return !z;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 23;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = Integer.hashCode(this.statusCode);
            iHashCode = this.jsonBody.hashCode();
            i = iHashCode2 >>> 53;
        } else {
            int iHashCode3 = Integer.hashCode(this.statusCode);
            iHashCode = this.jsonBody.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = IconCompatParcelizer + 91;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 71;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof getMaxFlingVelocity) {
            getMaxFlingVelocity getmaxflingvelocity = (getMaxFlingVelocity) obj;
            if (this.statusCode != getmaxflingvelocity.statusCode) {
                return false;
            }
            Object[] objArr = {this.jsonBody, getmaxflingvelocity.jsonBody};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = read + 51;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 93;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HomeResponseItem(statusCode=" + this.statusCode + ", jsonBody=" + this.jsonBody + ")";
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
        return str;
    }
}
