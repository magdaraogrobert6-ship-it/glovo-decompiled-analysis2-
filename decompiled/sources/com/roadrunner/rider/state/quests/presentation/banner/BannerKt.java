package com.roadrunner.rider.state.quests.presentation.banner;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.rrds.compose.component.indicators.progress.SectionedCircleProgressorKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.addDate;
import o.buildMapping;
import o.createFromParcel;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BannerKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
          (r10v2 ?? I:java.lang.Object) from 0x012b: INVOKE (r15v1 ?? I:o.getPostalCode), (r10v2 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:205)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void Banner(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
          (r10v2 ?? I:java.lang.Object) from 0x012b: INVOKE (r15v1 ?? I:o.getPostalCode), (r10v2 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:205)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
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

    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0193  */
    public static final void BannerRow(addDate adddate, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean zIconCompatParcelizer;
        int i8 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2094277264);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i9 = RemoteActionCompatParcelizer + 125;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                zIconCompatParcelizer = getpostalcode2.read(adddate);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(adddate);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i11 = RemoteActionCompatParcelizer + 113;
                read = i11 % Fields.SpotShadowColor;
                i7 = i11 % 2 == 0 ? 5776 : 256;
            } else {
                i7 = Fields.SpotShadowColor;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            int i12 = read + 97;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 1 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i5 = RemoteActionCompatParcelizer + 117;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        i6 = 30029;
                    } else {
                        i6 = 2048;
                    }
                } else {
                    i6 = Fields.RotationZ;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i5 = RemoteActionCompatParcelizer + 117;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    i6 = 30029;
                } else {
                    i6 = 2048;
                }
            } else {
                i6 = Fields.RotationZ;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.Clip : 8192;
        }
        int i14 = i2;
        boolean z3 = true;
        if (getpostalcode2.write(i14 & 1, (i14 & 9363) != 9362)) {
            int i15 = i14 & 14;
            boolean z4 = i15 == 4 || ((i14 & 8) != 0 && getpostalcode2.IconCompatParcelizer(adddate));
            boolean z5 = (i14 & 896) == 256;
            if ((i14 & 7168) == 2048) {
                int i16 = read + 3;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (((z4 | z5) || z) || objComponentActivity == androidContentCaptureManager) {
                i3 = i15;
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$2 = new NafathTimerDataStore$set$2(adddate, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, 16);
                getpostalcode2.write(nafathTimerDataStore$set$2);
                objComponentActivity = nafathTimerDataStore$set$2;
            } else {
                i3 = i15;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getInflater);
            Modifier modifierClip = ClipKt.clip(ShadowKt.m317shadows4CzXII$default(SizeKt.write(modifier, 1.0f), Dimensions.setSubMenuArrowVisible, gettopleftannotationsIconCompatParcelizer, false, 0L, 0L, 28, null), gettopleftannotationsIconCompatParcelizer);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierClip, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            if ((i14 & 112) == 32) {
                int i18 = read + 91;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                z2 = z3;
                i4 = 4;
            } else {
                i4 = 4;
                z2 = false;
            }
            boolean z6 = (i3 == i4 || ((i14 & 8) != 0 && getpostalcode2.IconCompatParcelizer(adddate))) ? z3 : false;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (!z6 && !z2) {
                int i20 = read + 49;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, z3, adddate);
                    getpostalcode2.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, z3, adddate);
                getpostalcode2.write(objComponentActivity2);
            }
            Modifier modifierRemoteActionCompatParcelizer = ClickableKt.RemoteActionCompatParcelizer(modifierM20backgroundbw27NRU, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, 15);
            float f = Dimensions.setSplitBackground;
            Modifier modifierWrite = PaddingKt.write(modifierRemoteActionCompatParcelizer, f);
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            if (adddate.IconCompatParcelizer) {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-2042922913);
                SectionedCircleProgressorKt.IconCompatParcelizer(adddate.MediaBrowserCompatMediaItem, adddate.write, adddate.MediaMetadataCompat, adddate.RemoteActionCompatParcelizer, null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                int i22 = RemoteActionCompatParcelizer + 119;
                read = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                getpostalcode2.serializer(-2043145834);
                getpostalcode = getpostalcode2;
                SectionedCircleProgressorKt.read(adddate.serializer, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setCompoundDrawablesRelative(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setKeyListener(), null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
            Modifier.Companion companion3 = Modifier.Companion;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion3, f)});
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode.serializer(constructor2);
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            String str = adddate.RatingCompat;
            TextStyle textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            getPostalCode getpostalcode3 = getpostalcode;
            TextKt.m131TextNvy7gAk(str, null, presenter, 0L, null, null, 0L, null, 0L, companion4.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, getpostalcode3, 0, 24960, 110586);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion3, Dimensions.setPrimaryBackground)});
            TextKt.m131TextNvy7gAk(adddate.read, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, companion4.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode3, 0, 24960, 110586);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(i, 20, modifier, adddate, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
