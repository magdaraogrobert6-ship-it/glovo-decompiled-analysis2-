package o;

import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetF3cp {
    public final String IconCompatParcelizer;
    public final accessgetBrightnessDowncp RemoteActionCompatParcelizer;
    public final accessgetEightcp read;
    public final accessgetF2cp serializer;
    public final accessgetButton10cp write;

    public accessgetF3cp(accessgetEightcp accessgeteightcp, String str, accessgetButton10cp accessgetbutton10cp, accessgetBrightnessDowncp accessgetbrightnessdowncp, accessgetF2cp accessgetf2cp) {
        this.read = accessgeteightcp;
        this.IconCompatParcelizer = str;
        this.write = accessgetbutton10cp;
        this.RemoteActionCompatParcelizer = accessgetbrightnessdowncp;
        this.serializer = accessgetf2cp;
    }

    public final void read(accessgetBackspacecp accessgetbackspacecp, accessgetButton12cp accessgetbutton12cp) {
        String str = this.IconCompatParcelizer;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null transportName");
            return;
        }
        accessgetBrightnessDowncp accessgetbrightnessdowncp = this.RemoteActionCompatParcelizer;
        if (accessgetbrightnessdowncp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null transformer");
            return;
        }
        accessgetF2cp accessgetf2cp = this.serializer;
        accessgetHelpcp accessgethelpcp = accessgetf2cp.write;
        accessgetEightcp accessgeteightcpWrite = this.read.write(accessgetbackspacecp.IconCompatParcelizer);
        accessgetEndCallcp accessgetendcallcp = new accessgetEndCallcp();
        accessgetendcallcp.write = new HashMap();
        accessgetendcallcp.IconCompatParcelizer = Long.valueOf(accessgetf2cp.read.IconCompatParcelizer());
        accessgetendcallcp.MediaDescriptionCompat = Long.valueOf(accessgetf2cp.serializer.IconCompatParcelizer());
        accessgetendcallcp.MediaMetadataCompat = str;
        accessgetendcallcp.read = new accessgetF1cp(this.write, (byte[]) accessgetbrightnessdowncp.apply(accessgetbackspacecp.serializer));
        accessgetendcallcp.RemoteActionCompatParcelizer = null;
        accessgetButton1cp accessgetbutton1cp = accessgetbackspacecp.read;
        if (accessgetbutton1cp != null) {
            accessgetendcallcp.MediaSessionCompatQueueItem = accessgetbutton1cp.RemoteActionCompatParcelizer();
        }
        accessgethelpcp.read.execute(new Schedulers$$ExternalSyntheticLambda1(accessgethelpcp, accessgeteightcpWrite, accessgetbutton12cp, accessgetendcallcp.read(), 1));
    }
}
