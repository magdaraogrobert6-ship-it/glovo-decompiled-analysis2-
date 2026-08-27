package o;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetF2cp {
    public static volatile io.sentry.transport.PlaybackStateCompat RemoteActionCompatParcelizer;
    public final access500 IconCompatParcelizer;
    public final accessgetMediaPlaycp read;
    public final accessgetMediaPlaycp serializer;
    public final accessgetHelpcp write;

    public final accessgetF12cp RemoteActionCompatParcelizer(accessgetButton11cp accessgetbutton11cp) {
        byte[] bytes;
        Set setUnmodifiableSet = accessgetbutton11cp instanceof accessgetButton11cp ? Collections.unmodifiableSet(accessgetButton11cp.serializer) : Collections.singleton(new accessgetButton10cp("proto"));
        accessgetEqualscp accessgetequalscpWrite = accessgetEightcp.write();
        accessgetbutton11cp.getClass();
        accessgetequalscpWrite.write = "cct";
        String str = accessgetbutton11cp.MediaSessionCompatQueueItem;
        String str2 = accessgetbutton11cp.read;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = af$$ExternalSyntheticOutline0.m("1$", str, "\\", str2).getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
        }
        accessgetequalscpWrite.IconCompatParcelizer = bytes;
        return new accessgetF12cp(setUnmodifiableSet, accessgetequalscpWrite.RemoteActionCompatParcelizer(), this);
    }

    public accessgetF2cp(accessgetMediaPlaycp accessgetmediaplaycp, accessgetMediaPlaycp accessgetmediaplaycp2, accessgetHelpcp accessgethelpcp, access500 access500Var, ImageLoader$Builder imageLoader$Builder) {
        this.read = accessgetmediaplaycp;
        this.serializer = accessgetmediaplaycp2;
        this.write = accessgethelpcp;
        this.IconCompatParcelizer = access500Var;
        ((Executor) imageLoader$Builder.RemoteActionCompatParcelizer).execute(new Sentry$$ExternalSyntheticLambda5(6, imageLoader$Builder));
    }

    public static void RemoteActionCompatParcelizer(Context context) {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (accessgetF2cp.class) {
                if (RemoteActionCompatParcelizer == null) {
                    getFocusEK5gGoQ getfocusek5ggoq = new getFocusEK5gGoQ();
                    context.getClass();
                    getfocusek5ggoq.write = context;
                    RemoteActionCompatParcelizer = getfocusek5ggoq.IconCompatParcelizer();
                }
            }
        }
    }

    public static accessgetF2cp read() {
        io.sentry.transport.PlaybackStateCompat playbackStateCompat = RemoteActionCompatParcelizer;
        if (playbackStateCompat != null) {
            return (accessgetF2cp) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) playbackStateCompat.RatingCompat).write();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Not initialized!");
        return null;
    }
}
