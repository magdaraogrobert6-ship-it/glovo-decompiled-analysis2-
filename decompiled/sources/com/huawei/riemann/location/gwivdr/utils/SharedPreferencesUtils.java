package com.huawei.riemann.location.gwivdr.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.riemann.location.common.bean.BiasData;
import com.huawei.riemann.location.common.bean.CalibrationPara;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class SharedPreferencesUtils {
    private static final String KEY_CN0_MEAN_TH = "cn0MeanTh";
    private static final String KEY_GYRO_BIAS_X = "gyroBiasX";
    private static final String KEY_GYRO_BIAS_Y = "gyroBiasY";
    private static final String KEY_GYRO_BIAS_Z = "gyroBiasZ";
    private static final String KEY_G_NORM = "gNorm";
    private static final String KEY_INTERP_BUFFER_SIZE = "interpBufferSize";
    private static final String KEY_PITCH_BIAS = "pitchBias";
    private static final String KEY_RESERVED_PARA1 = "reservedPara1";
    private static final String KEY_RESERVED_PARA2 = "reservedPara2";
    private static final String KEY_ROLL_BIAS = "rollBias";
    private static final String KEY_SYNC_BUFFER_SIZE = "syncBufferSize";
    private static final String KEY_WSS_SCALE_FACTOR = "wssScaleFactor";
    private static final String KEY_YAW_BIAS = "yawBias";
    private static final String PREFERENCES_FILE_NAME = "Gwi-loc-sp";
    private static final String TAG = "SharedPreferencesUtils";
    private static SharedPreferences sp;
    private static volatile SharedPreferencesUtils spUtils;

    public static void release() {
        spUtils = null;
        sp = null;
    }

    public void storeBiasData(BiasData biasData) {
        String str;
        if (biasData == null) {
            str = "invalid BiasData, store failed!";
        } else {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "BiasData store to db: " + biasData);
            SharedPreferences.Editor editorEdit = sp.edit();
            editorEdit.putString(KEY_GYRO_BIAS_X, String.valueOf(biasData.getBiasX()));
            editorEdit.putString(KEY_GYRO_BIAS_Y, String.valueOf(biasData.getBiasY()));
            editorEdit.putString(KEY_GYRO_BIAS_Z, String.valueOf(biasData.getBiasZ()));
            editorEdit.putString(KEY_G_NORM, String.valueOf(biasData.getGNorm()));
            if (editorEdit.commit()) {
                return;
            }
            WrappedCompositionsetContent1211.read(TAG, "biasData store failed! try again:");
            if (editorEdit.commit()) {
                return;
            } else {
                str = "biasData store failed again!";
            }
        }
        WrappedCompositionsetContent1211.read(TAG, str);
    }

    public void storeCalibrationPara(CalibrationPara calibrationPara) {
        String str;
        if (calibrationPara == null) {
            str = "invalid calibration Para, store failed!";
        } else {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "Calibration Para store to db: " + calibrationPara);
            SharedPreferences.Editor editorEdit = sp.edit();
            editorEdit.putString(KEY_WSS_SCALE_FACTOR, String.valueOf(calibrationPara.getWssScaleFactor()));
            editorEdit.putString(KEY_ROLL_BIAS, String.valueOf(calibrationPara.getRollBias()));
            editorEdit.putString(KEY_PITCH_BIAS, String.valueOf(calibrationPara.getPitchBias()));
            editorEdit.putString(KEY_YAW_BIAS, String.valueOf(calibrationPara.getYawBias()));
            editorEdit.putString(KEY_CN0_MEAN_TH, String.valueOf(calibrationPara.getCn0MeanTh()));
            editorEdit.putString(KEY_INTERP_BUFFER_SIZE, String.valueOf(calibrationPara.getInterpBufferSize()));
            editorEdit.putString(KEY_SYNC_BUFFER_SIZE, String.valueOf(calibrationPara.getSyncBufferSize()));
            editorEdit.putString(KEY_RESERVED_PARA1, String.valueOf(calibrationPara.getReservedPara1()));
            editorEdit.putString(KEY_RESERVED_PARA2, String.valueOf(calibrationPara.getReservedPara2()));
            if (editorEdit.commit()) {
                return;
            }
            WrappedCompositionsetContent1211.read(TAG, "Calibration Para store failed! try again:");
            if (editorEdit.commit()) {
                return;
            } else {
                str = "Calibration Para store failed again!";
            }
        }
        WrappedCompositionsetContent1211.read(TAG, str);
    }

    public static SharedPreferencesUtils getInstance(Context context) {
        if (spUtils == null) {
            synchronized (SharedPreferencesUtils.class) {
                if (spUtils == null) {
                    spUtils = new SharedPreferencesUtils();
                    sp = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
                }
            }
        }
        return spUtils;
    }

    public BiasData getBiasData() {
        StringBuilder sb;
        BiasData biasData = new BiasData();
        try {
            biasData.setBiasX(Double.parseDouble(sp.getString(KEY_GYRO_BIAS_X, "0.0")));
            biasData.setBiasY(Double.parseDouble(sp.getString(KEY_GYRO_BIAS_Y, "0.0")));
            biasData.setBiasZ(Double.parseDouble(sp.getString(KEY_GYRO_BIAS_Z, "0.0")));
            biasData.setgNorm(Double.parseDouble(sp.getString(KEY_G_NORM, "9.80")));
        } catch (ClassCastException e) {
            e = e;
            sb = new StringBuilder("get BiasData from sp error: ");
            sb.append(e.getMessage());
            WrappedCompositionsetContent1211.read(TAG, sb.toString());
        } catch (NumberFormatException e2) {
            e = e2;
            sb = new StringBuilder("parse double format error: ");
            sb.append(e.getMessage());
            WrappedCompositionsetContent1211.read(TAG, sb.toString());
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "BiasData read from db: " + biasData);
        return biasData;
    }

    public CalibrationPara getCalibrationPara() {
        StringBuilder sb;
        CalibrationPara calibrationPara = new CalibrationPara();
        try {
            calibrationPara.setWssScaleFactor(Double.parseDouble(sp.getString(KEY_WSS_SCALE_FACTOR, "1.0")));
            calibrationPara.setRollBias(Double.parseDouble(sp.getString(KEY_ROLL_BIAS, "0.0")));
            calibrationPara.setPitchBias(Double.parseDouble(sp.getString(KEY_PITCH_BIAS, "0.0")));
            calibrationPara.setYawBias(Double.parseDouble(sp.getString(KEY_YAW_BIAS, "0.0")));
            calibrationPara.setCn0MeanTh(Double.parseDouble(sp.getString(KEY_CN0_MEAN_TH, "20.0")));
            calibrationPara.setInterpBufferSize(Integer.parseInt(sp.getString(KEY_INTERP_BUFFER_SIZE, "8")));
            calibrationPara.setSyncBufferSize(Integer.parseInt(sp.getString(KEY_SYNC_BUFFER_SIZE, "15")));
            calibrationPara.setReservedPara1(Double.parseDouble(sp.getString(KEY_RESERVED_PARA1, "0.0")));
            calibrationPara.setReservedPara2(Double.parseDouble(sp.getString(KEY_RESERVED_PARA2, "0.0")));
        } catch (ClassCastException e) {
            e = e;
            sb = new StringBuilder("get Calibration Para from sp error: ");
            sb.append(e.getMessage());
            WrappedCompositionsetContent1211.read(TAG, sb.toString());
        } catch (NumberFormatException e2) {
            e = e2;
            sb = new StringBuilder("parse double format error: ");
            sb.append(e.getMessage());
            WrappedCompositionsetContent1211.read(TAG, sb.toString());
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "Calibration Para read from db: " + calibrationPara);
        return calibrationPara;
    }
}
