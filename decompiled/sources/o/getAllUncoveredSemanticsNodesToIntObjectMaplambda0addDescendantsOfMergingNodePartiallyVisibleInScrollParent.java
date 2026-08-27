package o;

import android.app.Application;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.aqs.AppQualityScore;
import com.google.firebase.perf.FirebasePerformance;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public static volatile ComponentRegistry$Builder serializer;
    public static final getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent RemoteActionCompatParcelizer = new getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent();
    public static final getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent write = new getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent();

    static {
        int i = read + 17;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final BlurFilter RemoteActionCompatParcelizer() {
        ComponentRegistry$Builder componentRegistry$Builder;
        ComponentRegistry$Builder componentRegistry$Builder2 = serializer;
        if (componentRegistry$Builder2 != null) {
            return componentRegistry$Builder2;
        }
        synchronized (write) {
            componentRegistry$Builder = serializer;
            if (componentRegistry$Builder == null) {
                FirebasePerformance firebasePerformance = FirebasePerformance.read();
                firebasePerformance.getClass();
                componentRegistry$Builder = new ComponentRegistry$Builder(androidx.sqlite.SQLite.IconCompatParcelizer(new getAllUncoveredSemanticsNodesToIntObjectMap(firebasePerformance, new createOuterShadowBitmapD_oqF2M(instance_delegatelambda0.write, true))), new speculativeHit(7));
                serializer = componentRegistry$Builder;
            }
        }
        return componentRegistry$Builder;
    }

    public static final AppQualityScore serializer(Application application) {
        AppQualityScore appQualityScore;
        synchronized (RemoteActionCompatParcelizer) {
            accessgetWcp accessgetwcp = AppQualityScore.RemoteActionCompatParcelizer;
            BlurFilter blurFilterRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            getIndex getindex = new getIndex(RangesKt.write((Object) "SupportRequestManagerFragment"));
            requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview = new requestFocusBypassUnfocusableComposeView(2);
            appQualityScore = AppQualityScore.IconCompatParcelizer;
            if (appQualityScore == null) {
                synchronized (accessgetwcp) {
                    appQualityScore = AppQualityScore.IconCompatParcelizer;
                    if (appQualityScore == null) {
                        appQualityScore = new AppQualityScore(application, blurFilterRemoteActionCompatParcelizer, getindex, requestfocusbypassunfocusablecomposeview);
                        AppQualityScore.IconCompatParcelizer = appQualityScore;
                    }
                }
            }
        }
        return appQualityScore;
    }
}
