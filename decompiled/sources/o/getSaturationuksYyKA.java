package o;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class getSaturationuksYyKA implements drawRectnJ9OG0default {
    public final accessgetApparentToRealOffsetnOccac RemoteActionCompatParcelizer;
    public final /* synthetic */ com.bumptech.glide.RequestManager read;

    @Override // o.drawRectnJ9OG0default
    public final void write(boolean z) {
        if (z) {
            synchronized (this.read) {
                accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = this.RemoteActionCompatParcelizer;
                for (rotateRg1IO4c rotaterg1io4c : Fill.read((Set) accessgetapparenttorealoffsetnoccac.serializer)) {
                    if (!rotaterg1io4c.MediaBrowserCompatMediaItem() && !rotaterg1io4c.serializer()) {
                        rotaterg1io4c.write();
                        if (accessgetapparenttorealoffsetnoccac.read) {
                            ((HashSet) accessgetapparenttorealoffsetnoccac.write).add(rotaterg1io4c);
                        } else {
                            rotaterg1io4c.RemoteActionCompatParcelizer();
                        }
                    }
                }
            }
        }
    }

    public getSaturationuksYyKA(com.bumptech.glide.RequestManager requestManager, accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac) {
        this.read = requestManager;
        this.RemoteActionCompatParcelizer = accessgetapparenttorealoffsetnoccac;
    }
}
