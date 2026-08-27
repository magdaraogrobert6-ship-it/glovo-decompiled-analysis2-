package o;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class migrateSealedSessionsMapToJsonlambda0 {
    public static boolean RemoteActionCompatParcelizer(File file, parseLonglambda0 parselonglambda0) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read();
                fileInputStream.close();
                return true;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to read from file %s", file.getAbsolutePath());
            return false;
        }
    }

    public static void IconCompatParcelizer(File file, File file2) throws IOException {
        isSdkAuthenticationEnabled issdkauthenticationenabledIconCompatParcelizer = getResourceIdentifier.IconCompatParcelizer(file);
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        try {
            readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.serializer(file2));
            while (issdkauthenticationenabledIconCompatParcelizer.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) != -1) {
                try {
                    long j = r8lambdabeyrnr8p6809bwlboro_stans.read();
                    if (j > 0) {
                        readresourcevaluelambda2.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
                    }
                } catch (Throwable th) {
                    try {
                        readresourcevaluelambda2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            long j2 = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
            if (j2 > 0) {
                readresourcevaluelambda2.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j2);
            }
            readresourcevaluelambda2.close();
            issdkauthenticationenabledIconCompatParcelizer.close();
            r8lambdabeyrnr8p6809bwlboro_stans.serializer();
            if (file.length() == file2.length()) {
                return;
            }
            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
        } catch (Throwable th3) {
            try {
                issdkauthenticationenabledIconCompatParcelizer.close();
                r8lambdabeyrnr8p6809bwlboro_stans.serializer();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static File RemoteActionCompatParcelizer(File file) {
        String name = file.getName();
        if (name.endsWith(".db")) {
            name = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(3, 0, name);
        }
        return new File(file.getParentFile(), name.concat("-wal"));
    }

    public static long IconCompatParcelizer(File file) {
        long jIconCompatParcelizer;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                jIconCompatParcelizer = file2.length();
            } else {
                if (file2.isDirectory()) {
                    jIconCompatParcelizer = IconCompatParcelizer(file2);
                }
            }
            j = jIconCompatParcelizer + j;
        }
        return j;
    }

    public static ArrayList write(File file) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(file);
        read(arrayList2, arrayList);
        return arrayList;
    }

    public static File serializer(File file) {
        String name = file.getName();
        if (name.endsWith(".db")) {
            name = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(3, 0, name);
        }
        return new File(file.getParentFile(), name.concat("-journal"));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0045: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:12:0x0045 */
    public static File read(File file, String str, parseLonglambda0 parselonglambda0) {
        Closeable closeable;
        File file2 = new File(file.getAbsolutePath() + str + ".gz");
        if (file2.exists()) {
            return file2;
        }
        Closeable closeable2 = null;
        try {
            try {
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(file2), 8192));
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            migrateMetadataToJson.IconCompatParcelizer(fileInputStream, bufferedOutputStream);
                            bufferedOutputStream.close();
                            migrateMetadataToJson.write(fileInputStream);
                            return file2;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e) {
                    e = e;
                    if (parselonglambda0 != null) {
                        parselonglambda0.IconCompatParcelizer(false, e, "Could not gzip log file", new Object[0]);
                    }
                    migrateMetadataToJson.write(null);
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                if (parselonglambda0 != null) {
                    parselonglambda0.IconCompatParcelizer(false, e, "Could not gzip log file", new Object[0]);
                }
                migrateMetadataToJson.write(null);
                return null;
            } catch (Throwable th4) {
                th = th4;
                migrateMetadataToJson.write(closeable2);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            closeable2 = closeable;
        }
    }

    public static ArrayList IconCompatParcelizer(File file, boolean z) {
        File[] fileArrListFiles;
        if (file != null && (fileArrListFiles = file.listFiles()) != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(fileArrListFiles));
            if (z) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((File) arrayList.get(size)).isDirectory()) {
                        arrayList.remove(size);
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private static void read(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (File file : IconCompatParcelizer((File) arrayList.get(0), false)) {
            if (!file.isDirectory()) {
                arrayList2.add(file);
            }
            if (file.isDirectory()) {
                arrayList.add(file);
            }
        }
        arrayList.remove(0);
        read(arrayList, arrayList2);
    }

    public static void read(File file) {
        RemoteActionCompatParcelizer((List<File>) Collections.singletonList(file));
    }

    public static void RemoteActionCompatParcelizer(List<File> list) {
        RemoteActionCompatParcelizer(new ArrayDeque(list));
    }

    private static void RemoteActionCompatParcelizer(ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return;
        }
        File file = (File) arrayDeque.peek();
        ArrayList arrayList = new ArrayList();
        for (File file2 : IconCompatParcelizer(file, false)) {
            if (file2.isDirectory() && !IconCompatParcelizer(file2, false).isEmpty()) {
                arrayList.add(file2);
            } else {
                file2.delete();
            }
        }
        if (arrayList.isEmpty()) {
            ((File) arrayDeque.poll()).delete();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayDeque.push((File) it.next());
        }
        RemoteActionCompatParcelizer(arrayDeque);
    }

    public static File[] serializer(File[] fileArr) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            arrayList.add(new r8lambda1wTXnoE4juwH2SNwjj1mRN0rlww(file));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        File[] fileArr2 = new File[size];
        for (int i = 0; i < size; i++) {
            fileArr2[i] = ((r8lambda1wTXnoE4juwH2SNwjj1mRN0rlww) arrayList.get(i)).RemoteActionCompatParcelizer;
        }
        return fileArr2;
    }
}
