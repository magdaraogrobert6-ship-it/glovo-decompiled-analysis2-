package com.sentiance.sdk.ondevice.api;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class SensorDataChunk {
    private final long[] mTimestamps;
    private final float[] mXValues;
    private final float[] mYValues;
    private final float[] mZValues;

    public long[] getTimestamps() {
        return this.mTimestamps;
    }

    public float[] getXValues() {
        return this.mXValues;
    }

    public float[] getYValues() {
        return this.mYValues;
    }

    public float[] getZValues() {
        return this.mZValues;
    }

    public int getSize() {
        return this.mTimestamps.length;
    }

    public SensorDataChunk(float[] fArr, float[] fArr2, float[] fArr3, long[] jArr) {
        this.mXValues = fArr;
        this.mYValues = fArr2;
        this.mZValues = fArr3;
        this.mTimestamps = jArr;
    }
}
