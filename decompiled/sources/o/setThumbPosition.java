package o;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setThumbPosition {
    public final SessionConfiguration RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public setThumbPosition(int i, ArrayList arrayList, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, getThumbPosition getthumbposition) {
        setSwitchMinWidth setswitchminwidth;
        setSwitchTypeface setswitchtypeface;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((OutputConfiguration) ((setSwitchTypeface) it.next()).IconCompatParcelizer.write());
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayList2, previewFreezeAfterHighSpeedRecordingQuirk, getthumbposition);
        this.RemoteActionCompatParcelizer = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList3 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                setswitchtypeface = null;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    setswitchminwidth = new setThumbTextPadding(outputConfiguration);
                } else {
                    setswitchminwidth = new setSwitchMinWidth(new setTextOn(outputConfiguration));
                }
                setswitchtypeface = new setSwitchTypeface(setswitchminwidth);
            }
            arrayList3.add(setswitchtypeface);
        }
        Collections.unmodifiableList(arrayList3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setThumbPosition)) {
            return false;
        }
        return Objects.equals(this.RemoteActionCompatParcelizer, ((setThumbPosition) obj).RemoteActionCompatParcelizer);
    }
}
