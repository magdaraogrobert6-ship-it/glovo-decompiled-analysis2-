package o;

import android.location.Location;
import com.huawei.location.vdr.listener.IVdrLocationListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class accessonScrollCaptureImageRequest {
    public static volatile accessonScrollCaptureImageRequest RemoteActionCompatParcelizer;
    public static final byte[] serializer = new byte[0];
    public ArrayList write;

    public final void serializer(IVdrLocationListener iVdrLocationListener) {
        String str;
        synchronized (serializer) {
            if (!read()) {
                int i = 0;
                while (true) {
                    int size = this.write.size();
                    ArrayList arrayList = this.write;
                    if (i >= size) {
                        arrayList.add(iVdrLocationListener);
                        str = "new add uuid here, uuid is: " + iVdrLocationListener.getUuid();
                        break;
                    }
                    if (((IVdrLocationListener) arrayList.get(i)).getUuid().equals(iVdrLocationListener.getUuid())) {
                        this.write.set(i, iVdrLocationListener);
                        str = "replace uuid here, uuid is: " + iVdrLocationListener.getUuid();
                        break;
                    }
                    i++;
                }
            } else {
                this.write.add(iVdrLocationListener);
                str = "vdrLocationListenerList is empty, add uuid here, uuid is: " + iVdrLocationListener.getUuid();
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrLocationListenerManager", str);
        }
    }

    public final void write(IVdrLocationListener iVdrLocationListener) {
        synchronized (serializer) {
            if (iVdrLocationListener != null) {
                if (this.write == null) {
                    this.write = new ArrayList();
                }
                serializer(iVdrLocationListener);
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrLocationListenerManager", "add vdrLocationListener to vdrLocationListenerList, size is : " + this.write.size());
            }
        }
    }

    public final boolean read() {
        boolean z;
        synchronized (serializer) {
            ArrayList arrayList = this.write;
            z = arrayList == null || arrayList.size() == 0;
        }
        return z;
    }

    public static accessonScrollCaptureImageRequest write() {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (serializer) {
                if (RemoteActionCompatParcelizer == null) {
                    accessonScrollCaptureImageRequest accessonscrollcaptureimagerequest = new accessonScrollCaptureImageRequest();
                    accessonscrollcaptureimagerequest.write = new ArrayList(10);
                    RemoteActionCompatParcelizer = accessonscrollcaptureimagerequest;
                }
            }
        }
        return RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(Location location) {
        synchronized (serializer) {
            ArrayList arrayList = this.write;
            if (arrayList != null && arrayList.size() != 0) {
                for (int i = 0; i < this.write.size(); i++) {
                    ((IVdrLocationListener) this.write.get(i)).onVdrLocationChanged(location);
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        synchronized (serializer) {
            if (str != null) {
                ArrayList arrayList = this.write;
                if (arrayList != null && arrayList.size() != 0) {
                    for (IVdrLocationListener iVdrLocationListener : this.write) {
                        if (iVdrLocationListener.getUuid().equals(str)) {
                            this.write.remove(iVdrLocationListener);
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrLocationListenerManager", "remove vdrLocationListener from vdrLocationListenerList, size is : " + this.write.size() + ", uuid is: " + str);
                            break;
                        }
                    }
                }
            }
        }
    }
}
