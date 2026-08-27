package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TextAnnouncementContentCardViewViewHolder {
    String IconCompatParcelizer() default "";

    String RemoteActionCompatParcelizer() default "";

    int read() default 2;

    String serializer() default "";

    int[] write() default {};
}
