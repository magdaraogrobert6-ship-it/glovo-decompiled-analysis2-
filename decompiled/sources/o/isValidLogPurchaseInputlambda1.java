package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.w$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import io.grpc.Status;
import io.grpc.internal.DelayedStream$3;
import io.grpc.internal.JndiResourceResolverFactory;
import io.grpc.internal.ServiceConfigUtil;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.sentry.CombinedScopeView;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;
import kotlin.ranges.RangesKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLogPurchaseInputlambda1 extends r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc {
    public static final boolean IconCompatParcelizer;
    public static String MediaDescriptionCompat;
    public static final java.util.logging.Logger MediaMetadataCompat;
    public static final boolean MediaSessionCompatQueueItem;
    public static final boolean RatingCompat;
    public static final Set read;
    public final int ComponentActivity;
    public final BrazeWebViewClientsetWebViewClientStateListener11 MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final long ParcelableVolumeInfo;
    public Executor PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public RangesKt ResultReceiver;
    public final handleUrlOverride r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final visitSubtreeYYKmhodefault r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final setWebViewClientStateListener r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final getMethodQuietlylambda1 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final Random r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new Random();
    public volatile isValidLogPurchaseInputlambda4 MediaBrowserCompatMediaItem = isValidLogPurchaseInputlambda4.INSTANCE;
    public final AtomicReference r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new AtomicReference();

    public final List MediaDescriptionCompat() {
        Exception e = null;
        try {
            try {
                List<InetAddress> listResolveAddress = this.MediaBrowserCompatMediaItem.resolveAddress(this.MediaSessionCompatToken);
                ArrayList arrayList = new ArrayList(listResolveAddress.size());
                Iterator<InetAddress> it = listResolveAddress.iterator();
                while (it.hasNext()) {
                    arrayList.add(new r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE(new InetSocketAddress(it.next(), this.ComponentActivity)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e2) {
                e = e2;
                requireView.read(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (e != null) {
                MediaMetadataCompat.log(Level.FINE, "Address resolution failure", (Throwable) e);
            }
            throw th;
        }
    }

    @Override // o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc
    public final String serializer() {
        return this.PlaybackStateCompatCustomAction;
    }

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(isValidLogPurchaseInputlambda1.class.getName());
        MediaMetadataCompat = logger;
        read = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        IconCompatParcelizer = Boolean.parseBoolean(property);
        MediaSessionCompatQueueItem = Boolean.parseBoolean(property2);
        RatingCompat = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, isValidLogPurchaseInputlambda1.class.getClassLoader()).asSubclass(JndiResourceResolverFactory.class).getConstructor(null).newInstance(null).getClass();
                    throw new ClassCastException();
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
    }

    public static Map IconCompatParcelizer(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            Verify.IconCompatParcelizer("Bad key: %s", entry, read.contains(entry.getKey()));
        }
        List listRemoteActionCompatParcelizer = getLocalHtmlUrlFromRemoteUrllambda5.RemoteActionCompatParcelizer("clientLanguage", map);
        if (listRemoteActionCompatParcelizer != null && !listRemoteActionCompatParcelizer.isEmpty()) {
            Iterator it = listRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dIconCompatParcelizer = getLocalHtmlUrlFromRemoteUrllambda5.IconCompatParcelizer("percentage", map);
        if (dIconCompatParcelizer != null) {
            int iIntValue = dIconCompatParcelizer.intValue();
            Verify.IconCompatParcelizer("Bad percentage: %s", dIconCompatParcelizer, iIntValue >= 0 && iIntValue <= 100);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listRemoteActionCompatParcelizer2 = getLocalHtmlUrlFromRemoteUrllambda5.RemoteActionCompatParcelizer("clientHostname", map);
        if (listRemoteActionCompatParcelizer2 != null && !listRemoteActionCompatParcelizer2.isEmpty()) {
            Iterator it2 = listRemoteActionCompatParcelizer2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapMediaBrowserCompatMediaItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("serviceConfig", map);
        if (mapMediaBrowserCompatMediaItem != null) {
            return mapMediaBrowserCompatMediaItem;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList read() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                Object objRemoteActionCompatParcelizer = getLocalHtmlUrlFromRemoteUrl.RemoteActionCompatParcelizer(str.substring(12));
                if (!(objRemoteActionCompatParcelizer instanceof List)) {
                    throw new ClassCastException(m1$$ExternalSyntheticOutline0.m(objRemoteActionCompatParcelizer, "wrong type "));
                }
                List list2 = (List) objRemoteActionCompatParcelizer;
                getLocalHtmlUrlFromRemoteUrllambda5.write(list2);
                arrayList.addAll(list2);
            } else {
                MediaMetadataCompat.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    public final void RatingCompat() {
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 || this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            return;
        }
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            long j = this.ParcelableVolumeInfo;
            if (j != 0 && (j <= 0 || this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.RemoteActionCompatParcelizer() <= j)) {
                return;
            }
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
        this.PlaybackStateCompat.execute(new DelayedStream$3(this, this.ResultReceiver));
    }

    public final CombinedScopeView RemoteActionCompatParcelizer() {
        getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda1;
        getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda2;
        List list;
        getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda3;
        boolean z;
        String str = this.MediaSessionCompatToken;
        CombinedScopeView combinedScopeView = new CombinedScopeView();
        try {
            combinedScopeView.read = MediaDescriptionCompat();
            if (RatingCompat) {
                List list2 = Collections.EMPTY_LIST;
                if (IconCompatParcelizer) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z = MediaSessionCompatQueueItem;
                    } else if (!str.contains(":")) {
                        boolean z2 = true;
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            if (cCharAt != '.') {
                                z2 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z = !z2;
                    }
                    if (z) {
                        m1$$ExternalSyntheticOutline0.m(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get());
                    }
                }
                Object getdeclaredmethodquietlylambda4 = null;
                if (list2.isEmpty()) {
                    MediaMetadataCompat.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (MediaDescriptionCompat == null) {
                        try {
                            MediaDescriptionCompat = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e) {
                            DrawableTransformation.read((Throwable) e);
                            return null;
                        }
                    }
                    String str2 = MediaDescriptionCompat;
                    try {
                        Iterator it = read().iterator();
                        Map mapIconCompatParcelizer = null;
                        while (it.hasNext()) {
                            try {
                                mapIconCompatParcelizer = IconCompatParcelizer((Map) it.next(), random, str2);
                                if (mapIconCompatParcelizer != null) {
                                    break;
                                }
                            } catch (RuntimeException e2) {
                                getdeclaredmethodquietlylambda1 = new getDeclaredMethodQuietlylambda1(Status.ParcelableVolumeInfo.IconCompatParcelizer("failed to pick service config choice").RemoteActionCompatParcelizer(e2));
                            }
                        }
                        getdeclaredmethodquietlylambda1 = mapIconCompatParcelizer == null ? null : new getDeclaredMethodQuietlylambda1(mapIconCompatParcelizer);
                    } catch (IOException | RuntimeException e3) {
                        getdeclaredmethodquietlylambda1 = new getDeclaredMethodQuietlylambda1(Status.ParcelableVolumeInfo.IconCompatParcelizer("failed to parse TXT records").RemoteActionCompatParcelizer(e3));
                    }
                    if (getdeclaredmethodquietlylambda1 != null) {
                        Status status = getdeclaredmethodquietlylambda1.IconCompatParcelizer;
                        if (status != null) {
                            getdeclaredmethodquietlylambda4 = new getDeclaredMethodQuietlylambda1(status);
                        } else {
                            Map map = (Map) getdeclaredmethodquietlylambda1.write;
                            setWebViewClientStateListener setwebviewclientstatelistener = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                            setwebviewclientstatelistener.getClass();
                            try {
                                logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0 = setwebviewclientstatelistener.RemoteActionCompatParcelizer;
                                logpurchasewithjsonlambda0.getClass();
                                if (map != null) {
                                    try {
                                        list = (List) ServiceConfigUtil.RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 1354250273, new Object[]{ServiceConfigUtil.MediaMetadataCompat(map)}, accessgetSystemHomecp.read(), accessgetSystemHomecp.read(), -1354250273, accessgetSystemHomecp.read());
                                    } catch (RuntimeException e4) {
                                        getdeclaredmethodquietlylambda3 = new getDeclaredMethodQuietlylambda1(Status.ParcelableVolumeInfo.IconCompatParcelizer("can't parse load balancer configuration").RemoteActionCompatParcelizer(e4));
                                    }
                                } else {
                                    list = null;
                                }
                                getdeclaredmethodquietlylambda3 = (list == null || list.isEmpty()) ? null : ServiceConfigUtil.RemoteActionCompatParcelizer(list, (wouldPushPermissionPromptDisplaylambda1) logpurchasewithjsonlambda0.serializer);
                                if (getdeclaredmethodquietlylambda3 != null) {
                                    Status status2 = getdeclaredmethodquietlylambda3.IconCompatParcelizer;
                                    if (status2 != null) {
                                        getdeclaredmethodquietlylambda4 = new getDeclaredMethodQuietlylambda1(status2);
                                    } else {
                                        getdeclaredmethodquietlylambda4 = getdeclaredmethodquietlylambda3.write;
                                    }
                                }
                                getdeclaredmethodquietlylambda2 = new getDeclaredMethodQuietlylambda1(r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8.RemoteActionCompatParcelizer(map, setwebviewclientstatelistener.read, setwebviewclientstatelistener.IconCompatParcelizer, setwebviewclientstatelistener.serializer, getdeclaredmethodquietlylambda4));
                            } catch (RuntimeException e5) {
                                getdeclaredmethodquietlylambda2 = new getDeclaredMethodQuietlylambda1(Status.ParcelableVolumeInfo.IconCompatParcelizer("failed to parse service config").RemoteActionCompatParcelizer(e5));
                            }
                            getdeclaredmethodquietlylambda4 = getdeclaredmethodquietlylambda2;
                        }
                    }
                }
                combinedScopeView.write = getdeclaredmethodquietlylambda4;
            }
            return combinedScopeView;
        } catch (Exception e6) {
            combinedScopeView.RemoteActionCompatParcelizer = Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Unable to resolve host " + str).RemoteActionCompatParcelizer(e6);
            return combinedScopeView;
        }
    }

    public isValidLogPurchaseInputlambda1(String str, r8lambdamu9PbpArBtWlKmW4p9QSsBEPQ_w r8lambdamu9pbparbtwlkmw4p9qssbepq_w, BrazeWebViewClientsetWebViewClientStateListener11 brazeWebViewClientsetWebViewClientStateListener11, visitSubtreeYYKmhodefault visitsubtreeyykmhodefault, boolean z) {
        TextStreamsKt.serializer(r8lambdamu9pbparbtwlkmw4p9qssbepq_w, com.braze.ui.actions.brazeactions.steps.StepData.ARGS);
        this.MediaSessionCompatResultReceiverWrapper = brazeWebViewClientsetWebViewClientStateListener11;
        URI uriCreate = URI.create("//".concat(str));
        TextStreamsKt.read(new Object[]{"Invalid DNS name: %s", str, Boolean.valueOf(uriCreate.getHost() != null)}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
        String authority = uriCreate.getAuthority();
        if (authority == null) {
            int iWrite = MaybeObserveOn.write();
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, iWrite, new Object[]{"nameUri (%s) doesn't have an authority", new Object[]{uriCreate}}, MaybeObserveOn.write()));
            throw null;
        }
        this.PlaybackStateCompatCustomAction = authority;
        this.MediaSessionCompatToken = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.ComponentActivity = r8lambdamu9pbparbtwlkmw4p9qssbepq_w.read;
        } else {
            this.ComponentActivity = uriCreate.getPort();
        }
        handleUrlOverride handleurloverride = r8lambdamu9pbparbtwlkmw4p9qssbepq_w.write;
        TextStreamsKt.serializer(handleurloverride, "proxyDetector");
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = handleurloverride;
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    MediaMetadataCompat.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.ParcelableVolumeInfo = nanos;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = visitsubtreeyykmhodefault;
        getMethodQuietlylambda1 getmethodquietlylambda1 = r8lambdamu9pbparbtwlkmw4p9qssbepq_w.MediaMetadataCompat;
        TextStreamsKt.serializer(getmethodquietlylambda1, "syncContext");
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = getmethodquietlylambda1;
        shouldSkip shouldskip = r8lambdamu9pbparbtwlkmw4p9qssbepq_w.RemoteActionCompatParcelizer;
        this.PlaybackStateCompat = shouldskip;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = shouldskip == null;
        setWebViewClientStateListener setwebviewclientstatelistener = r8lambdamu9pbparbtwlkmw4p9qssbepq_w.RatingCompat;
        TextStreamsKt.serializer(setwebviewclientstatelistener, "serviceConfigParser");
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = setwebviewclientstatelistener;
    }

    @Override // o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc
    public final void IconCompatParcelizer() {
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            return;
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = true;
        Executor executor = this.PlaybackStateCompat;
        if (executor == null || !this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
            return;
        }
        JavascriptInterfaceBase.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, executor);
        this.PlaybackStateCompat = null;
    }

    @Override // o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc
    public final void read(RangesKt rangesKt) {
        TextStreamsKt.RemoteActionCompatParcelizer("already started", this.ResultReceiver == null);
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
            this.PlaybackStateCompat = (Executor) JavascriptInterfaceBase.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper);
        }
        this.ResultReceiver = rangesKt;
        RatingCompat();
    }

    @Override // o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc
    public final void write() {
        TextStreamsKt.RemoteActionCompatParcelizer("not started", this.ResultReceiver != null);
        RatingCompat();
    }
}
