package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.location.ut;
import com.mapbox.core.exceptions.ServicesException;
import io.sentry.SentryEnvelopeItem;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import o.BannerViewExternalSyntheticLambda0;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda3;
import o.pauseWebviewIfNecessarylambda10;
import o.prune;
import o.r8lambdaB2EfoRxiN347_5B93fxdQV0g;
import o.r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class addOnMultiWindowModeChangedListener implements r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 {
    public final SentryAndroidOptions IconCompatParcelizer;
    public final Context serializer;
    public final ut write;

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final int serializer() {
        return 5;
    }

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final String IconCompatParcelizer() {
        return "Tombstone";
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:230:0x01c6 A[SYNTHETIC] */
    public final BannerViewExternalSyntheticLambda2 RemoteActionCompatParcelizer(long j, BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy;
        File[] fileArr;
        int i;
        String name;
        fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda0;
        int i2;
        int i3;
        int i4;
        String string;
        ut utVar = this.write;
        ArrayList arrayList = (ArrayList) utVar.MediaBrowserCompatMediaItem;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) utVar.RatingCompat;
        int i5 = 0;
        if (!utVar.write) {
            int i6 = 1;
            utVar.write = true;
            String outboxPath = sentryAndroidOptions.getOutboxPath();
            if (outboxPath == null) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            } else {
                File[] fileArrListFiles = new File(outboxPath).listFiles();
                if (fileArrListFiles == null) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
                } else if (fileArrListFiles.length == 0) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No envelope files found in outbox.", new Object[0]);
                } else {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(fileArrListFiles.length));
                    int length = fileArrListFiles.length;
                    int i7 = 0;
                    while (i7 < length) {
                        File file = fileArrListFiles[i7];
                        if (!file.isFile() || (name = file.getName()) == null || name.startsWith("session") || name.startsWith("previous_session") || name.startsWith("startup_crash")) {
                            fileArr = fileArrListFiles;
                            i = length;
                        } else {
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                int i8 = i5;
                                do {
                                    try {
                                        i2 = bufferedInputStream.read();
                                        i3 = 10;
                                        i4 = -1;
                                        if (i2 == -1) {
                                            if (i8 > 0) {
                                                break;
                                            }
                                            i8 = -1;
                                            break;
                                        }
                                        i8++;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileArr = fileArrListFiles;
                                    }
                                } while (i2 != 10);
                                if (i8 < 0) {
                                    bufferedInputStream.close();
                                    fileArr = fileArrListFiles;
                                    i = length;
                                } else {
                                    long j2 = i8;
                                    while (true) {
                                        try {
                                            if (j2 < 209715200) {
                                                StringBuilder sb = new StringBuilder();
                                                while (true) {
                                                    try {
                                                        int i9 = bufferedInputStream.read();
                                                        if (i9 == i4) {
                                                            if (sb.length() <= 0) {
                                                                string = null;
                                                                break;
                                                            }
                                                            string = sb.toString();
                                                            break;
                                                        }
                                                        if (i9 == i3) {
                                                            string = sb.toString();
                                                            break;
                                                        }
                                                        sb.append((char) i9);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        fileArr = fileArrListFiles;
                                                    }
                                                }
                                                if (string != null && !string.isEmpty()) {
                                                    long length2 = string.length() + i6;
                                                    prune pruneVar = utVar.read(string);
                                                    if (pruneVar != null) {
                                                        int i10 = pruneVar.IconCompatParcelizer;
                                                        if ("event".equals(pruneVar.RemoteActionCompatParcelizer)) {
                                                            fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda0Serializer = utVar.serializer(bufferedInputStream, i10, file);
                                                            if (fullydrawnreporter_delegatelambda0Serializer != null) {
                                                                bufferedInputStream.close();
                                                                fullydrawnreporter_delegatelambda0 = fullydrawnreporter_delegatelambda0Serializer;
                                                                fileArr = fileArrListFiles;
                                                                i = length;
                                                            } else {
                                                                fileArr = fileArrListFiles;
                                                            }
                                                        } else {
                                                            fileArr = fileArrListFiles;
                                                            try {
                                                                ut.IconCompatParcelizer(ServicesException.RemoteActionCompatParcelizer(), new Object[]{bufferedInputStream, Long.valueOf(i10)}, -720376203, ServicesException.RemoteActionCompatParcelizer(), 720376203, ServicesException.RemoteActionCompatParcelizer(), ServicesException.RemoteActionCompatParcelizer());
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                i = length;
                                                                Throwable th4 = th;
                                                                try {
                                                                    bufferedInputStream.close();
                                                                } catch (Throwable th5) {
                                                                    th4.addSuppressed(th5);
                                                                }
                                                                throw th4;
                                                            }
                                                        }
                                                        i = length;
                                                        long j3 = i10;
                                                        try {
                                                            int i11 = bufferedInputStream.read();
                                                            if (i11 != -1) {
                                                                j2 = j2 + length2 + j3 + 1;
                                                                if (i11 == 10) {
                                                                    length = i;
                                                                    i3 = 10;
                                                                    i4 = -1;
                                                                    fileArrListFiles = fileArr;
                                                                    i6 = 1;
                                                                }
                                                            }
                                                            bufferedInputStream.close();
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            Throwable th7 = th;
                                                            bufferedInputStream.close();
                                                            throw th7;
                                                        }
                                                    }
                                                }
                                                if (fullydrawnreporter_delegatelambda0 != null) {
                                                    arrayList.add(fullydrawnreporter_delegatelambda0);
                                                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(fullydrawnreporter_delegatelambda0.IconCompatParcelizer));
                                                }
                                            }
                                            bufferedInputStream.close();
                                        } catch (Throwable th8) {
                                            th = th8;
                                            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                            fullydrawnreporter_delegatelambda0 = null;
                                            if (fullydrawnreporter_delegatelambda0 != null) {
                                                arrayList.add(fullydrawnreporter_delegatelambda0);
                                                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(fullydrawnreporter_delegatelambda0.IconCompatParcelizer));
                                            }
                                            i7++;
                                            length = i;
                                            fileArrListFiles = fileArr;
                                            i5 = 0;
                                            i6 = 1;
                                        }
                                        fileArr = fileArrListFiles;
                                        i = length;
                                    }
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                fileArr = fileArrListFiles;
                                i = length;
                            }
                            fullydrawnreporter_delegatelambda0 = null;
                            if (fullydrawnreporter_delegatelambda0 != null) {
                                arrayList.add(fullydrawnreporter_delegatelambda0);
                                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(fullydrawnreporter_delegatelambda0.IconCompatParcelizer));
                            }
                        }
                        i7++;
                        length = i;
                        fileArrListFiles = fileArr;
                        i5 = 0;
                        i6 = 1;
                    }
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(arrayList.size()));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda1 = (fullyDrawnReporter_delegatelambda0) it.next();
                long jAbs = Math.abs(j - fullydrawnreporter_delegatelambda1.IconCompatParcelizer);
                if (jAbs <= DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(jAbs));
                    arrayList.remove(fullydrawnreporter_delegatelambda1);
                    File file2 = fullydrawnreporter_delegatelambda1.write;
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                        try {
                            OkHttpCall$1 okHttpCall$1Write = sentryAndroidOptions.getEnvelopeReader().write(bufferedInputStream2);
                            if (okHttpCall$1Write != null) {
                                Iterator it2 = ((Iterable) okHttpCall$1Write.serializer).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        SentryEnvelopeItem sentryEnvelopeItem = (SentryEnvelopeItem) it2.next();
                                        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Event.equals(sentryEnvelopeItem.RemoteActionCompatParcelizer.MediaMetadataCompat)) {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.IconCompatParcelizer()), StandardCharsets.UTF_8));
                                            try {
                                                BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda3 = (BannerViewExternalSyntheticLambda2) sentryAndroidOptions.getSerializer().write(bufferedReader, BannerViewExternalSyntheticLambda2.class);
                                                if (bannerViewExternalSyntheticLambda3 != null && "native".equals(bannerViewExternalSyntheticLambda3.MediaSessionCompatQueueItem)) {
                                                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy2 = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(bannerViewExternalSyntheticLambda3, file2, okHttpCall$1Write, 12);
                                                    bufferedReader.close();
                                                    bufferedInputStream2.close();
                                                    r8lambdadeozq815xuuwmllyyvm_qv79qy = r8lambdadeozq815xuuwmllyyvm_qv79qy2;
                                                    break;
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
                                            try {
                                                bufferedInputStream2.close();
                                                throw th;
                                            } catch (Throwable th12) {
                                                th.addSuppressed(th12);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                            bufferedInputStream2.close();
                        } catch (Throwable th13) {
                            bufferedInputStream2.close();
                            throw th13;
                        }
                    } catch (Throwable th14) {
                        sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, th14, "Error loading envelope file: %s", file2.getAbsolutePath());
                    }
                }
            }
            r8lambdadeozq815xuuwmllyyvm_qv79qy = null;
            break;
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.IconCompatParcelizer;
        if (r8lambdadeozq815xuuwmllyyvm_qv79qy == null) {
            sentryAndroidOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No matching native event found for tombstone.", new Object[0]);
            return null;
        }
        File file3 = (File) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
        BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions2.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Found matching native event for tombstone, removing from outbox: %s", file3.getName());
        try {
            if (!file3.delete()) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to delete native event file: %s", file3.getAbsolutePath());
                return null;
            }
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Deleted native event file from outbox: %s", file3.getName());
            BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda4 = (BannerViewExternalSyntheticLambda2) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
            ArrayList arrayListRemoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer();
            io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.write;
            ArrayList arrayListSerializer = bannerViewExternalSyntheticLambda2.serializer();
            if (arrayListRemoteActionCompatParcelizer != null && !arrayListRemoteActionCompatParcelizer.isEmpty() && remoteActionCompatParcelizer != null && arrayListSerializer != null) {
                io.sentry.protocol.ParcelableVolumeInfo parcelableVolumeInfo = ((io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) arrayListRemoteActionCompatParcelizer.get(0)).write;
                if (parcelableVolumeInfo != null) {
                    parcelableVolumeInfo.MediaDescriptionCompat = io.sentry.android.core.internal.tombstone.RemoteActionCompatParcelizer.TOMBSTONE_MERGED.getValue();
                }
                bannerViewExternalSyntheticLambda4.ComponentActivity = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(arrayListRemoteActionCompatParcelizer);
                bannerViewExternalSyntheticLambda4.write = remoteActionCompatParcelizer;
                bannerViewExternalSyntheticLambda4.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(arrayListSerializer);
            }
            for (SentryEnvelopeItem sentryEnvelopeItem2 : (Iterable) ((OkHttpCall$1) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer).serializer) {
                try {
                    BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0 = sentryEnvelopeItem2.RemoteActionCompatParcelizer;
                    String str = bannerViewExternalSyntheticLambda0.RemoteActionCompatParcelizer;
                    if (bannerViewExternalSyntheticLambda0.MediaMetadataCompat == r8lambdaB2EfoRxiN347_5B93fxdQV0g.Attachment && str != null) {
                        byte[] bArrIconCompatParcelizer = sentryEnvelopeItem2.IconCompatParcelizer();
                        BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda1 = sentryEnvelopeItem2.RemoteActionCompatParcelizer;
                        try {
                            executelambda4Var.IconCompatParcelizer.add(new getIntentArrayWithConfiguredBackStacklambda3(str, bannerViewExternalSyntheticLambda1.write, bannerViewExternalSyntheticLambda1.serializer, bArrIconCompatParcelizer));
                        } catch (Throwable th15) {
                            th = th15;
                            sentryAndroidOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                        }
                    }
                } catch (Throwable th16) {
                    th = th16;
                }
            }
            return bannerViewExternalSyntheticLambda4;
        } catch (Throwable th17) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th17, "Error deleting native event file: %s", file3.getAbsolutePath());
            return null;
        }
    }

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final boolean read() {
        return this.IconCompatParcelizer.isReportHistoricalTombstones();
    }

    public addOnMultiWindowModeChangedListener(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.IconCompatParcelizer = sentryAndroidOptions;
        this.write = new ut(sentryAndroidOptions);
        this.serializer = context;
    }

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final r8lambdadeOzq815xUUwmlLYYvm_QV79QY co_(ApplicationExitInfo applicationExitInfo, boolean z) {
        SentryAndroidOptions sentryAndroidOptions = this.IconCompatParcelizer;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                return null;
            }
            io.sentry.android.core.internal.tombstone.write writeVar = new io.sentry.android.core.internal.tombstone.write(traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), this.serializer.getApplicationInfo().nativeLibraryDir);
            try {
                BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2IconCompatParcelizer = writeVar.IconCompatParcelizer();
                writeVar.close();
                long timestamp = applicationExitInfo.getTimestamp();
                bannerViewExternalSyntheticLambda2IconCompatParcelizer.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = setNativeShader.IconCompatParcelizer(timestamp);
                addContentView addcontentview = new addContentView(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z);
                executelambda4 executelambda4VarIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(addcontentview);
                try {
                    BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(timestamp, bannerViewExternalSyntheticLambda2IconCompatParcelizer, executelambda4VarIconCompatParcelizer);
                    if (bannerViewExternalSyntheticLambda2RemoteActionCompatParcelizer != null) {
                        bannerViewExternalSyntheticLambda2IconCompatParcelizer = bannerViewExternalSyntheticLambda2RemoteActionCompatParcelizer;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                }
                return new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(bannerViewExternalSyntheticLambda2IconCompatParcelizer, executelambda4VarIconCompatParcelizer, addcontentview, 11);
            } catch (Throwable th2) {
                try {
                    writeVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th4.getMessage());
            return null;
        }
    }

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final Long RemoteActionCompatParcelizer() {
        return AndroidEnvelopeCache.serializer(this.IconCompatParcelizer, "last_tombstone_report", "Tombstone");
    }
}
