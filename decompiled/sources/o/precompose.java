package o;

import com.google.android.gms.internal.mlkit_vision_face.zzdr;
import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.google.android.gms.internal.mlkit_vision_face.zzjc;
import com.google.android.gms.internal.mlkit_vision_face.zzjh;
import com.google.android.gms.internal.mlkit_vision_face.zzki;
import com.google.android.gms.internal.mlkit_vision_face.zzkx;
import com.google.android.gms.internal.mlkit_vision_face.zzky;
import com.google.android.gms.internal.mlkit_vision_face.zzlc;
import com.google.android.gms.internal.mlkit_vision_face.zzli;
import com.google.android.gms.internal.mlkit_vision_face.zzlq;
import com.google.android.gms.internal.mlkit_vision_face.zzlv;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.google.android.gms.internal.mlkit_vision_face.zzmc;
import com.google.android.gms.internal.mlkit_vision_face.zzme;
import com.google.android.gms.internal.mlkit_vision_face.zzmg;
import com.google.android.gms.internal.mlkit_vision_face.zzmi;
import com.google.android.gms.internal.mlkit_vision_face.zzmk;
import com.google.android.gms.internal.mlkit_vision_face.zzmm;
import com.google.android.gms.internal.mlkit_vision_face.zzmq;
import com.google.android.gms.internal.mlkit_vision_face.zzmx;
import com.google.android.gms.internal.mlkit_vision_face.zzmy;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.google.android.gms.internal.mlkit_vision_face.zznb;
import com.google.android.gms.internal.mlkit_vision_face.zznc;
import com.google.android.gms.internal.mlkit_vision_face.zznd;
import com.google.android.gms.internal.mlkit_vision_face.zzng;
import com.google.android.gms.internal.mlkit_vision_face.zznh;
import com.google.android.gms.internal.mlkit_vision_face.zznk;
import com.google.android.gms.internal.mlkit_vision_face.zznl;
import com.mapbox.maps.extension.style.StyleExtensionImplKt;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.attribution.AttributionKt;
import com.mapbox.maps.plugin.gestures.GesturesPluginImplKt;
import com.mapbox.maps.plugin.indoorselector.IndoorUtils;
import com.mapbox.maps.plugin.logo.generated.LogoSettingsKt;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import com.mapbox.maps.plugin.scalebar.ScaleBarUtils;
import com.mapbox.navigation.base.internal.utils.DoubleKt;
import com.mapbox.navigation.base.internal.utils.RouterExKt;
import com.mapbox.navigation.base.options.RerouteDisabled;
import com.mapbox.navigation.core.directions.session.Utils;
import com.mapbox.navigation.core.navigator.LocationEx;
import com.mapbox.navigation.core.navigator.NavigatorMapper;
import com.mapbox.navigation.core.reroute.RerouteStateExKt;
import com.mapbox.navigation.core.routealternatives.SuggestionType$AlternativesUpdated;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuverViewState$EXPANDED;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.search.base.AssertionsKt;
import com.mapbox.turf.TurfMisc;

/* JADX INFO: loaded from: classes2.dex */
public final class precompose implements accessgetBrightnessDowncp {
    public static precompose IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public static final precompose write = new precompose(1);
    public static final /* synthetic */ precompose read = new precompose(2);
    public static final /* synthetic */ precompose serializer = new precompose(3);

    public /* synthetic */ precompose(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public static void read() {
        synchronized (precompose.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new precompose(0);
            }
        }
    }

