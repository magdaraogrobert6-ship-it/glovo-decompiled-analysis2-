package com.incognia.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m3J {
    public final SensorManager BGx;
    public final D2i mbG = new D2i();

    public final ArrayList BGx() {
        try {
            List<Sensor> sensorList = this.BGx.getSensorList(-1);
            this.mbG.getClass();
            return D2i.BGx(sensorList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public m3J(Context context) {
        this.BGx = (SensorManager) context.getSystemService("sensor");
    }
}
