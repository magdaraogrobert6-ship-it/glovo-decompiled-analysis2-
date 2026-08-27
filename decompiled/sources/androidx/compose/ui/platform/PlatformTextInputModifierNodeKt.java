package androidx.compose.ui.platform;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.Owner;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidContentCaptureManagerCompanion;
import o.ContentType_androidKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEmailAddress;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPersonFullName;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt {
    private static final ProvidableCompositionLocal LocalChainedPlatformTextInputInterceptor = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final ChainedPlatformTextInputInterceptor invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C00641(ShortNewsContentCardView<? super C00641> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C00651(ShortNewsContentCardView<? super C00651> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlatformTextInputModifierNodeKt.interceptedTextInputSession(null, null, null, this);
        }
    }

    @ExperimentalComposeUiApi
    public static final void InterceptPlatformTextInput(final PlatformTextInputInterceptor platformTextInputInterceptor, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1892278287);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(platformTextInputInterceptor) : getpostalcode.IconCompatParcelizer(platformTextInputInterceptor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            ProvidableCompositionLocal providableCompositionLocal = LocalChainedPlatformTextInputInterceptor;
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) getpostalcode.write((getNewPassword) providableCompositionLocal);
            boolean z = getpostalcode.read(chainedPlatformTextInputInterceptor);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new ChainedPlatformTextInputInterceptor(platformTextInputInterceptor, chainedPlatformTextInputInterceptor);
                getpostalcode.write(objComponentActivity);
            }
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor2 = (ChainedPlatformTextInputInterceptor) objComponentActivity;
            chainedPlatformTextInputInterceptor2.updateInterceptor(platformTextInputInterceptor);
            AndroidContentCaptureManagerCompanion.read(providableCompositionLocal.write(chainedPlatformTextInputInterceptor2), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i2 & 112) | 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.InterceptPlatformTextInput.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    PlatformTextInputModifierNodeKt.InterceptPlatformTextInput(platformTextInputInterceptor, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object establishTextInputSession(PlatformTextInputModifierNode platformTextInputModifierNode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<?> shortNewsContentCardView) {
        C00641 c00641;
        if (shortNewsContentCardView instanceof C00641) {
            c00641 = (C00641) shortNewsContentCardView;
            int i = c00641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00641.label = i - Integer.MIN_VALUE;
            } else {
                c00641 = new C00641(shortNewsContentCardView);
            }
        } else {
            c00641 = new C00641(shortNewsContentCardView);
        }
        Object obj = c00641.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00641.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!platformTextInputModifierNode.getNode().isAttached()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("establishTextInputSession called from an unattached node");
                return null;
            }
            Owner ownerRequireOwner = DelegatableNodeKt.requireOwner(platformTextInputModifierNode);
            getEmailAddress compositionLocalMap = DelegatableNodeKt.requireLayoutNode(platformTextInputModifierNode).getCompositionLocalMap();
            ProvidableCompositionLocal providableCompositionLocal = LocalChainedPlatformTextInputInterceptor;
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = (DragAndDropNodestartDragAndDropTransfer1) compositionLocalMap;
            dragAndDropNodestartDragAndDropTransfer1.getClass();
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, providableCompositionLocal);
            c00641.label = 1;
            if (interceptedTextInputSession(ownerRequireOwner, chainedPlatformTextInputInterceptor, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, c00641) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r6.textInputSession(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r7.textInputSession(r6, r8, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object interceptedTextInputSession(androidx.compose.ui.node.Owner r6, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r7, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8, o.ShortNewsContentCardView<?> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.C00651
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.C00651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 == r3) goto L2d
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
            return r5
        L2d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L50
        L31:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L43
        L35:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            if (r7 != 0) goto L47
            r0.label = r4
            java.lang.Object r6 = r6.textInputSession(r8, r0)
            if (r6 != r1) goto L43
            goto L4f
        L43:
            o.DrawableTransformation.read()
            return r5
        L47:
            r0.label = r3
            java.lang.Object r6 = r7.textInputSession(r6, r8, r0)
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            o.DrawableTransformation.read()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.interceptedTextInputSession(androidx.compose.ui.node.Owner, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0, o.ShortNewsContentCardView):java.lang.Object");
    }
}
