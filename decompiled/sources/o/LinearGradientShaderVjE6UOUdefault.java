package o;

import bo.app.f2$$ExternalSyntheticLambda4;
import coil3.Extras$Key;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class LinearGradientShaderVjE6UOUdefault {
    public static final Extras$Key IconCompatParcelizer = new Extras$Key(0, instance_delegatelambda0.write);
    public static final Extras$Key RemoteActionCompatParcelizer;
    public static final Extras$Key serializer;
    public static final Extras$Key write;

    static {
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.read(androidx.compose.ui.graphics.Fields.TransformOrigin);
        ShadowCompanion shadowCompanion = new ShadowCompanion(androidx.compose.ui.graphics.Fields.TransformOrigin);
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.read(androidx.compose.ui.graphics.Fields.TransformOrigin);
        write = new Extras$Key(0, new accessgetLayerBlockp(shadowCompanion, new ShadowCompanion(androidx.compose.ui.graphics.Fields.TransformOrigin)));
        RemoteActionCompatParcelizer = new Extras$Key(0, Boolean.FALSE);
        serializer = new Extras$Key(0, Boolean.TRUE);
    }

    public static final void serializer(setTransformQ8lPUPs settransformq8lpups, accessgetRotatecp... accessgetrotatecpArr) {
        List listRatingCompat = onContentCardClicked.RatingCompat(accessgetrotatecpArr);
        accessorjd accessorjdVarWrite = settransformq8lpups.write();
        List listRemoteActionCompatParcelizer = DelayKt.RemoteActionCompatParcelizer(listRatingCompat);
        LinkedHashMap linkedHashMap = accessorjdVarWrite.serializer;
        Extras$Key extras$Key = IconCompatParcelizer;
        if (listRemoteActionCompatParcelizer != null) {
            linkedHashMap.put(extras$Key, listRemoteActionCompatParcelizer);
        } else {
            linkedHashMap.remove(extras$Key);
        }
        settransformq8lpups.read().put("coil#transformations", onContentCardDismissed.IconCompatParcelizer(listRatingCompat, null, null, null, new f2$$ExternalSyntheticLambda4(8, new createBrazeUserChangeEventSubscriberlambda01()), 31));
    }

    public static final void write(setTransformQ8lPUPs settransformq8lpups) {
        Extras$Key extras$Key = LinearGradientShaderVjE6UOU.MediaDescriptionCompat;
        getMorphYpspkwk getmorphypspkwk = new getMorphYpspkwk(200);
        accessorjd accessorjdVarWrite = settransformq8lpups.write();
        accessorjdVarWrite.serializer.put(LinearGradientShaderVjE6UOU.MediaDescriptionCompat, getmorphypspkwk);
    }
}
