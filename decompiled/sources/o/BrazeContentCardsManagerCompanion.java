package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BrazeContentCardsManagerCompanion extends setContentCardsActionListener {
    public static void write(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static void RatingCompat(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
