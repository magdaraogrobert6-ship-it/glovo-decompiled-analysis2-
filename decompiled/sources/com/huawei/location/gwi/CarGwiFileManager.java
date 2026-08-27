package com.huawei.location.gwi;

import androidx.camera.core.ImageCapture$Metadata;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.huawei.location.gwi.listener.ICarGwiSoLoadListener;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.wisesecurity.ucs_credential.x;
import java.io.File;
import o.ComposeScrollCaptureCallbackonScrollCaptureImageRequest3;
import o.WindowInfoImplCompanion;
import o.WrappedCompositionsetContent1211;
import o.getOnCopyRequested;
import o.getOrder;
import o.onCreateActionMode;

/* JADX INFO: loaded from: classes2.dex */
public class CarGwiFileManager {
    private static final int RETRY_COUNT_THRESHOLD = 3;
    private static final String TAG = "CarGwiFileManager";
    private static final String THREAD_NAME = "Location-CarGwiFile";
    private ICarGwiSoLoadListener gwiSoLoadListener;
    private getOrder locationPreferences;
    private int retryCount = 0;
    private String versionNumSp;

    private boolean fileIntegrityCheck(File file, String str) {
        return ComposeScrollCaptureCallbackonScrollCaptureImageRequest3.read(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkGwiSoFile() {
        synchronized (CarGwiFileManager.class) {
            getOrder getorder = new getOrder(CarGwiSoFileConstant.SP_CAR_GWI_FILE_NAME);
            this.locationPreferences = getorder;
            long jWrite = getorder.write(CarGwiSoFileConstant.SP_CAR_GWI_LAST_SAVE_TIME);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.versionNumSp = this.locationPreferences.RemoteActionCompatParcelizer(CarGwiSoFileConstant.SP_CAR_GWI_VERSION_NUM);
            if (!isFileExist() || jCurrentTimeMillis - jWrite >= CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "libGwi file is not exists or determine whether the libGwi file needs to be updated ");
                DownloadFileParam downloadFileParam = new DownloadFileParam();
                downloadFileParam.setFileName(CarGwiSoFileConstant.CAR_GWI_FILE_NAME);
                downloadFileParam.setSaveFilePath(CarGwiSoFileConstant.FILE_PATH);
                downloadFileParam.setServiceType(CarGwiSoFileConstant.SERVICE_TYPE);
                downloadFileParam.setSubType("libCarGwiVdrV5");
                new x(downloadFileParam, 10, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(24, this)).IconCompatParcelizer(new getOnCopyRequested() { // from class: com.huawei.location.gwi.CarGwiFileManager.2
                    @Override // o.getOnCopyRequested
                    public void onSuccess(DownLoadFileBean downLoadFileBean, File file) {
                        if (downLoadFileBean == null) {
                            CarGwiFileManager.this.handleLoadResult(false);
                        } else {
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(CarGwiFileManager.TAG, "libCarGwi download Success");
                            CarGwiFileManager.this.downLoadSuccessDeal(file, downLoadFileBean.getFileAccessInfo().getFileSha256(), downLoadFileBean.getFileAccessInfo().getVersion());
                        }
                    }

                    @Override // o.getOnCopyRequested
                    public void onFail(int i, String str) {
                        CarGwiFileManager carGwiFileManager = CarGwiFileManager.this;
                        if (i == 10005) {
                            carGwiFileManager.locationPreferences.write(CarGwiSoFileConstant.SP_CAR_GWI_LAST_SAVE_TIME, System.currentTimeMillis());
                            CarGwiFileManager.this.handleLoadResult(true);
                        } else {
                            carGwiFileManager.handleLoadResult(false);
                        }
                        WrappedCompositionsetContent1211.read(CarGwiFileManager.TAG, "download error errorCode:" + i + " errorDesc:" + str);
                    }
                });
            } else {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "libGwi file is exists and is not need update");
                handleLoadResult(true);
            }
        }
    }

    private boolean deleteFile(String str) {
        try {
            return new File(str).delete();
        } catch (Exception e) {
            WrappedCompositionsetContent1211.read(TAG, "deleteFile error: " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downLoadSuccessDeal(File file, String str, String str2) {
        synchronized (CarGwiFileManager.class) {
            boolean zFileIntegrityCheck = fileIntegrityCheck(file, str);
            StringBuilder sb = new StringBuilder();
            String str3 = CarGwiSoFileConstant.FILE_PATH;
            sb.append(str3);
            sb.append(File.separator);
            sb.append(CarGwiSoFileConstant.CAR_GWI_FILE_NAME);
            String string = sb.toString();
            if (!zFileIntegrityCheck) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "file is not integrity");
                deleteFile(string);
            } else if (new ImageCapture$Metadata(6).serializer(string, str3)) {
                handleLoadResult(true);
                this.locationPreferences.IconCompatParcelizer(CarGwiSoFileConstant.SP_CAR_GWI_VERSION_NUM, str2);
                this.locationPreferences.write(CarGwiSoFileConstant.SP_CAR_GWI_LAST_SAVE_TIME, System.currentTimeMillis());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "CarGwi unzip plugin success!");
                deleteFile(string);
            } else {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "unzip file fail!");
                deleteFile(string);
            }
            handleLoadResult(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleLoadResult(boolean z) {
        int i;
        if (!z && (i = this.retryCount) < 3) {
            this.retryCount = i + 1;
            WindowInfoImplCompanion.serializer(this.retryCount, TAG, new StringBuilder("handleLoadResult fail, retryCount: "));
            check();
        } else {
            ICarGwiSoLoadListener iCarGwiSoLoadListener = this.gwiSoLoadListener;
            if (iCarGwiSoLoadListener != null) {
                iCarGwiSoLoadListener.handleLoadResult(isFileExist());
            }
        }
    }

    public void checkGwiSoService(ICarGwiSoLoadListener iCarGwiSoLoadListener) {
        this.gwiSoLoadListener = iCarGwiSoLoadListener;
        check();
    }

    private void check() {
        onCreateActionMode.write.IconCompatParcelizer(new Runnable() { // from class: com.huawei.location.gwi.CarGwiFileManager.1
            @Override // java.lang.Runnable
            public void run() {
                Thread.currentThread().setName(CarGwiFileManager.THREAD_NAME);
                try {
                    CarGwiFileManager.this.checkGwiSoFile();
                } catch (Exception unused) {
                    WrappedCompositionsetContent1211.read(CarGwiFileManager.TAG, "checkGwiSoFile error.");
                    CarGwiFileManager.this.handleLoadResult(false);
                }
            }
        });
    }

    public static boolean isFileExist() {
        try {
            File file = new File(CarGwiSoFileConstant.SO_PATH);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "the file isFileExist is " + file.exists());
            return file.exists();
        } catch (Exception e) {
            WrappedCompositionsetContent1211.read(TAG, "isFileExist error: " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$checkGwiSoFile$0(DownLoadFileBean downLoadFileBean) {
        return !isFileExist() || isVersionAvailable(downLoadFileBean.getFileAccessInfo().getVersion(), this.versionNumSp);
    }

    private boolean isVersionAvailable(String str, String str2) {
        if (str != null && str2 != null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "versionNumFromServer is: " + str + ", versionNumSp is: " + str2);
            if (str.compareTo(str2) > 0) {
                return true;
            }
        }
        return false;
    }
}
