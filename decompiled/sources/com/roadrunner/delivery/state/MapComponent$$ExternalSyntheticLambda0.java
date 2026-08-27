package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumSerializer;
import o.AlignmentOffsetPositionProvider;
import o.AndroidDialog_androidKtDialog11;
import o.AndroidDialog_androidKtDialog11invokeinlinedonDispose1;
import o.AndroidDialog_androidKtDialog3;
import o.AndroidDialog_androidKtDialogdialog111;
import o.AndroidPopup_androidKt;
import o.AndroidViewHolder;
import o.AndroidViewHolderlayoutNode15measure2;
import o.AndroidViewHolderrelease1;
import o.AndroidView_androidKtupdateViewHolderParams1;
import o.AndroidView_androidKtupdateViewHolderParams3;
import o.AndroidView_androidKtupdateViewHolderParams4;
import o.AndroidView_androidKtupdateViewHolderParams5;
import o.AndroidView_androidKtupdateViewHolderParams5WhenMappings;
import o.BringIntoViewElement;
import o.BringIntoViewNoderequester11;
import o.BringIntoViewNoderequester111;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.FocusGroupNode_androidKt;
import o.FocusGroupPropertiesElement;
import o.FocusGroupPropertiesNode;
import o.FocusTargetInteropNode;
import o.FocusTargetInteropNodefocusTargetNode1;
import o.FocusTargetPropertiesNode;
import o.PopupK5zGePQ;
import o.PopupLayoutHelperImpl29;
import o.Popuplambda0;
import o.ViewFactoryHolder;
import o.ViewFactoryHolderregisterSaveStateProvider1;
import o.ViewFactoryHolderreleaseBlock1;
import o.ViewFactoryHolderresetBlock1;
import o.ViewFactoryHolderupdateBlock1;
import o.accessDialogLayout;
import o.accesscreateFlags;
import o.accessflagsWithSecureFlagInherited;
import o.accessgetCurrentlyFocusedRect;
import o.accessgetDispatcherp;
import o.accessgetEmbeddedView;
import o.accessgetHasUpdateBlockp;
import o.accessgetTypedViewp;
import o.accessobtainMeasureSpec;
import o.accesstoIntBounds;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.createFlags;
import o.displayInAppMessagelambda1;
import o.flagsWithSecureFlagInherited;
import o.focusInteropModifier;
import o.getAttachedViewTreeObserver;
import o.getFocusTargetOfEmbeddedViewWrapper;
import o.getFocusedChild;
import o.getInheritSecurePolicyui;
import o.getLocalIsInPopupLayout;
import o.getLocalPopupTestTag;
import o.getRelease;
import o.getRequester;
import o.getResetBlock;
import o.getUnregisteredInAppMessageannotations;
import o.getUpdateBlock;
import o.insetToLayoutPosition;
import o.insetValue;
import o.isFlagSecureEnabled;
import o.onDismissed;
import o.onFocusStateChange;
import o.onNestedFling;
import o.onWindowVisibilityChanged;
import o.packFloats;
import o.r8lambda87rkzpiD7fzpQlzxtrf4CIiBjKU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setGraphicModalMaxWidthDp;
import o.setOnModifierChangedui;
import o.setRelease;
import o.setReleaseBlock;
import o.setResetBlock;
import o.setUpdateBlock;
import o.setWasCloseMessageCalled;
import o.unregisterSaveStateProvider;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MapComponent$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ MapComponent$$ExternalSyntheticLambda0(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        switch (this.IconCompatParcelizer) {
            case 0:
                return new getInheritSecurePolicyui(AndroidViewHolderlayoutNode15measure2.Companion.serializer());
            case 1:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.DestinationInfo.ScrollableComponent.Instructions.Item.DeliveryNotes.DeliveryNotesComponent", displayInAppMessagelambda1.serializer(AndroidViewHolder.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(accessgetDispatcherp.class), displayInAppMessagelambda1.serializer(accessgetHasUpdateBlockp.class)}, new setGraphicModalMaxWidthDp[]{new EnumSerializer("folding", accessgetDispatcherp.INSTANCE, new Annotation[0]), r8lambda87rkzpiD7fzpQlzxtrf4CIiBjKU.serializer}, new Annotation[0]);
            case 2:
                return new EnumSerializer("folding", accessgetDispatcherp.INSTANCE, new Annotation[0]);
            case 3:
                return new getInheritSecurePolicyui(accessobtainMeasureSpec.Companion.serializer());
            case 4:
                return new setWasCloseMessageCalled(insetToLayoutPosition.IconCompatParcelizer, 0);
            case 5:
                return new getInheritSecurePolicyui(insetValue.Companion.serializer());
            case 6:
                return new setWasCloseMessageCalled(onNestedFling.RemoteActionCompatParcelizer, 0);
            case 7:
                return new getInheritSecurePolicyui(getRelease.Companion.serializer());
            case 8:
                return new getInheritSecurePolicyui(onWindowVisibilityChanged.Companion.serializer());
            case 9:
                return new setWasCloseMessageCalled(setOnModifierChangedui.serializer, 0);
            case 10:
                return new getInheritSecurePolicyui(setRelease.Companion.serializer());
            case 11:
                return VehicleType.Companion.serializer();
            case 12:
                DestinationLocation.Companion companion = DestinationLocation.Companion;
                return VehicleType.Companion.serializer();
            case 13:
                return new getInheritSecurePolicyui(AndroidViewHolderrelease1.Companion.serializer());
            case 14:
                PopupLayoutHelperImpl29 popupLayoutHelperImpl29 = new PopupLayoutHelperImpl29(accessgetCurrentlyFocusedRect.Companion.serializer());
                int i3 = serializer + 13;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return popupLayoutHelperImpl29;
                }
                throw null;
            case 15:
                return new setWasCloseMessageCalled(accessgetCurrentlyFocusedRect.Companion.serializer(), 0);
            case 16:
                return new setWasCloseMessageCalled(accessgetCurrentlyFocusedRect.Companion.serializer(), 0);
            case 17:
                return new setWasCloseMessageCalled(accessgetCurrentlyFocusedRect.Companion.serializer(), 0);
            case 18:
                return new setWasCloseMessageCalled(accessgetCurrentlyFocusedRect.Companion.serializer(), 0);
            case 19:
                return new PopupLayoutHelperImpl29(AndroidView_androidKtupdateViewHolderParams4.write);
            case 20:
                return new PopupLayoutHelperImpl29(TrackingEvent$$serializer.write);
            case 21:
                return new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, packFloats.read);
            case 22:
                return new PopupLayoutHelperImpl29(AndroidView_androidKtupdateViewHolderParams4.write);
            case 23:
                return new PopupLayoutHelperImpl29(TrackingEvent$$serializer.write);
            case 24:
                return new PopupLayoutHelperImpl29(onDismissed.write);
            case 25:
                PopupLayoutHelperImpl29 popupLayoutHelperImpl210 = new PopupLayoutHelperImpl29(TrackingEvent$$serializer.write);
                int i4 = serializer + 63;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return popupLayoutHelperImpl210;
                }
                throw null;
            case 26:
                return StateV3$AcceptData$BoostedEarningsIcons.m4948$r8$lambda$5z43BCmF4lVdJIhYXqd5QW5Zq0();
            case 27:
                return new PopupLayoutHelperImpl29(StateV3$AcceptData$BoostedEarningsIcons.Companion.serializer());
            case 28:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.StateV3.AcceptData.Component", displayInAppMessagelambda1.serializer(accessgetCurrentlyFocusedRect.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(AndroidView_androidKtupdateViewHolderParams3.class), displayInAppMessagelambda1.serializer(AndroidView_androidKtupdateViewHolderParams5.class), displayInAppMessagelambda1.serializer(AndroidView_androidKtupdateViewHolderParams5WhenMappings.class), displayInAppMessagelambda1.serializer(FocusGroupNode_androidKt.class), displayInAppMessagelambda1.serializer(BringIntoViewNoderequester111.class), displayInAppMessagelambda1.serializer(accessgetEmbeddedView.class), displayInAppMessagelambda1.serializer(getFocusTargetOfEmbeddedViewWrapper.class), displayInAppMessagelambda1.serializer(FocusGroupPropertiesElement.class), displayInAppMessagelambda1.serializer(onFocusStateChange.class), displayInAppMessagelambda1.serializer(FocusTargetPropertiesNode.class), displayInAppMessagelambda1.serializer(accessgetTypedViewp.class), displayInAppMessagelambda1.serializer(getResetBlock.class), displayInAppMessagelambda1.serializer(unregisterSaveStateProvider.class), displayInAppMessagelambda1.serializer(ViewFactoryHolderregisterSaveStateProvider1.class), displayInAppMessagelambda1.serializer(setUpdateBlock.class), displayInAppMessagelambda1.serializer(ViewFactoryHolderresetBlock1.class), displayInAppMessagelambda1.serializer(AlignmentOffsetPositionProvider.class), displayInAppMessagelambda1.serializer(AndroidDialog_androidKtDialogdialog111.class), displayInAppMessagelambda1.serializer(AndroidDialog_androidKtDialog3.class), displayInAppMessagelambda1.serializer(PopupK5zGePQ.class), displayInAppMessagelambda1.serializer(Popuplambda0.class), displayInAppMessagelambda1.serializer(accesscreateFlags.class), displayInAppMessagelambda1.serializer(getLocalIsInPopupLayout.class), displayInAppMessagelambda1.serializer(isFlagSecureEnabled.class), displayInAppMessagelambda1.serializer(flagsWithSecureFlagInherited.class)}, new setGraphicModalMaxWidthDp[]{AndroidView_androidKtupdateViewHolderParams1.RemoteActionCompatParcelizer, BringIntoViewElement.RemoteActionCompatParcelizer, getRequester.read, BringIntoViewNoderequester11.IconCompatParcelizer, focusInteropModifier.RemoteActionCompatParcelizer, getAttachedViewTreeObserver.serializer, FocusGroupPropertiesNode.write, getFocusedChild.read, FocusTargetInteropNode.write, FocusTargetInteropNodefocusTargetNode1.IconCompatParcelizer, ViewFactoryHolder.write, getUpdateBlock.write, setResetBlock.write, ViewFactoryHolderreleaseBlock1.write, setReleaseBlock.RemoteActionCompatParcelizer, ViewFactoryHolderupdateBlock1.write, accessDialogLayout.write, AndroidDialog_androidKtDialog11invokeinlinedonDispose1.serializer, AndroidDialog_androidKtDialog11.RemoteActionCompatParcelizer, AndroidPopup_androidKt.RemoteActionCompatParcelizer, accesstoIntBounds.read, accessflagsWithSecureFlagInherited.IconCompatParcelizer, getLocalPopupTestTag.serializer, createFlags.RemoteActionCompatParcelizer, new EnumSerializer("com.roadrunner.delivery.state.StateV3.AcceptData.UnknownComponent", flagsWithSecureFlagInherited.INSTANCE, new Annotation[0])}, new Annotation[0]);
            default:
                return new PopupLayoutHelperImpl29(onDismissed.write);
        }
    }
}
