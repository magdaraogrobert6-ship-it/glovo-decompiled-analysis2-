package o;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.perf.FirebasePerformance;

/* JADX INFO: loaded from: classes3.dex */
public final class transactiondefault implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public static final transactiondefault IconCompatParcelizer = new transactiondefault(0);
    public static final transactiondefault read = new transactiondefault(1);
    public static final transactiondefault serializer = new transactiondefault(2);
    public static final transactiondefault write = new transactiondefault(3);

    public /* synthetic */ transactiondefault(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    static {
        int i = MediaMetadataCompat + 87;
        MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            return set_measureResult.read();
        }
        if (i2 == 1) {
            Object obj = FirebaseInstallations.RemoteActionCompatParcelizer;
            FirebaseInstallations firebaseInstallations = (FirebaseInstallations) FirebaseApp.write().write(accesssetInstancecp.class);
            firebaseInstallations.getClass();
            int i3 = MediaSessionCompatQueueItem + 25;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return firebaseInstallations;
        }
        if (i2 == 2) {
            FirebasePerformance firebasePerformance = FirebasePerformance.read();
            firebasePerformance.getClass();
            return firebasePerformance;
        }
        if (i2 == 3) {
            return SuspendingTransactionWithoutReturn.read;
        }
        SuspendingTransactionWrapper suspendingTransactionWrapper = new SuspendingTransactionWrapper();
        int i5 = MediaBrowserCompatMediaItem + 71;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return suspendingTransactionWrapper;
        }
        throw null;
    }
}
