package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.WireFormat$FieldType;
import com.sentiance.protobuf.WireFormat$Utf8Validation;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BrazeUserChangeEvent {
    public static Object write(com.sentiance.protobuf.u uVar, WireFormat$FieldType wireFormat$FieldType, WireFormat$Utf8Validation wireFormat$Utf8Validation) {
        switch (getCardCount.read[wireFormat$FieldType.ordinal()]) {
            case 1:
                return Double.valueOf(uVar.PlaybackStateCompat());
            case 2:
                return Float.valueOf(uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
            case 3:
                return Long.valueOf(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
            case 4:
                return Long.valueOf(uVar.MediaDescriptionCompat());
            case 5:
                return Integer.valueOf(uVar.ComponentActivity());
            case 6:
                return Long.valueOf(uVar.ResultReceiver());
            case 7:
                return Integer.valueOf(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            case 8:
                return Boolean.valueOf(uVar.MediaSessionCompatResultReceiverWrapper());
            case 9:
                return uVar.MediaSessionCompatToken();
            case 10:
                return Integer.valueOf(uVar.serializer());
            case 11:
                return Integer.valueOf(uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
            case 12:
                return Long.valueOf(uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
            case 13:
                return Integer.valueOf(uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
            case 14:
                return Long.valueOf(uVar.IconCompatParcelizer());
            case 15:
                return wireFormat$Utf8Validation.readString(uVar);
            case 16:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 17:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 18:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("readPrimitiveField() cannot handle enums.");
                return null;
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }
}
