package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.hms.location.ActivityIdentificationData;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Like$Companion;
import kotlinx.serialization.Serializable;
import o.obtainMeasureSpec;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "like")
public final class getOnDensityChangedui implements getRelease {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Like$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Like$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 35;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            obtainMeasureSpec obtainmeasurespec = obtainMeasureSpec.write;
            int i4 = IconCompatParcelizer + 101;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return obtainmeasurespec;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final int count;
    public final boolean hasPerformed;
    public final onNestedScroll request;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Like$Companion] */
    static {
        int i = read + 53;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getOnDensityChangedui(int i, int i2, boolean z, onNestedScroll onnestedscroll) {
        if (7 == (i & 7)) {
            this.count = i2;
            this.hasPerformed = z;
            this.request = onnestedscroll;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, obtainMeasureSpec.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.request.hashCode() * d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.count) + 69, ActivityIdentificationData.RUNNING, this.hasPerformed);
        }
        return this.request.hashCode() + d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.count) * 31, 31, this.hasPerformed);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 9;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getOnDensityChangedui)) {
            return false;
        }
        getOnDensityChangedui getondensitychangedui = (getOnDensityChangedui) obj;
        if (this.count != getondensitychangedui.count) {
            return false;
        }
        if (this.hasPerformed == getondensitychangedui.hasPerformed) {
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.request, getondensitychangedui.request}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i4 = serializer + 119;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Like(count=" + this.count + ", hasPerformed=" + this.hasPerformed + ", request=" + this.request + ")";
        int i2 = serializer + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
