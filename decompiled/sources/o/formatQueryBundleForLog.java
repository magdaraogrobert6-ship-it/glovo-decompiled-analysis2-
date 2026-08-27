package o;

/* JADX INFO: loaded from: classes4.dex */
public enum formatQueryBundleForLog {
    LOW(0.8f, 50000, 10),
    MEDIUM(1.0f, 75000, 30),
    HIGH(1.0f, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 50);

    public final int bitRate;
    public final int screenshotQuality;
    public final float sizeScale;

    formatQueryBundleForLog(float f, int i, int i2) {
        this.sizeScale = f;
        this.bitRate = i;
        this.screenshotQuality = i2;
    }

    public String serializedName() {
        return name().toLowerCase(java.util.Locale.ROOT);
    }
}
