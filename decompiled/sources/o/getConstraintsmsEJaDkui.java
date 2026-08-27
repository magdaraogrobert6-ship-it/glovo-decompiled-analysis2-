package o;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.roadrunner.home.CreateHomeScope;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getConstraintsmsEJaDkui implements accessclearPlaceOrder, positionIniSbpLlYui, AccessibilityIteratorsAbstractTextSegmentIterator {
    public final /* synthetic */ translatek4lQ0M read;

    public /* synthetic */ getConstraintsmsEJaDkui(translatek4lQ0M translatek4lq0m) {
        this.read = translatek4lq0m;
    }

    @Override // o.positionIniSbpLlYui
    public void read(Bundle bundle) {
        ((positionIniSbpLlYui) this.read.read).read(bundle);
    }

    @Override // o.accessclearPlaceOrder
    public void read(getLayoutPending getlayoutpending) {
        translatek4lQ0M translatek4lq0m = this.read;
        synchronized (translatek4lq0m) {
            if (((accessclearPlaceOrder) translatek4lq0m.write) instanceof accesscheckChildrenPlaceOrderForUpdates) {
                ((ArrayList) translatek4lq0m.IconCompatParcelizer).add(getlayoutpending);
            }
            ((accessclearPlaceOrder) translatek4lq0m.write).read(getlayoutpending);
        }
    }

    @Override // o.AccessibilityIteratorsAbstractTextSegmentIterator
    public void RemoteActionCompatParcelizer(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        translatek4lQ0M translatek4lq0m = this.read;
        Log.isLoggable("FirebaseCrashlytics", 3);
        logTree logtree = (logTree) abstractComposeViewExternalSyntheticLambda0.write();
        zzz zzzVar = new zzz(logtree);
        zzbv zzbvVar = new zzbv(15);
        assertConsistent assertconsistentIconCompatParcelizer = logtree.IconCompatParcelizer("clx", zzbvVar);
        if (assertconsistentIconCompatParcelizer == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            assertconsistentIconCompatParcelizer = logtree.IconCompatParcelizer(CrashHianalyticsData.EVENT_ID_CRASH, zzbvVar);
            if (assertconsistentIconCompatParcelizer != null) {
                SentryLogcatAdapter.write("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (assertconsistentIconCompatParcelizer == null) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        CreateHomeScope createHomeScope = new CreateHomeScope();
        ProtobufEncoder protobufEncoder = new ProtobufEncoder();
        protobufEncoder.serializer = new Object();
        protobufEncoder.write = zzzVar;
        synchronized (translatek4lq0m) {
            Iterator it = ((ArrayList) translatek4lq0m.IconCompatParcelizer).iterator();
            while (it.hasNext()) {
                createHomeScope.read((getLayoutPending) it.next());
            }
            zzbvVar.RemoteActionCompatParcelizer = createHomeScope;
            zzbvVar.write = protobufEncoder;
            translatek4lq0m.write = createHomeScope;
            translatek4lq0m.read = protobufEncoder;
        }
    }
}
