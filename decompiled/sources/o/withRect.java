package o;

import com.roadrunner.common.data.api.ExtractCriticalHttpIssueData;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class withRect {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final EnumColumnAdapter read;
    public final ExtractCriticalHttpIssueData serializer;

    public withRect(EnumColumnAdapter enumColumnAdapter, ExtractCriticalHttpIssueData extractCriticalHttpIssueData) {
        this.read = enumColumnAdapter;
        this.serializer = extractCriticalHttpIssueData;
    }

    public final void RemoteActionCompatParcelizer(Throwable th) {
        int i = 2 % 2;
        th.getClass();
        markUpdated markupdatedRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(th);
        if (markupdatedRemoteActionCompatParcelizer == null) {
            int i2 = write + 13;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        Set set = neighborsScoredByDistanceui.IconCompatParcelizer;
        ArrayList<updateFlagsFor> arrayList = new ArrayList();
        for (Object obj : set) {
            updateFlagsFor updateflagsfor = (updateFlagsFor) obj;
            String lowerCase = markupdatedRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            if (!(!lowerCase.equals(updateflagsfor.read.getValue())) && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) markupdatedRemoteActionCompatParcelizer.MediaDescriptionCompat, (CharSequence) updateflagsfor.RemoteActionCompatParcelizer, false)) {
                int i4 = write + 27;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                arrayList.add(obj);
            }
        }
        int i6 = IconCompatParcelizer + 65;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        for (updateFlagsFor updateflagsfor2 : arrayList) {
            int i8 = IconCompatParcelizer + 39;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            ((SentryCriticalIssueLogger) this.read).write(updateflagsfor2.write, updateflagsfor2.IconCompatParcelizer, markupdatedRemoteActionCompatParcelizer.IconCompatParcelizer, markupdatedRemoteActionCompatParcelizer.write);
        }
    }
}
