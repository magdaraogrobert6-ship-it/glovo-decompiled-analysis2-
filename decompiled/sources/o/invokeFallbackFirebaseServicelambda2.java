package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "MovingStateEvaluator")
public class invokeFallbackFirebaseServicelambda2 {
    public static final List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> IconCompatParcelizer = Arrays.asList(r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class, BrazeBootReceiver.class, setShouldPersistWebView.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class, r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, wipeDatalambda0.class, r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class);
    private final parseLonglambda0 MediaBrowserCompatMediaItem;
    private final component4android_sdk_base_release RemoteActionCompatParcelizer;
    private final getVerticalAccuracy read;
    private final Context serializer;
    private final getCooldownEnterSeconds write;

    public invokeFallbackFirebaseServicelambda2(Context context, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy, component4android_sdk_base_release component4android_sdk_base_releaseVar, parseLonglambda0 parselonglambda0) {
        this.serializer = context;
        this.write = getcooldownenterseconds;
        this.read = getverticalaccuracy;
        this.RemoteActionCompatParcelizer = component4android_sdk_base_releaseVar;
        this.MediaBrowserCompatMediaItem = parselonglambda0;
    }

    private r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 serializer(getCooldownEnterSeconds.read readVar, handleBrazeRemoteMessagelambda5 handlebrazeremotemessagelambda5, int i) {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5;
        wipeDatalambda0 wipedatalambda0;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4IconCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda6;
        r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a;
        Byte b;
        r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0i;
        Map map = null;
        if (i != 2) {
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(IconCompatParcelizer, Long.valueOf(readVar.serializer()), false);
            r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer = optionalRemoteActionCompatParcelizer.IconCompatParcelizer() ? serializer(optionalRemoteActionCompatParcelizer.write(), handlebrazeremotemessagelambda5, i + 1) : null;
            long jSerializer = readVar.serializer();
            Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(readVar, this.read);
            if (clsIconCompatParcelizer == setShouldPersistWebView.class) {
                return new invokeFallbackFirebaseServicelambda5(this.serializer, r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer, handlebrazeremotemessagelambda5, null, jSerializer);
            }
            component4android_sdk_base_release component4android_sdk_base_releaseVar = this.RemoteActionCompatParcelizer;
            if (clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer == null || (r8lambdaxnkp5mxo9act549dmvgqnyhj0i = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.getSavedStateRegistryControllerannotations) == null) {
                    b = null;
                } else {
                    map = r8lambdaxnkp5mxo9act549dmvgqnyhj0i.IconCompatParcelizer;
                    b = r8lambdaxnkp5mxo9act549dmvgqnyhj0i.read;
                }
                return new invokeFallbackFirebaseServicelambda4(this.serializer, r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer, handlebrazeremotemessagelambda5, null, jSerializer, map, b);
            }
            if (clsIconCompatParcelizer == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 = readVar.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 == null || (r8lambdadtwa3yx1e9cvszaagaemidzvt8a = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2.serializer.addObserverForBackInvoker) == null) {
                    brazeCompanionExternalSyntheticLambda4IconCompatParcelizer = null;
                    brazeCompanionExternalSyntheticLambda6 = null;
                } else {
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda7 = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.write;
                    brazeCompanionExternalSyntheticLambda4IconCompatParcelizer = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.IconCompatParcelizer;
                    brazeCompanionExternalSyntheticLambda6 = brazeCompanionExternalSyntheticLambda7;
                }
                if (brazeCompanionExternalSyntheticLambda4IconCompatParcelizer == null && r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer != null && r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer.getClass() == invokeFallbackFirebaseServiceandroid_sdk_ui_release.class) {
                    brazeCompanionExternalSyntheticLambda4IconCompatParcelizer = ((invokeFallbackFirebaseServiceandroid_sdk_ui_release) r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer).IconCompatParcelizer();
                }
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda8 = brazeCompanionExternalSyntheticLambda4IconCompatParcelizer;
                long jRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer();
                Optional optionalSerializer = serializer(Long.valueOf(jRemoteActionCompatParcelizer), Collections.singletonList((byte) 1));
                Long l = optionalSerializer.IconCompatParcelizer() ? ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) optionalSerializer.write()).RemoteActionCompatParcelizer : null;
                Optional optionalSerializer2 = serializer(Long.valueOf(jRemoteActionCompatParcelizer), Collections.singletonList((byte) 10));
                Long l2 = optionalSerializer2.IconCompatParcelizer() ? ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) optionalSerializer2.write()).RemoteActionCompatParcelizer : null;
                if (l == null) {
                    optionalSerializer = Optional.MediaSessionCompatQueueItem();
                } else if (l2 != null && l2.longValue() > l.longValue()) {
                    optionalSerializer = optionalSerializer2;
                }
                if (optionalSerializer.IconCompatParcelizer() && ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) optionalSerializer.write()).serializer.fullyDrawnReporter_delegatelambda0 != null) {
                    if (brazeCompanionExternalSyntheticLambda6 == null) {
                        brazeCompanionExternalSyntheticLambda6 = ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) optionalSerializer.write()).serializer.fullyDrawnReporter_delegatelambda0.serializer;
                    }
                    return new BrazeHuaweiPushHandler(this.serializer, r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer, handlebrazeremotemessagelambda5, ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) optionalSerializer.write()).IconCompatParcelizer, brazeCompanionExternalSyntheticLambda6, brazeCompanionExternalSyntheticLambda8, jSerializer);
                }
                return new BrazeHuaweiPushHandler(this.serializer, r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer, handlebrazeremotemessagelambda5, null, brazeCompanionExternalSyntheticLambda6, brazeCompanionExternalSyntheticLambda8, jSerializer);
            }
            if (clsIconCompatParcelizer == wipeDatalambda0.class) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3 = readVar.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3 == null || (wipedatalambda0 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3.serializer.MediaBrowserCompatMediaItem) == null) {
                    brazeCompanionExternalSyntheticLambda4 = null;
                    brazeCompanionExternalSyntheticLambda5 = null;
                } else {
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda9 = wipedatalambda0.RemoteActionCompatParcelizer;
                    brazeCompanionExternalSyntheticLambda5 = wipedatalambda0.serializer;
                    brazeCompanionExternalSyntheticLambda4 = brazeCompanionExternalSyntheticLambda9;
                }
                return new invokeFallbackFirebaseServiceandroid_sdk_ui_release(this.serializer, r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer, handlebrazeremotemessagelambda5, brazeCompanionExternalSyntheticLambda4, brazeCompanionExternalSyntheticLambda5, jSerializer);
            }
            if (clsIconCompatParcelizer == BrazeBootReceiver.class) {
                return new handleHmsRemoteMessageDatalambda0(this.serializer, r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer, handlebrazeremotemessagelambda5, null, jSerializer);
            }
            if (clsIconCompatParcelizer == r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class) {
                return new r8lambda_MvJ1JSrxq892xe8HQfhgWx_XuY(this.serializer, r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer, handlebrazeremotemessagelambda5, null, jSerializer);
            }
            if (clsIconCompatParcelizer == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                Optional optionalSerializer3 = serializer(Long.valueOf(readVar.RemoteActionCompatParcelizer()), Arrays.asList((byte) 2, (byte) 9));
                return new r8lambdaQMriIuHDeDtNo94f7n84_zLW7oI(this.serializer, r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer, handlebrazeremotemessagelambda5, optionalSerializer3.IconCompatParcelizer() ? ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) optionalSerializer3.write()).IconCompatParcelizer : null, jSerializer);
            }
        }
        return null;
    }

    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 write(long j, handleBrazeRemoteMessagelambda5 handlebrazeremotemessagelambda5, boolean z) {
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(IconCompatParcelizer, Long.valueOf(j), z);
        if (optionalRemoteActionCompatParcelizer.read()) {
            return new r8lambda_MvJ1JSrxq892xe8HQfhgWx_XuY(this.serializer, null, handlebrazeremotemessagelambda5, null, j);
        }
        return serializer(optionalRemoteActionCompatParcelizer.write(), handlebrazeremotemessagelambda5, 0);
    }

    public final Optional serializer(Long l, List list) {
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu;
        try {
            Iterator<getCooldownEnterSeconds.read> it = this.write.RemoteActionCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, null, l, true, true).iterator();
            while (it.hasNext()) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdazeccixubf3xvz58yt5bojkwhdu = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.fullyDrawnReporter_delegatelambda0) != null && list.contains(r8lambdazeccixubf3xvz58yt5bojkwhdu.read)) {
                    return Optional.RemoteActionCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer);
                }
            }
        } catch (Exception e) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(false, e, "Couldn't deserialize last geofence event.", new Object[0]);
        }
        return Optional.MediaSessionCompatQueueItem();
    }
}
