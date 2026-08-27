package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getEvalUserId {
    public static final Pattern IconCompatParcelizer = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern serializer = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final Annotation[][] ComponentActivity;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public resetMessageMarginslambda00 ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final Method ResultReceiver;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final Annotation[] r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public String r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public LinkedHashSet r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final Type[] r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public LazyKt__LazyJVMKt[] r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final getHoldoutVariation r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final Class r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public InAppMessageHtmlBaseView read;
    public boolean write;

    public getEvalUserId(getHoldoutVariation getholdoutvariation, Class cls, Method method) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getholdoutvariation;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = cls;
        this.ResultReceiver = method;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = method.getAnnotations();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = method.getGenericParameterTypes();
        this.ComponentActivity = method.getParameterAnnotations();
    }

    public final void write(String str, String str2, boolean z) {
        String str3 = this.MediaSessionCompatToken;
        Method method = this.ResultReceiver;
        if (str3 != null) {
            throw getKind.read(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.MediaSessionCompatToken = str;
        this.PlaybackStateCompatCustomAction = z;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = IconCompatParcelizer;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw getKind.read(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = linkedHashSet;
    }

    public static Class write(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    public final void RemoteActionCompatParcelizer(int i, Type type) {
        if (getKind.read(type)) {
            throw getKind.IconCompatParcelizer(this.ResultReceiver, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
