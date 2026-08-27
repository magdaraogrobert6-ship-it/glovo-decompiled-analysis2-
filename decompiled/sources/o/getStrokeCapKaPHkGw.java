package o;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.widget.Toast;
import androidx.camera.video.Recorder$3;
import androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.huawei.hmf.tasks.a.i$d;
import kotlinx.coroutines.MainCoroutineDispatcher;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class getStrokeCapKaPHkGw implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ getStrokeCapKaPHkGw(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 107;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.read;
        Object obj4 = this.serializer;
        int i5 = 1;
        if (i4 == 0) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) obj2;
            supportsColorMatrixQuery supportscolormatrixquery = (supportsColorMatrixQuery) obj3;
            MainCoroutineDispatcher mainCoroutineDispatcher = (MainCoroutineDispatcher) obj4;
            r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
            if (mainCoroutineDispatcher.isDispatchNeeded(r8lambda2qmxd75iptxkfld4rjabqemoamc)) {
                mainCoroutineDispatcher.dispatch(r8lambda2qmxd75iptxkfld4rjabqemoamc, new setFromEL8BTi8(supportscolormatrixquery, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, i5));
            } else {
                supportscolormatrixquery.read(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
            }
            return createfromparcel;
        }
        Object obj5 = null;
        if (i4 != 1) {
            if (i4 != 2) {
                setDrawResultui setdrawresultui = (setDrawResultui) obj;
                setdrawresultui.getClass();
                setDrawResultui.write(setdrawresultui, (ClipKt) obj4);
                i$d.read(setdrawresultui.RatingCompat, ((ClipKt) obj3).RemoteActionCompatParcelizer, 0.0f, 6);
                i$d.read(setdrawresultui.IconCompatParcelizer, (clip) obj2, 0.0f, 6);
                int i6 = MediaSessionCompatQueueItem + 105;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return createfromparcel;
                }
                obj5.hashCode();
                throw null;
            }
            setDrawResultui setdrawresultui2 = (setDrawResultui) obj;
            setdrawresultui2.getClass();
            i$d i_d = setdrawresultui2.IconCompatParcelizer;
            i$d.read(setdrawresultui2.RatingCompat, ((ClipKt) obj4).read, 0.0f, 6);
            Recorder$3 recorder$3 = setdrawresultui2.MediaSessionCompatQueueItem;
            ClipKt clipKt = setdrawresultui2.MediaMetadataCompat;
            Recorder$3.RemoteActionCompatParcelizer(recorder$3, clipKt.MediaDescriptionCompat, 0.0f, 6);
            String str = ((CharSequenceCharacterIterator) obj3).serializer;
            if (str == null) {
                i$d.read(i_d, clipKt.RemoteActionCompatParcelizer, 0.0f, 6);
            } else if (str.length() == 0) {
                int i7 = write + 63;
                MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i$d.read(i_d, clipKt.RemoteActionCompatParcelizer, 0.0f, 6);
            } else {
                i$d.read(i_d, ((ClipKt) obj2).read, 0.0f, 6);
            }
            setdrawresultui2.serializer(new DrawModifierKt(null, "spread"));
            return createfromparcel;
        }
        getStrokeLineCapCSYIeUk getstrokelinecapcsyieuk = (getStrokeLineCapCSYIeUk) obj;
        getstrokelinecapcsyieuk.getClass();
        MainActivity mainActivity = (MainActivity) obj4;
        if (getstrokelinecapcsyieuk instanceof createVectorImageBuilder) {
            try {
                mainActivity.startActivity(((createVectorImageBuilder) getstrokelinecapcsyieuk).RemoteActionCompatParcelizer);
                return createfromparcel;
            } catch (ActivityNotFoundException e) {
                String localClassName = mainActivity.getLocalClassName();
                localClassName.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(localClassName + " ActivityNotFoundException: " + e, new Object[0]);
                ((XmlVectorParser_androidKt) obj3).IconCompatParcelizer(e, (MainActivity) obj2);
                return createfromparcel;
            }
        }
        if (!(getstrokelinecapcsyieuk instanceof getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i9 = MediaSessionCompatQueueItem + 45;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH getstyleable_vector_drawable_viewport_width = (getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH) getstrokelinecapcsyieuk;
        ClipData clipDataNewPlainText = ClipData.newPlainText(getstyleable_vector_drawable_viewport_width.write, getstyleable_vector_drawable_viewport_width.IconCompatParcelizer);
        Object systemService = mainActivity.getSystemService("clipboard");
        systemService.getClass();
        ((android.content.ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
        Toast.makeText(mainActivity, getstyleable_vector_drawable_viewport_width.read, 0).show();
        return createfromparcel;
    }
}
