package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class calculateIfHorizontallyStacked {
    public static final getE IconCompatParcelizer = new getE(13);

    public static String IconCompatParcelizer(Date date) {
        Map map = (Map) IconCompatParcelizer.get();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get("yy-MM-dd HH:mm:ss.SSS");
        if (simpleDateFormat == null) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yy-MM-dd HH:mm:ss.SSS", java.util.Locale.getDefault());
            map.put("yy-MM-dd HH:mm:ss.SSS", simpleDateFormat2);
            simpleDateFormat = simpleDateFormat2;
        }
        return simpleDateFormat.format(date);
    }
}
