package o;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetWcp implements androidx.compose.foundation.layout.Arrangement.Vertical, setStrokeWidth, isSpecified8_81llA, getDefaultBlendMode0nO6VwU, accessgetMediaPlaycp, accessgetVolumeMutecp, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2, getTouchSlop, setDetachedFromParentLookaheadPassui {
    public static accessgetWcp read;
    public final /* synthetic */ int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public static final /* synthetic */ accessgetWcp serializer = new accessgetWcp(11);
    public static final /* synthetic */ accessgetWcp write = new accessgetWcp(12);
    public static final /* synthetic */ accessgetWcp MediaSessionCompatQueueItem = new accessgetWcp(13);
    public static final /* synthetic */ accessgetWcp MediaMetadataCompat = new accessgetWcp(14);
    public static final /* synthetic */ accessgetWcp MediaBrowserCompatMediaItem = new accessgetWcp(15);
    public static final /* synthetic */ accessgetWcp MediaSessionCompatResultReceiverWrapper = new accessgetWcp(16);
    public static final /* synthetic */ accessgetWcp ParcelableVolumeInfo = new accessgetWcp(17);
    public static final /* synthetic */ accessgetWcp PlaybackStateCompat = new accessgetWcp(18);
    public static final /* synthetic */ accessgetWcp PlaybackStateCompatCustomAction = new accessgetWcp(19);
    public static final /* synthetic */ accessgetWcp MediaSessionCompatToken = new accessgetWcp(20);
    public static final /* synthetic */ accessgetWcp RemoteActionCompatParcelizer = new accessgetWcp(21);
    public static final /* synthetic */ accessgetWcp IconCompatParcelizer = new accessgetWcp(22);
    public static final /* synthetic */ accessgetWcp MediaDescriptionCompat = new accessgetWcp(23);
    public static final /* synthetic */ accessgetWcp RatingCompat = new accessgetWcp(24);

    @Override // o.accessgetMediaPlaycp
    public long IconCompatParcelizer() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o.getDefaultBlendMode0nO6VwU
    public void RemoteActionCompatParcelizer(androidx.fragment.app.FragmentActivity fragmentActivity) {
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    public void read(androidx.compose.ui.unit.Density density, int i, int[] iArr, int[] iArr2) {
        androidx.compose.foundation.layout.Arrangement.RemoteActionCompatParcelizer(i, iArr, iArr2, false);
    }

    public /* synthetic */ accessgetWcp(int i) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
    }

    @Override // o.setDetachedFromParentLookaheadPassui
    public Object IconCompatParcelizer(String str, java.security.Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // o.isSpecified8_81llA
    public compositeComponent read(getUnspecifiedColorannotations getunspecifiedcolorannotations) {
        return new isUnspecified8_81llAannotations(getunspecifiedcolorannotations.serializer, getunspecifiedcolorannotations.read, getunspecifiedcolorannotations.IconCompatParcelizer, getunspecifiedcolorannotations.RemoteActionCompatParcelizer, getunspecifiedcolorannotations.write);
    }

    @Override // o.accessgetVolumeMutecp
    public toXyzui_graphics read(Context context, String str, accessgetUcp accessgetucp) {
        int iRemoteActionCompatParcelizer;
        toXyzui_graphics toxyzui_graphics = new toXyzui_graphics();
        int iIconCompatParcelizer = accessgetucp.IconCompatParcelizer(context, str);
        toxyzui_graphics.RemoteActionCompatParcelizer = iIconCompatParcelizer;
        int i = 1;
        int i2 = 0;
        if (iIconCompatParcelizer != 0) {
            iRemoteActionCompatParcelizer = accessgetucp.RemoteActionCompatParcelizer(context, str, false);
            toxyzui_graphics.IconCompatParcelizer = iRemoteActionCompatParcelizer;
        } else {
            iRemoteActionCompatParcelizer = accessgetucp.RemoteActionCompatParcelizer(context, str, true);
            toxyzui_graphics.IconCompatParcelizer = iRemoteActionCompatParcelizer;
        }
        int i3 = toxyzui_graphics.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            if (iRemoteActionCompatParcelizer == 0) {
                i = 0;
            }
            toxyzui_graphics.write = i;
            return toxyzui_graphics;
        }
        i2 = i3;
        if (i2 >= iRemoteActionCompatParcelizer) {
            i = -1;
        }
        toxyzui_graphics.write = i;
        return toxyzui_graphics;
    }

    @Override // o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2
    public Object serializer() {
        switch (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            case 11:
                List list = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                accessgetExtendedTouchPaddingNHjbRcjd.write.B_();
                Boolean bool = (Boolean) AndroidPointerIconType.read.read();
                bool.getClass();
                return bool;
            case 12:
                List list2 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.addObserverForBackInvokerlambda0.read()).longValue());
            case 13:
                List list3 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l = (Long) NestedScrollNodeonPreFling1.RemoteActionCompatParcelizer.read();
                l.getClass();
                return l;
            case 14:
                List list4 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l2 = (Long) NestedScrollNodeonPreFling1.ComponentActivity.read();
                l2.getClass();
                return l2;
            case 15:
                List list5 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l3 = (Long) NestedScrollNodeonPreFling1.addOnTrimMemoryListener.read();
                l3.getClass();
                return l3;
            case 16:
                List list6 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.onBackPressedDispatcher_delegatelambda0.read()).longValue());
            case 17:
                List list7 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                getRelocateWNlRxjI.read.B_();
                return (String) getFlingWNlRxjI.MediaMetadataCompat.read();
            case 18:
                List list8 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.getSavedStateRegistry.read()).longValue());
            case 19:
                List list9 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read();
            case 20:
                List list10 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l4 = (Long) NestedScrollNodeonPreFling1.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.read();
                l4.getClass();
                return l4;
            case 21:
                List list11 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                Boolean bool2 = (Boolean) accessgetSideEffectcp.RemoteActionCompatParcelizer.read();
                bool2.getClass();
                return bool2;
            case 22:
                List list12 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(NestedScrollSource.read());
            case 23:
                List list13 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                accessgetExtendedTouchPaddingNHjbRcjd.write.B_();
                Boolean bool3 = (Boolean) AndroidPointerIconType.MediaDescriptionCompat.read();
                bool3.getClass();
                return bool3;
            default:
                List list14 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.getSavedStateRegistryControllerannotations.read()).longValue());
        }
    }

    public String toString() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != 2 ? super.toString() : "Arrangement#Bottom";
    }

    public static final boolean read() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
