package com.sentiance.sdk.exception;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.breakpad.BreakpadLibrary;
import com.sentiance.sdk.exception.NativeExceptionHandler;
import com.sentiance.sdk.logging.LogFilePurpose;
import com.sentiance.sdk.util.c;
import com.sentiance.sdk.util.x;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import o.BrazeInAppMessageManagerExternalSyntheticLambda45;
import o.addBannerViewMonitor;
import o.component4android_sdk_base_release;
import o.getActionButtons;
import o.getAnalyticsEnabledEnterannotations;
import o.getBigTitleText;
import o.getBrazeExtras;
import o.getConversationMessages;
import o.getCooldownEnterSeconds;
import o.getVerticalAccuracy;
import o.migrateSealedSessionsMapToJsonlambda0;
import o.migrateTriggersReeligibilityToJsonlambda30;
import o.onContentCardDismissed;
import o.parseLonglambda0;
import o.parseStringAsBoolean;
import o.parseStringlambda0;
import o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;
import o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.readandroid_sdk_base_release;
import o.removeGeofencesRegisteredWithGeofencingClientlambda2;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = NativeExceptionHandler.GUARD_TAG, componentName = NativeExceptionHandler.GUARD_TAG)
@DontObfuscate
public class NativeExceptionHandler implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private static final String DATE_FORMAT = "yyyyMMddHHmmss";
    private static final String DUMP_DIR = "sentiance/dumps";
    private static final String DUMP_FILE_EXTENSION = ".dmp";
    static final long EXCEPTION_FILES_SIZE_DAILY_LIMIT_BYTES = 5242880;
    public static final String EXCEPTION_FILE_NAME = LogFilePurpose.EXCEPTION.getFileName();
    private static final String GUARD_TAG = "NativeExceptionHandler";
    static final String KEY_EXCEPTIONS_TODAY = "exceptions_today";
    private static final String TODAY = "yyyyMMdd";
    private final BreakpadLibrary mBreakpadLibrary;
    private final c mCache;
    private final Context mContext;
    private final getAnalyticsEnabledEnterannotations mEventBus;
    private final getCooldownEnterSeconds mEventStore;
    private final readandroid_sdk_base_release mExecutor;
    private boolean mIsSet;
    private final parseLonglambda0 mLogger;
    private final getConversationMessages mMinidumpAnalyzer;
    private boolean mNativeLibraryLoaded;
    private List<write> mRecentExceptions = new ArrayList();
    private boolean mSettingExceptionHandlerInterrupted;
    private final component4android_sdk_base_release mThriftLogger;
    private final getVerticalAccuracy mThriftUtil;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI mTimeProvider;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getRecentOrUnprocessedExceptionsSince$0(long j, Long l) {
        return l.longValue() >= j;
    }

    private void processCrashFiles() {
        synchronized (this) {
            this.mLogger.IconCompatParcelizer("Processing native crash dump files", new Object[0]);
            File[] dumpFiles = getDumpFiles();
            int length = dumpFiles.length;
            parseLonglambda0 parselonglambda0 = this.mLogger;
            if (length == 0) {
                parselonglambda0.IconCompatParcelizer("No native crash dump files to process", new Object[0]);
                return;
            }
            parselonglambda0.IconCompatParcelizer("Found %d native crash dump files to process", Integer.valueOf(dumpFiles.length));
            createExceptionLogs(dumpFiles);
            publishExceptionEvents(dumpFiles);
            for (File file : getDumpFiles()) {
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExceptionHandlerInternal() {
        boolean z;
        synchronized (this) {
            if (this.mIsSet) {
                return;
            }
            if (!this.mSettingExceptionHandlerInterrupted) {
                File dumpDir = getDumpDir();
                if (!dumpDir.exists()) {
                    this.mLogger.RemoteActionCompatParcelizer("Native exception dump dir doesn't exist", new Object[0]);
                    return;
                }
                this.mBreakpadLibrary.getClass();
                try {
                    System.loadLibrary("sentiance_breakpad");
                    z = true;
                } catch (UnsatisfiedLinkError unused) {
                    z = false;
                }
                this.mNativeLibraryLoaded = z;
                if (!z) {
                    this.mLogger.RemoteActionCompatParcelizer("Failed to load the breakpad library", new Object[0]);
                } else {
                    this.mBreakpadLibrary.enableExceptionHandling(dumpDir.getAbsolutePath());
                    this.mIsSet = true;
                }
            }
        }
    }

    public void addFileSizeToCache(long j) {
        synchronized (this) {
            this.mTimeProvider.getClass();
            String strSerializer = x.serializer(System.currentTimeMillis(), TODAY);
            String strWrite = this.mCache.write(KEY_EXCEPTIONS_TODAY, "");
            if (TextUtils.isEmpty(strWrite)) {
                strWrite = strSerializer + "-0";
            }
            String[] strArrSplit = strWrite.split("-");
            long j2 = 0;
            if (strArrSplit.length == 2) {
                String str = strArrSplit[0];
                long longSafely = getLongSafely(strArrSplit[1], 0L);
                if (str.equals(strSerializer)) {
                    j2 = longSafely;
                } else {
                    this.mCache.read(KEY_EXCEPTIONS_TODAY);
                }
            }
            c cVar = this.mCache;
            Locale locale = Locale.ENGLISH;
            cVar.RemoteActionCompatParcelizer(KEY_EXCEPTIONS_TODAY, strSerializer + "-" + (j2 + j));
        }
    }

    public List<Long> getRecentOrUnprocessedExceptionsSince(final long j) {
        List<Long> list;
        synchronized (this) {
            list = (List) Stream.concat(Arrays.stream(getDumpFiles()).map(new H3Core$$ExternalSyntheticLambda2(6)), this.mRecentExceptions.stream().map(new H3Core$$ExternalSyntheticLambda2(7))).filter(new Predicate() { // from class: o.parseStringAsColorInt
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return NativeExceptionHandler.lambda$getRecentOrUnprocessedExceptionsSince$0(j, (Long) obj);
                }
            }).sorted().collect(Collectors.toList());
        }
        return list;
    }

    public long getSizeOfExceptionLogFilesCreatedTodayInBytes() {
        synchronized (this) {
            this.mTimeProvider.getClass();
            String strSerializer = x.serializer(System.currentTimeMillis(), TODAY);
            String strWrite = this.mCache.write(KEY_EXCEPTIONS_TODAY, "");
            if (TextUtils.isEmpty(strWrite)) {
                return 0L;
            }
            String[] strArrSplit = strWrite.split("-");
            if (strArrSplit.length > 1 && strArrSplit[0].equals(strSerializer)) {
                return getLongSafely(strArrSplit[1], 0L);
            }
            return 0L;
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public void handleSdkInit() {
        processCrashFiles();
    }

    public static class write {
        private final long IconCompatParcelizer;
        private final String read;

        public final long RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public write(long j, String str) {
            this.IconCompatParcelizer = j;
            this.read = str;
        }

        public final String serializer() {
            return this.read;
        }
    }

    private String getExceptionLogFileName(long j) {
        return EXCEPTION_FILE_NAME + "-" + x.serializer(j, DATE_FORMAT);
    }

    private File getFilesDir() {
        return this.mContext.getNoBackupFilesDir();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public void clearData() {
        this.mCache.read();
        for (File file : getDumpFiles()) {
            file.delete();
        }
    }

    public File getDumpDir() {
        File file = new File(getFilesDir(), DUMP_DIR);
        file.mkdirs();
        return file;
    }

    public List<write> getMaxDayOldExceptionsBetween(long j, long j2) {
        r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y r8lambdastxqz_kvz8rg4vu3rz4svrea8y;
        Boolean bool;
        ArrayList arrayList = new ArrayList();
        this.mTimeProvider.getClass();
        long jMax = Math.max(j, System.currentTimeMillis() - CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
        synchronized (this) {
            processCrashFiles();
            for (write writeVar : this.mRecentExceptions) {
                this.mLogger.IconCompatParcelizer("Checking recent exception at %d", Long.valueOf(writeVar.IconCompatParcelizer));
                if (writeVar.IconCompatParcelizer >= jMax && writeVar.IconCompatParcelizer <= j2) {
                    arrayList.add(writeVar);
                }
            }
        }
        Iterator<getCooldownEnterSeconds.read> it = this.mEventStore.RemoteActionCompatParcelizer(r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y.class, Long.valueOf(jMax), Long.valueOf(j2), false, false).iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(this.mThriftLogger);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdastxqz_kvz8rg4vu3rz4svrea8y = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addOnContextAvailableListener) != null && (bool = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.RemoteActionCompatParcelizer) != null && bool.booleanValue()) {
                this.mLogger.IconCompatParcelizer("Found native exception event at %d", r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                arrayList.add(new write(r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.longValue(), r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addOnContextAvailableListener.read));
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Long.valueOf(((write) obj).RemoteActionCompatParcelizer()))) {
                arrayList2.add(obj);
            }
        }
        return onContentCardDismissed.serializer(arrayList2, new migrateTriggersReeligibilityToJsonlambda30(new BrazeInAppMessageManagerExternalSyntheticLambda45(17)));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        this.mTimeProvider.getClass();
        map.put(r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y.class, Long.valueOf(System.currentTimeMillis() - CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL));
        return map;
    }

    public void setExceptionHandler() {
        synchronized (this) {
            this.mSettingExceptionHandlerInterrupted = false;
            this.mExecutor.RemoteActionCompatParcelizer(new parseStringAsBoolean(this));
        }
    }

    public void unsetExceptionHandler() {
        synchronized (this) {
            this.mSettingExceptionHandlerInterrupted = true;
            this.mIsSet = false;
            if (this.mNativeLibraryLoaded) {
                this.mBreakpadLibrary.disableExceptionHandling();
            }
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public void onKillswitchActivated() {
        clearData();
        synchronized (this) {
            this.mRecentExceptions.clear();
        }
    }

    private void createExceptionLogs(File[] fileArr) {
        long sizeOfExceptionLogFilesCreatedTodayInBytes = getSizeOfExceptionLogFilesCreatedTodayInBytes();
        int i = 0;
        for (File file : fileArr) {
            if (sizeOfExceptionLogFilesCreatedTodayInBytes > EXCEPTION_FILES_SIZE_DAILY_LIMIT_BYTES) {
                this.mLogger.IconCompatParcelizer("Today's log cap size has been exceeded. Skipping %d.", Integer.valueOf(fileArr.length - i));
                return;
            }
            long jCompressAndCopy = compressAndCopy(file, new File(parseStringlambda0.IconCompatParcelizer(this.mContext), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(getExceptionLogFileName(file.lastModified()), ".gz")));
            if (jCompressAndCopy > 0) {
                addFileSizeToCache(jCompressAndCopy);
                sizeOfExceptionLogFilesCreatedTodayInBytes += jCompressAndCopy;
            }
            i++;
        }
    }

    private File[] getDumpFiles() {
        File[] fileArrListFiles;
        File dumpDir = getDumpDir();
        if (!dumpDir.exists() || (fileArrListFiles = dumpDir.listFiles(new getBigTitleText())) == null) {
            return new File[0];
        }
        Arrays.sort(fileArrListFiles, new getActionButtons());
        return fileArrListFiles;
    }

    private String getStacktrace(File file) {
        String str = "Source file: " + getExceptionLogFileName(file.lastModified());
        try {
            String str2 = this.mMinidumpAnalyzer.read(file.getAbsolutePath());
            if (str2 == null) {
                return str;
            }
            return str + "\n\n" + str2;
        } catch (Throwable unused) {
            this.mLogger.RemoteActionCompatParcelizer("Failed to analyze minidump file %s", file.getName());
            return str;
        }
    }

    private void publishExceptionEvents(File[] fileArr) {
        for (File file : fileArr) {
            String stacktrace = getStacktrace(file);
            this.mEventBus.serializer(this.mThriftUtil.write(file.lastModified(), stacktrace));
            write writeVar = new write(file.lastModified(), stacktrace);
            synchronized (this) {
                this.mRecentExceptions.add(writeVar);
            }
        }
    }

    public long compressAndCopy(File file, File file2) {
        File file3 = migrateSealedSessionsMapToJsonlambda0.read(file, "", this.mLogger);
        if (file3 == null) {
            return 0L;
        }
        try {
            migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file3, file2);
            file3.delete();
            return file2.length();
        } catch (IOException e) {
            file3.delete();
            this.mLogger.IconCompatParcelizer(false, e, "Failed to copy the compressed exception file %s", file3.getName());
            return 0L;
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public void subscribe() {
        this.mEventBus.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new getBrazeExtras(this, this.mExecutor));
    }

    public NativeExceptionHandler(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, BreakpadLibrary breakpadLibrary, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, c cVar, component4android_sdk_base_release component4android_sdk_base_releaseVar, getConversationMessages getconversationmessages) {
        this.mCache = cVar;
        this.mLogger = parselonglambda0;
        this.mContext = context;
        this.mEventBus = getanalyticsenabledenterannotations;
        this.mExecutor = readandroid_sdk_base_releaseVar;
        this.mEventStore = getcooldownenterseconds;
        this.mThriftUtil = getverticalaccuracy;
        this.mThriftLogger = component4android_sdk_base_releaseVar;
        this.mTimeProvider = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.mBreakpadLibrary = breakpadLibrary;
        this.mMinidumpAnalyzer = getconversationmessages;
    }

    private long getLongSafely(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            this.mLogger.IconCompatParcelizer(false, e, "Couldn't parse long %s", str);
            return j;
        }
    }
}
