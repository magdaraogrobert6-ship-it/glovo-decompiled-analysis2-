package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import io.sentry.internal.modules.IconCompatParcelizer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer extends IconCompatParcelizer {
    public final Context RemoteActionCompatParcelizer;

    public serializer(Context context, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        super(brazeActionParserExternalSyntheticLambda0);
        Context applicationContext = context.getApplicationContext();
        this.RemoteActionCompatParcelizer = applicationContext != null ? applicationContext : context;
        new Thread(new Sentry$$ExternalSyntheticLambda5(17, this)).start();
    }

    @Override // io.sentry.internal.modules.IconCompatParcelizer
    public final Map RemoteActionCompatParcelizer() {
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.MediaSessionCompatQueueItem;
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.RemoteActionCompatParcelizer.getAssets().open("sentry-external-modules.txt");
            try {
                TreeMap treeMapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return treeMapRemoteActionCompatParcelizer;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error extracting modules.", e);
            return treeMap;
        }
    }
}
