package o;

import android.view.View;
import android.widget.Magnifier;
import androidx.lifecycle.BlockRunner$cancel$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes.dex */
public final class PagerState extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.ObserverModifierNode {
    public View ComponentActivity;
    public float IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public androidx.camera.view.PendingValue MediaDescriptionCompat;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public PagerStateKt MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public long MediaSessionCompatToken;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM PlaybackStateCompat;
    public androidx.compose.ui.unit.IntSize PlaybackStateCompatCustomAction;
    public androidx.compose.ui.unit.Density RemoteActionCompatParcelizer;
    public float ResultReceiver;
    public boolean read;
    public getPersonLastName serializer;
    public BufferedChannel write;
    public final PopulateViewStructure_androidKtpopulate7 RatingCompat = androidx.compose.runtime.CompositionKt.serializer((Object) null, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
    public long ParcelableVolumeInfo = androidx.compose.ui.geometry.Offset.Companion.m492getUnspecifiedF1C5BW0();

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        ((onShowTranslationui) this.RatingCompat).setValue(layoutCoordinates);
    }

    public PagerState(AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl androidTextContextMenuToolbarProviderTextActionModeCallbackImpl, resetui resetuiVar, float f, boolean z, long j, float f2, float f3, boolean z2, PagerStateKt pagerStateKt) {
        this.PlaybackStateCompat = androidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
        this.MediaMetadataCompat = resetuiVar;
        this.ResultReceiver = f;
        this.MediaSessionCompatResultReceiverWrapper = z;
        this.MediaSessionCompatToken = j;
        this.IconCompatParcelizer = f2;
        this.MediaBrowserCompatMediaItem = f3;
        this.read = z2;
        this.MediaSessionCompatQueueItem = pagerStateKt;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        BufferedChannel bufferedChannel = this.write;
        if (bufferedChannel != null) {
            bufferedChannel.b_(createFromParcel.INSTANCE);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new scrollsuspendImpl(this, 0));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.camera.view.PendingValue pendingValue = this.MediaDescriptionCompat;
        if (pendingValue != null) {
            ((Magnifier) pendingValue.serializer).dismiss();
        }
        this.MediaDescriptionCompat = null;
    }

    public final void read() {
        androidx.compose.ui.unit.Density densityRequireDensity = this.RemoteActionCompatParcelizer;
        if (densityRequireDensity == null) {
            densityRequireDensity = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this);
            this.RemoteActionCompatParcelizer = densityRequireDensity;
        }
        long jM487unboximpl = ((androidx.compose.ui.geometry.Offset) this.PlaybackStateCompat.invoke(densityRequireDensity)).m487unboximpl();
        if ((jM487unboximpl & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats || (androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & write()) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.ParcelableVolumeInfo = androidx.compose.ui.geometry.Offset.Companion.m492getUnspecifiedF1C5BW0();
            androidx.camera.view.PendingValue pendingValue = this.MediaDescriptionCompat;
            if (pendingValue != null) {
                ((Magnifier) pendingValue.serializer).dismiss();
                return;
            }
            return;
        }
        this.ParcelableVolumeInfo = androidx.compose.ui.geometry.Offset.m482plusMKHz9U(write(), jM487unboximpl);
        long jM492getUnspecifiedF1C5BW0 = androidx.compose.ui.geometry.Offset.Companion.m492getUnspecifiedF1C5BW0();
        if (this.MediaDescriptionCompat == null) {
            serializer();
        }
        androidx.camera.view.PendingValue pendingValue2 = this.MediaDescriptionCompat;
        if (pendingValue2 != null) {
            pendingValue2.mo5updateWko1d7g(this.ParcelableVolumeInfo, jM492getUnspecifiedF1C5BW0, this.ResultReceiver);
        }
        RemoteActionCompatParcelizer();
    }

    public final void serializer() {
        androidx.camera.view.PendingValue pendingValue = this.MediaDescriptionCompat;
        if (pendingValue != null) {
            ((Magnifier) pendingValue.serializer).dismiss();
        }
        View viewRequireView = this.ComponentActivity;
        if (viewRequireView == null) {
            viewRequireView = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this);
        }
        View view = viewRequireView;
        this.ComponentActivity = view;
        androidx.compose.ui.unit.Density densityRequireDensity = this.RemoteActionCompatParcelizer;
        if (densityRequireDensity == null) {
            densityRequireDensity = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this);
        }
        androidx.compose.ui.unit.Density density = densityRequireDensity;
        this.RemoteActionCompatParcelizer = density;
        this.MediaDescriptionCompat = this.MediaSessionCompatQueueItem.mo25createnHHXs2Y(view, this.MediaSessionCompatResultReceiverWrapper, this.MediaSessionCompatToken, this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, this.read, density, this.ResultReceiver);
        RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        androidx.compose.ui.unit.Density density;
        androidx.camera.view.PendingValue pendingValue = this.MediaDescriptionCompat;
        if (pendingValue == null || (density = this.RemoteActionCompatParcelizer) == null || androidx.compose.ui.unit.IntSize.m3841equalsimpl(pendingValue.read(), this.PlaybackStateCompatCustomAction)) {
            return;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.MediaMetadataCompat;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(androidx.compose.ui.unit.DpSize.m3759boximpl(density.mo46toDpSizekrfVVM(androidx.compose.ui.unit.IntSizeKt.m3856toSizeozmzZPI(pendingValue.read()))));
        }
        this.PlaybackStateCompatCustomAction = androidx.compose.ui.unit.IntSize.m3836boximpl(pendingValue.read());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(animateScrollToPage.read, new scrollsuspendImpl(this, 1));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        this.write = androidx.sqlite.SQLite.IconCompatParcelizer(0, 7, (IInAppMessageViewWrapper) null);
        BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 5), 1);
    }

    public final long write() {
        if (this.serializer == null) {
            this.serializer = androidx.compose.runtime.CompositionKt.serializer(new scrollsuspendImpl(this, 2));
        }
        getPersonLastName getpersonlastname = this.serializer;
        return getpersonlastname != null ? ((androidx.compose.ui.geometry.Offset) getpersonlastname.getValue()).m487unboximpl() : androidx.compose.ui.geometry.Offset.Companion.m492getUnspecifiedF1C5BW0();
    }
}
