package com.roadrunner.logger.crash;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.logger.api.critical.CriticalObservabilityException;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import o.ProtoPrerequisiteMsgserializer;

/* JADX INFO: loaded from: classes3.dex */
public final class CriticalObservabilityExceptionTree extends ProtoPrerequisiteMsgserializer {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final SentryCriticalIssueLogger read;

    public CriticalObservabilityExceptionTree(SentryCriticalIssueLogger sentryCriticalIssueLogger) {
        this.read = sentryCriticalIssueLogger;
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void IconCompatParcelizer(int i, String str, String str2, Throwable th) {
        int i2 = 2 % 2;
        int i3 = write + 57;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        str2.getClass();
        if (th instanceof CriticalObservabilityException) {
            CriticalObservabilityException criticalObservabilityException = (CriticalObservabilityException) th;
            this.read.write(criticalObservabilityException.write, criticalObservabilityException.RemoteActionCompatParcelizer, criticalObservabilityException.IconCompatParcelizer, criticalObservabilityException.read);
        }
        int i5 = IconCompatParcelizer + 9;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
