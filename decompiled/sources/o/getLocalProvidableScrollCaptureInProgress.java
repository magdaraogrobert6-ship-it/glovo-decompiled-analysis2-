package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getLocalProvidableScrollCaptureInProgress {
    public static volatile getLocalProvidableScrollCaptureInProgress RemoteActionCompatParcelizer;
    public static final getLocalProvidableScrollCaptureInProgress write = new getLocalProvidableScrollCaptureInProgress();
    public final Map IconCompatParcelizer = Collections.EMPTY_MAP;

    public final CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 RemoteActionCompatParcelizer(int i, getElevation getelevation) {
        return (CompositionLocalsKtLocalProvidableScrollCaptureInProgress1) this.IconCompatParcelizer.get(new getLocalProvidableLocaleList(i, getelevation));
    }

    public static getLocalProvidableScrollCaptureInProgress serializer() {
        getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress;
        getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress2 = RemoteActionCompatParcelizer;
        if (getlocalprovidablescrollcaptureinprogress2 != null) {
            return getlocalprovidablescrollcaptureinprogress2;
        }
        synchronized (getLocalProvidableScrollCaptureInProgress.class) {
            getlocalprovidablescrollcaptureinprogress = RemoteActionCompatParcelizer;
            if (getlocalprovidablescrollcaptureinprogress == null) {
                Class cls = getLocalPointerIconService.IconCompatParcelizer;
                getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress3 = null;
                if (cls != null) {
                    try {
                        getlocalprovidablescrollcaptureinprogress3 = (getLocalProvidableScrollCaptureInProgress) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                getlocalprovidablescrollcaptureinprogress = getlocalprovidablescrollcaptureinprogress3 != null ? getlocalprovidablescrollcaptureinprogress3 : write;
                RemoteActionCompatParcelizer = getlocalprovidablescrollcaptureinprogress;
            }
        }
        return getlocalprovidablescrollcaptureinprogress;
    }
}
