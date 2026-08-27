package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;
import o.getHasAppliedWindowInsets;
import o.getMessageCloseButtonView;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class JodaTimeInitializer implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        try {
            DateTimeZone.setProvider(new getMessageCloseButtonView(context));
            context.getApplicationContext().registerReceiver(new getHasAppliedWindowInsets(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            return new Object();
        } catch (IOException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Could not read ZoneInfoMap. You are probably using Proguard wrong.", e);
            return null;
        }
    }
}
