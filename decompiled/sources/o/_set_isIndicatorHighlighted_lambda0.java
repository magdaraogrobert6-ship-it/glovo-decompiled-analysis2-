package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.ScreenState;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ScreenTimelineCreator")
public class _set_isIndicatorHighlighted_lambda0 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug> RemoteActionCompatParcelizer = new _set_isDismissed_lambda2(this);
    private final setHeaderTextColor read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    private List<getImageStyle> serializer(long j, ScreenState screenState) {
        migrateTriggersReeligibilityToJsonlambda4<r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug> migratetriggersreeligibilitytojsonlambda4 = this.RemoteActionCompatParcelizer;
        r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug r8lambdagfx2d0s8xnd6nnquzmue4f_plug = migratetriggersreeligibilitytojsonlambda4.read();
        if (r8lambdagfx2d0s8xnd6nnquzmue4f_plug != null && r8lambdagfx2d0s8xnd6nnquzmue4f_plug.serializer() == screenState) {
            return Collections.EMPTY_LIST;
        }
        String string = UUID.randomUUID().toString();
        this.write.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug r8lambdagfx2d0s8xnd6nnquzmue4f_plug2 = new r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug(string, screenState, j, j, jCurrentTimeMillis, jCurrentTimeMillis);
        migratetriggersreeligibilitytojsonlambda4.IconCompatParcelizer(r8lambdagfx2d0s8xnd6nnquzmue4f_plug2);
        return Collections.singletonList(getImageStyle.RemoteActionCompatParcelizer(r8lambdagfx2d0s8xnd6nnquzmue4f_plug2));
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.RemoteActionCompatParcelizer.write();
    }

    public _set_isIndicatorHighlighted_lambda0(setHeaderTextColor setheadertextcolor, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = setheadertextcolor;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final List<getImageStyle> IconCompatParcelizer(getLongitudeannotations<retryInAppMessage> getlongitudeannotations) {
        ScreenState screenState;
        Boolean bool;
        retryInAppMessage retryinappmessage = getlongitudeannotations.read();
        Byte b = retryinappmessage.read;
        if (b.byteValue() == 1 && (bool = retryinappmessage.serializer) != null && bool.booleanValue()) {
            return Collections.EMPTY_LIST;
        }
        if (b.byteValue() == 1) {
            screenState = ScreenState.ON;
        } else {
            screenState = b.byteValue() == 2 ? ScreenState.OFF : ScreenState.UNKNOWN;
        }
        return serializer(getlongitudeannotations.write(), screenState);
    }

    public final List<getImageStyle> read(getLongitudeannotations<setStaticExternalIEventMessengerandroid_sdk_base_release> getlongitudeannotations) {
        return serializer(getlongitudeannotations.write(), ScreenState.ON);
    }
}
