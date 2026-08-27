package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.api.requests.SdkInitConfigRequestReason;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.crashloop.SdkInitGate$fetchInitConfigAndExecuteAction$1;
import com.sentiance.sdk.crashloop.SdkInitGate$fetchSdkInitConfig$1;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import o.createFromParcel;
import o.r8lambdacjWcjm3stVKeZF_SundXc95EHE8;
import o.r8lambdaeD9byxNVlFNFerv0pUjy_LuGI;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SdkInitGate", guardType = Guard$Type.REFERENCE_COUNTED)
public final class r8lambdacjWcjm3stVKeZF_SundXc95EHE8 {
    private final ConfigurationManager IconCompatParcelizer;
    private final stringAndKey MediaBrowserCompatMediaItem;
    private final readStringlambda0 MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final parseLonglambda0 MediaSessionCompatQueueItem;
    private final long MediaSessionCompatToken;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 RatingCompat;
    private final r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q RemoteActionCompatParcelizer;
    private final r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk read;
    private final readandroid_sdk_base_release serializer;
    private final requestSingleLocationUpdateFromGooglePlaylambda30 write;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean RemoteActionCompatParcelizer(long j) {
        Long lAddObserverForBackInvokerlambda0 = this.IconCompatParcelizer.addObserverForBackInvokerlambda0();
        return lAddObserverForBackInvokerlambda0 != null && j <= lAddObserverForBackInvokerlambda0.longValue();
    }

