package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.state.entity.HomeResponse$Companion;
import kotlinx.serialization.Serializable;
import o.getItemDecorationCount;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getItemDecorInsetsForChild {
    public static final HomeResponse$Companion Companion = new Object() { // from class: com.roadrunner.home.state.entity.HomeResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 101;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getItemDecorationCount.RemoteActionCompatParcelizer;
            }
            getItemDecorationCount getitemdecorationcount = getItemDecorationCount.RemoteActionCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final Integer nextRefreshInSeconds;
    public final getMinFlingVelocity raw;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.state.entity.HomeResponse$Companion] */
    static {
        int i = write + 89;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getItemDecorInsetsForChild(int i, getMinFlingVelocity getminflingvelocity, Integer num) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.raw = getminflingvelocity;
            if ((i & 2) == 0) {
                this.nextRefreshInSeconds = null;
                int i2 = RemoteActionCompatParcelizer + 101;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.nextRefreshInSeconds = num;
            int i3 = RemoteActionCompatParcelizer + 109;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getItemDecorationCount.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            this.raw.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.raw.hashCode();
        Integer num = this.nextRefreshInSeconds;
        if (num == null) {
            i = 0;
        } else {
            int iHashCode2 = num.hashCode();
            int i4 = RemoteActionCompatParcelizer + 75;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HomeResponse(raw=" + this.raw + ", nextRefreshInSeconds=" + this.nextRefreshInSeconds + ")";
        int i2 = RemoteActionCompatParcelizer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
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
        if (!(obj instanceof getItemDecorInsetsForChild)) {
            return false;
        }
        getItemDecorInsetsForChild getitemdecorinsetsforchild = (getItemDecorInsetsForChild) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.raw, getitemdecorinsetsforchild.raw}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.nextRefreshInSeconds, getitemdecorinsetsforchild.nextRefreshInSeconds}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 111;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read;
        int i5 = i4 + 101;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 89;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }
}
