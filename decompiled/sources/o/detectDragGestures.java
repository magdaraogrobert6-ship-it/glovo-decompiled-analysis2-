package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class detectDragGestures {
    public static final long[] write = {-9187201950435737345L, -1};

    static {
        new onRemeasuredozmzZPI(0);
    }

    public static final int serializer(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int RemoteActionCompatParcelizer(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int IconCompatParcelizer(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int write(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
