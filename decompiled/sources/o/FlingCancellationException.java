package o;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FlingCancellationException implements androidx.compose.foundation.layout.Arrangement.Vertical, setStrokeWidth, accessgetDarkencp, getJoinLxFBmk8, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2, getTouchSlop, getPlacementScope, MotionReferencePlacementDelegate {
    public final /* synthetic */ int ComponentActivity;
    public static final /* synthetic */ FlingCancellationException write = new FlingCancellationException(11);
    public static final /* synthetic */ FlingCancellationException serializer = new FlingCancellationException(12);
    public static final /* synthetic */ FlingCancellationException MediaSessionCompatQueueItem = new FlingCancellationException(13);
    public static final /* synthetic */ FlingCancellationException MediaMetadataCompat = new FlingCancellationException(14);
    public static final /* synthetic */ FlingCancellationException PlaybackStateCompat = new FlingCancellationException(15);
    public static final /* synthetic */ FlingCancellationException ParcelableVolumeInfo = new FlingCancellationException(16);
    public static final /* synthetic */ FlingCancellationException MediaSessionCompatToken = new FlingCancellationException(17);
    public static final /* synthetic */ FlingCancellationException PlaybackStateCompatCustomAction = new FlingCancellationException(18);
    public static final /* synthetic */ FlingCancellationException MediaSessionCompatResultReceiverWrapper = new FlingCancellationException(19);
    public static final /* synthetic */ FlingCancellationException r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new FlingCancellationException(20);
    public static final /* synthetic */ FlingCancellationException RemoteActionCompatParcelizer = new FlingCancellationException(21);
    public static final /* synthetic */ FlingCancellationException IconCompatParcelizer = new FlingCancellationException(22);
    public static final /* synthetic */ FlingCancellationException read = new FlingCancellationException(23);
    public static final /* synthetic */ FlingCancellationException RatingCompat = new FlingCancellationException(24);
    public static final /* synthetic */ FlingCancellationException MediaBrowserCompatMediaItem = new FlingCancellationException(25);
    public static final /* synthetic */ FlingCancellationException MediaDescriptionCompat = new FlingCancellationException(27);

    @Override // o.getPlacementScope
    public /* synthetic */ Object create(MetricsBatchProcessor metricsBatchProcessor) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(metricsBatchProcessor);
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    public void read(androidx.compose.ui.unit.Density density, int i, int[] iArr, int[] iArr2) {
        androidx.compose.foundation.layout.Arrangement.serializer(iArr, iArr2, false);
    }

    @Override // o.getJoinLxFBmk8
    public void serializer(Object obj) {
    }

    public /* synthetic */ FlingCancellationException(int i) {
        this.ComponentActivity = i;
    }

    @Override // o.accessgetDarkencp
    public void IconCompatParcelizer(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            SentryLogcatAdapter.read("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2
    public Object serializer() {
        switch (this.ComponentActivity) {
            case 11:
                return new Boolean(((Boolean) accessfindNearestAttachedAncestor.read.read()).booleanValue());
            case 12:
                List list = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.addOnContextAvailableListener.read();
            case 13:
                List list2 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.onBackPressedInput_delegatelambda0.read();
            case 14:
                List list3 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l = (Long) NestedScrollNodeonPreFling1.PlaybackStateCompat.read();
                l.getClass();
                return l;
            case 15:
                List list4 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l2 = (Long) NestedScrollNodeonPreFling1.addMenuProvider.read();
                l2.getClass();
                return l2;
            case 16:
                List list5 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l3 = (Long) NestedScrollNodeonPreFling1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read();
                l3.getClass();
                return l3;
            case 17:
                List list6 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.getDefaultViewModelProviderFactory.read()).longValue());
            case 18:
                List list7 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                getRelocateWNlRxjI.read.B_();
                Long l4 = (Long) getFlingWNlRxjI.IconCompatParcelizer.read();
                l4.getClass();
                return l4;
            case 19:
                List list8 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l5 = (Long) NestedScrollNodeonPreFling1._init_lambda3.read();
                l5.getClass();
                return l5;
            case 20:
                List list9 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.read.read();
            case 21:
                List list10 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.onConfigurationChanged.read()).longValue());
            case 22:
                List list11 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                Boolean bool = (Boolean) accessgetSideEffectcp.serializer.read();
                bool.getClass();
                return bool;
            case 23:
                List list12 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                Boolean bool2 = (Boolean) awaitPointerEvent.read.read();
                bool2.getClass();
                return bool2;
            case 24:
                List list13 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(NestedScrollNodeKtfindNearestAttachedAncestor1.write());
            default:
                return new Boolean(((Boolean) getUserInputWNlRxjI.serializer.read()).booleanValue());
        }
    }

    public String toString() {
        return this.ComponentActivity != 2 ? super.toString() : "Arrangement#Top";
    }

    @Override // o.MotionReferencePlacementDelegate
    public StackTraceElement[] read(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[androidx.compose.ui.graphics.Fields.RotationZ];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, androidx.compose.ui.graphics.Fields.RotationY);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - androidx.compose.ui.graphics.Fields.RotationY, stackTraceElementArr2, androidx.compose.ui.graphics.Fields.RotationY, androidx.compose.ui.graphics.Fields.RotationY);
        return stackTraceElementArr2;
    }
}
