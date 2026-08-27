package com.roadrunner.delivery.accept.laststop.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.drawText;
import o.getBirthDateFull;
import o.getClipBounds;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.getSaveCount;
import o.getTopLeftannotations;
import o.get_nativeCanvasui_text;
import o.handleUrlOverridelambda1;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LastStopAddressManageBottomSheetKt {
    private static int read = 1;
    private static int write;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.ui.Modifier$Companion] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier] */
    public static final void LastStopAddressManageBottomSheet(LastStopOptionUiModelImpl lastStopOptionUiModelImpl, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        ?? r1;
        boolean z;
        int i3 = 2 % 2;
        int i4 = write + 15;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        lastStopOptionUiModelImpl.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1560054394);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(lastStopOptionUiModelImpl) ? 4 : 2) | i;
        } else {
            int i6 = write + 49;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = i;
        }
        int i8 = i2 | 48;
        if (getpostalcode2.write(i8 & 1, (i8 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            getClipBounds getclipbounds = (getClipBounds) ExtrasKt.write(lastStopOptionUiModelImpl.PlaybackStateCompat, getpostalcode2, 0).getValue();
            SheetState sheetStateRemoteActionCompatParcelizer = ModalBottomSheetKt.RemoteActionCompatParcelizer(null, getpostalcode2, 0, 3);
            if (getclipbounds instanceof get_nativeCanvasui_text) {
                getpostalcode2.serializer(-268676598);
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode = getpostalcode2;
                r1 = companion;
            } else {
                if (!(getclipbounds instanceof drawText)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, -268677666, false);
                }
                getpostalcode2.serializer(261086288);
                getSaveCount getsavecount = ((drawText) getclipbounds).IconCompatParcelizer;
                if (getsavecount == null) {
                    int i9 = read + 101;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    getpostalcode2.serializer(261086287);
                    getpostalcode2.IconCompatParcelizer(false);
                    getpostalcode = getpostalcode2;
                    z = false;
                } else {
                    getpostalcode2.serializer(261086288);
                    float f = Dimensions.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    getTopLeftannotations gettopleftannotationsM97RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12);
                    boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(lastStopOptionUiModelImpl);
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                        MapboxNavigation.AnonymousClass15 anonymousClass15 = new MapboxNavigation.AnonymousClass15(0, lastStopOptionUiModelImpl, LastStopOptionUiModelImpl.class, "dismissBottomSheet", "dismissBottomSheet()V", 0, 24);
                        getpostalcode2.write(anonymousClass15);
                        int i11 = read + 3;
                        write = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        objComponentActivity = anonymousClass15;
                    }
                    z = false;
                    getpostalcode = getpostalcode2;
                    ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), SizeKt.write(companion, 1.0f), sheetStateRemoteActionCompatParcelizer, 0.0f, false, gettopleftannotationsM97RoundedCornerShapea9UjIt4$default, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, 0.0f, 0L, null, null, null, ExtrasKt.write(1324831507, new PagerDefaults$$ExternalSyntheticLambda0(getsavecount, 8, lastStopOptionUiModelImpl), getpostalcode2), getpostalcode, 0, 3078, 7064);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z);
                r1 = companion;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r1 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(lastStopOptionUiModelImpl, (Modifier) r1, i, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    /* JADX WARN: Code duplicated, block: B:17:0x006d A[PHI: r2
  0x006d: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003e A[PHI: r2
  0x003e: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void LastStopAddressManageContent(getSaveCount getsavecount, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        Modifier modifier2;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 29;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            getsavecount.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2090262306);
            if ((i & 127) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getsavecount);
                    int i7 = read + 47;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    int i9 = read + 57;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    zIconCompatParcelizer = getpostalcode.read(getsavecount);
                }
                if (zIconCompatParcelizer) {
                    int i11 = write + 89;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getsavecount.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2090262306);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getsavecount);
                    int i13 = read + 47;
                    write = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                } else {
                    int i15 = read + 57;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    zIconCompatParcelizer = getpostalcode.read(getsavecount);
                }
                if (zIconCompatParcelizer) {
                    int i17 = write + 89;
                    read = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i19 = write + 95;
            read = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i21 = write + 105;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i23 = i3 | 3072;
        if (getpostalcode.write(i23 & 1, (i23 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.setTabContainer;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifierM20backgroundbw27NRU, f, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
                TextKt.m131TextNvy7gAk(getsavecount.MediaDescriptionCompat, companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 131064);
                float f2 = Dimensions.setTransitioning;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f2)});
                String str = getsavecount.IconCompatParcelizer;
                boolean z = getsavecount.RemoteActionCompatParcelizer;
                Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                modifierWrite.getClass();
                getPostalCode getpostalcode2 = getpostalcode;
                isValidParameter.RemoteActionCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite, z, false, null, null, null, null, getpostalcode2, (i23 & 112) | 384, 1008);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
                String str2 = getsavecount.MediaBrowserCompatMediaItem;
                boolean z2 = getsavecount.write;
                Modifier modifierWrite2 = SizeKt.write(companion, 1.0f);
                modifierWrite2.getClass();
                isValidParameter.RemoteActionCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifierWrite2, z2, false, null, null, null, null, getpostalcode2, ((i23 >> 3) & 112) | 384, 1008);
                IconCompatParcelizer.IconCompatParcelizer(companion, f2, getpostalcode, true);
                modifier2 = companion;
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) getsavecount, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 10);
        }
    }
}
