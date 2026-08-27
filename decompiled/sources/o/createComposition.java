package o;

/* JADX INFO: loaded from: classes2.dex */
public final class createComposition {
    public final String RemoteActionCompatParcelizer;
    public final getAutoClearFocusBehavior4UtRPd4 serializer;

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str != null ? str.hashCode() : 0;
        getAutoClearFocusBehavior4UtRPd4 getautoclearfocusbehavior4utrpd4 = this.serializer;
        return iHashCode + (getautoclearfocusbehavior4utrpd4 != null ? getautoclearfocusbehavior4utrpd4.hashCode() : 0);
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public createComposition(String str, getAutoClearFocusBehavior4UtRPd4 getautoclearfocusbehavior4utrpd4) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = getautoclearfocusbehavior4utrpd4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof createComposition)) {
            return false;
        }
        createComposition createcomposition = (createComposition) obj;
        getAutoClearFocusBehavior4UtRPd4 getautoclearfocusbehavior4utrpd4 = createcomposition.serializer;
        String str = createcomposition.RemoteActionCompatParcelizer;
        if (hashCode() != createcomposition.hashCode()) {
            return false;
        }
        String str2 = this.RemoteActionCompatParcelizer;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            return false;
        }
        getAutoClearFocusBehavior4UtRPd4 getautoclearfocusbehavior4utrpd5 = this.serializer;
        return (getautoclearfocusbehavior4utrpd5 == null && getautoclearfocusbehavior4utrpd4 == null) || (getautoclearfocusbehavior4utrpd5 != null && getautoclearfocusbehavior4utrpd5.equals(getautoclearfocusbehavior4utrpd4));
    }
}
