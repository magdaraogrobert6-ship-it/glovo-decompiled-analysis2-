package com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.hms.location.LocationRequest;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.composable.LastStopMapPinKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.tooltip.TooltipKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AdjustBridgeUtil1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.AwaitFirstLayoutModifier;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.accessgetTextCentercp;
import o.buildMapping;
import o.dc;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getBottomPaddingui_textannotations;
import o.getContentCaptureSessionui;
import o.getCreditCardExpirationMonth;
import o.getEndOffsetForRectWithinRun;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPersonFullName;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.onClearTranslationui;
import o.performFling;
import o.performMeasureDjhGOtQ;
import o.performSaveInstanceState;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LastStopMapPinKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final long read = ColorKt.Color(507461439);
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 27;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067 A[PHI: r1 r6
  0x0067: PHI (r1v10 androidx.compose.ui.Modifier) = (r1v9 androidx.compose.ui.Modifier), (r1v13 androidx.compose.ui.Modifier) binds: [B:14:0x0065, B:11:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r6v6 androidx.compose.ui.Modifier) = (r6v5 androidx.compose.ui.Modifier), (r6v8 androidx.compose.ui.Modifier) binds: [B:14:0x0065, B:11:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void LastStopMapPinShadow(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        Modifier modifierM75height3ABfNKs;
        Object objComponentActivity;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(239902674);
        int i3 = i | 6;
        if ((i3 & 3) != 2) {
            int i4 = RemoteActionCompatParcelizer + 33;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            int i6 = RemoteActionCompatParcelizer + 109;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                modifier = Modifier.Companion;
                modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, Dimensions.getAnimatedVisibility), Dp.m3673constructorimpl(6.0f));
                objComponentActivity = getpostalcode.ComponentActivity();
                int i7 = 13 / 0;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new accessgetTextCentercp(22);
                    getpostalcode.write(objComponentActivity);
                    int i8 = write + 47;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
            } else {
                modifier = Modifier.Companion;
                modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, Dimensions.getAnimatedVisibility), Dp.m3673constructorimpl(6.0f));
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new accessgetTextCentercp(22);
                    getpostalcode.write(objComponentActivity);
                    int i10 = write + 47;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
            }
            AwaitFirstLayoutModifier.serializer(modifierM75height3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 48);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d A[PHI: r1 r14
  0x002d: PHI (r1v27 int) = (r1v4 int), (r1v28 int) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r14v6 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v7 o.getPostalCode) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r1 r14
  0x002b: PHI (r1v5 int) = (r1v4 int), (r1v28 int) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r14v2 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v7 o.getPostalCode) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void LastStopMapPinMovingBar(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 55;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1815991097);
            i2 = i | 72;
            if ((i2 & 3) != 3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1815991097);
            i2 = i | 6;
            if ((i2 & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        if (getpostalcode.write(i2 & 1, z)) {
            modifier = Modifier.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            Object obj = null;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i5 = RemoteActionCompatParcelizer + 61;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode.ComponentActivity;
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                int i6 = RemoteActionCompatParcelizer + 55;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierM86width3ABfNKs = SizeKt.m86width3ABfNKs(modifier, Dimensions.setSplitBackground);
            float f = Dimensions.setTransitioning;
            Modifier modifier2 = OffsetKt.read(SizeKt.m75height3ABfNKs(modifierM86width3ABfNKs, f), Dp.m3673constructorimpl(0.0f), Dimensions.write);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme();
            float f2 = Dimensions.setTabContainer;
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(modifier2, popupTheme, RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, f2, f2, 3)), getpostalcode, 0);
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, Dimensions.getActionBarHideOffset), f), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, f2, f2, 3)), getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
            int i7 = RemoteActionCompatParcelizer + 1;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 7);
        }
        int i9 = write + 19;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    public static final void LastStopMapPin(getEndOffsetForRectWithinRun getendoffsetforrectwithinrun, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        float fM3673constructorimpl;
        int i3;
        int i4 = 2 % 2;
        getendoffsetforrectwithinrun.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(423673866);
        if ((i & 6) == 0) {
            if (getpostalcode.read(getendoffsetforrectwithinrun)) {
                int i5 = write + 73;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if (getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
            int i8 = write + 51;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            modifier2 = Modifier.Companion;
            getBottomPaddingui_textannotations getbottompaddingui_textannotations = (getBottomPaddingui_textannotations) ExtrasKt.write(getendoffsetforrectwithinrun.MediaDescriptionCompat, getpostalcode, 0).getValue();
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            if (getbottompaddingui_textannotations == null) {
                getpostalcode.serializer(-1240495758);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1240495757);
                if (getbottompaddingui_textannotations.RemoteActionCompatParcelizer) {
                    int i10 = RemoteActionCompatParcelizer + 57;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    fM3673constructorimpl = Dp.m3673constructorimpl(-Dimensions.setStackedBackground);
                } else {
                    fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                }
                m4907LastStopMapPinContentQuyCDyQ(getbottompaddingui_textannotations.RemoteActionCompatParcelizer, getbottompaddingui_textannotations.read, getbottompaddingui_textannotations.serializer, ((Dp) TapGestureDetectorKtprocessTapGestureresetJob1.write(fM3673constructorimpl, DelayKt.IconCompatParcelizer(0.5f, 200.0f, 4, (Object) null), "last stop marker", getpostalcode, 432, 8).getValue()).m3687unboximpl(), modifier2, ((Dp) TapGestureDetectorKtprocessTapGestureresetJob1.write(density.mo45toDpu2uoSUM(getbottompaddingui_textannotations.IconCompatParcelizer), (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, performFling.read, 2}), "safeAreaOffset", getpostalcode, 384, 8).getValue()).m3687unboximpl(), getpostalcode, (i7 << 9) & 57344);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i12 = write + 101;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(getendoffsetforrectwithinrun, modifier2, i, 22);
        }
    }

    public static final void LastStopMapToolTip(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(39598459);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                int i5 = write + 11;
                int i6 = i5 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 23;
                write = i8 % Fields.SpotShadowColor;
                i3 = 4;
                if (i8 % 2 == 0) {
                    int i9 = 5 / 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i10 = write + 37;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i12 = RemoteActionCompatParcelizer + 5;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                objComponentActivity = getPersonFullName.RemoteActionCompatParcelizer(0.0f);
                getpostalcode2.write(objComponentActivity);
            }
            getContentCaptureSessionui getcontentcapturesessionui = (getContentCaptureSessionui) ((populate) objComponentActivity);
            float fSerializer = getcontentcapturesessionui.serializer() / 2.0f;
            Modifier modifierIconCompatParcelizer = SizeKt.IconCompatParcelizer(modifier, null, 3);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new onClearTranslationui(getcontentcapturesessionui, 1);
                getpostalcode2.write(objComponentActivity2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierIconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2);
            float f = Dimensions.getActionBarHideOffset;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierOnGloballyPositioned, 0.0f, 0.0f, 0.0f, f, 7);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = write + 47;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode2.ComponentActivity) {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                int i16 = RemoteActionCompatParcelizer + 89;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode2.serializer(constructor);
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TooltipKt.m5065TooltipContentxoUWsQ(str, f, fSerializer, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setBackgroundDrawable(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), AdjustBridgeUtil1.BOTTOM, null, false, null, getpostalcode2, (i2 & 14) | 1575936, 896);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 2);
        }
    }

    public static final void LastStopMapPinMarker(boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-397910456);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = RemoteActionCompatParcelizer + 3;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode.read(modifier)) {
                int i8 = write + 11;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierWrite = PaddingKt.write(SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setCustomView), Dp.m3673constructorimpl(2.0f));
            float f = Dimensions.setPrimaryBackground;
            float f2 = Dimensions.write;
            Modifier modifier2 = OffsetKt.read(modifierWrite, Dp.m3673constructorimpl(0.0f), Dp.m3673constructorimpl(f + f2));
            float f3 = Dimensions.setGroupDividerEnabled;
            float f4 = Dimensions.setStackedBackground;
            Modifier modifierM317shadows4CzXII$default = ShadowKt.m317shadows4CzXII$default(modifier2, f3, RoundedCornerShapeKt.IconCompatParcelizer(f4), false, 0L, 0L, 28, null);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite2 = BorderKt.write(BackgroundKt.m20backgroundbw27NRU(modifierM317shadows4CzXII$default, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), RoundedCornerShapeKt.IconCompatParcelizer(f4)), f2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RoundedCornerShapeKt.IconCompatParcelizer(f4));
            MeasurePolicy measurePolicy = BoxKt.read(companion.getCenter(), false);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i10 = RemoteActionCompatParcelizer + 99;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_flag_checkered, getpostalcode, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), getpostalcode, Painter.$stable | 48, 4);
            getpostalcode.IconCompatParcelizer(true);
            if (z) {
                getpostalcode.serializer(733497439);
                LastStopMapPinMovingBar(null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(733551813);
                LastStopMapPinBar(null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
            i3 = 1;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            i3 = 1;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new performSaveInstanceState(z, modifier, i, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX INFO: renamed from: LastStopMapPinContent-QuyCDyQ, reason: not valid java name */
    public static final void m4907LastStopMapPinContentQuyCDyQ(final boolean z, final boolean z2, final String str, final float f, final Modifier modifier, final float f2, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        ?? r6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1360422444);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            int i8 = write + 69;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(str)) {
                int i10 = write + 51;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                i6 = i10 % 2 != 0 ? 25124 : Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            int i11 = RemoteActionCompatParcelizer + 123;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                getpostalcode.serializer(f);
                throw null;
            }
            if (!getpostalcode.serializer(f)) {
                i5 = Fields.RotationZ;
            } else {
                int i12 = write + 87;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = Fields.CameraDistance;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(modifier)) {
                i4 = Fields.Clip;
            } else {
                int i14 = RemoteActionCompatParcelizer + 11;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.serializer(f2)) {
                int i16 = RemoteActionCompatParcelizer + 87;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if (!getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            Modifier modifier2 = OffsetKt.read(modifier.then(SizeKt.read), Dp.m3673constructorimpl(0.0f), f2);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i18 = write + 15;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i20 = RemoteActionCompatParcelizer + 61;
                write = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier.Companion companion3 = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new accessgetTextCentercp(23);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierGraphicsLayer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            if (!z2 || z) {
                r6 = 0;
                getpostalcode.serializer(-2141566830);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                int i21 = RemoteActionCompatParcelizer + 103;
                write = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                getpostalcode.serializer(-2141753264);
                LastStopMapToolTip(((i2 >> 6) & 14) | 48, getpostalcode, companion3, str);
                r6 = 0;
                IconCompatParcelizer.IconCompatParcelizer(companion3, Dimensions.getActionBarHideOffset, getpostalcode, false);
            }
            LastStopMapPinMarker(z, OffsetKt.read(ZIndexModifierKt.zIndex(companion3, 1.0f), Dp.m3673constructorimpl(0.0f), f), getpostalcode, i2 & 14);
            if (z) {
                getpostalcode.serializer(-2141336996);
                LastStopMapPinShadow(null, getpostalcode, r6);
                getpostalcode.IconCompatParcelizer((boolean) r6);
            } else {
                getpostalcode.serializer(-2141285102);
                getpostalcode.IconCompatParcelizer((boolean) r6);
            }
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            int i23 = RemoteActionCompatParcelizer + 49;
            write = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessgetLastLineMetrics
                private static int MediaDescriptionCompat = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i25 = 2 % 2;
                    int i26 = RatingCompat + 125;
                    MediaDescriptionCompat = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    ((Integer) obj2).getClass();
                    LastStopMapPinKt.m4907LastStopMapPinContentQuyCDyQ(z, z2, str, f, modifier, f2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i28 = RatingCompat + 99;
                    MediaDescriptionCompat = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037 A[PHI: r2 r3 r7
  0x0037: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r3v35 o.getAddressCountry) = (r3v2 o.getAddressCountry), (r3v36 o.getAddressCountry) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r7v8 int) = (r7v0 int), (r7v9 int) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r2 r3 r7
  0x0035: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r3v3 o.getAddressCountry) = (r3v2 o.getAddressCountry), (r3v36 o.getAddressCountry) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r7v1 int) = (r7v0 int), (r7v9 int) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void LastStopMapPinBar(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 69;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(621631783);
            getaddresscountry = getpostalcode.read;
            i2 = i | 58;
            if ((i2 & 4) != 3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(621631783);
            getaddresscountry = getpostalcode.read;
            i2 = i | 6;
            if ((i2 & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        if (getpostalcode.write(i2 & 1, z)) {
            modifier2 = Modifier.Companion;
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                int i6 = RemoteActionCompatParcelizer + 5;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    int i7 = 95 / 0;
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        i3 = RemoteActionCompatParcelizer + 3;
                        write = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            int i8 = 4 % 2;
                        }
                    }
                } else {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        i3 = RemoteActionCompatParcelizer + 3;
                        write = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            int i9 = 4 % 2;
                        }
                    }
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, centerHorizontally, getpostalcode, 48);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                Modifier modifierM86width3ABfNKs = SizeKt.m86width3ABfNKs(modifier2, Dimensions.setSplitBackground);
                float f = Dimensions.setStackedBackground;
                Modifier modifier3 = OffsetKt.read(SizeKt.m75height3ABfNKs(modifierM86width3ABfNKs, f), Dp.m3673constructorimpl(0.0f), Dimensions.write);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(modifier3, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
                Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier2, Dimensions.setTabContainer);
                long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme();
                getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
                Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM83size3ABfNKs, popupTheme, gettopleftannotations);
                MeasurePolicy measurePolicy2 = BoxKt.read(companion.getCenter(), false);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i10 = write + 53;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(SizeKt.m83size3ABfNKs(modifier2, f), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), gettopleftannotations), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getCenterHorizontally(), getpostalcode, 48);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor4);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier2, Dimensions.getActionBarHideOffset), Dimensions.setTransitioning), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 6);
        }
    }
}
