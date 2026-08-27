package o;

import java.util.ArrayList;
import java.util.Calendar;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class jsonStringToStringMap {
    public static final jsonStringToStringMap write = new jsonStringToStringMap();
    public static final jsonStringToStringMap IconCompatParcelizer = new jsonStringToStringMap();

    public jsonStringToStringMap(jsonStringToStringMap jsonstringtostringmap) {
    }

    public DataStoreUtilsd serializer(LocalDate localDate, jsonStringToStringMap jsonstringtostringmap) {
        int dayOfWeek;
        jsonstringtostringmap.getClass();
        int dayOfWeek2 = localDate.getDayOfWeek();
        if (jsonstringtostringmap.equals(IconCompatParcelizer)) {
            dayOfWeek = LocalDate.now().getDayOfWeek();
        } else {
            int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
            dayOfWeek = firstDayOfWeek == 1 ? 7 : firstDayOfWeek - 1;
        }
        LocalDate localDateMinusDays = localDate.minusDays((dayOfWeek > dayOfWeek2 ? 7 - (dayOfWeek - dayOfWeek2) : dayOfWeek2 - dayOfWeek) + 1);
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = new ensureSubscribedToInAppMessageEventslambda7(1, 7, 1);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
        getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7.iterator();
        while (it.RemoteActionCompatParcelizer) {
            arrayList.add(localDateMinusDays.plusDays(it.RemoteActionCompatParcelizer()));
        }
        return new DataStoreUtilsd(arrayList);
    }

    public jsonStringToStringMap() {
    }
}
