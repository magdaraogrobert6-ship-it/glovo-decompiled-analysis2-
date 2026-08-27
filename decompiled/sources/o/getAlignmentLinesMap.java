package o;

import android.database.Cursor;
import android.util.Base64;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.db.TrackingDatabase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.DependencyException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.metrics.MetricsBatchProcessor;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getAlignmentLinesMap implements getArcStartY, accessgetButton12cp, accessgetMediaEjectcp, DelegatingNode, getPlacementScope, isPlacedUnderMotionFrameOfReference, AccessibilityIteratorsAbstractTextSegmentIterator, OnFailureListener {
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // o.isPlacedUnderMotionFrameOfReference
    public List IconCompatParcelizer(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // o.AccessibilityIteratorsAbstractTextSegmentIterator
    public void RemoteActionCompatParcelizer(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
    }

    @Override // o.accessgetButton12cp
    public void write(Exception exc) {
    }

    public /* synthetic */ getAlignmentLinesMap(int i) {
        this.IconCompatParcelizer = i;
    }

    public static /* synthetic */ void read(String str, Object obj, Object obj2) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    public static /* synthetic */ void serializer(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    @Override // o.accessgetMediaEjectcp
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            accessgetEqualscp accessgetequalscpWrite = accessgetEightcp.write();
            String string = cursor.getString(1);
            byte[] bArrDecode = null;
            if (string == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null backendName");
                return null;
            }
            accessgetequalscpWrite.write = string;
            accessgetequalscpWrite.RemoteActionCompatParcelizer = accessgetMediaPlayPausecp.write(cursor.getInt(2));
            String string2 = cursor.getString(3);
            if (string2 != null) {
                bArrDecode = Base64.decode(string2, 0);
            }
            accessgetequalscpWrite.IconCompatParcelizer = bArrDecode;
            arrayList.add(accessgetequalscpWrite.RemoteActionCompatParcelizer());
        }
        return arrayList;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        SentryLogcatAdapter.read("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = this.IconCompatParcelizer;
        if (i == 21) {
            return AbtRegistrar.lambda$getComponents$0(metricsBatchProcessor);
        }
        switch (i) {
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.serializer.write();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.IconCompatParcelizer.write();
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.read.write();
            default:
                provideRulerValue providerulervalue = ExecutorsRegistrar.serializer;
                return getCachedAlignmentLineui.INSTANCE;
        }
    }

    @Override // o.getArcStartY
    public Object B_() {
        if (this.IconCompatParcelizer != 1) {
            throw new IllegalStateException();
        }
        TrackingDatabase trackingDatabase = getPathMeasure.IconCompatParcelizer;
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        return calendar;
    }

    public static /* synthetic */ void write(Object obj, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj);
    }

    public static /* synthetic */ void write(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void write() {
        throw new UnsupportedOperationException();
    }
}
