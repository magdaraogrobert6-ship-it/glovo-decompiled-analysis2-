package com.mapbox.navigation.core.accounts;

import com.google.android.gms.internal.mlkit_vision_face.zzdr;
import com.mapbox.common.BillingServiceError;
import com.mapbox.common.BillingServiceErrorCode;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.OnBillingServiceError;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.roadrunner.home.CreateHomeScope;
import com.sentiance.core.model.events.E$b;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.WrappedComposition;
import o.accesssetMeasurementConstraintsBRTryo0;
import o.setCoordinatesAccessed;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BillingController$$ExternalSyntheticLambda3 implements accesssetMeasurementConstraintsBRTryo0, OnBillingServiceError {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ BillingController$$ExternalSyntheticLambda3(Object obj, Object obj2, long j, Object obj3) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
    }

    @Override // o.accesssetMeasurementConstraintsBRTryo0
    public ScheduledFuture IconCompatParcelizer(CreateHomeScope createHomeScope) {
        setCoordinatesAccessed setcoordinatesaccessed = (setCoordinatesAccessed) this.f$0;
        Callable callable = (Callable) this.f$1;
        return setcoordinatesaccessed.RemoteActionCompatParcelizer.schedule(new WrappedComposition(setcoordinatesaccessed, callable, createHomeScope, 1), this.f$2, (TimeUnit) this.f$3);
    }

    @Override // com.mapbox.common.OnBillingServiceError
    public void run(BillingServiceError billingServiceError) {
        E$b e$b = (E$b) this.f$0;
        SessionSKUIdentifier sessionSKUIdentifier = (SessionSKUIdentifier) this.f$1;
        String str = (String) this.f$3;
        sessionSKUIdentifier.getClass();
        billingServiceError.getClass();
        E$b.handlerError(billingServiceError);
        if (billingServiceError.getCode() != BillingServiceErrorCode.RESUME_FAILED) {
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI(zzdr.access$getPublicName(sessionSKUIdentifier) + " has ben resumed because " + str, "BillingExplanation");
                return;
            }
            return;
        }
        LoggerProviderKt.logW("Session resumption failed, starting a new one instead.", "BillingController");
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI("Failed to resume " + zzdr.access$getPublicName(sessionSKUIdentifier) + '(' + billingServiceError.getMessage() + ").", "BillingExplanation");
        }
        e$b.beginBillingSession(sessionSKUIdentifier, this.f$2, str);
    }
}
