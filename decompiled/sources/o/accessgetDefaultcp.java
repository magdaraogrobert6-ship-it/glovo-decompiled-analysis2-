package o;

import androidx.camera.video.Recorder$3;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;

/* JADX INFO: loaded from: classes.dex */
final class accessgetDefaultcp extends androidx.compose.ui.node.ModifierNodeElement<boximpl> {
    public final removePost IconCompatParcelizer;
    public final Recorder$3 read;
    public final TextFieldSelectionManager$contextMenuAreaModifier$3 serializer;
    public final MapboxNavigation$parsing$2 write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new boximpl(this.read, this.write, this.serializer, this.IconCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = this.write;
        int iHashCode2 = mapboxNavigation$parsing$2 != null ? mapboxNavigation$parsing$2.hashCode() : 0;
        TextFieldSelectionManager$contextMenuAreaModifier$3 textFieldSelectionManager$contextMenuAreaModifier$3 = this.serializer;
        return this.IconCompatParcelizer.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (textFieldSelectionManager$contextMenuAreaModifier$3 != null ? textFieldSelectionManager$contextMenuAreaModifier$3.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        boximpl boximplVar = (boximpl) node;
        boximplVar.MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem = null;
        Recorder$3 recorder$3 = this.read;
        boximplVar.MediaSessionCompatQueueItem = recorder$3;
        recorder$3.MediaBrowserCompatMediaItem = boximplVar;
        recorder$3.RemoteActionCompatParcelizer = boximplVar.isAttached() ? equalsimpl0.Attached : equalsimpl0.Detached;
        boximplVar.RemoteActionCompatParcelizer = this.write;
        boximplVar.read = this.serializer;
        boximplVar.serializer = this.IconCompatParcelizer;
    }

    public accessgetDefaultcp(Recorder$3 recorder$3, MapboxNavigation$parsing$2 mapboxNavigation$parsing$2, TextFieldSelectionManager$contextMenuAreaModifier$3 textFieldSelectionManager$contextMenuAreaModifier$3, removePost removepost) {
        this.read = recorder$3;
        this.write = mapboxNavigation$parsing$2;
        this.serializer = textFieldSelectionManager$contextMenuAreaModifier$3;
        this.IconCompatParcelizer = removepost;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetDefaultcp)) {
            return false;
        }
        accessgetDefaultcp accessgetdefaultcp = (accessgetDefaultcp) obj;
        return this.read == accessgetdefaultcp.read && this.write == accessgetdefaultcp.write && this.serializer == accessgetdefaultcp.serializer && this.IconCompatParcelizer == accessgetdefaultcp.IconCompatParcelizer;
    }
}
