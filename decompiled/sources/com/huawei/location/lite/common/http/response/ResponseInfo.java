package com.huawei.location.lite.common.http.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.common.zzq;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import o.WrappedCompositionsetContent1211;
import o.onPrepareActionMode;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseInfo implements Parcelable {
    public static final Parcelable.Creator<ResponseInfo> CREATOR = new zzq(27);
    public static final int ERROR_EXCEPTION_LEVEL = 100;
    public static final int FAILURE_EXCEPTION_LEVEL = 101;
    private static final int MAX_TRANSFER_DATA_LIMIT = 468992;
    private static final String TAG = "ResponseInfo";
    private String bigDataPath;
    private int errorCode;
    private int errorLevel;
    private String msg;
    private byte[] responseBytes;
    private String responseString;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getErrorLevel() {
        return this.errorLevel;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorLevel(int i) {
        this.errorLevel = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    private void readFromSd() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.bigDataPath), StandardCharsets.UTF_8));
            try {
                StringBuilder sb = new StringBuilder("");
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        new File(this.bigDataPath).delete();
                        this.responseString = sb.toString();
                        bufferedReader.close();
                        return;
                    }
                    sb.append(line);
                    WrappedCompositionsetContent1211.read("Fly", "readFromSd stream exception");
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("Fly", "readFromSd stream exception");
        }
    }

    private File saveToSd(byte[] bArr) {
        File file = new File(this.bigDataPath);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                fileOutputStream.flush();
                fileOutputStream.close();
                return file;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("Fly", "saveToSd write exception");
            return file;
        }
    }

    public String getResponseString() {
        if (!TextUtils.isEmpty(this.bigDataPath)) {
            readFromSd();
        }
        return this.responseString;
    }

    public void setResponseBytes(byte[] bArr) {
        if (bArr != null) {
            this.responseBytes = (byte[]) bArr.clone();
        }
    }

    public void setResponseString(String str) {
        if ((Integer.parseInt("100") == 200 || Integer.parseInt("100") == 300) && !TextUtils.isEmpty(str)) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            if (bytes.length >= MAX_TRANSFER_DATA_LIMIT) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "response data over MAX_TRANSFER_DATA_LIMIT");
                StringBuilder sb = new StringBuilder();
                sb.append(onPrepareActionMode.IconCompatParcelizer(placeAtf8xVGno.read()));
                this.bigDataPath = ff$$ExternalSyntheticOutline0.m(sb, File.separator, "http_parcelable_data.temp");
                saveToSd(bytes);
                return;
            }
        }
        this.responseString = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorLevel);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.msg);
        parcel.writeString(this.responseString);
        parcel.writeByteArray(this.responseBytes);
        parcel.writeString(this.bigDataPath);
    }

    public ResponseInfo(Parcel parcel) {
        this.errorLevel = parcel.readInt();
        this.errorCode = parcel.readInt();
        this.msg = parcel.readString();
        this.responseString = parcel.readString();
        this.responseBytes = parcel.createByteArray();
        this.bigDataPath = parcel.readString();
    }

    public byte[] getResponseBytes() {
        byte[] bArr = this.responseBytes;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }

    public ResponseInfo() {
    }
}
