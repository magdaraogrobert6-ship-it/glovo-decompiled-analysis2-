package o;

import android.view.Surface;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
        this.serializer = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        Object obj = this.serializer;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.write;
        Object obj4 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE r8lambdawfzs9fzbv91sxuexlj2tmbetive = (r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE) obj4;
            r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = (r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38) obj3;
            setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp = (setShouldPersistWebViewWhenBackgroundingApp) obj2;
            setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release = (setSmallNotificationIconNameandroid_sdk_base_release) obj;
            setshouldpersistwebviewwhenbackgroundingapp.getClass();
            try {
                r8lambdawfzs9fzbv91sxuexlj2tmbetive.write(r8lambda4gsaww0uf5fhes0li0lym_jwy38, setshouldpersistwebviewwhenbackgroundingapp, setsmallnotificationiconnameandroid_sdk_base_release);
                if (setsmallnotificationiconnameandroid_sdk_base_release == null) {
                    return;
                }
            } catch (IOException e) {
                r8lambdawfzs9fzbv91sxuexlj2tmbetive.IconCompatParcelizer(r8lambda4gsaww0uf5fhes0li0lym_jwy38, setshouldpersistwebviewwhenbackgroundingapp, e);
                if (setsmallnotificationiconnameandroid_sdk_base_release == null) {
                    return;
                }
            } finally {
                if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
                    setsmallnotificationiconnameandroid_sdk_base_release.close();
                }
            }
            return;
        }
        if (i == 1) {
            ((setNavigationOnClickListener) obj4).serializer((valueOf) obj3, (Executor) obj2, (setSubtitleTextColor) obj);
            return;
        }
        if (i == 2) {
            CombinedClickableNodehandleDownEvent2 combinedClickableNodehandleDownEvent2 = (CombinedClickableNodehandleDownEvent2) obj4;
            Surface surface = (Surface) obj3;
            onDrawBehind ondrawbehind = (onDrawBehind) obj2;
            androidx.camera.core.SurfaceRequest surfaceRequest = (androidx.camera.core.SurfaceRequest) obj;
            setInflatedId.IconCompatParcelizer(3, "TextureViewImpl");
            PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = combinedClickableNodehandleDownEvent2.MediaMetadataCompat;
            if (previewView$1$$ExternalSyntheticLambda2 != null) {
                previewView$1$$ExternalSyntheticLambda2.serializer();
                combinedClickableNodehandleDownEvent2.MediaMetadataCompat = null;
            }
            surface.release();
            if (combinedClickableNodehandleDownEvent2.MediaSessionCompatQueueItem == ondrawbehind) {
                combinedClickableNodehandleDownEvent2.MediaSessionCompatQueueItem = null;
            }
            if (combinedClickableNodehandleDownEvent2.MediaDescriptionCompat == surfaceRequest) {
                combinedClickableNodehandleDownEvent2.MediaDescriptionCompat = null;
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4) {
                ICardListener.RemoteActionCompatParcelizer((ICardListener) obj4, (String) obj3, (ArrayList) obj2, (ArrayList) obj);
                return;
            } else if (i != 5) {
                DustDataStoreProviderCompanion.serializer((DustDataStoreProviderCompanion) obj4, (String) obj3, (String) obj2, (r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U) obj);
                return;
            } else {
                ICardListener.read((ICardListener) obj4, (String) obj3, (r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ) obj2, (ArrayList) obj);
                return;
            }
        }
        androidx.work.impl.WorkerWrapper.Builder builder = (androidx.work.impl.WorkerWrapper.Builder) obj4;
        String str = (String) obj3;
        Map map = (Map) obj2;
        List list = (List) obj;
        isPlacedui isplacedui = (isPlacedui) builder.write;
        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) builder.RemoteActionCompatParcelizer;
        if (((String) atomicMarkableReference.getReference()) != null) {
            isplacedui.read(str, (String) atomicMarkableReference.getReference());
        }
        if (!map.isEmpty()) {
            isplacedui.write(str, map, false);
        }
        if (list.isEmpty()) {
            return;
        }
        isplacedui.read(str, list);
    }
}
