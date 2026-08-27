package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewNode extends Modifier.Node {
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onRequesterReady;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM requester = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            final /* synthetic */ Rect $rect;
            int label;
            final /* synthetic */ BringIntoViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BringIntoViewNode bringIntoViewNode, Rect rect, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.this$0 = bringIntoViewNode;
                this.$rect = rect;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                return new AnonymousClass1(this.this$0, this.$rect, shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    BringIntoViewNode bringIntoViewNode = this.this$0;
                    final Rect rect = this.$rect;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Rect invoke() {
                            return rect;
                        }
                    };
                    this.label = 1;
                    if (BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewNode, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        public final void invoke(Rect rect) {
            if (this.this$0.isAttached()) {
                BuildersKt.RemoteActionCompatParcelizer(this.this$0.getCoroutineScope(), null, null, new AnonymousClass1(this.this$0, rect, null), 3);
            }
        }

        {
            super(1);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Rect) obj);
            return createFromParcel.INSTANCE;
        }
    };

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnRequesterReady() {
        return this.onRequesterReady;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRequester() {
        return this.requester;
    }

    public final void setOnRequesterReady(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onRequesterReady = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.onRequesterReady.invoke(this.requester);
    }

    public final void update(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onRequesterReady = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        if (isAttached()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this.requester);
        }
    }

    public BringIntoViewNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onRequesterReady = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.onRequesterReady.invoke(null);
    }
}
