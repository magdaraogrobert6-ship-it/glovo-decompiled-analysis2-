package com.mapbox.search.record;

import android.app.Application;
import com.huawei.agconnect.config.impl.m;
import com.mapbox.common.CommonSdkLog;
import com.mapbox.search.utils.file.InternalFileSystem;
import com.mapbox.search.utils.serialization.RecordsSerializer;
import com.mapbox.search.utils.serialization.RecordsSerializer$deserialize$2;
import io.sentry.SentryUUID;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;
import o.ensureSubscribedToInAppMessageEvents;
import o.getActiveFocusTargetNode;
import o.isAdapterPositionOnScreen;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onRemeasurementAvailable;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaEhiy2Oql4mI3TRewijDUDens0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.resetAfterInAppMessageCloselambda2;
import o.sourceInformationContextOfdefault;
import o.verifyOrientationStatuslambda3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RecordsFileStorage {
    public final Object dataLoader;
    public final Serializable fullFileName$delegate;
    public Object serializer;

    public abstract void IconCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer(onRemeasurementAvailable onremeasurementavailable);

    public abstract void read();

    public abstract void serializer();

    public abstract void write();

    public List load() throws IOException {
        byte[] bArrCopyOf;
        RecordsSerializer recordsSerializer = (RecordsSerializer) this.serializer;
        m mVar = (m) this.dataLoader;
        String str = (String) ((isAdapterPositionOnScreen) this.fullFileName$delegate).MediaSessionCompatResultReceiverWrapper();
        str.getClass();
        CommonSdkLog.INSTANCE.logd(null, "Loading file mapbox_search_sdk/".concat(str));
        InternalFileSystem internalFileSystem = (InternalFileSystem) mVar.read;
        File filesDir = ((Application) mVar.RemoteActionCompatParcelizer).getFilesDir();
        filesDir.getClass();
        File file = new File(filesDir, "mapbox_search_sdk");
        if (((Number) internalFileSystem.sdkVersionProvider.invoke()).intValue() >= 26) {
            if (!file.exists()) {
                try {
                    Files.createDirectory(file.toPath(), new FileAttribute[0]);
                } catch (FileAlreadyExistsException unused) {
                }
            }
        } else if (!file.exists() && !file.mkdirs() && !file.exists()) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(file.getPath(), "Can not create dir at ");
            return null;
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            FileInputStream fileInputStreamWrite = getActiveFocusTargetNode.write(file2, new FileInputStream(file2));
            try {
                long length = file2.length();
                if (length > 2147483647L) {
                    throw new OutOfMemoryError("File " + file2 + " is too big (" + length + " bytes) to fit in memory.");
                }
                int i = (int) length;
                byte[] bArrCopyOf2 = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int i4 = fileInputStreamWrite.read(bArrCopyOf2, i3, i2);
                    if (i4 < 0) {
                        break;
                    }
                    i2 -= i4;
                    i3 += i4;
                }
                if (i2 > 0) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf2, i3);
                } else {
                    int i5 = fileInputStreamWrite.read();
                    if (i5 != -1) {
                        r8lambdaEhiy2Oql4mI3TRewijDUDens0 r8lambdaehiy2oql4mi3trewijdudens0 = new r8lambdaEhiy2Oql4mI3TRewijDUDens0(8193);
                        r8lambdaehiy2oql4mi3trewijdudens0.write(i5);
                        SentryUUID.RemoteActionCompatParcelizer(fileInputStreamWrite, r8lambdaehiy2oql4mi3trewijdudens0);
                        int size = r8lambdaehiy2oql4mi3trewijdudens0.size() + i;
                        if (size < 0) {
                            throw new OutOfMemoryError("File " + file2 + " is too big to fit in memory.");
                        }
                        byte[] bArrIconCompatParcelizer = r8lambdaehiy2oql4mi3trewijdudens0.IconCompatParcelizer();
                        bArrCopyOf2 = Arrays.copyOf(bArrCopyOf2, size);
                        onContentCardClicked.write(bArrIconCompatParcelizer, i, bArrCopyOf2, 0, r8lambdaehiy2oql4mi3trewijdudens0.size());
                    }
                    bArrCopyOf = bArrCopyOf2;
                }
                fileInputStreamWrite.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStreamWrite, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } else {
            bArrCopyOf = new byte[0];
        }
        RecordsSerializer.RecordsData recordsDataRestoreRecord = recordsSerializer.restoreRecord(new String(bArrCopyOf, ensureSubscribedToInAppMessageEvents.write));
        if (recordsDataRestoreRecord.getVersion() == 0) {
            int i6 = 1;
            return resetAfterInAppMessageCloselambda2.read(new verifyOrientationStatuslambda3(resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((Iterable) recordsDataRestoreRecord.getRecords()), new RecordsSerializer$deserialize$2(i6, i6)), RecordsSerializer$deserialize$2.INSTANCE));
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(recordsDataRestoreRecord.getVersion(), "Unsupported data version ");
        return null;
    }

    public RecordsFileStorage(String str, RecordsSerializer recordsSerializer, m mVar) {
        this.serializer = recordsSerializer;
        this.dataLoader = mVar;
        this.fullFileName$delegate = new isAdapterPositionOnScreen(new RecordsFileStorage$fullFileName$2(str, 0));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    public RecordsFileStorage(int i) {
        this.dataLoader = new float[i * 2];
        this.fullFileName$delegate = new int[i];
    }
}
