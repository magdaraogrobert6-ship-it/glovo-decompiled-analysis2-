package o;

import androidx.camera.video.Recorder$3;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;

/* JADX INFO: loaded from: classes.dex */
public final class boximpl extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, hashCodeimpl {
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaDescriptionCompat;
    public Recorder$3 MediaSessionCompatQueueItem;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final getPersonLastName write = androidx.compose.runtime.CompositionKt.serializer(new CoroutineLiveData$$ExternalSyntheticLambda0(17, this));
    public androidx.compose.ui.geometry.Rect IconCompatParcelizer = androidx.compose.ui.geometry.Rect.Companion.getZero();

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        Recorder$3 recorder$3 = this.MediaSessionCompatQueueItem;
        recorder$3.RemoteActionCompatParcelizer = equalsimpl0.Detached;
        recorder$3.MediaBrowserCompatMediaItem = null;
        super.onDetach();
    }

    @Override // o.hashCodeimpl
    public final any serializer() {
        return (any) this.write.getValue();
    }

    public boximpl(Recorder$3 recorder$3, MapboxNavigation$parsing$2 mapboxNavigation$parsing$2, TextFieldSelectionManager$contextMenuAreaModifier$3 textFieldSelectionManager$contextMenuAreaModifier$3, removePost removepost) {
        this.MediaSessionCompatQueueItem = recorder$3;
        this.RemoteActionCompatParcelizer = mapboxNavigation$parsing$2;
        this.read = textFieldSelectionManager$contextMenuAreaModifier$3;
        this.serializer = removepost;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        Recorder$3 recorder$3 = this.MediaSessionCompatQueueItem;
        recorder$3.RemoteActionCompatParcelizer = equalsimpl0.Attached;
        recorder$3.MediaBrowserCompatMediaItem = this;
    }

    @Override // o.hashCodeimpl
    public final long IconCompatParcelizer(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return RemoteActionCompatParcelizer(layoutCoordinates).m512getTopLeftF1C5BW0();
    }

    @Override // o.hashCodeimpl
    public final androidx.compose.ui.geometry.Rect RemoteActionCompatParcelizer(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        if (!isAttached()) {
            return this.IconCompatParcelizer;
        }
        androidx.compose.ui.geometry.Rect rect = (androidx.compose.ui.geometry.Rect) this.serializer.invoke(layoutCoordinates);
        if (rect == null) {
            return this.IconCompatParcelizer;
        }
        this.IconCompatParcelizer = rect;
        return rect;
    }
}
