package o;

import io.sentry.SentryOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaYUcla_T2qX_wkQ_VCWtu0Z3x1UI implements r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Map serializer;
    public final SentryOptions write;

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final BannerViewExternalSyntheticLambda2 read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8Write;
        String str;
        Long l;
        int i = this.IconCompatParcelizer;
        SentryOptions sentryOptions = this.write;
        Map map = this.serializer;
        if (i != 0) {
            if (!getUriActionForCard.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) || (r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8Write = bannerViewExternalSyntheticLambda2.write()) == null || (str = r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8Write.RemoteActionCompatParcelizer) == null || (l = r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8Write.read) == null) {
                return bannerViewExternalSyntheticLambda2;
            }
            Long l2 = (Long) map.get(str);
            if (l2 == null || l2.equals(l)) {
                map.put(str, l);
                return bannerViewExternalSyntheticLambda2;
            }
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Event %s has been dropped due to multi-threaded deduplication", bannerViewExternalSyntheticLambda2.MediaMetadataCompat);
            executelambda4Var.RemoteActionCompatParcelizer("sentry:eventDropReason", io.sentry.hints.RemoteActionCompatParcelizer.MULTITHREADED_DEDUPLICATION);
            return null;
        }
        if (!sentryOptions.isEnableDeduplication()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return bannerViewExternalSyntheticLambda2;
        }
        Throwable thIconCompatParcelizer = bannerViewExternalSyntheticLambda2.IconCompatParcelizer();
        if (thIconCompatParcelizer == null) {
            return bannerViewExternalSyntheticLambda2;
        }
        if (!map.containsKey(thIconCompatParcelizer)) {
            ArrayList arrayList = new ArrayList();
            for (Throwable cause = thIconCompatParcelizer; cause.getCause() != null; cause = cause.getCause()) {
                arrayList.add(cause.getCause());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (map.containsKey(it.next())) {
                }
            }
            map.put(thIconCompatParcelizer, null);
            return bannerViewExternalSyntheticLambda2;
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", bannerViewExternalSyntheticLambda2.MediaMetadataCompat);
        return null;
    }

    public r8lambdaYUcla_T2qX_wkQ_VCWtu0Z3x1UI(SentryOptions sentryOptions, int i) {
        this.IconCompatParcelizer = i;
        if (i != 1) {
            this.serializer = Collections.synchronizedMap(new WeakHashMap());
            this.write = sentryOptions;
        } else {
            this.serializer = Collections.synchronizedMap(new HashMap());
            this.write = sentryOptions;
        }
    }
}
