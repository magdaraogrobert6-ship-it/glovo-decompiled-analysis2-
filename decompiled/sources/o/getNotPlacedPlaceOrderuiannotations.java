package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getNotPlacedPlaceOrderuiannotations {
    public static volatile getNotPlacedPlaceOrderuiannotations read;
    public static final getNotPlacedPlaceOrderuiannotations serializer;

    static {
        getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations = new getNotPlacedPlaceOrderuiannotations();
        Map map = Collections.EMPTY_MAP;
        serializer = getnotplacedplaceorderuiannotations;
    }

    public static getNotPlacedPlaceOrderuiannotations read() {
        getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations;
        getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations2 = read;
        if (getnotplacedplaceorderuiannotations2 != null) {
            return getnotplacedplaceorderuiannotations2;
        }
        synchronized (getNotPlacedPlaceOrderuiannotations.class) {
            getnotplacedplaceorderuiannotations = read;
            if (getnotplacedplaceorderuiannotations == null) {
                Class cls = setSubcompositionsStateui.serializer;
                getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations3 = null;
                if (cls != null) {
                    try {
                        getnotplacedplaceorderuiannotations3 = (getNotPlacedPlaceOrderuiannotations) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                getnotplacedplaceorderuiannotations = getnotplacedplaceorderuiannotations3 != null ? getnotplacedplaceorderuiannotations3 : serializer;
                read = getnotplacedplaceorderuiannotations;
            }
        }
        return getnotplacedplaceorderuiannotations;
    }
}
