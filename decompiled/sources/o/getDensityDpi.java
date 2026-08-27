package o;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface getDensityDpi {
    boolean RemoteActionCompatParcelizer() default false;

    String serializer() default "\u0000";
}
