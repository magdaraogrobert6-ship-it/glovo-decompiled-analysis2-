package o;

import android.text.TextUtils;
import android.util.Log;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.Braze$Companion$$ExternalSyntheticLambda8;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY {
    public static boolean write = false;
    public Object IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public long serializer;

    public static boolean IconCompatParcelizer(String str) {
        if (str.startsWith("/data/user") || str.startsWith("/data/data/") || str.startsWith("data/data/") || str.startsWith("data/user") || getTitleResource.IconCompatParcelizer(placeAtf8xVGno.read())) {
            return true;
        }
        Log.e("LogWrite", "Storage permission check unPass");
        return false;
    }

    public static String read(String str) {
        return ff$$ExternalSyntheticOutline0.m("Location.", new SimpleDateFormat("yyyyMMdd_HHmmss", java.util.Locale.getDefault()).format(Calendar.getInstance().getTime()), str.equals("location") ? ".csv" : ".log");
    }

    public static void write(CollectionInfo_androidKt collectionInfo_androidKt) {
        BufferedWriter bufferedWriter = collectionInfo_androidKt.IconCompatParcelizer;
        String str = collectionInfo_androidKt.read;
        String str2 = collectionInfo_androidKt.serializer;
        if (bufferedWriter == null) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                Log.e("LogWrite", "openLogFile Exception");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str, str2), true);
            synchronized (r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.class) {
                collectionInfo_androidKt.IconCompatParcelizer = new BufferedWriter(new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8));
            }
        }
    }

    public static void write(Wrapper_androidKt wrapper_androidKt, CollectionInfo_androidKt collectionInfo_androidKt) throws IOException {
        String strM;
        String str = wrapper_androidKt.write;
        String str2 = wrapper_androidKt.IconCompatParcelizer;
        if (str.equals("location")) {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str2);
            sbM.append(System.lineSeparator());
            strM = sbM.toString();
        } else {
            java.util.Locale locale2 = java.util.Locale.ENGLISH;
            String strIconCompatParcelizer = calculateIfHorizontallyStacked.IconCompatParcelizer(Calendar.getInstance().getTime());
            String str3 = wrapper_androidKt.RemoteActionCompatParcelizer;
            String str4 = wrapper_androidKt.read;
            StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m(str2);
            sbM2.append(System.lineSeparator());
            sbM2.append(Log.getStackTraceString(null));
            String string = sbM2.toString();
            StringBuilder sb = new StringBuilder();
            sb.append(strIconCompatParcelizer);
            sb.append(": ");
            sb.append(str3);
            sb.append("/");
            sb.append(str4);
            strM = ff$$ExternalSyntheticOutline0.m(sb, ": ", string);
        }
        BufferedWriter bufferedWriter = collectionInfo_androidKt.IconCompatParcelizer;
        if (bufferedWriter != null) {
            bufferedWriter.append((CharSequence) strM);
            bufferedWriter.flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: all -> 0x0075, TryCatch #1 {, blocks: (B:10:0x0021, B:13:0x002c, B:15:0x003e, B:16:0x0041, B:18:0x004d, B:20:0x0057, B:21:0x0073, B:12:0x0025), top: B:28:0x0021, inners: #0 }] */
    public void RemoteActionCompatParcelizer(CollectionInfo_androidKt collectionInfo_androidKt, String str, String str2) {
        String str3 = collectionInfo_androidKt.read;
        BufferedWriter bufferedWriter = collectionInfo_androidKt.IconCompatParcelizer;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            Log.e("LogWrite", "createNewLogFile Exception");
            return;
        }
        File file = new File(str3, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        synchronized (r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.class) {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException unused) {
                    Log.e("LogWrite", "createNewLogFile IOException");
                }
                collectionInfo_androidKt.IconCompatParcelizer = new BufferedWriter(new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8));
                if (collectionInfo_androidKt.write) {
                    read(str3, str2);
                }
                collectionInfo_androidKt.serializer = str;
                write = true;
                if (str2.equals("location") && file.length() == 0) {
                    collectionInfo_androidKt.IconCompatParcelizer.append((CharSequence) ("writeTime,transId,provider,latitude,longitude,accuracy,locationTime,speed,sessionId,sourceType,locateType,vendorType,src,switchHd,floor,floorAcc,buildingId" + System.lineSeparator()));
                    collectionInfo_androidKt.IconCompatParcelizer.flush();
                }
            } else {
                collectionInfo_androidKt.IconCompatParcelizer = new BufferedWriter(new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8));
                if (collectionInfo_androidKt.write) {
                    read(str3, str2);
                }
                collectionInfo_androidKt.serializer = str;
                write = true;
                if (str2.equals("location")) {
                    collectionInfo_androidKt.IconCompatParcelizer.append((CharSequence) ("writeTime,transId,provider,latitude,longitude,accuracy,locationTime,speed,sessionId,sourceType,locateType,vendorType,src,switchHd,floor,floorAcc,buildingId" + System.lineSeparator()));
                    collectionInfo_androidKt.IconCompatParcelizer.flush();
                }
            }
            throw th;
        }
    }

    public void read(CollectionInfo_androidKt collectionInfo_androidKt, String str) {
        String str2 = collectionInfo_androidKt.serializer;
        String str3 = collectionInfo_androidKt.read;
        if (TextUtils.isEmpty(str2) || !new File(str3, str2).exists()) {
            File file = new File(str3);
            if (!file.exists()) {
                collectionInfo_androidKt.write = false;
                File file2 = new File(str3);
                if (!file2.exists()) {
                    try {
                        if (!file2.mkdirs()) {
                            Log.e("LogWrite", "createFolder fail");
                        }
                    } catch (SecurityException unused) {
                        Log.e("LogWrite", "createFolder SecurityException:");
                    }
                }
                RemoteActionCompatParcelizer(collectionInfo_androidKt, read(str), str);
                return;
            }
            read(collectionInfo_androidKt.read, str);
            collectionInfo_androidKt.write = false;
            File[] fileArrListFiles = file.listFiles(str.equals("location") ? new Braze$Companion$$ExternalSyntheticLambda8(1) : new Braze$Companion$$ExternalSyntheticLambda8(2));
            if (fileArrListFiles == null) {
                Log.e("LogWrite", "beforeWriteCheck  existedFiles is null");
                return;
            }
            if (fileArrListFiles.length == 0) {
                collectionInfo_androidKt.write = false;
                RemoteActionCompatParcelizer(collectionInfo_androidKt, read(str), str);
            } else {
                try {
                    Arrays.sort(fileArrListFiles, new accesssetRecreateDisplayListcp(1));
                } catch (IllegalArgumentException unused2) {
                    Log.e("LogWrite", "beforeWriteCheck Arrays sort IllegalArgumentException");
                }
                collectionInfo_androidKt.serializer = fileArrListFiles[fileArrListFiles.length - 1].getName();
            }
        }
    }

    public void serializer() {
        BufferedWriter bufferedWriter;
        synchronized (r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.class) {
            Iterator it = ((ConcurrentHashMap) this.read).entrySet().iterator();
            while (it.hasNext()) {
                CollectionInfo_androidKt collectionInfo_androidKt = (CollectionInfo_androidKt) ((Map.Entry) it.next()).getValue();
                if (collectionInfo_androidKt != null && (bufferedWriter = collectionInfo_androidKt.IconCompatParcelizer) != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException unused) {
                        Log.e("LogWrite", "shutdown IOException");
                    }
                    collectionInfo_androidKt.IconCompatParcelizer = null;
                }
            }
        }
    }

    public CollectionInfo_androidKt write(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.read;
        if (concurrentHashMap.containsKey(str)) {
            return (CollectionInfo_androidKt) concurrentHashMap.get(str);
        }
        CollectionInfo_androidKt collectionInfo_androidKt = new CollectionInfo_androidKt();
        String str2 = (String) this.IconCompatParcelizer;
        if (!str.equals("log") && str.equals("location")) {
            str2 = ((String) this.IconCompatParcelizer) + hasCollectionInfo.IconCompatParcelizer + hasCollectionInfo.serializer;
        }
        collectionInfo_androidKt.read = str2;
        concurrentHashMap.put(str, collectionInfo_androidKt);
        return collectionInfo_androidKt;
    }

    public r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY(getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) {
        getlocalprovidablescrollcaptureinprogress.getClass();
        this.IconCompatParcelizer = getlocalprovidablescrollcaptureinprogress;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062 A[Catch: all -> 0x0069, IOException -> 0x006b, TryCatch #1 {IOException -> 0x006b, blocks: (B:6:0x0009, B:8:0x0017, B:11:0x0022, B:15:0x002f, B:17:0x0040, B:22:0x0057, B:24:0x0065, B:23:0x0062, B:20:0x004c), top: B:34:0x0009, outer: #0 }] */
    public void IconCompatParcelizer(Wrapper_androidKt wrapper_androidKt) {
        if (!write) {
            return;
        }
        String str = wrapper_androidKt.write;
        synchronized (r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.class) {
            try {
                CollectionInfo_androidKt collectionInfo_androidKtWrite = write(str);
                if (Integer.parseInt("100") != 100 || IconCompatParcelizer((String) this.IconCompatParcelizer)) {
                    read(collectionInfo_androidKtWrite, str);
                    if (!TextUtils.isEmpty(collectionInfo_androidKtWrite.serializer)) {
                        File file = new File(collectionInfo_androidKtWrite.read, collectionInfo_androidKtWrite.serializer);
                        if (str.equals("location")) {
                            if (file.length() > 1048576) {
                                collectionInfo_androidKtWrite.write = true;
                                RemoteActionCompatParcelizer(collectionInfo_androidKtWrite, read(str), str);
                            } else {
                                write(collectionInfo_androidKtWrite);
                            }
                        } else if (file.length() > this.MediaDescriptionCompat) {
                            collectionInfo_androidKtWrite.write = true;
                            RemoteActionCompatParcelizer(collectionInfo_androidKtWrite, read(str), str);
                        } else {
                            write(collectionInfo_androidKtWrite);
                        }
                        write(wrapper_androidKt, collectionInfo_androidKtWrite);
                    }
                }
            } catch (IOException unused) {
                Log.e("LogWrite", "writeToFile IOException");
            }
        }
    }

    public void read(String str, String str2) {
        File[] fileArrListFiles = new File(str).listFiles(str2.equals("location") ? new Braze$Companion$$ExternalSyntheticLambda8(1) : new Braze$Companion$$ExternalSyntheticLambda8(2));
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        try {
            Arrays.sort(fileArrListFiles, new accesssetRecreateDisplayListcp(1));
        } catch (IllegalArgumentException unused) {
            Log.e("LogWrite", "Arrays sort IllegalArgumentException");
        }
        try {
            if (System.currentTimeMillis() - fileArrListFiles[fileArrListFiles.length - 1].lastModified() > this.serializer) {
                read(fileArrListFiles, -1);
            } else {
                for (int length = fileArrListFiles.length - 1; length >= 0; length--) {
                    if (System.currentTimeMillis() - fileArrListFiles[length].lastModified() > this.serializer) {
                        fileArrListFiles[length].getName();
                        if (!fileArrListFiles[length].delete()) {
                            Log.e("LogWrite", "filesNumAndUsefulCheck:delete the exceed file result false");
                        }
                    }
                }
            }
        } catch (SecurityException | Exception unused2) {
        }
        int length2 = fileArrListFiles.length;
        int i = this.RemoteActionCompatParcelizer;
        if (length2 >= i) {
            read(fileArrListFiles, fileArrListFiles.length - i);
        }
    }

    public static void read(File[] fileArr, int i) {
        if (fileArr.length > 0) {
            try {
                if (i == -1) {
                    for (int length = fileArr.length - 1; length >= 0; length--) {
                        if (fileArr[length].delete()) {
                        }
                    }
                    return;
                }
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (fileArr[i2].delete()) {
                    }
                }
                return;
                Log.e("LogWrite", "deleteFiles result false");
            } catch (SecurityException unused) {
                Log.e("LogWrite", "deleteFiles SecurityException");
            }
        }
    }

    public r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY() {
    }
}
