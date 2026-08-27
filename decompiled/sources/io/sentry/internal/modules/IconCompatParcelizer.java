package io.sentry.internal.modules;

import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.UriActionExternalSyntheticLambda4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IconCompatParcelizer implements RemoteActionCompatParcelizer {
    public static final Charset read = Charset.forName(Constants.ENCODING);
    public final io.sentry.util.RemoteActionCompatParcelizer MediaBrowserCompatMediaItem = new io.sentry.util.RemoteActionCompatParcelizer();
    public volatile Map MediaDescriptionCompat = null;
    public final BrazeActionParserExternalSyntheticLambda0 MediaSessionCompatQueueItem;

    public abstract Map RemoteActionCompatParcelizer();

    public final TreeMap RemoteActionCompatParcelizer(InputStream inputStream) {
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.MediaSessionCompatQueueItem;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, read));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error extracting modules.", e);
            return treeMap;
        } catch (RuntimeException e2) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }

    @Override // io.sentry.internal.modules.RemoteActionCompatParcelizer
    public final Map read() {
        if (this.MediaDescriptionCompat == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
            try {
                if (this.MediaDescriptionCompat == null) {
                    this.MediaDescriptionCompat = RemoteActionCompatParcelizer();
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.MediaDescriptionCompat;
    }

    public IconCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this.MediaSessionCompatQueueItem = brazeActionParserExternalSyntheticLambda0;
    }
}
