package com.roadrunner.logger.logger.sentry;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import java.util.Map;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;
import o.internalHeightCallbacklambda0;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryAppInfoChangedListener implements AppInfoChangedListener {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void onInfoUpdated(executeAsOneOrNull executeasoneornull) {
        int i = 2 % 2;
        executeasoneornull.getClass();
        internalHeightCallbacklambda0.read(new PerseusInitializerImpl$$ExternalSyntheticLambda0(executeasoneornull, this));
        int i2 = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        int i = 2 % 2;
        executableQueryexecuteAsOneOrNull1.getClass();
        internalHeightCallbacklambda0.read(new RetryWithDelay$$ExternalSyntheticLambda1(executableQueryexecuteAsOneOrNull1, this));
        int i2 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateProperties(Map map) {
        int i = 2 % 2;
        map.getClass();
        internalHeightCallbacklambda0.read(new PerseusInitializerImpl$$ExternalSyntheticLambda0(25, map));
        int i2 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperty(String str, String str2) {
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        internalHeightCallbacklambda0.read(new JankStatsFrameTracker$$ExternalSyntheticLambda3(str, 19, str2));
        int i2 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static Map write(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        int i = 2 % 2;
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("employee_id", executableQueryexecuteAsOneOrNull1.read), new onViewAttachedToWindowlambda0(PushNotificationParserObj.COUNTRY_KEY, executableQueryexecuteAsOneOrNull1.serializer), new onViewAttachedToWindowlambda0("device_id", executableQueryexecuteAsOneOrNull1.RemoteActionCompatParcelizer));
        int i2 = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return mapRemoteActionCompatParcelizer;
    }
}
