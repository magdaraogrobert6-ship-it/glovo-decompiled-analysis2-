package io.sentry.cache;

import com.adjust.sdk.Constants;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryOptions;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.SentryUUID;
import io.sentry.android.core.addContentView;
import io.sentry.hints.MediaBrowserCompatMediaItem;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.BaseBrazeActionStep;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeContentCardUtils;
import o.UriActionExternalSyntheticLambda4;
import o.executelambda4;
import o.getUriActionForCard;
import o.logHtmlClicklambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaB2EfoRxiN347_5B93fxdQV0g;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;
import o.setOnDismissCallback;
import o.setWebviewToEmptylambda0;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteActionCompatParcelizer implements serializer {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    public static final Charset RemoteActionCompatParcelizer = Charset.forName(Constants.ENCODING);
    public final int MediaBrowserCompatMediaItem;
    public final File MediaDescriptionCompat;
    public final SentryOptions MediaMetadataCompat;
    public final CountDownLatch MediaSessionCompatQueueItem;
    public final io.sentry.util.MediaMetadataCompat ParcelableVolumeInfo = new io.sentry.util.MediaMetadataCompat(new SentryTracer$$ExternalSyntheticLambda1(11, this));
    public final io.sentry.util.RemoteActionCompatParcelizer PlaybackStateCompatCustomAction;
    public final WeakHashMap RatingCompat;
    public final io.sentry.util.RemoteActionCompatParcelizer read;

    public final logHtmlClicklambda0 IconCompatParcelizer(SentryEnvelopeItem sentryEnvelopeItem) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.IconCompatParcelizer()), RemoteActionCompatParcelizer));
            try {
                logHtmlClicklambda0 loghtmlclicklambda0 = (logHtmlClicklambda0) ((BaseBrazeActionStep) this.ParcelableVolumeInfo.IconCompatParcelizer()).write(bufferedReader, logHtmlClicklambda0.class);
                bufferedReader.close();
                return loghtmlclicklambda0;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.MediaMetadataCompat.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    @Override // io.sentry.cache.serializer
    public final void IconCompatParcelizer(OkHttpCall$1 okHttpCall$1) {
        setNativeShader.read(okHttpCall$1, "Envelope is required.");
        File file = read(okHttpCall$1);
        boolean zDelete = file.delete();
        SentryOptions sentryOptions = this.MediaMetadataCompat;
        if (zDelete) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Discarding envelope from cache: %s", file.getAbsolutePath());
        } else {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Envelope was not cached or could not be deleted: %s", file.getAbsolutePath());
        }
    }

    public final OkHttpCall$1 RemoteActionCompatParcelizer(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                OkHttpCall$1 okHttpCall$1 = ((BaseBrazeActionStep) this.ParcelableVolumeInfo.IconCompatParcelizer()).read(bufferedInputStream);
                bufferedInputStream.close();
                return okHttpCall$1;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.MediaMetadataCompat.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    public final void RemoteActionCompatParcelizer(File file, logHtmlClicklambda0 loghtmlclicklambda0) {
        String str = loghtmlclicklambda0.MediaBrowserCompatMediaItem;
        SentryOptions sentryOptions = this.MediaMetadataCompat;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, RemoteActionCompatParcelizer));
                try {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((BaseBrazeActionStep) this.ParcelableVolumeInfo.IconCompatParcelizer()).serializer(bufferedWriter, loghtmlclicklambda0);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th5, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        SentryOptions sentryOptions = this.MediaMetadataCompat;
        File[] fileArrWrite = write();
        ArrayList arrayList = new ArrayList(fileArrWrite.length);
        for (File file : fileArrWrite) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((BaseBrazeActionStep) this.ParcelableVolumeInfo.IconCompatParcelizer()).read(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }

    public final void serializer(File file, File file2) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            if (!file.exists()) {
                uriActionExternalSyntheticLambda4Serializer.close();
                return;
            }
            boolean zExists = file2.exists();
            SentryOptions sentryOptions = this.MediaMetadataCompat;
            if (zExists) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error moving current session to previous session.", th);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th2) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean serializer() {
        SentryOptions sentryOptions = this.MediaMetadataCompat;
        try {
            return this.MediaSessionCompatQueueItem.await(sentryOptions.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final File[] write() {
        File file = this.MediaDescriptionCompat;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new read(0));
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.MediaMetadataCompat.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File read(OkHttpCall$1 okHttpCall$1) {
        String str;
        WeakHashMap weakHashMap = this.RatingCompat;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            if (weakHashMap.containsKey(okHttpCall$1)) {
                str = (String) weakHashMap.get(okHttpCall$1);
            } else {
                String strConcat = SentryUUID.IconCompatParcelizer().concat(".envelope");
                weakHashMap.put(okHttpCall$1, strConcat);
                str = strConcat;
            }
            File file = new File(this.MediaDescriptionCompat.getAbsolutePath(), str);
            uriActionExternalSyntheticLambda4Serializer.close();
            return file;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01eb A[EDGE_INSN: B:100:0x01eb->B:101:0x01f1 BREAK  A[LOOP:2: B:36:0x00a8->B:99:0x01dc], PHI: r4 r7 r11
  0x01eb: PHI (r4v18 java.io.File[]) = 
  (r4v17 java.io.File[])
  (r4v17 java.io.File[])
  (r4v17 java.io.File[])
  (r4v17 java.io.File[])
  (r4v17 java.io.File[])
  (r4v17 java.io.File[])
  (r4v17 java.io.File[])
  (r4v22 java.io.File[])
 binds: [B:10:0x0047, B:12:0x0055, B:25:0x0088, B:27:0x0094, B:29:0x0098, B:31:0x009c, B:33:0x00a2, B:288:0x01eb] A[DONT_GENERATE, DONT_INLINE]
  0x01eb: PHI (r7v11 int) = (r7v10 int), (r7v10 int), (r7v10 int), (r7v10 int), (r7v10 int), (r7v10 int), (r7v10 int), (r7v13 int) binds: [B:10:0x0047, B:12:0x0055, B:25:0x0088, B:27:0x0094, B:29:0x0098, B:31:0x009c, B:33:0x00a2, B:288:0x01eb] A[DONT_GENERATE, DONT_INLINE]
  0x01eb: PHI (r11v23 java.io.File[]) = 
  (r11v22 java.io.File[])
  (r11v22 java.io.File[])
  (r11v22 java.io.File[])
  (r11v22 java.io.File[])
  (r11v22 java.io.File[])
  (r11v22 java.io.File[])
  (r11v22 java.io.File[])
  (r11v25 java.io.File[])
 binds: [B:10:0x0047, B:12:0x0055, B:25:0x0088, B:27:0x0094, B:29:0x0098, B:31:0x009c, B:33:0x00a2, B:288:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x0368  */
    /* JADX WARN: Code duplicated, block: B:174:0x037b  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b4 A[Catch: all -> 0x03cb, TryCatch #7 {all -> 0x03cb, blocks: (B:177:0x03a4, B:179:0x03b4, B:180:0x03c4), top: B:256:0x03a4, outer: #13 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x03c4 A[Catch: all -> 0x03cb, TRY_LEAVE, TryCatch #7 {all -> 0x03cb, blocks: (B:177:0x03a4, B:179:0x03b4, B:180:0x03c4), top: B:256:0x03a4, outer: #13 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:194:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:197:0x0418  */
    /* JADX WARN: Code duplicated, block: B:199:0x0427  */
    /* JADX WARN: Code duplicated, block: B:201:0x043b  */
    /* JADX WARN: Code duplicated, block: B:202:0x044f  */
    /* JADX WARN: Code duplicated, block: B:204:0x045b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0468  */
    /* JADX WARN: Code duplicated, block: B:208:0x047e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0497  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:229:0x0501  */
    /* JADX WARN: Code duplicated, block: B:266:0x0391 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    @Override // io.sentry.cache.serializer
    public boolean write(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var) {
        ?? r14;
        ?? r15;
        Throwable th;
        boolean z;
        Date dateIconCompatParcelizer;
        Date date;
        boolean z2;
        OkHttpCall$1 okHttpCall$2;
        boolean z3;
        File file;
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco;
        ?? r9;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Iterable iterable;
        File file2;
        SentryEnvelopeItem sentryEnvelopeItem;
        r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g;
        r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g2;
        BufferedReader bufferedReader;
        logHtmlClicklambda0 loghtmlclicklambda0;
        File[] fileArr;
        int i;
        File[] fileArr2;
        logHtmlClicklambda0 loghtmlclicklambda0IconCompatParcelizer;
        Boolean bool;
        int i2;
        SentryEnvelopeItem sentryEnvelopeItemIconCompatParcelizer;
        logHtmlClicklambda0 loghtmlclicklambda0IconCompatParcelizer2;
        setNativeShader.read(okHttpCall$1, "Envelope is required.");
        File[] fileArrWrite = write();
        int length = fileArrWrite.length;
        io.sentry.util.MediaMetadataCompat mediaMetadataCompat = this.ParcelableVolumeInfo;
        SentryOptions sentryOptions = this.MediaMetadataCompat;
        int i3 = this.MediaBrowserCompatMediaItem;
        int i4 = 0;
        if (length >= i3) {
            String str = "Cache folder if full (respecting maxSize). Rotating files";
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i5 = (length - i3) + 1;
            if (fileArrWrite.length > 1) {
                Arrays.sort(fileArrWrite, new write(0));
            }
            File[] fileArr3 = (File[]) Arrays.copyOfRange(fileArrWrite, i5, length);
            int i6 = 0;
            r15 = str;
            while (i6 < i5) {
                File file3 = fileArrWrite[i6];
                OkHttpCall$1 okHttpCall$1RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(file3);
                String str2 = "File can't be deleted: %s";
                if (okHttpCall$1RemoteActionCompatParcelizer == null) {
                    fileArr = fileArrWrite;
                    i = i5;
                    fileArr2 = fileArr3;
                    break;
                }
                Iterable iterable2 = (Iterable) okHttpCall$1RemoteActionCompatParcelizer.serializer;
                if (!iterable2.iterator().hasNext()) {
                    fileArr = fileArrWrite;
                    i = i5;
                    fileArr2 = fileArr3;
                    break;
                }
                sentryOptions.getClientReportRecorder().IconCompatParcelizer(io.sentry.clientreport.read.CACHE_OVERFLOW, okHttpCall$1RemoteActionCompatParcelizer);
                Iterator it = iterable2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        loghtmlclicklambda0IconCompatParcelizer = null;
                        break;
                    }
                    SentryEnvelopeItem sentryEnvelopeItem2 = (SentryEnvelopeItem) it.next();
                    if (sentryEnvelopeItem2 != null && sentryEnvelopeItem2.RemoteActionCompatParcelizer.MediaMetadataCompat.equals(r8lambdaB2EfoRxiN347_5B93fxdQV0g.Session)) {
                        loghtmlclicklambda0IconCompatParcelizer = IconCompatParcelizer(sentryEnvelopeItem2);
                        break;
                    }
                }
                if (loghtmlclicklambda0IconCompatParcelizer == null) {
                    fileArr = fileArrWrite;
                    i = i5;
                    fileArr2 = fileArr3;
                    break;
                }
                String str3 = loghtmlclicklambda0IconCompatParcelizer.MediaBrowserCompatMediaItem;
                if (!loghtmlclicklambda0IconCompatParcelizer.PlaybackStateCompat.equals(BrazeContentCardUtils.Ok) || str3 == null || (bool = loghtmlclicklambda0IconCompatParcelizer.MediaSessionCompatQueueItem) == null || !bool.booleanValue()) {
                    fileArr = fileArrWrite;
                    i = i5;
                    fileArr2 = fileArr3;
                    break;
                }
                int length2 = fileArr3.length;
                int i7 = i4;
                while (true) {
                    if (i7 >= length2) {
                        fileArr = fileArrWrite;
                        i = i5;
                        fileArr2 = fileArr3;
                        break;
                    }
                    File file4 = fileArr3[i7];
                    fileArr = fileArrWrite;
                    OkHttpCall$1 okHttpCall$1RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(file4);
                    if (okHttpCall$1RemoteActionCompatParcelizer2 != null) {
                        Iterable iterable3 = (Iterable) okHttpCall$1RemoteActionCompatParcelizer2.serializer;
                        if (iterable3.iterator().hasNext()) {
                            Iterator it2 = iterable3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    i = i5;
                                    i2 = length2;
                                    fileArr2 = fileArr3;
                                    sentryEnvelopeItemIconCompatParcelizer = null;
                                    break;
                                }
                                i = i5;
                                SentryEnvelopeItem sentryEnvelopeItem3 = (SentryEnvelopeItem) it2.next();
                                if (sentryEnvelopeItem3 == null) {
                                    i2 = length2;
                                    fileArr2 = fileArr3;
                                } else {
                                    i2 = length2;
                                    fileArr2 = fileArr3;
                                    if (sentryEnvelopeItem3.RemoteActionCompatParcelizer.MediaMetadataCompat.equals(r8lambdaB2EfoRxiN347_5B93fxdQV0g.Session) && (loghtmlclicklambda0IconCompatParcelizer2 = IconCompatParcelizer(sentryEnvelopeItem3)) != null) {
                                        String str4 = loghtmlclicklambda0IconCompatParcelizer2.MediaBrowserCompatMediaItem;
                                        if (loghtmlclicklambda0IconCompatParcelizer2.PlaybackStateCompat.equals(BrazeContentCardUtils.Ok) && str4 != null) {
                                            Boolean bool2 = loghtmlclicklambda0IconCompatParcelizer2.MediaSessionCompatQueueItem;
                                            if (bool2 != null && bool2.booleanValue()) {
                                                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Session %s has 2 times the init flag.", str3);
                                                break;
                                            }
                                            if (str3 != null && str3.equals(str4)) {
                                                loghtmlclicklambda0IconCompatParcelizer2.MediaSessionCompatQueueItem = Boolean.TRUE;
                                                try {
                                                    sentryEnvelopeItemIconCompatParcelizer = SentryEnvelopeItem.IconCompatParcelizer((BaseBrazeActionStep) mediaMetadataCompat.IconCompatParcelizer(), loghtmlclicklambda0IconCompatParcelizer2);
                                                    try {
                                                        it2.remove();
                                                        break;
                                                    } catch (IOException e) {
                                                        e = e;
                                                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Failed to create new envelope item for the session %s", str3);
                                                        sentryEnvelopeItemIconCompatParcelizer = sentryEnvelopeItemIconCompatParcelizer;
                                                        break;
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    sentryEnvelopeItemIconCompatParcelizer = null;
                                                }
                                            }
                                        }
                                    }
                                }
                                length2 = i2;
                                i5 = i;
                                fileArr3 = fileArr2;
                            }
                            if (sentryEnvelopeItemIconCompatParcelizer != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = iterable3.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add((SentryEnvelopeItem) it3.next());
                                }
                                arrayList.add(sentryEnvelopeItemIconCompatParcelizer);
                                OkHttpCall$1 okHttpCall$3 = new OkHttpCall$1((setOnDismissCallback) okHttpCall$1RemoteActionCompatParcelizer2.write, (List) arrayList);
                                long jLastModified = file4.lastModified();
                                if (!file4.delete()) {
                                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "File can't be deleted: %s", file4.getAbsolutePath());
                                }
                                try {
                                    FileOutputStream fileOutputStream3 = new FileOutputStream(file4);
                                    try {
                                        ((BaseBrazeActionStep) mediaMetadataCompat.IconCompatParcelizer()).write(okHttpCall$3, fileOutputStream3);
                                        file4.setLastModified(jLastModified);
                                        fileOutputStream3.close();
                                        break;
                                    } catch (Throwable th2) {
                                        try {
                                            fileOutputStream3.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to serialize the new envelope to the disk.", th4);
                                    break;
                                }
                            }
                        } else {
                            i = i5;
                            i2 = length2;
                            fileArr2 = fileArr3;
                        }
                    } else {
                        i = i5;
                        i2 = length2;
                        fileArr2 = fileArr3;
                    }
                    i7++;
                    fileArrWrite = fileArr;
                    length2 = i2;
                    i5 = i;
                    fileArr3 = fileArr2;
                }
                if (!file3.delete()) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "File can't be deleted: %s", file3.getAbsolutePath());
                }
                i6++;
                fileArrWrite = fileArr;
                i5 = i;
                fileArr3 = fileArr2;
                i4 = 0;
                r15 = str2;
            }
        }
        File file5 = this.MediaDescriptionCompat;
        File file6 = new File(file5.getAbsolutePath(), "session.json");
        File file7 = new File(file5.getAbsolutePath(), "previous_session.json");
        if (pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(executelambda4Var, MediaBrowserCompatMediaItem.class) && !file6.delete()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        boolean zIsInstance = io.sentry.hints.IconCompatParcelizer.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"));
        Charset charset = RemoteActionCompatParcelizer;
        if (zIsInstance || io.sentry.hints.RatingCompat.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
            Object obj = executelambda4Var.read("sentry:typeCheckHint");
            File file8 = new File(file5.getAbsolutePath(), "previous_session.json");
            if (file8.exists()) {
                BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco2 = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING;
                logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco2, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file8), charset));
                        try {
                            logHtmlClicklambda0 loghtmlclicklambda1 = (logHtmlClicklambda0) ((BaseBrazeActionStep) mediaMetadataCompat.IconCompatParcelizer()).write(bufferedReader2, logHtmlClicklambda0.class);
                            if (loghtmlclicklambda1 != null) {
                                try {
                                    if (obj instanceof io.sentry.hints.IconCompatParcelizer) {
                                        try {
                                            io.sentry.hints.IconCompatParcelizer iconCompatParcelizer = (io.sentry.hints.IconCompatParcelizer) obj;
                                            Long lWrite = iconCompatParcelizer.write();
                                            if (lWrite != null) {
                                                dateIconCompatParcelizer = setNativeShader.IconCompatParcelizer(lWrite.longValue());
                                                Date dateIconCompatParcelizer2 = loghtmlclicklambda1.IconCompatParcelizer();
                                                if (dateIconCompatParcelizer2 == null || dateIconCompatParcelizer.before(dateIconCompatParcelizer2)) {
                                                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco2, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                                    bufferedReader2.close();
                                                    r14 = 1;
                                                }
                                            } else {
                                                dateIconCompatParcelizer = null;
                                            }
                                            loghtmlclicklambda1.serializer(BrazeContentCardUtils.Abnormal, null, true, iconCompatParcelizer.IconCompatParcelizer());
                                            date = dateIconCompatParcelizer;
                                            z2 = true;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            r15 = 1;
                                            try {
                                                bufferedReader2.close();
                                                throw th;
                                            } catch (Throwable th6) {
                                                th.addSuppressed(th6);
                                                throw th;
                                            }
                                        }
                                    } else if (obj instanceof io.sentry.hints.RatingCompat) {
                                        Date dateIconCompatParcelizer3 = setNativeShader.IconCompatParcelizer(((addContentView) ((io.sentry.hints.RatingCompat) obj)).read);
                                        Date dateIconCompatParcelizer4 = loghtmlclicklambda1.IconCompatParcelizer();
                                        if (dateIconCompatParcelizer4 != null && !dateIconCompatParcelizer3.before(dateIconCompatParcelizer4)) {
                                            z2 = true;
                                            loghtmlclicklambda1.serializer(BrazeContentCardUtils.Crashed, null, true, null);
                                            date = dateIconCompatParcelizer3;
                                        } else {
                                            z = true;
                                            sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco2, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                        }
                                    } else {
                                        z2 = true;
                                        date = null;
                                    }
                                    loghtmlclicklambda1.serializer(date);
                                    RemoteActionCompatParcelizer(file8, loghtmlclicklambda1);
                                    z = z2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    th = th;
                                    r15 = r15;
                                    bufferedReader2.close();
                                    throw th;
                                }
                            } else {
                                z = true;
                            }
                            bufferedReader2.close();
                            r14 = z;
                        } catch (Throwable th8) {
                            th = th8;
                            r15 = 1;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error processing previous session.", th);
                        r14 = r15;
                        if (PlaybackStateCompatCustomAction.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                            serializer(file6, file7);
                            okHttpCall$2 = okHttpCall$1;
                            iterable = (Iterable) okHttpCall$2.serializer;
                            if (iterable.iterator().hasNext()) {
                                sentryEnvelopeItem = (SentryEnvelopeItem) iterable.iterator().next();
                                r8lambdab2eforxin347_5b93fxdqv0g = r8lambdaB2EfoRxiN347_5B93fxdQV0g.Session;
                                r8lambdab2eforxin347_5b93fxdqv0g2 = sentryEnvelopeItem.RemoteActionCompatParcelizer.MediaMetadataCompat;
                                if (r8lambdab2eforxin347_5b93fxdqv0g.equals(r8lambdab2eforxin347_5b93fxdqv0g2)) {
                                    try {
                                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.IconCompatParcelizer()), charset));
                                        try {
                                            loghtmlclicklambda0 = (logHtmlClicklambda0) ((BaseBrazeActionStep) mediaMetadataCompat.IconCompatParcelizer()).write(bufferedReader, logHtmlClicklambda0.class);
                                            if (loghtmlclicklambda0 == null) {
                                                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item of type %s returned null by the parser.", r8lambdab2eforxin347_5b93fxdqv0g2);
                                            } else {
                                                RemoteActionCompatParcelizer(file6, loghtmlclicklambda0);
                                            }
                                            bufferedReader.close();
                                        } catch (Throwable th10) {
                                            try {
                                                bufferedReader.close();
                                                throw th10;
                                            } catch (Throwable th11) {
                                                th10.addSuppressed(th11);
                                                throw th10;
                                            }
                                        }
                                    } catch (Throwable th12) {
                                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item failed to process.", th12);
                                    }
                                } else {
                                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Current envelope has a different envelope type %s", r8lambdab2eforxin347_5b93fxdqv0g2);
                                }
                            } else {
                                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Current envelope %s is empty", file6.getAbsolutePath());
                            }
                            if (new File(sentryOptions.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                                z3 = false;
                            } else {
                                file2 = new File(sentryOptions.getCacheDirPath(), "last_crash");
                                if (file2.exists()) {
                                    z3 = false;
                                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                                    if (!file2.delete()) {
                                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                                    }
                                } else {
                                    z3 = false;
                                }
                            }
                            setWebviewToEmptylambda0.RemoteActionCompatParcelizer.IconCompatParcelizer();
                            this.MediaSessionCompatQueueItem.countDown();
                        } else {
                            okHttpCall$2 = okHttpCall$1;
                            z3 = false;
                        }
                        file = read(okHttpCall$1);
                        if (file.exists()) {
                            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Not adding Envelope to offline storage because it already exists: %s", file.getAbsolutePath());
                            return r14;
                        }
                        BrazeActionParserExternalSyntheticLambda0 logger2 = sentryOptions.getLogger();
                        r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                        logger2.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Adding Envelope to offline storage: %s", file.getAbsolutePath());
                        if (file.exists()) {
                            sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
                            if (!file.delete()) {
                                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                            }
                        }
                        try {
                            fileOutputStream2 = new FileOutputStream(file);
                            try {
                                ((BaseBrazeActionStep) mediaMetadataCompat.IconCompatParcelizer()).write(okHttpCall$2, fileOutputStream2);
                                fileOutputStream2.close();
                                r9 = r14;
                                if (getUriActionForCard.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                                    return r9;
                                }
                                try {
                                    fileOutputStream = new FileOutputStream(new File(sentryOptions.getCacheDirPath(), "last_crash"));
                                    try {
                                        fileOutputStream.write(setNativeShader.serializer(setNativeShader.serializer()).getBytes(charset));
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        return r9;
                                    } catch (Throwable th13) {
                                        try {
                                            fileOutputStream.close();
                                            throw th13;
                                        } catch (Throwable th14) {
                                            th13.addSuppressed(th14);
                                            throw th13;
                                        }
                                    }
                                } catch (Throwable th15) {
                                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error writing the crash marker file to the disk", th15);
                                    return r9;
                                }
                            } catch (Throwable th16) {
                                try {
                                    fileOutputStream2.close();
                                    throw th16;
                                } catch (Throwable th17) {
                                    th16.addSuppressed(th17);
                                    throw th16;
                                }
                            }
                        } catch (Throwable th18) {
                            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th18, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
                            r9 = z3;
                        }
                    }
                } catch (Throwable th19) {
                    th = th19;
                    r15 = 1;
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error processing previous session.", th);
                    r14 = r15;
                }
            } else {
                r14 = 1;
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No previous session file to end.", new Object[0]);
            }
        } else {
            r14 = 1;
        }
        if (PlaybackStateCompatCustomAction.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
            serializer(file6, file7);
            okHttpCall$2 = okHttpCall$1;
            iterable = (Iterable) okHttpCall$2.serializer;
            if (iterable.iterator().hasNext()) {
                sentryEnvelopeItem = (SentryEnvelopeItem) iterable.iterator().next();
                r8lambdab2eforxin347_5b93fxdqv0g = r8lambdaB2EfoRxiN347_5B93fxdQV0g.Session;
                r8lambdab2eforxin347_5b93fxdqv0g2 = sentryEnvelopeItem.RemoteActionCompatParcelizer.MediaMetadataCompat;
                if (r8lambdab2eforxin347_5b93fxdqv0g.equals(r8lambdab2eforxin347_5b93fxdqv0g2)) {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.IconCompatParcelizer()), charset));
                    loghtmlclicklambda0 = (logHtmlClicklambda0) ((BaseBrazeActionStep) mediaMetadataCompat.IconCompatParcelizer()).write(bufferedReader, logHtmlClicklambda0.class);
                    if (loghtmlclicklambda0 == null) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item of type %s returned null by the parser.", r8lambdab2eforxin347_5b93fxdqv0g2);
                    } else {
                        RemoteActionCompatParcelizer(file6, loghtmlclicklambda0);
                    }
                    bufferedReader.close();
                } else {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Current envelope has a different envelope type %s", r8lambdab2eforxin347_5b93fxdqv0g2);
                }
            } else {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Current envelope %s is empty", file6.getAbsolutePath());
            }
            if (new File(sentryOptions.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                file2 = new File(sentryOptions.getCacheDirPath(), "last_crash");
                if (file2.exists()) {
                    z3 = false;
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file2.delete()) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                    }
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            setWebviewToEmptylambda0.RemoteActionCompatParcelizer.IconCompatParcelizer();
            this.MediaSessionCompatQueueItem.countDown();
        } else {
            okHttpCall$2 = okHttpCall$1;
            z3 = false;
        }
        file = read(okHttpCall$1);
        if (file.exists()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Not adding Envelope to offline storage because it already exists: %s", file.getAbsolutePath());
            return r14;
        }
        BrazeActionParserExternalSyntheticLambda0 logger3 = sentryOptions.getLogger();
        r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger3.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Adding Envelope to offline storage: %s", file.getAbsolutePath());
        if (file.exists()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        fileOutputStream2 = new FileOutputStream(file);
        ((BaseBrazeActionStep) mediaMetadataCompat.IconCompatParcelizer()).write(okHttpCall$2, fileOutputStream2);
        fileOutputStream2.close();
        r9 = r14;
        if (getUriActionForCard.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
            return r9;
        }
        fileOutputStream = new FileOutputStream(new File(sentryOptions.getCacheDirPath(), "last_crash"));
        fileOutputStream.write(setNativeShader.serializer(setNativeShader.serializer()).getBytes(charset));
        fileOutputStream.flush();
        fileOutputStream.close();
        return r9;
    }

    public RemoteActionCompatParcelizer(SentryOptions sentryOptions, String str, int i) {
        setNativeShader.read(sentryOptions, "SentryOptions is required.");
        this.MediaMetadataCompat = sentryOptions;
        this.MediaDescriptionCompat = new File(str);
        this.MediaBrowserCompatMediaItem = i;
        this.RatingCompat = new WeakHashMap();
        this.read = new io.sentry.util.RemoteActionCompatParcelizer();
        this.PlaybackStateCompatCustomAction = new io.sentry.util.RemoteActionCompatParcelizer();
        this.MediaSessionCompatQueueItem = new CountDownLatch(1);
    }
}
