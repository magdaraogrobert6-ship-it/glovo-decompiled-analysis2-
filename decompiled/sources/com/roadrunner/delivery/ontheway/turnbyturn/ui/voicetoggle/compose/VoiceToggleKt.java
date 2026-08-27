package com.roadrunner.delivery.ontheway.turnbyturn.ui.voicetoggle.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.voicetoggle.compose.VoiceToggleKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.equalEnum;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getRtls_7Xco;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.takeOrElse;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VoiceToggleKt {
    private static int read = 0;
    private static int serializer = 1;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
          (r0v2 ?? I:java.lang.Object) from 0x00e1: INVOKE (r14v3 ?? I:o.getPostalCode), (r0v2 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:133)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void VoiceToggle(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
          (r0v2 ?? I:java.lang.Object) from 0x00e1: INVOKE (r14v3 ?? I:o.getPostalCode), (r0v2 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:133)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
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

    public static final void serializer(final getRtls_7Xco getrtls_7xco, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        Integer numValueOf;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-445537252);
        if ((i & 6) == 0) {
            int i4 = read + 45;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode.read(getrtls_7xco.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = read + 115;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i8 = read + 35;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = serializer + 19;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i12 = serializer + 73;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            int i14 = takeOrElse.RemoteActionCompatParcelizer[getrtls_7xco.ordinal()];
            if (i14 == 1) {
                numValueOf = Integer.valueOf(R.drawable.ic_bold_large_volume_volume_on);
            } else if (i14 == 2) {
                numValueOf = Integer.valueOf(R.drawable.ic_bold_large_volume_volume_off);
            } else {
                if (i14 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                float f = Dimensions.setCustomView;
                equalEnum.IconCompatParcelizer(iIntValue, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, null, f, f, getpostalcode, i2 & 1008, 24);
            } else {
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i15 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accesstakeOrElse
                    private static int MediaMetadataCompat = 1;
                    private static int MediaSessionCompatQueueItem;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = 2 % 2;
                        int i17 = MediaSessionCompatQueueItem + 93;
                        MediaMetadataCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        int i19 = i15;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i20 = i;
                        androidx.compose.ui.Modifier modifier2 = modifier;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                        getRtls_7Xco getrtls_7xco2 = getrtls_7xco;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        ((Integer) obj2).getClass();
                        if (i19 == 0) {
                            VoiceToggleKt.serializer(getrtls_7xco2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                            int i21 = MediaMetadataCompat + 9;
                            MediaSessionCompatQueueItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            return createfromparcel;
                        }
                        VoiceToggleKt.serializer(getrtls_7xco2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                        int i23 = MediaSessionCompatQueueItem + 61;
                        MediaMetadataCompat = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i23 % 2 == 0) {
                            int i24 = 97 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i16 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accesstakeOrElse
                private static int MediaMetadataCompat = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = 2 % 2;
                    int i18 = MediaSessionCompatQueueItem + 93;
                    MediaMetadataCompat = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    int i110 = i16;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i20 = i;
                    androidx.compose.ui.Modifier modifier2 = modifier;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                    getRtls_7Xco getrtls_7xco2 = getrtls_7xco;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i110 == 0) {
                        VoiceToggleKt.serializer(getrtls_7xco2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                        int i21 = MediaMetadataCompat + 9;
                        MediaSessionCompatQueueItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        return createfromparcel;
                    }
                    VoiceToggleKt.serializer(getrtls_7xco2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                    int i23 = MediaSessionCompatQueueItem + 61;
                    MediaMetadataCompat = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i23 % 2 == 0) {
                        int i24 = 97 / 0;
                    }
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }
}
