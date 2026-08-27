package fwfd.com.fwfsdk.util;

import com.google.gson.internal.LinkedTreeMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FWFBytes {
    public static byte[] toByteArray(Object obj) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    if ((obj instanceof LinkedTreeMap) || (obj instanceof List)) {
                        objectOutputStream2.writeObject(FWFGson.getInstance().toJson(obj));
                    } else {
                        objectOutputStream2.writeObject(obj);
                    }
                    objectOutputStream2.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    objectOutputStream2.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public static Object toObject(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream2);
                try {
                    Object object = objectInputStream.readObject();
                    byteArrayInputStream2.close();
                    objectInputStream.close();
                    return object;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    if (objectInputStream == null) {
                        throw th;
                    }
                    objectInputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            objectInputStream = null;
        }
    }

    public static String toString(byte[] bArr) {
        return new String(bArr);
    }
}
