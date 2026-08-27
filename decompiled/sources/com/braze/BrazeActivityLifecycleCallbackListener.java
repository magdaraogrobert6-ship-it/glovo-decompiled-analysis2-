package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import bo.app.c8$$ExternalSyntheticLambda5;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    private WeakReference<Activity> currentActivityRef;
    private Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;
    private final AtomicBoolean isLoadingShouldPersistWebView;
    private final boolean registerInAppMessageManager;
    private Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;
    private volatile Boolean shouldPersistWebView;

    /* JADX INFO: renamed from: com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BrazeActivityLifecycleCallbackListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener, ShortNewsContentCardView<? super AnonymousClass2> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$context = context;
            this.this$0 = brazeActivityLifecycleCallbackListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Error while reading shouldPersistWebViewWhenBackgroundingApp from BrazeConfigurationProvider";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.this$0, shortNewsContentCardView);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i = 1;
            try {
                Context context = this.$context;
                context.getClass();
                this.this$0.setShouldPersistWebView(Boolean.valueOf(new BrazeConfigurationProvider(context).getShouldPersistWebViewWhenBackgroundingApp()));
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda0(i), 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda4(this.this$0, i), 6, (Object) null);
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
            return "Async load of shouldPersistWebView completed: " + brazeActivityLifecycleCallbackListener.getShouldPersistWebView();
        }
    }

    public static /* synthetic */ void getShouldPersistWebView$annotations() {
    }

    public final Boolean getShouldPersistWebView() {
        return this.shouldPersistWebView;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    public final void setShouldPersistWebView(Boolean bool) {
        this.shouldPersistWebView = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityResumed$lambda$0() {
        return "Activity is different from previous activity. Unregistering in-app message manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerOnApplication$lambda$0() {
        return "Failed to register this lifecycle callback listener directly against application class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldHandleLifecycleMethodsInActivity$lambda$0() {
        return "Skipping automatic registration for notification trampoline activity class.";
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z;
        this.registerInAppMessageManager = z2;
        this.isLoadingShouldPersistWebView = new AtomicBoolean(false);
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.inAppMessagingRegistrationBlocklist = set == null ? itemTouchHelperAdapter : set;
        this.sessionHandlingBlocklist = set2 == null ? itemTouchHelperAdapter : set2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda4(this, 3), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda4(this, 2), 6, (Object) null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda2(activity, 3), 6, (Object) null);
        BrazeInAppMessageManager companion = BrazeInAppMessageManager.Companion.getInstance();
        Context applicationContext = activity.getApplicationContext();
        applicationContext.getClass();
        companion.ensureSubscribedToInAppMessageEvents(applicationContext);
        if (this.registerInAppMessageManager && this.shouldPersistWebView == null && this.isLoadingShouldPersistWebView.compareAndSet(false, true)) {
            BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass2(activity.getApplicationContext(), this, null), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.registerInAppMessageManager) {
            int i = 0;
            if (shouldHandleLifecycleMethodsInActivity(activity, false)) {
                Object[] objArr = {this.shouldPersistWebView, Boolean.FALSE};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda2(activity, 1), 6, (Object) null);
                    BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(activity);
                } else {
                    BrazeInAppMessageManager.Companion.getInstance().pauseWebviewIfNecessary$android_sdk_ui_release();
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda4(this, i), 6, (Object) null);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        if (this.registerInAppMessageManager) {
            if (shouldHandleLifecycleMethodsInActivity(activity, false)) {
                WeakReference<Activity> weakReference = this.currentActivityRef;
                Activity activity2 = weakReference != null ? weakReference.get() : null;
                Boolean bool = this.shouldPersistWebView;
                Boolean bool2 = Boolean.TRUE;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, bool2}, getCieXyz.write())).booleanValue() && activity2 != null && !activity2.equals(activity)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(24), 6, (Object) null);
                    BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(activity);
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shouldPersistWebView, bool2}, getCieXyz.write())).booleanValue() && activity2 != null && activity2.equals(activity)) {
                    BrazeInAppMessageManager.Companion.getInstance().resumeWebviewIfNecessary$android_sdk_ui_release();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda2(activity, 4), 6, (Object) null);
                    BrazeInAppMessageManager.Companion.getInstance().registerInAppMessageManager(activity);
                }
            } else {
                BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(activity);
            }
        }
        this.currentActivityRef = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda2(activity, 2), 6, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            companion.getInstance(applicationContext).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActivityLifecycleCallbackListener$$ExternalSyntheticLambda2(activity, 0), 6, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            companion.getInstance(applicationContext).closeSession(activity);
        }
    }

    public final void registerOnApplication(Context context) {
        context.getClass();
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(21), 4, (Object) null);
        }
    }

    public final void setInAppMessagingRegistrationBlocklist(Set<? extends Class<?>> set) {
        set.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda5(set, 1), 6, (Object) null);
        this.inAppMessagingRegistrationBlocklist = set;
    }

    public final void setSessionHandlingBlocklist(Set<? extends Class<?>> set) {
        set.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda5(set, 2), 6, (Object) null);
        this.sessionHandlingBlocklist = set;
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean z) {
        activity.getClass();
        Class<?> cls = activity.getClass();
        if (cls.equals(NotificationTrampolineActivity.class)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda45(23), 6, (Object) null);
            return false;
        }
        if (z) {
            return !this.sessionHandlingBlocklist.contains(cls);
        }
        return !this.inAppMessagingRegistrationBlocklist.contains(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setInAppMessagingRegistrationBlocklist$lambda$0(Set set) {
        return "setInAppMessagingRegistrationBlocklist called with blocklist: " + set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSessionHandlingBlocklist$lambda$0(Set set) {
        return "setSessionHandlingBlocklist called with blocklist: " + set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: " + brazeActivityLifecycleCallbackListener.inAppMessagingRegistrationBlocklist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "BrazeActivityLifecycleCallbackListener using session handling blocklist: " + brazeActivityLifecycleCallbackListener.sessionHandlingBlocklist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityCreated$lambda$0(Activity activity) {
        return c8$$ExternalSyntheticOutline0.m(activity.getClass(), "Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityPaused$lambda$0(Activity activity) {
        return c8$$ExternalSyntheticOutline0.m(activity.getClass(), "Automatically calling lifecycle method: unregisterInAppMessageManager for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityPaused$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "Skipping unregisterInAppMessageManager in onActivityPaused. shouldPersistWebView=" + brazeActivityLifecycleCallbackListener.shouldPersistWebView + " (null means async load incomplete, defaulting to persist)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityResumed$lambda$1(Activity activity) {
        return c8$$ExternalSyntheticOutline0.m(activity.getClass(), "Automatically calling lifecycle method: registerInAppMessageManager for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityStarted$lambda$0(Activity activity) {
        return c8$$ExternalSyntheticOutline0.m(activity.getClass(), "Automatically calling lifecycle method: openSession for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityStopped$lambda$0(Activity activity) {
        return c8$$ExternalSyntheticOutline0.m(activity.getClass(), "Automatically calling lifecycle method: closeSession for class: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set) {
        this((Set) set, (Set) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public BrazeActivityLifecycleCallbackListener(boolean z) {
        this(z, false, null, null, 14, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2) {
        this(z, z2, null, null, 12, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set<? extends Class<?>> set) {
        this(z, z2, set, null, 8, null);
    }

    public BrazeActivityLifecycleCallbackListener() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this(z, z2, (Set<? extends Class<?>>) ((i & 4) != 0 ? itemTouchHelperAdapter : set), (Set<? extends Class<?>>) ((i & 8) != 0 ? itemTouchHelperAdapter : set2));
    }

    public /* synthetic */ BrazeActivityLifecycleCallbackListener(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Set<? extends Class<?>>) set, (Set<? extends Class<?>>) ((i & 2) != 0 ? ItemTouchHelperAdapter.serializer : set2));
    }

    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this(true, true, set, set2);
    }
}
