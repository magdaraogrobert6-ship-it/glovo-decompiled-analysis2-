package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import androidx.compose.ui.graphics.Fields;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import o.BannerViewExternalSyntheticLambda2;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda3;
import o.isContentCardsUnreadVisualIndicatorEnabled;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class ComponentActivity implements r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 {
    public final SentryAndroidOptions serializer;

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final int serializer() {
        return 6;
    }

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final String IconCompatParcelizer() {
        return "ANR";
    }

    /* JADX WARN: Code duplicated, block: B:79:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[Catch: all -> 0x00c8, SYNTHETIC, TRY_LEAVE, TryCatch #3 {all -> 0x00c8, blocks: (B:7:0x0017, B:11:0x0026, B:21:0x0046, B:57:0x00c7, B:56:0x00c4, B:52:0x00be, B:9:0x001d, B:13:0x002b, B:20:0x0043, B:48:0x00b9, B:47:0x00b6), top: B:85:0x0017, inners: #0, #5 }] */
    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final r8lambdadeOzq815xUUwmlLYYvm_QV79QY co_(ApplicationExitInfo applicationExitInfo, boolean z) {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = this.serializer;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z2 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(17, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.NO_DUMP);
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[Fields.RotationZ];
                        while (true) {
                            int i = traceInputStream.read(bArr2, 0, Fields.RotationZ);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i);
                            if (traceInputStream != null) {
                                throw th;
                            }
                            try {
                                traceInputStream.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                                throw th;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        traceInputStream.close();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                            try {
                                io.sentry.android.core.internal.threaddump.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = io.sentry.android.core.internal.threaddump.RemoteActionCompatParcelizer.IconCompatParcelizer(bufferedReader);
                                io.sentry.android.core.internal.threaddump.write writeVar = new io.sentry.android.core.internal.threaddump.write(sentryAndroidOptions, z2);
                                writeVar.RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer);
                                ArrayList arrayList = writeVar.read();
                                ArrayList arrayListIconCompatParcelizer = writeVar.IconCompatParcelizer();
                                if (arrayList.isEmpty()) {
                                    iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(17, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.NO_DUMP);
                                    bufferedReader.close();
                                } else {
                                    iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.DUMP, byteArray, arrayList, arrayListIconCompatParcelizer, 17);
                                    bufferedReader.close();
                                }
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to parse ANR thread dump", th4);
                            iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.ERROR, byteArray);
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                }
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM r8lambdaci7dwlt0wnpzj9a3orpjguf1usm = (r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
                if (r8lambdaci7dwlt0wnpzj9a3orpjguf1usm == r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.NO_DUMP) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                    return null;
                }
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
                executelambda4 executelambda4VarIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(r8lambda7ijbvrn0shyidcazufwejfc7yy);
                BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = new BannerViewExternalSyntheticLambda2();
                if (r8lambdaci7dwlt0wnpzj9a3orpjguf1usm == r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.ERROR) {
                    io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = new io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    r8lambda54beh8zsbru0cxi2ccsp2synys.read = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                    bannerViewExternalSyntheticLambda2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54beh8zsbru0cxi2ccsp2synys;
                } else if (r8lambdaci7dwlt0wnpzj9a3orpjguf1usm == r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.DUMP) {
                    bannerViewExternalSyntheticLambda2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8((ArrayList) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer);
                    ArrayList arrayList2 = (ArrayList) iscontentcardsunreadvisualindicatorenabled.read;
                    if (arrayList2 != null) {
                        io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new io.sentry.protocol.RemoteActionCompatParcelizer();
                        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = new ArrayList(arrayList2);
                        bannerViewExternalSyntheticLambda2.write = remoteActionCompatParcelizer;
                    }
                }
                bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL;
                bannerViewExternalSyntheticLambda2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = setNativeShader.IconCompatParcelizer(timestamp);
                if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) iscontentcardsunreadvisualindicatorenabled.write) != null) {
                    executelambda4VarIconCompatParcelizer.MediaSessionCompatQueueItem = new getIntentArrayWithConfiguredBackStacklambda3("thread-dump.txt", "text/plain", "event.attachment", bArr);
                }
                return new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(bannerViewExternalSyntheticLambda2, executelambda4VarIconCompatParcelizer, r8lambda7ijbvrn0shyidcazufwejfc7yy, 11);
            } catch (Throwable th7) {
                if (traceInputStream != null) {
                    throw th7;
                }
                traceInputStream.close();
                throw th7;
            }
        } catch (Throwable th8) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to read ANR thread dump", th8);
            iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(17, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.NO_DUMP);
        }
    }

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final boolean read() {
        return this.serializer.isReportHistoricalAnrs();
    }

    public ComponentActivity(SentryAndroidOptions sentryAndroidOptions) {
        this.serializer = sentryAndroidOptions;
    }

    @Override // io.sentry.android.core.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
    public final Long RemoteActionCompatParcelizer() {
        return AndroidEnvelopeCache.serializer(this.serializer, "last_anr_report", "ANR");
    }
}
