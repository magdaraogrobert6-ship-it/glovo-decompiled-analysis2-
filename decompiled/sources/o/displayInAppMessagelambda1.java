package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class displayInAppMessagelambda1 {
    public static final displayInAppMessagelambda10 IconCompatParcelizer;

    public static displayInAppMessagelambda0 IconCompatParcelizer(registerInAppMessageManagerlambda40 registerinappmessagemanagerlambda40, registerInAppMessageManagerlambda40 registerinappmessagemanagerlambda41) {
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = serializer(Map.class);
        List listAsList = Arrays.asList(registerinappmessagemanagerlambda40, registerinappmessagemanagerlambda41);
        IconCompatParcelizer.getClass();
        return new displayInAppMessagelambda0(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, listAsList, false);
    }

    public static r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk serializer(Class cls) {
        IconCompatParcelizer.getClass();
        return new r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk(cls);
    }

    static {
        displayInAppMessagelambda10 displayinappmessagelambda10;
        try {
            displayinappmessagelambda10 = (displayInAppMessagelambda10) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            displayinappmessagelambda10 = null;
        }
        if (displayinappmessagelambda10 == null) {
            displayinappmessagelambda10 = new displayInAppMessagelambda10();
        }
        IconCompatParcelizer = displayinappmessagelambda10;
    }

    public static displayInAppMessagelambda0 IconCompatParcelizer(Class cls) {
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = serializer(cls);
        List list = Collections.EMPTY_LIST;
        IconCompatParcelizer.getClass();
        return new displayInAppMessagelambda0(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, list, false);
    }
}
