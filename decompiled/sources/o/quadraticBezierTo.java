package o;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public abstract class quadraticBezierTo {
    public static addInAppMessageViewToViewGrouplambda20 write() {
        addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20 = addInAppMessageViewToViewGrouplambda20.IconCompatParcelizer;
        addinappmessageviewtoviewgrouplambda20.getClass();
        return addinappmessageviewtoviewgrouplambda20;
    }

    public static resumeWebviewIfNecessarylambda0 serializer(opN5in7k0 opn5in7k0) {
        opn5in7k0.getClass();
        return resetAfterInAppMessageCloselambda2.write(opn5in7k0, new accessgetBlendMode0nO6VwUjd(15));
    }

    public static String serializer(androidx.navigation.internal.NavContext navContext, int i) {
        navContext.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = navContext.IconCompatParcelizer;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }
}
