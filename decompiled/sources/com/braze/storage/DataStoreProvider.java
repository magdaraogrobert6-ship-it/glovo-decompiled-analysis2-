package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import androidx.datastore.migrations.SharedPreferencesMigration;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.sf;
import bo.app.u9;
import bo.app.z7;
import coil3.ExtrasKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.BackspaceCommand;
import o.IconCompatParcelizer;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.TextAnnouncementContentCardView;
import o.accessgetAlwayscp;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getNoActiveChildannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isRoot;
import o.onAnimationEndlambda1;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.pickChildForBackwardSearch;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCarryoverInAppMessage;
import o.setNativeShader;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
public abstract class DataStoreProvider {
    public static final String BRAZE_DATASTORE_PREFIX = "com.braze";
    private static final int FILE_DELETE_MAX_RETRIES = 3;
    private static final long FILE_DELETE_RETRY_DELAY_MS = 50;
    public static final String PERSISTENT_DATASTORE_PREFIX = "persistent";
    public static final String RUNTIME_CONFIG_PREFIX = "com.braze.override.runtime_config";
    private static u9 eventPublisher;
    private final Context context;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DataStoreProvider.class);
    private static final ConcurrentHashMap<String, performCustomExitMxy_nc0> dataStoreInstanceCache = new ConcurrentHashMap<>();
    private static final Object scopeCreationLock = new Object();
    private static final ConcurrentHashMap<String, getContentViewGroupParentLayout> dataStoreScopeMap = new ConcurrentHashMap<>();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDataStoreInstanceCache$android_sdk_base_release$annotations() {
        }

        public final ConcurrentHashMap<String, performCustomExitMxy_nc0> getDataStoreInstanceCache$android_sdk_base_release() {
            return DataStoreProvider.dataStoreInstanceCache;
        }

        public final u9 getEventPublisher$android_sdk_base_release() {
            return DataStoreProvider.eventPublisher;
        }

        public final String getTAG() {
            return DataStoreProvider.TAG;
        }

        public final void setEventPublisher$android_sdk_base_release(u9 u9Var) {
            DataStoreProvider.eventPublisher = u9Var;
        }

        private final void deleteDataStoreFiles(Context context) {
            File[] fileArrListFiles;
            try {
                File file = new File(context.getFilesDir(), "datastore");
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        Companion companion = DataStoreProvider.Companion;
                        String name = file2.getName();
                        name.getClass();
                        if (companion.isWipeableDataStoreFileName(name)) {
                            deleteFileWithRetry$default(companion, file2, 0, 0L, 6, null);
                        }
                    }
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(13), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteDataStoreFiles$lambda$1() {
            return "Failed to delete DataStore files";
        }

        private final void deleteFileWithRetry(File file, int i, long j) throws InterruptedException {
            for (int i2 = 0; i2 < i; i2++) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.Companion, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$Companion$$ExternalSyntheticLambda2(file, i2), 6, (Object) null);
                if (file.delete() || !file.exists()) {
                    return;
                }
                if (i2 < i - 1) {
                    Thread.sleep(j);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$Companion$$ExternalSyntheticLambda2(i, file), 6, (Object) null);
        }

        public final getContentViewGroupParentLayout getOrCreateScopeForKey$android_sdk_base_release(String str) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayoutRemoteActionCompatParcelizer;
            str.getClass();
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) DataStoreProvider.dataStoreScopeMap.get(str);
            if (getcontentviewgroupparentlayout != null && YieldKt.write(getcontentviewgroupparentlayout)) {
                return getcontentviewgroupparentlayout;
            }
            synchronized (DataStoreProvider.scopeCreationLock) {
                getcontentviewgroupparentlayoutRemoteActionCompatParcelizer = (getContentViewGroupParentLayout) DataStoreProvider.dataStoreScopeMap.get(str);
                if (getcontentviewgroupparentlayoutRemoteActionCompatParcelizer == null || !YieldKt.write(getcontentviewgroupparentlayoutRemoteActionCompatParcelizer)) {
                    getcontentviewgroupparentlayoutRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE.getCoroutineContext().plus(UrlUtils.serializer()));
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.Companion, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a$$ExternalSyntheticLambda0(str, 8, getcontentviewgroupparentlayoutRemoteActionCompatParcelizer), 6, (Object) null);
                    DataStoreProvider.dataStoreScopeMap.put(str, getcontentviewgroupparentlayoutRemoteActionCompatParcelizer);
                }
            }
            return getcontentviewgroupparentlayoutRemoteActionCompatParcelizer;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getOrCreateScopeForKey$lambda$1$1(String str, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
            return "Creating new CoroutineScope for DataStore for key: " + str + " scope: " + getcontentviewgroupparentlayout;
        }

        public final void shutdownAllDataStores(Context context) {
            synchronized (DataStoreProvider.scopeCreationLock) {
                Collection<getContentViewGroupParentLayout> collectionValues = DataStoreProvider.dataStoreScopeMap.values();
                collectionValues.getClass();
                for (getContentViewGroupParentLayout getcontentviewgroupparentlayout : collectionValues) {
                    TextAnnouncementContentCardView coroutineContext = getcontentviewgroupparentlayout.getCoroutineContext();
                    onAnimationEndlambda1 onanimationendlambda1 = onAnimationEndlambda1.RemoteActionCompatParcelizer;
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) coroutineContext.get(onanimationendlambda1);
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                        JobKt.IconCompatParcelizer(setallviewgroupchildrenasnonaccessibilityimportantlambda0);
                    }
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda1 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getcontentviewgroupparentlayout.getCoroutineContext().get(onanimationendlambda1);
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda1 != null) {
                        setallviewgroupchildrenasnonaccessibilityimportantlambda1.write(null);
                    }
                }
                DataStoreProvider.dataStoreScopeMap.clear();
                Companion companion = DataStoreProvider.Companion;
                companion.getDataStoreInstanceCache$android_sdk_base_release().clear();
                if (context != null) {
                    companion.deleteDataStoreFiles(context);
                }
            }
        }

        public static /* synthetic */ void shutdownAllDataStores$default(Companion companion, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = null;
            }
            companion.shutdownAllDataStores(context);
        }

        public final boolean isWipeableDataStoreFileName(String str) {
            str.getClass();
            return (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, DataStoreProvider.BRAZE_DATASTORE_PREFIX, false) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, DataStoreProvider.RUNTIME_CONFIG_PREFIX, false) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, DataStoreProvider.PERSISTENT_DATASTORE_PREFIX, false)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$1(int i, File file) {
            return "Failed to delete DataStore file after " + i + " attempts: " + file.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$0$0(File file, int i) {
            return "Deleting DataStore file: " + file.getName() + " (attempt " + (i + 1) + ")";
        }

        public static /* synthetic */ void deleteFileWithRetry$default(Companion companion, File file, int i, long j, int i2, Object obj) throws InterruptedException {
            if ((i2 & 2) != 0) {
                i = 3;
            }
            if ((i2 & 4) != 0) {
                j = 50;
            }
            companion.deleteFileWithRetry(file, i, j);
        }
    }

    public static final class b extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int a;
        final /* synthetic */ Map<String, Object> c;
        final /* synthetic */ Set<String> d;

        public static final class a extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ Set<String> c;
            final /* synthetic */ Map<String, Object> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Set<String> set, Map<String, ? extends Object> map, ShortNewsContentCardView<? super a> shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.c = set;
                this.d = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                a aVar = new a(this.c, this.d, shortNewsContentCardView);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.a != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                for (String str : this.c) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str, 2), 12, (Object) null);
                    int iWrite = BackspaceCommand.write();
                    int iWrite2 = BackspaceCommand.write();
                    int iWrite3 = BackspaceCommand.write();
                    backwardfocussearch.read((isRoot) RangesKt.read(220732900, iWrite2, BackspaceCommand.write(), new Object[]{str}, iWrite3, -220732894, iWrite));
                    backwardfocussearch.read(new isRoot(str));
                    backwardfocussearch.read(new isRoot(str));
                    backwardfocussearch.read(new isRoot(str));
                    backwardfocussearch.read(new isRoot(str));
                    backwardfocussearch.read(new isRoot(str));
                }
                for (Map.Entry<String, Object> entry : this.d.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    Companion companion = DataStoreProvider.Companion;
                    BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$b$a$$ExternalSyntheticLambda1(0, key, value), 12, (Object) null);
                    if (value instanceof String) {
                        int iWrite4 = BackspaceCommand.write();
                        int iWrite5 = BackspaceCommand.write();
                        int iWrite6 = BackspaceCommand.write();
                        isRoot isroot = (isRoot) RangesKt.read(220732900, iWrite5, BackspaceCommand.write(), new Object[]{key}, iWrite6, -220732894, iWrite4);
                        backwardfocussearch.getClass();
                        backwardfocussearch.serializer(isroot, value);
                    } else if (value instanceof Integer) {
                        isRoot isrootIconCompatParcelizer = RangesKt.IconCompatParcelizer(key);
                        backwardfocussearch.getClass();
                        backwardfocussearch.serializer(isrootIconCompatParcelizer, value);
                    } else if (value instanceof Long) {
                        int iWrite7 = BackspaceCommand.write();
                        int iWrite8 = BackspaceCommand.write();
                        int iWrite9 = BackspaceCommand.write();
                        isRoot isroot2 = (isRoot) RangesKt.read(-1579077835, iWrite8, BackspaceCommand.write(), new Object[]{key}, iWrite9, 1579077836, iWrite7);
                        backwardfocussearch.getClass();
                        backwardfocussearch.serializer(isroot2, value);
                    } else if (value instanceof Float) {
                        isRoot isrootRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(key);
                        backwardfocussearch.getClass();
                        backwardfocussearch.serializer(isrootRemoteActionCompatParcelizer, value);
                    } else if (value instanceof Double) {
                        isRoot isrootWrite = RangesKt.write(key);
                        backwardfocussearch.getClass();
                        backwardfocussearch.serializer(isrootWrite, value);
                    } else if (value instanceof Boolean) {
                        int iWrite10 = BackspaceCommand.write();
                        int iWrite11 = BackspaceCommand.write();
                        int iWrite12 = BackspaceCommand.write();
                        isRoot isroot3 = (isRoot) RangesKt.read(-293359906, iWrite11, BackspaceCommand.write(), new Object[]{key}, iWrite12, 293359908, iWrite10);
                        backwardfocussearch.getClass();
                        backwardfocussearch.serializer(isroot3, value);
                    } else {
                        BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$b$a$$ExternalSyntheticLambda1(1, key, value), 12, (Object) null);
                    }
                }
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String a(String str, Object obj) {
                return "Adding/updating key: " + str + " with value: " + obj + " in DataStore.";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String b(String str, Object obj) {
                return af$$ExternalSyntheticOutline0.m("Unsupported value type for key '", str, "': ", displayInAppMessagelambda1.serializer(obj.getClass()).IconCompatParcelizer());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String a(String str) {
                return ff$$ExternalSyntheticOutline0.m("Removing key: ", str, " from DataStore.");
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(backwardFocusSearch backwardfocussearch, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                return ((a) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, ? extends Object> map, Set<String> set, ShortNewsContentCardView<? super b> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.c = map;
            this.d = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return DataStoreProvider.this.new b(this.c, this.d, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            int i2 = 1;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(this.d, this.c, null);
                this.a = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(dataStore, aVar, this);
                return objSerializer == coroutineSingletons ? coroutineSingletons : objSerializer;
            } catch (Exception e) {
                String str = "Failed to perform batch update with updates:" + this.c + " and removals:" + this.d;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str, i2), 8, (Object) null);
                DataStoreProvider.this.publishException(str, e);
                return createFromParcel.INSTANCE;
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<Object> shortNewsContentCardView) {
            return ((b) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public static final class c extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        Object a;
        int b;
        final /* synthetic */ isRoot d;

        public static final class a extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ isRoot c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                a aVar = new a(this.c, shortNewsContentCardView);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.a != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.read(this.c);
                return createFromParcel.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(isRoot isroot, ShortNewsContentCardView<? super a> shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.c = isroot;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(backwardFocusSearch backwardfocussearch, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                return ((a) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(isRoot isroot, ShortNewsContentCardView<? super c> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.d = isroot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return DataStoreProvider.this.new c(this.d, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            try {
                if (i != 0) {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$c$$ExternalSyntheticLambda0(0, this.d), 12, (Object) null);
                performCustomExitMxy_nc0 dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(this.d, null);
                this.a = null;
                this.b = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(dataStore, aVar, this);
                return objSerializer == coroutineSingletons ? coroutineSingletons : objSerializer;
            } catch (Exception e) {
                String str = "Failed to clear data for key: " + this.d + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str, 3), 8, (Object) null);
                DataStoreProvider.this.publishException(str, e);
                return createFromParcel.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(isRoot isroot) {
            return "Clearing all data for key: " + isroot + ".";
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<Object> shortNewsContentCardView) {
            return ((c) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public static final class d extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        Object a;
        int b;

        public static final class a extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            int a;
            /* synthetic */ Object b;

            public a(ShortNewsContentCardView<? super a> shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                a aVar = new a(shortNewsContentCardView);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.a != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.write();
                return createFromParcel.INSTANCE;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(backwardFocusSearch backwardfocussearch, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                return ((a) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return DataStoreProvider.this.new d(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            int i2 = 1;
            try {
                if (i != 0) {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(i2), 12, (Object) null);
                performCustomExitMxy_nc0 dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(null);
                this.a = null;
                this.b = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(dataStore, aVar, this);
                return objSerializer == coroutineSingletons ? coroutineSingletons : objSerializer;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(2), 8, (Object) null);
                DataStoreProvider.this.publishException("Failed to clear all data in file.", e);
                return createFromParcel.INSTANCE;
            }
        }

        public d(ShortNewsContentCardView<? super d> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<Object> shortNewsContentCardView) {
            return ((d) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a() {
            return "Clearing all data in file.";
        }
    }

    public static final class e extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        Object a;
        int b;
        final /* synthetic */ isRoot d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        public static final class a<T> implements Flow<T> {
            final /* synthetic */ Flow a;
            final /* synthetic */ isRoot b;

            /* JADX INFO: renamed from: com.braze.storage.DataStoreProvider$e$a$a, reason: collision with other inner class name */
            public static final class C0008a<T> implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ isRoot b;

                /* JADX INFO: renamed from: com.braze.storage.DataStoreProvider$e$a$a$a, reason: collision with other inner class name */
                public static final class C0009a extends ContinuationImpl {
                    /* synthetic */ Object a;
                    int b;
                    Object c;
                    Object e;
                    Object f;
                    Object g;
                    int h;

                    public C0009a(ShortNewsContentCardView shortNewsContentCardView) {
                        super(shortNewsContentCardView);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0008a.this.emit(null, this);
                    }
                }

                public C0008a(FlowCollector flowCollector, isRoot isroot) {
                    this.a = flowCollector;
                    this.b = isroot;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    C0009a c0009a;
                    if (shortNewsContentCardView instanceof C0009a) {
                        c0009a = (C0009a) shortNewsContentCardView;
                        int i = c0009a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0009a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0009a = new C0009a(shortNewsContentCardView);
                        }
                    } else {
                        c0009a = new C0009a(shortNewsContentCardView);
                    }
                    Object obj2 = c0009a.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = c0009a.b;
                    if (i2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                        FlowCollector flowCollector = this.a;
                        Object objSerializer = ((getNoActiveChildannotations) obj).serializer(this.b);
                        c0009a.c = null;
                        c0009a.e = null;
                        c0009a.f = null;
                        c0009a.g = null;
                        c0009a.h = 0;
                        c0009a.b = 1;
                        if (flowCollector.emit(objSerializer, c0009a) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    }
                    return createFromParcel.INSTANCE;
                }
            }

            public a(Flow flow, isRoot isroot) {
                this.a = flow;
                this.b = isroot;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
                Object objCollect = this.a.collect(new C0008a(flowCollector, this.b), shortNewsContentCardView);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(isRoot isroot, ShortNewsContentCardView<? super e> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.d = isroot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return DataStoreProvider.this.new e(this.d, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            char c = 1;
            int i2 = 0;
            try {
                if (i == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$e$$ExternalSyntheticLambda0(this.d, i2), 12, (Object) null);
                    a aVar = new a(DataStoreProvider.this.getDataStore().serializer(), this.d);
                    this.a = null;
                    this.b = 1;
                    obj = FlowKt.firstOrNull(aVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                z = obj != null;
            } catch (Exception e) {
                String strM = ff$$ExternalSyntheticOutline0.m("Failed to check if data store contains key: ", this.d.IconCompatParcelizer, ". Using default value: false.");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda1(strM, c == true ? 1 : 0), 8, (Object) null);
                DataStoreProvider.this.publishException(strM, e);
            }
            return Boolean.valueOf(z);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super Boolean> shortNewsContentCardView) {
            return ((e) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(isRoot isroot) {
            return ff$$ExternalSyntheticOutline0.m("Checking if data store contains data for key: ", isroot.IconCompatParcelizer, ".");
        }
    }

    public static final class f extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int a;
        final /* synthetic */ u9 b;
        final /* synthetic */ String c;
        final /* synthetic */ Throwable d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(u9 u9Var, String str, Throwable th, ShortNewsContentCardView<? super f> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.b = u9Var;
            this.c = str;
            this.d = th;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new f(this.b, this.c, this.d, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.a != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((z7) this.b).b(new sf(this.c, this.d), sf.class);
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((f) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public static final class g extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        Object a;
        int b;
        final /* synthetic */ isRoot d;
        final /* synthetic */ T e;

        /* JADX INFO: Add missing generic type declarations: [T] */
        public static final class a<T> implements Flow<T> {
            final /* synthetic */ Flow a;
            final /* synthetic */ isRoot b;
            final /* synthetic */ Object c;

            /* JADX INFO: renamed from: com.braze.storage.DataStoreProvider$g$a$a, reason: collision with other inner class name */
            public static final class C0010a<T> implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ isRoot b;
                final /* synthetic */ Object c;

                /* JADX INFO: renamed from: com.braze.storage.DataStoreProvider$g$a$a$a, reason: collision with other inner class name */
                public static final class C0011a extends ContinuationImpl {
                    /* synthetic */ Object a;
                    int b;
                    Object c;
                    Object e;
                    Object f;
                    Object g;
                    int h;

                    public C0011a(ShortNewsContentCardView shortNewsContentCardView) {
                        super(shortNewsContentCardView);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0010a.this.emit(null, this);
                    }
                }

                public C0010a(FlowCollector flowCollector, isRoot isroot, Object obj) {
                    this.a = flowCollector;
                    this.b = isroot;
                    this.c = obj;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    C0011a c0011a;
                    if (shortNewsContentCardView instanceof C0011a) {
                        c0011a = (C0011a) shortNewsContentCardView;
                        int i = c0011a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0011a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0011a = new C0011a(shortNewsContentCardView);
                        }
                    } else {
                        c0011a = new C0011a(shortNewsContentCardView);
                    }
                    Object obj2 = c0011a.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = c0011a.b;
                    if (i2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                        FlowCollector flowCollector = this.a;
                        Object objSerializer = ((getNoActiveChildannotations) obj).serializer(this.b);
                        if (objSerializer == null) {
                            objSerializer = this.c;
                        }
                        c0011a.c = null;
                        c0011a.e = null;
                        c0011a.f = null;
                        c0011a.g = null;
                        c0011a.h = 0;
                        c0011a.b = 1;
                        if (flowCollector.emit(objSerializer, c0011a) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    }
                    return createFromParcel.INSTANCE;
                }
            }

            public a(Flow flow, isRoot isroot, Object obj) {
                this.a = flow;
                this.b = isroot;
                this.c = obj;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
                Object objCollect = this.a.collect(new C0010a(flowCollector, this.b, this.c), shortNewsContentCardView);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(isRoot isroot, T t, ShortNewsContentCardView<? super g> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.d = isroot;
            this.e = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return DataStoreProvider.this.new g(this.d, this.e, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            int i2 = 1;
            try {
                if (i != 0) {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$e$$ExternalSyntheticLambda0(this.d, i2), 12, (Object) null);
                a aVar = new a(DataStoreProvider.this.getDataStore().serializer(), this.d, this.e);
                this.a = null;
                this.b = 1;
                Object objFirst = FlowKt.first(aVar, this);
                return objFirst == coroutineSingletons ? coroutineSingletons : objFirst;
            } catch (Exception e) {
                String str = "Failed to read data for key: " + this.d.IconCompatParcelizer + ". Using default value: " + this.e + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda1(str, 2), 8, (Object) null);
                DataStoreProvider.this.publishException(str, e);
                return this.e;
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            return ((g) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(isRoot isroot) {
            return ff$$ExternalSyntheticOutline0.m("Reading data for key: ", isroot.IconCompatParcelizer, ".");
        }
    }

    public static final class h extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int a;

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return DataStoreProvider.this.new h(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            final int i2 = 1;
            try {
                if (i == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    final int i3 = 0;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.storage.DataStoreProvider$h$$ExternalSyntheticLambda0
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            return i3 != 0 ? DataStoreProvider.h.a("Failed to read all data from DataStore") : DataStoreProvider.h.a();
                        }
                    }, 12, (Object) null);
                    Flow flowSerializer = DataStoreProvider.this.getDataStore().serializer();
                    this.a = 1;
                    obj = FlowKt.first(flowSerializer, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return ((getNoActiveChildannotations) obj).read();
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.storage.DataStoreProvider$h$$ExternalSyntheticLambda0
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        return i2 != 0 ? DataStoreProvider.h.a("Failed to read all data from DataStore") : DataStoreProvider.h.a();
                    }
                }, 8, (Object) null);
                DataStoreProvider.this.publishException("Failed to read all data from DataStore", e);
                return SimpleItemTouchHelperCallback.serializer;
            }
        }

        public h(ShortNewsContentCardView<? super h> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super Map<isRoot, ? extends Object>> shortNewsContentCardView) {
            return ((h) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a() {
            return "Reading all data from DataStore.";
        }
    }

    public static final class i implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ DataStoreKey a;

        public i(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ff$$ExternalSyntheticOutline0.m("Key ", this.a.getKey(), " is not a LIST type. Returning empty list.");
        }
    }

    public static final class j implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ DataStoreKey a;

        public j(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to read list from DataStore for key: ", this.a.getKey());
        }
    }

    public static final class l implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ DataStoreKey a;

        public l(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ff$$ExternalSyntheticOutline0.m("Key ", this.a.getKey(), " is not a MAP type. Returning empty map.");
        }
    }

    public static final class m implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ DataStoreKey a;

        public m(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to read map from DataStore for key: ", this.a.getKey());
        }
    }

    public static final class n extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        Object a;
        int b;
        final /* synthetic */ T d;
        final /* synthetic */ isRoot e;

        public static final class a extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ isRoot c;
            final /* synthetic */ T d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(isRoot isroot, T t, ShortNewsContentCardView<? super a> shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.c = isroot;
                this.d = t;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                a aVar = new a(this.c, this.d, shortNewsContentCardView);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.a != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.write(this.c, this.d);
                return createFromParcel.INSTANCE;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(backwardFocusSearch backwardfocussearch, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                return ((a) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(T t, isRoot isroot, ShortNewsContentCardView<? super n> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.d = t;
            this.e = isroot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return DataStoreProvider.this.new n(this.d, this.e, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            int i2 = 1;
            try {
                if (i != 0) {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a$$ExternalSyntheticLambda0(this.d, i2, this.e), 12, (Object) null);
                performCustomExitMxy_nc0 dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(this.e, this.d, null);
                this.a = null;
                this.b = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(dataStore, aVar, this);
                return objSerializer == coroutineSingletons ? coroutineSingletons : objSerializer;
            } catch (Exception e) {
                String str = "Failed to write data:" + this.d + " for key: " + this.e.IconCompatParcelizer + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda1(str, 3), 8, (Object) null);
                DataStoreProvider.this.publishException(str, e);
                return createFromParcel.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(Object obj, isRoot isroot) {
            return "Writing data:" + obj + " for key: " + isroot.IconCompatParcelizer + ".";
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<Object> shortNewsContentCardView) {
            return ((n) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public static final class o implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ DataStoreKey a;

        public o(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return af$$ExternalSyntheticOutline0.m("Key ", this.a.getKey(), " is not a LIST type. Cannot write key:", this.a.getKey());
        }
    }

    public static final class p implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ DataStoreKey a;

        public p(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to write list to DataStore for key: ", this.a.getKey());
        }
    }

    public static final class q implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ DataStoreKey a;

        public q(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return af$$ExternalSyntheticOutline0.m("Key ", this.a.getKey(), " is not a MAP type. Cannot write key:", this.a.getKey());
        }
    }

    public static final class r implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ DataStoreKey a;

        public r(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to write map to DataStore for key: ", this.a.getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createOrGetDataStore$lambda$0$1$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readData$lambda$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String writeData$lambda$0(String str) {
        return str;
    }

    public void clearAllData() {
        clearAll$android_sdk_base_release();
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract /* synthetic */ performCustomExitMxy_nc0 getDataStore();

    public abstract /* synthetic */ String getDataStoreFileName();

    public Map<isRoot, Object> readAllData() {
        return readAll$android_sdk_base_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createOrGetDataStore$lambda$0$0(DataStoreProvider dataStoreProvider, String str) {
        File filesDir = dataStoreProvider.context.getFilesDir();
        filesDir.getClass();
        return r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.RemoteActionCompatParcelizer(filesDir, "datastore/" + str + ".preferences_pb");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishException$lambda$0() {
        return "Failed to publish exception";
    }

    public final getContentViewGroupParentLayout getDataStoreScope$android_sdk_base_release() {
        return Companion.getOrCreateScopeForKey$android_sdk_base_release(getDataStoreFileName());
    }

    public final <T> List<T> readList(DataStoreKey dataStoreKey) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        dataStoreKey.getClass();
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i(dataStoreKey), 12, (Object) null);
            return new ArrayList();
        }
        try {
            Object data = readData(dataStoreKey, "");
            data.getClass();
            String str = (String) data;
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                return new ArrayList();
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    try {
                        prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = resetTransientState.read.RemoteActionCompatParcelizer;
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
                    }
                }
            }
            return new ArrayList(instance_delegatelambda0Var);
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new j(dataStoreKey), 8, (Object) null);
            return new ArrayList();
        }
    }

    public final <T> void writeList(DataStoreKey dataStoreKey, List<? extends T> list) {
        dataStoreKey.getClass();
        list.getClass();
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = resetTransientState.read.RemoteActionCompatParcelizer;
                removeNodeAtDepth.IconCompatParcelizer();
                throw null;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                try {
                    writeData(dataStoreKey, list instanceof Map ? "{}" : "[]");
                } catch (Exception e3) {
                    e = e3;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new p(dataStoreKey), 8, (Object) null);
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataStoreValueType.values().length];
            try {
                iArr[DataStoreValueType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataStoreValueType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataStoreValueType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataStoreValueType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataStoreValueType.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataStoreValueType.LONG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataStoreValueType.MAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataStoreValueType.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    public static final class k implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public static final k a = new k();

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
    }

    public DataStoreProvider(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
    }

    public void batchUpdate(Map<String, ? extends Object> map, Set<String> set) {
        map.getClass();
        set.getClass();
        batchUpdates$android_sdk_base_release(map, set);
    }

    public final void batchUpdates$android_sdk_base_release(Map<String, ? extends Object> map, Set<String> set) {
        map.getClass();
        set.getClass();
        BuildersKt.serializer(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new b(map, set, null));
    }

    public final <T> void clear$android_sdk_base_release(isRoot isroot) {
        isroot.getClass();
        BuildersKt.serializer(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new c(isroot, null));
    }

    public void clearData(DataStoreKey dataStoreKey) {
        dataStoreKey.getClass();
        switch (a.a[dataStoreKey.getType().ordinal()]) {
            case 1:
                clear$android_sdk_base_release(RangesKt.IconCompatParcelizer(dataStoreKey.getKey()));
                break;
            case 2:
                clear$android_sdk_base_release(RangesKt.write(dataStoreKey.getKey()));
                break;
            case 3:
                Object[] objArr = {dataStoreKey.getKey()};
                int iWrite = BackspaceCommand.write();
                clear$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite));
                break;
            case 4:
                Object[] objArr2 = {dataStoreKey.getKey()};
                int iWrite2 = BackspaceCommand.write();
                clear$android_sdk_base_release((isRoot) RangesKt.read(-293359906, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), 293359908, iWrite2));
                break;
            case 5:
                clear$android_sdk_base_release(RangesKt.RemoteActionCompatParcelizer(dataStoreKey.getKey()));
                break;
            case 6:
                Object[] objArr3 = {dataStoreKey.getKey()};
                int iWrite3 = BackspaceCommand.write();
                clear$android_sdk_base_release((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), objArr3, BackspaceCommand.write(), 1579077836, iWrite3));
                break;
            case 7:
                Object[] objArr4 = {dataStoreKey.getKey()};
                int iWrite4 = BackspaceCommand.write();
                clear$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr4, BackspaceCommand.write(), -220732894, iWrite4));
                break;
            case 8:
                Object[] objArr5 = {dataStoreKey.getKey()};
                int iWrite5 = BackspaceCommand.write();
                clear$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr5, BackspaceCommand.write(), -220732894, iWrite5));
                break;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                break;
        }
    }

    public boolean contains(DataStoreKey dataStoreKey) {
        dataStoreKey.getClass();
        switch (a.a[dataStoreKey.getType().ordinal()]) {
            case 1:
                return contains$android_sdk_base_release(RangesKt.IconCompatParcelizer(dataStoreKey.getKey()));
            case 2:
                return contains$android_sdk_base_release(RangesKt.write(dataStoreKey.getKey()));
            case 3:
                Object[] objArr = {dataStoreKey.getKey()};
                int iWrite = BackspaceCommand.write();
                return contains$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite));
            case 4:
                Object[] objArr2 = {dataStoreKey.getKey()};
                int iWrite2 = BackspaceCommand.write();
                return contains$android_sdk_base_release((isRoot) RangesKt.read(-293359906, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), 293359908, iWrite2));
            case 5:
                return contains$android_sdk_base_release(RangesKt.RemoteActionCompatParcelizer(dataStoreKey.getKey()));
            case 6:
                Object[] objArr3 = {dataStoreKey.getKey()};
                int iWrite3 = BackspaceCommand.write();
                return contains$android_sdk_base_release((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), objArr3, BackspaceCommand.write(), 1579077836, iWrite3));
            case 7:
                Object[] objArr4 = {dataStoreKey.getKey()};
                int iWrite4 = BackspaceCommand.write();
                return contains$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr4, BackspaceCommand.write(), -220732894, iWrite4));
            case 8:
                Object[] objArr5 = {dataStoreKey.getKey()};
                int iWrite5 = BackspaceCommand.write();
                return contains$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr5, BackspaceCommand.write(), -220732894, iWrite5));
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
        }
    }

    public final <T> boolean contains$android_sdk_base_release(isRoot isroot) {
        isroot.getClass();
        return ((Boolean) BuildersKt.serializer(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new e(isroot, null))).booleanValue();
    }

    public final performCustomExitMxy_nc0 createOrGetDataStore(List<? extends SharedPreferencesMigration> list) {
        list.getClass();
        final String dataStoreFileName = getDataStoreFileName();
        ConcurrentHashMap<String, performCustomExitMxy_nc0> concurrentHashMap = dataStoreInstanceCache;
        performCustomExitMxy_nc0 pickchildforbackwardsearch = concurrentHashMap.get(dataStoreFileName);
        if (pickchildforbackwardsearch == null) {
            a$$ExternalSyntheticLambda0 a__externalsyntheticlambda0 = new a$$ExternalSyntheticLambda0(this, 6, dataStoreFileName);
            accessgetAlwayscp accessgetalwayscp = new accessgetAlwayscp(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda6
                public final /* synthetic */ DataStoreProvider f$1;

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    return DataStoreProvider.createOrGetDataStore$lambda$0$1(dataStoreFileName, this.f$1, (CorruptionException) obj);
                }

                {
                    this.f$1 = this;
                }
            });
            getContentViewGroupParentLayout dataStoreScope$android_sdk_base_release = getDataStoreScope$android_sdk_base_release();
            dataStoreScope$android_sdk_base_release.getClass();
            Object[] objArr = {accessgetalwayscp, list, dataStoreScope$android_sdk_base_release, new SingleProcessDataStore$file$2(2, a__externalsyntheticlambda0)};
            pickchildforbackwardsearch = new pickChildForBackwardSearch((SingleProcessDataStore) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-756067223, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 756067223, sourceInformationContextOfdefault.read(), objArr, sourceInformationContextOfdefault.read()));
            performCustomExitMxy_nc0 performcustomexitmxy_nc0PutIfAbsent = concurrentHashMap.putIfAbsent(dataStoreFileName, pickchildforbackwardsearch);
            if (performcustomexitmxy_nc0PutIfAbsent != null) {
                pickchildforbackwardsearch = performcustomexitmxy_nc0PutIfAbsent;
            }
        }
        return pickchildforbackwardsearch;
    }

    public final <T> T read$android_sdk_base_release(isRoot isroot, T t) {
        isroot.getClass();
        return (T) BuildersKt.serializer(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new g(isroot, t, null));
    }

    public Boolean readBoolean(DataStoreKey dataStoreKey, Boolean bool) {
        dataStoreKey.getClass();
        try {
            Object[] objArr = {dataStoreKey.getKey()};
            int iWrite = BackspaceCommand.write();
            return (Boolean) read$android_sdk_base_release((isRoot) RangesKt.read(-293359906, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), 293359908, iWrite), bool);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a$$ExternalSyntheticLambda0(dataStoreKey, 3, bool), 8, (Object) null);
            return bool;
        }
    }

    public Object readData(DataStoreKey dataStoreKey, Object obj) {
        dataStoreKey.getClass();
        try {
            switch (a.a[dataStoreKey.getType().ordinal()]) {
                case 1:
                    isRoot isrootIconCompatParcelizer = RangesKt.IconCompatParcelizer(dataStoreKey.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(isrootIconCompatParcelizer, (Integer) obj);
                case 2:
                    isRoot isrootWrite = RangesKt.write(dataStoreKey.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(isrootWrite, (Double) obj);
                case 3:
                    isRoot isroot = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write());
                    obj.getClass();
                    return read$android_sdk_base_release(isroot, (String) obj);
                case 4:
                    isRoot isroot2 = (isRoot) RangesKt.read(-293359906, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), 293359908, BackspaceCommand.write());
                    obj.getClass();
                    return read$android_sdk_base_release(isroot2, (Boolean) obj);
                case 5:
                    isRoot isrootRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(dataStoreKey.getKey());
                    obj.getClass();
                    return read$android_sdk_base_release(isrootRemoteActionCompatParcelizer, (Float) obj);
                case 6:
                    isRoot isroot3 = (isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), 1579077836, BackspaceCommand.write());
                    obj.getClass();
                    return read$android_sdk_base_release(isroot3, (Long) obj);
                case 7:
                    isRoot isroot4 = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write());
                    obj.getClass();
                    return read$android_sdk_base_release(isroot4, (String) obj);
                case 8:
                    isRoot isroot5 = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write());
                    obj.getClass();
                    return read$android_sdk_base_release(isroot5, (String) obj);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e2) {
            String str = "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type. Returning default value:'" + obj + "'";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda1(str, 4), 8, (Object) null);
            publishException(str, e2);
            return obj;
        }
    }

    public Float readFloat(DataStoreKey dataStoreKey, Float f2) {
        dataStoreKey.getClass();
        try {
            return (Float) read$android_sdk_base_release(RangesKt.RemoteActionCompatParcelizer(dataStoreKey.getKey()), f2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a$$ExternalSyntheticLambda0(dataStoreKey, 5, f2), 8, (Object) null);
            return f2;
        }
    }

    public Integer readInt(DataStoreKey dataStoreKey, Integer num) {
        dataStoreKey.getClass();
        try {
            return (Integer) read$android_sdk_base_release(RangesKt.IconCompatParcelizer(dataStoreKey.getKey()), num);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a$$ExternalSyntheticLambda0(dataStoreKey, 2, num), 8, (Object) null);
            return num;
        }
    }

    public Long readLong(DataStoreKey dataStoreKey, Long l2) {
        dataStoreKey.getClass();
        try {
            Object[] objArr = {dataStoreKey.getKey()};
            int iWrite = BackspaceCommand.write();
            return (Long) read$android_sdk_base_release((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), 1579077836, iWrite), l2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a$$ExternalSyntheticLambda0(dataStoreKey, 7, l2), 4, (Object) null);
            return l2;
        }
    }

    public final <K, V> Map<K, V> readMap(DataStoreKey dataStoreKey) {
        dataStoreKey.getClass();
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object data = readData(dataStoreKey, "");
            data.getClass();
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) data)) {
                return new LinkedHashMap();
            }
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }

    public String readString(DataStoreKey dataStoreKey, String str) {
        dataStoreKey.getClass();
        try {
            Object[] objArr = {dataStoreKey.getKey()};
            int iWrite = BackspaceCommand.write();
            return (String) read$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite), str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a$$ExternalSyntheticLambda0(dataStoreKey, 4, str), 8, (Object) null);
            return str;
        }
    }

    public final <T> void write$android_sdk_base_release(isRoot isroot, T t) {
        isroot.getClass();
        BuildersKt.serializer(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new n(t, isroot, null));
    }

    public void writeData(DataStoreKey dataStoreKey, Object obj) {
        dataStoreKey.getClass();
        obj.getClass();
        try {
            switch (a.a[dataStoreKey.getType().ordinal()]) {
                case 1:
                    write$android_sdk_base_release(RangesKt.IconCompatParcelizer(dataStoreKey.getKey()), (Integer) obj);
                    return;
                case 2:
                    write$android_sdk_base_release(RangesKt.write(dataStoreKey.getKey()), (Double) obj);
                    return;
                case 3:
                    write$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), (String) obj);
                    return;
                case 4:
                    write$android_sdk_base_release((isRoot) RangesKt.read(-293359906, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), 293359908, BackspaceCommand.write()), (Boolean) obj);
                    return;
                case 5:
                    write$android_sdk_base_release(RangesKt.RemoteActionCompatParcelizer(dataStoreKey.getKey()), (Float) obj);
                    return;
                case 6:
                    write$android_sdk_base_release((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), 1579077836, BackspaceCommand.write()), (Long) obj);
                    return;
                case 7:
                    write$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), (String) obj);
                    return;
                case 8:
                    write$android_sdk_base_release((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), (String) obj);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e2) {
            String str = "Not storing data with key:'" + dataStoreKey + "' value:'" + obj + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda1(str, 0), 8, (Object) null);
            publishException(str, e2);
        }
    }

    public final <K, V> void writeMap(DataStoreKey dataStoreKey, Map<K, ? extends V> map) {
        dataStoreKey.getClass();
        map.getClass();
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new r(dataStoreKey), 8, (Object) null);
        }
    }

    public final void clearAll$android_sdk_base_release() {
        BuildersKt.serializer(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new d(null));
    }

    public final Map<isRoot, Object> readAll$android_sdk_base_release() {
        return (Map) BuildersKt.serializer(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new h(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishException(String str, Throwable th) {
        u9 u9Var = eventPublisher;
        if (u9Var == null) {
            return;
        }
        try {
            BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new f(u9Var, str, th, null), 3);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(0), 8, (Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ performCustomExitMxy_nc0 createOrGetDataStore$default(DataStoreProvider dataStoreProvider, List list, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                list = instance_delegatelambda0.write;
            }
            return dataStoreProvider.createOrGetDataStore(list);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: createOrGetDataStore");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getNoActiveChildannotations createOrGetDataStore$lambda$0$1(String str, DataStoreProvider dataStoreProvider, CorruptionException corruptionException) {
        corruptionException.getClass();
        String str2 = "DataStore file corrupted for " + str + ", resetting to empty preferences";
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) corruptionException, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, 0), 8, (Object) null);
        dataStoreProvider.publishException(str2, corruptionException);
        return setNativeShader.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readBoolean$lambda$0(DataStoreKey dataStoreKey, Boolean bool) {
        DataStoreValueType type = dataStoreKey.getType();
        StringBuilder sb = new StringBuilder("Not reading data with with key:'");
        sb.append(dataStoreKey);
        sb.append("' type:'");
        sb.append(type);
        sb.append("' due to mismatched data type - expected boolean. Returning default value:'");
        return c8$$ExternalSyntheticOutline0.m(sb, "'", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readFloat$lambda$0(DataStoreKey dataStoreKey, Float f2) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected float. Returning default value:'" + f2 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readInt$lambda$0(DataStoreKey dataStoreKey, Integer num) {
        DataStoreValueType type = dataStoreKey.getType();
        StringBuilder sb = new StringBuilder("Not reading data with key:'");
        sb.append(dataStoreKey);
        sb.append("' type:'");
        sb.append(type);
        sb.append("' due to mismatched data type - expected int. Returning default value:'");
        return IconCompatParcelizer.write(num, "'", sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readLong$lambda$0(DataStoreKey dataStoreKey, Long l2) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected long. Returning default value:'" + l2 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readString$lambda$0(DataStoreKey dataStoreKey, String str) {
        DataStoreValueType type = dataStoreKey.getType();
        StringBuilder sb = new StringBuilder("Not reading data with key:'");
        sb.append(dataStoreKey);
        sb.append("' type:'");
        sb.append(type);
        sb.append("' due to mismatched data type - expected string. Returning default value:'");
        return ff$$ExternalSyntheticOutline0.m(sb, str, "'");
    }
}
