package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession {
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(AndroidPlatformTextInputSession.class.getName());

    /* JADX WARN: Code duplicated, block: B:39:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static List serializer(InputStream inputStream) throws Throwable {
        Throwable th;
        java.util.logging.Logger logger = write;
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        ObjectInputStream objectInputStream = null;
        try {
            ObjectInputStream objectInputStream2 = new ObjectInputStream(inputStream);
            try {
                AndroidCompositionLocals_androidKtLocalContext1 androidCompositionLocals_androidKtLocalContext1 = new AndroidCompositionLocals_androidKtLocalContext1();
                ArrayList arrayList = new ArrayList();
                androidCompositionLocals_androidKtLocalContext1.serializer = arrayList;
                androidCompositionLocals_androidKtLocalContext1.readExternal(objectInputStream2);
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("Empty metadata");
                }
                try {
                    objectInputStream2.close();
                    return arrayList;
                } catch (IOException e) {
                    logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e);
                    return arrayList;
                }
            } catch (IOException e2) {
                e = e2;
                objectInputStream = objectInputStream2;
                try {
                    throw new IllegalStateException("Unable to parse metadata file", e);
                } catch (Throwable th2) {
                    objectInputStream2 = objectInputStream;
                    th = th2;
                    ObjectInputStream objectInputStream3 = objectInputStream2;
                    th = th;
                    objectInputStream = objectInputStream3;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e3);
                        }
                    } else {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ObjectInputStream objectInputStream4 = objectInputStream2;
                th = th;
                objectInputStream = objectInputStream4;
                if (objectInputStream != null) {
                    objectInputStream.close();
                } else {
                    inputStream.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (Throwable th4) {
            th = th4;
            if (objectInputStream != null) {
                objectInputStream.close();
            } else {
                inputStream.close();
            }
            throw th;
        }
    }
}
