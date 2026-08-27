package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.sentiance.okhttp3.logging.HttpLoggingInterceptor$Level;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class isDeviceObjectAllowlistEnabled implements isFirebaseMessagingServiceOnNewTokenRegistrationEnabled {
    public static final Charset read = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public volatile Set IconCompatParcelizer = Collections.EMPTY_SET;
    public volatile HttpLoggingInterceptor$Level serializer = HttpLoggingInterceptor$Level.NONE;
    public final r8lambdawtSqCNaCgTFiayN0V7K3kHylcmQ write;

    public isDeviceObjectAllowlistEnabled(r8lambdawtSqCNaCgTFiayN0V7K3kHylcmQ r8lambdawtsqcnacgtfiayn0v7k3khylcmq) {
        this.write = r8lambdawtsqcnacgtfiayn0v7k3khylcmq;
    }

    @Override // o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled
    public final setShouldPersistWebViewWhenBackgroundingApp serializer(_get_brazeApiKey_lambda1 _get_brazeapikey_lambda1) throws Exception {
        String str;
        String str2;
        String str3;
        HttpLoggingInterceptor$Level httpLoggingInterceptor$Level = this.serializer;
        setSessionTimeout setsessiontimeout = _get_brazeapikey_lambda1.RatingCompat;
        if (httpLoggingInterceptor$Level == HttpLoggingInterceptor$Level.NONE) {
            return _get_brazeapikey_lambda1.serializer(setsessiontimeout);
        }
        boolean z = httpLoggingInterceptor$Level == HttpLoggingInterceptor$Level.BODY;
        boolean z2 = z || httpLoggingInterceptor$Level == HttpLoggingInterceptor$Level.HEADERS;
        setShouldOptInWhenPushAuthorizedandroid_sdk_base_release setshouldoptinwhenpushauthorizedandroid_sdk_base_release = setsessiontimeout.RemoteActionCompatParcelizer;
        boolean z3 = setshouldoptinwhenpushauthorizedandroid_sdk_base_release != null;
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve = _get_brazeapikey_lambda1.read;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(setsessiontimeout.serializer);
        sb.append(' ');
        sb.append(setsessiontimeout.write);
        String str4 = " ";
        String str5 = "";
        sb.append(r8lambdaik1pft6kfq5yrxiftoy3aewpve != null ? " " + r8lambdaik1pft6kfq5yrxiftoy3aewpve.MediaDescriptionCompat : "");
        String string = sb.toString();
        if (!z2 && z3) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(string, " (");
            sbM.append(setshouldoptinwhenpushauthorizedandroid_sdk_base_release.write());
            sbM.append("-byte body)");
            string = sbM.toString();
        }
        this.write.RemoteActionCompatParcelizer(string);
        if (!z2) {
            z2 = z2;
            str = "-byte body omitted)";
            str4 = " ";
            str2 = "-byte body)";
            str5 = "";
        } else {
            if (!z3) {
                z2 = z2;
                str4 = " ";
            } else {
                if (setshouldoptinwhenpushauthorizedandroid_sdk_base_release.serializer() != null) {
                    this.write.RemoteActionCompatParcelizer("Content-Type: " + setshouldoptinwhenpushauthorizedandroid_sdk_base_release.serializer());
                }
                if (setshouldoptinwhenpushauthorizedandroid_sdk_base_release.write() != -1) {
                    this.write.RemoteActionCompatParcelizer("Content-Length: " + setshouldoptinwhenpushauthorizedandroid_sdk_base_release.write());
                }
            }
            isEphemeralEventsEnabled isephemeraleventsenabled = setsessiontimeout.read;
            int iIconCompatParcelizer = isephemeraleventsenabled.IconCompatParcelizer();
            int i = 0;
            while (i < iIconCompatParcelizer) {
                String str6 = isephemeraleventsenabled.read(i);
                int i2 = iIconCompatParcelizer;
                if (!ConstantKt.CONTENT_TYPE_HEADER.equalsIgnoreCase(str6) && !"Content-Length".equalsIgnoreCase(str6)) {
                    serializer(isephemeraleventsenabled, i);
                }
                i++;
                iIconCompatParcelizer = i2;
            }
            if (z && z3) {
                String strRemoteActionCompatParcelizer = setsessiontimeout.read.RemoteActionCompatParcelizer("Content-Encoding");
                if (strRemoteActionCompatParcelizer != null && !strRemoteActionCompatParcelizer.equalsIgnoreCase("identity") && !strRemoteActionCompatParcelizer.equalsIgnoreCase("gzip")) {
                    this.write.RemoteActionCompatParcelizer("--> END " + setsessiontimeout.serializer + " (encoded body omitted)");
                    str2 = "-byte body)";
                } else {
                    r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                    setshouldoptinwhenpushauthorizedandroid_sdk_base_release.read(r8lambdabeyrnr8p6809bwlboro_stans);
                    Charset charsetForName = read;
                    isHtmlInAppMessageHtmlLinkTargetEnabled ishtmlinappmessagehtmllinktargetenabledSerializer = setshouldoptinwhenpushauthorizedandroid_sdk_base_release.serializer();
                    if (ishtmlinappmessagehtmllinktargetenabledSerializer != null) {
                        try {
                            String str7 = ishtmlinappmessagehtmllinktargetenabledSerializer.read;
                            if (str7 != null) {
                                charsetForName = Charset.forName(str7);
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    this.write.RemoteActionCompatParcelizer("");
                    boolean zIconCompatParcelizer = IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans);
                    r8lambdawtSqCNaCgTFiayN0V7K3kHylcmQ r8lambdawtsqcnacgtfiayn0v7k3khylcmq = this.write;
                    if (zIconCompatParcelizer) {
                        r8lambdawtsqcnacgtfiayn0v7k3khylcmq.RemoteActionCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans.write(charsetForName));
                        r8lambdawtSqCNaCgTFiayN0V7K3kHylcmQ r8lambdawtsqcnacgtfiayn0v7k3khylcmq2 = this.write;
                        StringBuilder sb2 = new StringBuilder("--> END ");
                        sb2.append(setsessiontimeout.serializer);
                        sb2.append(" (");
                        sb2.append(setshouldoptinwhenpushauthorizedandroid_sdk_base_release.write());
                        str2 = r9;
                        sb2.append(str2);
                        r8lambdawtsqcnacgtfiayn0v7k3khylcmq2.RemoteActionCompatParcelizer(sb2.toString());
                    } else {
                        str5 = "";
                        str2 = r9;
                        StringBuilder sb3 = new StringBuilder("--> END ");
                        sb3.append(setsessiontimeout.serializer);
                        sb3.append(" (binary ");
                        sb3.append(setshouldoptinwhenpushauthorizedandroid_sdk_base_release.write());
                        str = r8;
                        sb3.append(str);
                        r8lambdawtsqcnacgtfiayn0v7k3khylcmq.RemoteActionCompatParcelizer(sb3.toString());
                    }
                }
                str = "-byte body omitted)";
            } else {
                str5 = "";
                str2 = r9;
                str = r8;
                this.write.RemoteActionCompatParcelizer("--> END " + setsessiontimeout.serializer);
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappSerializer = _get_brazeapikey_lambda1.serializer(setsessiontimeout);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release = setshouldpersistwebviewwhenbackgroundingappSerializer.MediaBrowserCompatMediaItem;
            String str8 = str2;
            long j = setsmallnotificationiconnameandroid_sdk_base_release.read();
            if (j != -1) {
                str3 = j + "-byte";
            } else {
                str3 = "unknown-length";
            }
            r8lambdawtSqCNaCgTFiayN0V7K3kHylcmQ r8lambdawtsqcnacgtfiayn0v7k3khylcmq3 = this.write;
            StringBuilder sb4 = new StringBuilder("<-- ");
            sb4.append(setshouldpersistwebviewwhenbackgroundingappSerializer.serializer);
            sb4.append(setshouldpersistwebviewwhenbackgroundingappSerializer.read.isEmpty() ? str5 : str4 + setshouldpersistwebviewwhenbackgroundingappSerializer.read);
            sb4.append(' ');
            sb4.append(setshouldpersistwebviewwhenbackgroundingappSerializer.write.write);
            sb4.append(" (");
            sb4.append(jNanoTime2);
            sb4.append("ms");
            sb4.append(!z2 ? ff$$ExternalSyntheticOutline0.m(", ", str3, " body") : str5);
            sb4.append(')');
            r8lambdawtsqcnacgtfiayn0v7k3khylcmq3.RemoteActionCompatParcelizer(sb4.toString());
            if (z2) {
                isEphemeralEventsEnabled isephemeraleventsenabled2 = setshouldpersistwebviewwhenbackgroundingappSerializer.RatingCompat;
                int iIconCompatParcelizer2 = isephemeraleventsenabled2.IconCompatParcelizer();
                for (int i3 = 0; i3 < iIconCompatParcelizer2; i3++) {
                    serializer(isephemeraleventsenabled2, i3);
                }
                if (z && com.sentiance.okhttp3.internal.http.e.write(setshouldpersistwebviewwhenbackgroundingappSerializer)) {
                    String strRemoteActionCompatParcelizer2 = setshouldpersistwebviewwhenbackgroundingappSerializer.RatingCompat.RemoteActionCompatParcelizer("Content-Encoding");
                    if (strRemoteActionCompatParcelizer2 != null && !strRemoteActionCompatParcelizer2.equalsIgnoreCase("identity") && !strRemoteActionCompatParcelizer2.equalsIgnoreCase("gzip")) {
                        this.write.RemoteActionCompatParcelizer("<-- END HTTP (encoded body omitted)");
                        return setshouldpersistwebviewwhenbackgroundingappSerializer;
                    }
                    r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7kIconCompatParcelizer = setsmallnotificationiconnameandroid_sdk_base_release.IconCompatParcelizer();
                    r8lambdaoorzolqoybc_uxebbkbnmvlvm7kIconCompatParcelizer.serializer(Long.MAX_VALUE);
                    r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat = r8lambdaoorzolqoybc_uxebbkbnmvlvm7kIconCompatParcelizer.MediaDescriptionCompat();
                    Long lValueOf = null;
                    getFallbackConfigKey getfallbackconfigkey = null;
                    if ("gzip".equalsIgnoreCase(isephemeraleventsenabled2.RemoteActionCompatParcelizer("Content-Encoding"))) {
                        long j2 = r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat.serializer;
                        try {
                            getFallbackConfigKey getfallbackconfigkey2 = new getFallbackConfigKey(r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat.clone());
                            try {
                                r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                                r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat.IconCompatParcelizer(getfallbackconfigkey2);
                                getfallbackconfigkey2.close();
                                lValueOf = Long.valueOf(j2);
                            } catch (Throwable th) {
                                th = th;
                                getfallbackconfigkey = getfallbackconfigkey2;
                                if (getfallbackconfigkey != null) {
                                    getfallbackconfigkey.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Charset charsetForName2 = read;
                    isHtmlInAppMessageHtmlLinkTargetEnabled ishtmlinappmessagehtmllinktargetenabledRemoteActionCompatParcelizer = setsmallnotificationiconnameandroid_sdk_base_release.RemoteActionCompatParcelizer();
                    if (ishtmlinappmessagehtmllinktargetenabledRemoteActionCompatParcelizer != null) {
                        try {
                            String str9 = ishtmlinappmessagehtmllinktargetenabledRemoteActionCompatParcelizer.read;
                            if (str9 != null) {
                                charsetForName2 = Charset.forName(str9);
                            }
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    if (!IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat)) {
                        this.write.RemoteActionCompatParcelizer(str5);
                        this.write.RemoteActionCompatParcelizer("<-- END HTTP (binary " + r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat.serializer + str);
                        return setshouldpersistwebviewwhenbackgroundingappSerializer;
                    }
                    if (j != 0) {
                        this.write.RemoteActionCompatParcelizer(str5);
                        this.write.RemoteActionCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat.clone().write(charsetForName2));
                    }
                    r8lambdawtSqCNaCgTFiayN0V7K3kHylcmQ r8lambdawtsqcnacgtfiayn0v7k3khylcmq4 = this.write;
                    if (lValueOf != null) {
                        r8lambdawtsqcnacgtfiayn0v7k3khylcmq4.RemoteActionCompatParcelizer("<-- END HTTP (" + r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat.serializer + "-byte, " + lValueOf + "-gzipped-byte body)");
                        return setshouldpersistwebviewwhenbackgroundingappSerializer;
                    }
                    r8lambdawtsqcnacgtfiayn0v7k3khylcmq4.RemoteActionCompatParcelizer("<-- END HTTP (" + r8lambdabeyrnr8p6809bwlboro_stansMediaDescriptionCompat.serializer + str8);
                    return setshouldpersistwebviewwhenbackgroundingappSerializer;
                }
                this.write.RemoteActionCompatParcelizer("<-- END HTTP");
            }
            return setshouldpersistwebviewwhenbackgroundingappSerializer;
        } catch (Exception e) {
            this.write.RemoteActionCompatParcelizer("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public final void serializer(isEphemeralEventsEnabled isephemeraleventsenabled, int i) {
        String strWrite = this.IconCompatParcelizer.contains(isephemeraleventsenabled.read(i)) ? "██" : isephemeraleventsenabled.write(i);
        this.write.RemoteActionCompatParcelizer(isephemeraleventsenabled.read(i) + ": " + strWrite);
    }

    public static boolean IconCompatParcelizer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans) {
        try {
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
            long j = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
            r8lambdabeyrnr8p6809bwlboro_stans.read(r8lambdabeyrnr8p6809bwlboro_stans2, 0L, j < 64 ? j : 64L);
            for (int i = 0; i < 16 && !r8lambdabeyrnr8p6809bwlboro_stans2.MediaSessionCompatResultReceiverWrapper(); i++) {
                int iMediaMetadataCompat = r8lambdabeyrnr8p6809bwlboro_stans2.MediaMetadataCompat();
                if (Character.isISOControl(iMediaMetadataCompat) && !Character.isWhitespace(iMediaMetadataCompat)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }
}
