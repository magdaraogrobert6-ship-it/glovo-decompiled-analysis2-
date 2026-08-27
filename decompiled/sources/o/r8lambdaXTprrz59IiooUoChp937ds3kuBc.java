package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaXTprrz59IiooUoChp937ds3kuBc {
    public final String MediaMetadataCompat;
    public List write = instance_delegatelambda0.write;
    public final ArrayList serializer = new ArrayList();
    public final HashSet MediaBrowserCompatMediaItem = new HashSet();
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final ArrayList read = new ArrayList();
    public final ArrayList IconCompatParcelizer = new ArrayList();

    public r8lambdaXTprrz59IiooUoChp937ds3kuBc(String str) {
        this.MediaMetadataCompat = str;
    }

    public final void write(String str, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        str.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (!this.MediaBrowserCompatMediaItem.add(str)) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Element with name '", str, "' is already registered in ");
            sbM.append(this.MediaMetadataCompat);
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        this.serializer.add(str);
        this.RemoteActionCompatParcelizer.add(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        this.read.add(instance_delegatelambda0.write);
        this.IconCompatParcelizer.add(Boolean.FALSE);
    }
}
