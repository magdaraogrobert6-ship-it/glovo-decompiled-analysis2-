package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class convertJSONObjectToMap implements getColorIntegerOrNulllambda0 {
    public final Map serializer;

    public convertJSONObjectToMap(LinkedHashMap linkedHashMap) {
        this.serializer = Collections.unmodifiableMap(linkedHashMap);
    }
}
