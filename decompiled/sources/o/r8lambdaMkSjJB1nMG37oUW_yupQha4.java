package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaMkSjJB1nMG37oUW_yupQha4 implements Closeable, Flushable {
    public boolean civilizedFileSystem;
    public final onCreateWindowlambda3 cleanupQueue;
    public final onCreateWindow cleanupTask;
    public boolean closed;
    public final RecyclableBufferedInputStream directory;
    public final onCreateWindowlambda4 fileSystem;
    public boolean hasJournalErrors;
    public boolean initialized;
    public final RecyclableBufferedInputStream journalFile;
    public final RecyclableBufferedInputStream journalFileBackup;
    public final RecyclableBufferedInputStream journalFileTmp;
    public SingleRequest journalWriter;
    public final LinkedHashMap lruEntries;
    public final long maxSize;
    public boolean mostRecentRebuildFailed;
    public boolean mostRecentTrimFailed;
    public long nextSequenceNumber;
    public int redundantOpCount;
    public long size;
    public static final getInAppMessageEventMap LEGAL_KEY_PATTERN = new getInAppMessageEventMap("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    public final void IconCompatParcelizer() {
        synchronized (this) {
            if (this.closed) {
                throw new IllegalStateException("cache is closed");
            }
        }
    }

    public final void RatingCompat() {
        synchronized (this) {
            SingleRequest singleRequest = this.journalWriter;
            if (singleRequest != null) {
                singleRequest.close();
            }
            int i = 0;
            DateTimeConverter dateTimeConverterWrite = this.fileSystem.write(this.journalFileTmp, false);
            dateTimeConverterWrite.getClass();
            SingleRequest singleRequest2 = new SingleRequest(dateTimeConverterWrite);
            try {
                singleRequest2.read("libcore.io.DiskLruCache");
                singleRequest2.serializer(10);
                singleRequest2.read("1");
                singleRequest2.serializer(10);
                singleRequest2.MediaDescriptionCompat(201105L);
                singleRequest2.serializer(10);
                singleRequest2.MediaDescriptionCompat(2L);
                singleRequest2.serializer(10);
                singleRequest2.serializer(10);
                for (Object obj : this.lruEntries.values()) {
                    obj.getClass();
                    r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) obj;
                    if (r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer != null) {
                        singleRequest2.read(DIRTY);
                        singleRequest2.serializer(32);
                        singleRequest2.read(r8lambdamrruyrdhx_6xlfo9jiaff753450.serializer);
                        singleRequest2.serializer(10);
                    } else {
                        singleRequest2.read(CLEAN);
                        singleRequest2.serializer(32);
                        singleRequest2.read(r8lambdamrruyrdhx_6xlfo9jiaff753450.serializer);
                        for (long j : r8lambdamrruyrdhx_6xlfo9jiaff753450.read) {
                            singleRequest2.serializer(32);
                            singleRequest2.MediaDescriptionCompat(j);
                        }
                        singleRequest2.serializer(10);
                    }
                }
                try {
                    singleRequest2.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    singleRequest2.close();
                } catch (Throwable th3) {
                    markOnScreenCardsAsReadlambda1.read(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            boolean zMediaBrowserCompatMediaItem = this.fileSystem.MediaBrowserCompatMediaItem(this.journalFile);
            onCreateWindowlambda4 oncreatewindowlambda4 = this.fileSystem;
            if (zMediaBrowserCompatMediaItem) {
                oncreatewindowlambda4.write(this.journalFile, this.journalFileBackup);
                this.fileSystem.write(this.journalFileTmp, this.journalFile);
                InAppMessageHtmlBaseViewCompanion.write(this.fileSystem, this.journalFileBackup);
            } else {
                oncreatewindowlambda4.write(this.journalFileTmp, this.journalFile);
            }
            SingleRequest singleRequest3 = this.journalWriter;
            if (singleRequest3 != null) {
                InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(singleRequest3);
            }
            onCreateWindowlambda4 oncreatewindowlambda5 = this.fileSystem;
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.journalFile;
            oncreatewindowlambda5.getClass();
            recyclableBufferedInputStream.getClass();
            this.journalWriter = new SingleRequest(new r8lambdanR6s9bpMqHHF1KzKTWIbxoSaF7s(oncreatewindowlambda5.read(recyclableBufferedInputStream), new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(i, this)));
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        }
    }

    public final r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI RemoteActionCompatParcelizer(long j, String str) {
        synchronized (this) {
            str.getClass();
            RemoteActionCompatParcelizer();
            IconCompatParcelizer();
            RemoteActionCompatParcelizer(str);
            r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) this.lruEntries.get(str);
            if (j != -1 && (r8lambdamrruyrdhx_6xlfo9jiaff753450 == null || r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaBrowserCompatMediaItem != j)) {
                return null;
            }
            if ((r8lambdamrruyrdhx_6xlfo9jiaff753450 != null ? r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer : null) != null) {
                return null;
            }
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450 != null && r8lambdamrruyrdhx_6xlfo9jiaff753450.RatingCompat != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                SingleRequest singleRequest = this.journalWriter;
                singleRequest.getClass();
                singleRequest.read(DIRTY);
                singleRequest.serializer(32);
                singleRequest.read(str);
                singleRequest.serializer(10);
                singleRequest.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (r8lambdamrruyrdhx_6xlfo9jiaff753450 == null) {
                    r8lambdamrruyrdhx_6xlfo9jiaff753450 = new r8lambdamrRUyRDhX_6xLfo9jIAfF753450(this, str);
                    this.lruEntries.put(str, r8lambdamrruyrdhx_6xlfo9jiaff753450);
                }
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, r8lambdamrruyrdhx_6xlfo9jiaff753450);
                r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer = r8lambdalmkbrrgswwtv97obrsj7trj7ai;
                return r8lambdalmkbrrgswwtv97obrsj7trj7ai;
            }
            this.cleanupQueue.read(this.cleanupTask, 0L);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.initialized && !this.closed) {
                Collection collectionValues = this.lruEntries.values();
                collectionValues.getClass();
                for (r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 : (r8lambdamrRUyRDhX_6xLfo9jIAfF753450[]) collectionValues.toArray(new r8lambdamrRUyRDhX_6xLfo9jIAfF753450[0])) {
                    r8lambdamrruyrdhx_6xlfo9jiaff753450.getClass();
                    r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer;
                    if (r8lambdalmkbrrgswwtv97obrsj7trj7ai != null) {
                        r8lambdalmkbrrgswwtv97obrsj7trj7ai.MediaSessionCompatQueueItem();
                    }
                }
                MediaMetadataCompat();
                SingleRequest singleRequest = this.journalWriter;
                if (singleRequest != null) {
                    InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(singleRequest);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        synchronized (this) {
            if (this.initialized) {
                IconCompatParcelizer();
                MediaMetadataCompat();
                SingleRequest singleRequest = this.journalWriter;
                singleRequest.getClass();
                singleRequest.flush();
            }
        }
    }

    public final void read(r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai, boolean z) {
        synchronized (this) {
            r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer, r8lambdalmkbrrgswwtv97obrsj7trj7ai}, getCieXyz.write())).booleanValue()) {
                throw new IllegalStateException("Check failed.");
            }
            if (z && !r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaSessionCompatQueueItem) {
                for (int i = 0; i < 2; i++) {
                    boolean[] zArr = (boolean[]) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer;
                    zArr.getClass();
                    if (!zArr[i]) {
                        r8lambdalmkbrrgswwtv97obrsj7trj7ai.read();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!this.fileSystem.MediaBrowserCompatMediaItem((RecyclableBufferedInputStream) r8lambdamrruyrdhx_6xlfo9jiaff753450.RemoteActionCompatParcelizer.get(i))) {
                        r8lambdalmkbrrgswwtv97obrsj7trj7ai.read();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < 2; i2++) {
                RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) r8lambdamrruyrdhx_6xlfo9jiaff753450.RemoteActionCompatParcelizer.get(i2);
                if (!z || r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaMetadataCompat) {
                    InAppMessageHtmlBaseViewCompanion.write(this.fileSystem, recyclableBufferedInputStream);
                } else if (this.fileSystem.MediaBrowserCompatMediaItem(recyclableBufferedInputStream)) {
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = (RecyclableBufferedInputStream) r8lambdamrruyrdhx_6xlfo9jiaff753450.write.get(i2);
                    this.fileSystem.write(recyclableBufferedInputStream, recyclableBufferedInputStream2);
                    long j = r8lambdamrruyrdhx_6xlfo9jiaff753450.read[i2];
                    Long l = (Long) this.fileSystem.MediaMetadataCompat(recyclableBufferedInputStream2).MediaBrowserCompatMediaItem;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    r8lambdamrruyrdhx_6xlfo9jiaff753450.read[i2] = jLongValue;
                    this.size = (this.size - j) + jLongValue;
                }
            }
            r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer = null;
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaMetadataCompat) {
                IconCompatParcelizer(r8lambdamrruyrdhx_6xlfo9jiaff753450);
                return;
            }
            this.redundantOpCount++;
            SingleRequest singleRequest = this.journalWriter;
            singleRequest.getClass();
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaSessionCompatQueueItem || z) {
                r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaSessionCompatQueueItem = true;
                singleRequest.read(CLEAN);
                singleRequest.serializer(32);
                singleRequest.read(r8lambdamrruyrdhx_6xlfo9jiaff753450.serializer);
                for (long j2 : r8lambdamrruyrdhx_6xlfo9jiaff753450.read) {
                    singleRequest.serializer(32);
                    singleRequest.MediaDescriptionCompat(j2);
                }
                singleRequest.serializer(10);
                if (z) {
                    long j3 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j3;
                    r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaBrowserCompatMediaItem = j3;
                }
            } else {
                this.lruEntries.remove(r8lambdamrruyrdhx_6xlfo9jiaff753450.serializer);
                singleRequest.read(REMOVE);
                singleRequest.serializer(32);
                singleRequest.read(r8lambdamrruyrdhx_6xlfo9jiaff753450.serializer);
                singleRequest.serializer(10);
            }
            singleRequest.flush();
            if (this.size > this.maxSize || serializer()) {
                this.cleanupQueue.read(this.cleanupTask, 0L);
            }
        }
    }

    public final r8lambda0yxD5DkGhVMG1YCzKpa6a1a1ps0 write(String str) {
        synchronized (this) {
            str.getClass();
            RemoteActionCompatParcelizer();
            IconCompatParcelizer();
            RemoteActionCompatParcelizer(str);
            r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) this.lruEntries.get(str);
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450 == null) {
                return null;
            }
            r8lambda0yxD5DkGhVMG1YCzKpa6a1a1ps0 r8lambda0yxd5dkghvmg1yczkpa6a1a1ps0RemoteActionCompatParcelizer = r8lambdamrruyrdhx_6xlfo9jiaff753450.RemoteActionCompatParcelizer();
            if (r8lambda0yxd5dkghvmg1yczkpa6a1a1ps0RemoteActionCompatParcelizer == null) {
                return null;
            }
            this.redundantOpCount++;
            SingleRequest singleRequest = this.journalWriter;
            singleRequest.getClass();
            singleRequest.read(READ);
            singleRequest.serializer(32);
            singleRequest.read(str);
            singleRequest.serializer(10);
            if (serializer()) {
                this.cleanupQueue.read(this.cleanupTask, 0L);
            }
            return r8lambda0yxd5dkghvmg1yczkpa6a1a1ps0RemoteActionCompatParcelizer;
        }
    }

    public static void RemoteActionCompatParcelizer(String str) {
        if (LEGAL_KEY_PATTERN.read(str)) {
            return;
        }
        DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final void IconCompatParcelizer(r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450) {
        SingleRequest singleRequest;
        String str = r8lambdamrruyrdhx_6xlfo9jiaff753450.serializer;
        if (!this.civilizedFileSystem) {
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450.RatingCompat > 0 && (singleRequest = this.journalWriter) != null) {
                singleRequest.read(DIRTY);
                singleRequest.serializer(32);
                singleRequest.read(str);
                singleRequest.serializer(10);
                singleRequest.flush();
            }
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450.RatingCompat > 0 || r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer != null) {
                r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaMetadataCompat = true;
                return;
            }
        }
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer;
        if (r8lambdalmkbrrgswwtv97obrsj7trj7ai != null) {
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.MediaSessionCompatQueueItem();
        }
        for (int i = 0; i < 2; i++) {
            InAppMessageHtmlBaseViewCompanion.write(this.fileSystem, (RecyclableBufferedInputStream) r8lambdamrruyrdhx_6xlfo9jiaff753450.write.get(i));
            long j = this.size;
            long[] jArr = r8lambdamrruyrdhx_6xlfo9jiaff753450.read;
            this.size = j - jArr[i];
            jArr[i] = 0;
        }
        this.redundantOpCount++;
        SingleRequest singleRequest2 = this.journalWriter;
        if (singleRequest2 != null) {
            singleRequest2.read(REMOVE);
            singleRequest2.serializer(32);
            singleRequest2.read(str);
            singleRequest2.serializer(10);
        }
        this.lruEntries.remove(str);
        if (serializer()) {
            this.cleanupQueue.read(this.cleanupTask, 0L);
        }
    }

    public final void MediaMetadataCompat() {
        while (this.size > this.maxSize) {
            for (Object obj : this.lruEntries.values()) {
                obj.getClass();
                r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) obj;
                if (!r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaMetadataCompat) {
                    IconCompatParcelizer(r8lambdamrruyrdhx_6xlfo9jiaff753450);
                }
            }
            return;
        }
        this.mostRecentTrimFailed = false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0060 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x0013, B:12:0x0021, B:13:0x0025, B:14:0x002a, B:36:0x0066, B:38:0x0072, B:48:0x00b7, B:42:0x007d, B:44:0x00b0, B:46:0x00b4, B:47:0x00b6, B:35:0x0060, B:51:0x00be, B:25:0x0050, B:43:0x00a6, B:22:0x004b, B:16:0x003c), top: B:66:0x0001, inners: #0, #5, #6, #8 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00be A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x0013, B:12:0x0021, B:13:0x0025, B:14:0x002a, B:36:0x0066, B:38:0x0072, B:48:0x00b7, B:42:0x007d, B:44:0x00b0, B:46:0x00b4, B:47:0x00b6, B:35:0x0060, B:51:0x00be, B:25:0x0050, B:43:0x00a6, B:22:0x004b, B:16:0x003c), top: B:66:0x0001, inners: #0, #5, #6, #8 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this) {
            TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.MediaBrowserCompatMediaItem(this.journalFileBackup)) {
                boolean zMediaBrowserCompatMediaItem = this.fileSystem.MediaBrowserCompatMediaItem(this.journalFile);
                onCreateWindowlambda4 oncreatewindowlambda4 = this.fileSystem;
                RecyclableBufferedInputStream recyclableBufferedInputStream = this.journalFileBackup;
                if (zMediaBrowserCompatMediaItem) {
                    oncreatewindowlambda4.write(recyclableBufferedInputStream);
                } else {
                    oncreatewindowlambda4.write(recyclableBufferedInputStream, this.journalFile);
                }
            }
            onCreateWindowlambda4 oncreatewindowlambda5 = this.fileSystem;
            RecyclableBufferedInputStream recyclableBufferedInputStream2 = this.journalFileBackup;
            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
            oncreatewindowlambda5.getClass();
            recyclableBufferedInputStream2.getClass();
            DateTimeConverter dateTimeConverterWrite = oncreatewindowlambda5.write(recyclableBufferedInputStream2, false);
            try {
                oncreatewindowlambda5.IconCompatParcelizer.IconCompatParcelizer(recyclableBufferedInputStream2);
                if (dateTimeConverterWrite != null) {
                    try {
                        dateTimeConverterWrite.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (dateTimeConverterWrite != null) {
                    try {
                        dateTimeConverterWrite.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        oncreatewindowlambda5.IconCompatParcelizer.IconCompatParcelizer(recyclableBufferedInputStream2);
                        z = false;
                        this.civilizedFileSystem = z;
                        if (this.fileSystem.MediaBrowserCompatMediaItem(this.journalFile)) {
                            try {
                                write();
                                read();
                                this.initialized = true;
                                return;
                            } catch (IOException e) {
                                getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                                getMaxSafeTopInset.MediaDescriptionCompat.read(5, "DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", e);
                                try {
                                    close();
                                    InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(this.fileSystem, this.directory);
                                    this.closed = false;
                                    RatingCompat();
                                    this.initialized = true;
                                } catch (Throwable th2) {
                                    this.closed = false;
                                    throw th2;
                                }
                            }
                        }
                        RatingCompat();
                        this.initialized = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                oncreatewindowlambda5.IconCompatParcelizer.IconCompatParcelizer(recyclableBufferedInputStream2);
                z = false;
            } catch (Throwable th3) {
                th = th3;
                if (dateTimeConverterWrite != null) {
                    try {
                        dateTimeConverterWrite.close();
                    } catch (Throwable th4) {
                        markOnScreenCardsAsReadlambda1.read(th, th4);
                    }
                }
                if (th != null) {
                    throw th;
                }
                oncreatewindowlambda5.IconCompatParcelizer.IconCompatParcelizer(recyclableBufferedInputStream2);
                z = false;
                this.civilizedFileSystem = z;
                if (this.fileSystem.MediaBrowserCompatMediaItem(this.journalFile)) {
                    write();
                    read();
                    this.initialized = true;
                    return;
                }
                RatingCompat();
                this.initialized = true;
            }
            this.civilizedFileSystem = z;
            if (this.fileSystem.MediaBrowserCompatMediaItem(this.journalFile)) {
                write();
                read();
                this.initialized = true;
                return;
            }
            RatingCompat();
            this.initialized = true;
        }
    }

    public final void read() {
        RecyclableBufferedInputStream recyclableBufferedInputStream = this.journalFileTmp;
        onCreateWindowlambda4 oncreatewindowlambda4 = this.fileSystem;
        InAppMessageHtmlBaseViewCompanion.write(oncreatewindowlambda4, recyclableBufferedInputStream);
        Iterator it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) next;
            int i = 0;
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer == null) {
                while (i < 2) {
                    this.size += r8lambdamrruyrdhx_6xlfo9jiaff753450.read[i];
                    i++;
                }
            } else {
                r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer = null;
                while (i < 2) {
                    InAppMessageHtmlBaseViewCompanion.write(oncreatewindowlambda4, (RecyclableBufferedInputStream) r8lambdamrruyrdhx_6xlfo9jiaff753450.write.get(i));
                    InAppMessageHtmlBaseViewCompanion.write(oncreatewindowlambda4, (RecyclableBufferedInputStream) r8lambdamrruyrdhx_6xlfo9jiaff753450.RemoteActionCompatParcelizer.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public r8lambdaMkSjJB1nMG37oUW_yupQha4(HttpUrlFetcher httpUrlFetcher, RecyclableBufferedInputStream recyclableBufferedInputStream, long j, InAppMessageHtmlFullView inAppMessageHtmlFullView) {
        httpUrlFetcher.getClass();
        inAppMessageHtmlFullView.getClass();
        this.directory = recyclableBufferedInputStream;
        this.fileSystem = new onCreateWindowlambda4(httpUrlFetcher);
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap(0, 0.75f, true);
        this.cleanupQueue = inAppMessageHtmlFullView.read();
        this.cleanupTask = new onCreateWindow(1, ff$$ExternalSyntheticOutline0.m(new StringBuilder(), setWebViewContent.read, " Cache"), this);
        if (j <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("maxSize <= 0");
            throw null;
        }
        this.journalFile = recyclableBufferedInputStream.write("journal");
        this.journalFileTmp = recyclableBufferedInputStream.write("journal.tmp");
        this.journalFileBackup = recyclableBufferedInputStream.write("journal.bkp");
    }

    public final void serializer(String str) throws IOException {
        String strSubstring;
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, ' ', 0, false, 6);
        if (iWrite != -1) {
            int i = iWrite + 1;
            int iWrite2 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, ' ', i, false, 4);
            LinkedHashMap linkedHashMap = this.lruEntries;
            if (iWrite2 == -1) {
                strSubstring = str.substring(i);
                String str2 = REMOVE;
                if (iWrite == str2.length() && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, str2, false)) {
                    linkedHashMap.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i, iWrite2);
            }
            r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) linkedHashMap.get(strSubstring);
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450 == null) {
                r8lambdamrruyrdhx_6xlfo9jiaff753450 = new r8lambdamrRUyRDhX_6xLfo9jIAfF753450(this, strSubstring);
                linkedHashMap.put(strSubstring, r8lambdamrruyrdhx_6xlfo9jiaff753450);
            }
            if (iWrite2 != -1) {
                String str3 = CLEAN;
                if (iWrite == str3.length() && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, str3, false)) {
                    List listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str.substring(iWrite2 + 1), new char[]{' '});
                    r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaSessionCompatQueueItem = true;
                    r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer = null;
                    int size = listRemoteActionCompatParcelizer.size();
                    r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaDescriptionCompat.getClass();
                    if (size == 2) {
                        try {
                            int size2 = listRemoteActionCompatParcelizer.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                r8lambdamrruyrdhx_6xlfo9jiaff753450.read[i2] = Long.parseLong((String) listRemoteActionCompatParcelizer.get(i2));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m("unexpected journal line: ", listRemoteActionCompatParcelizer));
                            return;
                        }
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m("unexpected journal line: ", listRemoteActionCompatParcelizer));
                    return;
                }
            }
            if (iWrite2 == -1) {
                String str4 = DIRTY;
                if (iWrite == str4.length() && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, str4, false)) {
                    r8lambdamrruyrdhx_6xlfo9jiaff753450.IconCompatParcelizer = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, r8lambdamrruyrdhx_6xlfo9jiaff753450);
                    return;
                }
            }
            if (iWrite2 == -1) {
                String str5 = READ;
                if (iWrite == str5.length() && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, str5, false)) {
                    return;
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected journal line: ".concat(str));
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected journal line: ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0117  */
    public final void write() throws Throwable {
        Throwable th;
        onCreateWindowlambda4 oncreatewindowlambda4 = this.fileSystem;
        RecyclableBufferedInputStream recyclableBufferedInputStream = this.journalFile;
        GifDrawableTransformation gifDrawableTransformationRemoteActionCompatParcelizer = Okio.RemoteActionCompatParcelizer(oncreatewindowlambda4.MediaSessionCompatToken(recyclableBufferedInputStream));
        try {
            String strSerializer = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            String strSerializer2 = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            String strSerializer3 = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            String strSerializer4 = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            String strSerializer5 = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(strSerializer) && "1".equals(strSerializer2)) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{String.valueOf(201105), strSerializer3}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{String.valueOf(2), strSerializer4}, getCieXyz.write())).booleanValue() && strSerializer5.length() <= 0) {
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            try {
                                serializer(gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE));
                                i2++;
                            } catch (EOFException unused) {
                                this.redundantOpCount = i2 - this.lruEntries.size();
                                if (gifDrawableTransformationRemoteActionCompatParcelizer.RatingCompat()) {
                                    SingleRequest singleRequest = this.journalWriter;
                                    if (singleRequest != null) {
                                        InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(singleRequest);
                                    }
                                    oncreatewindowlambda4.getClass();
                                    recyclableBufferedInputStream.getClass();
                                    this.journalWriter = new SingleRequest(new r8lambdanR6s9bpMqHHF1KzKTWIbxoSaF7s(oncreatewindowlambda4.read(recyclableBufferedInputStream), new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(i, this)));
                                } else {
                                    RatingCompat();
                                }
                                try {
                                    gifDrawableTransformationRemoteActionCompatParcelizer.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                            }
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strSerializer + ", " + strSerializer2 + ", " + strSerializer4 + ", " + strSerializer5 + ']');
        } catch (Throwable th3) {
            try {
                gifDrawableTransformationRemoteActionCompatParcelizer.close();
            } catch (Throwable th4) {
                markOnScreenCardsAsReadlambda1.read(th3, th4);
            }
            th = th3;
            if (th == null) {
                throw th;
            }
        }
    }

    public final boolean serializer() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }
}
