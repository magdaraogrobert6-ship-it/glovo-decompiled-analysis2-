package com.roadrunner.delivery.accept.bottomsheet.overlay.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose.OverlayBodyKt;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose.OverlayHeaderKt;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.N$b;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.Iconww6aTOc;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ShortNewsContentCardView;
import o.TextMeasurerHelperKt;
import o.TextPainterKt;
import o.WindowInsetsCompatImpl;
import o.accessstripNonMetricAffectingCharacterStyleSpans;
import o.computeVerticalScrollExtent;
import o.drawTextLVfH_YU;
import o.drawTextLVfH_YUdefault;
import o.executeRequestimpl;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.rememberTextMeasurer;
import o.sensitiveContentdefault;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AcceptBottomSheetKt {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:6:0x0026 A[PHI: r1
  0x0026: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:9:0x0035, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0029 A[PHI: r1
  0x0029: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:9:0x0035, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void SheetContent(getPlatformAndroidManager getplatformandroidmanager, getPlatformAndroidManager getplatformandroidmanager2, getPlatformAndroidManager getplatformandroidmanager3, N$b n$b, TextPainterKt textPainterKt, SignInDataStore signInDataStore, p0 p0Var, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = read + 27;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(578563830);
            if ((i & 4) == 0) {
                if (getpostalcode.read(getplatformandroidmanager)) {
                    i4 = 3;
                    i5 = serializer + 3;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        i4 = 4;
                    }
                } else {
                    i4 = 2;
                }
                i2 = i4 | i;
            } else {
                i2 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(578563830);
            if ((i & 6) == 0) {
                if (getpostalcode.read(getplatformandroidmanager)) {
                    i4 = 3;
                    i5 = serializer + 3;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        i4 = 4;
                    }
                } else {
                    i4 = 2;
                }
                i2 = i4 | i;
            } else {
                i2 = i;
            }
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(getplatformandroidmanager2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(getplatformandroidmanager3)) {
                int i8 = serializer + 49;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            int i10 = serializer + 99;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(n$b) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i12 = read + 93;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(textPainterKt);
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(textPainterKt) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(signInDataStore) ^ true) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(p0Var) ? 1048576 : Fields.BlendMode;
        }
        int i13 = i2 | 12582912;
        if (!getpostalcode.write(i13 & 1, (4793491 & i13) != 4793490)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i14 = read + 63;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i16 = read + 9;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            boolean z2 = (i13 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                z = true;
                objComponentActivity = new TextMeasurerHelperKt(getplatformandroidmanager2, 1);
                getpostalcode.write(objComponentActivity);
            } else {
                z = true;
            }
            OverlayHeaderKt.OverlayHeader(signInDataStore, p0Var, OnRemeasuredModifierKt.onSizeChanged(companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), getpostalcode, (i13 >> 15) & 126);
            int i18 = i13 >> 3;
            OverlayBodyKt.OverlayBody(getplatformandroidmanager, getplatformandroidmanager3, n$b, textPainterKt, null, getpostalcode, (i18 & 7168) | (i13 & 14) | (i18 & 112) | (i18 & 896));
            getpostalcode.IconCompatParcelizer(z);
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(getplatformandroidmanager, getplatformandroidmanager2, getplatformandroidmanager3, n$b, textPainterKt, signInDataStore, p0Var, modifier2, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:6:0x0027 A[PHI: r0
  0x0027: PHI (r0v48 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v50 o.getPostalCode) binds: [B:9:0x0036, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x002a A[PHI: r0
  0x002a: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v50 o.getPostalCode) binds: [B:9:0x0036, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void AcceptBottomSheet(drawTextLVfH_YU drawtextlvfh_yu, accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans, drawTextLVfH_YUdefault drawtextlvfh_yudefault, SignInDataStore signInDataStore, N$b n$b, TextPainterKt textPainterKt, SignInDataStore signInDataStore2, p0 p0Var, TncComposableFactoryImpl$$ExternalSyntheticLambda0 tncComposableFactoryImpl$$ExternalSyntheticLambda0, executeRequestimpl executerequestimpl, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i, int i2) {
        getPostalCode getpostalcode;
        getPostalCode getpostalcode2;
        int i3;
        getPostalCode getpostalcode3;
        Modifier modifier2;
        boolean z;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean z2;
        boolean z3;
        Object objComponentActivity;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = serializer + 13;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-966255237);
            if ((i & 100) == 0) {
                if (getpostalcode.IconCompatParcelizer(drawtextlvfh_yu)) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                i3 = i7 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-966255237);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(drawtextlvfh_yu)) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                i3 = i7 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i10 = read + 97;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(accessstripnonmetricaffectingcharacterstylespans) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.read(drawtextlvfh_yudefault) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(signInDataStore) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(n$b) ? Fields.Clip : 8192;
        }
        Object obj = null;
        if ((196608 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(textPainterKt)) {
                int i12 = serializer + 117;
                read = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i6 = Fields.RenderEffect;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            int i13 = serializer + 61;
            read = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 69 / 0;
                if (getpostalcode2.IconCompatParcelizer(signInDataStore2)) {
                    i5 = 1048576;
                } else {
                    i5 = Fields.BlendMode;
                }
            } else if (getpostalcode2.IconCompatParcelizer(signInDataStore2)) {
                i5 = 1048576;
            } else {
                i5 = Fields.BlendMode;
            }
            i3 |= i5;
        }
        if ((12582912 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(p0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(tncComposableFactoryImpl$$ExternalSyntheticLambda0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            int i15 = serializer + 29;
            read = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(executerequestimpl);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i3 |= getpostalcode2.IconCompatParcelizer(executerequestimpl) ? 536870912 : 268435456;
        }
        int i16 = i3;
        int i17 = i2 | 6;
        if ((i2 & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i18 = read + 23;
                serializer = i18 % Fields.SpotShadowColor;
                i4 = i18 % 2 == 0 ? 44 : 32;
            } else {
                i4 = 16;
            }
            i17 |= i4;
        }
        int i19 = i17;
        if (getpostalcode2.write(i16 & 1, ((i16 & 306783379) == 306783378 && (i19 & 19) == 18) ? false : true)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity2 == androidContentCaptureManager2) {
                int i20 = read + 9;
                serializer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                objComponentActivity2 = CompositionKt.read(0);
                getpostalcode2.write(objComponentActivity2);
            }
            getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager2) {
                objComponentActivity3 = CompositionKt.read(0);
                getpostalcode2.write(objComponentActivity3);
            }
            getPlatformAndroidManager getplatformandroidmanager2 = (getPlatformAndroidManager) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager2) {
                objComponentActivity4 = CompositionKt.read(0);
                getpostalcode2.write(objComponentActivity4);
            }
            getPlatformAndroidManager getplatformandroidmanager3 = (getPlatformAndroidManager) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager2) {
                objComponentActivity5 = CompositionKt.read(0);
                getpostalcode2.write(objComponentActivity5);
            }
            getPlatformAndroidManager getplatformandroidmanager4 = (getPlatformAndroidManager) objComponentActivity5;
            SheetState sheetStateIconCompatParcelizer = BottomSheetScaffoldKt.IconCompatParcelizer(384, getpostalcode2, 3);
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (objComponentActivity6 == androidContentCaptureManager2) {
                objComponentActivity6 = new SnackbarHostState();
                getpostalcode2.write(objComponentActivity6);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objComponentActivity6;
            boolean z4 = getpostalcode2.read(sheetStateIconCompatParcelizer);
            boolean z5 = getpostalcode2.read(snackbarHostState);
            Object objComponentActivity7 = getpostalcode2.ComponentActivity();
            if ((z4 | z5) || objComponentActivity7 == androidContentCaptureManager2) {
                objComponentActivity7 = new sensitiveContentdefault(sheetStateIconCompatParcelizer, snackbarHostState);
                getpostalcode2.write(objComponentActivity7);
            }
            sensitiveContentdefault sensitivecontentdefault = (sensitiveContentdefault) objComponentActivity7;
            Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(SizeKt.IconCompatParcelizer(companion, null, 3), Color.Companion.m757getTransparent0d7_KjU(), RectangleShapeKt.getRectangleShape()), PaddingKt.m72PaddingValuesa9UjIt4$default(13, Dp.m3673constructorimpl(Dimensions.setTabContainer + Dimensions.setTitleOptional), 0.0f, 0.0f));
            rememberTextMeasurer remembertextmeasurer = new rememberTextMeasurer(getplatformandroidmanager4, getplatformandroidmanager2, sensitivecontentdefault, getplatformandroidmanager3, signInDataStore, drawtextlvfh_yudefault, drawtextlvfh_yu, accessstripnonmetricaffectingcharacterstylespans, tncComposableFactoryImpl$$ExternalSyntheticLambda0, getplatformandroidmanager, n$b, textPainterKt, signInDataStore2, p0Var);
            getpostalcode3 = getpostalcode2;
            Iconww6aTOc.serializer(modifierIconCompatParcelizer, null, false, ExtrasKt.write(573055845, remembertextmeasurer, getpostalcode3), getpostalcode3, 3072, 6);
            boolean zRemoteActionCompatParcelizer = sensitivecontentdefault.write.RemoteActionCompatParcelizer();
            if ((i16 & 1879048192) == 536870912) {
                int i22 = read + 61;
                serializer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity8 = getpostalcode3.ComponentActivity();
            if (!(!z)) {
                androidContentCaptureManager = androidContentCaptureManager2;
            } else {
                androidContentCaptureManager = androidContentCaptureManager2;
                if (objComponentActivity8 == androidContentCaptureManager) {
                }
                getPhoneNumberNational.serializer(Boolean.valueOf(zRemoteActionCompatParcelizer), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, getpostalcode3);
                SheetState sheetState = sensitivecontentdefault.write;
                z2 = getpostalcode3.read(sensitivecontentdefault);
                z3 = (i19 & 112) == 32;
                objComponentActivity = getpostalcode3.ComponentActivity();
                if (!(z2 | z3) || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new BridgeManager$trackEvent$2(sensitivecontentdefault, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (ShortNewsContentCardView) null, 12);
                    getpostalcode3.write(objComponentActivity);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, sheetState, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
                modifier2 = companion;
            }
            objComponentActivity8 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(10, executerequestimpl);
            getpostalcode3.write(objComponentActivity8);
            getPhoneNumberNational.serializer(Boolean.valueOf(zRemoteActionCompatParcelizer), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, getpostalcode3);
            SheetState sheetState2 = sensitivecontentdefault.write;
            z2 = getpostalcode3.read(sensitivecontentdefault);
            if ((i19 & 112) == 32) {
            }
            objComponentActivity = getpostalcode3.ComponentActivity();
            if (!z2 && !z3) {
                objComponentActivity = new BridgeManager$trackEvent$2(sensitivecontentdefault, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (ShortNewsContentCardView) null, 12);
                getpostalcode3.write(objComponentActivity);
            } else {
                objComponentActivity = new BridgeManager$trackEvent$2(sensitivecontentdefault, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (ShortNewsContentCardView) null, 12);
                getpostalcode3.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, sheetState2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            modifier2 = companion;
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new WindowInsetsCompatImpl(drawtextlvfh_yu, accessstripnonmetricaffectingcharacterstylespans, drawtextlvfh_yudefault, signInDataStore, n$b, textPainterKt, signInDataStore2, p0Var, tncComposableFactoryImpl$$ExternalSyntheticLambda0, executerequestimpl, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, i2);
        }
    }
}
