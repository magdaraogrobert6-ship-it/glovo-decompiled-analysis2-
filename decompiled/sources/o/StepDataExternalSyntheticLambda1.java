package o;

import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class StepDataExternalSyntheticLambda1 implements Runnable {
    public static final Charset write = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public final SentryOptions IconCompatParcelizer;

    public final Date read(File file) {
        SentryOptions sentryOptions = this.IconCompatParcelizer;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), write));
            try {
                String line = bufferedReader.readLine();
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateWrite = setNativeShader.write(line);
                bufferedReader.close();
                return dateWrite;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        SentryOptions sentryOptions = this.IconCompatParcelizer;
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!sentryOptions.isEnableAutoSessionTracking()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.serializer envelopeDiskCache = sentryOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.RemoteActionCompatParcelizer) && !((io.sentry.cache.RemoteActionCompatParcelizer) envelopeDiskCache).serializer()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        int i = io.sentry.cache.RemoteActionCompatParcelizer.IconCompatParcelizer;
        File file = new File(cacheDirPath, "previous_session.json");
        BaseBrazeActionStep serializer = sentryOptions.getSerializer();
        if (!file.exists()) {
            return;
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), write));
            try {
                logHtmlClicklambda0 loghtmlclicklambda0 = (logHtmlClicklambda0) serializer.write(bufferedReader, logHtmlClicklambda0.class);
                if (loghtmlclicklambda0 == null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    File file2 = new File(sentryOptions.getCacheDirPath(), ".sentry-native/last_crash");
                    BrazeContentCardUtils brazeContentCardUtils = loghtmlclicklambda0.PlaybackStateCompat;
                    BrazeContentCardUtils brazeContentCardUtils2 = BrazeContentCardUtils.Crashed;
                    if (brazeContentCardUtils == brazeContentCardUtils2) {
                        setWebviewToEmptylambda0 setwebviewtoemptylambda0 = setWebviewToEmptylambda0.RemoteActionCompatParcelizer;
                        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = setwebviewtoemptylambda0.read.serializer();
                        try {
                            setwebviewtoemptylambda0.serializer = false;
                            uriActionExternalSyntheticLambda4Serializer.close();
                            setwebviewtoemptylambda0.IconCompatParcelizer();
                        } catch (Throwable th) {
                            try {
                                uriActionExternalSyntheticLambda4Serializer.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else if (file2.exists()) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                        Date date = read(file2);
                        loghtmlclicklambda0.serializer(brazeContentCardUtils2, null, true, null);
                        loghtmlclicklambda0.serializer(date);
                    } else if (loghtmlclicklambda0.IconCompatParcelizer == null) {
                        loghtmlclicklambda0.serializer(setNativeShader.serializer());
                    }
                    if (file2.exists() && !file2.delete()) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                    }
                    internalHeightCallbacklambda0.IconCompatParcelizer().write(new OkHttpCall$1((io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) null, sentryOptions.getSdkVersion(), SentryEnvelopeItem.IconCompatParcelizer(serializer, loghtmlclicklambda0)), new executelambda4());
                }
                bufferedReader.close();
                if (file.delete()) {
                    return;
                }
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to delete the previous session file.", new Object[0]);
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error processing previous session.", th5);
        }
    }

    public StepDataExternalSyntheticLambda1(SentryOptions sentryOptions) {
        this.IconCompatParcelizer = sentryOptions;
    }
}
