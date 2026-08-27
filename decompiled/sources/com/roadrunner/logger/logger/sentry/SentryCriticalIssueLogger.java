package com.roadrunner.logger.logger.sentry;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.AddToCustomAttributeArrayStep;
import o.BannerViewExternalSyntheticLambda2;
import o.EnumColumnAdapter;
import o.SuspendingTransactionWrapper;
import o.displayInAppMessagelambda0;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda10;
import o.displayInAppMessagelambda9;
import o.executeAsList;
import o.executelambda4;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.internalHeightCallbacklambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.registerInAppMessageManagerlambda40;
import o.resetTransientState;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;
import o.transferSessionPackageI;
import org.koin.dsl.ModuleDSLKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryCriticalIssueLogger implements EnumColumnAdapter {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final transferSessionPackageI serializer;
    public final RouterLogger write;

    public SentryCriticalIssueLogger(SuspendingTransactionWrapper suspendingTransactionWrapper, transferSessionPackageI transfersessionpackagei, RouterLogger routerLogger) {
        transfersessionpackagei.getClass();
        this.serializer = transfersessionpackagei;
        this.write = routerLogger;
    }

    public final void write(String str, executeAsList executeaslist, String str2, Map map) {
        Integer numMediaSessionCompatQueueItem;
        int i = 2 % 2;
        str.getClass();
        executeaslist.getClass();
        str2.getClass();
        map.getClass();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        if (firebaseRemoteConfigImpl.IconCompatParcelizer.RemoteActionCompatParcelizer("lrtmi_disabled_critical_issues").contains(str)) {
            int i2 = RemoteActionCompatParcelizer + 121;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 5 / 3;
                return;
            }
            return;
        }
        String str3 = (String) map.get("http_error_code");
        if (str3 != null && (numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str3)) != null) {
            int i4 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int iIntValue = numMediaSessionCompatQueueItem.intValue();
            firebaseRemoteConfigImpl.getClass();
            List list = instance_delegatelambda0.write;
            try {
                String str4 = firebaseRemoteConfigImpl.IconCompatParcelizer.read("critical_observability_network_error_filter");
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer;
                    int i6 = registerInAppMessageManagerlambda40.IconCompatParcelizer;
                    registerInAppMessageManagerlambda40 registerinappmessagemanagerlambda40IconCompatParcelizer = ModuleDSLKt.IconCompatParcelizer(displayInAppMessagelambda1.IconCompatParcelizer(String.class));
                    registerInAppMessageManagerlambda40 registerinappmessagemanagerlambda40IconCompatParcelizer2 = ModuleDSLKt.IconCompatParcelizer(displayInAppMessagelambda1.IconCompatParcelizer(Integer.TYPE));
                    displayInAppMessagelambda10 displayinappmessagelambda10 = displayInAppMessagelambda1.IconCompatParcelizer;
                    r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(List.class);
                    List listSingletonList = Collections.singletonList(registerinappmessagemanagerlambda40IconCompatParcelizer2);
                    displayinappmessagelambda10.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(prepareinappmessagewithzippedassethtml, displayInAppMessagelambda1.IconCompatParcelizer(registerinappmessagemanagerlambda40IconCompatParcelizer, ModuleDSLKt.IconCompatParcelizer(new displayInAppMessagelambda0(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, listSingletonList, false))));
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpIconCompatParcelizer;
                    List list2 = (List) ((Map) isverticalswipeinalloweddirection.serializer(str4, setgraphicmodalmaxwidthdpIconCompatParcelizer)).get(str);
                    if (list2 != null) {
                        list = list2;
                    }
                }
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to parse CRITICAL_OBSERVABILITY_NETWORK_ERROR_FILTER", new Object[0]);
            }
            if (list.contains(Integer.valueOf(iIntValue))) {
                return;
            }
        }
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        CriticalIssueNonFatalException criticalIssueNonFatalException = new CriticalIssueNonFatalException(d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("critical_issue_key=", str, " critical_issue_owner=", executeaslist.name(), " critical_issue_message="), str2, " tags=", onContentCardDismissed.IconCompatParcelizer(map.entrySet(), null, "{", "}", new MapApiError$$ExternalSyntheticLambda1(16), 25)));
        criticalIssueNonFatalException.setStackTrace(new StackTraceElement[]{new StackTraceElement("CriticalIssue.".concat(str), executeaslist.name(), "CriticalIssue.kt", 0)});
        forest.write(criticalIssueNonFatalException);
        RouterLogger routerLogger = this.write;
        long jWrite = ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) routerLogger.read)).IconCompatParcelizer.write("sentry_critical_observability_sampling_rate");
        Long lValueOf = Long.valueOf(jWrite);
        if (jWrite == 0) {
            lValueOf = null;
        }
        if (((displayInAppMessagelambda9) routerLogger.serializer).write() < (lValueOf != null ? lValueOf.longValue() : 10L) / 100.0d) {
            BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = new BannerViewExternalSyntheticLambda2();
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = new r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer = str;
            bannerViewExternalSyntheticLambda2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54beh8zsbru0cxi2ccsp2synys;
            for (Map.Entry entry : map.entrySet()) {
                int i7 = RemoteActionCompatParcelizer + 47;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                bannerViewExternalSyntheticLambda2.IconCompatParcelizer((String) entry.getKey(), (String) entry.getValue());
            }
            bannerViewExternalSyntheticLambda2.IconCompatParcelizer("critical_issue", str);
            bannerViewExternalSyntheticLambda2.IconCompatParcelizer("critical_issue_owner", executeaslist.name());
            bannerViewExternalSyntheticLambda2.IconCompatParcelizer("critical_issue_message", str2);
            AddToCustomAttributeArrayStep addToCustomAttributeArrayStepIconCompatParcelizer = internalHeightCallbacklambda0.IconCompatParcelizer();
            addToCustomAttributeArrayStepIconCompatParcelizer.getClass();
            addToCustomAttributeArrayStepIconCompatParcelizer.RemoteActionCompatParcelizer(bannerViewExternalSyntheticLambda2, new executelambda4());
            int i9 = RemoteActionCompatParcelizer + 43;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
    }
}
