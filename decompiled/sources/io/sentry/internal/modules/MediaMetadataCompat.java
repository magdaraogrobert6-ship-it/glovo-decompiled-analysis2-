package io.sentry.internal.modules;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaMetadataCompat extends IconCompatParcelizer {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final Object RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaMetadataCompat(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        super(brazeActionParserExternalSyntheticLambda0);
        ClassLoader classLoader = MediaMetadataCompat.class.getClassLoader();
        this.RemoteActionCompatParcelizer = io.sentry.util.serializer.read(classLoader);
    }

    @Override // io.sentry.internal.modules.IconCompatParcelizer
    public final Map RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            TreeMap treeMap = new TreeMap();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Map map = ((RemoteActionCompatParcelizer) it.next()).read();
                if (map != null) {
                    treeMap.putAll(map);
                }
            }
            return treeMap;
        }
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.MediaSessionCompatQueueItem;
        TreeMap treeMap2 = new TreeMap();
        try {
            InputStream resourceAsStream = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream == null) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                } else {
                    TreeMap treeMapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(resourceAsStream);
                    resourceAsStream.close();
                    treeMap2 = treeMapRemoteActionCompatParcelizer;
                }
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Access to resources failed.", e);
        } catch (SecurityException e2) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Access to resources denied.", e2);
        }
        return treeMap2;
    }

    public MediaMetadataCompat(List list, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        super(brazeActionParserExternalSyntheticLambda0);
        this.RemoteActionCompatParcelizer = list;
    }
}
