package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LastLocationRequest;
import java.util.List;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetVcp implements ImageOnlyContentCardViewViewHolder, setStrokeWidth, accessgetVolumeMutecp, accessgetNumPadRightParenthesiscp, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2, setDetachedFromParentLookaheadPassui, positionIniSbpLlYui, dataAvailable {
    public static accessgetVcp read;
    public final /* synthetic */ int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final /* synthetic */ accessgetVcp write = new accessgetVcp(10);
    public static final /* synthetic */ accessgetVcp RemoteActionCompatParcelizer = new accessgetVcp(11);
    public static final /* synthetic */ accessgetVcp MediaBrowserCompatMediaItem = new accessgetVcp(12);
    public static final /* synthetic */ accessgetVcp MediaSessionCompatToken = new accessgetVcp(13);
    public static final /* synthetic */ accessgetVcp MediaSessionCompatResultReceiverWrapper = new accessgetVcp(14);
    public static final /* synthetic */ accessgetVcp PlaybackStateCompat = new accessgetVcp(15);
    public static final /* synthetic */ accessgetVcp ParcelableVolumeInfo = new accessgetVcp(16);
    public static final /* synthetic */ accessgetVcp PlaybackStateCompatCustomAction = new accessgetVcp(17);
    public static final /* synthetic */ accessgetVcp ComponentActivity = new accessgetVcp(18);
    public static final /* synthetic */ accessgetVcp r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new accessgetVcp(19);
    public static final /* synthetic */ accessgetVcp serializer = new accessgetVcp(20);
    public static final /* synthetic */ accessgetVcp IconCompatParcelizer = new accessgetVcp(21);
    public static final /* synthetic */ accessgetVcp MediaDescriptionCompat = new accessgetVcp(22);
    public static final /* synthetic */ accessgetVcp MediaMetadataCompat = new accessgetVcp(23);
    public static final /* synthetic */ accessgetVcp RatingCompat = new accessgetVcp(24);
    public static final /* synthetic */ accessgetVcp MediaSessionCompatQueueItem = new accessgetVcp(25);

    @Override // o.dataAvailable
    public ifDebug IconCompatParcelizer(int i) {
        return observeMeasureSnapshotReadsui.forNumber(i);
    }

    public /* synthetic */ accessgetVcp(int i) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
    }

    @Override // o.accessgetVolumeMutecp
    public toXyzui_graphics read(Context context, String str, accessgetUcp accessgetucp) {
        toXyzui_graphics toxyzui_graphics = new toXyzui_graphics();
        int iRemoteActionCompatParcelizer = accessgetucp.RemoteActionCompatParcelizer(context, str, true);
        toxyzui_graphics.IconCompatParcelizer = iRemoteActionCompatParcelizer;
        if (iRemoteActionCompatParcelizer != 0) {
            toxyzui_graphics.write = 1;
            return toxyzui_graphics;
        }
        int iIconCompatParcelizer = accessgetucp.IconCompatParcelizer(context, str);
        toxyzui_graphics.RemoteActionCompatParcelizer = iIconCompatParcelizer;
        if (iIconCompatParcelizer != 0) {
            toxyzui_graphics.write = -1;
        }
        return toxyzui_graphics;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public /* synthetic */ void serializer(Object obj, Object obj2) {
        ((zzdz) obj).IconCompatParcelizer(new LastLocationRequest.Builder().build(), (ParentDataModifierDefaultImpls) obj2);
    }

    @Override // o.positionIniSbpLlYui
    public void read(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public com.deliveryhero.customerchat.CustomerChatModule serializer(Context context) {
        com.deliveryhero.customerchat.CustomerChatModule customerChatModule;
        com.deliveryhero.customerchat.CustomerChatModule customerChatModule2 = com.deliveryhero.customerchat.CustomerChatModule.RemoteActionCompatParcelizer;
        if (customerChatModule2 != null) {
            return customerChatModule2;
        }
        synchronized (this) {
            customerChatModule = com.deliveryhero.customerchat.CustomerChatModule.RemoteActionCompatParcelizer;
            if (customerChatModule == null) {
                customerChatModule = new com.deliveryhero.customerchat.CustomerChatModule(context);
                com.deliveryhero.customerchat.CustomerChatModule.RemoteActionCompatParcelizer = customerChatModule;
            }
        }
        return customerChatModule;
    }

    @Override // o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2
    public Object serializer() {
        switch (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            case 11:
                return new Boolean(accessgetUserInputcp.read());
            case 12:
                List list = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(setConnection.IconCompatParcelizer());
            case 13:
                List list2 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.ParcelableVolumeInfo.read();
            case 14:
                List list3 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read()).longValue());
            case 15:
                List list4 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l = (Long) NestedScrollNodeonPreFling1.onBackPressedDispatcher_delegatelambda010.read();
                l.getClass();
                return l;
            case 16:
                List list5 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l2 = (Long) NestedScrollNodeonPreFling1._init_lambda2.read();
                l2.getClass();
                return l2;
            case 17:
                List list6 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l3 = (Long) NestedScrollNodeonPreFling1.MediaBrowserCompatMediaItem.read();
                l3.getClass();
                return l3;
            case 18:
                List list7 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                getRelocateWNlRxjI.read.B_();
                Double d = (Double) getFlingWNlRxjI.RemoteActionCompatParcelizer.read();
                d.getClass();
                return d;
            case 19:
                List list8 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.onActivityResult.read()).longValue());
            case 20:
                List list9 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.addOnPictureInPictureModeChangedListener.read();
            case 21:
                List list10 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Boolean bool = (Boolean) NestedScrollNodeonPreFling1.addOnMultiWindowModeChangedListener.read();
                bool.getClass();
                return bool;
            case 22:
                List list11 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                Boolean bool2 = (Boolean) ConsumedData.write.read();
                bool2.getClass();
                return bool2;
            case 23:
                List list12 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.createFullyDrawnExecutor.read()).longValue());
            case 24:
                List list13 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(getParentNestedScrollNodeui.read());
            default:
                return new Boolean(((Boolean) withTimeout.IconCompatParcelizer.read()).booleanValue());
        }
    }

    public String toString() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != 3 ? super.toString() : "CompositionErrorContext";
    }

    @Override // o.setDetachedFromParentLookaheadPassui
    public Object IconCompatParcelizer(String str, java.security.Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
