package o;

/* JADX INFO: loaded from: classes.dex */
public final class InvalidateSemantics extends isBetterCandidate_I7lrPNgminorAxisDistance {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final InvalidateSemantics DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile CornerRadiusCompanion PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static void IconCompatParcelizer(InvalidateSemantics invalidateSemantics, long j) {
        invalidateSemantics.valueCase_ = 4;
        invalidateSemantics.value_ = Long.valueOf(j);
    }

    public static void RemoteActionCompatParcelizer(InvalidateSemantics invalidateSemantics, double d) {
        invalidateSemantics.valueCase_ = 7;
        invalidateSemantics.value_ = Double.valueOf(d);
    }

    public static InvalidateSemantics read() {
        return DEFAULT_INSTANCE;
    }

    public static void read(InvalidateSemantics invalidateSemantics, boolean z) {
        invalidateSemantics.valueCase_ = 1;
        invalidateSemantics.value_ = Boolean.valueOf(z);
    }

    public static void serializer(InvalidateSemantics invalidateSemantics, float f) {
        invalidateSemantics.valueCase_ = 2;
        invalidateSemantics.value_ = Float.valueOf(f);
    }

    public static void serializer(InvalidateSemantics invalidateSemantics, int i) {
        invalidateSemantics.valueCase_ = 3;
        invalidateSemantics.value_ = Integer.valueOf(i);
    }

    static {
        InvalidateSemantics invalidateSemantics = new InvalidateSemantics();
        DEFAULT_INSTANCE = invalidateSemantics;
        isBetterCandidate_I7lrPNgminorAxisDistance.IconCompatParcelizer(InvalidateSemantics.class, invalidateSemantics);
    }

    public static generateAndSearchChildren4C6V_qg IconCompatParcelizer() {
        InvalidateSemantics invalidateSemantics = DEFAULT_INSTANCE;
        invalidateSemantics.getClass();
        return (generateAndSearchChildren4C6V_qg) ((isBetterCandidate_I7lrPNgisCandidate) invalidateSemantics.IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.NEW_BUILDER));
    }

    @Override // o.isBetterCandidate_I7lrPNgminorAxisDistance
    public final Object IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance isbettercandidate_i7lrpngweighteddistance) {
        CornerRadiusCompanion isbettercandidatei7lrpng;
        switch (getAlwaysLCbbffg.write[isbettercandidate_i7lrpngweighteddistance.ordinal()]) {
            case 1:
                return new InvalidateSemantics();
            case 2:
                return new generateAndSearchChildren4C6V_qg(DEFAULT_INSTANCE);
            case 3:
                return new lerp3Ry4LBc(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", accesssearchChildren4C6V_qg.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                CornerRadiusCompanion cornerRadiusCompanion = PARSER;
                if (cornerRadiusCompanion != null) {
                    return cornerRadiusCompanion;
                }
                synchronized (InvalidateSemantics.class) {
                    isbettercandidatei7lrpng = PARSER;
                    if (isbettercandidatei7lrpng == null) {
                        isbettercandidatei7lrpng = new isBetterCandidateI7lrPNg();
                        PARSER = isbettercandidatei7lrpng;
                    }
                    break;
                }
                return isbettercandidatei7lrpng;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public final forwardFocusSearch RatingCompat() {
        return forwardFocusSearch.forNumber(this.valueCase_);
    }

    public static void RemoteActionCompatParcelizer(InvalidateSemantics invalidateSemantics, onDispatchEventsCompleted ondispatcheventscompleted) {
        invalidateSemantics.getClass();
        invalidateSemantics.value_ = ondispatcheventscompleted.IconCompatParcelizer();
        invalidateSemantics.valueCase_ = 6;
    }

    public static void RemoteActionCompatParcelizer(InvalidateSemantics invalidateSemantics, String str) {
        invalidateSemantics.getClass();
        invalidateSemantics.valueCase_ = 5;
        invalidateSemantics.value_ = str;
    }

    public final int MediaBrowserCompatMediaItem() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final accesssearchChildren4C6V_qg MediaDescriptionCompat() {
        return this.valueCase_ == 6 ? (accesssearchChildren4C6V_qg) this.value_ : accesssearchChildren4C6V_qg.serializer();
    }

    public final String MediaMetadataCompat() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final long MediaSessionCompatQueueItem() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final double RemoteActionCompatParcelizer() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float serializer() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final boolean write() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }
}
