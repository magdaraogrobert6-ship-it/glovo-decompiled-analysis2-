package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import androidx.work.CoroutineWorker$startWork$1;
import bo.app.a5$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.util.ContextsKt;
import coil3.util.IntPair;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenViewModel;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.settings.SettingsViewModel;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.sentiance.core.model.events.I$b;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.C0172getimpl;
import o.CanvasDefaultImpls;
import o.ClipOpCompanion;
import o.Colordefault;
import o.ItemTouchHelperAdapter;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShaderBrush;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.ShortNewsContentCardViewViewHolder;
import o.SimpleItemTouchHelperCallback;
import o.TextAnnouncementContentCardView;
import o.UncheckedColor;
import o.UncheckedColordefault;
import o.accessdrawOvaljd;
import o.accessgetCompositingStrategyNrFUSIjd;
import o.accessgetInstancedelegatecp;
import o.accessgetMagentacp;
import o.afterRollback;
import o.clipPathmtrdDEdefault;
import o.colorResource;
import o.compositeComponent;
import o.compositeOverOWjLjI;
import o.copyYTHSh70;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getAndroidCanvasannotations;
import o.getBlack0d7_KjUannotations;
import o.getCardAtIndex;
import o.getContentViewGroupParentLayout;
import o.getDifferencertfAjoo;
import o.getGreen0d7_KjUannotations;
import o.getIntersectrtfAjoo;
import o.getRed0d7_KjUannotations;
import o.getUnregisteredInAppMessageannotations;
import o.instance_delegatelambda0;
import o.isInvalidIndex;
import o.lerpNullableFloatList;
import o.luminance8_81llA;
import o.onAnimationEndlambda1;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.onMove;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.rotateRad;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCarryoverInAppMessage;
import o.skewRad;
import o.tintxETnrds;
import o.width;
import o.withSave;
import okio.Okio;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public abstract class RoomDatabase {
    public static final CanvasDefaultImpls write = new CanvasDefaultImpls();
    public List<? extends skewRad> IconCompatParcelizer;
    private lerpNullableFloatList MediaBrowserCompatMediaItem;
    private Executor MediaDescriptionCompat;
    private getContentViewGroupParentLayout MediaMetadataCompat;
    private clipPathmtrdDEdefault MediaSessionCompatQueueItem;
    private Executor MediaSessionCompatResultReceiverWrapper;
    private TextAnnouncementContentCardView PlaybackStateCompat;
    private InvalidationTracker RatingCompat;
    private boolean read;
    public volatile UncheckedColor serializer;
    private final accessgetMagentacp RemoteActionCompatParcelizer = new accessgetMagentacp(new RoomDatabase$closeBarrier$1(0, this, RoomDatabase.class, "onClosed", "onClosed()V", 0, 0));
    private final ThreadLocal<TextAnnouncementContentCardView> PlaybackStateCompatCustomAction = new ThreadLocal<>();
    private final Map<getUnregisteredInAppMessageannotations, Object> ParcelableVolumeInfo = new LinkedHashMap();
    private boolean MediaSessionCompatToken = true;

    @onItemDismisslambda0
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public abstract void clearAllTables();

    public abstract InvalidationTracker createInvalidationTracker();

    public final accessgetMagentacp getCloseBarrier$room_runtime() {
        return this.RemoteActionCompatParcelizer;
    }

    @onItemDismisslambda0
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return ItemTouchHelperAdapter.serializer;
    }

    public final Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return SimpleItemTouchHelperCallback.serializer;
    }

    public final ThreadLocal<TextAnnouncementContentCardView> getSuspendingTransactionContext() {
        return this.PlaybackStateCompatCustomAction;
    }

    public final boolean getUseTempTrackingTable$room_runtime() {
        return this.MediaSessionCompatToken;
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z) {
        this.MediaSessionCompatToken = z;
    }

    public void close() throws Exception {
        accessgetMagentacp accessgetmagentacp = this.RemoteActionCompatParcelizer;
        synchronized (accessgetmagentacp) {
            if (accessgetmagentacp.RemoteActionCompatParcelizer.compareAndSet(false, true)) {
                while (accessgetmagentacp.write.get() != 0) {
                }
                accessgetmagentacp.serializer.invoke();
            }
        }
    }

    public final void addTypeConverter$room_runtime(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, Object obj) {
        getunregisteredinappmessageannotations.getClass();
        obj.getClass();
        this.ParcelableVolumeInfo.put(getunregisteredinappmessageannotations, obj);
    }

    @onItemDismisslambda0
    public void beginTransaction() {
        assertNotMainThread();
        assertNotMainThread();
        UncheckedColor uncheckedColorIconCompatParcelizer = getOpenHelper().IconCompatParcelizer();
        if (!uncheckedColorIconCompatParcelizer.MediaDescriptionCompat()) {
            InvalidationTracker invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            ContextsKt.RemoteActionCompatParcelizer(new CoroutineWorker$startWork$1(invalidationTracker, null, 1));
        }
        if (uncheckedColorIconCompatParcelizer.PlaybackStateCompatCustomAction()) {
            uncheckedColorIconCompatParcelizer.RemoteActionCompatParcelizer();
        } else {
            uncheckedColorIconCompatParcelizer.serializer();
        }
    }

    public luminance8_81llA compileStatement(String str) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().IconCompatParcelizer().write(str);
    }

    public final clipPathmtrdDEdefault createConnectionManager$room_runtime(lerpNullableFloatList lerpnullablefloatlist) {
        getAndroidCanvasannotations getandroidcanvasannotations;
        lerpnullablefloatlist.getClass();
        try {
            rotateRad rotateradCreateOpenDelegate = createOpenDelegate();
            rotateradCreateOpenDelegate.getClass();
            getandroidcanvasannotations = (getAndroidCanvasannotations) rotateradCreateOpenDelegate;
        } catch (getCardAtIndex unused) {
            getandroidcanvasannotations = null;
        }
        return getandroidcanvasannotations == null ? new clipPathmtrdDEdefault(lerpnullablefloatlist, new RoomDatabase$$ExternalSyntheticLambda2(0, this), new RoomDatabase$createConnectionManager$2(this)) : new clipPathmtrdDEdefault(lerpnullablefloatlist, getandroidcanvasannotations, new RoomDatabase$createConnectionManager$3(2, this, LazyKt__LazyJVMKt.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0));
    }

    public rotateRad createOpenDelegate() {
        throw new getCardAtIndex(0);
    }

    @onItemDismisslambda0
    public List<getBlack0d7_KjUannotations> getAutoMigrations(Map<Class<Object>, Object> map) {
        map.getClass();
        return instance_delegatelambda0.write;
    }

    @onItemDismisslambda0
    public <T> T getTypeConverter(Class<T> cls) {
        cls.getClass();
        return (T) this.ParcelableVolumeInfo.get(displayInAppMessagelambda1.serializer(cls));
    }

    public final void internalInitInvalidationTracker(tintxETnrds tintxetnrds) {
        tintxetnrds.getClass();
        InvalidationTracker invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.write;
        triggerBasedInvalidationTracker.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("PRAGMA query_only");
        try {
            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
            boolean zSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer();
            Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
            if (!zSerializer) {
                SQLite.serializer(tintxetnrds, "PRAGMA temp_store = MEMORY");
                SQLite.serializer(tintxetnrds, "PRAGMA recursive_triggers = 1");
                SQLite.serializer(tintxetnrds, "DROP TABLE IF EXISTS room_table_modification_log");
                if (triggerBasedInvalidationTracker.PlaybackStateCompat) {
                    SQLite.serializer(tintxetnrds, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    SQLite.serializer(tintxetnrds, setCarryoverInAppMessage.write("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                accessdrawOvaljd accessdrawovaljd = triggerBasedInvalidationTracker.write;
                ReentrantLock reentrantLock = accessdrawovaljd.serializer;
                reentrantLock.lock();
                try {
                    accessdrawovaljd.read = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (invalidationTracker.MediaMetadataCompat) {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = invalidationTracker.RemoteActionCompatParcelizer;
                if (multiInstanceInvalidationClient != null) {
                    Intent intent = invalidationTracker.IconCompatParcelizer;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    multiInstanceInvalidationClient.write(intent);
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th2);
                throw th3;
            }
        }
    }

    public final void performClear(boolean z, String... strArr) {
        strArr.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        ContextsKt.RemoteActionCompatParcelizer(new AnonymousClass1(this, z, strArr, null, 0));
    }

    public Cursor query(compositeOverOWjLjI compositeoverowjlji, CancellationSignal cancellationSignal) {
        compositeoverowjlji.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().IconCompatParcelizer().RemoteActionCompatParcelizer(compositeoverowjlji, cancellationSignal) : getOpenHelper().IconCompatParcelizer().serializer(compositeoverowjlji);
    }

    @onItemDismisslambda0
    public void endTransaction() {
        getOpenHelper().IconCompatParcelizer().MediaMetadataCompat();
        if (inTransaction()) {
            return;
        }
        InvalidationTracker invalidationTracker = getInvalidationTracker();
        invalidationTracker.write.read(invalidationTracker.MediaSessionCompatQueueItem, invalidationTracker.MediaBrowserCompatMediaItem);
    }

    public final TextAnnouncementContentCardView getQueryContext() {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.MediaMetadataCompat;
        if (getcontentviewgroupparentlayout != null) {
            return getcontentviewgroupparentlayout.getCoroutineContext();
        }
        removeNodeAtDepth.serializer("coroutineScope");
        throw null;
    }

    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(Options.Companion.read((Class) it.next()));
        }
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
    }

    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(setEntrySet, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = Options.Companion.read(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Options.Companion.read((Class) it2.next()));
            }
            linkedHashMap.put(r8lambdaucgighn8fiyv_vccodeafjfpedk, arrayList);
        }
        return linkedHashMap;
    }

    public final boolean inCompatibilityMode() {
        clipPathmtrdDEdefault clippathmtrddedefault = this.MediaSessionCompatQueueItem;
        if (clippathmtrddedefault != null) {
            return clippathmtrddedefault.MediaDescriptionCompat != null;
        }
        removeNodeAtDepth.serializer("connectionManager");
        throw null;
    }

    public void init(lerpNullableFloatList lerpnullablefloatlist) {
        TextAnnouncementContentCardView coroutineContext;
        int i;
        lerpnullablefloatlist.getClass();
        String str = lerpnullablefloatlist.MediaSessionCompatResultReceiverWrapper;
        Intent intent = lerpnullablefloatlist.MediaSessionCompatToken;
        TextAnnouncementContentCardView textAnnouncementContentCardView = lerpnullablefloatlist.ParcelableVolumeInfo;
        this.MediaBrowserCompatMediaItem = lerpnullablefloatlist;
        this.MediaSessionCompatToken = lerpnullablefloatlist.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        this.MediaSessionCompatQueueItem = createConnectionManager$room_runtime(lerpnullablefloatlist);
        this.RatingCompat = createInvalidationTracker();
        accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd = lerpnullablefloatlist.PlaybackStateCompat;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<getUnregisteredInAppMessageannotations> requiredAutoMigrationSpecClasses = getRequiredAutoMigrationSpecClasses();
        List list = lerpnullablefloatlist.write;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        for (getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations : requiredAutoMigrationSpecClasses) {
            int size2 = list.size() - 1;
            if (size2 < 0) {
                i = -1;
                break;
            }
            while (true) {
                int i2 = size2 - 1;
                if (((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations).read(list.get(size2))) {
                    zArr[size2] = true;
                    i = size2;
                    break;
                } else {
                    if (i2 < 0) {
                        i = -1;
                        break;
                    }
                    size2 = i2;
                }
            }
            if (i >= 0) {
                linkedHashMap.put(getunregisteredinappmessageannotations, list.get(i));
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("A required auto migration spec (", ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations).RemoteActionCompatParcelizer(), ") is missing in the database configuration.");
                return;
            }
        }
        int size3 = list.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                if (size3 >= size || !zArr[size3]) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    return;
                } else if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        for (getBlack0d7_KjUannotations getblack0d7_kjuannotations : createAutoMigrations(linkedHashMap)) {
            int i4 = getblack0d7_kjuannotations.RemoteActionCompatParcelizer;
            int i5 = getblack0d7_kjuannotations.serializer;
            LinkedHashMap linkedHashMap2 = accessgetcompositingstrategynrfusijd.serializer;
            if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                Map map = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                if (map == null) {
                    map = SimpleItemTouchHelperCallback.serializer;
                }
                if (!map.containsKey(Integer.valueOf(i5))) {
                }
            }
            accessgetcompositingstrategynrfusijd.write(getblack0d7_kjuannotations);
        }
        Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> requiredTypeConverterClassesMap$room_runtime = getRequiredTypeConverterClassesMap$room_runtime();
        List list2 = lerpnullablefloatlist.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        boolean[] zArr2 = new boolean[list2.size()];
        for (Map.Entry<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> entry : requiredTypeConverterClassesMap$room_runtime.entrySet()) {
            getUnregisteredInAppMessageannotations key = entry.getKey();
            for (getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations2 : entry.getValue()) {
                int size4 = list2.size() - 1;
                if (size4 < 0) {
                    size4 = -1;
                    break;
                }
                while (true) {
                    int i6 = size4 - 1;
                    if (((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations2).read(list2.get(size4))) {
                        zArr2[size4] = true;
                        break;
                    } else {
                        if (i6 < 0) {
                            size4 = -1;
                            break;
                        }
                        size4 = i6;
                    }
                }
                if (size4 >= 0) {
                    addTypeConverter$room_runtime(getunregisteredinappmessageannotations2, list2.get(size4));
                } else {
                    throw new IllegalArgumentException(("A required type converter (" + ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations2).RemoteActionCompatParcelizer() + ") for " + ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) key).RemoteActionCompatParcelizer() + " is missing in the database configuration.").toString());
                }
            }
        }
        int size5 = list2.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i7 = size5 - 1;
                if (!zArr2[size5]) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(list2.get(size5), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                    return;
                } else if (i7 < 0) {
                    break;
                } else {
                    size5 = i7;
                }
            }
        }
        compositeComponent compositecomponent = null;
        if (textAnnouncementContentCardView != null) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = textAnnouncementContentCardView.get(ShortNewsContentCardViewCompanion.serializer);
            shortNewsContentCardViewViewHolder.getClass();
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) shortNewsContentCardViewViewHolder;
            Executor executorWrite = IntPair.write(coroutineDispatcher);
            this.MediaDescriptionCompat = executorWrite;
            this.MediaSessionCompatResultReceiverWrapper = new getDifferencertfAjoo(executorWrite, 0);
            this.MediaMetadataCompat = YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView.plus(new onBackInvokedlambda0((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer))));
            boolean zInCompatibilityMode = inCompatibilityMode();
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.MediaMetadataCompat;
            if (zInCompatibilityMode) {
                if (getcontentviewgroupparentlayout != null) {
                    coroutineContext = getcontentviewgroupparentlayout.getCoroutineContext().plus(coroutineDispatcher.limitedParallelism(1));
                } else {
                    removeNodeAtDepth.serializer("coroutineScope");
                    throw null;
                }
            } else if (getcontentviewgroupparentlayout != null) {
                coroutineContext = getcontentviewgroupparentlayout.getCoroutineContext();
            } else {
                removeNodeAtDepth.serializer("coroutineScope");
                throw null;
            }
            this.PlaybackStateCompat = coroutineContext;
        } else {
            this.MediaDescriptionCompat = lerpnullablefloatlist.ResultReceiver;
            this.MediaSessionCompatResultReceiverWrapper = new getDifferencertfAjoo(lerpnullablefloatlist.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 0);
            Executor executor = this.MediaDescriptionCompat;
            if (executor != null) {
                int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(((CoroutineDispatcher) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{executor}, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1915506938)).plus(UrlUtils.serializer()));
                this.MediaMetadataCompat = contextScopeRemoteActionCompatParcelizer;
                TextAnnouncementContentCardView textAnnouncementContentCardView2 = contextScopeRemoteActionCompatParcelizer.serializer;
                Executor executor2 = this.MediaSessionCompatResultReceiverWrapper;
                if (executor2 != null) {
                    int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                    this.PlaybackStateCompat = textAnnouncementContentCardView2.plus((CoroutineDispatcher) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{executor2}, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1915506938));
                } else {
                    removeNodeAtDepth.serializer("internalTransactionExecutor");
                    throw null;
                }
            } else {
                removeNodeAtDepth.serializer("internalQueryExecutor");
                throw null;
            }
        }
        this.read = lerpnullablefloatlist.serializer;
        clipPathmtrdDEdefault clippathmtrddedefault = this.MediaSessionCompatQueueItem;
        if (clippathmtrddedefault != null) {
            compositeComponent compositecomponentSerializer = clippathmtrddedefault.MediaDescriptionCompat;
            if (compositecomponentSerializer == null) {
                compositecomponentSerializer = null;
                break;
            }
            while (!(compositecomponentSerializer instanceof getRed0d7_KjUannotations)) {
                if (!(compositecomponentSerializer instanceof ShaderBrush)) {
                    compositecomponentSerializer = null;
                    break;
                }
                compositecomponentSerializer = ((ShaderBrush) compositecomponentSerializer).serializer();
            }
            clipPathmtrdDEdefault clippathmtrddedefault2 = this.MediaSessionCompatQueueItem;
            if (clippathmtrddedefault2 != null) {
                compositeComponent compositecomponentSerializer2 = clippathmtrddedefault2.MediaDescriptionCompat;
                if (compositecomponentSerializer2 != null) {
                    while (true) {
                        if (compositecomponentSerializer2 instanceof getGreen0d7_KjUannotations) {
                            compositecomponent = compositecomponentSerializer2;
                            break;
                        } else if (!(compositecomponentSerializer2 instanceof ShaderBrush)) {
                            break;
                        } else {
                            compositecomponentSerializer2 = ((ShaderBrush) compositecomponentSerializer2).serializer();
                        }
                    }
                }
                if (intent != null) {
                    if (str != null) {
                        InvalidationTracker invalidationTracker = getInvalidationTracker();
                        Context context = lerpnullablefloatlist.MediaBrowserCompatMediaItem;
                        invalidationTracker.getClass();
                        context.getClass();
                        invalidationTracker.IconCompatParcelizer = intent;
                        invalidationTracker.RemoteActionCompatParcelizer = new MultiInstanceInvalidationClient(context, str, invalidationTracker);
                        return;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                    return;
                }
                return;
            }
            removeNodeAtDepth.serializer("connectionManager");
            throw null;
        }
        removeNodeAtDepth.serializer("connectionManager");
        throw null;
    }

    public final boolean isMainThread$room_runtime() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        clipPathmtrdDEdefault clippathmtrddedefault = this.MediaSessionCompatQueueItem;
        if (clippathmtrddedefault == null) {
            removeNodeAtDepth.serializer("connectionManager");
            throw null;
        }
        UncheckedColor uncheckedColor = clippathmtrddedefault.RatingCompat;
        if (uncheckedColor != null) {
            return uncheckedColor.RatingCompat();
        }
        return false;
    }

    public final boolean isOpenInternal$room_runtime() {
        clipPathmtrdDEdefault clippathmtrddedefault = this.MediaSessionCompatQueueItem;
        if (clippathmtrddedefault == null) {
            removeNodeAtDepth.serializer("connectionManager");
            throw null;
        }
        UncheckedColor uncheckedColor = clippathmtrddedefault.RatingCompat;
        if (uncheckedColor != null) {
            return uncheckedColor.RatingCompat();
        }
        return false;
    }

    @onItemDismisslambda0
    public void setTransactionSuccessful() {
        getOpenHelper().IconCompatParcelizer().MediaSessionCompatResultReceiverWrapper();
    }

    public final <R> Object useConnection(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        clipPathmtrdDEdefault clippathmtrddedefault = this.MediaSessionCompatQueueItem;
        if (clippathmtrddedefault != null) {
            return clippathmtrddedefault.read.useConnection(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
        }
        removeNodeAtDepth.serializer("connectionManager");
        throw null;
    }

    public static final void access$onClosed(RoomDatabase roomDatabase) throws Exception {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = roomDatabase.MediaMetadataCompat;
        if (getcontentviewgroupparentlayout == null) {
            removeNodeAtDepth.serializer("coroutineScope");
            throw null;
        }
        YieldKt.write(getcontentviewgroupparentlayout, (CancellationException) null);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = roomDatabase.getInvalidationTracker().RemoteActionCompatParcelizer;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.serializer();
        }
        clipPathmtrdDEdefault clippathmtrddedefault = roomDatabase.MediaSessionCompatQueueItem;
        if (clippathmtrddedefault == null) {
            removeNodeAtDepth.serializer("connectionManager");
            throw null;
        }
        clippathmtrddedefault.read.close();
        compositeComponent compositecomponent = clippathmtrddedefault.MediaDescriptionCompat;
        if (compositecomponent != null) {
            compositecomponent.close();
        }
    }

    public void assertNotMainThread() {
        if (!this.read && isMainThread$room_runtime()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Options.Companion.read((getUnregisteredInAppMessageannotations) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final Colordefault getDriver() {
        lerpNullableFloatList lerpnullablefloatlist = this.MediaBrowserCompatMediaItem;
        if (lerpnullablefloatlist == null) {
            removeNodeAtDepth.serializer("configuration");
            throw null;
        }
        Colordefault colordefault = lerpnullablefloatlist.ComponentActivity;
        if (colordefault != null) {
            return colordefault;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("No SQLiteDriver was configured with Room.");
        return null;
    }

    public compositeComponent getOpenHelper() {
        clipPathmtrdDEdefault clippathmtrddedefault = this.MediaSessionCompatQueueItem;
        if (clippathmtrddedefault == null) {
            removeNodeAtDepth.serializer("connectionManager");
            throw null;
        }
        compositeComponent compositecomponent = clippathmtrddedefault.MediaDescriptionCompat;
        if (compositecomponent != null) {
            return compositecomponent;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final String getPath() {
        lerpNullableFloatList lerpnullablefloatlist = this.MediaBrowserCompatMediaItem;
        if (lerpnullablefloatlist == null) {
            removeNodeAtDepth.serializer("configuration");
            throw null;
        }
        String str = lerpnullablefloatlist.MediaSessionCompatResultReceiverWrapper;
        if (str == null) {
            return null;
        }
        if (lerpnullablefloatlist != null) {
            return lerpnullablefloatlist.MediaBrowserCompatMediaItem.getDatabasePath(str).getPath();
        }
        removeNodeAtDepth.serializer("configuration");
        throw null;
    }

    public void assertNotSuspendingTransaction() {
        if (!inCompatibilityMode() || inTransaction()) {
            return;
        }
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.PlaybackStateCompatCustomAction.get();
        if ((textAnnouncementContentCardView != null ? (withSave) textAnnouncementContentCardView.get(withSave.write) : null) == null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @onItemDismisslambda0
    public compositeComponent createOpenHelper(lerpNullableFloatList lerpnullablefloatlist) {
        lerpnullablefloatlist.getClass();
        throw new getCardAtIndex(0);
    }

    public boolean inTransaction() {
        return isOpenInternal$room_runtime() && getOpenHelper().IconCompatParcelizer().MediaDescriptionCompat();
    }

    public final Object runInTransaction(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (!inCompatibilityMode()) {
            return TuplesKt.write(this, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new RoomDatabase$$ExternalSyntheticLambda4(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        }
        beginTransaction();
        try {
            Object objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            setTransactionSuccessful();
            return objInvoke;
        } finally {
            endTransaction();
        }
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, compositeOverOWjLjI compositeoverowjlji, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return roomDatabase.query(compositeoverowjlji, cancellationSignal);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: query");
        return null;
    }

    public final getContentViewGroupParentLayout getCoroutineScope() {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.MediaMetadataCompat;
        if (getcontentviewgroupparentlayout != null) {
            return getcontentviewgroupparentlayout;
        }
        removeNodeAtDepth.serializer("coroutineScope");
        throw null;
    }

    public InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.RatingCompat;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        removeNodeAtDepth.serializer("internalTracker");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.MediaDescriptionCompat;
        if (executor != null) {
            return executor;
        }
        removeNodeAtDepth.serializer("internalQueryExecutor");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.MediaSessionCompatResultReceiverWrapper;
        if (executor != null) {
            return executor;
        }
        removeNodeAtDepth.serializer("internalTransactionExecutor");
        throw null;
    }

    public final TextAnnouncementContentCardView getTransactionContext$room_runtime() {
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.PlaybackStateCompat;
        if (textAnnouncementContentCardView != null) {
            return textAnnouncementContentCardView;
        }
        removeNodeAtDepth.serializer("transactionContext");
        throw null;
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaSessionCompatQueueItem = 1;
        private static int RatingCompat;
        public int IconCompatParcelizer;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public /* synthetic */ Object serializer;
        public final /* synthetic */ boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SettingsViewModel settingsViewModel, String str, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.read = 7;
            this.serializer = settingsViewModel;
            this.RemoteActionCompatParcelizer = str;
            this.write = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebChatViewModel webChatViewModel, ShortNewsContentCardView shortNewsContentCardView, boolean z) {
            super(2, shortNewsContentCardView);
            this.read = 4;
            this.write = z;
            this.RemoteActionCompatParcelizer = webChatViewModel;
        }

        /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00051 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            private static int MediaMetadataCompat = 1;
            private static int RatingCompat;
            public final /* synthetic */ boolean IconCompatParcelizer;
            public Object MediaSessionCompatQueueItem;
            public final /* synthetic */ int RemoteActionCompatParcelizer;
            public final /* synthetic */ Object read;
            public int serializer;
            public Object write;

            /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00061 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                public /* synthetic */ Object IconCompatParcelizer;
                public int MediaDescriptionCompat;
                public String[] MediaSessionCompatQueueItem;
                public int RemoteActionCompatParcelizer;
                public final /* synthetic */ String[] read;
                public int serializer;
                public final /* synthetic */ boolean write;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00061(boolean z, String[] strArr, ShortNewsContentCardView shortNewsContentCardView) {
                    super(2, shortNewsContentCardView);
                    this.write = z;
                    this.read = strArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    C00061 c00061 = new C00061(this.write, this.read, shortNewsContentCardView);
                    c00061.IconCompatParcelizer = obj;
                    return c00061;
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00061) create((getIntersectrtfAjoo) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:17:0x004c  */
                /* JADX WARN: Code duplicated, block: B:21:0x0069  */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
                
                    if (kotlin.ranges.RangesKt.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
                
                    if (kotlin.ranges.RangesKt.execSQL(r6, r10, r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r9.MediaDescriptionCompat
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L29
                        if (r1 == r3) goto L21
                        if (r1 != r2) goto L1a
                        int r1 = r9.RemoteActionCompatParcelizer
                        int r4 = r9.serializer
                        java.lang.String[] r5 = r9.MediaSessionCompatQueueItem
                        java.lang.Object r6 = r9.IconCompatParcelizer
                        o.getIntersectrtfAjoo r6 = (o.getIntersectrtfAjoo) r6
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
                        goto L67
                    L1a:
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
                        r10 = 0
                        return r10
                    L21:
                        java.lang.Object r1 = r9.IconCompatParcelizer
                        o.getIntersectrtfAjoo r1 = (o.getIntersectrtfAjoo) r1
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
                        goto L42
                    L29:
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
                        java.lang.Object r10 = r9.IconCompatParcelizer
                        r1 = r10
                        o.getIntersectrtfAjoo r1 = (o.getIntersectrtfAjoo) r1
                        boolean r10 = r9.write
                        if (r10 == 0) goto L42
                        r9.IconCompatParcelizer = r1
                        r9.MediaDescriptionCompat = r3
                        java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                        java.lang.Object r10 = kotlin.ranges.RangesKt.execSQL(r1, r10, r9)
                        if (r10 != r0) goto L42
                        goto L66
                    L42:
                        java.lang.String[] r10 = r9.read
                        int r4 = r10.length
                        r5 = 0
                        r6 = r1
                        r1 = r4
                        r4 = r5
                        r5 = r10
                    L4a:
                        if (r4 >= r1) goto L69
                        r10 = r5[r4]
                        r7 = 96
                        java.lang.String r8 = "DELETE FROM `"
                        java.lang.String r10 = bo.app.m1$$ExternalSyntheticOutline0.m(r7, r8, r10)
                        r9.IconCompatParcelizer = r6
                        r9.MediaSessionCompatQueueItem = r5
                        r9.serializer = r4
                        r9.RemoteActionCompatParcelizer = r1
                        r9.MediaDescriptionCompat = r2
                        java.lang.Object r10 = kotlin.ranges.RangesKt.execSQL(r6, r10, r9)
                        if (r10 != r0) goto L67
                    L66:
                        return r0
                    L67:
                        int r4 = r4 + r3
                        goto L4a
                    L69:
                        o.createFromParcel r10 = o.createFromParcel.INSTANCE
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C00051.C00061.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(SignInDataStore signInDataStore, String str, IdentityVerificationParams identityVerificationParams, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.RemoteActionCompatParcelizer = 4;
                this.write = signInDataStore;
                this.MediaSessionCompatQueueItem = str;
                this.read = identityVerificationParams;
                this.IconCompatParcelizer = z;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(TurnByTurnNavigationLogger turnByTurnNavigationLogger, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.RemoteActionCompatParcelizer = 3;
                this.read = turnByTurnNavigationLogger;
                this.IconCompatParcelizer = z;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00051(Object obj, boolean z, Object obj2, isInvalidIndex isinvalidindex, ShortNewsContentCardView shortNewsContentCardView, int i) {
                super(2, shortNewsContentCardView);
                this.RemoteActionCompatParcelizer = i;
                this.write = obj;
                this.IconCompatParcelizer = z;
                this.MediaSessionCompatQueueItem = obj2;
                this.read = isinvalidindex;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00051(Object obj, boolean z, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
                super(2, shortNewsContentCardView);
                this.RemoteActionCompatParcelizer = i;
                this.MediaSessionCompatQueueItem = obj;
                this.IconCompatParcelizer = z;
                this.read = obj2;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = this.RemoteActionCompatParcelizer;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                if (i2 == 0) {
                    return ((C00051) create((ClipOpCompanion) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                }
                if (i2 == 1) {
                    return ((C00051) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                }
                if (i2 == 2) {
                    Object objInvokeSuspend = ((C00051) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i3 = MediaMetadataCompat + 23;
                    RatingCompat = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return objInvokeSuspend;
                }
                if (i2 == 3) {
                    return ((C00051) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                }
                if (i2 == 4) {
                    return ((C00051) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                }
                Object objInvokeSuspend2 = ((C00051) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = MediaMetadataCompat + 39;
                RatingCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                int i = 2 % 2;
                int i2 = RatingCompat + 125;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i3 = this.RemoteActionCompatParcelizer;
                Object obj3 = this.read;
                if (i3 == 0) {
                    C00051 c00051 = new C00051((RoomDatabase) this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, (String[]) obj3, shortNewsContentCardView, 0);
                    c00051.write = obj;
                    return c00051;
                }
                if (i3 == 1) {
                    return new C00051((PopulateViewStructure_androidKtpopulate7) this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, (MutableInteractionSourceImpl) obj3, shortNewsContentCardView, 1);
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        return new C00051((TurnByTurnNavigationLogger) obj3, this.IconCompatParcelizer, shortNewsContentCardView);
                    }
                    if (i3 == 4) {
                        return new C00051((SignInDataStore) this.write, (String) this.MediaSessionCompatQueueItem, (IdentityVerificationParams) obj3, this.IconCompatParcelizer, shortNewsContentCardView);
                    }
                    return new C00051((LoginActivityViewModel) this.write, this.IconCompatParcelizer, (afterRollback) this.MediaSessionCompatQueueItem, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, shortNewsContentCardView, 5);
                }
                C00051 c00052 = new C00051((Animatable) this.write, this.IconCompatParcelizer, (width) this.MediaSessionCompatQueueItem, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, shortNewsContentCardView, 2);
                int i4 = MediaMetadataCompat + 63;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return c00052;
                }
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:117:0x0302  */
            /* JADX WARN: Code duplicated, block: B:124:0x0326 A[PHI: r0
  0x0326: PHI (r0v6 o.ClipOpCompanion) = (r0v3 o.ClipOpCompanion), (r0v8 o.ClipOpCompanion) binds: [B:122:0x0323, B:109:0x02ce] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:127:0x0331 A[PHI: r0 r2
  0x0331: PHI (r0v9 o.ClipOpCompanion) = (r0v6 o.ClipOpCompanion), (r0v11 o.ClipOpCompanion) binds: [B:125:0x032e, B:108:0x02c4] A[DONT_GENERATE, DONT_INLINE]
  0x0331: PHI (r2v4 java.lang.Object) = (r2v3 java.lang.Object), (r2v10 java.lang.Object) binds: [B:125:0x032e, B:108:0x02c4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:129:0x0339  */
            /* JADX WARN: Code duplicated, block: B:132:0x0347 A[PHI: r0
  0x0347: PHI (r0v12 o.ClipOpCompanion) = (r0v9 o.ClipOpCompanion), (r0v15 o.ClipOpCompanion) binds: [B:130:0x0344, B:107:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:24:0x010e  */
            /* JADX WARN: Code duplicated, block: B:26:0x0119  */
            /* JADX WARN: Code duplicated, block: B:27:0x011c  */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x030e, code lost:
            
                if (r10.sync$room_runtime(r20) == r11) goto L134;
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x0352, code lost:
            
                if (kotlin.ranges.RangesKt.execSQL(r0, "VACUUM", r20) == r11) goto L134;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 886
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C00051.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, boolean z, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.read = i;
            this.serializer = obj;
            this.write = z;
            this.RemoteActionCompatParcelizer = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, I$b i$b, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.read = 3;
            this.write = z;
            this.serializer = i$b;
            this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            switch (i2) {
                case 0:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 1:
                    Object objInvokeSuspend = ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i3 = RatingCompat + 41;
                    MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    obj3.hashCode();
                    throw null;
                case 2:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 3:
                    Object objInvokeSuspend2 = ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i4 = MediaSessionCompatQueueItem + 105;
                    RatingCompat = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return objInvokeSuspend2;
                case 4:
                    return ((AnonymousClass1) create((WebChatEventsTrackerImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 5:
                    Object objInvokeSuspend3 = ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i6 = MediaSessionCompatQueueItem + 45;
                    RatingCompat = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        return objInvokeSuspend3;
                    }
                    throw null;
                case 6:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                default:
                    Object objInvokeSuspend4 = ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i7 = MediaSessionCompatQueueItem + 21;
                    RatingCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        return objInvokeSuspend4;
                    }
                    throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = RatingCompat + 59;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = this.read;
            boolean z = this.write;
            Object obj2 = this.RemoteActionCompatParcelizer;
            switch (i3) {
                case 0:
                    return new AnonymousClass1((RoomDatabase) this.serializer, z, (String[]) obj2, shortNewsContentCardView, 0);
                case 1:
                    return new AnonymousClass1((Animatable) this.serializer, z, (width) obj2, shortNewsContentCardView, 1);
                case 2:
                    return new AnonymousClass1((MapboxNavigation) this.serializer, z, (String) obj2, shortNewsContentCardView, 2);
                case 3:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(z, (I$b) this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView);
                    int i4 = MediaSessionCompatQueueItem + 97;
                    RatingCompat = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return anonymousClass1;
                case 4:
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1((WebChatViewModel) obj2, shortNewsContentCardView, z);
                    anonymousClass2.serializer = obj;
                    return anonymousClass2;
                case 5:
                    return new AnonymousClass1((CrowdSourcingFloatingImageButtonUiModelImpl) this.serializer, z, (copyYTHSh70) obj2, shortNewsContentCardView, 5);
                case 6:
                    return new AnonymousClass1((PinScreenViewModel) this.serializer, z, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj2, shortNewsContentCardView, 6);
                default:
                    return new AnonymousClass1((SettingsViewModel) this.serializer, (String) obj2, z, shortNewsContentCardView);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(800, r18) == r11) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1132
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final <T> T getTypeConverter(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        getunregisteredinappmessageannotations.getClass();
        T t = (T) this.ParcelableVolumeInfo.get(getunregisteredinappmessageannotations);
        t.getClass();
        return t;
    }

    public Cursor query(String str, Object[] objArr) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().IconCompatParcelizer().serializer(new colorResource(str, 12, objArr));
    }

    public <V> V runInTransaction(Callable<V> callable) {
        callable.getClass();
        return (V) runInTransaction(new a5$$ExternalSyntheticLambda0(10, callable));
    }

    public void runInTransaction(Runnable runnable) {
        runnable.getClass();
        runInTransaction(new RoomDatabase$$ExternalSyntheticLambda1(runnable, 0));
    }

    public final Cursor query(compositeOverOWjLjI compositeoverowjlji) {
        compositeoverowjlji.getClass();
        return query$default(this, compositeoverowjlji, null, 2, null);
    }

    @onItemDismisslambda0
    public void internalInitInvalidationTracker(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
        internalInitInvalidationTracker(new C0172getimpl(uncheckedColor));
    }
}
