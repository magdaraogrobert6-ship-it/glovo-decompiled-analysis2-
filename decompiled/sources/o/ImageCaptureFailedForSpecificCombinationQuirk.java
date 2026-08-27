package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PREVIEW' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ImageCaptureFailedForSpecificCombinationQuirk[] $VALUES;
    public static final ImageCaptureFailedForSpecificCombinationQuirk MAXIMUM_16_9;
    public static final ImageCaptureFailedForSpecificCombinationQuirk MAXIMUM_4_3;
    public static final ImageCaptureFailedForSpecificCombinationQuirk NOT_SUPPORT;
    public static final ImageCaptureFailedForSpecificCombinationQuirk PREVIEW;
    public static final ImageCaptureFailedForSpecificCombinationQuirk RECORD;
    public static final ImageCaptureFailedForSpecificCombinationQuirk ULTRA_MAXIMUM;
    private final int id;
    private final android.util.Size relatedFixedSize;
    public static final ImageCaptureFailedForSpecificCombinationQuirk VGA = new ImageCaptureFailedForSpecificCombinationQuirk("VGA", 0, 0, new android.util.Size(640, 480));
    public static final ImageCaptureFailedForSpecificCombinationQuirk X_VGA = new ImageCaptureFailedForSpecificCombinationQuirk("X_VGA", 1, 1, new android.util.Size(androidx.compose.ui.graphics.Fields.RotationZ, 768));
    public static final ImageCaptureFailedForSpecificCombinationQuirk S720P_16_9 = new ImageCaptureFailedForSpecificCombinationQuirk("S720P_16_9", 2, 2, new android.util.Size(1280, 720));
    public static final ImageCaptureFailedForSpecificCombinationQuirk S1080P_4_3 = new ImageCaptureFailedForSpecificCombinationQuirk("S1080P_4_3", 4, 4, new android.util.Size(DateTimeConstants.MINUTES_PER_DAY, 1080));
    public static final ImageCaptureFailedForSpecificCombinationQuirk S1080P_16_9 = new ImageCaptureFailedForSpecificCombinationQuirk("S1080P_16_9", 5, 5, new android.util.Size(1920, 1080));
    public static final ImageCaptureFailedForSpecificCombinationQuirk S1440P_4_3 = new ImageCaptureFailedForSpecificCombinationQuirk("S1440P_4_3", 6, 6, new android.util.Size(1920, DateTimeConstants.MINUTES_PER_DAY));
    public static final ImageCaptureFailedForSpecificCombinationQuirk S1440P_16_9 = new ImageCaptureFailedForSpecificCombinationQuirk("S1440P_16_9", 7, 7, new android.util.Size(2560, DateTimeConstants.MINUTES_PER_DAY));
    public static final ImageCaptureFailedForSpecificCombinationQuirk UHD = new ImageCaptureFailedForSpecificCombinationQuirk("UHD", 8, 8, new android.util.Size(3840, 2160));
    public static final ImageCaptureFailedForSpecificCombinationQuirk MAXIMUM = new ImageCaptureFailedForSpecificCombinationQuirk("MAXIMUM", 10, 10, null, 2, null);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getId() {
        return this.id;
    }

    public final android.util.Size getRelatedFixedSize() {
        return this.relatedFixedSize;
    }

    private static final /* synthetic */ ImageCaptureFailedForSpecificCombinationQuirk[] $values() {
        return new ImageCaptureFailedForSpecificCombinationQuirk[]{VGA, X_VGA, S720P_16_9, PREVIEW, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM, NOT_SUPPORT};
    }

    public static ImageCaptureFailedForSpecificCombinationQuirk valueOf(String str) {
        return (ImageCaptureFailedForSpecificCombinationQuirk) Enum.valueOf(ImageCaptureFailedForSpecificCombinationQuirk.class, str);
    }

    public static ImageCaptureFailedForSpecificCombinationQuirk[] values() {
        return (ImageCaptureFailedForSpecificCombinationQuirk[]) $VALUES.clone();
    }

    public /* synthetic */ ImageCaptureFailedForSpecificCombinationQuirk(String str, int i, int i2, android.util.Size size, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : size);
    }

    static {
        android.util.Size size = null;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PREVIEW = new ImageCaptureFailedForSpecificCombinationQuirk("PREVIEW", 3, 3, size, i, defaultConstructorMarker);
        RECORD = new ImageCaptureFailedForSpecificCombinationQuirk("RECORD", 9, 9, size, i, defaultConstructorMarker);
        android.util.Size size2 = null;
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        MAXIMUM_4_3 = new ImageCaptureFailedForSpecificCombinationQuirk("MAXIMUM_4_3", 11, 11, size2, i2, defaultConstructorMarker2);
        android.util.Size size3 = null;
        int i3 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        MAXIMUM_16_9 = new ImageCaptureFailedForSpecificCombinationQuirk("MAXIMUM_16_9", 12, 12, size3, i3, defaultConstructorMarker3);
        ULTRA_MAXIMUM = new ImageCaptureFailedForSpecificCombinationQuirk("ULTRA_MAXIMUM", 13, 13, size2, i2, defaultConstructorMarker2);
        NOT_SUPPORT = new ImageCaptureFailedForSpecificCombinationQuirk("NOT_SUPPORT", 14, 14, size3, i3, defaultConstructorMarker3);
        ImageCaptureFailedForSpecificCombinationQuirk[] imageCaptureFailedForSpecificCombinationQuirkArr$values = $values();
        $VALUES = imageCaptureFailedForSpecificCombinationQuirkArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) imageCaptureFailedForSpecificCombinationQuirkArr$values);
    }

    private ImageCaptureFailedForSpecificCombinationQuirk(String str, int i, int i2, android.util.Size size) {
        super(str, i);
        this.id = i2;
        this.relatedFixedSize = size;
    }
}
