package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.BottomSheetScaffoldKtBottomSheetScaffoldLayout11;
import o.DragAndDropTargetModifierNode;
import o.GapComposerCompositionContextImpl;
import o.PagerStaterequestScrollToPage1;
import o.ParcelableSnapshotMutableStateCompanionCREATOR1;
import o.SelectionHandleIcon;
import o.SwitchDefaults;
import o.SwitchKt;
import o.TapGestureDetectorKtprocessTapGesture3;
import o.WindowInsetsAnimationCancelledException;
import o.accessanimateWithTarget;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.isNotGestureActionfoundation;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public abstract class PagerKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0276  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0168  */
    /* JADX WARN: Code duplicated, block: B:81:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x0183  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:87:0x0196  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:97:0x0256  */
    /* JADX INFO: renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    public static final void m95HorizontalPager8jOkeI(final PagerState pagerState, Modifier modifier, SwitchKt switchKt, GapComposerCompositionContextImpl gapComposerCompositionContextImpl, float f, Alignment.Vertical vertical, SnapFlingBehavior snapFlingBehavior, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, NestedScrollConnection nestedScrollConnection, BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout11, isNotGestureActionfoundation isnotgestureactionfoundation, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        int i8;
        int i9;
        boolean z2;
        getPostalCode getpostalcode;
        final SwitchKt switchKt2;
        final float f2;
        final Alignment.Vertical vertical2;
        final SnapFlingBehavior snapFlingBehavior2;
        final boolean z3;
        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        final NestedScrollConnection nestedScrollConnection2;
        final BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout12;
        final isNotGestureActionfoundation isnotgestureactionfoundation2;
        final Modifier modifier3;
        final GapComposerCompositionContextImpl gapComposerCompositionContextImpl2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        ParcelableSnapshotMutableStateCompanionCREATOR1 parcelableSnapshotMutableStateCompanionCREATOR1;
        accessanimateWithTarget accessanimatewithtarget;
        width widthVarIconCompatParcelizer;
        LayoutDirection layoutDirection;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objComponentActivity;
        boolean z10;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
        SelectionHandleIcon selectionHandleIcon;
        boolean z11;
        Object objComponentActivity2;
        int i10;
        SwitchKt switchKt3;
        Modifier modifier5;
        float f3;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
        BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout13;
        NestedScrollConnection nestedScrollConnection3;
        isNotGestureActionfoundation isnotgestureactionfoundationSerializer;
        GapComposerCompositionContextImpl gapComposerCompositionContextImpl3;
        int i11;
        SnapFlingBehavior snapFlingBehavior3;
        Alignment.Vertical vertical3;
        boolean z12;
        int i12;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1860873769);
        if ((i & 6) == 0) {
            i4 = i | (getpostalcode2.read(pagerState) ? 4 : 2);
        } else {
            i4 = i;
        }
        int i13 = i3 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= getpostalcode2.read(modifier2) ? 32 : 16;
            }
            i5 = 1797504 | i4;
            if ((i & 12582912) == 0) {
                i5 = 5991808 | i4;
            }
            i6 = 905969664 | i5;
            i7 = i3 & Fields.RotationZ;
            if (i7 != 0) {
                i8 = i2 | 6;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            } else if ((i2 & 6) == 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                i8 = (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 4 : 2) | i2;
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                i8 = i2;
            }
            if ((i2 & 48) == 0) {
                i8 |= 16;
            }
            i9 = i8 | 384;
            if ((i2 & 3072) == 0) {
                i9 = i8 | 1408;
            }
            if ((i2 & 24576) == 0) {
                if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i12 = Fields.Clip;
                } else {
                    i12 = 8192;
                }
                i9 |= i12;
            }
            if ((306783379 & i6) == 306783378 || (i9 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode2.write(i6 & 1, z2)) {
                getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0 && !getpostalcode2.PlaybackStateCompat()) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i10 = i6 & (-29360129);
                    i11 = i9 & (-7281);
                    switchKt3 = switchKt;
                    gapComposerCompositionContextImpl3 = gapComposerCompositionContextImpl;
                    f3 = f;
                    vertical3 = vertical;
                    snapFlingBehavior3 = snapFlingBehavior;
                    z12 = z;
                    nestedScrollConnection3 = nestedScrollConnection;
                    bottomSheetScaffoldKtBottomSheetScaffoldLayout13 = bottomSheetScaffoldKtBottomSheetScaffoldLayout11;
                    isnotgestureactionfoundationSerializer = isnotgestureactionfoundation;
                    modifier5 = modifier2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                } else {
                    if (i13 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    float fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                    SwitchDefaults switchDefaults = new SwitchDefaults(fM3673constructorimpl, fM3673constructorimpl, fM3673constructorimpl, fM3673constructorimpl);
                    float fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    int i14 = i6 & 14;
                    int i15 = i14 | 196608;
                    parcelableSnapshotMutableStateCompanionCREATOR1 = new ParcelableSnapshotMutableStateCompanionCREATOR1();
                    accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode2);
                    Map map = WindowInsetsAnimationCancelledException.serializer;
                    Modifier modifier6 = modifier4;
                    widthVarIconCompatParcelizer = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, Float.valueOf(1.0f));
                    Density density = (Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
                    z4 = (((i15 & 14) ^ 6) <= 4 && getpostalcode2.read(pagerState)) || (i15 & 6) == 4;
                    z5 = getpostalcode2.read(accessanimatewithtarget);
                    z6 = getpostalcode2.read(widthVarIconCompatParcelizer);
                    z7 = getpostalcode2.read(parcelableSnapshotMutableStateCompanionCREATOR1);
                    z8 = getpostalcode2.read(density);
                    z9 = getpostalcode2.read(layoutDirection.ordinal());
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if ((!(z8 | z4 | z5 | z6 | z7) && !z9) || objComponentActivity == androidContentCaptureManager) {
                        z10 = false;
                        PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 = new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(pagerState, new PagerDefaults$$ExternalSyntheticLambda0(pagerState, 0, layoutDirection), parcelableSnapshotMutableStateCompanionCREATOR1);
                        float f4 = SnapFlingBehaviorKt.read;
                        objComponentActivity = new SnapFlingBehavior(pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1, accessanimatewithtarget, widthVarIconCompatParcelizer);
                        getpostalcode2.write(objComponentActivity);
                    } else {
                        z10 = false;
                    }
                    SnapFlingBehavior snapFlingBehavior4 = (SnapFlingBehavior) objComponentActivity;
                    if (i7 != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = null;
                    } else {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    }
                    selectionHandleIcon = SelectionHandleIcon.Horizontal;
                    int i16 = i14 | 432;
                    z11 = ((((i16 & 14) ^ 6) > 4 || !getpostalcode2.read(pagerState)) && (i16 & 6) != 4) ? z10 : true;
                    objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (!z11 || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new DefaultPagerNestedScrollConnection(pagerState, selectionHandleIcon);
                        getpostalcode2.write(objComponentActivity2);
                    }
                    i10 = i6 & (-29360129);
                    switchKt3 = switchDefaults;
                    modifier5 = modifier6;
                    f3 = fM3673constructorimpl2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                    bottomSheetScaffoldKtBottomSheetScaffoldLayout13 = BottomSheetScaffoldKtBottomSheetScaffoldLayout11.read;
                    nestedScrollConnection3 = (DefaultPagerNestedScrollConnection) objComponentActivity2;
                    isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode2);
                    gapComposerCompositionContextImpl3 = GapComposerCompositionContextImpl.read;
                    i11 = i9 & (-7281);
                    snapFlingBehavior3 = snapFlingBehavior4;
                    vertical3 = centerVertically;
                    z12 = true;
                }
                getpostalcode2.RemoteActionCompatParcelizer();
                int i17 = i10 >> 6;
                int i18 = i10 << 12;
                int i19 = i11 << 6;
                getpostalcode = getpostalcode2;
                LazyLayoutPagerKt.m94PagereLwUrMk(modifier5, pagerState, switchKt3, SelectionHandleIcon.Horizontal, snapFlingBehavior3, z12, isnotgestureactionfoundationSerializer, f3, gapComposerCompositionContextImpl3, nestedScrollConnection3, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, Alignment.Companion.getCenterHorizontally(), vertical3, bottomSheetScaffoldKtBottomSheetScaffoldLayout13, dragAndDropTargetModifierNode, getpostalcode, ((i10 >> 3) & 14) | 24576 | ((i10 << 3) & 112) | (i10 & 896) | ((i10 >> 18) & 7168) | (i17 & 3670016) | (234881024 & i18) | (i18 & 1879048192), ((i10 >> 9) & 14) | 3072 | (i19 & 896) | (i17 & 57344) | ((i11 << 9) & 458752) | (i19 & 3670016));
                modifier3 = modifier5;
                switchKt2 = switchKt3;
                gapComposerCompositionContextImpl2 = gapComposerCompositionContextImpl3;
                f2 = f3;
                vertical2 = vertical3;
                snapFlingBehavior2 = snapFlingBehavior3;
                z3 = z12;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
                nestedScrollConnection2 = nestedScrollConnection3;
                bottomSheetScaffoldKtBottomSheetScaffoldLayout12 = bottomSheetScaffoldKtBottomSheetScaffoldLayout13;
                isnotgestureactionfoundation2 = isnotgestureactionfoundationSerializer;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                switchKt2 = switchKt;
                f2 = f;
                vertical2 = vertical;
                snapFlingBehavior2 = snapFlingBehavior;
                z3 = z;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                nestedScrollConnection2 = nestedScrollConnection;
                bottomSheetScaffoldKtBottomSheetScaffoldLayout12 = bottomSheetScaffoldKtBottomSheetScaffoldLayout11;
                isnotgestureactionfoundation2 = isnotgestureactionfoundation;
                modifier3 = modifier2;
                gapComposerCompositionContextImpl2 = gapComposerCompositionContextImpl;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.MonotonicFrameClockKtwithFrameMillis2
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                        androidx.compose.foundation.pager.PagerKt.m95HorizontalPager8jOkeI(pagerState, modifier3, switchKt2, gapComposerCompositionContextImpl2, f2, vertical2, snapFlingBehavior2, z3, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, nestedScrollConnection2, bottomSheetScaffoldKtBottomSheetScaffoldLayout12, isnotgestureactionfoundation2, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i4 |= 48;
        modifier2 = modifier;
        i5 = 1797504 | i4;
        if ((i & 12582912) == 0) {
            i5 = 5991808 | i4;
        }
        i6 = 905969664 | i5;
        i7 = i3 & Fields.RotationZ;
        if (i7 != 0) {
            i8 = i2 | 6;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        } else if ((i2 & 6) == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            i8 = (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 4 : 2) | i2;
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            i8 = i2;
        }
        if ((i2 & 48) == 0) {
            i8 |= 16;
        }
        i9 = i8 | 384;
        if ((i2 & 3072) == 0) {
            i9 = i8 | 1408;
        }
        if ((i2 & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i12 = Fields.Clip;
            } else {
                i12 = 8192;
            }
            i9 |= i12;
        }
        if ((306783379 & i6) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (getpostalcode2.write(i6 & 1, z2)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if (i13 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                float fM3673constructorimpl3 = Dp.m3673constructorimpl(0.0f);
                SwitchDefaults switchDefaults2 = new SwitchDefaults(fM3673constructorimpl3, fM3673constructorimpl3, fM3673constructorimpl3, fM3673constructorimpl3);
                float fM3673constructorimpl4 = Dp.m3673constructorimpl(0.0f);
                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                int i110 = i6 & 14;
                int i111 = i110 | 196608;
                parcelableSnapshotMutableStateCompanionCREATOR1 = new ParcelableSnapshotMutableStateCompanionCREATOR1();
                accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode2);
                Map map2 = WindowInsetsAnimationCancelledException.serializer;
                Modifier modifier7 = modifier4;
                widthVarIconCompatParcelizer = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, Float.valueOf(1.0f));
                Density density2 = (Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
                if (((i111 & 14) ^ 6) <= 4) {
                }
                z5 = getpostalcode2.read(accessanimatewithtarget);
                z6 = getpostalcode2.read(widthVarIconCompatParcelizer);
                z7 = getpostalcode2.read(parcelableSnapshotMutableStateCompanionCREATOR1);
                z8 = getpostalcode2.read(density2);
                z9 = getpostalcode2.read(layoutDirection.ordinal());
                objComponentActivity = getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                if (!(z8 | z4 | z5 | z6 | z7 | z9)) {
                    z10 = false;
                    PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2 = new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(pagerState, new PagerDefaults$$ExternalSyntheticLambda0(pagerState, 0, layoutDirection), parcelableSnapshotMutableStateCompanionCREATOR1);
                    float f5 = SnapFlingBehaviorKt.read;
                    objComponentActivity = new SnapFlingBehavior(pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2, accessanimatewithtarget, widthVarIconCompatParcelizer);
                    getpostalcode2.write(objComponentActivity);
                } else {
                    z10 = false;
                    PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$3 = new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(pagerState, new PagerDefaults$$ExternalSyntheticLambda0(pagerState, 0, layoutDirection), parcelableSnapshotMutableStateCompanionCREATOR1);
                    float f6 = SnapFlingBehaviorKt.read;
                    objComponentActivity = new SnapFlingBehavior(pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$3, accessanimatewithtarget, widthVarIconCompatParcelizer);
                    getpostalcode2.write(objComponentActivity);
                }
                SnapFlingBehavior snapFlingBehavior5 = (SnapFlingBehavior) objComponentActivity;
                if (i7 != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = null;
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }
                selectionHandleIcon = SelectionHandleIcon.Horizontal;
                int i112 = i110 | 432;
                if (((i112 & 14) ^ 6) > 4) {
                }
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (!z11) {
                    objComponentActivity2 = new DefaultPagerNestedScrollConnection(pagerState, selectionHandleIcon);
                    getpostalcode2.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new DefaultPagerNestedScrollConnection(pagerState, selectionHandleIcon);
                    getpostalcode2.write(objComponentActivity2);
                }
                i10 = i6 & (-29360129);
                switchKt3 = switchDefaults2;
                modifier5 = modifier7;
                f3 = fM3673constructorimpl4;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                bottomSheetScaffoldKtBottomSheetScaffoldLayout13 = BottomSheetScaffoldKtBottomSheetScaffoldLayout11.read;
                nestedScrollConnection3 = (DefaultPagerNestedScrollConnection) objComponentActivity2;
                isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode2);
                gapComposerCompositionContextImpl3 = GapComposerCompositionContextImpl.read;
                i11 = i9 & (-7281);
                snapFlingBehavior3 = snapFlingBehavior5;
                vertical3 = centerVertically2;
                z12 = true;
            } else {
                if (i13 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                float fM3673constructorimpl5 = Dp.m3673constructorimpl(0.0f);
                SwitchDefaults switchDefaults3 = new SwitchDefaults(fM3673constructorimpl5, fM3673constructorimpl5, fM3673constructorimpl5, fM3673constructorimpl5);
                float fM3673constructorimpl6 = Dp.m3673constructorimpl(0.0f);
                Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
                int i113 = i6 & 14;
                int i114 = i113 | 196608;
                parcelableSnapshotMutableStateCompanionCREATOR1 = new ParcelableSnapshotMutableStateCompanionCREATOR1();
                accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode2);
                Map map3 = WindowInsetsAnimationCancelledException.serializer;
                Modifier modifier8 = modifier4;
                widthVarIconCompatParcelizer = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, Float.valueOf(1.0f));
                Density density3 = (Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
                if (((i114 & 14) ^ 6) <= 4) {
                }
                z5 = getpostalcode2.read(accessanimatewithtarget);
                z6 = getpostalcode2.read(widthVarIconCompatParcelizer);
                z7 = getpostalcode2.read(parcelableSnapshotMutableStateCompanionCREATOR1);
                z8 = getpostalcode2.read(density3);
                z9 = getpostalcode2.read(layoutDirection.ordinal());
                objComponentActivity = getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager3 = getCreditCardExpirationMonth.write;
                if (!(z8 | z4 | z5 | z6 | z7 | z9)) {
                    z10 = false;
                    PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$4 = new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(pagerState, new PagerDefaults$$ExternalSyntheticLambda0(pagerState, 0, layoutDirection), parcelableSnapshotMutableStateCompanionCREATOR1);
                    float f7 = SnapFlingBehaviorKt.read;
                    objComponentActivity = new SnapFlingBehavior(pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$4, accessanimatewithtarget, widthVarIconCompatParcelizer);
                    getpostalcode2.write(objComponentActivity);
                } else {
                    z10 = false;
                    PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$5 = new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(pagerState, new PagerDefaults$$ExternalSyntheticLambda0(pagerState, 0, layoutDirection), parcelableSnapshotMutableStateCompanionCREATOR1);
                    float f8 = SnapFlingBehaviorKt.read;
                    objComponentActivity = new SnapFlingBehavior(pagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$5, accessanimatewithtarget, widthVarIconCompatParcelizer);
                    getpostalcode2.write(objComponentActivity);
                }
                SnapFlingBehavior snapFlingBehavior6 = (SnapFlingBehavior) objComponentActivity;
                if (i7 != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = null;
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }
                selectionHandleIcon = SelectionHandleIcon.Horizontal;
                int i115 = i113 | 432;
                if (((i115 & 14) ^ 6) > 4) {
                }
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (!z11) {
                    objComponentActivity2 = new DefaultPagerNestedScrollConnection(pagerState, selectionHandleIcon);
                    getpostalcode2.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new DefaultPagerNestedScrollConnection(pagerState, selectionHandleIcon);
                    getpostalcode2.write(objComponentActivity2);
                }
                i10 = i6 & (-29360129);
                switchKt3 = switchDefaults3;
                modifier5 = modifier8;
                f3 = fM3673constructorimpl6;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                bottomSheetScaffoldKtBottomSheetScaffoldLayout13 = BottomSheetScaffoldKtBottomSheetScaffoldLayout11.read;
                nestedScrollConnection3 = (DefaultPagerNestedScrollConnection) objComponentActivity2;
                isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode2);
                gapComposerCompositionContextImpl3 = GapComposerCompositionContextImpl.read;
                i11 = i9 & (-7281);
                snapFlingBehavior3 = snapFlingBehavior6;
                vertical3 = centerVertically3;
                z12 = true;
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            int i116 = i10 >> 6;
            int i117 = i10 << 12;
            int i118 = i11 << 6;
            getpostalcode = getpostalcode2;
            LazyLayoutPagerKt.m94PagereLwUrMk(modifier5, pagerState, switchKt3, SelectionHandleIcon.Horizontal, snapFlingBehavior3, z12, isnotgestureactionfoundationSerializer, f3, gapComposerCompositionContextImpl3, nestedScrollConnection3, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, Alignment.Companion.getCenterHorizontally(), vertical3, bottomSheetScaffoldKtBottomSheetScaffoldLayout13, dragAndDropTargetModifierNode, getpostalcode, ((i10 >> 3) & 14) | 24576 | ((i10 << 3) & 112) | (i10 & 896) | ((i10 >> 18) & 7168) | (i116 & 3670016) | (234881024 & i117) | (i117 & 1879048192), ((i10 >> 9) & 14) | 3072 | (i118 & 896) | (i116 & 57344) | ((i11 << 9) & 458752) | (i118 & 3670016));
            modifier3 = modifier5;
            switchKt2 = switchKt3;
            gapComposerCompositionContextImpl2 = gapComposerCompositionContextImpl3;
            f2 = f3;
            vertical2 = vertical3;
            snapFlingBehavior2 = snapFlingBehavior3;
            z3 = z12;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
            nestedScrollConnection2 = nestedScrollConnection3;
            bottomSheetScaffoldKtBottomSheetScaffoldLayout12 = bottomSheetScaffoldKtBottomSheetScaffoldLayout13;
            isnotgestureactionfoundation2 = isnotgestureactionfoundationSerializer;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            switchKt2 = switchKt;
            f2 = f;
            vertical2 = vertical;
            snapFlingBehavior2 = snapFlingBehavior;
            z3 = z;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            nestedScrollConnection2 = nestedScrollConnection;
            bottomSheetScaffoldKtBottomSheetScaffoldLayout12 = bottomSheetScaffoldKtBottomSheetScaffoldLayout11;
            isnotgestureactionfoundation2 = isnotgestureactionfoundation;
            modifier3 = modifier2;
            gapComposerCompositionContextImpl2 = gapComposerCompositionContextImpl;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.MonotonicFrameClockKtwithFrameMillis2
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.foundation.pager.PagerKt.m95HorizontalPager8jOkeI(pagerState, modifier3, switchKt2, gapComposerCompositionContextImpl2, f2, vertical2, snapFlingBehavior2, z3, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, nestedScrollConnection2, bottomSheetScaffoldKtBottomSheetScaffoldLayout12, isnotgestureactionfoundation2, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
