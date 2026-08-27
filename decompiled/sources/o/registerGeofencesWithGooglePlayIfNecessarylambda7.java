package o;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public class registerGeofencesWithGooglePlayIfNecessarylambda7 {
    private final ActivityManager serializer;

    public registerGeofencesWithGooglePlayIfNecessarylambda7(ActivityManager activityManager) {
        this.serializer = activityManager;
    }

    public final ApplicationExitInfo ch_() {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            if (i >= 30) {
                try {
                    historicalProcessExitReasons = this.serializer.getHistoricalProcessExitReasons(null, 0, 0);
                } catch (Exception unused) {
                    historicalProcessExitReasons = Collections.EMPTY_LIST;
                }
            } else {
                historicalProcessExitReasons = Collections.EMPTY_LIST;
            }
            Optional<ApplicationExitInfo> optionalMax = historicalProcessExitReasons.stream().filter(new Predicate() { // from class: o.registerGeofencesWithGooglePlayIfNecessarylambda8
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((ApplicationExitInfo) obj).getReason() == 6;
                }
            }).max(Comparator.comparing(new registerGeofencesWithGooglePlayIfNecessarylambda9()));
            if (optionalMax.isPresent()) {
                return ScreenStartObserver$$ExternalSyntheticLambda0.cd_(optionalMax.get());
            }
        }
        return null;
    }

    public final ApplicationExitInfo ci_() {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            if (i >= 30) {
                try {
                    historicalProcessExitReasons = this.serializer.getHistoricalProcessExitReasons(null, 0, 0);
                } catch (Exception unused) {
                    historicalProcessExitReasons = Collections.EMPTY_LIST;
                }
            } else {
                historicalProcessExitReasons = Collections.EMPTY_LIST;
            }
            Optional<ApplicationExitInfo> optionalMax = historicalProcessExitReasons.stream().max(Comparator.comparing(new registerGeofencesWithGooglePlayIfNecessarylambda9()));
            if (optionalMax.isPresent()) {
                return ScreenStartObserver$$ExternalSyntheticLambda0.cd_(optionalMax.get());
            }
        }
        return null;
    }
}
