package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "model-store", componentName = "ModelStore")
public class r8lambdavChuWV1WD0ZC8VIhOWyylSzXnA implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private static int MediaMetadataCompat = 1;
    private static int write;
    private final Context IconCompatParcelizer;
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda1<String> read = new r8lambdas3iNeh1uXnqG89SHBkA05tLl_u4(this);
    private final parseLonglambda0 serializer;

    private String[] RemoteActionCompatParcelizer() {
        String[] list = new String[0];
        try {
            list = this.IconCompatParcelizer.getAssets().list("com.sentiance.sdk/ondevice/models");
        } catch (IOException e) {
            this.serializer.IconCompatParcelizer(false, e, "Failed to get the list of models in the assets folder", new Object[0]);
        }
        return list == null ? new String[0] : list;
    }

    private ArrayList serializer(String str) {
        ArrayList arrayList;
        synchronized (this) {
            ArrayList arrayListIconCompatParcelizer = migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str), false);
            arrayList = new ArrayList();
            Iterator it = arrayListIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                populatePushStoryPage populatepushstorypageSerializer = serializer((File) it.next());
                if (populatepushstorypageSerializer != null) {
                    arrayList.add(populatepushstorypageSerializer);
                }
            }
        }
        return arrayList;
    }

    public final boolean IconCompatParcelizer(File file) {
        synchronized (this) {
            try {
                migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file, new File(r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(this.IconCompatParcelizer, "com.sentiance.sdk/ondevice/models/"), file.getName()));
            } catch (IOException e) {
                this.serializer.IconCompatParcelizer(false, e, "Failed to copy model %s from bundled directory", file.getName());
                return false;
            }
        }
        return true;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.RemoteActionCompatParcelizer.read();
        this.read.write();
        Context context = this.IconCompatParcelizer;
        File fileRemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(context, "com.sentiance.sdk/ondevice/default_models/");
        File fileRemoteActionCompatParcelizer2 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(context, "com.sentiance.sdk/ondevice/downloaded_models/");
        File fileRemoteActionCompatParcelizer3 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(context, "com.sentiance.sdk/ondevice/models/");
        migrateSealedSessionsMapToJsonlambda0.read(fileRemoteActionCompatParcelizer);
        migrateSealedSessionsMapToJsonlambda0.read(fileRemoteActionCompatParcelizer2);
        migrateSealedSessionsMapToJsonlambda0.read(fileRemoteActionCompatParcelizer3);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        Context context = this.IconCompatParcelizer;
        return Arrays.asList(r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(context, "com.sentiance.sdk/ondevice/default_models/"), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(context, "com.sentiance.sdk/ondevice/models/"), r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(context, "com.sentiance.sdk/ondevice/downloaded_models/"));
    }

    public r8lambdavChuWV1WD0ZC8VIhOWyylSzXnA(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, Context context) {
        this.RemoteActionCompatParcelizer = cVar;
        this.serializer = parselonglambda0;
        this.IconCompatParcelizer = context;
    }

    public final String read() {
        List listAsList = Arrays.asList(RemoteActionCompatParcelizer());
        Collections.sort(listAsList);
        StringBuilder sb = new StringBuilder();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        CRC32 crc32 = new CRC32();
        crc32.update(sb.toString().getBytes());
        return Long.toHexString(crc32.getValue());
    }

    private populatePushStoryPage serializer(File file) {
        int[] iArr;
        if (file.exists()) {
            String name = file.getName();
            boolean zEndsWith = name.endsWith(".tflite");
            parseLonglambda0 parselonglambda0 = this.serializer;
            if (!zEndsWith) {
                parselonglambda0.IconCompatParcelizer("Invalid model extension: %s. Expected .%s", name, "tflite");
                return null;
            }
            Matcher matcher = Pattern.compile("^([^.]+)\\.([^.]+)\\.([0-9]+)_([0-9]+)\\.tflite$").matcher(name);
            if (!matcher.find() || matcher.groupCount() != 4) {
                parselonglambda0.IconCompatParcelizer("Invalid model name format: %s", name);
                return null;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            String strGroup3 = matcher.group(3);
            String strGroup4 = matcher.group(4);
            if (strGroup3 != null && strGroup4 != null && strGroup2 != null && strGroup != null) {
                try {
                    iArr = new int[]{Integer.parseInt(strGroup3), Integer.parseInt(strGroup4)};
                } catch (Exception e) {
                    parselonglambda0.IconCompatParcelizer(false, e, "Failed to parse the version: %s.%s", strGroup3, strGroup4);
                    iArr = new int[0];
                }
                if (iArr.length == 2) {
                    return new populatePushStoryPage(file, strGroup, strGroup2, iArr[0], iArr[1]);
                }
            }
        }
        return null;
    }

    public final populatePushStoryPage write(String str) {
        for (populatePushStoryPage populatepushstorypage : serializer("com.sentiance.sdk/ondevice/models/")) {
            if (populatepushstorypage.MediaSessionCompatQueueItem().equals(str)) {
                return populatepushstorypage;
            }
        }
        return null;
    }

    public final void write(populatePushStoryPage populatepushstorypage) {
        synchronized (this) {
            populatepushstorypage.RemoteActionCompatParcelizer().delete();
        }
    }

    public final ArrayList write() {
        return serializer("com.sentiance.sdk/ondevice/models/");
    }

    public final populatePushStoryPage IconCompatParcelizer(String str) {
        for (populatePushStoryPage populatepushstorypage : serializer()) {
            if (populatepushstorypage.MediaSessionCompatQueueItem().equals(str)) {
                return populatepushstorypage;
            }
        }
        return null;
    }

    public final ArrayList serializer() throws Throwable {
        String str;
        String str2;
        InputStream gZIPInputStream;
        boolean z;
        r8lambdavChuWV1WD0ZC8VIhOWyylSzXnA r8lambdavchuwv1wd0zc8vihowyylszxna = this;
        int i = 2;
        int i2 = 2 % 2;
        migrateTriggersReeligibilityToJsonlambda1<String> migratetriggersreeligibilitytojsonlambda1 = r8lambdavchuwv1wd0zc8vihowyylszxna.read;
        String str3 = migratetriggersreeligibilitytojsonlambda1.read();
        com.sentiance.sdk.util.c cVar = r8lambdavchuwv1wd0zc8vihowyylszxna.RemoteActionCompatParcelizer;
        String strWrite = cVar.write("asset_models_sync_hash", "");
        int i3 = write + 53;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        try {
            boolean zBooleanValue = ((Boolean) String.class.getMethod("equals", Object.class).invoke(str3, strWrite)).booleanValue();
            String str4 = "com.sentiance.sdk/ondevice/default_models/";
            if (zBooleanValue) {
                str = "com.sentiance.sdk/ondevice/default_models/";
            } else {
                parseLonglambda0 parselonglambda0 = r8lambdavchuwv1wd0zc8vihowyylszxna.serializer;
                parselonglambda0.IconCompatParcelizer("Copying models from assets folder", new Object[0]);
                Context context = r8lambdavchuwv1wd0zc8vihowyylszxna.IconCompatParcelizer;
                File fileRemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(context, "com.sentiance.sdk/ondevice/default_models/");
                migrateSealedSessionsMapToJsonlambda0.read(fileRemoteActionCompatParcelizer);
                fileRemoteActionCompatParcelizer.mkdirs();
                if (fileRemoteActionCompatParcelizer.exists()) {
                    String[] strArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                    int length = strArrRemoteActionCompatParcelizer.length;
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = MediaMetadataCompat + 43;
                        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % i;
                        String str5 = strArrRemoteActionCompatParcelizer[i5];
                        String[] strArr = strArrRemoteActionCompatParcelizer;
                        parselonglambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("asset names: ", str5), new Object[0]);
                        try {
                            int i8 = length;
                            File file = new File(fileRemoteActionCompatParcelizer, (String) String.class.getMethod("replace", CharSequence.class, CharSequence.class).invoke(str5, ".gz", ""));
                            int i9 = write + 9;
                            MediaMetadataCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i9 % 2 == 0) {
                                Class[] clsArr = new Class[1];
                                clsArr[1] = String.class;
                                str2 = (String) String.class.getMethod("concat", clsArr).invoke("com.sentiance.sdk/ondevice/models/", str5);
                            } else {
                                str2 = (String) String.class.getMethod("concat", String.class).invoke("com.sentiance.sdk/ondevice/models/", str5);
                            }
                            try {
                                Object[] objArr = {".gz"};
                                try {
                                    Class[] clsArr2 = new Class[1];
                                    clsArr2[0] = String.class;
                                    Object obj = null;
                                    if (((Boolean) String.class.getMethod("endsWith", clsArr2).invoke(str5, objArr)).booleanValue()) {
                                        try {
                                            try {
                                                Object[] objArr2 = {context.getAssets(), str2};
                                                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                                                if (objRemoteActionCompatParcelizer == null) {
                                                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ImageFormat.getBitsPerPixel(0) + 26245), 37 - TextUtils.getTrimmedLength(""), 13 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                                                }
                                                gZIPInputStream = new GZIPInputStream((InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2));
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e) {
                                            e = e;
                                        }
                                    } else {
                                        try {
                                            Object[] objArr3 = {context.getAssets(), str2};
                                            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                                            if (objRemoteActionCompatParcelizer2 == null) {
                                                char scrollBarFadeDuration = (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26244);
                                                int size = View.MeasureSpec.getSize(0) + 37;
                                                int mirror = '=' - AndroidCharacter.getMirror('0');
                                                Class[] clsArr3 = new Class[2];
                                                clsArr3[0] = AssetManager.class;
                                                try {
                                                    clsArr3[1] = String.class;
                                                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration, size, mirror, 1172891421, false, "write", clsArr3);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    Throwable cause2 = th.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th;
                                                }
                                            }
                                            gZIPInputStream = (InputStream) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                                            try {
                                                while (true) {
                                                    int i10 = gZIPInputStream.read(bArr);
                                                    if (i10 == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i10);
                                                    e = e;
                                                    z = false;
                                                    parselonglambda0.IconCompatParcelizer(false, e, "Failed to copy model asset %s to %s", str2, fileRemoteActionCompatParcelizer.getName());
                                                    i5++;
                                                    int i11 = MediaMetadataCompat + 7;
                                                    write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    int i12 = i11 % 2;
                                                    i = 2;
                                                    strArrRemoteActionCompatParcelizer = strArr;
                                                    length = i8;
                                                    str4 = str4;
                                                    cVar = cVar;
                                                }
                                                gZIPInputStream.close();
                                                z = false;
                                            } catch (IOException e2) {
                                                e = e2;
                                                z = false;
                                                parselonglambda0.IconCompatParcelizer(false, e, "Failed to copy model asset %s to %s", str2, fileRemoteActionCompatParcelizer.getName());
                                            }
                                            fileOutputStream.close();
                                            i5++;
                                            int i13 = MediaMetadataCompat + 7;
                                            write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i14 = i13 % 2;
                                            i = 2;
                                            strArrRemoteActionCompatParcelizer = strArr;
                                            length = i8;
                                            str4 = str4;
                                            cVar = cVar;
                                        } catch (Throwable th4) {
                                            int i15 = write + 31;
                                            MediaMetadataCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            try {
                                                if (i15 % 2 != 0) {
                                                    fileOutputStream.close();
                                                    throw th4;
                                                }
                                                fileOutputStream.close();
                                                obj.hashCode();
                                                throw null;
                                            } catch (Throwable th5) {
                                                th4.addSuppressed(th5);
                                                throw th4;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        if (gZIPInputStream == null) {
                                            throw th6;
                                        }
                                        try {
                                            gZIPInputStream.close();
                                            throw th6;
                                        } catch (Throwable th7) {
                                            th6.addSuppressed(th7);
                                            throw th6;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    Throwable cause3 = th.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            Throwable cause4 = th.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th;
                        }
                    }
                    cVar.RemoteActionCompatParcelizer("asset_models_sync_hash", migratetriggersreeligibilitytojsonlambda1.read());
                    r8lambdavchuwv1wd0zc8vihowyylszxna = this;
                    str = str4;
                } else {
                    parselonglambda0.RemoteActionCompatParcelizer("Bundled models directory could not be created", new Object[0]);
                    str = "com.sentiance.sdk/ondevice/default_models/";
                }
            }
            return r8lambdavchuwv1wd0zc8vihowyylszxna.serializer(str);
        } catch (Throwable th11) {
            th = th11;
        }
    }
}
