package com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SwitchDefaults;
import o.accessgetContentcp;
import o.buildMapping;
import o.computeHorizontalScrollExtent;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TripInformationKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void ExitButton(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 87;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-223658121);
        if ((i & 6) == 0) {
            int i8 = read + 57;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode2.read(str);
                throw null;
            }
            if (getpostalcode2.read(str)) {
                i4 = 4;
            } else {
                int i9 = IconCompatParcelizer + 83;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i11 = read + 45;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i13 = read + 39;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            float fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            float f2 = Dimensions.setMenu;
            getpostalcode = getpostalcode2;
            PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, null, null, null, null, 0, new SwitchDefaults(f, f2, f, f2), textStyle, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getInflater), fM3673constructorimpl, getpostalcode, i2 & 126, 3072, 1020);
            int i15 = read + 27;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 12);
        }
    }

    public static final void serializer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 75;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1519533066);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i7 = read + 25;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i & 384) == 0) {
            i9 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
            int i10 = IconCompatParcelizer + 93;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if (getpostalcode.write(i9 & 1, (i9 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
                int i12 = IconCompatParcelizer + 1;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            }
            modifier2 = companion;
            TextKt.m131TextNvy7gAk(str, ClickableKt.serializer(companion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setMenuPrepared(), 0L, FontWeight.Companion.getBold(), null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, (i9 & 14) | 1572864, 24960, 110520);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    public static final void RemoteActionCompatParcelizer(accessgetContentcp accessgetcontentcp, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        boolean zIconCompatParcelizer;
        int i6 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(58312442);
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer;
            int i8 = i7 + 33;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? (i & 8) != 0 : (i & 114) != 0) {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(accessgetcontentcp);
            } else {
                int i9 = i7 + 117;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode2.read(accessgetcontentcp);
                } else {
                    getpostalcode2.read(accessgetcontentcp);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = read + 53;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i5 = i10 % 2 == 0 ? 5 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        boolean z = false;
        if ((i & 384) == 0) {
            int i11 = read + 35;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i4 = Fields.RotationX;
                } else {
                    int i12 = read + 57;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i4 = Fields.SpotShadowColor;
                }
            } else {
                int i14 = 63 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i4 = Fields.RotationX;
                } else {
                    int i15 = read + 57;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    i4 = Fields.SpotShadowColor;
                }
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i17 = IconCompatParcelizer + 23;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                int i19 = read + 91;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                i3 = i19 % 2 == 0 ? 17984 : Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            int i20 = read + 35;
            IconCompatParcelizer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            z = true;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            getpostalcode = getpostalcode2;
            SurfaceKt.m126SurfaceT9BRK9s(PaddingKt.write(SizeKt.write(modifier, 1.0f), Dimensions.setActionBarVisibilityCallback), null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(1834023743, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0((Object) dragAndDropTargetModifierNode, (Object) accessgetcontentcp, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 5), getpostalcode2), getpostalcode, 12582912, 122);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(i, 15, modifier, accessgetcontentcp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, dragAndDropTargetModifierNode);
        }
    }

    public static final void TripInformationTextContainer(accessgetContentcp accessgetcontentcp, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2139556999);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode2.read(accessgetcontentcp) : getpostalcode2.IconCompatParcelizer(accessgetcontentcp)) {
                i4 = 4;
            } else {
                int i6 = IconCompatParcelizer + 115;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = read + 35;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (!getpostalcode2.read(modifier)) {
                i3 = 16;
            } else {
                int i10 = IconCompatParcelizer + 67;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 32;
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 19) != 18)) {
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getStart(), getpostalcode2, 6);
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
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str = accessgetcontentcp.RemoteActionCompatParcelizer;
            TextOverflow.Companion companion2 = TextOverflow.Companion;
            int iM3569getEllipsisgIe3tQ8 = companion2.m3569getEllipsisgIe3tQ8();
            TextStyle textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setMenu(), 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 2, 0, null, textStyleMediaSessionCompatToken, getpostalcode2, 0, 24960, 110586);
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(accessgetcontentcp.write, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, companion2.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 24960, 110586);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 13, accessgetcontentcp, modifier);
        }
        int i12 = IconCompatParcelizer + 15;
        read = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v4 ??, still in use, count: 1, list:
          (r9v4 ?? I:java.lang.Object) from 0x01a7: INVOKE (r12v1 ?? I:o.getPostalCode), (r9v4 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:346)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void TripInformation(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v4 ??, still in use, count: 1, list:
          (r9v4 ?? I:java.lang.Object) from 0x01a7: INVOKE (r12v1 ?? I:o.getPostalCode), (r9v4 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:346)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
}
