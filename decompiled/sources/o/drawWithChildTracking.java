package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.data.error.BlockingMessage$Companion;
import kotlinx.serialization.Serializable;
import o.obtainPathBounds;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "blocking")
public final class drawWithChildTracking extends obtainAndroidOutline {
    public static final BlockingMessage$Companion Companion = new Object() { // from class: com.data.error.BlockingMessage$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return obtainPathBounds.IconCompatParcelizer;
        }
    };
    public final String action;
    public final String description;
    public final String title;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
        String str = this.action;
        return iM + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drawWithChildTracking)) {
            return false;
        }
        drawWithChildTracking drawwithchildtracking = (drawWithChildTracking) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, drawwithchildtracking.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, drawwithchildtracking.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, drawwithchildtracking.action}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ drawWithChildTracking(int i, String str, String str2, String str3) {
        if (3 == (i & 3)) {
            this.title = str;
            this.description = str2;
            if ((i & 4) == 0) {
                this.action = null;
                return;
            } else {
                this.action = str3;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, obtainPathBounds.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BlockingMessage(title=", this.title, ", description=", this.description, ", action="), this.action, ")");
    }
}
