package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "WaypointInterpolator")
public final class getHeaderTextColor {
    private final parseLonglambda0 IconCompatParcelizer;

    public final handleLogClickdefault RemoteActionCompatParcelizer(long j, onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0) {
        Object getheader;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = onviewattachedtowindowlambda0;
        Object obj = onviewattachedtowindowlambda1.serializer;
        long jMediaDescriptionCompat = ((handleLogClickdefault) obj).MediaDescriptionCompat();
        Object obj2 = onviewattachedtowindowlambda1.write;
        if (jMediaDescriptionCompat > ((handleLogClickdefault) obj2).MediaDescriptionCompat()) {
            onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(obj2, obj);
        }
        handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) onviewattachedtowindowlambda1.serializer;
        handleLogClickdefault handlelogclickdefault2 = (handleLogClickdefault) onviewattachedtowindowlambda1.write;
        if (handlelogclickdefault.serializer(handlelogclickdefault2) > 400.0f) {
            getheader = getHeaderTextAlign.read;
        } else {
            double dMediaDescriptionCompat = (j - handlelogclickdefault.MediaDescriptionCompat()) / (handlelogclickdefault2.MediaDescriptionCompat() - handlelogclickdefault.MediaDescriptionCompat());
            if (dMediaDescriptionCompat < 0.0d || dMediaDescriptionCompat > 1.0d) {
                getheader = getMessageButtons.RemoteActionCompatParcelizer;
            } else {
                getheader = new getHeader(new handleLogClickdefault(j, ((handlelogclickdefault2.RemoteActionCompatParcelizer() - handlelogclickdefault.RemoteActionCompatParcelizer()) * dMediaDescriptionCompat) + handlelogclickdefault.RemoteActionCompatParcelizer(), ((handlelogclickdefault2.serializer() - handlelogclickdefault.serializer()) * dMediaDescriptionCompat) + handlelogclickdefault.serializer(), null, null, null, true));
            }
        }
        if (getheader instanceof getHeader) {
            return ((getHeader) getheader).IconCompatParcelizer();
        }
        boolean z = getheader instanceof getHeaderTextAlign;
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        if (z) {
            parselonglambda0.IconCompatParcelizer("Cannot find interpolated waypoint: distance between input waypoints is too large.", new Object[0]);
            return null;
        }
        if (getheader instanceof getMessageButtons) {
            parselonglambda0.IconCompatParcelizer("Cannot find interpolated waypoint: target timestamp is out of interpolation bounds.", new Object[0]);
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public getHeaderTextColor(parseLonglambda0 parselonglambda0) {
        parselonglambda0.getClass();
        this.IconCompatParcelizer = parselonglambda0;
    }
}
