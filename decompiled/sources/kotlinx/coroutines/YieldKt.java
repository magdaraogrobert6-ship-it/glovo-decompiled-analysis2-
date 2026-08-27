package kotlinx.coroutines;

import io.grpc.LoadBalancer$Helper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.Symbol;
import o.BrazeContentCardsManager;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.handleOnBackPressedlambda0;
import o.onAnimationEndlambda1;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class YieldKt {
    public static final Symbol serializer = new Symbol("RESUME_TOKEN");

    public static final ContextScope RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        if (textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer) == null) {
            textAnnouncementContentCardView = textAnnouncementContentCardView.plus(JobKt.RemoteActionCompatParcelizer());
        }
        return new ContextScope(textAnnouncementContentCardView);
    }

    public static final Object coroutineScope(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(shortNewsContentCardView, shortNewsContentCardView.getContext());
        Object objStartUndspatched = MathKt.startUndspatched(scopeCoroutine, true, scopeCoroutine, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objStartUndspatched;
    }

    public static final ContextScope write(getContentViewGroupParentLayout getcontentviewgroupparentlayout, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return new ContextScope(getcontentviewgroupparentlayout.getCoroutineContext().plus(textAnnouncementContentCardView));
    }

    public static final void IconCompatParcelizer(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        JobKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout.getCoroutineContext());
    }

    public static final void write(getContentViewGroupParentLayout getcontentviewgroupparentlayout, CancellationException cancellationException) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getcontentviewgroupparentlayout.getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(cancellationException);
        } else {
            DrawableTransformation.read(getcontentviewgroupparentlayout, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final boolean write(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getcontentviewgroupparentlayout.getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            return setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object yield(ContinuationImpl continuationImpl) {
        Object obj;
        TextAnnouncementContentCardView context = continuationImpl.getContext();
        JobKt.RemoteActionCompatParcelizer(context);
        ShortNewsContentCardView shortNewsContentCardViewIntercepted = LoadBalancer$Helper.intercepted(continuationImpl);
        DispatchedContinuation dispatchedContinuation = shortNewsContentCardViewIntercepted instanceof DispatchedContinuation ? (DispatchedContinuation) shortNewsContentCardViewIntercepted : null;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (dispatchedContinuation == null) {
            obj = createfromparcel;
        } else {
            CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.MediaMetadataCompat;
            if (DispatchedContinuationKt.write(coroutineDispatcher, context)) {
                dispatchedContinuation.read = createfromparcel;
                dispatchedContinuation.MediaSessionCompatQueueItem = 1;
                coroutineDispatcher.dispatchYield(context, dispatchedContinuation);
            } else {
                handleOnBackPressedlambda0 handleonbackpressedlambda0 = new handleOnBackPressedlambda0(handleOnBackPressedlambda0.read);
                TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = context.plus(handleonbackpressedlambda0);
                dispatchedContinuation.read = createfromparcel;
                dispatchedContinuation.MediaSessionCompatQueueItem = 1;
                coroutineDispatcher.dispatchYield(textAnnouncementContentCardViewPlus, dispatchedContinuation);
                if (handleonbackpressedlambda0.RemoteActionCompatParcelizer) {
                    EventLoop eventLoopWrite = ThreadLocalEventLoop.write();
                    BrazeContentCardsManager brazeContentCardsManager = eventLoopWrite.MediaSessionCompatQueueItem;
                    if (brazeContentCardsManager == null || brazeContentCardsManager.isEmpty()) {
                        obj = createfromparcel;
                    } else if (eventLoopWrite.MediaBrowserCompatMediaItem >= 4294967296L) {
                        dispatchedContinuation.read = createfromparcel;
                        dispatchedContinuation.MediaSessionCompatQueueItem = 1;
                        eventLoopWrite.write(dispatchedContinuation);
                        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    } else {
                        eventLoopWrite.serializer(true);
                        try {
                            dispatchedContinuation.run();
                            do {
                            } while (eventLoopWrite.IconCompatParcelizer());
                        } catch (Throwable th) {
                            try {
                                dispatchedContinuation.IconCompatParcelizer(th);
                            } catch (Throwable th2) {
                                eventLoopWrite.read(true);
                                throw th2;
                            }
                        }
                        eventLoopWrite.read(true);
                        obj = createfromparcel;
                    }
                }
            }
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : createfromparcel;
    }
}
