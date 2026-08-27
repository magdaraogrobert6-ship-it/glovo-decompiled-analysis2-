package o;

import com.data.error.NonBlockingMessage$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setPositionVbeCjmY;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "none_blocking")
public final class resolveOutlinePosition extends obtainAndroidOutline {
    public static final NonBlockingMessage$Companion Companion = new Object() { // from class: com.data.error.NonBlockingMessage$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return setPositionVbeCjmY.IconCompatParcelizer;
        }
    };
    public final String level;
    public final String title;

    public final int hashCode() {
        int iHashCode = this.title.hashCode();
        String str = this.level;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resolveOutlinePosition)) {
            return false;
        }
        resolveOutlinePosition resolveoutlineposition = (resolveOutlinePosition) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, resolveoutlineposition.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.level, resolveoutlineposition.level}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ resolveOutlinePosition(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.title = str;
            if ((i & 2) == 0) {
                this.level = null;
                return;
            } else {
                this.level = str2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, setPositionVbeCjmY.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NonBlockingMessage(title=", this.title, ", level=", this.level, ")");
    }
}
