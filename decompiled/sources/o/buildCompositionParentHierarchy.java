package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.ConfirmButtonTaskUiItem$Companion;
import kotlinx.serialization.Serializable;
import o.makeTree;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class buildCompositionParentHierarchy implements uiMode {
    public static final ConfirmButtonTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.ConfirmButtonTaskUiItem$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 115;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                makeTree maketree = makeTree.RemoteActionCompatParcelizer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            makeTree maketree2 = makeTree.RemoteActionCompatParcelizer;
            int i3 = serializer + 101;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return maketree2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final EmptyGroup doubleConfirmationData;
    public final boolean enabled;
    public final String status;
    public final String taskId;
    public final String text;
    public final String url;

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return true;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i2 % 2 != 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.ConfirmButtonTaskUiItem$Companion] */
    static {
        int i = IconCompatParcelizer + 89;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.taskId;
        }
        throw null;
    }

    public /* synthetic */ buildCompositionParentHierarchy(int i, String str, String str2, boolean z, String str3, String str4, EmptyGroup emptyGroup) {
        if (63 == (i & 63)) {
            this.taskId = str;
            this.text = str2;
            this.enabled = z;
            this.status = str3;
            this.url = str4;
            this.doubleConfirmationData = emptyGroup;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, makeTree.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public static buildCompositionParentHierarchy RemoteActionCompatParcelizer(buildCompositionParentHierarchy buildcompositionparenthierarchy, boolean z) {
        int i = 2 % 2;
        String str = buildcompositionparenthierarchy.taskId;
        String str2 = buildcompositionparenthierarchy.text;
        String str3 = buildcompositionparenthierarchy.status;
        String str4 = buildcompositionparenthierarchy.url;
        EmptyGroup emptyGroup = buildcompositionparenthierarchy.doubleConfirmationData;
        str.getClass();
        str2.getClass();
        str4.getClass();
        buildCompositionParentHierarchy buildcompositionparenthierarchy2 = new buildCompositionParentHierarchy(str, str2, z, str3, str4, emptyGroup);
        int i2 = serializer + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return buildcompositionparenthierarchy2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public buildCompositionParentHierarchy(String str, String str2, boolean z, String str3, String str4, EmptyGroup emptyGroup) {
        str2.getClass();
        str4.getClass();
        this.taskId = str;
        this.text = str2;
        this.enabled = z;
        this.status = str3;
        this.url = str4;
        this.doubleConfirmationData = emptyGroup;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ConfirmButtonTaskUiItem(taskId=", this.taskId, ", text=", this.text, ", enabled=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", status=", this.status, ", url=", sbM, this.enabled);
        sbM.append(this.url);
        sbM.append(", doubleConfirmationData=");
        sbM.append(this.doubleConfirmationData);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.text), 31, this.enabled);
        String str = this.status;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 33;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.url);
        EmptyGroup emptyGroup = this.doubleConfirmationData;
        return iM2 + (emptyGroup != null ? emptyGroup.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 57;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buildCompositionParentHierarchy)) {
            int i4 = i2 + 89;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        buildCompositionParentHierarchy buildcompositionparenthierarchy = (buildCompositionParentHierarchy) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, buildcompositionparenthierarchy.taskId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, buildcompositionparenthierarchy.text}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 23;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (this.enabled != buildcompositionparenthierarchy.enabled) {
            int i7 = serializer + 69;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, buildcompositionparenthierarchy.status}, getCieXyz.write())).booleanValue()) {
            int i9 = serializer + 85;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, buildcompositionparenthierarchy.url}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.doubleConfirmationData, buildcompositionparenthierarchy.doubleConfirmationData}, getCieXyz.write())).booleanValue();
    }
}
