package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class FrameRateElement extends androidx.compose.ui.node.ModifierNodeElement<preferredFrameRatekI47g10> {
    public final androidx.compose.ui.text.input.ImeOptions IconCompatParcelizer;
    public final androidx.compose.ui.text.input.TextFieldValue MediaBrowserCompatMediaItem;
    public final androidx.compose.ui.text.input.TransformedText MediaDescriptionCompat;
    public final androidx.compose.foundation.text.LegacyTextFieldState MediaSessionCompatQueueItem;
    public final androidx.compose.ui.text.input.OffsetMapping RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager serializer;
    public final androidx.compose.ui.focus.FocusRequester write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        preferredFrameRatekI47g10 preferredframerateki47g10 = new preferredFrameRatekI47g10();
        preferredframerateki47g10.MediaBrowserCompatMediaItem = this.MediaDescriptionCompat;
        preferredframerateki47g10.MediaMetadataCompat = this.MediaBrowserCompatMediaItem;
        preferredframerateki47g10.MediaSessionCompatQueueItem = this.MediaSessionCompatQueueItem;
        preferredframerateki47g10.RemoteActionCompatParcelizer = this.read;
        preferredframerateki47g10.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
        preferredframerateki47g10.MediaDescriptionCompat = this.RatingCompat;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.serializer;
        preferredframerateki47g10.serializer = textFieldSelectionManager;
        preferredframerateki47g10.write = this.IconCompatParcelizer;
        preferredframerateki47g10.read = this.write;
        textFieldSelectionManager.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new FrameRateModifierNode(preferredframerateki47g10, 4);
        return preferredframerateki47g10;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.MediaDescriptionCompat.hashCode();
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.MediaSessionCompatQueueItem.hashCode() + ((this.MediaBrowserCompatMediaItem.hashCode() + (iHashCode * 31)) * 31)) * 31, 31, false), 31, this.read), 31, this.RemoteActionCompatParcelizer);
        int iHashCode2 = this.RatingCompat.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        return this.write.hashCode() + ((this.IconCompatParcelizer.hashCode() + ((iHashCode3 + ((iHashCode2 + iM) * 31)) * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0066  */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        preferredFrameRatekI47g10 preferredframerateki47g10 = (preferredFrameRatekI47g10) node;
        boolean z = preferredframerateki47g10.RemoteActionCompatParcelizer;
        boolean z2 = preferredframerateki47g10.IconCompatParcelizer;
        androidx.compose.ui.text.input.ImeOptions imeOptions = preferredframerateki47g10.write;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = preferredframerateki47g10.serializer;
        preferredframerateki47g10.MediaBrowserCompatMediaItem = this.MediaDescriptionCompat;
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.MediaBrowserCompatMediaItem;
        preferredframerateki47g10.MediaMetadataCompat = textFieldValue;
        preferredframerateki47g10.MediaSessionCompatQueueItem = this.MediaSessionCompatQueueItem;
        boolean z3 = this.read;
        preferredframerateki47g10.RemoteActionCompatParcelizer = z3;
        preferredframerateki47g10.MediaDescriptionCompat = this.RatingCompat;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = this.serializer;
        preferredframerateki47g10.serializer = textFieldSelectionManager2;
        androidx.compose.ui.text.input.ImeOptions imeOptions2 = this.IconCompatParcelizer;
        preferredframerateki47g10.write = imeOptions2;
        preferredframerateki47g10.read = this.write;
        if (z3 == z && z3 == z) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{imeOptions2, imeOptions}, iWrite3)).booleanValue() || this.RemoteActionCompatParcelizer != z2 || !androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(textFieldValue.m3330getSelectiond9O1mEE())) {
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(preferredframerateki47g10);
            }
        } else {
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(preferredframerateki47g10);
        }
        int iWrite4 = getCieXyz.write();
        int iWrite5 = getCieXyz.write();
        int iWrite6 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{textFieldSelectionManager2, textFieldSelectionManager}, iWrite6)).booleanValue()) {
            return;
        }
        textFieldSelectionManager2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new FrameRateModifierNode(preferredframerateki47g10, 0);
    }

    public FrameRateElement(androidx.compose.ui.text.input.TransformedText transformedText, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.MediaDescriptionCompat = transformedText;
        this.MediaBrowserCompatMediaItem = textFieldValue;
        this.MediaSessionCompatQueueItem = legacyTextFieldState;
        this.read = z;
        this.RemoteActionCompatParcelizer = z2;
        this.RatingCompat = offsetMapping;
        this.serializer = textFieldSelectionManager;
        this.IconCompatParcelizer = imeOptions;
        this.write = focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameRateElement)) {
            return false;
        }
        FrameRateElement frameRateElement = (FrameRateElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, frameRateElement.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, frameRateElement.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, frameRateElement.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() || this.read != frameRateElement.read || this.RemoteActionCompatParcelizer != frameRateElement.RemoteActionCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, frameRateElement.RatingCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, frameRateElement.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, frameRateElement.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, frameRateElement.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.MediaDescriptionCompat + ", value=" + this.MediaBrowserCompatMediaItem + ", state=" + this.MediaSessionCompatQueueItem + ", readOnly=false, enabled=" + this.read + ", isPassword=" + this.RemoteActionCompatParcelizer + ", offsetMapping=" + this.RatingCompat + ", manager=" + this.serializer + ", imeOptions=" + this.IconCompatParcelizer + ", focusRequester=" + this.write + ')';
    }
}
