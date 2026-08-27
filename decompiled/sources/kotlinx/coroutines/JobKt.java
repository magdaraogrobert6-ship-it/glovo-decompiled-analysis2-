package kotlinx.coroutines;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.Symbol;
import o.DefaultInAppMessageViewWrapperWhenMappings;
import o.DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1;
import o.DrawableTransformation;
import o.TextAnnouncementContentCardView;
import o.addInAppMessageViewToViewGroup;
import o.createAnimationListener;
import o.createButtonClickListenerslambda00;
import o.createClickListenerlambda0;
import o.createFromParcel;
import o.getOpeningAnimation;
import o.instance_delegatelambda0;
import o.onAnimationEndlambda0;
import o.onAnimationEndlambda1;
import o.onTouchEnded;
import o.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setAndStartAnimation;
import o.setContentViewGroupParentLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JobKt {
    public static final Symbol RemoteActionCompatParcelizer = new Symbol("COMPLETING_ALREADY");
    public static final Symbol IconCompatParcelizer = new Symbol("COMPLETING_WAITING_CHILDREN");
    public static final Symbol serializer = new Symbol("COMPLETING_RETRY");
    public static final Symbol MediaBrowserCompatMediaItem = new Symbol("TOO_LATE_TO_CANCEL");
    public static final Symbol MediaSessionCompatQueueItem = new Symbol("SEALED");
    public static final setContentViewGroupParentLayout read = new setContentViewGroupParentLayout(false);
    public static final setContentViewGroupParentLayout write = new setContentViewGroupParentLayout(true);

    public static final Object cancelAndJoin(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0, ContinuationImpl continuationImpl) {
        setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        Object objJoin = setallviewgroupchildrenasnonaccessibilityimportantlambda0.join(continuationImpl);
        return objJoin == CoroutineSingletons.COROUTINE_SUSPENDED ? objJoin : createFromParcel.INSTANCE;
    }

    public static final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 IconCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            return setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        }
        DrawableTransformation.read(textAnnouncementContentCardView, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final void RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null && !setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_()) {
            throw setallviewgroupchildrenasnonaccessibilityimportantlambda0.write();
        }
    }

    public static void serializer(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            Iterator it = setallviewgroupchildrenasnonaccessibilityimportantlambda0.H_().iterator();
            while (it.hasNext()) {
                ((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) it.next()).write(null);
            }
        }
    }

    public static final void serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, CancellationException cancellationException) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(cancellationException);
        }
    }

    public static final boolean write(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            return setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_();
        }
        return true;
    }

    public static onAnimationEndlambda0 RemoteActionCompatParcelizer() {
        return new onAnimationEndlambda0(null);
    }

    public static CompletableDeferredImpl write() {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl(true);
        completableDeferredImpl.RemoteActionCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) null);
        return completableDeferredImpl;
    }

    public static final Object IconCompatParcelizer(Object obj) {
        DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings;
        resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto resetallviewgroupchildrentopreviousaccessibilityflagorauto = obj instanceof resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto ? (resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto) obj : null;
        return (resetallviewgroupchildrentopreviousaccessibilityflagorauto == null || (defaultInAppMessageViewWrapperWhenMappings = resetallviewgroupchildrentopreviousaccessibilityflagorauto.RemoteActionCompatParcelizer) == null) ? obj : defaultInAppMessageViewWrapperWhenMappings;
    }

    public static setAndStartAnimation RemoteActionCompatParcelizer(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0, JobNode jobNode) {
        return setallviewgroupchildrenasnonaccessibilityimportantlambda0 instanceof JobSupport ? ((JobSupport) setallviewgroupchildrenasnonaccessibilityimportantlambda0).RemoteActionCompatParcelizer(true, jobNode) : setallviewgroupchildrenasnonaccessibilityimportantlambda0.RemoteActionCompatParcelizer(jobNode.write(), true, new JobKt__JobKt$invokeOnCompletion$1(jobNode));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object joinAll(ArrayList arrayList, ContinuationImpl continuationImpl) {
        createAnimationListener createanimationlistener;
        Iterator it;
        if (continuationImpl instanceof createAnimationListener) {
            createanimationlistener = (createAnimationListener) continuationImpl;
            int i = createanimationlistener.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                createanimationlistener.read = i - Integer.MIN_VALUE;
            } else {
                createanimationlistener = new createAnimationListener(continuationImpl);
            }
        } else {
            createanimationlistener = new createAnimationListener(continuationImpl);
        }
        Object obj = createanimationlistener.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createanimationlistener.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            it = arrayList.iterator();
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = createanimationlistener.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        while (it.hasNext()) {
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) it.next();
            createanimationlistener.write = it;
            createanimationlistener.read = 1;
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0.join(createanimationlistener) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object awaitAll(Collection collection, ContinuationImpl continuationImpl) {
        if (collection.isEmpty()) {
            return instance_delegatelambda0.write;
        }
        getOpeningAnimation[] getopeninganimationArr = (getOpeningAnimation[]) collection.toArray(new getOpeningAnimation[0]);
        createClickListenerlambda0 createclicklistenerlambda0 = new createClickListenerlambda0(getopeninganimationArr);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(continuationImpl));
        cancellableContinuationImpl.read();
        int length = getopeninganimationArr.length;
        createButtonClickListenerslambda00[] createbuttonclicklistenerslambda00Arr = new createButtonClickListenerslambda00[length];
        for (int i = 0; i < length; i++) {
            DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1 defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1 = getopeninganimationArr[i];
            defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1.MediaSessionCompatQueueItem();
            createButtonClickListenerslambda00 createbuttonclicklistenerslambda00 = new createButtonClickListenerslambda00(createclicklistenerlambda0, cancellableContinuationImpl);
            createbuttonclicklistenerslambda00.serializer = RemoteActionCompatParcelizer(defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1, createbuttonclicklistenerslambda00);
            createbuttonclicklistenerslambda00Arr[i] = createbuttonclicklistenerslambda00;
        }
        addInAppMessageViewToViewGroup addinappmessageviewtoviewgroup = new addInAppMessageViewToViewGroup(createbuttonclicklistenerslambda00Arr);
        for (int i2 = 0; i2 < length; i2++) {
            createbuttonclicklistenerslambda00Arr[i2].serializer(addinappmessageviewtoviewgroup);
        }
        if (cancellableContinuationImpl.RatingCompat()) {
            addinappmessageviewtoviewgroup.read();
        } else {
            cancellableContinuationImpl.IconCompatParcelizer((onTouchEnded) addinappmessageviewtoviewgroup);
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static void IconCompatParcelizer(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0) {
        Iterator it = setallviewgroupchildrenasnonaccessibilityimportantlambda0.H_().iterator();
        while (it.hasNext()) {
            ((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) it.next()).write(null);
        }
    }
}
