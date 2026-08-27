package o;

/* JADX INFO: loaded from: classes.dex */
public final class hasNonInteropFocusableContent {
    public static final hasNonInteropFocusableContent IconCompatParcelizer = new hasNonInteropFocusableContent(new moveFocusaToIllA(new android.os.LocaleList(new java.util.Locale[0])));
    public final moveFocusaToIllA read;

    public static hasNonInteropFocusableContent RemoteActionCompatParcelizer(String str) {
        if (str == null || str.isEmpty()) {
            return IconCompatParcelizer;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        java.util.Locale[] localeArr = new java.util.Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = java.util.Locale.forLanguageTag(strArrSplit[i]);
        }
        return new hasNonInteropFocusableContent(new moveFocusaToIllA(new android.os.LocaleList(localeArr)));
    }

    public final int hashCode() {
        return this.read.RemoteActionCompatParcelizer.hashCode();
    }

    public final int read() {
        return this.read.RemoteActionCompatParcelizer.size();
    }

    public final java.util.Locale read(int i) {
        return this.read.RemoteActionCompatParcelizer.get(i);
    }

    public final String toString() {
        return this.read.RemoteActionCompatParcelizer.toString();
    }

    public hasNonInteropFocusableContent(moveFocusaToIllA movefocusatoilla) {
        this.read = movefocusatoilla;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hasNonInteropFocusableContent) {
            return this.read.equals(((hasNonInteropFocusableContent) obj).read);
        }
        return false;
    }
}
