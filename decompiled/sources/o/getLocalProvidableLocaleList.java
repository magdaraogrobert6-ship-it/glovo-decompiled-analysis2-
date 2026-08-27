package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getLocalProvidableLocaleList {
    public final Object IconCompatParcelizer;
    public final int read;

    public final int hashCode() {
        return (System.identityHashCode(this.IconCompatParcelizer) * 65535) + this.read;
    }

    public getLocalProvidableLocaleList(int i, getElevation getelevation) {
        this.IconCompatParcelizer = getelevation;
        this.read = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getLocalProvidableLocaleList)) {
            return false;
        }
        getLocalProvidableLocaleList getlocalprovidablelocalelist = (getLocalProvidableLocaleList) obj;
        return this.IconCompatParcelizer == getlocalprovidablelocalelist.IconCompatParcelizer && this.read == getlocalprovidablelocalelist.read;
    }
}
