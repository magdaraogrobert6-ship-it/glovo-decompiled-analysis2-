package com.huawei.location.gwi.listener;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
public class CarVdrListenerManager {
    private static final byte[] SYNC_LOCK = new byte[0];
    private static final String TAG = "CarVdrListenerManager";
    private static volatile CarVdrListenerManager instance;
    private List<ICarVdrLocationListener> carVdrListenerList = new ArrayList(10);

    public void addVdrLocationListener(ICarVdrLocationListener iCarVdrLocationListener) {
        synchronized (SYNC_LOCK) {
            if (iCarVdrLocationListener != null) {
                if (this.carVdrListenerList == null) {
                    this.carVdrListenerList = new ArrayList();
                }
                if (!this.carVdrListenerList.contains(iCarVdrLocationListener)) {
                    this.carVdrListenerList.add(iCarVdrLocationListener);
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "add vdrLocationListener to carVdrListenerList, size is : " + this.carVdrListenerList.size());
            }
        }
    }

    public void clearVdrLocationListener() {
        synchronized (SYNC_LOCK) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "clearVdrLocationListener");
            this.carVdrListenerList = null;
        }
    }

    public void onVdrError(int i, String str) {
        synchronized (SYNC_LOCK) {
            try {
                try {
                    List<ICarVdrLocationListener> list = this.carVdrListenerList;
                    if (list != null && list.size() != 0) {
                        for (int i2 = 0; i2 < this.carVdrListenerList.size(); i2++) {
                            this.carVdrListenerList.get(i2).onVdrError(i, str);
                        }
                    }
                } catch (Exception e) {
                    WrappedCompositionsetContent1211.read(TAG, "on vdr error exception, error: " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onVdrLocationChanged(Location location) {
        synchronized (SYNC_LOCK) {
            try {
                try {
                    List<ICarVdrLocationListener> list = this.carVdrListenerList;
                    if (list != null && list.size() != 0) {
                        for (int i = 0; i < this.carVdrListenerList.size(); i++) {
                            this.carVdrListenerList.get(i).onLocationChanged(new Location(location));
                        }
                    }
                } catch (Exception e) {
                    WrappedCompositionsetContent1211.read(TAG, "onVdrLocationChanged exception, error: " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeVdrLocationListener(ICarVdrLocationListener iCarVdrLocationListener) {
        synchronized (SYNC_LOCK) {
            if (iCarVdrLocationListener != null) {
                List<ICarVdrLocationListener> list = this.carVdrListenerList;
                if (list != null && list.size() != 0) {
                    for (ICarVdrLocationListener iCarVdrLocationListener2 : this.carVdrListenerList) {
                        if (iCarVdrLocationListener2.equals(iCarVdrLocationListener)) {
                            this.carVdrListenerList.remove(iCarVdrLocationListener2);
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "remove vdrLocationListener from carVdrListenerList, size is : " + this.carVdrListenerList.size());
                            break;
                        }
                    }
                }
            }
        }
    }

    public static CarVdrListenerManager getInstance() {
        if (instance == null) {
            synchronized (SYNC_LOCK) {
                if (instance == null) {
                    instance = new CarVdrListenerManager();
                }
            }
        }
        return instance;
    }
}
