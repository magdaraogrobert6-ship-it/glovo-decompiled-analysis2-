package com.qualtrics.digital;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class Qualtrics {
    private static Qualtrics mInstance;
    protected InterceptManager mInterceptManager = null;
    private final OperationSynchronizer operationSynchronizer = new OperationSynchronizer();
    public Properties properties = Properties.instance(null);
    QualtricsWebviewTheme webviewTheme = new QualtricsWebviewTheme(R.drawable.ic_close_black_24dp);
    QualtricsTheme creativeTheme = QualtricsTheme.buildDefaultQualtricsTheme();
    ScheduledExecutorService backgroundExecutor = Executors.newScheduledThreadPool(2);

    public QualtricsTheme getCreativeTheme() {
        return this.creativeTheme;
    }

    public QualtricsWebviewTheme getWebviewTheme() {
        return this.webviewTheme;
    }

    public void setCreativeTheme(QualtricsTheme qualtricsTheme) {
        this.creativeTheme = qualtricsTheme;
    }

    public void setLogLevel(QualtricsLogLevel qualtricsLogLevel) {
        QualtricsLog.setLogLevel(qualtricsLogLevel);
    }

    public void setWebviewTheme(QualtricsWebviewTheme qualtricsWebviewTheme) {
        this.webviewTheme = qualtricsWebviewTheme;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateIntercept$5(IQualtricsCallback iQualtricsCallback, String str) {
        InterceptManager interceptManager;
        try {
            if (!this.operationSynchronizer.waitForOngoingOperation(OperationSynchronizer.SupportedOperation.INITIALIZE_PROJECT, 5) || (interceptManager = this.mInterceptManager) == null) {
                SentryLogcatAdapter.serializer("Qualtrics", "Cannot evaluate logic, SDK has not been initialized");
                iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.error, null, new Exception("Cannot evaluate logic, SDK has not been initialized")));
            } else {
                interceptManager.mClientCallbackUtils.setEvaluateInterceptCallback(iQualtricsCallback);
                this.mInterceptManager.evaluateIntercept(str);
            }
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateProject$4(IQualtricsProjectEvaluationCallback iQualtricsProjectEvaluationCallback) {
        InterceptManager interceptManager;
        try {
            if (this.operationSynchronizer.waitForOngoingOperation(OperationSynchronizer.SupportedOperation.INITIALIZE_PROJECT, 5) && (interceptManager = this.mInterceptManager) != null) {
                interceptManager.mClientCallbackUtils.setEvaluateProjectCallback(iQualtricsProjectEvaluationCallback);
                this.mInterceptManager.evaluateProject();
                return;
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Cannot evaluate logic, SDK has not been initialized");
            TargetingResult targetingResult = new TargetingResult(TargetingResultStatus.error, null, new Exception("Cannot evaluate logic, SDK has not been initialized"));
            HashMap map = new HashMap();
            map.put("Error", targetingResult);
            iQualtricsProjectEvaluationCallback.run(map);
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(IQualtricsInitializationCallback iQualtricsInitializationCallback) {
        this.mInterceptManager.loadIntercept(iQualtricsInitializationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$1() {
        this.mInterceptManager.loadIntercept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeProject$2(IQualtricsProjectInitializationCallback iQualtricsProjectInitializationCallback, Map map) {
        if (iQualtricsProjectInitializationCallback != null) {
            iQualtricsProjectInitializationCallback.run(map);
        }
        this.operationSynchronizer.removeFromOngoingOperations(OperationSynchronizer.SupportedOperation.INITIALIZE_PROJECT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeProject$3(IQualtricsProjectInitializationCallback iQualtricsProjectInitializationCallback) {
        this.mInterceptManager.loadProject(iQualtricsProjectInitializationCallback);
    }

    @Deprecated
    public void initialize(String str, String str2, String str3, Context context, IQualtricsInitializationCallback iQualtricsInitializationCallback) {
        try {
            if (!validateID("ZN", str2)) {
                logInvalidId("zone ID");
                if (iQualtricsInitializationCallback != null) {
                    iQualtricsInitializationCallback.run(new InitializationResult(Boolean.FALSE, "Invalid Zone ID"));
                    return;
                }
                return;
            }
            if (!validateID("SI", str3)) {
                logInvalidId("intercept ID");
                if (iQualtricsInitializationCallback != null) {
                    iQualtricsInitializationCallback.run(new InitializationResult(Boolean.FALSE, "Invalid Intercept ID"));
                    return;
                }
                return;
            }
            if (str == null) {
                logInvalidId("brand ID");
                if (iQualtricsInitializationCallback != null) {
                    iQualtricsInitializationCallback.run(new InitializationResult(Boolean.FALSE, "Invalid Brand ID"));
                    return;
                }
                return;
            }
            DurationTimer.instance().start();
            QualtricsNotificationManager.createChannel(context);
            this.properties.setContext(context);
            this.mInterceptManager = new InterceptManager(str, str2, str3, context, SDKUtils.instance(), ClientCallbackUtils.instance(), ClientSideInterceptUtils.instance(), this.backgroundExecutor);
            ScheduledExecutorService scheduledExecutorService = this.backgroundExecutor;
            int i = 0;
            if (iQualtricsInitializationCallback != null) {
                scheduledExecutorService.execute(new Qualtrics$$ExternalSyntheticLambda0(this, iQualtricsInitializationCallback, i));
            } else {
                scheduledExecutorService.execute(new Qualtrics$$ExternalSyntheticLambda1(i, this));
            }
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
        }
    }

    public void initializeProject(String str, String str2, String str3, Context context, IQualtricsProjectInitializationCallback iQualtricsProjectInitializationCallback) {
        OperationSynchronizer operationSynchronizer = this.operationSynchronizer;
        OperationSynchronizer.SupportedOperation supportedOperation = OperationSynchronizer.SupportedOperation.INITIALIZE_PROJECT;
        if (operationSynchronizer.isOperationRunning(supportedOperation)) {
            HashMap map = new HashMap();
            map.put("Error", new InitializationResult(Boolean.FALSE, "Initialization is already running"));
            if (iQualtricsProjectInitializationCallback != null) {
                iQualtricsProjectInitializationCallback.run(map);
                return;
            }
            return;
        }
        this.operationSynchronizer.addToOngoingOperations(supportedOperation);
        Qualtrics$$ExternalSyntheticLambda4 qualtrics$$ExternalSyntheticLambda4 = new Qualtrics$$ExternalSyntheticLambda4(this, 0, iQualtricsProjectInitializationCallback);
        try {
            if (!validateID("ZN", str2)) {
                logInvalidId("zone ID");
                HashMap map2 = new HashMap();
                map2.put("Error", new InitializationResult(Boolean.FALSE, "Invalid Zone ID"));
                qualtrics$$ExternalSyntheticLambda4.run(map2);
                return;
            }
            if (str == null) {
                logInvalidId("brand ID");
                HashMap map3 = new HashMap();
                map3.put("Error", new InitializationResult(Boolean.FALSE, "Invalid Brand ID"));
                qualtrics$$ExternalSyntheticLambda4.run(map3);
                return;
            }
            if (str3 != null && str3.isEmpty()) {
                str3 = null;
            }
            DurationTimer.instance().start();
            QualtricsNotificationManager.createChannel(context);
            this.properties.setContext(context);
            this.mInterceptManager = new InterceptManager(str, str2, context, SDKUtils.instance(), ClientCallbackUtils.instance(), ClientSideInterceptUtils.instance(), this.backgroundExecutor, str3);
            this.backgroundExecutor.execute(new Qualtrics$$ExternalSyntheticLambda0(this, qualtrics$$ExternalSyntheticLambda4, 2));
        } catch (Throwable th) {
            this.operationSynchronizer.removeFromOngoingOperations(OperationSynchronizer.SupportedOperation.INITIALIZE_PROJECT);
            CrashReporter.logCrash(th);
        }
    }

    private Qualtrics() {
    }

    private boolean validateID(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        Locale locale = Locale.US;
        return Pattern.compile(str + "_[0-9a-zA-Z]{11,15}").matcher(str2).matches();
    }

    public boolean display(Context context, int i, boolean z) {
        try {
            InterceptManager interceptManager = this.mInterceptManager;
            if (interceptManager != null) {
                return interceptManager.display(context, i, z);
            }
            return false;
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
            return false;
        }
    }

    public boolean displayIntercept(Context context, String str, int i, boolean z) {
        try {
            InterceptManager interceptManager = this.mInterceptManager;
            if (interceptManager != null) {
                return interceptManager.displayIntercept(context, str, i, z);
            }
            return false;
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
            return false;
        }
    }

    @Deprecated
    public void evaluateTargetingLogic(IQualtricsCallback iQualtricsCallback) {
        try {
            InterceptManager interceptManager = this.mInterceptManager;
            if (interceptManager != null) {
                interceptManager.evaluateTargetingLogic(iQualtricsCallback);
            } else {
                SentryLogcatAdapter.serializer("Qualtrics", "Cannot evaluate logic, SDK has not been initialized");
                iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.error, null, new Exception("Cannot evaluate logic, SDK has not been initialized")));
            }
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
        }
    }

    public ArrayList<String> getInitializedIntercepts() {
        InterceptManager interceptManager = this.mInterceptManager;
        return interceptManager != null ? interceptManager.getInitializedIntercepts() : new ArrayList<>();
    }

    public ArrayList<String> getPassingIntercepts() {
        InterceptManager interceptManager = this.mInterceptManager;
        return interceptManager != null ? interceptManager.getPassingIntercepts() : new ArrayList<>();
    }

    public String getQualtricsContactId(String str) {
        return ClientSideInterceptUtils.instance().getQTouchpoint(str);
    }

    public boolean hide() {
        try {
            InterceptManager interceptManager = this.mInterceptManager;
            if (interceptManager == null) {
                return false;
            }
            interceptManager.hide();
            return true;
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
            return false;
        }
    }

    public void registerViewVisit(String str) {
        try {
            ViewCounter.instance().registerViewVisit(str);
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
        }
    }

    public void resetTimer() {
        DurationTimer.instance().start();
    }

    public void resetViewCounter() {
        ViewCounter.instance().reset();
    }

    public void setCustomNetworkRequestInterceptor(IQualtricsRequestInterceptor iQualtricsRequestInterceptor) {
        RequestInterceptorProvider.getInstance().setRequestHandler(iQualtricsRequestInterceptor);
    }

    public void setEmbeddedFeedbackDialogCloseListener(IQualtricsEmbeddedFeedbackDialogCloseListener iQualtricsEmbeddedFeedbackDialogCloseListener) {
        ClientCallbackUtils.instance().setEmbeddedFeedbackOnCloseListener(iQualtricsEmbeddedFeedbackDialogCloseListener);
    }

    public void evaluateIntercept(String str, IQualtricsCallback iQualtricsCallback) {
        this.backgroundExecutor.execute(new j$$ExternalSyntheticLambda1(3, this, iQualtricsCallback, str));
    }

    public void evaluateProject(IQualtricsProjectEvaluationCallback iQualtricsProjectEvaluationCallback) {
        this.backgroundExecutor.execute(new Qualtrics$$ExternalSyntheticLambda0(this, iQualtricsProjectEvaluationCallback, 1));
    }

    public static Qualtrics instance() {
        if (mInstance == null) {
            mInstance = new Qualtrics();
        }
        return mInstance;
    }

    private void logInvalidId(String str) {
        Locale locale = Locale.US;
        SentryLogcatAdapter.serializer("Qualtrics", "Invalid " + str + ", initialization cancelled");
    }

    public boolean displayTarget(Context context, String str, int i, boolean z) {
        if (context == null || str == null) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) QualtricsSurveyActivity.class);
        intent.putExtra("targetURL", str);
        intent.putExtra("autoCloseAtEndOfSurvey", z);
        intent.setFlags(268435456);
        intent.putExtra("layoutFlags", i);
        context.startActivity(intent);
        return true;
    }

    public boolean display(Context context) {
        return display(context, 0, false);
    }

    public boolean displayIntercept(Context context, String str) {
        return displayIntercept(context, str, 0, false);
    }

    public boolean display(Context context, boolean z) {
        return display(context, 0, z);
    }

    public boolean displayIntercept(Context context, String str, int i) {
        return displayIntercept(context, str, i, false);
    }

    public boolean displayTarget(Context context, String str, boolean z) {
        return displayTarget(context, str, 0, z);
    }

    public boolean displayTarget(Context context, String str) {
        return displayTarget(context, str, 0, false);
    }

    @Deprecated
    public void initialize(String str, String str2, String str3, Context context) {
        initialize(str, str2, str3, context, null);
    }

    public void initializeProject(String str, String str2, Context context, IQualtricsProjectInitializationCallback iQualtricsProjectInitializationCallback) {
        initializeProject(str, str2, null, context, iQualtricsProjectInitializationCallback);
    }

    public void initializeProject(String str, String str2, String str3, Context context) {
        initializeProject(str, str2, str3, context, null);
    }

    public void initializeProject(String str, String str2, Context context) {
        initializeProject(str, str2, null, context, null);
    }
}
