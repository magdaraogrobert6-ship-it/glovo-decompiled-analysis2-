package com.roadrunner.customerchat.selfservice.presentation.screen;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.UiMediaScopeImpl;
import o.b9;
import o.createFromParcel;
import o.findParagraphByIndex;
import o.generatePOSTBodyString;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getParagraph;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.toGlobal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerChatWebChatContainerKt {
    private static int serializer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    public static final void write(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getParagraph getparagraph, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        ?? r0;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1790903613);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i5 = write + 109;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 |= getpostalcode2.read(getparagraph) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i7 = write + 125;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            int i8 = serializer + 103;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 24 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                    i3 = 1048576;
                } else {
                    i3 = Fields.BlendMode;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                i3 = 1048576;
            } else {
                i3 = Fields.BlendMode;
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, (599187 & i2) != 599186)) {
            int i10 = serializer + 47;
            int i11 = i10 % Fields.SpotShadowColor;
            write = i11;
            int i12 = i10 % 2;
            if ((i2 & 14) == 4) {
                int i13 = i11 + 25;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            Object obj2 = getCreditCardExpirationMonth.write;
            if (z) {
                objComponentActivity = new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 3);
                getpostalcode2.write(objComponentActivity);
            } else {
                int i15 = serializer + 65;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity == obj2) {
                    objComponentActivity = new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 3);
                    getpostalcode2.write(objComponentActivity);
                }
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            dragAndDropTargetModifierNode.invoke(getpostalcode2, Integer.valueOf((i2 >> 3) & 14));
            String str = getparagraph.RatingCompat;
            toGlobal toglobal = getparagraph.RemoteActionCompatParcelizer;
            boolean z3 = getparagraph.IconCompatParcelizer;
            boolean z4 = (i2 & 7168) == 2048;
            int i16 = i2 & 896;
            if (i16 == 256) {
                int i17 = serializer + 69;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                z2 = true;
            } else {
                int i19 = write + 25;
                serializer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z2 = false;
            }
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if ((z4 | z2) || objComponentActivity2 == obj2) {
                objComponentActivity2 = new LocalAuthDataSource.AnonymousClass2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getparagraph, null, 11);
                getpostalcode2.write(objComponentActivity2);
            }
            getPhoneNumberNational.serializer(str, Boolean.valueOf(z3), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2, getpostalcode2);
            boolean z5 = i16 == 256;
            boolean z6 = (57344 & i2) == 16384;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if ((z5 | z6) || objComponentActivity3 == obj2) {
                objComponentActivity3 = new LocalAuthDataSource.AnonymousClass2(getparagraph, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, 12);
                getpostalcode2.write(objComponentActivity3);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, toglobal, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
            if (toglobal != null) {
                int i21 = serializer + 77;
                write = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                getpostalcode2.serializer(726680617);
                int i23 = i2 >> 15;
                CustomerChatErrorScreenKt.CustomerChatErrorScreen(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, Modifier.Companion.then(SizeKt.read), getpostalcode2, (i23 & 14) | 384 | (i23 & 112));
                r0 = 0;
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                r0 = 0;
                getpostalcode2.serializer(726830533);
                getpostalcode2.IconCompatParcelizer(false);
            }
            if (!(!getparagraph.read)) {
                getpostalcode2.serializer(726899322);
                HelpCenterLoadingScreenKt.CustomerChatLoadingScreen(null, getpostalcode2, r0);
                getpostalcode2.IconCompatParcelizer((boolean) r0);
            } else {
                getpostalcode2.serializer(726940645);
                getpostalcode2.IconCompatParcelizer((boolean) r0);
            }
            if (getparagraph.serializer) {
                getpostalcode2.serializer(727071620);
                generatePOSTBodyString generatepostbodystring = new generatePOSTBodyString(StringResources_androidKt.stringResource(R.string.dialog_string_phone_title, getpostalcode2, r0), false, StringResources_androidKt.stringResource(R.string.all_downloading, getpostalcode2, r0), null, null, null, 60, null);
                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (objComponentActivity4 == obj2) {
                    objComponentActivity4 = new b8$$ExternalSyntheticLambda4(1);
                    getpostalcode2.write(objComponentActivity4);
                }
                getPostalCode getpostalcode3 = getpostalcode2;
                MessagePopUpKt.serializer(generatepostbodystring, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, null, false, null, null, null, null, null, getpostalcode3, 48, 508);
                getpostalcode3.IconCompatParcelizer((boolean) r0);
                getpostalcode = getpostalcode3;
            } else {
                getPostalCode getpostalcode4 = getpostalcode2;
                getpostalcode4.serializer(727410853);
                getpostalcode4.IconCompatParcelizer((boolean) r0);
                getpostalcode = getpostalcode4;
            }
        } else {
            getPostalCode getpostalcode5 = getpostalcode2;
            getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode5;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dragAndDropTargetModifierNode, getparagraph, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, i, 3);
        }
    }

    public static final void CustomerChatWebChatContainer(findParagraphByIndex findparagraphbyindex, getParagraph getparagraph, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier.Companion companion;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        findparagraphbyindex.getClass();
        getparagraph.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k4.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k5.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1401960942);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(findparagraphbyindex) ? 4 : 2) | i;
            int i6 = serializer + 51;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(getparagraph) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !(getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i8 = serializer + 29;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i9 = serializer + 91;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            int i11 = serializer + 79;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4)) {
                int i13 = write + 95;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    throw null;
                }
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k5) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 536870912 : 268435456;
        }
        int i14 = i2;
        if (getpostalcode2.write(i14 & 1, (306783379 & i14) != 306783378)) {
            Modifier.Companion companion2 = Modifier.Companion;
            FillElement fillElement = SizeKt.read;
            Modifier modifierThen = companion2.then(fillElement);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion3.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{findparagraphbyindex.write, Boolean.TRUE}, getCieXyz.write())).booleanValue();
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
            if (zBooleanValue) {
                getpostalcode2.serializer(-1308665026);
                getpostalcode = getpostalcode2;
                write(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dragAndDropTargetModifierNode, getparagraph, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getpostalcode2, ((i14 >> 6) & 14) | ((i14 >> 24) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14));
                String str = getparagraph.RatingCompat;
                if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) || getparagraph.read) {
                    getpostalcode.serializer(-1308135825);
                    float f = Dimensions.setMenu;
                    HeaderKt.read(R.drawable.ic_arrow_left, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, boxScopeInstance.align(PaddingKt.m74paddingqDBjuR0$default(companion2, f, f, 0.0f, 0.0f, 12), companion3.getTopStart()), false, null, getpostalcode, (i14 >> 12) & 112, 24);
                    z = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i15 = serializer + 9;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    getpostalcode.serializer(-1307802358);
                    z = false;
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-1307761035);
                if (findparagraphbyindex.serializer) {
                    int i17 = write + 73;
                    serializer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    getpostalcode.serializer(-1307665617);
                    HelpCenterLoadingScreenKt.CustomerChatLoadingScreen(null, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1307608918);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (findparagraphbyindex.IconCompatParcelizer) {
                    getpostalcode.serializer(-1307559380);
                    companion = companion2;
                    int i19 = i14 >> 21;
                    CustomerChatErrorScreenKt.CustomerChatErrorScreen(r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, companion.then(fillElement), getpostalcode, (i19 & 14) | 384 | (i19 & 112));
                    getpostalcode.IconCompatParcelizer(false);
                    int i20 = serializer + 21;
                    write = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                } else {
                    companion = companion2;
                    getpostalcode.serializer(-1307346038);
                    getpostalcode.IconCompatParcelizer(false);
                }
                float f2 = Dimensions.setMenu;
                HeaderKt.read(R.drawable.ic_arrow_left, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, boxScopeInstance.align(PaddingKt.m74paddingqDBjuR0$default(companion, f2, f2, 0.0f, 0.0f, 12), companion3.getTopStart()), false, null, getpostalcode, (i14 >> 12) & 112, 24);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new b9(findparagraphbyindex, getparagraph, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, dragAndDropTargetModifierNode, i);
        }
    }
}