    public final boolean RemoteActionCompatParcelizer() {
        boolean zR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = this.IconCompatParcelizer.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        parseLonglambda0 parselonglambda0 = this.MediaSessionCompatQueueItem;
        if (!zR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
            parselonglambda0.IconCompatParcelizer("SDK init gate is disabled, allowing init to proceed", new Object[0]);
            return true;
        }
        r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk = this.read;
        boolean z = r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.read();
        r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q = this.RemoteActionCompatParcelizer;
        if (z) {
            parselonglambda0.IconCompatParcelizer("Forcing upload of logs and events", new Object[0]);
            this.MediaBrowserCompatMediaItem.write((d0$$ExternalSyntheticLambda0) null);
            r8lambdazxt1df5niyc198h8rswq6bap4q.IconCompatParcelizer(SdkInitConfigRequestReason.SDK_DETECTED, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new SdkInitGate$fetchSdkInitConfig$1(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.crashloop.SdkInitGate$checkInitPossible$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    this.this$0.read.IconCompatParcelizer();
                    r8lambdacjWcjm3stVKeZF_SundXc95EHE8.read(this.this$0, (r8lambdaeD9byxNVlFNFerv0pUjy_LuGI) obj);
                    return createFromParcel.INSTANCE;
                }

                {
                    super(1);
                }
            }));
            parselonglambda0.IconCompatParcelizer("Crash loop detected, blocking SDK init and fetching init config", new Object[0]);
            return false;
        }
        r8lambdaeD9byxNVlFNFerv0pUjy_LuGI r8lambdaed9byxnvlfnferv0pujy_lugi = r8lambdazxt1df5niyc198h8rswq6bap4q.read();
        if (r8lambdaed9byxnvlfnferv0pujy_lugi == null) {
            parselonglambda0.IconCompatParcelizer("No cached SDK init action available, allowing init to proceed but fetching init config", new Object[0]);
            r8lambdazxt1df5niyc198h8rswq6bap4q.IconCompatParcelizer(SdkInitConfigRequestReason.NORMAL, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new SdkInitGate$fetchSdkInitConfig$1(new SdkInitGate$fetchInitConfigAndExecuteAction$1(this)));
            return true;
        }
        if (!(r8lambdaed9byxnvlfnferv0pujy_lugi instanceof r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer)) {
            if (!(r8lambdaed9byxnvlfnferv0pujy_lugi instanceof r8lambda_LVHdsEDcH1gnImtxbHCK_OJoU)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
            parselonglambda0.IconCompatParcelizer("Cached SDK init action of type Pause, blocking init and fetching init config", new Object[0]);
            r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.IconCompatParcelizer();
            r8lambdazxt1df5niyc198h8rswq6bap4q.IconCompatParcelizer(SdkInitConfigRequestReason.NORMAL, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new SdkInitGate$fetchSdkInitConfig$1(new SdkInitGate$fetchInitConfigAndExecuteAction$1(this)));
            return false;
        }
        parselonglambda0.IconCompatParcelizer("Cached SDK init action of type ConfigUpdate", new Object[0]);
        r8lambdazxt1df5niyc198h8rswq6bap4q.IconCompatParcelizer(SdkInitConfigRequestReason.NORMAL, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new SdkInitGate$fetchSdkInitConfig$1(null));
        r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer) r8lambdaed9byxnvlfnferv0pujy_lugi;
        if (RemoteActionCompatParcelizer(remoteActionCompatParcelizer.serializer())) {
            parselonglambda0.IconCompatParcelizer("SDK config is up to date, no need to fetch new config", new Object[0]);
            return true;
        }
        read(remoteActionCompatParcelizer.serializer());
        return true;
    }

    public r8lambdacjWcjm3stVKeZF_SundXc95EHE8(r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk, r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30, ConfigurationManager configurationManager, stringAndKey stringandkey, readStringlambda0 readstringlambda0, parseLonglambda0 parselonglambda0, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4) {
        r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.getClass();
        r8lambdazxt1df5niyc198h8rswq6bap4q.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        requestsinglelocationupdatefromgoogleplaylambda30.getClass();
        configurationManager.getClass();
        stringandkey.getClass();
        readstringlambda0.getClass();
        parselonglambda0.getClass();
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.getClass();
        this.read = r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk;
        this.RemoteActionCompatParcelizer = r8lambdazxt1df5niyc198h8rswq6bap4q;
        this.serializer = readandroid_sdk_base_releaseVar;
        this.write = requestsinglelocationupdatefromgoogleplaylambda30;
        this.IconCompatParcelizer = configurationManager;
        this.MediaBrowserCompatMediaItem = stringandkey;
        this.MediaDescriptionCompat = readstringlambda0;
        this.MediaSessionCompatQueueItem = parselonglambda0;
        this.RatingCompat = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        long jSerializer = r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs.serializer(60);
        this.MediaMetadataCompat = jSerializer;
        this.MediaSessionCompatToken = jSerializer;
    }

    private final void IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder("Scheduling fetch of new SDK init config in ");
        long j = this.MediaMetadataCompat;
        sb.append(Long.valueOf(j).longValue() / 1000);
        sb.append(" seconds to check for new action");
        this.MediaSessionCompatQueueItem.IconCompatParcelizer(sb.toString(), new Object[0]);
        readStringlambda0.write(this.MediaDescriptionCompat, this.serializer, j, null, new ZM$$ExternalSyntheticLambda2(20, this), 12).serializer();
    }

    public static void serializer(r8lambdacjWcjm3stVKeZF_SundXc95EHE8 r8lambdacjwcjm3stvkezf_sundxc95ehe8) {
        r8lambdacjwcjm3stvkezf_sundxc95ehe8.RemoteActionCompatParcelizer.IconCompatParcelizer(SdkInitConfigRequestReason.NORMAL, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new SdkInitGate$fetchSdkInitConfig$1(new SdkInitGate$fetchInitConfigAndExecuteAction$1(r8lambdacjwcjm3stvkezf_sundxc95ehe8)));
    }

    public static final void read(r8lambdacjWcjm3stVKeZF_SundXc95EHE8 r8lambdacjwcjm3stvkezf_sundxc95ehe8, r8lambdaeD9byxNVlFNFerv0pUjy_LuGI r8lambdaed9byxnvlfnferv0pujy_lugi) {
        r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4 = r8lambdacjwcjm3stvkezf_sundxc95ehe8.RatingCompat;
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.read();
        parseLonglambda0 parselonglambda0 = r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaSessionCompatQueueItem;
        parselonglambda0.IconCompatParcelizer("Executing SDK init config action: %s", r8lambdaed9byxnvlfnferv0pujy_lugi);
        if (r8lambdaed9byxnvlfnferv0pujy_lugi instanceof r8lambda_LVHdsEDcH1gnImtxbHCK_OJoU) {
            r8lambdacjwcjm3stvkezf_sundxc95ehe8.IconCompatParcelizer();
        } else if (r8lambdaed9byxnvlfnferv0pujy_lugi instanceof r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer) {
            r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer) r8lambdaed9byxnvlfnferv0pujy_lugi;
            if (!r8lambdacjwcjm3stvkezf_sundxc95ehe8.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.serializer())) {
                r8lambdacjwcjm3stvkezf_sundxc95ehe8.read(remoteActionCompatParcelizer.serializer());
            } else {
                parselonglambda0.IconCompatParcelizer("SDK config is up to date", new Object[0]);
                r8lambdacjwcjm3stvkezf_sundxc95ehe8.IconCompatParcelizer();
            }
        }
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(long j) {
        this.MediaSessionCompatQueueItem.IconCompatParcelizer("Fetching new SDK config with min modified time %d", Long.valueOf(j));
        this.write.RemoteActionCompatParcelizer(new r8lambda_j_I8cEOzijBFPHvG1z87DEoYF4(this, j));
    }

    public static final void read(r8lambdacjWcjm3stVKeZF_SundXc95EHE8 r8lambdacjwcjm3stvkezf_sundxc95ehe8, long j, Runnable runnable) {
        readStringlambda0.write(r8lambdacjwcjm3stvkezf_sundxc95ehe8.MediaDescriptionCompat, r8lambdacjwcjm3stvkezf_sundxc95ehe8.serializer, j, null, runnable, 12).serializer();
    }
}
