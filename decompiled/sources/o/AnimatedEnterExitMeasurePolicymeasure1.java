package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedEnterExitMeasurePolicymeasure1 {
    public static final AnimatedEnterExitMeasurePolicymeasure1 IconCompatParcelizer = new AnimatedEnterExitMeasurePolicymeasure1(0, EnterExitTransitionKtexpandIn1.INACTIVE);
    public static final Set RemoteActionCompatParcelizer = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final clear read = new clear(new AnimatedEnterExitMeasurePolicymeasure1(0, EnterExitTransitionKtexpandIn1.ACTIVE));
    public final int serializer;
    public final EnterExitTransitionKtexpandIn1 write;

    public AnimatedEnterExitMeasurePolicymeasure1(int i, EnterExitTransitionKtexpandIn1 enterExitTransitionKtexpandIn1) {
        this.serializer = i;
        if (enterExitTransitionKtexpandIn1 != null) {
            this.write = enterExitTransitionKtexpandIn1;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null streamState");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimatedEnterExitMeasurePolicymeasure1)) {
            return false;
        }
        AnimatedEnterExitMeasurePolicymeasure1 animatedEnterExitMeasurePolicymeasure1 = (AnimatedEnterExitMeasurePolicymeasure1) obj;
        return this.serializer == animatedEnterExitMeasurePolicymeasure1.serializer && this.write.equals(animatedEnterExitMeasurePolicymeasure1.write);
    }

    public final String toString() {
        return "StreamInfo{id=" + this.serializer + ", streamState=" + this.write + ", inProgressTransformationInfo=null}";
    }

    public final int hashCode() {
        return (((this.serializer ^ 1000003) * 1000003) ^ this.write.hashCode()) * 1000003;
    }
}
