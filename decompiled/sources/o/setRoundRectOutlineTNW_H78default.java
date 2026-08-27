package o;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import com.google.android.gms.dynamite.DynamiteModule;
import com.huawei.hms.framework.common.ContainerUtils;
import io.sentry.SentryClient;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class setRoundRectOutlineTNW_H78default implements setStrokeWidth, accessgetUcp, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2, setDetachedFromParentLookaheadPassui, trimChain, MotionReferencePlacementDelegate {
    public final /* synthetic */ int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default RemoteActionCompatParcelizer = new setRoundRectOutlineTNW_H78default(11);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default IconCompatParcelizer = new setRoundRectOutlineTNW_H78default(12);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default RatingCompat = new setRoundRectOutlineTNW_H78default(13);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default MediaDescriptionCompat = new setRoundRectOutlineTNW_H78default(14);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default ParcelableVolumeInfo = new setRoundRectOutlineTNW_H78default(15);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default MediaSessionCompatResultReceiverWrapper = new setRoundRectOutlineTNW_H78default(16);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default MediaSessionCompatToken = new setRoundRectOutlineTNW_H78default(17);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default PlaybackStateCompatCustomAction = new setRoundRectOutlineTNW_H78default(18);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default PlaybackStateCompat = new setRoundRectOutlineTNW_H78default(19);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default ResultReceiver = new setRoundRectOutlineTNW_H78default(20);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default read = new setRoundRectOutlineTNW_H78default(21);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default write = new setRoundRectOutlineTNW_H78default(22);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default serializer = new setRoundRectOutlineTNW_H78default(23);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default MediaMetadataCompat = new setRoundRectOutlineTNW_H78default(24);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default MediaBrowserCompatMediaItem = new setRoundRectOutlineTNW_H78default(25);
    public static final /* synthetic */ setRoundRectOutlineTNW_H78default MediaSessionCompatQueueItem = new setRoundRectOutlineTNW_H78default(27);

    public /* synthetic */ setRoundRectOutlineTNW_H78default(int i) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
    }

    public static final String IconCompatParcelizer(String str) {
        try {
            return URLEncoder.encode(str, com.adjust.sdk.Constants.ENCODING).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException unused) {
            getButtonThumbLeftEK5gGoQ.write("Cannot encode the string: ".concat(String.valueOf(str)));
            return "";
        }
    }

    public static TooltipKt read(View view) {
        TooltipKt tooltipKt;
        WeakHashMap weakHashMap = TooltipKt.serializer;
        synchronized (weakHashMap) {
            Object tooltipKt2 = weakHashMap.get(view);
            if (tooltipKt2 == null) {
                tooltipKt2 = new TooltipKt(view);
                weakHashMap.put(view, tooltipKt2);
            }
            tooltipKt = (TooltipKt) tooltipKt2;
        }
        return tooltipKt;
    }

    @Override // o.setDetachedFromParentLookaheadPassui
    public Object IconCompatParcelizer(String str, java.security.Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // o.MotionReferencePlacementDelegate
    public StackTraceElement[] read(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public static TooltipKt read(getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        View view = (View) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        TooltipKt tooltipKt = read(view);
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(tooltipKt);
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(view);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new Recomposer$$ExternalSyntheticLambda4(tooltipKt, 7, view);
            getpostalcode.write(objComponentActivity);
        }
        getPhoneNumberNational.serializer(tooltipKt, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
        return tooltipKt;
    }

    public static final animateElevation serializer(int i, String str) {
        WeakHashMap weakHashMap = TooltipKt.serializer;
        return new animateElevation(i, str);
    }

    @Override // o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2
    public Object serializer() {
        switch (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            case 11:
                return new Boolean(nestedScrollModifierNode.write());
            case 12:
                List list = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.getActivityResultRegistry.read();
            case 13:
                List list2 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.getLastCustomNonConfigurationInstance.read();
            case 14:
                List list3 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.MediaSessionCompatToken.read()).longValue());
            case 15:
                List list4 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l = (Long) NestedScrollNodeonPreFling1._init_lambda1.read();
                l.getClass();
                return l;
            case 16:
                List list5 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l2 = (Long) NestedScrollNodeonPreFling1.MediaDescriptionCompat.read();
                l2.getClass();
                return l2;
            case 17:
                List list6 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.getOnBackPressedDispatcher.read()).longValue());
            case 18:
                List list7 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                getRelocateWNlRxjI.read.B_();
                return Integer.valueOf((int) ((Long) getFlingWNlRxjI.serializer.read()).longValue());
            case 19:
                List list8 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.addObserverForBackInvoker.read()).longValue());
            case 20:
                List list9 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.onBackPressedDispatcher_delegatelambda00.read();
            case 21:
                List list10 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.invalidateMenu.read()).longValue());
            case 22:
                List list11 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(getWheelWNlRxjI.IconCompatParcelizer());
            case 23:
                List list12 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                accessgetExtendedTouchPaddingNHjbRcjd.write.B_();
                Boolean bool = (Boolean) AndroidPointerIconType.MediaBrowserCompatMediaItem.read();
                bool.getClass();
                return bool;
            case 24:
                List list13 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(NestedScrollNodeKtfindNearestAttachedAncestor1.read());
            default:
                return new Boolean(getPointerIcon.read());
        }
    }

    public static final emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveShouldShowImageinvokeinlinedmap12 read(int i, String str) {
        WeakHashMap weakHashMap = TooltipKt.serializer;
        return new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveShouldShowImageinvokeinlinedmap12(new ScaffoldKtScaffoldLayoutfabContent11(0, 0, 0, 0), str);
    }

    @Override // o.accessgetUcp
    public int IconCompatParcelizer(Context context, String str) {
        return DynamiteModule.write(context, str);
    }

    public static String serializer(SentryClient sentryClient) {
        String strTrim;
        String string;
        boolean z = sentryClient.IconCompatParcelizer;
        String str = (String) sentryClient.serializer;
        if (z) {
            string = (String) sentryClient.write;
        } else {
            if (!str.trim().isEmpty()) {
                strTrim = str.trim();
            } else {
                strTrim = "-1";
            }
            StringBuilder sb = new StringBuilder();
            String str2 = (String) sentryClient.MediaDescriptionCompat;
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append("id");
            }
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(IconCompatParcelizer((String) sentryClient.RemoteActionCompatParcelizer));
            sb.append("&pv=");
            sb.append(IconCompatParcelizer(strTrim));
            sb.append("&rv=5.0");
            if (sentryClient.IconCompatParcelizer) {
                sb.append("&gtm_debug=x");
            }
            string = sb.toString();
        }
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("https://www.google-analytics.com/gtm/android?", string);
    }

    @Override // o.accessgetUcp
    public int RemoteActionCompatParcelizer(Context context, String str, boolean z) {
        return DynamiteModule.zza(context, str, z);
    }
}
