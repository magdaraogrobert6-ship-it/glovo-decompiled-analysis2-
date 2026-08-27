package com.roadrunner.opportunities.calendar;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda2;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import io.sentry.SentryUUID;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.internalPathIteratorPeek;
import o.p7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.ta;
import o.tc;
import o.te;
import o.toAndroidVertexModeJOOmi9M;
import o.trigger;
import o.wdefault;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BonusCalendarScreenKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    public static final void RemoteActionCompatParcelizer(wdefault wdefaultVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 23;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1674319365);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(wdefaultVar)) {
                int i7 = RemoteActionCompatParcelizer + 117;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                int i9 = serializer + 71;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = serializer + 97;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i13 = i2 | 384;
        if (getpostalcode.write(i13 & 1, (i13 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            boolean z = (i13 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!z) {
                int i14 = RemoteActionCompatParcelizer + 3;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 14);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 14);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(wdefaultVar);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer) {
                objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda2(3, wdefaultVar);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i16 = RemoteActionCompatParcelizer + 107;
                serializer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda2(3, wdefaultVar);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            AndroidView_androidKt.AndroidView(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0, 0);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i17 = RemoteActionCompatParcelizer;
        int i18 = i17 + 87;
        serializer = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        int i20 = i17 + 69;
        serializer = i20 % Fields.SpotShadowColor;
        if (i20 % 2 == 0) {
            getpostalcode.MediaDescriptionCompat();
            throw null;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 28, wdefaultVar, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    public static final void IconCompatParcelizer(String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-446949823);
        if ((i & 6) == 0) {
            int i8 = RemoteActionCompatParcelizer + 25;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode2.read(str)) {
                int i10 = serializer + 91;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = serializer + 107;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                if (getpostalcode2.read(str2)) {
                    i5 = 32;
                } else {
                    i5 = 16;
                }
            } else {
                int i13 = 10 / 0;
                if (getpostalcode2.read(str2)) {
                    i5 = 32;
                } else {
                    i5 = 16;
                }
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = serializer + 77;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i16 = serializer + 95;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i3 = Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
            } else {
                int i17 = 12 / 0;
                if (!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i3 = Fields.RotationZ;
                } else {
                    i3 = Fields.CameraDistance;
                }
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 1171) != 1170)) {
            int i18 = i2 << 3;
            getpostalcode = getpostalcode2;
            HeaderKt.m5063HeaderbbrV0mI(null, str, str2, 0L, 0.0f, ExtrasKt.write(789183490, new trigger(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode2), ExtrasKt.write(-966330503, new DefaultLazyKey(20, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2), null, null, getpostalcode2, (i18 & 112) | 1769472 | (i18 & 896), 409);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i, 11);
        }
    }

    public static final void BonusCalendarContent(tc tcVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, wdefault wdefaultVar, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        tcVar.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        wdefaultVar.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-974441764);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(tcVar) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i6 = serializer + 29;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(wdefaultVar)) {
                int i7 = RemoteActionCompatParcelizer + 81;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            int i9 = RemoteActionCompatParcelizer + 27;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (getpostalcode2.read(modifier)) {
                int i11 = serializer + 7;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i13 = i2;
        if ((74899 & i13) != 74898) {
            int i14 = serializer + 37;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i13 & 1, z)) {
            int i16 = RemoteActionCompatParcelizer + 7;
            serializer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
                int i18 = RemoteActionCompatParcelizer + 37;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            IconCompatParcelizer(tcVar.read(), tcVar.IconCompatParcelizer(), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, (i13 & 896) | ((i13 << 6) & 7168));
            RemoteActionCompatParcelizer(wdefaultVar, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode2, ((i13 >> 12) & 14) | ((i13 >> 6) & 112));
            getpostalcode = getpostalcode2;
            DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(tcVar.RemoteActionCompatParcelizer(), null, null, null, ExtrasKt.write(-354672294, new StringsKt__StringsKt$$ExternalSyntheticLambda1(2, tcVar), getpostalcode), getpostalcode, 24576, 14);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) tcVar, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) wdefaultVar, modifier, i, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d A[PHI: r1
  0x006d: PHI (r1v22 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v24 o.getPostalCode) binds: [B:8:0x0047, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:9:0x0049 A[PHI: r1
  0x0049: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v24 o.getPostalCode) binds: [B:8:0x0047, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static final void serializer(wdefault wdefaultVar, BonusCalendarViewModel bonusCalendarViewModel, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        Modifier modifier2;
        boolean z;
        SnackbarHostState snackbarHostState;
        AndroidContentCaptureManager androidContentCaptureManager;
        ?? r5;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 105;
        serializer = i6 % Fields.SpotShadowColor;
        Object obj = null;
        if (i6 % 2 == 0) {
            wdefaultVar.getClass();
            bonusCalendarViewModel.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(798688959);
            if ((i & 112) == 0) {
                i2 = RemoteActionCompatParcelizer + 25;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    getpostalcode.IconCompatParcelizer(wdefaultVar);
                    throw null;
                }
                if (getpostalcode.IconCompatParcelizer(wdefaultVar)) {
                    int i7 = RemoteActionCompatParcelizer + 99;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i4 = i;
            }
        } else {
            wdefaultVar.getClass();
            bonusCalendarViewModel.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(798688959);
            if ((i & 6) == 0) {
                i2 = RemoteActionCompatParcelizer + 25;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    getpostalcode.IconCompatParcelizer(wdefaultVar);
                    throw null;
                }
                if (getpostalcode.IconCompatParcelizer(wdefaultVar)) {
                    int i9 = RemoteActionCompatParcelizer + 99;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(bonusCalendarViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i11 = serializer + 113;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                obj.hashCode();
                throw null;
            }
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 2048 : Fields.RotationZ;
        }
        int i12 = i4 | 24576;
        if (getpostalcode2.write(i12 & 1, (i12 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager2) {
                objComponentActivity = new SnackbarHostState();
                getpostalcode2.write(objComponentActivity);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager2) {
                int i13 = RemoteActionCompatParcelizer + 31;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    getpostalcode2.write(CompositionKt.RemoteActionCompatParcelizer(null));
                    throw null;
                }
                objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode2.write(objComponentActivity2);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager2) {
                int i14 = serializer + 55;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    getpostalcode2.write(getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2));
                    throw null;
                }
                objComponentActivity3 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity3);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity3;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(bonusCalendarViewModel.MediaDescriptionCompat, getpostalcode2, 0);
            getQueryContext getquerycontext = bonusCalendarViewModel.RatingCompat;
            if ((i12 & 7168) == 2048) {
                int i15 = RemoteActionCompatParcelizer + 89;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = (i12 & 896) == 256;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (!(z2 | z) && !zIconCompatParcelizer) {
                int i17 = RemoteActionCompatParcelizer + 115;
                serializer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (objComponentActivity4 == androidContentCaptureManager2) {
                    snackbarHostState = snackbarHostState2;
                    androidContentCaptureManager = androidContentCaptureManager2;
                    r5 = 0;
                    objComponentActivity4 = new toAndroidVertexModeJOOmi9M(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getcontentviewgroupparentlayout, populateViewStructure_androidKtpopulate7, snackbarHostState, 9);
                    getpostalcode2.write(objComponentActivity4);
                } else {
                    snackbarHostState = snackbarHostState2;
                    androidContentCaptureManager = androidContentCaptureManager2;
                    r5 = 0;
                }
            } else {
                snackbarHostState = snackbarHostState2;
                androidContentCaptureManager = androidContentCaptureManager2;
                r5 = 0;
                objComponentActivity4 = new toAndroidVertexModeJOOmi9M(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getcontentviewgroupparentlayout, populateViewStructure_androidKtpopulate7, snackbarHostState, 9);
                getpostalcode2.write(objComponentActivity4);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode2, 8);
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(bonusCalendarViewModel);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new ta(bonusCalendarViewModel, r5);
                getpostalcode2.write(objComponentActivity5);
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(r5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, getpostalcode2, r5, 1);
            modifier2 = companion;
            getpostalcode3 = getpostalcode2;
            ScaffoldKt.serializer(null, null, null, ExtrasKt.write(-1862649415, new te(snackbarHostState, populateViewStructure_androidKtpopulate7, r5), getpostalcode2), null, 0, 0L, 0L, null, ExtrasKt.write(-1688260464, new PreviewActivity$$ExternalSyntheticLambda2(bonusCalendarViewModel, wdefaultVar, modifier2, populateViewStructure_androidKtpopulate7Write, 4), getpostalcode3), getpostalcode3, 805309440, 503);
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(i, 9, modifier2, wdefaultVar, bonusCalendarViewModel, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
