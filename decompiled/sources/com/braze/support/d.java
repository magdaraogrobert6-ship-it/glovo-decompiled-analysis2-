package com.braze.support;

import bo.app.d4$$ExternalSyntheticLambda6;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public static final EnumSet a(Class cls, Set set) {
        cls.getClass();
        set.getClass();
        EnumSet enumSetNoneOf = EnumSet.noneOf(cls);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                enumSetNoneOf.add(Enum.valueOf(cls, upperCase));
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 23), 4, (Object) null);
            }
        }
        enumSetNoneOf.getClass();
        return enumSetNoneOf;
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to create valid enum from string: ", str);
    }

    public static final Set a(EnumSet enumSet) {
        enumSet.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(enumSet, 10));
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
    }
}
