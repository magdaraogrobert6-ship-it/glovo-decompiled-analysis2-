package o;

import com.huawei.hms.framework.common.ContainerUtils;
import io.sentry.SentryOptions;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getIntentArrayWithConfiguredBackStacklambda0 {
    public static final accessgetVoiceAssistcp write = new accessgetVoiceAssistcp(3);
    public final BrazeActionParserExternalSyntheticLambda0 IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public Double MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public Double MediaSessionCompatQueueItem;
    public final io.sentry.util.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final ConcurrentHashMap read;
    public boolean serializer;

    public static String IconCompatParcelizer(Double d) {
        if (RegexKt.write(d, false)) {
            return ((DecimalFormat) write.get()).format(d);
        }
        return null;
    }

    public final String RemoteActionCompatParcelizer(String str) {
        return (String) this.read.get(str);
    }

    public final r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU RemoteActionCompatParcelizer() {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("sentry-trace_id");
        String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer("sentry-replay_id");
        String strRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer("sentry-public_key");
        if (strRemoteActionCompatParcelizer == null || strRemoteActionCompatParcelizer3 == null) {
            return null;
        }
        r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu = new r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU(new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(strRemoteActionCompatParcelizer), strRemoteActionCompatParcelizer3, RemoteActionCompatParcelizer("sentry-release"), RemoteActionCompatParcelizer("sentry-environment"), RemoteActionCompatParcelizer("sentry-user_id"), RemoteActionCompatParcelizer("sentry-transaction"), IconCompatParcelizer(this.MediaSessionCompatQueueItem), RemoteActionCompatParcelizer("sentry-sampled"), strRemoteActionCompatParcelizer2 == null ? null : new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(strRemoteActionCompatParcelizer2), IconCompatParcelizer(this.MediaDescriptionCompat));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RemoteActionCompatParcelizer.serializer();
        try {
            for (Map.Entry entry : this.read.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!getWebViewActivityIntentlambda0.RemoteActionCompatParcelizer.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            r8lambdazwumnezi8cq9pp6w1bgke7nfwtu.RatingCompat = concurrentHashMap;
            return r8lambdazwumnezi8cq9pp6w1bgke7nfwtu;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void write(String str, String str2) {
        if (this.serializer) {
            ConcurrentHashMap concurrentHashMap = this.read;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public getIntentArrayWithConfiguredBackStacklambda0(ConcurrentHashMap concurrentHashMap, Double d, Double d2, String str, boolean z, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this.RemoteActionCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
        this.read = concurrentHashMap;
        this.MediaSessionCompatQueueItem = d;
        this.MediaDescriptionCompat = d2;
        this.IconCompatParcelizer = brazeActionParserExternalSyntheticLambda0;
        this.MediaBrowserCompatMediaItem = str;
        this.serializer = true;
        this.MediaMetadataCompat = z;
    }

    public final void serializer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, SentryOptions sentryOptions, _get_messageWebView_lambda0 _get_messagewebview_lambda0, String str, io.sentry.protocol.ensureViewModelStore ensureviewmodelstore) {
        write("sentry-trace_id", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.toString());
        write("sentry-public_key", sentryOptions.retrieveParsedDsn().serializer);
        write("sentry-release", sentryOptions.getRelease());
        write("sentry-environment", sentryOptions.getEnvironment());
        if (ensureviewmodelstore == null || io.sentry.protocol.ensureViewModelStore.URL.equals(ensureviewmodelstore)) {
            str = null;
        }
        write("sentry-transaction", str);
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 != null && !io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2)) {
            write("sentry-replay_id", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2.toString());
        }
        Double d = _get_messagewebview_lambda0 == null ? null : (Double) _get_messagewebview_lambda0.RemoteActionCompatParcelizer;
        if (this.serializer) {
            this.MediaSessionCompatQueueItem = d;
        }
        Boolean bool = _get_messagewebview_lambda0 == null ? null : (Boolean) _get_messagewebview_lambda0.write;
        write("sentry-sampled", bool == null ? null : bool.toString());
        Double d2 = _get_messagewebview_lambda0 != null ? (Double) _get_messagewebview_lambda0.serializer : null;
        if (this.serializer) {
            this.MediaDescriptionCompat = d2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    public static getIntentArrayWithConfiguredBackStacklambda0 serializer(String str, boolean z, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        boolean z2;
        Double dValueOf;
        Double d;
        boolean z3;
        String str2;
        int i;
        Double dValueOf2;
        String strWrite;
        String str3 = com.adjust.sdk.Constants.ENCODING;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z4 = false;
        if (str != null) {
            try {
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                int i3 = 0;
                z3 = false;
                dValueOf = null;
                d = null;
                while (i3 < length) {
                    try {
                        String str4 = strArrSplit[i3];
                        if (str4.trim().startsWith("sentry-")) {
                            try {
                                int iIndexOf = str4.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                                String strTrim = str4.substring(i2, iIndexOf).trim();
                                String strDecode = URLDecoder.decode(strTrim, str3);
                                String strDecode2 = URLDecoder.decode(str4.substring(iIndexOf + 1).trim(), str3);
                                try {
                                    if ("sentry-sample_rate".equals(strDecode)) {
                                        if (strDecode2 != null) {
                                            try {
                                                double d2 = Double.parseDouble(strDecode2);
                                                str2 = str3;
                                                try {
                                                    try {
                                                        dValueOf2 = RegexKt.write(Double.valueOf(d2), false) ? Double.valueOf(d2) : null;
                                                    } catch (NumberFormatException unused) {
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    i = 0;
                                                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to decode baggage key value pair %s", str4);
                                                    i3++;
                                                    i2 = i;
                                                    str3 = str2;
                                                }
                                            } catch (NumberFormatException unused2) {
                                                str2 = str3;
                                            }
                                        } else {
                                            str2 = str3;
                                        }
                                        d = dValueOf2;
                                        i = 0;
                                    } else {
                                        str2 = str3;
                                        if (!"sentry-sample_rand".equals(strDecode)) {
                                            i = 0;
                                            concurrentHashMap.put(strDecode, strDecode2);
                                        } else if (strDecode2 != null) {
                                            try {
                                                double d3 = Double.parseDouble(strDecode2);
                                                i = 0;
                                                i = 0;
                                                i = 0;
                                                try {
                                                    dValueOf = RegexKt.write(Double.valueOf(d3), false) ? Double.valueOf(d3) : null;
                                                } catch (NumberFormatException unused3) {
                                                }
                                            } catch (NumberFormatException unused4) {
                                                i = 0;
                                            }
                                        } else {
                                            i = 0;
                                        }
                                    }
                                    try {
                                        if (!"sentry-sample_rand".equalsIgnoreCase(strTrim)) {
                                            z3 = true;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to decode baggage key value pair %s", str4);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str2 = str3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str2 = str3;
                                i = i2;
                            }
                        } else {
                            str2 = str3;
                            i = i2;
                            if (z) {
                                arrayList.add(str4.trim());
                            }
                        }
                        i3++;
                        i2 = i;
                        str3 = str2;
                    } catch (Throwable th5) {
                        th = th5;
                        z2 = z3;
                        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to decode baggage header %s", str);
                        z3 = z2;
                        z4 = z3;
                        if (arrayList.isEmpty()) {
                            strWrite = null;
                        } else {
                            strWrite = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(arrayList);
                        }
                        return new getIntentArrayWithConfiguredBackStacklambda0(concurrentHashMap, d, dValueOf, strWrite, z4, brazeActionParserExternalSyntheticLambda0);
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                z2 = false;
                dValueOf = null;
                d = null;
            }
            z4 = z3;
        } else {
            dValueOf = null;
            d = null;
        }
        if (arrayList.isEmpty()) {
            strWrite = null;
        } else {
            strWrite = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(arrayList);
        }
        return new getIntentArrayWithConfiguredBackStacklambda0(concurrentHashMap, d, dValueOf, strWrite, z4, brazeActionParserExternalSyntheticLambda0);
    }

    public getIntentArrayWithConfiguredBackStacklambda0(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this(new ConcurrentHashMap(), null, null, null, false, brazeActionParserExternalSyntheticLambda0);
    }
}
