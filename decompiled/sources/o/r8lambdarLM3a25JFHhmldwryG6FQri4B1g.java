package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.api.requests.SdkInitConfigRequestReason;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SdkInitConfigDownloader")
public final class r8lambdarLM3a25JFHhmldwryG6FQri4B1g implements r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ {
    private final requestSingleLocationUpdate IconCompatParcelizer;
    private final ArrayList<onViewAttachedToWindowlambda0> RemoteActionCompatParcelizer;
    private boolean read;
    private final parseLonglambda0 serializer;
    private final Object write;

    public r8lambdarLM3a25JFHhmldwryG6FQri4B1g(parseLonglambda0 parselonglambda0, requestSingleLocationUpdate requestsinglelocationupdate) {
        parselonglambda0.getClass();
        requestsinglelocationupdate.getClass();
        this.serializer = parselonglambda0;
        this.IconCompatParcelizer = requestsinglelocationupdate;
        this.write = new Object();
        this.RemoteActionCompatParcelizer = new ArrayList<>();
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp) {
        setshouldpersistwebviewwhenbackgroundingapp.getClass();
        setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release = setshouldpersistwebviewwhenbackgroundingapp.MediaBrowserCompatMediaItem;
        if (setshouldpersistwebviewwhenbackgroundingapp.write()) {
            parseLonglambda0 parselonglambda0 = this.serializer;
            if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
                try {
                    read(new r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.IconCompatParcelizer((r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI.class, setsmallnotificationiconnameandroid_sdk_base_release.serializer())));
                } catch (Exception e) {
                    parselonglambda0.IconCompatParcelizer(false, e, "SDK init config retrieval failed. Response was invalid.", new Object[0]);
                    read(new r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.serializer.RemoteActionCompatParcelizer("SDK init config retrieval failed. Response was invalid."));
                }
            } else {
                parselonglambda0.RemoteActionCompatParcelizer("SDK init retrieval failed. Response has no body.", new Object[0]);
                read(new r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.serializer.RemoteActionCompatParcelizer("SDK init retrieval failed. Response has no body."));
            }
        } else {
            int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
            read(i == 500 ? r8lambdaxS4AA7_c1TPndkBLChWJjjbkp94.read : new r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.serializer.write(c8$$ExternalSyntheticOutline0.m(i, "Failed to fetch SDK init config with response code ")));
        }
        if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
            setsmallnotificationiconnameandroid_sdk_base_release.close();
        }
    }

    public final void IconCompatParcelizer(SdkInitConfigRequestReason sdkInitConfigRequestReason, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        sdkInitConfigRequestReason.getClass();
        synchronized (this.write) {
            this.RemoteActionCompatParcelizer.add(new onViewAttachedToWindowlambda0(clearandroid_sdk_base_releaseVar, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
            if (this.read) {
                return;
            }
            this.read = true;
            this.IconCompatParcelizer.IconCompatParcelizer(sdkInitConfigRequestReason, this);
        }
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        iOException.getClass();
        this.serializer.IconCompatParcelizer(false, iOException, "SDK init config retrieval failed", new Object[0]);
        read(r8lambdau6Cp9UDDwtBClFwxR59e4VMWc_U.read);
    }

    private final void read(r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4 r8lambdai5nub7sp_oydxv9gxfmziuf3u4) {
        synchronized (this.write) {
            this.read = false;
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : this.RemoteActionCompatParcelizer) {
                ((clearandroid_sdk_base_release) onviewattachedtowindowlambda0.serializer).RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda0((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) onviewattachedtowindowlambda0.write, r8lambdai5nub7sp_oydxv9gxfmziuf3u4, 27));
            }
            this.RemoteActionCompatParcelizer.clear();
        }
    }
}
