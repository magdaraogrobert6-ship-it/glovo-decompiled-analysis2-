package com.roadrunner.appmigration.presentation.compose;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda2;
import androidx.compose.ui.unit.Dp;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.hg$$ExternalSyntheticLambda5;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.appmigration.presentation.AppMigrationUiModelImpl;
import com.roadrunner.appmigration.presentation.compose.AppMigrationKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.SemanticsModifierDefaultImpls;
import o.SemanticsNodeKt;
import o.SemanticsNodeemitFakeNodesfakeNode2;
import o.accessaddSemanticsPropertiesFrom;
import o.buildMapping;
import o.clearAndSetSemantics;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda0;
import o.show;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppMigrationKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static final void AppMigrationContainer(clearAndSetSemantics clearandsetsemantics, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 67;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-370324577);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(clearandsetsemantics) : getpostalcode.IconCompatParcelizer(clearandsetsemantics)) {
                int i8 = IconCompatParcelizer + 91;
                write = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i9 = write + 9;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
            int i11 = IconCompatParcelizer + 5;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        int i13 = i2 | 24576;
        Object obj = null;
        if (getpostalcode.write(i13 & 1, (i13 & 9363) != 9362)) {
            int i14 = write + 111;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.m76heightInVpY3zN4$default(SizeKt.write(companion, 1.0f), 0.0f, Dp.m3673constructorimpl(Dp.m3673constructorimpl(((Configuration) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp) * 0.9f), 1), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
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
            AppMigrationBodyKt.AppMigrationBody(clearandsetsemantics, PagerWrapperFlingBehavior.IconCompatParcelizer(companion.then(new show(1.0f, false)), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14), getpostalcode, i13 & 14);
            SemanticsNodeemitFakeNodesfakeNode2 semanticsNodeemitFakeNodesfakeNode2 = AppMigrationActionsKt.read(clearandsetsemantics);
            float f = Dimensions.getAnimatedVisibility;
            AppMigrationActionsKt.AppMigrationActions(semanticsNodeemitFakeNodesfakeNode2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, PaddingKt.m74paddingqDBjuR0$default(companion, f, 0.0f, f, Dimensions.setTabContainer, 2), getpostalcode, i13 & 8176);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) clearandsetsemantics, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier2, i, 5);
        }
        int i16 = IconCompatParcelizer + 87;
        write = i16 % Fields.SpotShadowColor;
        if (i16 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0140 A[PHI: r7
  0x0140: PHI (r7v14 boolean) = (r7v13 boolean), (r7v15 boolean) binds: [B:77:0x013d, B:74:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0172  */
    /* JADX WARN: Code duplicated, block: B:85:0x0174  */
    /* JADX WARN: Code duplicated, block: B:88:0x017b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x018a  */
    /* JADX WARN: Code duplicated, block: B:93:0x018b  */
    public static final void AppMigration(final SemanticsModifierDefaultImpls semanticsModifierDefaultImpls, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        clearAndSetSemantics clearandsetsemantics;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objComponentActivity;
        int i3;
        int i4 = 2 % 2;
        semanticsModifierDefaultImpls.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-465455550);
        if ((i & 6) == 0) {
            int i5 = write + 113;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode2.read(semanticsModifierDefaultImpls) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 256 : Fields.SpotShadowColor;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
            accessaddSemanticsPropertiesFrom accessaddsemanticspropertiesfrom = (accessaddSemanticsPropertiesFrom) ExtrasKt.write(((AppMigrationUiModelImpl) semanticsModifierDefaultImpls).MediaMetadataCompat, getpostalcode2, 0).getValue();
            Object obj = null;
            if (accessaddsemanticspropertiesfrom instanceof clearAndSetSemantics) {
                int i7 = IconCompatParcelizer + 45;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    clearandsetsemantics = (clearAndSetSemantics) accessaddsemanticspropertiesfrom;
                } else {
                    obj.hashCode();
                    throw null;
                }
            } else {
                clearandsetsemantics = null;
            }
            if (clearandsetsemantics == null) {
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i8 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SemanticsNodeemitFakeNodesfakeNode1
                    private static int MediaMetadataCompat = 1;
                    private static int MediaSessionCompatQueueItem;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj2, Object obj3) {
                        int i9 = 2 % 2;
                        int i10 = MediaSessionCompatQueueItem + 69;
                        MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        int i12 = i8;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i13 = i;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                        SemanticsModifierDefaultImpls semanticsModifierDefaultImpls2 = semanticsModifierDefaultImpls;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                        ((Integer) obj3).intValue();
                        if (i12 != 0) {
                            AppMigrationKt.AppMigration(semanticsModifierDefaultImpls2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i13 | 1));
                            return createfromparcel;
                        }
                        AppMigrationKt.AppMigration(semanticsModifierDefaultImpls2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i13 | 1));
                        int i14 = MediaMetadataCompat + 109;
                        MediaSessionCompatQueueItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i14 % 2 == 0) {
                            return createfromparcel;
                        }
                        throw null;
                    }
                };
            } else {
                int i9 = i2 & 14;
                boolean z5 = i9 == 4;
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(clearandsetsemantics);
                boolean z6 = (i2 & 896) == 256;
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!(!(z5 | zIconCompatParcelizer | z6)) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new n$$ExternalSyntheticLambda3(semanticsModifierDefaultImpls, clearandsetsemantics, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 15);
                    getpostalcode2.write(objComponentActivity2);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
                boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(clearandsetsemantics);
                boolean z7 = (i2 & 112) == 32;
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                if ((z7 | zIconCompatParcelizer2) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new ViewUtils$$ExternalSyntheticLambda6(clearandsetsemantics, 6, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    getpostalcode2.write(objComponentActivity3);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
                int i10 = SemanticsNodeKt.IconCompatParcelizer[clearandsetsemantics.MediaSessionCompatQueueItem.ordinal()];
                if (i10 == 1) {
                    clearAndSetSemantics clearandsetsemantics2 = clearandsetsemantics;
                    getpostalcode2.serializer(2063781374);
                    Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new hg$$ExternalSyntheticLambda5(21);
                        getpostalcode2.write(objComponentActivity4);
                    }
                    SheetState sheetStateRemoteActionCompatParcelizer = ModalBottomSheetKt.RemoteActionCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode2, 54, 0);
                    long jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(Color.Companion.m748getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                    float f = Dimensions.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    getTopLeftannotations gettopleftannotationsM97RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12);
                    long jIconCompatParcelizer = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
                    Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode2.write(objComponentActivity5);
                    }
                    getpostalcode = getpostalcode2;
                    ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, null, sheetStateRemoteActionCompatParcelizer, 0.0f, false, gettopleftannotationsM97RoundedCornerShapea9UjIt4$default, jIconCompatParcelizer, 0L, 0.0f, jM721copywmQWz5c$default, null, null, null, ExtrasKt.write(-2134388584, new PreviewActivity$$ExternalSyntheticLambda2(clearandsetsemantics2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, semanticsModifierDefaultImpls, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 2), getpostalcode2), getpostalcode, 805306374, 3078, 6554);
                    getpostalcode.IconCompatParcelizer(false);
                } else if (i10 == 2) {
                    getpostalcode2.serializer(-626135687);
                    if (i9 == 4) {
                        int i11 = IconCompatParcelizer + 93;
                        write = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    Object objComponentActivity6 = getpostalcode2.ComponentActivity();
                    if (!z) {
                        int i13 = write + 59;
                        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            z2 = false;
                            int i14 = 59 / 0;
                            if (objComponentActivity6 != androidContentCaptureManager) {
                                z3 = z2;
                            }
                        } else {
                            z2 = false;
                            if (objComponentActivity6 != androidContentCaptureManager) {
                                z3 = z2;
                            }
                        }
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity6);
                        if (i9 == 4) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        objComponentActivity = getpostalcode2.ComponentActivity();
                        if (!z4) {
                            i3 = write + 73;
                            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 != 0) {
                                throw null;
                            }
                            if (objComponentActivity == androidContentCaptureManager) {
                                MapboxNavigation.AnonymousClass15 anonymousClass15 = new MapboxNavigation.AnonymousClass15(0, semanticsModifierDefaultImpls, SemanticsModifierDefaultImpls.class, "onSecondaryCtaClick", "onSecondaryCtaClick()V", 0, 7);
                                getpostalcode2.write(anonymousClass15);
                                objComponentActivity = anonymousClass15;
                            }
                        } else {
                            MapboxNavigation.AnonymousClass15 anonymousClass16 = new MapboxNavigation.AnonymousClass15(0, semanticsModifierDefaultImpls, SemanticsModifierDefaultImpls.class, "onSecondaryCtaClick", "onSecondaryCtaClick()V", 0, 7);
                            getpostalcode2.write(anonymousClass16);
                            objComponentActivity = anonymousClass16;
                        }
                        AppMigrationFullScreenKt.AppMigrationFullScreen(clearandsetsemantics, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), null, getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(z3);
                        getpostalcode = getpostalcode2;
                    } else {
                        z2 = false;
                    }
                    z3 = z2;
                    MapboxNavigation.AnonymousClass15 anonymousClass17 = new MapboxNavigation.AnonymousClass15(0, semanticsModifierDefaultImpls, SemanticsModifierDefaultImpls.class, "onSecondaryCtaClick", "onSecondaryCtaClick()V", 0, 6);
                    getpostalcode2.write(anonymousClass17);
                    objComponentActivity6 = anonymousClass17;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity6);
                    if (i9 == 4) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    if (!z4) {
                        i3 = write + 73;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                        if (objComponentActivity == androidContentCaptureManager) {
                            MapboxNavigation.AnonymousClass15 anonymousClass18 = new MapboxNavigation.AnonymousClass15(0, semanticsModifierDefaultImpls, SemanticsModifierDefaultImpls.class, "onSecondaryCtaClick", "onSecondaryCtaClick()V", 0, 7);
                            getpostalcode2.write(anonymousClass18);
                            objComponentActivity = anonymousClass18;
                        }
                    } else {
                        MapboxNavigation.AnonymousClass15 anonymousClass19 = new MapboxNavigation.AnonymousClass15(0, semanticsModifierDefaultImpls, SemanticsModifierDefaultImpls.class, "onSecondaryCtaClick", "onSecondaryCtaClick()V", 0, 7);
                        getpostalcode2.write(anonymousClass19);
                        objComponentActivity = anonymousClass19;
                    }
                    AppMigrationFullScreenKt.AppMigrationFullScreen(clearandsetsemantics, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), null, getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(z3);
                    getpostalcode = getpostalcode2;
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, -626164821, false);
                }
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode = getpostalcode2;
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i15 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SemanticsNodeemitFakeNodesfakeNode1
                private static int MediaMetadataCompat = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i16 = 2 % 2;
                    int i17 = MediaSessionCompatQueueItem + 69;
                    MediaMetadataCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    int i19 = i15;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i110 = i;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    SemanticsModifierDefaultImpls semanticsModifierDefaultImpls2 = semanticsModifierDefaultImpls;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                    ((Integer) obj3).intValue();
                    if (i19 != 0) {
                        AppMigrationKt.AppMigration(semanticsModifierDefaultImpls2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i110 | 1));
                        return createfromparcel;
                    }
                    AppMigrationKt.AppMigration(semanticsModifierDefaultImpls2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i110 | 1));
                    int i111 = MediaMetadataCompat + 109;
                    MediaSessionCompatQueueItem = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i111 % 2 == 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }
}
