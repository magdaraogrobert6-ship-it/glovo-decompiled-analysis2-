package com.mapbox.api.directions.v5.utils;

import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.api.directions.v5.models.Bearing;
import com.roadrunner.domain.util.IsFixableByRetry;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ParseUtils {
    public static final n0 POINT_PARSER = new n0(0);
    public static final IsFixableByRetry BOOLEAN_PARSER = new IsFixableByRetry(3);
    public static final AnonymousClass6 BEARING_PARSER = new ValueParser() { // from class: com.mapbox.api.directions.v5.utils.ParseUtils.6
        @Override // com.mapbox.api.directions.v5.utils.ParseUtils.ValueParser
        public final Object parse(String str) {
            String[] strArrSplit = str.split(",");
            return Bearing.builder().angle(Double.parseDouble(strArrSplit[0])).degrees(Double.parseDouble(strArrSplit[1])).build();
        }
    };

    public interface ValueParser {
        Object parse(String str);
    }

    public static ArrayList parseToList(String str, ValueParser valueParser) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";", -1)) {
            if (str2.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(valueParser.parse(str2));
            }
        }
        return arrayList;
    }
}
