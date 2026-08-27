package com.roadrunner.startworking.equipment.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda26;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.enableBridgeSecurity;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.lambda310;
import o.lambda311;
import o.lambda313;
import o.lambda314;
import o.lambda315;
import o.lambda316;
import o.lambda317;
import o.lambda318;
import o.lambda322;
import o.lambda37;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.r8lambdatwlPMTrSrus3A7UmaCID8_1F1M;
import o.recordGeofenceTransitionlambda1;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EquipmentContentKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        lambda322 lambda322Var = lambda322.TITLE;
        lambda310 lambda310Var = new lambda310("Vehicle and bag", lambda322Var);
        lambda322 lambda322Var2 = lambda322.SUBTITLE;
        lambda310 lambda310Var2 = new lambda310("Vehicle type", lambda322Var2);
        lambda314 lambda314Var = new lambda314("vehicle_key", EquipmentSelectorKt.IconCompatParcelizer);
        lambda310 lambda310Var3 = new lambda310("Bag type", lambda322Var2);
        lambda314 lambda314Var2 = new lambda314("bag_key", SQLite.read(new lambda316("Big", "Big", null, false, true), new lambda316("Standard", "Standard", null, false, true), new lambda316("Small", "Small", null, false, true)));
        enableBridgeSecurity enablebridgesecurity = enableBridgeSecurity.PRIMARY_BIG;
        lambda315 lambda315Var = new lambda315(enablebridgesecurity, "save_changes", "Save changes", false);
        enableBridgeSecurity enablebridgesecurity2 = enableBridgeSecurity.TERTIARY;
        lambda315 lambda315Var2 = new lambda315(enablebridgesecurity2, "cancel_and_return", "Cancel", true);
        lambda313 lambda313Var = lambda313.IconCompatParcelizer;
        SQLite.read(lambda310Var, lambda310Var2, lambda314Var, lambda313Var, lambda310Var3, lambda314Var2, lambda315Var, lambda315Var2);
        SQLite.read(new lambda310("Vehicle and bag", lambda322Var), new lambda310("Vehicle type", lambda322Var2), new lambda314("key1", EquipmentSelectorKt.serializer), lambda313Var, new lambda310("Bag type", lambda322Var2), new lambda314("key2", SQLite.read(new lambda316("Big", "Big", null, true, true), new lambda316("Standard", "Standard", null, false, true), new lambda316("Small", "Small", null, false, true))), new lambda315(enablebridgesecurity, "save_changes", "Save changes", true), new lambda315(enablebridgesecurity2, "cancel_and_return", "Cancel", true));
        int i = serializer + 91;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3 A[PHI: r7
  0x00f3: PHI (r7v28 androidx.compose.ui.Modifier$Companion) = (r7v27 androidx.compose.ui.Modifier$Companion), (r7v32 androidx.compose.ui.Modifier$Companion) binds: [B:49:0x00f1, B:46:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[PHI: r7
  0x00fa: PHI (r7v31 androidx.compose.ui.Modifier$Companion) = (r7v27 androidx.compose.ui.Modifier$Companion), (r7v32 androidx.compose.ui.Modifier$Companion) binds: [B:49:0x00f1, B:46:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    public static final void Components(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        float f;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 105;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1342650816);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
        }
        int i9 = i2 | 3072;
        if (getpostalcode.write(i9 & 1, (i9 & 1171) != 1170)) {
            Modifier.Companion companion3 = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(-574471037);
                int i10 = 0;
                for (Object obj : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                    if (i10 >= 0) {
                        lambda311 lambda311Var = (lambda311) obj;
                        Object objComponentActivity = getpostalcode.ComponentActivity();
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        lambda313 lambda313Var = lambda313.IconCompatParcelizer;
                        if (objComponentActivity == androidContentCaptureManager) {
                            int i11 = IconCompatParcelizer + 115;
                            write = i11 % Fields.SpotShadowColor;
                            if (i11 % 2 == 0) {
                                companion2 = Modifier.Companion;
                                if (i10 == r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size()) {
                                    f = Dimensions.getActionView;
                                } else if (lambda311Var instanceof lambda310) {
                                    int i12 = IconCompatParcelizer + 93;
                                    write = i12 % Fields.SpotShadowColor;
                                    int i13 = i12 % 2;
                                    if (((lambda310) lambda311Var).read == lambda322.TITLE) {
                                        f = Dimensions.getAnimatedVisibility;
                                    } else {
                                        f = Dimensions.setStackedBackground;
                                    }
                                } else if (lambda311Var instanceof lambda314) {
                                    f = Dimensions.getAnimatedVisibility;
                                } else if (lambda311Var instanceof lambda315) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambda311Var, lambda313Var}, getCieXyz.write())).booleanValue()) {
                                        i4 = write + 1;
                                        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                                        if (i4 % 2 == 0) {
                                            f = Dimensions.getAnimatedVisibility;
                                        } else {
                                            float f2 = Dimensions.getAnimatedVisibility;
                                            throw null;
                                        }
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return;
                                    }
                                } else {
                                    i5 = write + 9;
                                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                                    if (i5 % 2 == 0) {
                                        f = Dimensions.setStackedBackground;
                                    } else {
                                        float f3 = Dimensions.setStackedBackground;
                                        throw null;
                                    }
                                }
                            } else {
                                companion2 = Modifier.Companion;
                                if (i10 == r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size() - 1) {
                                    f = Dimensions.getActionView;
                                } else if (lambda311Var instanceof lambda310) {
                                    int i14 = IconCompatParcelizer + 93;
                                    write = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                    if (((lambda310) lambda311Var).read == lambda322.TITLE) {
                                        f = Dimensions.getAnimatedVisibility;
                                    } else {
                                        f = Dimensions.setStackedBackground;
                                    }
                                } else if (lambda311Var instanceof lambda314) {
                                    f = Dimensions.getAnimatedVisibility;
                                } else if (lambda311Var instanceof lambda315) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambda311Var, lambda313Var}, getCieXyz.write())).booleanValue()) {
                                        i4 = write + 1;
                                        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                                        if (i4 % 2 == 0) {
                                            f = Dimensions.getAnimatedVisibility;
                                        } else {
                                            float f4 = Dimensions.getAnimatedVisibility;
                                            throw null;
                                        }
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return;
                                    }
                                } else {
                                    i5 = write + 9;
                                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                                    if (i5 % 2 == 0) {
                                        f = Dimensions.setStackedBackground;
                                    } else {
                                        float f5 = Dimensions.setStackedBackground;
                                        throw null;
                                    }
                                }
                            }
                            objComponentActivity = PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, f, 7);
                            getpostalcode.write(objComponentActivity);
                        }
                        Modifier modifier3 = (Modifier) objComponentActivity;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambda311Var, lambda313Var}, getCieXyz.write())).booleanValue()) {
                            getpostalcode.serializer(-1099314104);
                            i3 = i10;
                            companion = companion3;
                            DividerKt.read(0.0f, 6, 6, 0L, getpostalcode, modifier3);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            i3 = i10;
                            companion = companion3;
                            if (lambda311Var instanceof lambda310) {
                                getpostalcode.serializer(-1099308857);
                                lambda37.IconCompatParcelizer((lambda310) lambda311Var, modifier3, getpostalcode, 48);
                                getpostalcode.IconCompatParcelizer(false);
                            } else if (lambda311Var instanceof lambda315) {
                                getpostalcode.serializer(-1099302559);
                                EquipmentButtonKt.IconCompatParcelizer((lambda315) lambda311Var, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier3, getpostalcode, (i9 & 112) | 384);
                                getpostalcode.IconCompatParcelizer(false);
                            } else if (lambda311Var instanceof lambda314) {
                                getpostalcode.serializer(281612559);
                                lambda314 lambda314Var = (lambda314) lambda311Var;
                                EquipmentSelectorKt.EquipmentSelector(lambda314Var.write, removeNodeAtDepth.RemoteActionCompatParcelizer(lambda314Var.RemoteActionCompatParcelizer), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier3, getpostalcode, (i9 & 896) | 3072);
                                getpostalcode.IconCompatParcelizer(false);
                                int i16 = write + 103;
                                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                                int i17 = i16 % 2;
                            } else {
                                throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1099315943, false);
                            }
                        }
                        i10 = i3 + 1;
                        companion3 = companion;
                    } else {
                        SQLite.serializer();
                        throw null;
                    }
                }
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion3;
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdatwlPMTrSrus3A7UmaCID8_1F1M(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0242  */
    /* JADX WARN: Code duplicated, block: B:112:0x026b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0280  */
    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    public static final void EquipmentContent(lambda318 lambda318Var, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        Modifier.Companion companion;
        getQueryContext getquerycontext;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(658649044);
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 67;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 36 / 0;
                if (getpostalcode.read(lambda318Var)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            } else if (!getpostalcode.read(lambda318Var)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.SpotShadowColor : 256;
        }
        if ((i & 3072) == 0) {
            int i9 = IconCompatParcelizer + 81;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 59 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                    i4 = 2048;
                } else {
                    i4 = Fields.RotationZ;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                i4 = 2048;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        int i11 = i2 | 24576;
        if (getpostalcode.write(i11 & 1, (i11 & 9363) != 9362)) {
            Modifier.Companion companion2 = Modifier.Companion;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(lambda318Var.MediaSessionCompatQueueItem, getpostalcode, 0);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            getQueryContext getquerycontext2 = lambda318Var.MediaMetadataCompat;
            boolean z8 = (i11 & 112) == 32;
            boolean z9 = (i11 & 896) == 256;
            int i12 = i11 & 7168;
            if (i12 == 2048) {
                int i13 = write + 117;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (((z8 | z9) || z) || objComponentActivity2 == androidContentCaptureManager) {
                companion = companion2;
                getquerycontext = getquerycontext2;
                objComponentActivity2 = new NavControllerImpl$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, populateViewStructure_androidKtpopulate7, 18);
                getpostalcode.write(objComponentActivity2);
            } else {
                getquerycontext = getquerycontext2;
                companion = companion2;
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
            Modifier modifierWrite = PaddingKt.write(PagerWrapperFlingBehavior.IconCompatParcelizer(NestedScrollModifierKt.nestedScroll$default(companion, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, getpostalcode, 0, 1), null, 2, null), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14), Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(((lambda317) populateViewStructure_androidKtpopulate7Write.getValue()).write);
            int i15 = i11 & 14;
            if (i15 == 4) {
                int i16 = write + 99;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z2) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, lambda318Var, lambda318.class, "onButtonClicked", "onButtonClicked(Ljava/lang/String;)V", 0, 17);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$1);
                objComponentActivity3 = jobKt__JobKt$invokeOnCompletion$1;
            } else if (objComponentActivity3 == androidContentCaptureManager) {
                int i18 = write + 11;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$2 = new JobKt__JobKt$invokeOnCompletion$1(1, lambda318Var, lambda318.class, "onButtonClicked", "onButtonClicked(Ljava/lang/String;)V", 0, 17);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$2);
                objComponentActivity3 = jobKt__JobKt$invokeOnCompletion$2;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3);
            if (i15 == 4) {
                int i20 = write + 107;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity4 == androidContentCaptureManager) {
                recordGeofenceTransitionlambda1 recordgeofencetransitionlambda1 = new recordGeofenceTransitionlambda1(2, lambda318Var, lambda318.class, "onEquipmentClicked", "onEquipmentClicked(Ljava/lang/String;Lcom/roadrunner/startworking/equipment/EquipmentOptionViewEntity;)V", 0, 5);
                getpostalcode.write(recordgeofencetransitionlambda1);
                objComponentActivity4 = recordgeofencetransitionlambda1;
            }
            Components(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity4), null, getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
            if (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                z4 = false;
            } else {
                int i22 = write + 19;
                IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0) {
                    ((lambda317) populateViewStructure_androidKtpopulate7Write.getValue()).write.isEmpty();
                    throw null;
                }
                if (((lambda317) populateViewStructure_androidKtpopulate7Write.getValue()).write.isEmpty()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            }
            boolean zWrite = getpostalcode.write(z4);
            if (i15 == 4) {
                z5 = true;
                int i23 = write + 1;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                i3 = 2;
                int i24 = i23 % 2;
                z6 = true;
            } else {
                z5 = true;
                i3 = 2;
                z6 = false;
            }
            if (i12 == 2048) {
                int i25 = IconCompatParcelizer + 5;
                write = i25 % Fields.SpotShadowColor;
                if (i25 % i3 == 0) {
                    z7 = false;
                } else {
                    z7 = z5;
                }
            } else {
                z7 = false;
            }
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (!(zWrite | z6) && !z7) {
                int i26 = write + 73;
                IconCompatParcelizer = i26 % Fields.SpotShadowColor;
                int i27 = i26 % 2;
                if (objComponentActivity5 == androidContentCaptureManager) {
                    UserJavascriptInterfaceBase$$ExternalSyntheticLambda26 userJavascriptInterfaceBase$$ExternalSyntheticLambda26 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(z4, lambda318Var, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, populateViewStructure_androidKtpopulate7, 4);
                    getpostalcode.write(userJavascriptInterfaceBase$$ExternalSyntheticLambda26);
                    objComponentActivity5 = userJavascriptInterfaceBase$$ExternalSyntheticLambda26;
                }
            } else {
                UserJavascriptInterfaceBase$$ExternalSyntheticLambda26 userJavascriptInterfaceBase$$ExternalSyntheticLambda27 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(z4, lambda318Var, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, populateViewStructure_androidKtpopulate7, 4);
                getpostalcode.write(userJavascriptInterfaceBase$$ExternalSyntheticLambda27);
                objComponentActivity5 = userJavascriptInterfaceBase$$ExternalSyntheticLambda27;
            }
            getPhoneNumberNational.serializer(Boolean.valueOf(z4), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg((Object) lambda318Var, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, i, 29);
        }
    }
}
