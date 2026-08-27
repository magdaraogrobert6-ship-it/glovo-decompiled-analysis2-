package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamite.zzj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import o.BasicTextRWo7tUw;
import o.CoreTextFieldKtCoreTextField8112;
import o.CoreTextFieldRootBox;
import o.HeightInLinesNode;
import o.LayoutWithLinksAndInlineContent11Od_4g;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.TextFieldCursor_androidKt;
import o.accessanimateWithTarget;
import o.accessisRelatedToAutoCommit;
import o.accessmeasureWithTextRangeMeasureConstraints;
import o.applyMeasureResultfoundation;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.removeNodeAtDepth;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnchoredDraggableKt {
    public static final accessanimateWithTarget read;
    public static final accessisRelatedToAutoCommit serializer = new accessisRelatedToAutoCommit(21);
    public static final accessisRelatedToAutoCommit write = new accessisRelatedToAutoCommit(22);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
        public final /* synthetic */ float IconCompatParcelizer;
        public /* synthetic */ TextFieldCursor_androidKt MediaBrowserCompatMediaItem;
        public /* synthetic */ Object MediaMetadataCompat;
        public int MediaSessionCompatQueueItem;
        public /* synthetic */ HeightInLinesNode RatingCompat;
        public final /* synthetic */ o.TrackpadScrollingLogic RemoteActionCompatParcelizer;
        public final /* synthetic */ accessanimateWithTarget read;
        public final /* synthetic */ AnchoredDraggableState serializer;
        public final /* synthetic */ cancelPendingWebViewPauselambda0 write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnchoredDraggableState anchoredDraggableState, float f, o.TrackpadScrollingLogic trackpadScrollingLogic, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, accessanimateWithTarget accessanimatewithtarget, ShortNewsContentCardView shortNewsContentCardView) {
            super(4, shortNewsContentCardView);
            this.serializer = anchoredDraggableState;
            this.IconCompatParcelizer = f;
            this.RemoteActionCompatParcelizer = trackpadScrollingLogic;
            this.write = cancelpendingwebviewpauselambda0;
            this.read = accessanimatewithtarget;
        }

        @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = this.write;
            accessanimateWithTarget accessanimatewithtarget = this.read;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.serializer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, cancelpendingwebviewpauselambda0, accessanimatewithtarget, (ShortNewsContentCardView) obj4);
            anonymousClass2.RatingCompat = (HeightInLinesNode) obj;
            anonymousClass2.MediaBrowserCompatMediaItem = (TextFieldCursor_androidKt) obj2;
            anonymousClass2.MediaMetadataCompat = obj3;
            return anonymousClass2.invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
        
            if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r11, r2, false, r14, r17) == r8) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.access$animateTo(r17.serializer, r15, r4, r3, r5, r17.RemoteActionCompatParcelizer, r17) == r8) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.access$animateTo(r17.serializer, r15, r4, r3, r5, r17.RemoteActionCompatParcelizer, r17) == r8) goto L42;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static Modifier write(Modifier modifier, AnchoredDraggableState anchoredDraggableState, SelectionHandleIcon selectionHandleIcon) {
        return modifier.then(new BasicTextRWo7tUw(anchoredDraggableState, selectionHandleIcon));
    }

    static {
        Dp.m3673constructorimpl(125.0f);
        read = new accessanimateWithTarget(new zzj(2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$restartable(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        CoreTextFieldKtCoreTextField8112 coreTextFieldKtCoreTextField8112;
        if (continuationImpl instanceof CoreTextFieldKtCoreTextField8112) {
            coreTextFieldKtCoreTextField8112 = (CoreTextFieldKtCoreTextField8112) continuationImpl;
            int i = coreTextFieldKtCoreTextField8112.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                coreTextFieldKtCoreTextField8112.write = i - Integer.MIN_VALUE;
            } else {
                coreTextFieldKtCoreTextField8112 = new CoreTextFieldKtCoreTextField8112(continuationImpl);
            }
        } else {
            coreTextFieldKtCoreTextField8112 = new CoreTextFieldKtCoreTextField8112(continuationImpl);
        }
        Object obj = coreTextFieldKtCoreTextField8112.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = coreTextFieldKtCoreTextField8112.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i3 = 1;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView, i3);
                coreTextFieldKtCoreTextField8112.write = 1;
                if (YieldKt.coroutineScope(anchoredDraggableKt$restartable$2, coreTextFieldKtCoreTextField8112) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object animateToWithDecay(AnchoredDraggableState anchoredDraggableState, Object obj, float f, o.TrackpadScrollingLogic trackpadScrollingLogic, accessanimateWithTarget accessanimatewithtarget, ContinuationImpl continuationImpl) {
        CoreTextFieldRootBox coreTextFieldRootBox;
        float f2;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        if (continuationImpl instanceof CoreTextFieldRootBox) {
            coreTextFieldRootBox = (CoreTextFieldRootBox) continuationImpl;
            int i = coreTextFieldRootBox.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                coreTextFieldRootBox.write = i - Integer.MIN_VALUE;
            } else {
                coreTextFieldRootBox = new CoreTextFieldRootBox(continuationImpl);
            }
        } else {
            coreTextFieldRootBox = new CoreTextFieldRootBox(continuationImpl);
        }
        CoreTextFieldRootBox coreTextFieldRootBox2 = coreTextFieldRootBox;
        Object obj2 = coreTextFieldRootBox2.IconCompatParcelizer;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = coreTextFieldRootBox2.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = new cancelPendingWebViewPauselambda0();
            cancelpendingwebviewpauselambda1.write = f;
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds anonymousClass2 = new AnonymousClass2(anchoredDraggableState, f, trackpadScrollingLogic, cancelpendingwebviewpauselambda1, accessanimatewithtarget, null);
            coreTextFieldRootBox2.serializer = cancelpendingwebviewpauselambda1;
            coreTextFieldRootBox2.RemoteActionCompatParcelizer = f;
            coreTextFieldRootBox2.write = 1;
            if (anchoredDraggableState.anchoredDrag(obj, applyMeasureResultfoundation.Default, anonymousClass2, coreTextFieldRootBox2) == obj3) {
                return obj3;
            }
            f2 = f;
            cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda1;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = coreTextFieldRootBox2.RemoteActionCompatParcelizer;
            cancelpendingwebviewpauselambda0 = coreTextFieldRootBox2.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        return new Float(f2 - cancelpendingwebviewpauselambda0.write);
    }

    public static final Object access$animateTo(AnchoredDraggableState anchoredDraggableState, float f, HeightInLinesNode heightInLinesNode, TextFieldCursor_androidKt textFieldCursor_androidKt, Object obj, o.TrackpadScrollingLogic trackpadScrollingLogic, SuspendLambda suspendLambda) {
        Object objAnimate;
        float fSerializer = textFieldCursor_androidKt.serializer(obj);
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = new cancelPendingWebViewPauselambda0();
        cancelpendingwebviewpauselambda0.write = Float.isNaN(anchoredDraggableState.RemoteActionCompatParcelizer()) ? 0.0f : anchoredDraggableState.RemoteActionCompatParcelizer();
        if (!Float.isNaN(fSerializer)) {
            float f2 = cancelpendingwebviewpauselambda0.write;
            if (f2 != fSerializer && (objAnimate = SuspendAnimationKt.animate(f2, fSerializer, f, trackpadScrollingLogic, new GapComposerKt$$ExternalSyntheticLambda0(heightInLinesNode, 1, cancelpendingwebviewpauselambda0), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objAnimate;
            }
        }
        return createFromParcel.INSTANCE;
    }

    public static Object read(AnchoredDraggableState anchoredDraggableState, Object obj, float f, accessmeasureWithTextRangeMeasureConstraints accessmeasurewithtextrangemeasureconstraints) {
        requiredWidthInVpY3zN4default requiredwidthinvpy3zn4defaultSerializer;
        accessanimateWithTarget accessanimatewithtargetWrite;
        if (anchoredDraggableState.serializer()) {
            requiredwidthinvpy3zn4defaultSerializer = anchoredDraggableState.MediaSessionCompatResultReceiverWrapper;
            if (requiredwidthinvpy3zn4defaultSerializer == null) {
                removeNodeAtDepth.serializer("snapAnimationSpec");
                throw null;
            }
        } else {
            requiredwidthinvpy3zn4defaultSerializer = LayoutWithLinksAndInlineContent11Od_4g.serializer();
        }
        requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = requiredwidthinvpy3zn4defaultSerializer;
        if (anchoredDraggableState.serializer()) {
            accessanimatewithtargetWrite = anchoredDraggableState.read;
            if (accessanimatewithtargetWrite == null) {
                removeNodeAtDepth.serializer("decayAnimationSpec");
                throw null;
            }
        } else {
            accessanimatewithtargetWrite = LayoutWithLinksAndInlineContent11Od_4g.write();
        }
        return animateToWithDecay(anchoredDraggableState, obj, f, requiredwidthinvpy3zn4default, accessanimatewithtargetWrite, accessmeasurewithtextrangemeasureconstraints);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[RETURN] */
    public static final Object read(TextFieldCursor_androidKt textFieldCursor_androidKt, float f, float f2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (Float.isNaN(f)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            Object obj = textFieldCursor_androidKt.read(f);
            obj.getClass();
            return obj;
        }
        if (Math.abs(f2) >= Math.abs(((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).floatValue())) {
            Object objSerializer = textFieldCursor_androidKt.serializer(f, z2);
            objSerializer.getClass();
            return objSerializer;
        }
        Object objSerializer2 = textFieldCursor_androidKt.serializer(f, false);
        objSerializer2.getClass();
        float fSerializer = textFieldCursor_androidKt.serializer(objSerializer2);
        Object objSerializer3 = textFieldCursor_androidKt.serializer(f, true);
        objSerializer3.getClass();
        float fSerializer2 = textFieldCursor_androidKt.serializer(objSerializer3);
        float fAbs = Math.abs(((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Float.valueOf(Math.abs(fSerializer - fSerializer2)))).floatValue());
        if (!z2) {
            fSerializer = fSerializer2;
        }
        boolean z3 = Math.abs(fSerializer - f) >= fAbs;
        if (z3) {
            if (z2) {
                return objSerializer3;
            }
            return objSerializer2;
        }
        if (z3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        if (z2) {
            return objSerializer2;
        }
        return objSerializer3;
    }
}