    public void IconCompatParcelizer(getDiffer getdiffer) {
        getdiffer.serializer(accessgetScopep.class, accesstransformFromEL8BTi8jd.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        getdiffer.serializer(disposePrecomposedSlot.class, LayoutKtMultiMeasureLayout2.serializer);
        getdiffer.serializer(zzkx.class, localPositionOfS_NoaFUdefault.write);
        getdiffer.serializer(CoreSemanticsModifierNode.class, getParentLayoutCoordinates.read);
        getdiffer.serializer(zzky.class, accessscreenToLocalMKHz9Ujd.write);
        getdiffer.serializer(getSteps.class, localBoundingBoxOf.serializer);
        getdiffer.serializer(WindowInfo.class, LayoutBoundsNode.write);
        getdiffer.serializer(scrollRangeToCenter.class, LayoutBoundsHolder.read);
        getdiffer.serializer(accessgetCurrentIndexp.class, accesslocalToScreenMKHz9Ujd.RemoteActionCompatParcelizer);
        getdiffer.serializer(accessgetDropdownListcp.class, Layout.serializer);
        getdiffer.serializer(RelativeScrollerscrollBy1.class, setBoundsui.IconCompatParcelizer);
        getdiffer.serializer(LogoSettingsKt.class, IntrinsicsMeasureScopelayout1.IconCompatParcelizer);
        getdiffer.serializer(accesssetCurrentApproachIndexp.class, windowToLocalMKHz9U.read);
        getdiffer.serializer(LoggerProviderKt.class, getLastBounds.read);
        getdiffer.serializer(accessapproachSubcompose.class, setHandle.IconCompatParcelizer);
        getdiffer.serializer(accesscreatePrecomposedSlotHandle.class, getRectChanged.write);
        getdiffer.serializer(applyPausedPrecompositionlambda000.class, LayoutCoordinatesDefaultImpls.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzmm.class, getModifierInfo.write);
        getdiffer.serializer(Utils.class, getSemanticsId.serializer);
        getdiffer.serializer(deactivateOutOfFrame.class, getCoordinates.IconCompatParcelizer);
        getdiffer.serializer(com.mapbox.android.gestures.Utils.class, localPositionOfR5De75A.write);
        getdiffer.serializer(setMargin.class, updateInsets.write);
        getdiffer.serializer(ResourceResolutionException.class, transformFromEL8BTi8.write);
        getdiffer.serializer(LocaleUnitResolver.class, transformToScreen58bKbWc.write);
        getdiffer.serializer(StyleExtensionImplKt.class, findRootCoordinates.IconCompatParcelizer);
        getdiffer.serializer(ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.class, boundsInParent.IconCompatParcelizer);
        getdiffer.serializer(zzlq.class, boundsInWindowdefault.RemoteActionCompatParcelizer);
        getdiffer.serializer(scrollTo.class, positionInParent.serializer);
        getdiffer.serializer(GesturesPluginImplKt.class, positionInWindow.read);
        getdiffer.serializer(NavigatorMapper.class, LayoutIdKt.RemoteActionCompatParcelizer);
        getdiffer.serializer(approachSubcompose.class, positionOnScreen.write);
        getdiffer.serializer(AttributionKt.class, localToRootMKHz9U.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzmb.class, getMeasure.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzmc.class, LayoutIdElement.write);
        getdiffer.serializer(getRowIndex.class, layoutId.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzme.class, getLayoutId.serializer);
        getdiffer.serializer(zzmk.class, LayoutIdParentData.read);
        getdiffer.serializer(Role.class, getParentInfo.serializer);
        getdiffer.serializer(ScaleBarUtils.class, boundsInWindow.IconCompatParcelizer);
        getdiffer.serializer(ScrollCaptureonScrollCaptureSearch2.class, localBoundingBoxOfdefault.serializer);
        getdiffer.serializer(createNodeAt.class, LayoutElement.RemoteActionCompatParcelizer);
        getdiffer.serializer(cancelPausedPrecomposition.class, boundsInRoot.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzlv.class, positionInRoot.serializer);
        getdiffer.serializer(DoubleKt.class, isDeactivated.write);
        getdiffer.serializer(RouterExKt.class, LayoutKtcombineAsVirtualLayouts1.RemoteActionCompatParcelizer);
        getdiffer.serializer(PrimaryTextActionModeCallback.class, onApplyWindowInsets.read);
        getdiffer.serializer(accessminIntrinsicWidthjd.class, getDisplayCutoutRulers.read);
        getdiffer.serializer(ResourceIdCache.class, getGeneration.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzjc.class, getInsetsValues.IconCompatParcelizer);
        getdiffer.serializer(r8lambda3H4Tap9xiqWyze7ofwvkGYD5exE.class, onEnd.serializer);
        getdiffer.serializer(ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.class, onProgress.serializer);
        getdiffer.serializer(loadVectorResourceInner.class, onPrepare.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzjh.class, IntrinsicMeasureScope.read);
        getdiffer.serializer(IndoorUtils.class, IntrinsicWidthHeight.IconCompatParcelizer);
        getdiffer.serializer(accessminIntrinsicHeightjd.class, IntrinsicsMeasureScope.write);
        getdiffer.serializer(accessmaxIntrinsicWidthjd.class, IntrinsicMeasurable.read);
        getdiffer.serializer(addMenuItemui.class, InsetsListener.read);
        getdiffer.serializer(com.huawei.wisesecurity.ucs_credential.w.class, getAnimation.read);
        getdiffer.serializer(LocationEx.class, getMaximum.read);
        getdiffer.serializer(getRowCount.class, LayoutBoundsNoderectChanged1.serializer);
        getdiffer.serializer(accesslaunchWithCancellationSignal.class, forceUpdate.read);
        getdiffer.serializer(component3D9Ej5fM.class, GraphicLayerInfo.write);
        getdiffer.serializer(getMeasurable.class, HorizontalRuler.RemoteActionCompatParcelizer);
        getdiffer.serializer(r8lambdaI9S4Oy4uvsJFCZpX9_LGbxS5mDc.class, layoutBounds.read);
        getdiffer.serializer(RerouteDisabled.class, HorizontalAlignmentLine.read);
        getdiffer.serializer(InspectableValue.class, GraphicLayerInfoDefaultImpls.read);
        getdiffer.serializer(DefaultIntrinsicMeasurable.class, derived.serializer);
        getdiffer.serializer(computeFillWidthiLBOSCw.class, minOf.write);
        getdiffer.serializer(getHasRetrievedMethod.class, accessgetOwnerViewIdjd.write);
        getdiffer.serializer(onSessionStarted.class, HorizontalRulerCompanion.read);
        getdiffer.serializer(zzdr.class, HorizontalRulerCompanionminOf1.serializer);
        getdiffer.serializer(accessgetMaximumFlingVelocityjd.class, InnerRectRulers.RemoteActionCompatParcelizer);
        getdiffer.serializer(ViewRootForTest.class, getDurationMillis.serializer);
        getdiffer.serializer(FixedScale.class, InnermostAnimationProperties.RemoteActionCompatParcelizer);
        getdiffer.serializer(FixedCountSubcomposeSlotReusePolicy.class, stopAnimationForRuler.write);
        getdiffer.serializer(integerResource.class, updateInsetAnimationInfo.write);
        getdiffer.serializer(transformToAncestorEL8BTi8.class, HorizontalRulerCompanionmaxOf1.IconCompatParcelizer);
        getdiffer.serializer(placeAtf8xVGno.class, getFraction.serializer);
        getdiffer.serializer(zzdx.class, getTarget.write);
        getdiffer.serializer(setContainerDpSizeEaSLcWc.class, InnermostInsetsRulers.read);
        getdiffer.serializer(zznh.class, isPlaced.read);
        getdiffer.serializer(zzna.class, getHandle.IconCompatParcelizer);
        getdiffer.serializer(TypeUtilsKt.class, localPositionOfS_NoaFU.IconCompatParcelizer);
        getdiffer.serializer(zznd.class, getIntroducesMotionFrameOfReference.write);
        getdiffer.serializer(zznb.class, setLastBounds.serializer);
        getdiffer.serializer(zzng.class, LayoutKt.IconCompatParcelizer);
        getdiffer.serializer(movedefault.class, MultiMeasureLayout.serializer);
        getdiffer.serializer(SuggestionType$AlternativesUpdated.class, LayoutInfo_androidKt.IconCompatParcelizer);
        getdiffer.serializer(zznc.class, LayoutCoordinates.write);
        getdiffer.serializer(zznl.class, invokeDeg8D_g.read);
        getdiffer.serializer(zznk.class, accessmaxIntrinsicHeightjd.RemoteActionCompatParcelizer);
        getdiffer.serializer(RerouteStateExKt.class, LayoutKtmaterializerOf1.write);
        getdiffer.serializer(zzmq.class, modifierMaterializerOf.write);
        getdiffer.serializer(accessgetSwitchcp.class, accesslocalPositionOfS_NoaFUjd.write);
        getdiffer.serializer(TurfMisc.class, accesstransformToScreen58bKbWcjd.read);
        getdiffer.serializer(set_composeViewContext.class, getDisplayCutouts.write);
        getdiffer.serializer(zzki.class, setHolder.read);
        getdiffer.serializer(accessgetNodeToNodeStatep.class, accessgetIntroducesMotionFrameOfReferencejd.RemoteActionCompatParcelizer);
        getdiffer.serializer(getAccessibilityExtraKeysui.class, LayoutBoundsHolderKt.write);
        getdiffer.serializer(zzlc.class, getParentCoordinates.IconCompatParcelizer);
        getdiffer.serializer(accessgetSlotIdToNodep.class, getProvidedAlignmentLines.read);
        getdiffer.serializer(getParentData.class, areCompatible.IconCompatParcelizer);
        getdiffer.serializer(ignoreRemeasureRequests.class, LayoutKtMultiMeasureLayout11.write);
        getdiffer.serializer(zzmy.class, LayoutKtmaterializerOfWithCompositionLocalInjection1.serializer);
        getdiffer.serializer(zzmx.class, LayoutModifier.write);
        getdiffer.serializer(stringArrayResource.class, getComposeView.read);
        getdiffer.serializer(AssertionsKt.class, LayoutBoundsElement.RemoteActionCompatParcelizer);
        getdiffer.serializer(ComposeScrollCaptureCallback_androidKt.class, getHolder.read);
        getdiffer.serializer(accessgetNameFallbackjd.class, IntrinsicMinMax.RemoteActionCompatParcelizer);
        getdiffer.serializer(getSwitcho7Vup1c.class, localToWindowMKHz9U.write);
        getdiffer.serializer(zzli.class, LayoutCoordinatesKt.write);
        getdiffer.serializer(applyPausedPrecomposition.class, getIntroducesMotionFrameOfReferenceannotations.serializer);
        getdiffer.serializer(measureBRTryo0.class, maxOf.serializer);
        getdiffer.serializer(WindowInfoImpl.class, calculateCoordinateui.IconCompatParcelizer);
        getdiffer.serializer(createPrecomposedSlotHandle.class, LayoutInfo.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzmi.class, modifyParentData.RemoteActionCompatParcelizer);
        getdiffer.serializer(zzmg.class, setLayoutIdui.IconCompatParcelizer);
        getdiffer.serializer(disposeCurrentNodes.class, LayoutIdModifier.IconCompatParcelizer);
        getdiffer.serializer(WindowRecomposer_androidKt.class, isAnimating.serializer);
        getdiffer.serializer(getIndeterminate.class, isVisible.read);
        getdiffer.serializer(MapboxManeuverViewState$EXPANDED.class, materializerOf.read);
        getdiffer.serializer(disposeUnusedSlotsInApproach.class, combineAsVirtualLayouts.RemoteActionCompatParcelizer);
    }

    @Override // o.accessgetBrightnessDowncp
    public Object apply(Object obj) {
        return this.RemoteActionCompatParcelizer != 2 ? (byte[]) obj : (byte[]) obj;
    }
}
