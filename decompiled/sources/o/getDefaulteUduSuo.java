package o;

import com.roadrunner.common.data.api.ExtractCriticalHttpIssueData;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaulteUduSuo {
    private static int read = 0;
    private static int serializer = 1;
    public final ExtractCriticalHttpIssueData IconCompatParcelizer;
    public final EnumColumnAdapter write;

    public getDefaulteUduSuo(EnumColumnAdapter enumColumnAdapter, ExtractCriticalHttpIssueData extractCriticalHttpIssueData) {
        enumColumnAdapter.getClass();
        extractCriticalHttpIssueData.getClass();
        this.write = enumColumnAdapter;
        this.IconCompatParcelizer = extractCriticalHttpIssueData;
    }

    public final void write(String str, Exception exc) {
        int i = 2 % 2;
        markUpdated markupdatedRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(exc);
        if (markupdatedRemoteActionCompatParcelizer != null) {
            int i2 = read + 61;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            executeAsList executeaslist = executeAsList.OTW;
            String str2 = markupdatedRemoteActionCompatParcelizer.IconCompatParcelizer;
            Map mapSingletonMap = Collections.singletonMap("http_error_code", String.valueOf(markupdatedRemoteActionCompatParcelizer.read));
            mapSingletonMap.getClass();
            ((SentryCriticalIssueLogger) this.write).write(str, executeaslist, str2, mapSingletonMap);
            int i4 = read + 79;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }
}
