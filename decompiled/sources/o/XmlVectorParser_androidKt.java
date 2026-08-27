package o;

import android.content.ActivityNotFoundException;
import android.view.View;
import androidx.cardview.widget.CardView$1;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.Extras$Key;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.android.gms.internal.mlkit_vision_common.zzav;
import com.google.android.gms.internal.mlkit_vision_common.zziz;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class XmlVectorParser_androidKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final CardView$1 RemoteActionCompatParcelizer;
    public final getSTYLEABLE_VECTOR_DRAWABLE_WIDTH read;

    public XmlVectorParser_androidKt(getSTYLEABLE_VECTOR_DRAWABLE_WIDTH getstyleable_vector_drawable_width, CardView$1 cardView$1) {
        this.read = getstyleable_vector_drawable_width;
        this.RemoteActionCompatParcelizer = cardView$1;
    }

    public final void IconCompatParcelizer(Throwable th, MainActivity mainActivity) {
        InAppMessageManagerBaseWhenMappings inAppMessageManagerBaseWhenMappingsSerializer;
        int i = 2 % 2;
        th.getClass();
        getStrokeCapKaPHkGw getstrokecapkaphkgw = new getStrokeCapKaPHkGw(mainActivity, this, mainActivity, 1);
        getSTYLEABLE_VECTOR_DRAWABLE_WIDTH getstyleable_vector_drawable_width = this.read;
        setTransactionSuccessful settransactionsuccessful = getstyleable_vector_drawable_width.write;
        if (th instanceof com.data.error.ApiException.ForceAppUpdateRequired) {
            inAppMessageManagerBaseWhenMappingsSerializer = new parseCurrentVectorNode(((com.data.error.ApiException.ForceAppUpdateRequired) th).getMessage(), new isAtEnd(new obtainBrushFromComplexColor(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.all_confirm), new ViewUtils$$ExternalSyntheticLambda6(getstyleable_vector_drawable_width, 3, getstrokecapkaphkgw))));
        } else if (th instanceof ActivityNotFoundException) {
            String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(android.R.string.copyUrl);
            inAppMessageManagerBaseWhenMappingsSerializer = new parseCurrentVectorNodedefault(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.force_update_browser_not_found), new isAtEnd(new obtainBrushFromComplexColor(strIconCompatParcelizer, new n$$ExternalSyntheticLambda3(getstyleable_vector_drawable_width, getstrokecapkaphkgw, strIconCompatParcelizer, 13))), -2);
        } else if (th instanceof IOException) {
            inAppMessageManagerBaseWhenMappingsSerializer = new parseCurrentVectorNodedefault(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.network_connection_error_message));
        } else if (th instanceof addSubLayer) {
            int i2 = serializer + 75;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            addSubLayer addsublayer = (addSubLayer) th;
            obtainAndroidOutline obtainandroidoutline = (obtainAndroidOutline) onContentCardDismissed.MediaMetadataCompat(addsublayer.messages);
            if (obtainandroidoutline instanceof drawWithChildTracking) {
                drawWithChildTracking drawwithchildtracking = (drawWithChildTracking) obtainandroidoutline;
                String str = drawwithchildtracking.description;
                String str2 = drawwithchildtracking.action;
                if (str2 == null) {
                    str2 = "";
                }
                inAppMessageManagerBaseWhenMappingsSerializer = new parsePath(str, new isAtEnd(new obtainBrushFromComplexColor(str2, new setRectOutlinetz77jQwdefault(23))), drawwithchildtracking.title);
            } else {
                inAppMessageManagerBaseWhenMappingsSerializer = obtainandroidoutline instanceof resolveOutlinePosition ? new parseCurrentVectorNodedefault(((resolveOutlinePosition) obtainandroidoutline).title) : getstyleable_vector_drawable_width.serializer(addsublayer);
            }
        } else {
            inAppMessageManagerBaseWhenMappingsSerializer = getstyleable_vector_drawable_width.serializer(th);
        }
        CardView$1 cardView$1 = this.RemoteActionCompatParcelizer;
        Extras$Key extras$Key = (Extras$Key) cardView$1.RemoteActionCompatParcelizer;
        if (inAppMessageManagerBaseWhenMappingsSerializer instanceof parseCurrentVectorNode) {
            int i4 = serializer + 81;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            parseCurrentVectorNode parsecurrentvectornode = (parseCurrentVectorNode) inAppMessageManagerBaseWhenMappingsSerializer;
            extras$Key.read("dialog_tag_force_update", zziz.RemoteActionCompatParcelizer(null, parsecurrentvectornode.serializer(), Extras$Key.IconCompatParcelizer(parsecurrentvectornode.write().serializer())));
            return;
        }
        if (inAppMessageManagerBaseWhenMappingsSerializer instanceof parsePath) {
            parsePath parsepath = (parsePath) inAppMessageManagerBaseWhenMappingsSerializer;
            String strSerializer = parsepath.serializer();
            String str3 = parsepath.read();
            getStrokeLineCapCSYIeUkdefault getstrokelinecapcsyieukdefaultIconCompatParcelizer = parsepath.IconCompatParcelizer();
            str3.getClass();
            obtainBrushFromComplexColor obtainbrushfromcomplexcolorSerializer = ((isAtEnd) getstrokelinecapcsyieukdefaultIconCompatParcelizer).serializer();
            extras$Key.read("api_error_v3_dialog_tag", zzav.write(strSerializer, str3, obtainbrushfromcomplexcolorSerializer != null ? Extras$Key.IconCompatParcelizer(obtainbrushfromcomplexcolorSerializer) : null, null, null));
            return;
        }
        if (!(inAppMessageManagerBaseWhenMappingsSerializer instanceof parseCurrentVectorNodedefault)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        int i6 = IconCompatParcelizer + 115;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        coil3.memory.MemoryCacheService memoryCacheService = (coil3.memory.MemoryCacheService) cardView$1.IconCompatParcelizer;
        parseCurrentVectorNodedefault parsecurrentvectornodedefault = (parseCurrentVectorNodedefault) inAppMessageManagerBaseWhenMappingsSerializer;
        String strWrite = parsecurrentvectornodedefault.write();
        getStrokeLineJoinkLtJ_vA getstrokelinejoinkltj_vaIconCompatParcelizer = parsecurrentvectornodedefault.IconCompatParcelizer();
        int i8 = parsecurrentvectornodedefault.read();
        parseGroup parsegroup = parseGroup.serializer;
        MainActivity mainActivity2 = (MainActivity) ((ImageLoader$Builder$$ExternalSyntheticLambda1) memoryCacheService.RemoteActionCompatParcelizer).read;
        strWrite.getClass();
        getstrokelinejoinkltj_vaIconCompatParcelizer.getClass();
        if (getstrokelinejoinkltj_vaIconCompatParcelizer.equals(getStrokeLineJoinkLtJ_vAdefault.read)) {
            int i9 = serializer + 117;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            SubcomposeLayoutStatesetRoot1 subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer = SubcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer(MainActivity.serializer(mainActivity2), strWrite, i8);
            subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((CharSequence) null, (View.OnClickListener) null);
            coil3.memory.MemoryCacheService.write(subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer, parsegroup);
            subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer.RatingCompat();
            int i11 = IconCompatParcelizer + 9;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (getstrokelinejoinkltj_vaIconCompatParcelizer instanceof isAtEnd) {
            View viewSerializer = MainActivity.serializer(mainActivity2);
            obtainBrushFromComplexColor obtainbrushfromcomplexcolorSerializer2 = ((isAtEnd) getstrokelinejoinkltj_vaIconCompatParcelizer).serializer();
            SubcomposeLayoutStatesetRoot1 subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer2 = SubcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer(viewSerializer, strWrite, i8);
            subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(obtainbrushfromcomplexcolorSerializer2.read(), new ThrottledButton$$ExternalSyntheticLambda0(4, obtainbrushfromcomplexcolorSerializer2));
            coil3.memory.MemoryCacheService.write(subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer2, parsegroup);
            subcomposeLayoutStatesetRoot1RemoteActionCompatParcelizer2.RatingCompat();
            int i12 = serializer + 11;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                int i13 = 4 / 3;
            }
        }
    }
}
