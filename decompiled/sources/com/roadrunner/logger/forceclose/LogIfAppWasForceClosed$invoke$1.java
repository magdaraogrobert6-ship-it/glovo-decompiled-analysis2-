package com.roadrunner.logger.forceclose;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.CombinedScopeView;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class LogIfAppWasForceClosed$invoke$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ CombinedScopeView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogIfAppWasForceClosed$invoke$1(CombinedScopeView combinedScopeView, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = combinedScopeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        LogIfAppWasForceClosed$invoke$1 logIfAppWasForceClosed$invoke$1 = new LogIfAppWasForceClosed$invoke$1(this.write, shortNewsContentCardView);
        int i2 = serializer + 15;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return logIfAppWasForceClosed$invoke$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LogIfAppWasForceClosed$invoke$1 logIfAppWasForceClosed$invoke$1 = (LogIfAppWasForceClosed$invoke$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        logIfAppWasForceClosed$invoke$1.invokeSuspend(createfromparcel);
        int i4 = serializer + 67;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String description;
        int i = 2 % 2;
        int i2 = serializer + 71;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        CombinedScopeView combinedScopeView = this.write;
        Object systemService = ((Application) combinedScopeView.RemoteActionCompatParcelizer).getSystemService("activity");
        systemService.getClass();
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
        historicalProcessExitReasons.getClass();
        if (!historicalProcessExitReasons.isEmpty()) {
            int i4 = read + 7;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ApplicationExitInfo applicationExitInfoCd_ = ScreenStartObserver$$ExternalSyntheticLambda0.cd_(onContentCardDismissed.read((List) historicalProcessExitReasons));
            if (applicationExitInfoCd_.getReason() == 10 && (description = applicationExitInfoCd_.getDescription()) != null) {
                int i6 = serializer + 51;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0 ? hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) description, (CharSequence) "FORCE STOP", false) : !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) description, (CharSequence) "FORCE STOP", false)) {
                    decode decodeVar = (decode) combinedScopeView.read;
                    Map mapSingletonMap = Collections.singletonMap("force_close_time_ms", String.valueOf(applicationExitInfoCd_.getTimestamp()));
                    mapSingletonMap.getClass();
                    decodeVar.logEvent("app_force_closed", mapSingletonMap);
                    int i7 = read + 105;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
            }
        }
        return createFromParcel.INSTANCE;
    }
}
