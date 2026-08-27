package androidx.compose.material3.internal;

import androidx.compose.runtime.CompositionKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.CoreTextFieldKtCoreTextField512;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.getDateMillisValue;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ getContentViewGroupParentLayout IconCompatParcelizer;
        public final /* synthetic */ createInAppMessageEventSubscriber read;
        public final /* synthetic */ int serializer;
        public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
            public int RemoteActionCompatParcelizer;
            public final /* synthetic */ getContentViewGroupParentLayout read;
            public final /* synthetic */ int serializer;
            public final /* synthetic */ Object write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass2(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj, getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView shortNewsContentCardView, int i) {
                super(2, shortNewsContentCardView);
                this.serializer = i;
                this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                this.write = obj;
                this.read = getcontentviewgroupparentlayout;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                int i = this.serializer;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
                ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
                return i != 0 ? ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.serializer;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.read;
                Object obj2 = this.write;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.IconCompatParcelizer;
                if (i != 0) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.RemoteActionCompatParcelizer;
                    if (i2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.RemoteActionCompatParcelizer = 1;
                        if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    YieldKt.write(getcontentviewgroupparentlayout, new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                    return createfromparcel;
                }
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.RemoteActionCompatParcelizer;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = 1;
                    if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj2, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                YieldKt.write(getcontentviewgroupparentlayout, new AnchoredDragFinishedSignal());
                return createfromparcel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                if (this.serializer != 0) {
                    return new AnonymousClass2(this.IconCompatParcelizer, this.write, this.read, shortNewsContentCardView, 1);
                }
                return new AnonymousClass2(this.IconCompatParcelizer, this.write, this.read, shortNewsContentCardView, 0);
            }
        }

        public /* synthetic */ AnonymousClass1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, getContentViewGroupParentLayout getcontentviewgroupparentlayout, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i) {
            this.serializer = i;
            this.read = createinappmessageeventsubscriber;
            this.IconCompatParcelizer = getcontentviewgroupparentlayout;
            this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:9:0x001f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            getDateMillisValue getdatemillisvalue;
            CoreTextFieldKtCoreTextField512 coreTextFieldKtCoreTextField512;
            int i = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.read;
            if (i != 0) {
                if (shortNewsContentCardView instanceof CoreTextFieldKtCoreTextField512) {
                    coreTextFieldKtCoreTextField512 = (CoreTextFieldKtCoreTextField512) shortNewsContentCardView;
                    int i2 = coreTextFieldKtCoreTextField512.IconCompatParcelizer;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        coreTextFieldKtCoreTextField512.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                    } else {
                        coreTextFieldKtCoreTextField512 = new CoreTextFieldKtCoreTextField512(this, shortNewsContentCardView);
                    }
                } else {
                    coreTextFieldKtCoreTextField512 = new CoreTextFieldKtCoreTextField512(this, shortNewsContentCardView);
                }
                Object obj2 = coreTextFieldKtCoreTextField512.read;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = coreTextFieldKtCoreTextField512.IconCompatParcelizer;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                        coreTextFieldKtCoreTextField512.serializer = obj;
                        coreTextFieldKtCoreTextField512.IconCompatParcelizer = 1;
                        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0.join(coreTextFieldKtCoreTextField512) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = coreTextFieldKtCoreTextField512.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                }
                Object obj3 = obj;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.write;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.IconCompatParcelizer;
                createinappmessageeventsubscriber.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, coroutineStart, new AnonymousClass2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, obj3, getcontentviewgroupparentlayout, null, 1), 1);
                return createfromparcel;
            }
            if (shortNewsContentCardView instanceof getDateMillisValue) {
                getdatemillisvalue = (getDateMillisValue) shortNewsContentCardView;
                int i4 = getdatemillisvalue.write;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    getdatemillisvalue.write = i4 - Integer.MIN_VALUE;
                } else {
                    getdatemillisvalue = new getDateMillisValue(this, shortNewsContentCardView);
                }
            } else {
                getdatemillisvalue = new getDateMillisValue(this, shortNewsContentCardView);
            }
            Object obj4 = getdatemillisvalue.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = getdatemillisvalue.write;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda1 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (setallviewgroupchildrenasnonaccessibilityimportantlambda1 != null) {
                    setallviewgroupchildrenasnonaccessibilityimportantlambda1.write(new AnchoredDragFinishedSignal());
                    getdatemillisvalue.serializer = obj;
                    getdatemillisvalue.write = 1;
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda1.join(getdatemillisvalue) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = getdatemillisvalue.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
            }
            Object obj5 = obj;
            CoroutineStart coroutineStart2 = CoroutineStart.UNDISPATCHED;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = this.write;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = this.IconCompatParcelizer;
            createinappmessageeventsubscriber.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, coroutineStart2, new AnonymousClass2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, obj5, getcontentviewgroupparentlayout2, null, 0), 1);
            return createfromparcel;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchoredDraggableKt$restartable$2(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((AnchoredDraggableKt$restartable$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnchoredDraggableKt$restartable$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.IconCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.write;
        int i2 = 1;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.read;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            Flow flowIconCompatParcelizer = CompositionKt.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(createinappmessageeventsubscriber, getcontentviewgroupparentlayout, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i2);
            this.RemoteActionCompatParcelizer = 1;
            return ((AbstractFlow) flowIconCompatParcelizer).collect(anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) this.read;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
        Flow flowIconCompatParcelizer2 = CompositionKt.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(createinappmessageeventsubscriber2, getcontentviewgroupparentlayout2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 0);
        this.RemoteActionCompatParcelizer = 1;
        return ((AbstractFlow) flowIconCompatParcelizer2).collect(anonymousClass2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.serializer != 0) {
            AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.write, this.IconCompatParcelizer, shortNewsContentCardView, 1);
            anchoredDraggableKt$restartable$2.read = obj;
            return anchoredDraggableKt$restartable$2;
        }
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$3 = new AnchoredDraggableKt$restartable$2(this.write, this.IconCompatParcelizer, shortNewsContentCardView, 0);
        anchoredDraggableKt$restartable$3.read = obj;
        return anchoredDraggableKt$restartable$3;
    }
}
