package o;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class DefaultPagerNestedScrollConnection {
    public static final onPostScrollDzOQY0M IconCompatParcelizer(androidx.compose.foundation.AbstractClickableNode abstractClickableNode) {
        return new onPostScrollDzOQY0M(abstractClickableNode);
    }

    public static final androidx.compose.ui.Modifier RemoteActionCompatParcelizer(androidx.compose.ui.Modifier modifier, getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, SelectionHandleIcon selectionHandleIcon, isNotGestureActionfoundation isnotgestureactionfoundation, boolean z, constructorimpl constructorimplVar, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogtimechangedblockingdialogfragmentexternalsyntheticlambda0) {
        float f = androidx.compose.foundation.ClipScrollableContainerKt.read;
        return modifier.then(selectionHandleIcon == SelectionHandleIcon.Vertical ? androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.Companion, androidx.compose.foundation.VerticalScrollableClipShape.serializer) : androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.Companion, androidx.compose.foundation.HorizontalScrollableClipShape.serializer)).then(new AnnotatedStringResolveInlineContentKt(isnotgestureactionfoundation, invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogtimechangedblockingdialogfragmentexternalsyntheticlambda0, constructorimplVar, selectionHandleIcon, getadjustedcoordinatesk4lq0m, mutableInteractionSourceImpl, z, false));
    }

    public static final void RemoteActionCompatParcelizer(androidx.compose.foundation.AbstractClickableNode abstractClickableNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(abstractClickableNode, onPostScrollDzOQY0M.serializer, new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0));
    }

    public static final position serializer(float f, long j) {
        return new position(f, new androidx.compose.ui.graphics.SolidColor(j, null));
    }
}
