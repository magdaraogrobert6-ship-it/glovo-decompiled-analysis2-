package o;

/* JADX INFO: loaded from: classes2.dex */
public enum getChildrenForSearch {
    PURPOSE_CRYPTO(3),
    PURPOSE_SIGN(12),
    PURPOSE_ALL(15);

    private final int value;

    public int getValue() {
        return this.value;
    }

    public static boolean containsPurpose(getChildrenForSearch getchildrenforsearch, getChildrenForSearch getchildrenforsearch2) {
        int i = getchildrenforsearch.value;
        int i2 = getchildrenforsearch2.value;
        return (i & i2) == i2;
    }

    getChildrenForSearch(int i) {
        this.value = i;
    }
}
