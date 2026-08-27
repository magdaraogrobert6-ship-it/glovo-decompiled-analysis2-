package o;

import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setPushDeepLinkBackStackActivityClass {
    public static final setPushDeepLinkBackStackActivityEnabled Companion = new setPushDeepLinkBackStackActivityEnabled();
    public final String a;
    public final String b;

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a + ':' + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPushDeepLinkBackStackActivityClass)) {
            return false;
        }
        setPushDeepLinkBackStackActivityClass setpushdeeplinkbackstackactivityclass = (setPushDeepLinkBackStackActivityClass) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, setpushdeeplinkbackstackactivityclass.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, setpushdeeplinkbackstackactivityclass.b}, getCieXyz.write())).booleanValue();
    }

    public setPushDeepLinkBackStackActivityClass(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release.serializer);
            throw null;
        }
    }

    public setPushDeepLinkBackStackActivityClass(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
