package o;

import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class setController {
    public static final android.util.Size MediaDescriptionCompat = new android.util.Size(0, 0);
    public static final android.util.Size serializer = new android.util.Size(320, 240);
    public static final android.util.Size MediaMetadataCompat = new android.util.Size(640, 480);
    public static final android.util.Size IconCompatParcelizer = new android.util.Size(720, 480);
    public static final android.util.Size write = new android.util.Size(1280, 720);
    public static final android.util.Size read = new android.util.Size(1920, 1080);
    public static final android.util.Size RemoteActionCompatParcelizer = new android.util.Size(1920, DateTimeConstants.MINUTES_PER_DAY);

    static {
        new android.util.Size(2560, DateTimeConstants.MINUTES_PER_DAY);
        new android.util.Size(3840, 2160);
    }

    public static int write(android.util.Size size) {
        return size.getHeight() * size.getWidth();
    }
}
