package o;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzbv;

/* JADX INFO: loaded from: classes2.dex */
public final class getEndCallEK5gGoQ implements getDirectionDownEK5gGoQ {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public getEndCallEK5gGoQ(Context context, int i) {
        this.serializer = i;
        if (i != 1) {
            this.IconCompatParcelizer = getButton14EK5gGoQ.serializer(context);
        } else {
            this.IconCompatParcelizer = getButton14EK5gGoQ.serializer(context);
        }
    }

    @Override // o.getDirectionDownEK5gGoQ
    public final getFunctionEK5gGoQ RemoteActionCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        int i = this.serializer;
        if (i == 0) {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
            getButton14EK5gGoQ getbutton14ek5ggoq = (getButton14EK5gGoQ) this.IconCompatParcelizer;
            if (getbutton14ek5ggoq.IconCompatParcelizer == null) {
                synchronized (getbutton14ek5ggoq) {
                    try {
                        getbutton14ek5ggoq.serializer();
                        getbutton14ek5ggoq.wait(500L);
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                getbutton14ek5ggoq.serializer();
            }
            if (System.currentTimeMillis() - getbutton14ek5ggoq.MediaDescriptionCompat > 3600000) {
                getbutton14ek5ggoq.IconCompatParcelizer = null;
            }
            String id = getbutton14ek5ggoq.IconCompatParcelizer != null ? getbutton14ek5ggoq.IconCompatParcelizer.getId() : null;
            return id == null ? getHelpEK5gGoQ.read : new getInfoEK5gGoQ(id);
        }
        if (i != 1) {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
            return (getInfoEK5gGoQ) this.IconCompatParcelizer;
        }
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
        getButton14EK5gGoQ getbutton14ek5ggoq2 = (getButton14EK5gGoQ) this.IconCompatParcelizer;
        if (getbutton14ek5ggoq2.IconCompatParcelizer == null) {
            synchronized (getbutton14ek5ggoq2) {
                try {
                    getbutton14ek5ggoq2.serializer();
                    getbutton14ek5ggoq2.wait(500L);
                } catch (InterruptedException unused2) {
                }
            }
        } else {
            getbutton14ek5ggoq2.serializer();
        }
        if (System.currentTimeMillis() - getbutton14ek5ggoq2.MediaDescriptionCompat > 3600000) {
            getbutton14ek5ggoq2.IconCompatParcelizer = null;
        }
        return new getGuideEK5gGoQ(Boolean.valueOf(!(getbutton14ek5ggoq2.IconCompatParcelizer == null ? true : getbutton14ek5ggoq2.IconCompatParcelizer.isLimitAdTrackingEnabled())));
    }

    public getEndCallEK5gGoQ(getInfoEK5gGoQ getinfoek5ggoq) {
        this.serializer = 2;
        this.IconCompatParcelizer = getinfoek5ggoq;
    }
}
