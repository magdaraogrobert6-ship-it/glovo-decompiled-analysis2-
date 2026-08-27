package com.sentiance.okhttp3;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okio.ByteString;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.getShouldAddStatusBarPaddingToInAppMessages;
import o.isAppSetIdReadingEnabled;
import o.r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final g RemoteActionCompatParcelizer = new g(new LinkedHashSet(new ArrayList()), null);
    public final LinkedHashSet read;
    public final getShouldAddStatusBarPaddingToInAppMessages write;

    public final void write(String str, List list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.read.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        if (list2.isEmpty()) {
            return;
        }
        getShouldAddStatusBarPaddingToInAppMessages getshouldaddstatusbarpaddingtoinappmessages = this.write;
        if (getshouldaddstatusbarpaddingtoinappmessages != null) {
            list = getshouldaddstatusbarpaddingtoinappmessages.RemoteActionCompatParcelizer(str, list);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list2.size() > 0) {
                list2.get(0).getClass();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            sb.append("\n    ");
            sb.append(RemoteActionCompatParcelizer(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (list2.get(i3) != null) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                return;
            }
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public g(LinkedHashSet linkedHashSet, getShouldAddStatusBarPaddingToInAppMessages getshouldaddstatusbarpaddingtoinappmessages) {
        this.read = linkedHashSet;
        this.write = getshouldaddstatusbarpaddingtoinappmessages;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(this.write, gVar.write) && this.read.equals(gVar.read);
    }

    public final int hashCode() {
        getShouldAddStatusBarPaddingToInAppMessages getshouldaddstatusbarpaddingtoinappmessages = this.write;
        return this.read.hashCode() + ((getshouldaddstatusbarpaddingtoinappmessages != null ? getshouldaddstatusbarpaddingtoinappmessages.hashCode() : 0) * 31);
    }

    public static String RemoteActionCompatParcelizer(X509Certificate x509Certificate) {
        if (x509Certificate != null) {
            return "sha256/" + ByteString.write(x509Certificate.getPublicKey().getEncoded()).serializer("SHA-256").IconCompatParcelizer();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Certificate pinning requires X509 certificates");
        return null;
    }
}
