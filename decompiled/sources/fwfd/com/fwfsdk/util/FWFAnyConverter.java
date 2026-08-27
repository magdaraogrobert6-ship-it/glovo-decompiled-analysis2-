package fwfd.com.fwfsdk.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class FWFAnyConverter {
    public static Object toObject(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return FWFBytes.toObject(bArr);
        } catch (IOException e) {
            e.printStackTrace();
            FWFLogger.logError(FWFHelper.ERROR_CONVERTER_BLOB_VARIATION);
            return null;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            FWFLogger.logError(FWFHelper.ERROR_CONVERTER_BLOB_VARIATION);
            return null;
        }
    }

    public byte[] toString(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return FWFBytes.toByteArray(obj);
        } catch (IOException e) {
            e.printStackTrace();
            FWFLogger.logError(FWFHelper.ERROR_CONVERTER_OBJECT_VARIATION);
            return null;
        }
    }
}
