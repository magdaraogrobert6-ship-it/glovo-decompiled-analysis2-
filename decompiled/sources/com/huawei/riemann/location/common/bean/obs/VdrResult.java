package com.huawei.riemann.location.common.bean.obs;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.bean.BiasData;
import com.huawei.riemann.location.common.bean.CalibrationPara;
import com.huawei.riemann.location.common.utils.Constant;

/* JADX INFO: loaded from: classes4.dex */
public class VdrResult {
    private static final String GWI_BIAS_DATA = "biasData";
    private static final String GWI_CALIBRATION_PARA = "calibrationPara";
    private static final String GWI_IS_UPDATE_BIAS_DATA = "updateBiasData";
    private static final String GWI_RESULT_BOOT_TIME = "bt";
    private static final String GWI_RESULT_PITCH = "pitch";
    private static final String GWI_RESULT_ROLL = "roll";
    private double mLatitude = 0.0d;
    private double mLongitude = 0.0d;
    private double mAltitude = 0.0d;
    private double mBearing = 0.0d;
    private double mPitch = 0.0d;
    private double mRoll = 0.0d;
    private double mSpeed = 0.0d;
    private double mAccuracy = 0.0d;
    private double mBootTime = 0.0d;
    private boolean isNeedUpdateBias = false;
    private BiasData biasData = new BiasData();
    private CalibrationPara calibrationPara = new CalibrationPara();
    private int mErrCode = 0;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private int mErrCode = 0;
        private double mLatitude = 0.0d;
        private double mLongitude = 0.0d;
        private double mAltitude = 0.0d;
        private double mSpeed = 0.0d;
        private double mAccuracy = 0.0d;
        private double mBearing = 0.0d;
        private double mPitch = 0.0d;
        private double mRoll = 0.0d;
        private double mBootTime = 0.0d;
        private boolean isNeedUpdateBias = false;
        private BiasData biasData = new BiasData();

        public Builder withAccuracy(double d) {
            this.mAccuracy = d;
            return this;
        }

        public Builder withAltitude(double d) {
            this.mAltitude = d;
            return this;
        }

        public Builder withBearing(double d) {
            this.mBearing = d;
            return this;
        }

        public Builder withBiasData(BiasData biasData) {
            this.biasData = biasData;
            return this;
        }

        public Builder withErrCode(int i) {
            this.mErrCode = i;
            return this;
        }

        public Builder withIsNeedUpdateBias(boolean z) {
            this.isNeedUpdateBias = z;
            return this;
        }

        public Builder withLatitude(double d) {
            this.mLatitude = d;
            return this;
        }

        public Builder withLongitude(double d) {
            this.mLongitude = d;
            return this;
        }

        public Builder withPitch(double d) {
            this.mPitch = d;
            return this;
        }

        public Builder withRoll(double d) {
            this.mRoll = d;
            return this;
        }

        public Builder withSpeed(double d) {
            this.mSpeed = d;
            return this;
        }

        public Builder withTime(double d) {
            this.mBootTime = d;
            return this;
        }

        public static Builder aVdrResult() {
            return new Builder();
        }

        public VdrResult build() {
            VdrResult vdrResult = new VdrResult();
            vdrResult.mErrCode = this.mErrCode;
            vdrResult.mLatitude = this.mLatitude;
            vdrResult.mLongitude = this.mLongitude;
            vdrResult.mBearing = this.mBearing;
            vdrResult.mPitch = this.mPitch;
            vdrResult.mRoll = this.mRoll;
            vdrResult.mBootTime = this.mBootTime;
            vdrResult.mAltitude = this.mAltitude;
            vdrResult.mSpeed = this.mSpeed;
            vdrResult.mAccuracy = this.mAccuracy;
            vdrResult.isNeedUpdateBias = this.isNeedUpdateBias;
            vdrResult.biasData = this.biasData;
            return vdrResult;
        }

        private Builder() {
        }

        public Builder but() {
            return aVdrResult().withErrCode(this.mErrCode).withLatitude(this.mLatitude).withLongitude(this.mLongitude).withAltitude(this.mAltitude).withSpeed(this.mSpeed).withAccuracy(this.mAccuracy).withBearing(this.mBearing).withPitch(this.mPitch).withRoll(this.mRoll).withTime(this.mBootTime).withIsNeedUpdateBias(this.isNeedUpdateBias).withBiasData(this.biasData);
        }
    }

    public double getAccuracy() {
        return this.mAccuracy;
    }

    public double getAltitude() {
        return this.mAltitude;
    }

    public double getBearing() {
        return this.mBearing;
    }

    public BiasData getBiasData() {
        return this.biasData;
    }

    public CalibrationPara getCalibrationPara() {
        return this.calibrationPara;
    }

    public int getErrCode() {
        return this.mErrCode;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public double getPitch() {
        return this.mPitch;
    }

    public double getRoll() {
        return this.mRoll;
    }

    public double getSpeed() {
        return this.mSpeed;
    }

    public double getTime() {
        return this.mBootTime;
    }

    public boolean isNeedUpdateBias() {
        return this.isNeedUpdateBias;
    }

    public void setCalibrationPara(CalibrationPara calibrationPara) {
        this.calibrationPara = calibrationPara;
    }

    public Location toLocation() {
        Location location = new Location("gps");
        location.setTime(System.currentTimeMillis());
        location.setLongitude(getLongitude());
        location.setLatitude(getLatitude());
        location.setAltitude(getAltitude());
        location.setBearing((float) getBearing());
        location.setSpeed((float) getSpeed());
        location.setAccuracy((float) getAccuracy());
        location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
        Bundle bundle = new Bundle();
        bundle.putInt(Constant.ALGO_RESULT_ERROR_CODE, getErrCode());
        bundle.putDouble(GWI_RESULT_PITCH, getPitch());
        bundle.putDouble(GWI_RESULT_ROLL, getRoll());
        bundle.putDouble(GWI_RESULT_BOOT_TIME, getTime());
        bundle.putBoolean(GWI_IS_UPDATE_BIAS_DATA, isNeedUpdateBias());
        bundle.putString(GWI_BIAS_DATA, getBiasData().toString());
        bundle.putString(GWI_CALIBRATION_PARA, getCalibrationPara().toString());
        location.setExtras(bundle);
        return location;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VdrResult{mBearing=");
        sb.append(this.mBearing);
        sb.append(", mPitch=");
        sb.append(this.mPitch);
        sb.append(", mRoll=");
        sb.append(this.mRoll);
        sb.append(", mSpeed=");
        sb.append(this.mSpeed);
        sb.append(", mAccuracy=");
        sb.append(this.mAccuracy);
        sb.append(", mBootTime=");
        sb.append(this.mBootTime);
        sb.append(", isNeedUpdateBias=");
        sb.append(this.isNeedUpdateBias);
        sb.append(", biasData=");
        sb.append(this.biasData);
        sb.append(", calibrationPara=");
        sb.append(this.calibrationPara);
        sb.append(", mErrCode=");
        return af$$ExternalSyntheticOutline0.m(sb, this.mErrCode, '}');
    }
}
