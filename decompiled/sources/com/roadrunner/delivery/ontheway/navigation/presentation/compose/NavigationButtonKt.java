package com.roadrunner.delivery.ontheway.navigation.presentation.compose;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import coil3.ExtrasKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.baseUrlChoices;
import o.buildMapping;
import o.canReadPlayIds;
import o.generateUrlStringForGET;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLastCustomNonConfigurationInstance;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaIueNGICWdlZwA4NbXElwa7ivh6s;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationButtonKt {
    private static int read = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    public static final void read(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-983184157);
        if ((i & 6) == 0) {
            if (getpostalcode.write(z)) {
                int i5 = serializer + 57;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = serializer + 27;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_map_direction, getpostalcode, 0);
            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
            Modifier.Companion companion = Modifier.Companion;
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (i2 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!z2 && !z3) {
                int i8 = serializer + 95;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new getLastCustomNonConfigurationInstance(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new getLastCustomNonConfigurationInstance(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            IconKt.m116Iconww6aTOc(painterPainterResource, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, GraphicsLayerModifierKt.graphicsLayer(companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), popupTheme, getpostalcode, Painter.$stable | 48, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new generateUrlStringForGET(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, boolean z, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i4;
        boolean z4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(834704282);
        int i6 = 1;
        if ((i & 6) == 0) {
            int i7 = read + 89;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i3 = (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 2 : 4) | i;
        } else {
            int i9 = read + 97;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i3 = i;
        }
        int i11 = i3 | 48;
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                int i13 = serializer + 47;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z2 = z;
                i11 |= getpostalcode.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i11 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i11 & 1, z3)) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
            } else {
                i4 = read + 123;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    Modifier.Companion companion = Modifier.Companion;
                    if (i12 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    Modifier modifier3 = canReadPlayIds.read(companion, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 63);
                    modifier3.getClass();
                    SurfaceKt.m126SurfaceT9BRK9s(modifier3, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getAnimatedVisibility), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(1655319029, new r8lambdaIueNGICWdlZwA4NbXElwa7ivh6s(z4, i6), getpostalcode), getpostalcode, 12582912, 120);
                    z2 = z4;
                    modifier2 = companion;
                } else {
                    Modifier.Companion companion2 = Modifier.Companion;
                    throw null;
                }
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new baseUrlChoices(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, z2, i, i2, 2);
            }
        }
        i11 = i3 | 432;
        z2 = z;
        if ((i11 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i11 & 1, z3)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            i4 = read + 123;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                Modifier.Companion companion3 = Modifier.Companion;
                if (i12 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                Modifier modifier4 = canReadPlayIds.read(companion3, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 63);
                modifier4.getClass();
                SurfaceKt.m126SurfaceT9BRK9s(modifier4, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getAnimatedVisibility), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(1655319029, new r8lambdaIueNGICWdlZwA4NbXElwa7ivh6s(z4, i6), getpostalcode), getpostalcode, 12582912, 120);
                z2 = z4;
                modifier2 = companion3;
            } else {
                Modifier.Companion companion4 = Modifier.Companion;
                throw null;
            }
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new baseUrlChoices(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, z2, i, i2, 2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 ??, still in use, count: 1, list:
          (r10v3 ?? I:java.lang.Object) from 0x02be: INVOKE (r15v1 ?? I:o.getPostalCode), (r10v3 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:505)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void NavigationButton(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 ??, still in use, count: 1, list:
          (r10v3 ?? I:java.lang.Object) from 0x02be: INVOKE (r15v1 ?? I:o.getPostalCode), (r10v3 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:505)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 ??
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
