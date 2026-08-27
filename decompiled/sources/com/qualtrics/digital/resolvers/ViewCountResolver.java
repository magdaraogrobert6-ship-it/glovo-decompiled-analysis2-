package com.qualtrics.digital.resolvers;

import com.qualtrics.digital.ViewCounter;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ViewCountResolver {
    private static String TOTAL_VIEWS = "Total";
    private static String UNIQUE_VIEWS = "Unique";

    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    public static boolean evaluateViewCount(String str, String str2, String str3) {
        Integer numValueOf;
        byte b;
        int totalViewsVisited = ViewCounter.instance().getTotalViewsVisited();
        int uniqueViewsVisited = ViewCounter.instance().getUniqueViewsVisited();
        try {
            numValueOf = Integer.valueOf(Integer.parseInt(str2));
        } catch (Exception unused) {
            SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected variable rightValue: " + str2);
            numValueOf = null;
        }
        HashMap map = new HashMap();
        map.put(TOTAL_VIEWS, Integer.valueOf(totalViewsVisited));
        map.put(UNIQUE_VIEWS, Integer.valueOf(uniqueViewsVisited));
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 2220) {
            if (iHashCode != 2285) {
                if (iHashCode != 2440) {
                    if (iHashCode != 70904) {
                        if (iHashCode != 75709) {
                            if (iHashCode == 77178 && str.equals("NEQ")) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("LTE")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("GTE")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("LT")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("GT")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("EQ")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return map.containsKey(str3) && ((Integer) map.get(str3)).equals(numValueOf);
        }
        if (b == 1) {
            return map.containsKey(str3) && ((Integer) map.get(str3)).intValue() > numValueOf.intValue();
        }
        if (b == 2) {
            return map.containsKey(str3) && ((Integer) map.get(str3)).intValue() < numValueOf.intValue();
        }
        if (b == 3) {
            return map.containsKey(str3) && ((Integer) map.get(str3)).intValue() >= numValueOf.intValue();
        }
        if (b == 4) {
            return map.containsKey(str3) && ((Integer) map.get(str3)).intValue() <= numValueOf.intValue();
        }
        if (b == 5) {
            return map.containsKey(str3) && !((Integer) map.get(str3)).equals(numValueOf);
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected variable operator: ".concat(str));
        return false;
    }
}
