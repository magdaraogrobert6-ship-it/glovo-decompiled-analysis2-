package o;

import android.os.StrictMode;
import androidx.loader.content.ModernAsyncTask$1;
import coil3.disk.DiskLruCache$Editor;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class getRelativeuksYyKA implements Closeable {
    public final File MediaBrowserCompatMediaItem;
    public BufferedWriter MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public int ParcelableVolumeInfo;
    public final File RatingCompat;
    public final File RemoteActionCompatParcelizer;
    public final File serializer;
    public long MediaSessionCompatResultReceiverWrapper = 0;
    public final LinkedHashMap MediaSessionCompatQueueItem = new LinkedHashMap(0, 0.75f, true);
    public long MediaSessionCompatToken = 0;
    public final ThreadPoolExecutor write = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r8lambda0VnaReYaJMb11m2G7Mh0wuBaWA());
    public final ModernAsyncTask$1 read = new ModernAsyncTask$1(2, this);
    public final int IconCompatParcelizer = 1;
    public final int PlaybackStateCompat = 1;

    public static void IconCompatParcelizer(getRelativeuksYyKA getrelativeuksyyka, DiskLruCache$Editor diskLruCache$Editor, boolean z) {
        synchronized (getrelativeuksyyka) {
            getPerceptualuksYyKA getperceptualuksyyka = (getPerceptualuksYyKA) diskLruCache$Editor.write;
            if (getperceptualuksyyka.IconCompatParcelizer != diskLruCache$Editor) {
                throw new IllegalStateException();
            }
            if (z && !getperceptualuksyyka.MediaSessionCompatQueueItem) {
                for (int i = 0; i < getrelativeuksyyka.PlaybackStateCompat; i++) {
                    if (!((boolean[]) diskLruCache$Editor.RemoteActionCompatParcelizer)[i]) {
                        diskLruCache$Editor.serializer();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!getperceptualuksyyka.RemoteActionCompatParcelizer[i].exists()) {
                        diskLruCache$Editor.serializer();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < getrelativeuksyyka.PlaybackStateCompat; i2++) {
                File file = getperceptualuksyyka.RemoteActionCompatParcelizer[i2];
                if (!z) {
                    IconCompatParcelizer(file);
                } else if (file.exists()) {
                    File file2 = getperceptualuksyyka.write[i2];
                    file.renameTo(file2);
                    long j = getperceptualuksyyka.read[i2];
                    long length = file2.length();
                    getperceptualuksyyka.read[i2] = length;
                    getrelativeuksyyka.MediaSessionCompatResultReceiverWrapper = (getrelativeuksyyka.MediaSessionCompatResultReceiverWrapper - j) + length;
                }
            }
            getrelativeuksyyka.ParcelableVolumeInfo++;
            getperceptualuksyyka.IconCompatParcelizer = null;
            if (getperceptualuksyyka.MediaSessionCompatQueueItem || z) {
                getperceptualuksyyka.MediaSessionCompatQueueItem = true;
                getrelativeuksyyka.MediaDescriptionCompat.append((CharSequence) "CLEAN");
                getrelativeuksyyka.MediaDescriptionCompat.append(' ');
                getrelativeuksyyka.MediaDescriptionCompat.append((CharSequence) getperceptualuksyyka.serializer);
                getrelativeuksyyka.MediaDescriptionCompat.append((CharSequence) getperceptualuksyyka.write());
                getrelativeuksyyka.MediaDescriptionCompat.append('\n');
                if (z) {
                    getrelativeuksyyka.MediaSessionCompatToken++;
                }
            } else {
                getrelativeuksyyka.MediaSessionCompatQueueItem.remove(getperceptualuksyyka.serializer);
                getrelativeuksyyka.MediaDescriptionCompat.append((CharSequence) "REMOVE");
                getrelativeuksyyka.MediaDescriptionCompat.append(' ');
                getrelativeuksyyka.MediaDescriptionCompat.append((CharSequence) getperceptualuksyyka.serializer);
                getrelativeuksyyka.MediaDescriptionCompat.append('\n');
            }
            IconCompatParcelizer(getrelativeuksyyka.MediaDescriptionCompat);
            if (getrelativeuksyyka.MediaSessionCompatResultReceiverWrapper > getrelativeuksyyka.MediaMetadataCompat || getrelativeuksyyka.serializer()) {
                getrelativeuksyyka.write.submit(getrelativeuksyyka.read);
            }
        }
    }

    public final getExponentimpl IconCompatParcelizer(String str) {
        synchronized (this) {
            if (this.MediaDescriptionCompat == null) {
                throw new IllegalStateException("cache is closed");
            }
            getPerceptualuksYyKA getperceptualuksyyka = (getPerceptualuksYyKA) this.MediaSessionCompatQueueItem.get(str);
            if (getperceptualuksyyka == null) {
                return null;
            }
            if (!getperceptualuksyyka.MediaSessionCompatQueueItem) {
                return null;
            }
            for (File file : getperceptualuksyyka.write) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.ParcelableVolumeInfo++;
            this.MediaDescriptionCompat.append((CharSequence) "READ");
            this.MediaDescriptionCompat.append(' ');
            this.MediaDescriptionCompat.append((CharSequence) str);
            this.MediaDescriptionCompat.append('\n');
            if (serializer()) {
                this.write.submit(this.read);
            }
            return new getExponentimpl(11, getperceptualuksyyka.write);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            BufferedWriter bufferedWriter = this.MediaDescriptionCompat;
            if (bufferedWriter != null) {
                write(bufferedWriter);
            }
            File file = this.RatingCompat;
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(getPositionInRoot.write(new FileOutputStream(file), file), r8lambdaXklJI9grDcJQF1TPpWoPR7EEs8k.IconCompatParcelizer));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.IconCompatParcelizer));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.PlaybackStateCompat));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (getPerceptualuksYyKA getperceptualuksyyka : this.MediaSessionCompatQueueItem.values()) {
                    if (getperceptualuksyyka.IconCompatParcelizer != null) {
                        bufferedWriter2.write("DIRTY " + getperceptualuksyyka.serializer + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + getperceptualuksyyka.serializer + getperceptualuksyyka.write() + '\n');
                    }
                }
                write(bufferedWriter2);
                if (this.RemoteActionCompatParcelizer.exists()) {
                    read(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, true);
                }
                read(this.RatingCompat, this.RemoteActionCompatParcelizer, false);
                this.MediaBrowserCompatMediaItem.delete();
                File file2 = this.RemoteActionCompatParcelizer;
                this.MediaDescriptionCompat = new BufferedWriter(new OutputStreamWriter(getPositionInRoot.IconCompatParcelizer(file2, new FileOutputStream(file2, true), true), r8lambdaXklJI9grDcJQF1TPpWoPR7EEs8k.IconCompatParcelizer));
            } catch (Throwable th) {
                write(bufferedWriter2);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.MediaDescriptionCompat == null) {
                return;
            }
            Iterator it = new ArrayList(this.MediaSessionCompatQueueItem.values()).iterator();
            while (it.hasNext()) {
                DiskLruCache$Editor diskLruCache$Editor = ((getPerceptualuksYyKA) it.next()).IconCompatParcelizer;
                if (diskLruCache$Editor != null) {
                    diskLruCache$Editor.serializer();
                }
            }
            IconCompatParcelizer();
            write(this.MediaDescriptionCompat);
            this.MediaDescriptionCompat = null;
        }
    }

    public final DiskLruCache$Editor write(String str) {
        synchronized (this) {
            if (this.MediaDescriptionCompat == null) {
                throw new IllegalStateException("cache is closed");
            }
            getPerceptualuksYyKA getperceptualuksyyka = (getPerceptualuksYyKA) this.MediaSessionCompatQueueItem.get(str);
            if (getperceptualuksyyka == null) {
                getperceptualuksyyka = new getPerceptualuksYyKA(this, str);
                this.MediaSessionCompatQueueItem.put(str, getperceptualuksyyka);
            } else if (getperceptualuksyyka.IconCompatParcelizer != null) {
                return null;
            }
            DiskLruCache$Editor diskLruCache$Editor = new DiskLruCache$Editor(this, getperceptualuksyyka);
            getperceptualuksyyka.IconCompatParcelizer = diskLruCache$Editor;
            this.MediaDescriptionCompat.append((CharSequence) "DIRTY");
            this.MediaDescriptionCompat.append(' ');
            this.MediaDescriptionCompat.append((CharSequence) str);
            this.MediaDescriptionCompat.append('\n');
            IconCompatParcelizer(this.MediaDescriptionCompat);
            return diskLruCache$Editor;
        }
    }

    public static void read(File file, File file2, boolean z) throws IOException {
        if (z) {
            IconCompatParcelizer(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void IconCompatParcelizer() {
        while (this.MediaSessionCompatResultReceiverWrapper > this.MediaMetadataCompat) {
            String str = (String) ((Map.Entry) this.MediaSessionCompatQueueItem.entrySet().iterator().next()).getKey();
            synchronized (this) {
                if (this.MediaDescriptionCompat == null) {
                    throw new IllegalStateException("cache is closed");
                }
                getPerceptualuksYyKA getperceptualuksyyka = (getPerceptualuksYyKA) this.MediaSessionCompatQueueItem.get(str);
                if (getperceptualuksyyka != null && getperceptualuksyyka.IconCompatParcelizer == null) {
                    for (int i = 0; i < this.PlaybackStateCompat; i++) {
                        File file = getperceptualuksyyka.write[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.MediaSessionCompatResultReceiverWrapper;
                        long[] jArr = getperceptualuksyyka.read;
                        this.MediaSessionCompatResultReceiverWrapper = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.ParcelableVolumeInfo++;
                    this.MediaDescriptionCompat.append((CharSequence) "REMOVE");
                    this.MediaDescriptionCompat.append(' ');
                    this.MediaDescriptionCompat.append((CharSequence) str);
                    this.MediaDescriptionCompat.append('\n');
                    this.MediaSessionCompatQueueItem.remove(str);
                    if (serializer()) {
                        this.write.submit(this.read);
                    }
                }
            }
        }
    }

    public final void read() throws IOException {
        IconCompatParcelizer(this.RatingCompat);
        Iterator it = this.MediaSessionCompatQueueItem.values().iterator();
        while (it.hasNext()) {
            getPerceptualuksYyKA getperceptualuksyyka = (getPerceptualuksYyKA) it.next();
            DiskLruCache$Editor diskLruCache$Editor = getperceptualuksyyka.IconCompatParcelizer;
            int i = this.PlaybackStateCompat;
            int i2 = 0;
            if (diskLruCache$Editor == null) {
                while (i2 < i) {
                    this.MediaSessionCompatResultReceiverWrapper += getperceptualuksyyka.read[i2];
                    i2++;
                }
            } else {
                getperceptualuksyyka.IconCompatParcelizer = null;
                while (i2 < i) {
                    IconCompatParcelizer(getperceptualuksyyka.write[i2]);
                    IconCompatParcelizer(getperceptualuksyyka.RemoteActionCompatParcelizer[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void read(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.MediaSessionCompatQueueItem;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        getPerceptualuksYyKA getperceptualuksyyka = (getPerceptualuksYyKA) linkedHashMap.get(strSubstring);
        if (getperceptualuksyyka == null) {
            getperceptualuksyyka = new getPerceptualuksYyKA(this, strSubstring);
            linkedHashMap.put(strSubstring, getperceptualuksyyka);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                getperceptualuksyyka.IconCompatParcelizer = new DiskLruCache$Editor(this, getperceptualuksyyka);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        getperceptualuksyyka.MediaSessionCompatQueueItem = true;
        getperceptualuksyyka.IconCompatParcelizer = null;
        if (strArrSplit.length != getperceptualuksyyka.RatingCompat.PlaybackStateCompat) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                getperceptualuksyyka.read[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    public getRelativeuksYyKA(File file, long j) {
        this.serializer = file;
        this.RemoteActionCompatParcelizer = new File(file, "journal");
        this.RatingCompat = new File(file, "journal.tmp");
        this.MediaBrowserCompatMediaItem = new File(file, "journal.bkp");
        this.MediaMetadataCompat = j;
    }

    public static void IconCompatParcelizer(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void IconCompatParcelizer(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void write(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final boolean serializer() {
        int i = this.ParcelableVolumeInfo;
        return i >= 2000 && i >= this.MediaSessionCompatQueueItem.size();
    }

    public final void write() {
        File file = this.RemoteActionCompatParcelizer;
        Rgb rgb = new Rgb(getActiveFocusTargetNode.write(file, new FileInputStream(file)), r8lambdaXklJI9grDcJQF1TPpWoPR7EEs8k.IconCompatParcelizer);
        try {
            String strSerializer = rgb.serializer();
            String strSerializer2 = rgb.serializer();
            String strSerializer3 = rgb.serializer();
            String strSerializer4 = rgb.serializer();
            String strSerializer5 = rgb.serializer();
            if (!"libcore.io.DiskLruCache".equals(strSerializer) || !"1".equals(strSerializer2) || !Integer.toString(this.IconCompatParcelizer).equals(strSerializer3) || !Integer.toString(this.PlaybackStateCompat).equals(strSerializer4) || !"".equals(strSerializer5)) {
                throw new IOException("unexpected journal header: [" + strSerializer + ", " + strSerializer2 + ", " + strSerializer4 + ", " + strSerializer5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    read(rgb.serializer());
                    i++;
                } catch (EOFException unused) {
                    this.ParcelableVolumeInfo = i - this.MediaSessionCompatQueueItem.size();
                    if (rgb.IconCompatParcelizer == -1) {
                        RemoteActionCompatParcelizer();
                    } else {
                        this.MediaDescriptionCompat = new BufferedWriter(new OutputStreamWriter(getPositionInRoot.IconCompatParcelizer(file, new FileOutputStream(file, true), true), r8lambdaXklJI9grDcJQF1TPpWoPR7EEs8k.IconCompatParcelizer));
                    }
                    try {
                        rgb.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                rgb.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public static getRelativeuksYyKA RemoteActionCompatParcelizer(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    read(file2, file3, false);
                }
            }
            getRelativeuksYyKA getrelativeuksyyka = new getRelativeuksYyKA(file, j);
            if (getrelativeuksyyka.RemoteActionCompatParcelizer.exists()) {
                try {
                    getrelativeuksyyka.write();
                    getrelativeuksyyka.read();
                    return getrelativeuksyyka;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    getrelativeuksyyka.close();
                    r8lambdaXklJI9grDcJQF1TPpWoPR7EEs8k.IconCompatParcelizer(getrelativeuksyyka.serializer);
                }
            }
            file.mkdirs();
            getRelativeuksYyKA getrelativeuksyyka2 = new getRelativeuksYyKA(file, j);
            getrelativeuksyyka2.RemoteActionCompatParcelizer();
            return getrelativeuksyyka2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("maxSize <= 0");
        return null;
    }
}
