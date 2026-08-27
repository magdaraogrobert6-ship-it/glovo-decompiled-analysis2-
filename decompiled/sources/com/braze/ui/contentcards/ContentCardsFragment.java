package com.braze.ui.contentcards;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import coil3.ExtrasKt;
import com.braze.Braze;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.ui.R;
import com.braze.ui.banners.BannerView$$ExternalSyntheticLambda0;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.accessgetSoftlightcp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getDstOut0nO6VwU;
import o.getExclusion0nO6VwU;
import o.getHardlight0nO6VwU;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public class ContentCardsFragment extends Fragment implements r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    public static final Companion Companion = new Companion(null);
    private static final String KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY = "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY";
    private static final String LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY = "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY";
    private static final int MAX_CONTENT_CARDS_TTL_SECONDS = 60;
    private static final long NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY = "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY";
    private static final String VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY = "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY";
    public ContentCardAdapter cardAdapter;
    private RecyclerView contentCardsRecyclerView;
    private SwipeRefreshLayout contentCardsSwipeLayout;
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;
    private IContentCardsUpdateHandler customContentCardUpdateHandler;
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;
    private setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 networkUnavailableJob;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private EmptyContentCardsAdapter defaultEmptyContentCardsAdapter = new EmptyContentCardsAdapter();
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
            return ContentCardsFragment.this.new AnonymousClass5(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ContentCardsFragment contentCardsFragment = ContentCardsFragment.this;
                this.label = 1;
                if (contentCardsFragment.networkUnavailable(this) == coroutineSingletons) {
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

        public AnonymousClass5(ShortNewsContentCardView<? super AnonymousClass5> shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass5) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ ContentCardsUpdatedEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ContentCardsUpdatedEvent contentCardsUpdatedEvent, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$event = contentCardsUpdatedEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return ContentCardsFragment.this.new AnonymousClass1(this.$event, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ContentCardsFragment contentCardsFragment = ContentCardsFragment.this;
                ContentCardsUpdatedEvent contentCardsUpdatedEvent = this.$event;
                this.label = 1;
                if (contentCardsFragment.contentCardsUpdate(contentCardsUpdatedEvent, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00801 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
            return ContentCardsFragment.this.new C00801(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SwipeRefreshLayout contentCardsSwipeLayout = ContentCardsFragment.this.getContentCardsSwipeLayout();
            if (contentCardsSwipeLayout != null) {
                contentCardsSwipeLayout.setRefreshing(false);
            }
            return createFromParcel.INSTANCE;
        }

        public C00801(ShortNewsContentCardView<? super C00801> shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((C00801) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00811 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ Bundle $savedInstanceState;
        int label;
        final /* synthetic */ ContentCardsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00811(Bundle bundle, ContentCardsFragment contentCardsFragment, ShortNewsContentCardView<? super C00811> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$savedInstanceState = bundle;
            this.this$0 = contentCardsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new C00811(this.$savedInstanceState, this.this$0, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList<String> stringArrayList;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i = Build.VERSION.SDK_INT;
            Bundle bundle = this.$savedInstanceState;
            Parcelable parcelable = i >= 33 ? (Parcelable) bundle.getParcelable(ContentCardsFragment.LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, Parcelable.class) : bundle.getParcelable(ContentCardsFragment.LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY);
            RecyclerView contentCardsRecyclerView = this.this$0.getContentCardsRecyclerView();
            if (contentCardsRecyclerView != null) {
                RecyclerView.LayoutManager layoutManager = contentCardsRecyclerView.getLayoutManager();
                if (parcelable != null && layoutManager != null) {
                    layoutManager.write(parcelable);
                }
            }
            ContentCardAdapter contentCardAdapter = this.this$0.cardAdapter;
            if (contentCardAdapter != null && (stringArrayList = this.$savedInstanceState.getStringArrayList(ContentCardsFragment.KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY)) != null) {
                contentCardAdapter.setImpressedCardIds(stringArrayList);
            }
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((C00811) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    public final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    public final IEventSubscriber<ContentCardsUpdatedEvent> getContentCardsUpdatedSubscriber() {
        return this.contentCardsUpdatedSubscriber;
    }

    public final IContentCardsUpdateHandler getCustomContentCardUpdateHandler() {
        return this.customContentCardUpdateHandler;
    }

    public final IContentCardsViewBindingHandler getCustomContentCardsViewBindingHandler() {
        return this.customContentCardsViewBindingHandler;
    }

    public final IContentCardsUpdateHandler getDefaultContentCardUpdateHandler() {
        return this.defaultContentCardUpdateHandler;
    }

    public final IContentCardsViewBindingHandler getDefaultContentCardsViewBindingHandler() {
        return this.defaultContentCardsViewBindingHandler;
    }

    public final EmptyContentCardsAdapter getDefaultEmptyContentCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final RecyclerView.Adapter getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 getNetworkUnavailableJob() {
        return this.networkUnavailableJob;
    }

    public final IEventSubscriber<SdkDataWipeEvent> getSdkDataWipeEventSubscriber() {
        return this.sdkDataWipeEventSubscriber;
    }

    public final void setContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    public final void setContentCardsRecyclerView(RecyclerView recyclerView) {
        this.contentCardsRecyclerView = recyclerView;
    }

    public final void setContentCardsSwipeLayout(SwipeRefreshLayout swipeRefreshLayout) {
        this.contentCardsSwipeLayout = swipeRefreshLayout;
    }

    public final void setContentCardsUpdatedSubscriber(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber) {
        this.contentCardsUpdatedSubscriber = iEventSubscriber;
    }

    public final void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    public final void setCustomContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    public final void setCustomContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    public final void setNetworkUnavailableJob(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0) {
        this.networkUnavailableJob = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
    }

    public final void setSdkDataWipeEventSubscriber(IEventSubscriber<SdkDataWipeEvent> iEventSubscriber) {
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$1() {
        return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$2() {
        return "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String networkUnavailable$lambda$0() {
        return "Network is unavailable.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPause$lambda$0() {
        return "Invoked com.braze.ui.contentcards.ContentCardsFragment.onPause()";
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d6 A[LOOP:0: B:36:0x00d0->B:38:0x00d6, LOOP_END] */
    public final Object contentCardsUpdate(ContentCardsUpdatedEvent contentCardsUpdatedEvent, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        Iterator<T> it;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(8, contentCardsUpdatedEvent), 6, (Object) null);
        List<Card> listHandleCardUpdate = getContentCardUpdateHandler().handleCardUpdate(contentCardsUpdatedEvent);
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.replaceCards(listHandleCardUpdate);
        }
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.networkUnavailableJob;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.networkUnavailableJob = null;
        boolean zIsFromOfflineStorage = contentCardsUpdatedEvent.isFromOfflineStorage();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (zIsFromOfflineStorage && contentCardsUpdatedEvent.isTimestampOlderThan(60L)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(23), 6, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            companion.getInstance(contextRequireContext).requestContentCardsRefresh();
            if (listHandleCardUpdate.isEmpty()) {
                SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(24), 7, (Object) null);
                setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda1 = this.networkUnavailableJob;
                if (setallviewgroupchildrenasnonaccessibilityimportantlambda1 != null) {
                    setallviewgroupchildrenasnonaccessibilityimportantlambda1.write(null);
                }
                BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
                Long l = new Long(5000L);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                this.networkUnavailableJob = brazeCoroutineScope.launchDelayed(l, MainDispatcherLoader.read, new AnonymousClass5(null));
                return createfromparcel;
            }
        }
        List<Card> list = listHandleCardUpdate;
        if ((list instanceof Collection) && list.isEmpty()) {
            it = list.iterator();
            while (it.hasNext()) {
                ((Card) it.next()).logImpression();
            }
            swapRecyclerViewAdapter(getEmptyCardsAdapter());
        } else {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        ((Card) it.next()).logImpression();
                    }
                    swapRecyclerViewAdapter(getEmptyCardsAdapter());
                } else if (!((Card) it2.next()).isControl()) {
                    ContentCardAdapter contentCardAdapter2 = this.cardAdapter;
                    if (contentCardAdapter2 != null) {
                        swapRecyclerViewAdapter(contentCardAdapter2);
                    }
                }
            }
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        return createfromparcel;
    }

    public final void initializeRecyclerView() {
        getActivity();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ContentCardAdapter contentCardAdapter = new ContentCardAdapter(contextRequireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = contentCardAdapter;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(contentCardAdapter);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        RecyclerView.ItemAnimator itemAnimator = recyclerView3 != null ? recyclerView3.getItemAnimator() : null;
        if (itemAnimator instanceof accessgetSoftlightcp) {
            ((accessgetSoftlightcp) itemAnimator).PlaybackStateCompatCustomAction = false;
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            recyclerView4.addItemDecoration(new ContentCardsDividerItemDecoration(contextRequireContext2));
        }
    }

    public final Object networkUnavailable(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(22), 6, (Object) null);
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return createFromParcel.INSTANCE;
    }

    @Override // o.r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM
    public void onRefresh() {
        Braze.Companion companion = Braze.Companion;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        companion.getInstance(contextRequireContext).requestContentCardsRefresh();
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS), null, new C00801(null), 2, null);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(ContentCardsFragment contentCardsFragment, ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        contentCardsUpdatedEvent.getClass();
        contentCardsFragment.handleContentCardsUpdatedEvent(contentCardsUpdatedEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2(ContentCardsFragment contentCardsFragment, SdkDataWipeEvent sdkDataWipeEvent) {
        sdkDataWipeEvent.getClass();
        contentCardsFragment.handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent.Companion.getEmptyUpdate());
    }

    public final void handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        contentCardsUpdatedEvent.getClass();
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(brazeCoroutineScope, MainDispatcherLoader.read, null, new AnonymousClass1(contentCardsUpdatedEvent, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.com_braze_content_cards, viewGroup, false);
        this.contentCardsRecyclerView = (RecyclerView) viewInflate.findViewById(R.id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.braze_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(R.color.com_braze_content_cards_swipe_refresh_color_1, R.color.com_braze_content_cards_swipe_refresh_color_2, R.color.com_braze_content_cards_swipe_refresh_color_3, R.color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(25), 6, (Object) null);
        Braze.Companion companion = Braze.Companion;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        companion.getInstance(contextRequireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        companion.getInstance(contextRequireContext2).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.networkUnavailableJob;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.networkUnavailableJob = null;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.markOnScreenCardsAsRead();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.Companion companion = Braze.Companion;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        companion.getInstance(contextRequireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            this.contentCardsUpdatedSubscriber = new BannerView$$ExternalSyntheticLambda0(1, this);
        }
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber != null) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            companion.getInstance(contextRequireContext2).subscribeToContentCardsUpdates(iEventSubscriber);
        }
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        companion.getInstance(contextRequireContext3).requestContentCardsRefreshFromCache();
        Context contextRequireContext4 = requireContext();
        contextRequireContext4.getClass();
        companion.getInstance(contextRequireContext4).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        if (this.sdkDataWipeEventSubscriber == null) {
            this.sdkDataWipeEventSubscriber = new BannerView$$ExternalSyntheticLambda0(2, this);
        }
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber2 = this.sdkDataWipeEventSubscriber;
        if (iEventSubscriber2 != null) {
            Context contextRequireContext5 = requireContext();
            contextRequireContext5.getClass();
            companion.getInstance(contextRequireContext5).addSingleSynchronousSubscription(iEventSubscriber2, SdkDataWipeEvent.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        RecyclerView.LayoutManager layoutManager;
        bundle.getClass();
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            bundle.putParcelable(LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, layoutManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
        }
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            bundle.putStringArrayList(KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY, new ArrayList<>(contentCardAdapter.getImpressedCardIds()));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            bundle.putParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            bundle.putParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsUpdateHandler);
        }
    }

    public final void setDefaultEmptyContentCardsAdapter(EmptyContentCardsAdapter emptyContentCardsAdapter) {
        emptyContentCardsAdapter.getClass();
        this.defaultEmptyContentCardsAdapter = emptyContentCardsAdapter;
    }

    public final void swapRecyclerViewAdapter(RecyclerView.Adapter adapter) {
        adapter.getClass();
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView == null || recyclerView.getAdapter() == adapter) {
            return;
        }
        recyclerView.setAdapter(adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$0(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        return "Updating Content Cards views in response to ContentCardsUpdatedEvent: " + contentCardsUpdatedEvent;
    }

    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        return iContentCardsUpdateHandler == null ? this.defaultContentCardUpdateHandler : iContentCardsUpdateHandler;
    }

    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler == null ? this.defaultContentCardsViewBindingHandler : iContentCardsViewBindingHandler;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            int i = Build.VERSION.SDK_INT;
            IContentCardsUpdateHandler iContentCardsUpdateHandler = i >= 33 ? (IContentCardsUpdateHandler) bundle.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsUpdateHandler.class) : (IContentCardsUpdateHandler) bundle.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY);
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            IContentCardsViewBindingHandler iContentCardsViewBindingHandler = i >= 33 ? (IContentCardsViewBindingHandler) bundle.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsViewBindingHandler.class) : (IContentCardsViewBindingHandler) bundle.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY);
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(brazeCoroutineScope, MainDispatcherLoader.read, null, new C00811(bundle, this, null), 2);
        }
        initializeRecyclerView();
    }

    public final void attachSwipeHelperCallback() {
        ItemTouchHelper itemTouchHelper;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter == null || (recyclerView2 = (itemTouchHelper = new ItemTouchHelper(new SimpleItemTouchHelperCallback(contentCardAdapter))).ComponentActivity) == (recyclerView = this.contentCardsRecyclerView)) {
            return;
        }
        getHardlight0nO6VwU gethardlight0no6vwu = itemTouchHelper.MediaSessionCompatResultReceiverWrapper;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(itemTouchHelper);
            RecyclerView recyclerView3 = itemTouchHelper.ComponentActivity;
            recyclerView3.addOnPictureInPictureModeChangedListener.remove(gethardlight0no6vwu);
            if (recyclerView3._init_lambda2 == gethardlight0no6vwu) {
                recyclerView3._init_lambda2 = null;
            }
            ArrayList arrayList = itemTouchHelper.ComponentActivity.addMenuProvider;
            if (arrayList != null) {
                arrayList.remove(itemTouchHelper);
            }
            ArrayList arrayList2 = itemTouchHelper.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                getDstOut0nO6VwU getdstout0no6vwu = (getDstOut0nO6VwU) arrayList2.get(0);
                getdstout0no6vwu.MediaMetadataCompat.cancel();
                itemTouchHelper.serializer.clearView(itemTouchHelper.ComponentActivity, getdstout0no6vwu.PlaybackStateCompat);
            }
            arrayList2.clear();
            itemTouchHelper.PlaybackStateCompatCustomAction = null;
            VelocityTracker velocityTracker = itemTouchHelper.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                itemTouchHelper.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
            }
            getExclusion0nO6VwU getexclusion0no6vwu = itemTouchHelper.PlaybackStateCompat;
            if (getexclusion0no6vwu != null) {
                getexclusion0no6vwu.IconCompatParcelizer = false;
                itemTouchHelper.PlaybackStateCompat = null;
            }
            if (itemTouchHelper.MediaMetadataCompat != null) {
                itemTouchHelper.MediaMetadataCompat = null;
            }
        }
        itemTouchHelper.ComponentActivity = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            itemTouchHelper.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = resources.getDimension(com.logistics.rider.glovo.R.dimen.item_touch_helper_swipe_escape_velocity);
            itemTouchHelper.ParcelableVolumeInfo = resources.getDimension(com.logistics.rider.glovo.R.dimen.item_touch_helper_swipe_escape_max_velocity);
            itemTouchHelper.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = ViewConfiguration.get(itemTouchHelper.ComponentActivity.getContext()).getScaledTouchSlop();
            itemTouchHelper.ComponentActivity.addItemDecoration(itemTouchHelper);
            itemTouchHelper.ComponentActivity.addOnPictureInPictureModeChangedListener.add(gethardlight0no6vwu);
            RecyclerView recyclerView4 = itemTouchHelper.ComponentActivity;
            if (recyclerView4.addMenuProvider == null) {
                recyclerView4.addMenuProvider = new ArrayList();
            }
            recyclerView4.addMenuProvider.add(itemTouchHelper);
            itemTouchHelper.PlaybackStateCompat = new getExclusion0nO6VwU(itemTouchHelper);
            itemTouchHelper.MediaMetadataCompat = new GestureDetector(itemTouchHelper.ComponentActivity.getContext(), itemTouchHelper.PlaybackStateCompat);
        }
    }
}
