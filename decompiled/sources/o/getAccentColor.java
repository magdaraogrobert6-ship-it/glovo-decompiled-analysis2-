package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "PotentialVehicleTransportStartIndicator")
public final class getAccentColor {
    private final parseLonglambda0 read;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final boolean serializer(List<? extends Location> list) {
        parseLonglambda0 parselonglambda0 = this.read;
        parselonglambda0.IconCompatParcelizer("Checking for potential vehicle transport start", new Object[0]);
        Iterator<? extends Location> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = it.next().getSpeed() >= 8.0f ? i + 1 : 0;
            if (i == 3) {
                parselonglambda0.IconCompatParcelizer("Potential vehicle transport start detected", new Object[0]);
                return true;
            }
        }
        return false;
    }

    static {
        new read(null);
    }

    public getAccentColor(parseLonglambda0 parselonglambda0) {
        parselonglambda0.getClass();
        this.read = parselonglambda0;
    }
}
