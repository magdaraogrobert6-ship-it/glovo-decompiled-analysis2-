package o;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerViewcreateBannerWebViewClientListener1 {
    public static volatile BannerViewcreateBannerWebViewClientListener1 read;
    public static final io.sentry.util.RemoteActionCompatParcelizer serializer = new io.sentry.util.RemoteActionCompatParcelizer();
    public static volatile Boolean IconCompatParcelizer = null;
    public static final io.sentry.util.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
    public final CopyOnWriteArraySet write = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet MediaDescriptionCompat = new CopyOnWriteArraySet();

    public final void IconCompatParcelizer(String str, String str2) {
        this.MediaDescriptionCompat.add(new io.sentry.protocol.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw(str, str2));
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = RemoteActionCompatParcelizer.serializer();
        try {
            IconCompatParcelizer = null;
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

    public final void read(String str) {
        setNativeShader.read(str, "integration is required.");
        this.write.add(str);
    }

    public static BannerViewcreateBannerWebViewClientListener1 RemoteActionCompatParcelizer() {
        if (read == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = serializer.serializer();
            try {
                if (read == null) {
                    read = new BannerViewcreateBannerWebViewClientListener1();
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
        return read;
    }

    public final boolean read(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        Boolean bool = IconCompatParcelizer;
        if (bool != null) {
            return bool.booleanValue();
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = RemoteActionCompatParcelizer.serializer();
        try {
            boolean z = false;
            for (io.sentry.protocol.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdavcwjfxdisgcircy4i008voij_lw : this.MediaDescriptionCompat) {
                if (r8lambdavcwjfxdisgcircy4i008voij_lw.IconCompatParcelizer.startsWith("maven:io.sentry:") && !"8.32.0".equalsIgnoreCase(r8lambdavcwjfxdisgcircy4i008voij_lw.RemoteActionCompatParcelizer)) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", r8lambdavcwjfxdisgcircy4i008voij_lw.IconCompatParcelizer, "8.32.0", r8lambdavcwjfxdisgcircy4i008voij_lw.RemoteActionCompatParcelizer);
                    z = true;
                }
            }
            if (z) {
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR;
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            IconCompatParcelizer = Boolean.valueOf(z);
            uriActionExternalSyntheticLambda4Serializer.close();
            return z;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
