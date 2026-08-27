package o;

import android.app.Application;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import bo.app.af$$ExternalSyntheticOutline0;
import com.ui.common.logger.UnknownUiErrorException;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public interface r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo {
    static void IconCompatParcelizer(r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo r8lambdawmxperjx66sfuc7bfhywevjhcwo, View view, String str, ddefault ddefaultVar, int i, Float f, ThrottledButton$$ExternalSyntheticLambda0 throttledButton$$ExternalSyntheticLambda0, int i2) {
        int i3 = 0;
        int i4 = (i2 & 8) != 0 ? 0 : i;
        Float f2 = (i2 & 16) != 0 ? null : f;
        View.OnClickListener checkforsystemloglevelpropertydefault = (i2 & 32) != 0 ? new checkForSystemLogLevelPropertydefault(i3) : throttledButton$$ExternalSyntheticLambda0;
        dlambda0 dlambda0Var = (dlambda0) r8lambdawmxperjx66sfuc7bfhywevjhcwo;
        Application application = dlambda0Var.serializer;
        str.getClass();
        ddefaultVar.getClass();
        r8lambdaYKFlaLPXCe5fWUKXLfXeRFbkt8Q r8lambdaykflalpxce5fwukxlfxerfbkt8q = dlambda0Var.read;
        r8lambdaykflalpxce5fwukxlfxerfbkt8q.getClass();
        List list = (List) r8lambdaykflalpxce5fwukxlfxerfbkt8q.RemoteActionCompatParcelizer.get(str);
        if (list != null) {
            Timber.RemoteActionCompatParcelizer.write(new UnknownUiErrorException(af$$ExternalSyntheticOutline0.m("Unknown UI error: Keys: ", onContentCardDismissed.IconCompatParcelizer(list, null, null, null, null, 63), " Value: ", str)));
        }
        SubcomposeLayoutStatesetRoot1 subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer = SubcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer(view, str, i4);
        Resources resources = application.getResources();
        int i5 = ddefaultVar.read();
        ThreadLocal threadLocal = setLeft.read;
        subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.serializer(resources.getColor(i5, null));
        int color = application.getResources().getColor(ddefaultVar.IconCompatParcelizer(), null);
        subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.write(color);
        subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.MediaSessionCompatQueueItem();
        Integer numSerializer = ddefaultVar.serializer();
        if (numSerializer != null) {
            subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(numSerializer.intValue(), checkforsystemloglevelpropertydefault);
            subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(color);
        }
        ((TextView) subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.read().findViewById(com.logistics.rider.glovo.R.id.snackbar_text)).setMaxLines(5);
        if (f2 != null) {
            subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.read().setElevation(f2.floatValue());
        }
        subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.RatingCompat();
    }
}
