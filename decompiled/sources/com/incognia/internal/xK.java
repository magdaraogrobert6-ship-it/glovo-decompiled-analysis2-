package com.incognia.internal;

import android.location.Location;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class xK {
    public final Ymx BGx;

    public final Gbn BGx(onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0) {
        Location location = (Location) onviewattachedtowindowlambda0.serializer;
        rwU rwu = (rwU) onviewattachedtowindowlambda0.write;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float accuracy = location.getAccuracy();
        long time = location.getTime();
        XUh xUh = XUh.BGx;
        return new Gbn(latitude, longitude, accuracy, time, XUh.BGx(xUh, 31, 0, 2) ? location.isMock() : location.isFromMockProvider(), location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.hasBearing() ? Float.valueOf(location.getBearing()) : null, location.hasSpeed() ? Float.valueOf(location.getSpeed()) : null, (XUh.BGx(xUh, 26, 0, 2) && location.hasVerticalAccuracy()) ? Float.valueOf(location.getVerticalAccuracyMeters()) : null, (XUh.BGx(xUh, 26, 0, 2) && location.hasBearingAccuracy()) ? Float.valueOf(location.getBearingAccuracyDegrees()) : null, (XUh.BGx(xUh, 26, 0, 2) && location.hasSpeedAccuracy()) ? Float.valueOf(location.getSpeedAccuracyMetersPerSecond()) : null, location.getProvider(), Boolean.valueOf(this.BGx.mbG()), rwu != null ? rwu.BGx : null, rwu != null ? rwu.mbG : null);
    }

    public xK(Ymx ymx) {
        this.BGx = ymx;
    }
}
