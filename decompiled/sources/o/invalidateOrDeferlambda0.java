package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Dislike$Companion;
import kotlinx.serialization.Serializable;
import o.getOnModifierChangedui;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "dislike")
public final class invalidateOrDeferlambda0 implements getRelease {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Dislike$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Dislike$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 51;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getOnModifierChangedui.RemoteActionCompatParcelizer;
            }
            getOnModifierChangedui getonmodifierchangedui = getOnModifierChangedui.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final int count;
    public final boolean hasPerformed;
    public final onNestedScroll request;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Dislike$Companion] */
    static {
        int i = read + 1;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ invalidateOrDeferlambda0(int i, int i2, boolean z, onNestedScroll onnestedscroll) {
        if (7 == (i & 7)) {
            this.count = i2;
            this.hasPerformed = z;
            this.request = onnestedscroll;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getOnModifierChangedui.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        boolean z;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int iHashCode = Integer.hashCode(this.count);
            z = this.hasPerformed;
            i2 = iHashCode / 89;
            i = 72;
        } else {
            int iHashCode2 = Integer.hashCode(this.count);
            z = this.hasPerformed;
            i = 31;
            i2 = iHashCode2 * 31;
        }
        int iHashCode3 = this.request.hashCode() + d$$ExternalSyntheticOutline0.m(i2, i, z);
        int i5 = IconCompatParcelizer + 117;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof invalidateOrDeferlambda0) {
            invalidateOrDeferlambda0 invalidateordeferlambda0 = (invalidateOrDeferlambda0) obj;
            if (this.count != invalidateordeferlambda0.count) {
                return false;
            }
            if (this.hasPerformed == invalidateordeferlambda0.hasPerformed) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.request, invalidateordeferlambda0.request}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = write + 103;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            int i3 = write + 117;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        int i4 = write + 115;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Dislike(count=" + this.count + ", hasPerformed=" + this.hasPerformed + ", request=" + this.request + ")";
        int i2 = IconCompatParcelizer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
