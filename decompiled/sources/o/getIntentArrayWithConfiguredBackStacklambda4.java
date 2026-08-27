package o;

import android.content.Context;
import java.security.MessageDigest;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class getIntentArrayWithConfiguredBackStacklambda4 implements androidx.compose.foundation.layout.Arrangement.Horizontal, clipPathKD09W0M, accessgetMediaPlaycp, accessgetVolumeMutecp, setActiveState, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2, getTouchSlop, setDetachedFromParentLookaheadPassui, getValueOverride {
    public static getIntentArrayWithConfiguredBackStacklambda4 IconCompatParcelizer;
    public final /* synthetic */ int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 write = new getIntentArrayWithConfiguredBackStacklambda4(10);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 RemoteActionCompatParcelizer = new getIntentArrayWithConfiguredBackStacklambda4(11);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 RatingCompat = new getIntentArrayWithConfiguredBackStacklambda4(12);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 MediaMetadataCompat = new getIntentArrayWithConfiguredBackStacklambda4(13);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 MediaSessionCompatToken = new getIntentArrayWithConfiguredBackStacklambda4(14);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 PlaybackStateCompatCustomAction = new getIntentArrayWithConfiguredBackStacklambda4(15);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 PlaybackStateCompat = new getIntentArrayWithConfiguredBackStacklambda4(16);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 ParcelableVolumeInfo = new getIntentArrayWithConfiguredBackStacklambda4(17);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 MediaSessionCompatResultReceiverWrapper = new getIntentArrayWithConfiguredBackStacklambda4(18);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 ComponentActivity = new getIntentArrayWithConfiguredBackStacklambda4(19);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 serializer = new getIntentArrayWithConfiguredBackStacklambda4(20);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 read = new getIntentArrayWithConfiguredBackStacklambda4(21);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 MediaSessionCompatQueueItem = new getIntentArrayWithConfiguredBackStacklambda4(22);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 MediaBrowserCompatMediaItem = new getIntentArrayWithConfiguredBackStacklambda4(23);
    public static final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4 MediaDescriptionCompat = new getIntentArrayWithConfiguredBackStacklambda4(24);

    @Override // o.accessgetMediaPlaycp
    public long IconCompatParcelizer() {
        return System.currentTimeMillis();
    }

    @Override // o.getValueOverride
    public getAdapters read(speculativeHit speculativehit, JSONObject jSONObject) {
        return RemoteActionCompatParcelizer(speculativehit);
    }

    @Override // o.setActiveState
    public /* synthetic */ String serializer(String str, String str2) {
        return null;
    }

    public /* synthetic */ getIntentArrayWithConfiguredBackStacklambda4(int i) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
    }

    @Override // o.setDetachedFromParentLookaheadPassui
    public Object IconCompatParcelizer(String str, java.security.Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // o.accessgetVolumeMutecp
    public toXyzui_graphics read(Context context, String str, accessgetUcp accessgetucp) {
        toXyzui_graphics toxyzui_graphics = new toXyzui_graphics();
        toxyzui_graphics.RemoteActionCompatParcelizer = accessgetucp.IconCompatParcelizer(context, str);
        int i = 1;
        int iRemoteActionCompatParcelizer = accessgetucp.RemoteActionCompatParcelizer(context, str, true);
        toxyzui_graphics.IconCompatParcelizer = iRemoteActionCompatParcelizer;
        int i2 = toxyzui_graphics.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            i2 = 0;
            if (iRemoteActionCompatParcelizer == 0) {
                i = 0;
            } else if (iRemoteActionCompatParcelizer < i2) {
                i = -1;
            }
        } else if (iRemoteActionCompatParcelizer < i2) {
            i = -1;
        }
        toxyzui_graphics.write = i;
        return toxyzui_graphics;
    }

    public static getAdapters RemoteActionCompatParcelizer(speculativeHit speculativehit) {
        return new getAdapters(System.currentTimeMillis() + 3600000, new r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M(8), new MutableVectorWithMutationTracking(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    public void RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, int i, int[] iArr, androidx.compose.ui.unit.LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            androidx.compose.foundation.layout.Arrangement.RemoteActionCompatParcelizer(i, iArr, iArr2, false);
        } else {
            androidx.compose.foundation.layout.Arrangement.serializer(iArr, iArr2, true);
        }
    }

    @Override // o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2
    public Object serializer() {
        switch (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            case 11:
                List list = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                Boolean bool = (Boolean) withTimeoutOrNull.serializer.read();
                bool.getClass();
                return bool;
            case 12:
                List list2 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.menuHostHelperlambda0.read()).longValue());
            case 13:
                List list3 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l = (Long) NestedScrollNodeonPreFling1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read();
                l.getClass();
                return l;
            case 14:
                List list4 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l2 = (Long) NestedScrollNodeonPreFling1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
                l2.getClass();
                return l2;
            case 15:
                List list5 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l3 = (Long) NestedScrollNodeonPreFling1.initializeViewTreeOwners.read();
                l3.getClass();
                return l3;
            case 16:
                List list6 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l4 = (Long) NestedScrollNodeonPreFling1.getOnBackPressedInput.read();
                l4.getClass();
                return l4;
            case 17:
                List list7 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.addOnPictureInPictureUiStateChangedListener.read();
            case 18:
                List list8 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.addOnNewIntentListener.read()).longValue());
            case 19:
                List list9 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read();
            case 20:
                List list10 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read()).longValue());
            case 21:
                List list11 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                Boolean bool2 = (Boolean) accessgetSideEffectcp.IconCompatParcelizer.read();
                bool2.getClass();
                return bool2;
            case 22:
                List list12 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(NestedScrollSource.IconCompatParcelizer());
            case 23:
                List list13 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                accessgetExtendedTouchPaddingNHjbRcjd.write.B_();
                Boolean bool3 = (Boolean) AndroidPointerIconType.write.read();
                bool3.getClass();
                return bool3;
            default:
                List list14 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l5 = (Long) NestedScrollNodeonPreFling1.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.read();
                l5.getClass();
                return l5;
        }
    }

    public String toString() {
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != 1 ? super.toString() : "Arrangement#End";
    }
}
