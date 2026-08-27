package androidx.compose.foundation.pager;

import android.os.Trace;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.ah$$ExternalSyntheticLambda0;
import bo.app.n$$ExternalSyntheticLambda3;
import com.mapbox.navigation.core.MapboxNavigation;
import com.sentiance.okhttp3.internal.http2.e$h;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.AbstractApplier;
import o.AndroidContentCaptureManager;
import o.BaselineButtonTokens;
import o.BottomSheetScaffoldKtBottomSheetScaffoldLayout11;
import o.BrazeContentCardsManager;
import o.CheckboxTokens;
import o.ComposePausableCompositionExceptionoperationsSequence1;
import o.DragAndDropTargetModifierNode;
import o.ExtendedFabPrimaryTokens;
import o.ExtendedFabSmallTokens;
import o.GapComposerCompositionContextImpl;
import o.GapComposerKtExternalSyntheticLambda0;
import o.MotionEventAdapterIndirectPointerEventData;
import o.ParcelableSnapshotMutableIntState;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PullToRefreshModifierNodeupdate1;
import o.RecomposerrunRecomposeAndApplyChanges2;
import o.SelectionHandleIcon;
import o.SimpleItemTouchHelperCallback;
import o.SmallIconButtonTokens;
import o.SwitchKt;
import o.TextDelegateKt;
import o.TriStateCheckbox;
import o.VerticalScrollableClipShape;
import o.accessisRelatedToAutoCommit;
import o.animateToWithDecay;
import o.applyMeasureResultfoundation;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getBirthDateFull;
import o.getBrush;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLength;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getStringId9Hzcbyc;
import o.getUptimeimpl;
import o.instance_delegatelambda0;
import o.invokecomroadrunnerdeliveryonthewaycrowdsourcingtermspresentationTermsAndConditionsFragmentExternalSyntheticLambda1;
import o.invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationEntrancePictureFragmentExternalSyntheticLambda1;
import o.invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0;
import o.isAppSetIdReadingEnabled;
import o.isNotGestureActionfoundation;
import o.moveBydefault;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onHideTranslationui;
import o.onViewAttachedToWindow;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda7;
import o.removeNodeAtDepth;
import o.setNativeShader;
import o.snapElevation;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class LazyLayoutPagerKt {
    /* JADX WARN: Code duplicated, block: B:230:0x0318  */
    /* JADX WARN: Code duplicated, block: B:240:0x0331  */
    /* JADX WARN: Code duplicated, block: B:277:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:278:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:281:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:282:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:288:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:291:0x0422  */
    /* JADX WARN: Code duplicated, block: B:292:0x0424  */
    /* JADX WARN: Code duplicated, block: B:296:0x043b  */
    /* JADX WARN: Code duplicated, block: B:299:0x044e  */
    /* JADX WARN: Code duplicated, block: B:318:0x048f  */
    /* JADX WARN: Code duplicated, block: B:320:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:323:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:324:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:326:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:327:0x04df  */
    /* JADX INFO: renamed from: Pager-eLwUrMk, reason: not valid java name */
    public static final void m94PagereLwUrMk(final Modifier modifier, final PagerState pagerState, final SwitchKt switchKt, final SelectionHandleIcon selectionHandleIcon, final SnapFlingBehavior snapFlingBehavior, final boolean z, final isNotGestureActionfoundation isnotgestureactionfoundation, final float f, final GapComposerCompositionContextImpl gapComposerCompositionContextImpl, final NestedScrollConnection nestedScrollConnection, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout11, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode2;
        getPostalCode getpostalcode;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        AndroidContentCaptureManager androidContentCaptureManager;
        int i7;
        boolean z4;
        boolean z5;
        Object objComponentActivity;
        getStringId9Hzcbyc getstringid9hzcbyc;
        LayoutDirection layoutDirection;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objComponentActivity2;
        Modifier modifierIconCompatParcelizer;
        Modifier modifierWrite;
        boolean z9;
        Modifier modifierThen;
        boolean z10;
        boolean z11;
        Object objComponentActivity3;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-572816025);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.read(pagerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.read(switchKt) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.write(false) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.read(selectionHandleIcon.ordinal()) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= getpostalcode2.read(snapFlingBehavior) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= getpostalcode2.write(z) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= getpostalcode2.read(isnotgestureactionfoundation) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= getpostalcode2.read(0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= getpostalcode2.serializer(f) ? 536870912 : 268435456;
        }
        int i8 = i3;
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode2.read(gapComposerCompositionContextImpl) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(nestedScrollConnection) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i4 |= getpostalcode2.read(horizontal) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i4 |= getpostalcode2.read(vertical) ? Fields.Clip : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= getpostalcode2.read(bottomSheetScaffoldKtBottomSheetScaffoldLayout11) ? Fields.RenderEffect : 65536;
        }
        if ((i2 & 1572864) == 0) {
            dragAndDropTargetModifierNode2 = dragAndDropTargetModifierNode;
            i4 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? 1048576 : Fields.BlendMode;
        } else {
            dragAndDropTargetModifierNode2 = dragAndDropTargetModifierNode;
        }
        if (getpostalcode2.write(i8 & 1, ((i8 & 306783379) == 306783378 && (599187 & i4) == 599186) ? false : true)) {
            int i9 = i8 & 112;
            boolean z12 = i9 == 32;
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (z12 || objComponentActivity4 == androidContentCaptureManager2) {
                objComponentActivity4 = new RecomposerrunRecomposeAndApplyChanges2(pagerState, 1);
                getpostalcode2.write(objComponentActivity4);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4;
            int i10 = i8 >> 3;
            int i11 = i10 & 14;
            int i12 = i4 >> 15;
            int i13 = i11 | (i12 & 112) | (i4 & 896);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(dragAndDropTargetModifierNode2, getpostalcode2);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer2 = CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode2);
            boolean z13 = (((i13 & 14) ^ 6) > 4 && getpostalcode2.read(pagerState)) || (i13 & 6) == 4;
            boolean z14 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
            boolean z15 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer2);
            boolean z16 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if ((z13 | z14 | z15 | z16) || objComponentActivity5 == androidContentCaptureManager2) {
                AndroidContentCaptureManager androidContentCaptureManager3 = AndroidContentCaptureManager.read;
                objComponentActivity5 = new MapboxNavigation.AnonymousClass10(0, 2, onViewAttachedToWindow.class, CompositionKt.serializer(androidContentCaptureManager3, new ah$$ExternalSyntheticLambda0(CompositionKt.serializer(androidContentCaptureManager3, new n$$ExternalSyntheticLambda3(populateViewStructure_androidKtpopulate7Serializer, populateViewStructure_androidKtpopulate7Serializer2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 3)), 5, pagerState)), "value", "getValue()Ljava/lang/Object;");
                getpostalcode2.write(objComponentActivity5);
            }
            final registerInAppMessageManagerlambda7 registerinappmessagemanagerlambda7 = (registerInAppMessageManagerlambda7) objComponentActivity5;
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (objComponentActivity6 == androidContentCaptureManager2) {
                objComponentActivity6 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity6);
            }
            final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity6;
            boolean z17 = i9 == 32;
            Object objComponentActivity7 = getpostalcode2.ComponentActivity();
            if (z17 || objComponentActivity7 == androidContentCaptureManager2) {
                objComponentActivity7 = new RecomposerrunRecomposeAndApplyChanges2(pagerState, 2);
                getpostalcode2.write(objComponentActivity7);
            }
            final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            int i14 = i8 >> 9;
            int i15 = i4 << 15;
            int i16 = (i14 & 3670016) | (i8 & 65520) | (458752 & i14) | ((i4 << 21) & 29360128) | (234881024 & i15) | (1879048192 & i15);
            boolean z18 = (((i16 & 112) ^ 48) > 32 && getpostalcode2.read(pagerState)) || (i16 & 48) == 32;
            boolean z19 = (((i16 & 896) ^ 384) > 256 && getpostalcode2.read(switchKt)) || (i16 & 384) == 256;
            boolean z20 = (((i16 & 7168) ^ 3072) > 2048 && getpostalcode2.write(false)) || (i16 & 3072) == 2048;
            boolean z21 = (((57344 & i16) ^ 24576) > 16384 && getpostalcode2.read(selectionHandleIcon.ordinal())) || (i16 & 24576) == 16384;
            boolean z22 = (((234881024 & i16) ^ 100663296) > 67108864 && getpostalcode2.read(horizontal)) || (i16 & 100663296) == 67108864;
            boolean z23 = (((1879048192 & i16) ^ 805306368) > 536870912 && getpostalcode2.read(vertical)) || (i16 & 805306368) == 536870912;
            boolean z24 = (((3670016 & i16) ^ 1572864) > 1048576 && getpostalcode2.serializer(f)) || (i16 & 1572864) == 1048576;
            if (((29360128 & i16) ^ 12582912) > 8388608 && getpostalcode2.read(gapComposerCompositionContextImpl)) {
                z2 = true;
            } else if ((i16 & 12582912) == 8388608) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((i12 & 14) ^ 6) > 4 && getpostalcode2.read(bottomSheetScaffoldKtBottomSheetScaffoldLayout11)) {
                z3 = true;
            } else if ((i12 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z25 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            boolean z26 = (((i16 & 458752) ^ 196608) > 131072 && getpostalcode2.read(0)) || (i16 & 196608) == 131072;
            boolean z27 = getpostalcode2.read(getcontentviewgroupparentlayout);
            Object objComponentActivity8 = getpostalcode2.ComponentActivity();
            if (((z26 | z21 | z18 | z19 | z20 | z22 | z23 | z24 | z2 | z3 | z25) || z27) || objComponentActivity8 == androidContentCaptureManager2) {
                i5 = 4;
                i6 = i9;
                objComponentActivity8 = new CheckboxTokens() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                    @Override // o.CheckboxTokens
                    /* JADX INFO: renamed from: measure-0kLqBqw */
                    public final MeasureResult mo89measure0kLqBqw(BaselineButtonTokens baselineButtonTokens, long j) {
                        int iMo42roundToPx0680j_4;
                        int iMo42roundToPx0680j_5;
                        int iM3626getMaxWidthimpl;
                        int i17;
                        int i18;
                        Alignment.Vertical vertical2;
                        int i19;
                        Alignment.Horizontal horizontal2;
                        int i20;
                        int i21;
                        int i22;
                        BrazeContentCardsManager brazeContentCardsManager;
                        int i23;
                        int i24;
                        int i25;
                        int i26;
                        int i27;
                        int i28;
                        MeasuredPage measuredPage;
                        int i29;
                        int i30;
                        int i31;
                        int i32;
                        int i33;
                        MeasuredPage measuredPage2;
                        int i34;
                        int i35;
                        int i36;
                        ArrayList arrayList;
                        int i37;
                        int i38;
                        int i39;
                        List list;
                        int i40;
                        ArrayList arrayList2;
                        int i41;
                        SubcomposeMeasureScope subcomposeMeasureScope;
                        int i42;
                        ArrayList arrayList3;
                        List list2;
                        Object obj;
                        int i43;
                        int i44;
                        BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout12;
                        int i45;
                        SubcomposeMeasureScope subcomposeMeasureScope2;
                        PagerMeasureResult pagerMeasureResult;
                        int i46;
                        BrazeContentCardsManager brazeContentCardsManager2;
                        PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 = this;
                        SubcomposeMeasureScope subcomposeMeasureScope3 = baselineButtonTokens.RemoteActionCompatParcelizer;
                        PagerState pagerState2 = pagerState;
                        pagerState2.ResultReceiver.getValue();
                        SelectionHandleIcon selectionHandleIcon2 = SelectionHandleIcon.Vertical;
                        SelectionHandleIcon selectionHandleIcon3 = selectionHandleIcon;
                        boolean z28 = selectionHandleIcon3 == selectionHandleIcon2;
                        getUptimeimpl.serializer(j, z28 ? selectionHandleIcon2 : SelectionHandleIcon.Horizontal);
                        SwitchKt switchKt2 = switchKt;
                        if (z28) {
                            iMo42roundToPx0680j_4 = subcomposeMeasureScope3.mo42roundToPx0680j_4(switchKt2.read(subcomposeMeasureScope3.getLayoutDirection()));
                        } else {
                            iMo42roundToPx0680j_4 = subcomposeMeasureScope3.mo42roundToPx0680j_4(PaddingKt.serializer(switchKt2, subcomposeMeasureScope3.getLayoutDirection()));
                        }
                        if (z28) {
                            iMo42roundToPx0680j_5 = subcomposeMeasureScope3.mo42roundToPx0680j_4(switchKt2.write(subcomposeMeasureScope3.getLayoutDirection()));
                        } else {
                            iMo42roundToPx0680j_5 = subcomposeMeasureScope3.mo42roundToPx0680j_4(PaddingKt.IconCompatParcelizer(switchKt2, subcomposeMeasureScope3.getLayoutDirection()));
                        }
                        int iMo42roundToPx0680j_6 = subcomposeMeasureScope3.mo42roundToPx0680j_4(switchKt2.IconCompatParcelizer());
                        int iMo42roundToPx0680j_7 = subcomposeMeasureScope3.mo42roundToPx0680j_4(switchKt2.RemoteActionCompatParcelizer()) + iMo42roundToPx0680j_6;
                        int i47 = iMo42roundToPx0680j_4 + iMo42roundToPx0680j_5;
                        int i48 = z28 ? iMo42roundToPx0680j_7 : i47;
                        if (z28) {
                            iMo42roundToPx0680j_5 = iMo42roundToPx0680j_6;
                        } else if (!z28) {
                            iMo42roundToPx0680j_5 = iMo42roundToPx0680j_4;
                        }
                        int i49 = i48 - iMo42roundToPx0680j_5;
                        long jM3645offsetNN6EwU = ConstraintsKt.m3645offsetNN6EwU(j, -i47, -iMo42roundToPx0680j_7);
                        pagerState2.MediaMetadataCompat = baselineButtonTokens;
                        int iMo42roundToPx0680j_8 = subcomposeMeasureScope3.mo42roundToPx0680j_4(f);
                        if (z28) {
                            iM3626getMaxWidthimpl = Constraints.m3625getMaxHeightimpl(j) - iMo42roundToPx0680j_7;
                        } else {
                            iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j) - i47;
                        }
                        int i50 = iMo42roundToPx0680j_7;
                        long jM3795constructorimpl = IntOffset.m3795constructorimpl((((long) iMo42roundToPx0680j_6) & 4294967295L) | (((long) iMo42roundToPx0680j_4) << 32));
                        gapComposerCompositionContextImpl.getClass();
                        int i51 = iM3626getMaxWidthimpl < 0 ? 0 : iM3626getMaxWidthimpl;
                        ConstraintsKt.Constraints$default(0, selectionHandleIcon3 == selectionHandleIcon2 ? Constraints.m3626getMaxWidthimpl(jM3645offsetNN6EwU) : i51, 0, selectionHandleIcon3 != selectionHandleIcon2 ? Constraints.m3625getMaxHeightimpl(jM3645offsetNN6EwU) : i51, 5, null);
                        GapComposerKtExternalSyntheticLambda0 gapComposerKtExternalSyntheticLambda0 = (GapComposerKtExternalSyntheticLambda0) registerinappmessagemanagerlambda7.invoke();
                        int i52 = iM3626getMaxWidthimpl + iMo42roundToPx0680j_5 + i49;
                        BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout13 = bottomSheetScaffoldKtBottomSheetScaffoldLayout11;
                        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
                        int i53 = iM3626getMaxWidthimpl;
                        try {
                            e$h e_h = pagerState2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                            int i54 = i47;
                            int iRemoteActionCompatParcelizer = e_h.RemoteActionCompatParcelizer();
                            long j2 = jM3645offsetNN6EwU;
                            int i55 = moveBydefault.read(iRemoteActionCompatParcelizer, gapComposerKtExternalSyntheticLambda0, e_h.serializer);
                            if (iRemoteActionCompatParcelizer != i55) {
                                ((onHideTranslationui) ((getPlatformAndroidManager) e_h.read)).serializer(i55);
                                ((ExtendedFabSmallTokens) e_h.IconCompatParcelizer).IconCompatParcelizer(iRemoteActionCompatParcelizer);
                            }
                            e_h.RemoteActionCompatParcelizer();
                            float fIconCompatParcelizer = e_h.IconCompatParcelizer();
                            pagerState2.read();
                            int i56 = i49;
                            int i57 = i51 + iMo42roundToPx0680j_8;
                            int i58 = i52;
                            int iWrite = MathKt.write(bottomSheetScaffoldKtBottomSheetScaffoldLayout13.serializer(i52, i51, iMo42roundToPx0680j_5, i56) - (fIconCompatParcelizer * i57));
                            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                            MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer(gapComposerKtExternalSyntheticLambda0, pagerState2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, pagerState2.MediaSessionCompatQueueItem);
                            animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
                            animateToWithDecay animatetowithdecay2 = new animateToWithDecay();
                            int iIntValue = ((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke()).intValue();
                            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = pagerState2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (iMo42roundToPx0680j_5 < 0) {
                                TriStateCheckbox.read("negative beforeContentPadding");
                            }
                            if (i56 < 0) {
                                TriStateCheckbox.read("negative afterContentPadding");
                            }
                            int i59 = i57 < 0 ? 0 : i57;
                            int i60 = iIntValue < 0 ? iIntValue : 0;
                            SelectionHandleIcon selectionHandleIcon4 = selectionHandleIcon;
                            long jConstraints$default = ConstraintsKt.Constraints$default(0, selectionHandleIcon4 == selectionHandleIcon2 ? Constraints.m3626getMaxWidthimpl(j2) : i51, 0, selectionHandleIcon4 != selectionHandleIcon2 ? Constraints.m3625getMaxHeightimpl(j2) : i51, 5, null);
                            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                            BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout14 = bottomSheetScaffoldKtBottomSheetScaffoldLayout11;
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            if (iIntValue <= 0) {
                                pagerMeasureResult = new PagerMeasureResult(i51, iMo42roundToPx0680j_8, i56, selectionHandleIcon4, -iMo42roundToPx0680j_5, i53 + i56, i60, bottomSheetScaffoldKtBottomSheetScaffoldLayout14, subcomposeMeasureScope3.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, Constraints.m3628getMinWidthimpl(j2) + i54), ConstraintsKt.m3642constrainHeightK40F9xA(j, Constraints.m3627getMinHeightimpl(j2) + i50), simpleItemTouchHelperCallback, new accessisRelatedToAutoCommit(20)), getcontentviewgroupparentlayout2, baselineButtonTokens, jConstraints$default);
                                subcomposeMeasureScope2 = subcomposeMeasureScope3;
                            } else {
                                while (i55 > 0 && iWrite > 0) {
                                    i55--;
                                    iWrite -= i59;
                                }
                                int i61 = iWrite * (-1);
                                if (i55 >= iIntValue) {
                                    i55 = iIntValue - 1;
                                    i61 = 0;
                                }
                                BrazeContentCardsManager brazeContentCardsManager3 = new BrazeContentCardsManager();
                                int i62 = -iMo42roundToPx0680j_5;
                                if (iMo42roundToPx0680j_8 < 0) {
                                    i18 = iMo42roundToPx0680j_8;
                                    i17 = i18;
                                } else {
                                    i17 = iMo42roundToPx0680j_8;
                                    i18 = 0;
                                }
                                int i63 = i62 + i18;
                                int i64 = i62;
                                int iMax = 0;
                                int i65 = i55;
                                int i66 = i61 + i63;
                                int i67 = i65;
                                while (true) {
                                    vertical2 = vertical;
                                    i19 = i51;
                                    horizontal2 = horizontal;
                                    if (i66 >= 0 || i67 <= 0) {
                                        break;
                                    }
                                    int i68 = i67 - 1;
                                    SimpleItemTouchHelperCallback simpleItemTouchHelperCallback2 = simpleItemTouchHelperCallback;
                                    i67 = i68;
                                    int i69 = i59;
                                    BrazeContentCardsManager brazeContentCardsManager4 = brazeContentCardsManager3;
                                    i51 = i19;
                                    MeasuredPage measuredPageWrite = ParcelableSnapshotMutableIntState.write(baselineButtonTokens, i67, jConstraints$default, gapComposerKtExternalSyntheticLambda0, jM3795constructorimpl, selectionHandleIcon4, horizontal2, vertical2, subcomposeMeasureScope3.getLayoutDirection(), false, i51, animatetowithdecay2);
                                    brazeContentCardsManager4.add(0, measuredPageWrite);
                                    iMax = Math.max(iMax, measuredPageWrite.IconCompatParcelizer);
                                    i66 += i69;
                                    brazeContentCardsManager3 = brazeContentCardsManager4;
                                    i59 = i69;
                                    i63 = i63;
                                    getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout2;
                                    selectionHandleIcon4 = selectionHandleIcon4;
                                    simpleItemTouchHelperCallback = simpleItemTouchHelperCallback2;
                                    i64 = i64;
                                    i57 = i57;
                                    i60 = i60;
                                    iMo42roundToPx0680j_5 = iMo42roundToPx0680j_5;
                                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate7;
                                    iIntValue = iIntValue;
                                    j2 = j2;
                                    bottomSheetScaffoldKtBottomSheetScaffoldLayout14 = bottomSheetScaffoldKtBottomSheetScaffoldLayout14;
                                    i56 = i56;
                                    pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 = this;
                                    i50 = i50;
                                    i54 = i54;
                                    i53 = i53;
                                    i58 = i58;
                                }
                                int i70 = i60;
                                int i71 = i57;
                                int i72 = i59;
                                int i73 = iMo42roundToPx0680j_5;
                                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                                int i74 = iIntValue;
                                int i75 = i56;
                                BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout15 = bottomSheetScaffoldKtBottomSheetScaffoldLayout14;
                                SelectionHandleIcon selectionHandleIcon5 = selectionHandleIcon4;
                                int i76 = i58;
                                int i77 = i50;
                                int i78 = i53;
                                int i79 = i54;
                                long j3 = j2;
                                List list3 = r15;
                                int i80 = iMax;
                                int i81 = i63;
                                SimpleItemTouchHelperCallback simpleItemTouchHelperCallback3 = simpleItemTouchHelperCallback;
                                BrazeContentCardsManager brazeContentCardsManager5 = brazeContentCardsManager3;
                                int i82 = i64;
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                                int i83 = i81;
                                if (i66 < i83) {
                                    i66 = i83;
                                }
                                int i84 = i66 - i83;
                                int i85 = i75;
                                int i86 = i78 + i85;
                                int i87 = i86 < 0 ? 0 : i86;
                                int i88 = -i84;
                                int i89 = i67;
                                int i90 = 0;
                                boolean z29 = false;
                                while (i90 < brazeContentCardsManager5.RemoteActionCompatParcelizer) {
                                    if (i88 >= i87) {
                                        brazeContentCardsManager5.IconCompatParcelizer(i90);
                                        z29 = true;
                                    } else {
                                        i89++;
                                        i88 += i72;
                                        i90++;
                                    }
                                }
                                int i91 = i67;
                                int i92 = i80;
                                boolean z30 = z29;
                                int i93 = i84;
                                int i94 = i74;
                                int i95 = i88;
                                while (i89 < i94 && (i95 < i87 || i95 <= 0 || brazeContentCardsManager5.isEmpty())) {
                                    BrazeContentCardsManager brazeContentCardsManager6 = brazeContentCardsManager5;
                                    int i96 = i94;
                                    int i97 = i72;
                                    int i98 = i89;
                                    int i99 = i92;
                                    int i100 = i87;
                                    int i101 = i95;
                                    int i102 = i85;
                                    int i103 = i83;
                                    Alignment.Vertical vertical3 = vertical2;
                                    Alignment.Horizontal horizontal3 = horizontal2;
                                    MeasuredPage measuredPageWrite2 = ParcelableSnapshotMutableIntState.write(baselineButtonTokens, i89, jConstraints$default, gapComposerKtExternalSyntheticLambda0, jM3795constructorimpl, selectionHandleIcon5, horizontal2, vertical2, subcomposeMeasureScope3.getLayoutDirection(), false, i19, animatetowithdecay2);
                                    int i104 = i96 - 1;
                                    i95 = i101 + (i98 == i104 ? i19 : i97);
                                    if (i95 > i103 || i98 == i104) {
                                        int iMax2 = Math.max(i99, measuredPageWrite2.IconCompatParcelizer);
                                        brazeContentCardsManager2 = brazeContentCardsManager6;
                                        brazeContentCardsManager2.addLast(measuredPageWrite2);
                                        i92 = iMax2;
                                    } else {
                                        i93 -= i97;
                                        i91 = i98 + 1;
                                        brazeContentCardsManager2 = brazeContentCardsManager6;
                                        i92 = i99;
                                        z30 = true;
                                    }
                                    i89 = i98 + 1;
                                    i94 = i96;
                                    i83 = i103;
                                    brazeContentCardsManager5 = brazeContentCardsManager2;
                                    vertical2 = vertical3;
                                    horizontal2 = horizontal3;
                                    i72 = i97;
                                    i87 = i100;
                                    i85 = i102;
                                }
                                BrazeContentCardsManager brazeContentCardsManager7 = brazeContentCardsManager5;
                                int i105 = i72;
                                int i106 = i94;
                                int i107 = i89;
                                int i108 = i92;
                                int i109 = i95;
                                int i110 = i85;
                                Alignment.Vertical vertical4 = vertical2;
                                Alignment.Horizontal horizontal4 = horizontal2;
                                int i111 = i78;
                                if (i109 < i111) {
                                    int i112 = i111 - i109;
                                    int i113 = i109 + i112;
                                    int iMax3 = i108;
                                    int i114 = i93 - i112;
                                    int i115 = i73;
                                    while (i114 < i115 && i91 > 0) {
                                        i91--;
                                        int i116 = i106;
                                        BrazeContentCardsManager brazeContentCardsManager8 = brazeContentCardsManager7;
                                        MeasuredPage measuredPageWrite3 = ParcelableSnapshotMutableIntState.write(baselineButtonTokens, i91, jConstraints$default, gapComposerKtExternalSyntheticLambda0, jM3795constructorimpl, selectionHandleIcon5, horizontal4, vertical4, subcomposeMeasureScope3.getLayoutDirection(), false, i19, animatetowithdecay2);
                                        brazeContentCardsManager8.add(0, measuredPageWrite3);
                                        iMax3 = Math.max(iMax3, measuredPageWrite3.IconCompatParcelizer);
                                        i114 += i105;
                                        brazeContentCardsManager7 = brazeContentCardsManager8;
                                        i107 = i107;
                                        i106 = i116;
                                        i115 = i115;
                                        i111 = i111;
                                    }
                                    i20 = i106;
                                    i21 = i107;
                                    i23 = i115;
                                    int i117 = i114;
                                    i26 = iMax3;
                                    i22 = i111;
                                    brazeContentCardsManager = brazeContentCardsManager7;
                                    i24 = 0;
                                    if (i117 < 0) {
                                        i25 = i113 + i117;
                                        i27 = 0;
                                    } else {
                                        i25 = i113;
                                        i27 = i117;
                                    }
                                } else {
                                    i20 = i106;
                                    i21 = i107;
                                    i22 = i111;
                                    brazeContentCardsManager = brazeContentCardsManager7;
                                    i23 = i73;
                                    i24 = 0;
                                    i25 = i109;
                                    i26 = i108;
                                    i27 = i93;
                                }
                                if (i27 < 0) {
                                    TriStateCheckbox.read("invalid currentFirstPageScrollOffset");
                                }
                                int i118 = -i27;
                                MeasuredPage measuredPage3 = (MeasuredPage) brazeContentCardsManager.read();
                                int i119 = i23;
                                if (i119 > 0 || i17 < 0) {
                                    int iIconCompatParcelizer = brazeContentCardsManager.IconCompatParcelizer();
                                    int i120 = i27;
                                    int i121 = i24;
                                    while (true) {
                                        if (i121 >= iIconCompatParcelizer || i120 == 0) {
                                            i28 = i105;
                                            break;
                                        }
                                        i28 = i105;
                                        if (i28 > i120) {
                                            break;
                                            break;
                                        }
                                        if (i121 == brazeContentCardsManager.IconCompatParcelizer() - 1) {
                                            break;
                                        }
                                        i120 -= i28;
                                        i121++;
                                        measuredPage3 = (MeasuredPage) brazeContentCardsManager.get(i121);
                                        i105 = i28;
                                    }
                                    measuredPage = measuredPage3;
                                    i29 = i120;
                                } else {
                                    i29 = i27;
                                    i28 = i105;
                                    measuredPage = measuredPage3;
                                }
                                int iMax4 = Math.max(i24, i91 - i70);
                                int i122 = i91 - 1;
                                if (iMax4 <= i122) {
                                    int i123 = i122;
                                    ArrayList arrayList4 = null;
                                    while (true) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        int i124 = i123;
                                        i31 = i70;
                                        i33 = i28;
                                        measuredPage2 = measuredPage;
                                        i30 = i26;
                                        i34 = i119;
                                        i35 = i118;
                                        i36 = i25;
                                        arrayList = arrayList4;
                                        arrayList.add(ParcelableSnapshotMutableIntState.write(baselineButtonTokens, i123, jConstraints$default, gapComposerKtExternalSyntheticLambda0, jM3795constructorimpl, selectionHandleIcon5, horizontal4, vertical4, subcomposeMeasureScope3.getLayoutDirection(), false, i19, animatetowithdecay2));
                                        i32 = iMax4;
                                        if (i124 == i32) {
                                            break;
                                        }
                                        i123 = i124 - 1;
                                        i118 = i35;
                                        arrayList4 = arrayList;
                                        iMax4 = i32;
                                        i26 = i30;
                                        i119 = i34;
                                        i70 = i31;
                                        i28 = i33;
                                        measuredPage = measuredPage2;
                                        i25 = i36;
                                    }
                                } else {
                                    i30 = i26;
                                    i31 = i70;
                                    i32 = iMax4;
                                    i33 = i28;
                                    measuredPage2 = measuredPage;
                                    i34 = i119;
                                    i35 = i118;
                                    i36 = i25;
                                    arrayList = null;
                                }
                                List list4 = list3;
                                int size = list4.size();
                                int i125 = 0;
                                while (i125 < size) {
                                    int iIntValue2 = ((Number) list3.get(i125)).intValue();
                                    if (iIntValue2 < i32) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList = arrayList;
                                        arrayList.add(ParcelableSnapshotMutableIntState.write(baselineButtonTokens, iIntValue2, jConstraints$default, gapComposerKtExternalSyntheticLambda0, jM3795constructorimpl, selectionHandleIcon5, horizontal4, vertical4, subcomposeMeasureScope3.getLayoutDirection(), false, i19, animatetowithdecay2));
                                    }
                                    i125++;
                                    size = size;
                                    i32 = i32;
                                    list3 = list3;
                                }
                                List list5 = list3;
                                List list6 = instance_delegatelambda0.write;
                                List list7 = arrayList == null ? list6 : arrayList;
                                List list8 = list7;
                                int size2 = list8.size();
                                int iMax5 = i30;
                                for (int i126 = 0; i126 < size2; i126++) {
                                    iMax5 = Math.max(iMax5, ((MeasuredPage) list7.get(i126)).IconCompatParcelizer);
                                }
                                int i127 = ((MeasuredPage) brazeContentCardsManager.serializer()).RemoteActionCompatParcelizer;
                                boolean z31 = true;
                                int i128 = i31;
                                int iMin = Math.min(i128, (i20 - i127) - 1) + i127;
                                int i129 = i127 + 1;
                                if (i129 <= iMin) {
                                    int i130 = i129;
                                    ArrayList arrayList5 = null;
                                    while (true) {
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        int i131 = i130;
                                        i38 = i128;
                                        i37 = i35;
                                        boolean z32 = z31;
                                        i39 = iMax5;
                                        list = list7;
                                        arrayList2 = arrayList5;
                                        arrayList2.add(ParcelableSnapshotMutableIntState.write(baselineButtonTokens, i130, jConstraints$default, gapComposerKtExternalSyntheticLambda0, jM3795constructorimpl, selectionHandleIcon5, horizontal4, vertical4, subcomposeMeasureScope3.getLayoutDirection(), false, i19, animatetowithdecay2));
                                        i40 = iMin;
                                        if (i131 == i40) {
                                            break;
                                        }
                                        i130 = i131 + 1;
                                        z31 = z32;
                                        arrayList5 = arrayList2;
                                        iMin = i40;
                                        i35 = i37;
                                        iMax5 = i39;
                                        i128 = i38;
                                        list7 = list;
                                    }
                                } else {
                                    i37 = i35;
                                    i38 = i128;
                                    i39 = iMax5;
                                    list = list7;
                                    i40 = iMin;
                                    arrayList2 = null;
                                }
                                int size3 = list4.size();
                                int i132 = 0;
                                while (i132 < size3) {
                                    List list9 = list5;
                                    int iIntValue3 = ((Number) list9.get(i132)).intValue();
                                    if (i40 + 1 <= iIntValue3) {
                                        int i133 = i20;
                                        if (iIntValue3 < i133) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            ArrayList arrayList6 = arrayList2;
                                            i46 = i133;
                                            arrayList6.add(ParcelableSnapshotMutableIntState.write(baselineButtonTokens, iIntValue3, jConstraints$default, gapComposerKtExternalSyntheticLambda0, jM3795constructorimpl, selectionHandleIcon5, horizontal4, vertical4, subcomposeMeasureScope3.getLayoutDirection(), false, i19, animatetowithdecay2));
                                            arrayList2 = arrayList6;
                                        } else {
                                            i46 = i133;
                                        }
                                    } else {
                                        i46 = i20;
                                    }
                                    i132++;
                                    size3 = size3;
                                    list5 = list9;
                                    i40 = i40;
                                    i20 = i46;
                                }
                                int i134 = i20;
                                List list10 = arrayList2 == null ? list6 : arrayList2;
                                List list11 = list10;
                                int size4 = list11.size();
                                int iMax6 = i39;
                                for (int i135 = 0; i135 < size4; i135++) {
                                    iMax6 = Math.max(iMax6, ((MeasuredPage) list10.get(i135)).IconCompatParcelizer);
                                }
                                MeasuredPage measuredPage4 = measuredPage2;
                                boolean z33 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{measuredPage4, brazeContentCardsManager.read()}, getCieXyz.write())).booleanValue() && list.isEmpty() && list10.isEmpty();
                                SelectionHandleIcon selectionHandleIcon6 = SelectionHandleIcon.Vertical;
                                int iM3643constrainWidthK40F9xA = ConstraintsKt.m3643constrainWidthK40F9xA(j3, selectionHandleIcon5 == selectionHandleIcon6 ? iMax6 : i36);
                                if (selectionHandleIcon5 == selectionHandleIcon6) {
                                    iMax6 = i36;
                                }
                                int iM3642constrainHeightK40F9xA = ConstraintsKt.m3642constrainHeightK40F9xA(j3, iMax6);
                                int i136 = selectionHandleIcon5 == selectionHandleIcon6 ? iM3642constrainHeightK40F9xA : iM3643constrainWidthK40F9xA;
                                int i137 = i22;
                                int i138 = i36;
                                boolean z34 = i138 < Math.min(i136, i137);
                                if (!z34 || i37 == 0) {
                                    i41 = i37;
                                } else {
                                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                                    i41 = i37;
                                    sb.append(i41);
                                    TriStateCheckbox.RemoteActionCompatParcelizer(sb.toString());
                                }
                                ArrayList arrayList7 = new ArrayList(list10.size() + list.size() + brazeContentCardsManager.IconCompatParcelizer());
                                if (z34) {
                                    if (!list.isEmpty() || !list10.isEmpty()) {
                                        TriStateCheckbox.read("No extra pages");
                                    }
                                    int iIconCompatParcelizer2 = brazeContentCardsManager.IconCompatParcelizer();
                                    int[] iArr = new int[iIconCompatParcelizer2];
                                    for (int i139 = 0; i139 < iIconCompatParcelizer2; i139++) {
                                        iArr[i139] = i19;
                                    }
                                    int[] iArr2 = new int[iIconCompatParcelizer2];
                                    subcomposeMeasureScope = subcomposeMeasureScope3;
                                    i42 = 0;
                                    snapElevation snapelevation = new snapElevation(subcomposeMeasureScope.mo45toDpu2uoSUM(i17), false, null);
                                    if (selectionHandleIcon5 == SelectionHandleIcon.Vertical) {
                                        snapelevation.read(baselineButtonTokens, i136, iArr, iArr2);
                                    } else {
                                        snapelevation.RemoteActionCompatParcelizer(baselineButtonTokens, i136, iArr, LayoutDirection.Ltr, iArr2);
                                    }
                                    ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(iArr2);
                                    int i140 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.write;
                                    int i141 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.read;
                                    int i142 = ensuresubscribedtoinappmessageeventslambda7RemoteActionCompatParcelizer.serializer;
                                    if ((i142 > 0 && i140 <= i141) || (i142 < 0 && i141 <= i140)) {
                                        while (true) {
                                            int i143 = iArr2[i140];
                                            MeasuredPage measuredPage5 = (MeasuredPage) brazeContentCardsManager.get(i140);
                                            measuredPage5.position(i143, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA);
                                            arrayList7.add(measuredPage5);
                                            if (i140 == i141) {
                                                break;
                                            }
                                            i140 += i142;
                                        }
                                    }
                                } else {
                                    subcomposeMeasureScope = subcomposeMeasureScope3;
                                    i17 = i17;
                                    i42 = 0;
                                    int size5 = list8.size();
                                    int i144 = i41;
                                    for (int i145 = 0; i145 < size5; i145++) {
                                        MeasuredPage measuredPage6 = (MeasuredPage) list.get(i145);
                                        i144 -= i71;
                                        measuredPage6.position(i144, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA);
                                        arrayList7.add(measuredPage6);
                                    }
                                    int iIconCompatParcelizer3 = brazeContentCardsManager.IconCompatParcelizer();
                                    int i146 = i41;
                                    for (int i147 = 0; i147 < iIconCompatParcelizer3; i147++) {
                                        MeasuredPage measuredPage7 = (MeasuredPage) brazeContentCardsManager.get(i147);
                                        measuredPage7.position(i146, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA);
                                        arrayList7.add(measuredPage7);
                                        i146 += i71;
                                    }
                                    int size6 = list11.size();
                                    for (int i148 = 0; i148 < size6; i148++) {
                                        MeasuredPage measuredPage8 = (MeasuredPage) list10.get(i148);
                                        measuredPage8.position(i146, iM3643constrainWidthK40F9xA, iM3642constrainHeightK40F9xA);
                                        arrayList7.add(measuredPage8);
                                        i146 += i71;
                                    }
                                }
                                if (z33) {
                                    arrayList3 = arrayList7;
                                } else {
                                    arrayList3 = new ArrayList(arrayList7.size());
                                    int size7 = arrayList7.size();
                                    for (int i149 = i42; i149 < size7; i149++) {
                                        Object obj2 = arrayList7.get(i149);
                                        MeasuredPage measuredPage9 = (MeasuredPage) obj2;
                                        if (measuredPage9.RemoteActionCompatParcelizer >= ((MeasuredPage) brazeContentCardsManager.read()).RemoteActionCompatParcelizer && measuredPage9.RemoteActionCompatParcelizer <= ((MeasuredPage) brazeContentCardsManager.serializer()).RemoteActionCompatParcelizer) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    list2 = list6;
                                } else {
                                    ArrayList arrayList8 = new ArrayList(arrayList7.size());
                                    int size8 = arrayList7.size();
                                    for (int i150 = i42; i150 < size8; i150++) {
                                        Object obj3 = arrayList7.get(i150);
                                        if (((MeasuredPage) obj3).RemoteActionCompatParcelizer < ((MeasuredPage) brazeContentCardsManager.read()).RemoteActionCompatParcelizer) {
                                            arrayList8.add(obj3);
                                        }
                                    }
                                    list2 = arrayList8;
                                }
                                if (!list10.isEmpty()) {
                                    ArrayList arrayList9 = new ArrayList(arrayList7.size());
                                    int size9 = arrayList7.size();
                                    for (int i151 = i42; i151 < size9; i151++) {
                                        Object obj4 = arrayList7.get(i151);
                                        if (((MeasuredPage) obj4).RemoteActionCompatParcelizer > ((MeasuredPage) brazeContentCardsManager.serializer()).RemoteActionCompatParcelizer) {
                                            arrayList9.add(obj4);
                                        }
                                    }
                                    list6 = arrayList9;
                                }
                                if (!arrayList3.isEmpty()) {
                                    obj = arrayList3.get(i42);
                                    i43 = i34;
                                    i44 = i76;
                                    bottomSheetScaffoldKtBottomSheetScaffoldLayout12 = bottomSheetScaffoldKtBottomSheetScaffoldLayout15;
                                    i45 = i110;
                                    float f2 = -Math.abs(((MeasuredPage) obj).RatingCompat - bottomSheetScaffoldKtBottomSheetScaffoldLayout12.serializer(i44, r27, i43, i45));
                                    int size10 = arrayList3.size() - 1;
                                    if (1 <= size10) {
                                        int i152 = 1;
                                        while (true) {
                                            Object obj5 = arrayList3.get(i152);
                                            Object obj6 = obj;
                                            float f3 = -Math.abs(((MeasuredPage) obj5).RatingCompat - bottomSheetScaffoldKtBottomSheetScaffoldLayout12.serializer(i44, r27, i43, i45));
                                            if (Float.compare(f2, f3) < 0) {
                                                f2 = f3;
                                                obj = obj5;
                                            } else {
                                                obj = obj6;
                                            }
                                            if (i152 == size10) {
                                                break;
                                            }
                                            i152++;
                                        }
                                    }
                                } else {
                                    i43 = i34;
                                    i44 = i76;
                                    bottomSheetScaffoldKtBottomSheetScaffoldLayout12 = bottomSheetScaffoldKtBottomSheetScaffoldLayout15;
                                    i45 = i110;
                                    obj = null;
                                }
                                MeasuredPage measuredPage10 = (MeasuredPage) obj;
                                float fWrite = i33 == 0 ? 0.0f : RangesKt.write((bottomSheetScaffoldKtBottomSheetScaffoldLayout12.serializer(i44, r27, i43, i45) - (measuredPage10 != null ? measuredPage10.RatingCompat : 0)) / i33, -0.5f, 0.5f);
                                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope;
                                MeasureResult measureResultLayout = subcomposeMeasureScope4.layout(ConstraintsKt.m3643constrainWidthK40F9xA(j, iM3643constrainWidthK40F9xA + i79), ConstraintsKt.m3642constrainHeightK40F9xA(j, iM3642constrainHeightK40F9xA + i77), simpleItemTouchHelperCallback3, new waitForFirstLayout(populateViewStructure_androidKtpopulate8, 21, arrayList7));
                                boolean z35 = i21 < i134 || i138 > i137;
                                BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout16 = bottomSheetScaffoldKtBottomSheetScaffoldLayout12;
                                float f4 = fWrite;
                                subcomposeMeasureScope2 = subcomposeMeasureScope4;
                                pagerMeasureResult = new PagerMeasureResult(arrayList3, i19, i17, i45, selectionHandleIcon5, i82, i86, i38, measuredPage4, measuredPage10, f4, i29, z35, bottomSheetScaffoldKtBottomSheetScaffoldLayout16, measureResultLayout, z30, list2, list6, getcontentviewgroupparentlayout3, baselineButtonTokens, jConstraints$default);
                            }
                            pagerState2.applyMeasureResult$foundation(pagerMeasureResult, subcomposeMeasureScope2.isLookingAhead(), false);
                            invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationEntrancePictureFragmentExternalSyntheticLambda1 invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1 = pagerState2.RatingCompat;
                            List list12 = pagerMeasureResult.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
                            try {
                                if (invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat != Integer.MAX_VALUE && invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat != Integer.MIN_VALUE && !list12.isEmpty()) {
                                    int i153 = ((MeasuredPage) ((ComposePausableCompositionExceptionoperationsSequence1) onContentCardDismissed.read(list12))).RemoteActionCompatParcelizer;
                                    int i154 = ((MeasuredPage) ((ComposePausableCompositionExceptionoperationsSequence1) onContentCardDismissed.MediaDescriptionCompat(list12))).RemoteActionCompatParcelizer;
                                    for (int i155 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaDescriptionCompat; i155 < i153; i155++) {
                                        baselineButtonTokens.write(i155);
                                    }
                                    int i156 = i154 + 1;
                                    int i157 = invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationentrancepicturefragmentexternalsyntheticlambda1.MediaMetadataCompat;
                                    if (i156 <= i157) {
                                        while (true) {
                                            baselineButtonTokens.write(i156);
                                            if (i156 == i157) {
                                                break;
                                            }
                                            i156++;
                                        }
                                    }
                                }
                                return pagerMeasureResult;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                            throw th;
                        }
                    }
                };
                getpostalcode2.write(objComponentActivity8);
            } else {
                i6 = i9;
                i5 = 4;
            }
            CheckboxTokens checkboxTokens = (CheckboxTokens) objComponentActivity8;
            SelectionHandleIcon selectionHandleIcon2 = SelectionHandleIcon.Vertical;
            getpostalcode = getpostalcode2;
            final boolean z28 = selectionHandleIcon == selectionHandleIcon2;
            boolean z29 = ((i11 ^ 6) > i5 && getpostalcode.read(pagerState)) || (i10 & 6) == i5;
            boolean zWrite = getpostalcode.write(z28);
            Object objComponentActivity9 = getpostalcode.ComponentActivity();
            if (!z29 && !zWrite) {
                androidContentCaptureManager = androidContentCaptureManager2;
                if (objComponentActivity9 == androidContentCaptureManager) {
                }
                SmallIconButtonTokens smallIconButtonTokens = (SmallIconButtonTokens) objComponentActivity9;
                i7 = i6;
                if (i7 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i8 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z4 | z5) || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new PagerWrapperFlingBehavior(snapFlingBehavior, pagerState);
                    getpostalcode.write(objComponentActivity);
                }
                PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) objComponentActivity;
                getstringid9hzcbyc = (getStringId9Hzcbyc) getpostalcode.write((getNewPassword) TextDelegateKt.write);
                layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
                getpostalcode.serializer(-853904960);
                if (i7 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = getpostalcode.read(getstringid9hzcbyc);
                z8 = getpostalcode.read(layoutDirection.ordinal());
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!(z6 | z7 | z8) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0(pagerState, getstringid9hzcbyc, layoutDirection);
                    getpostalcode.write(objComponentActivity2);
                }
                invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogtimechangedblockingdialogfragmentexternalsyntheticlambda0 = (invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0) objComponentActivity2;
                getpostalcode.IconCompatParcelizer(false);
                if (z) {
                    getpostalcode.serializer(-853484445);
                    Modifier.Companion companion = Modifier.Companion;
                    int i17 = i11 | ((i8 >> 21) & 112);
                    z10 = (((i17 & 14) ^ 6) <= 4 && getpostalcode.read(pagerState)) || (i17 & 6) == 4;
                    z11 = (((i17 & 112) ^ 48) <= 32 && getpostalcode.read(0)) || (i17 & 48) == 32;
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (!(z11 | z10) || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new invokecomroadrunnerdeliveryonthewaycrowdsourcingtermspresentationTermsAndConditionsFragmentExternalSyntheticLambda1(pagerState);
                        getpostalcode.write(objComponentActivity3);
                    }
                    modifierIconCompatParcelizer = ExtendedFabPrimaryTokens.IconCompatParcelizer(companion, (invokecomroadrunnerdeliveryonthewaycrowdsourcingtermspresentationTermsAndConditionsFragmentExternalSyntheticLambda1) objComponentActivity3, pagerState.MediaSessionCompatQueueItem, selectionHandleIcon);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-853054661);
                    getpostalcode.IconCompatParcelizer(false);
                    modifierIconCompatParcelizer = Modifier.Companion;
                }
                modifierWrite = AbstractApplier.write(modifier.then(pagerState.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).then(pagerState.IconCompatParcelizer), registerinappmessagemanagerlambda7, smallIconButtonTokens, selectionHandleIcon, z);
                if (selectionHandleIcon == selectionHandleIcon2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z) {
                    modifierThen = modifierWrite.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new getLength(z9, pagerState, getcontentviewgroupparentlayout, 2), 1, null));
                } else {
                    modifierThen = modifierWrite.then(Modifier.Companion);
                }
                PullToRefreshModifierNodeupdate1.write(registerinappmessagemanagerlambda7, NestedScrollModifierKt.nestedScroll$default(o.DefaultPagerNestedScrollConnection.RemoteActionCompatParcelizer(modifierThen.then(modifierIconCompatParcelizer), pagerState, selectionHandleIcon, isnotgestureactionfoundation, z, pagerWrapperFlingBehavior, pagerState.ParcelableVolumeInfo, invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogtimechangedblockingdialogfragmentexternalsyntheticlambda0).then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new LazyLayoutPagerKt$dragDirectionDetector$1(0, pagerState))), nestedScrollConnection, null, 2, null), pagerState.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, checkboxTokens, getpostalcode, 0);
            } else {
                androidContentCaptureManager = androidContentCaptureManager2;
            }
            objComponentActivity9 = new SmallIconButtonTokens() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
                @Override // o.SmallIconButtonTokens
                public final CollectionInfo serializer() {
                    boolean z30 = z28;
                    PagerState pagerState2 = pagerState;
                    return z30 ? new CollectionInfo(pagerState2.read(), 1) : new CollectionInfo(1, pagerState2.read());
                }

                @Override // o.SmallIconButtonTokens
                public final int IconCompatParcelizer() {
                    PagerState pagerState2 = pagerState;
                    return (-pagerState2.MediaSessionCompatQueueItem().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) + pagerState2.MediaSessionCompatQueueItem().serializer;
                }

                @Override // o.SmallIconButtonTokens
                public final float RemoteActionCompatParcelizer() {
                    PagerState pagerState2 = pagerState;
                    return PagerStateKt.serializer(pagerState2.MediaSessionCompatQueueItem(), pagerState2.read());
                }

                @Override // o.SmallIconButtonTokens
                public final float read() {
                    return r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.read(pagerState);
                }

                @Override // o.SmallIconButtonTokens
                public final Object scrollToItem(int i18, PagerState$scrollToPage$2 pagerState$scrollToPage$2) {
                    PagerState pagerState2 = pagerState;
                    pagerState2.getClass();
                    Object objScroll = pagerState2.scroll(applyMeasureResultfoundation.Default, new PagerState$scrollToPage$2(pagerState2, i18, null, 0), pagerState$scrollToPage$2);
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    if (objScroll != coroutineSingletons) {
                        objScroll = createfromparcel;
                    }
                    return objScroll == coroutineSingletons ? objScroll : createfromparcel;
                }

                @Override // o.SmallIconButtonTokens
                public final int write() {
                    PagerState pagerState2 = pagerState;
                    return (int) (pagerState2.MediaSessionCompatQueueItem().MediaSessionCompatToken == SelectionHandleIcon.Vertical ? pagerState2.MediaSessionCompatQueueItem().m96getViewportSizeYbymL2g() & 4294967295L : pagerState2.MediaSessionCompatQueueItem().m96getViewportSizeYbymL2g() >> 32);
                }
            };
            getpostalcode.write(objComponentActivity9);
            SmallIconButtonTokens smallIconButtonTokens2 = (SmallIconButtonTokens) objComponentActivity9;
            i7 = i6;
            if (i7 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i8 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!(z4 | z5)) {
                objComponentActivity = new PagerWrapperFlingBehavior(snapFlingBehavior, pagerState);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new PagerWrapperFlingBehavior(snapFlingBehavior, pagerState);
                getpostalcode.write(objComponentActivity);
            }
            PagerWrapperFlingBehavior pagerWrapperFlingBehavior2 = (PagerWrapperFlingBehavior) objComponentActivity;
            getstringid9hzcbyc = (getStringId9Hzcbyc) getpostalcode.write((getNewPassword) TextDelegateKt.write);
            layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
            getpostalcode.serializer(-853904960);
            if (i7 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = getpostalcode.read(getstringid9hzcbyc);
            z8 = getpostalcode.read(layoutDirection.ordinal());
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!(z6 | z7 | z8)) {
                objComponentActivity2 = new invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0(pagerState, getstringid9hzcbyc, layoutDirection);
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0(pagerState, getstringid9hzcbyc, layoutDirection);
                getpostalcode.write(objComponentActivity2);
            }
            invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogtimechangedblockingdialogfragmentexternalsyntheticlambda1 = (invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0) objComponentActivity2;
            getpostalcode.IconCompatParcelizer(false);
            if (z) {
                getpostalcode.serializer(-853484445);
                Modifier.Companion companion2 = Modifier.Companion;
                int i18 = i11 | ((i8 >> 21) & 112);
                if (((i18 & 14) ^ 6) <= 4) {
                }
                if (((i18 & 112) ^ 48) <= 32) {
                }
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(z11 | z10)) {
                    objComponentActivity3 = new invokecomroadrunnerdeliveryonthewaycrowdsourcingtermspresentationTermsAndConditionsFragmentExternalSyntheticLambda1(pagerState);
                    getpostalcode.write(objComponentActivity3);
                } else {
                    objComponentActivity3 = new invokecomroadrunnerdeliveryonthewaycrowdsourcingtermspresentationTermsAndConditionsFragmentExternalSyntheticLambda1(pagerState);
                    getpostalcode.write(objComponentActivity3);
                }
                modifierIconCompatParcelizer = ExtendedFabPrimaryTokens.IconCompatParcelizer(companion2, (invokecomroadrunnerdeliveryonthewaycrowdsourcingtermspresentationTermsAndConditionsFragmentExternalSyntheticLambda1) objComponentActivity3, pagerState.MediaSessionCompatQueueItem, selectionHandleIcon);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-853054661);
                getpostalcode.IconCompatParcelizer(false);
                modifierIconCompatParcelizer = Modifier.Companion;
            }
            modifierWrite = AbstractApplier.write(modifier.then(pagerState.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).then(pagerState.IconCompatParcelizer), registerinappmessagemanagerlambda7, smallIconButtonTokens2, selectionHandleIcon, z);
            if (selectionHandleIcon == selectionHandleIcon2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z) {
                modifierThen = modifierWrite.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new getLength(z9, pagerState, getcontentviewgroupparentlayout, 2), 1, null));
            } else {
                modifierThen = modifierWrite.then(Modifier.Companion);
            }
            PullToRefreshModifierNodeupdate1.write(registerinappmessagemanagerlambda7, NestedScrollModifierKt.nestedScroll$default(o.DefaultPagerNestedScrollConnection.RemoteActionCompatParcelizer(modifierThen.then(modifierIconCompatParcelizer), pagerState, selectionHandleIcon, isnotgestureactionfoundation, z, pagerWrapperFlingBehavior2, pagerState.ParcelableVolumeInfo, invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogtimechangedblockingdialogfragmentexternalsyntheticlambda1).then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new LazyLayoutPagerKt$dragDirectionDetector$1(0, pagerState))), nestedScrollConnection, null, 2, null), pagerState.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, checkboxTokens, getpostalcode, 0);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.CompositionKt
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.foundation.pager.LazyLayoutPagerKt.m94PagereLwUrMk(modifier, pagerState, switchKt, selectionHandleIcon, snapFlingBehavior, z, isnotgestureactionfoundation, f, gapComposerCompositionContextImpl, nestedScrollConnection, r8lambdaunavo3sxub_pc9xroryotnrlvsm, horizontal, vertical, bottomSheetScaffoldKtBottomSheetScaffoldLayout11, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
