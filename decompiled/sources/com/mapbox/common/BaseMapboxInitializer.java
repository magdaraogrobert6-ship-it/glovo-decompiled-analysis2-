package com.mapbox.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.copyColorMatrixgBh15pIdefault;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setToSaturationimpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseMapboxInitializer<T> implements copyColorMatrixgBh15pIdefault {
    private static final long LOCK_WAIT_TIME_MS = 50;
    private static final String TAG = "MapboxInitializer";
    private static Context appContext;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<Class<? extends copyColorMatrixgBh15pIdefault>, InitializerData> initializersMap = new HashMap<>();
    private static final ReentrantLock globalLock = new ReentrantLock();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void getAllDependencies(Class<? extends copyColorMatrixgBh15pIdefault> cls, Set<Class<? extends copyColorMatrixgBh15pIdefault>> set) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            copyColorMatrixgBh15pIdefault copycolormatrixgbh15pidefaultNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            copycolormatrixgbh15pidefaultNewInstance.getClass();
            copyColorMatrixgBh15pIdefault copycolormatrixgbh15pidefault = copycolormatrixgbh15pidefaultNewInstance;
            if (copycolormatrixgbh15pidefault.dependencies().isEmpty()) {
                return;
            }
            List<Class<? extends copyColorMatrixgBh15pIdefault>> listDependencies = copycolormatrixgbh15pidefault.dependencies();
            listDependencies.getClass();
            for (Class<? extends copyColorMatrixgBh15pIdefault> cls2 : listDependencies) {
                cls2.getClass();
                set.add(cls2);
                BaseMapboxInitializer.Companion.getAllDependencies(cls2, set);
            }
        }

        public static /* synthetic */ void getInitializersMap$annotations() {
        }

        public final HashMap<Class<? extends copyColorMatrixgBh15pIdefault>, InitializerData> getInitializersMap() {
            return BaseMapboxInitializer.initializersMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> void init(Class<? extends copyColorMatrixgBh15pIdefault> cls, boolean z) {
            InitializerData initializerDataCopy$default;
            if (BaseMapboxInitializerKt.skipFurtherInitialization(cls)) {
                if (z) {
                    try {
                        cls.getSimpleName();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            }
            Context applicationContextFromActivityThread = BaseMapboxInitializer.appContext;
            if (applicationContextFromActivityThread == null) {
                try {
                    SentryLogcatAdapter.IconCompatParcelizer(BaseMapboxInitializer.TAG, "Trying to call static BaseMapboxInitializer.init() before running BaseMapboxInitializer.create()! Please make sure that Mapbox SDK is initialized before any APIs are called.");
                } catch (Throwable unused2) {
                }
                applicationContextFromActivityThread = getApplicationContextFromActivityThread();
                if (applicationContextFromActivityThread == null) {
                    return;
                }
            }
            while (!BaseMapboxInitializer.globalLock.tryLock(50L, TimeUnit.MILLISECONDS)) {
                if (BaseMapboxInitializerKt.skipFurtherInitialization(cls)) {
                    return;
                }
            }
            try {
                InitializerData initializerData = getInitializersMap().get(cls);
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Looper.myLooper(), Looper.getMainLooper()}, getCieXyz.write())).booleanValue()) {
                    InitializerData initializerData2 = initializerData;
                    if ((initializerData2 != null ? initializerData2.getState() : null) != InitializerState.IN_PROGRESS) {
                        cls.getSimpleName();
                    }
                }
                try {
                    if (initializerData != null) {
                        if (BaseMapboxInitializerKt.skipFurtherInitialization(cls)) {
                        }
                        BaseMapboxInitializer.globalLock.unlock();
                        return;
                    } else {
                        initializerData = new InitializerData(0L, null, 0, 7, null);
                        getInitializersMap().put(cls, initializerData);
                    }
                    BaseMapboxInitializer.Companion.updateState(cls, initializerDataCopy$default, InitializerState.IN_PROGRESS);
                    setToSaturationimpl.IconCompatParcelizer(applicationContextFromActivityThread).read(cls);
                    getInitializersMap().put(cls, InitializerData.copy$default(initializerDataCopy$default, 0L, InitializerState.SUCCESS, 0, 5, null));
                    BaseMapboxInitializer.globalLock.unlock();
                    return;
                } catch (Throwable th) {
                    throw new MapboxInitializerException(initializerDataCopy$default, applicationContextFromActivityThread, th);
                }
                initializerDataCopy$default = InitializerData.copy$default(initializerData, 0L, null, initializerData.getCurrentInitAttempt() + 1, 3, null);
                getInitializersMap().put(cls, initializerDataCopy$default);
                cls.getSimpleName();
                initializerDataCopy$default.getCurrentInitAttempt();
            } catch (Throwable th2) {
                BaseMapboxInitializer.globalLock.unlock();
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateState(Class<? extends copyColorMatrixgBh15pIdefault> cls, InitializerData initializerData, InitializerState initializerState) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            createFromParcel createfromparcel;
            LinkedHashSet<Class<? extends copyColorMatrixgBh15pIdefault>> linkedHashSet = new LinkedHashSet();
            getAllDependencies(cls, linkedHashSet);
            for (Class<? extends copyColorMatrixgBh15pIdefault> cls2 : linkedHashSet) {
                Companion companion = BaseMapboxInitializer.Companion;
                InitializerData initializerData2 = companion.getInitializersMap().get(cls2);
                if (initializerData2 != null) {
                    if (initializerData2.getState() != InitializerState.SUCCESS) {
                        companion.getInitializersMap().put(cls2, InitializerData.copy$default(initializerData2, 0L, initializerState, 0, 5, null));
                    }
                    createfromparcel = createFromParcel.INSTANCE;
                } else {
                    createfromparcel = null;
                }
                if (createfromparcel == null) {
                    companion.getInitializersMap().put(cls2, new InitializerData(initializerData.getFirstInitElapsedTimeMs(), initializerState, initializerData.getCurrentInitAttempt()));
                }
            }
            getInitializersMap().put(cls, InitializerData.copy$default(initializerData, 0L, initializerState, 0, 5, null));
        }

        @SuppressLint
        private final Context getApplicationContextFromActivityThread() {
            if ("robolectric".equals(Build.FINGERPRINT)) {
                return null;
            }
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
                objInvoke.getClass();
                return (Context) objInvoke;
            } catch (Throwable th) {
                try {
                    SentryLogcatAdapter.write(BaseMapboxInitializer.TAG, "Unable to get application context from ActivityThread", th);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        private Companion() {
        }

        private final void runCatchingEnhanced(Context context, InitializerData initializerData, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) throws MapboxInitializerException {
            try {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            } catch (Throwable th) {
                throw new MapboxInitializerException(initializerData, context, th);
            }
        }

        public final <T> void init(Class<? extends copyColorMatrixgBh15pIdefault> cls) {
            cls.getClass();
            init(cls, false);
        }
    }

    public abstract Class<? extends copyColorMatrixgBh15pIdefault> getInitializerClass();

    public static final HashMap<Class<? extends copyColorMatrixgBh15pIdefault>, InitializerData> getInitializersMap() {
        return Companion.getInitializersMap();
    }

    public static final <T> void init(Class<? extends copyColorMatrixgBh15pIdefault> cls) {
        Companion.init(cls);
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final List<Class<? extends copyColorMatrixgBh15pIdefault>> dependencies() {
        return new ArrayList();
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Boolean create(Context context) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        createFromParcel createfromparcel;
        context.getClass();
        appContext = context.getApplicationContext();
        try {
            Companion.init(getInitializerClass(), true);
        } catch (Throwable th) {
            SentryLogcatAdapter.IconCompatParcelizer(TAG, "Exception occurred when initializing " + getInitializerClass().getSimpleName() + ": " + th.getMessage());
            InitializerData initializerData = initializersMap.get(getInitializerClass());
            if (initializerData != null) {
                Companion.updateState(getInitializerClass(), initializerData, InitializerState.FAILURE);
                createfromparcel = createFromParcel.INSTANCE;
            } else {
                createfromparcel = null;
            }
            if (createfromparcel == null) {
                throw th;
            }
        }
        return Boolean.TRUE;
    }
}
