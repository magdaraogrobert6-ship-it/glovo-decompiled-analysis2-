package o;

import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;

/* JADX INFO: loaded from: classes3.dex */
public interface EnumColumnAdapter {
    static /* synthetic */ void serializer(EnumColumnAdapter enumColumnAdapter, String str, executeAsList executeaslist, String str2) {
        int i = 2 % 2;
        ((SentryCriticalIssueLogger) enumColumnAdapter).write(str, executeaslist, str2, SimpleItemTouchHelperCallback.serializer);
    }
}
