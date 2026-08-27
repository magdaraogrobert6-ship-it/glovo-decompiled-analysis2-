package o;

import android.content.Context;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class dashPathEffect {
    public static final androidx.compose.ui.graphics.painter.Painter RemoteActionCompatParcelizer(accessrewindjd accessrewindjdVar, Context context, int i) {
        if (accessrewindjdVar instanceof accessiteratorjd) {
            return androidx.compose.ui.graphics.painter.BitmapPainterKt.m1427BitmapPainterQZhYCtY$default(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(((accessiteratorjd) accessrewindjdVar).serializer), 0L, 0L, i, 6, null);
        }
        return accessrewindjdVar instanceof accessarcToRadjd ? new DrawablePainter(RegexKt.RemoteActionCompatParcelizer(accessrewindjdVar, context.getResources()).mutate()) : new coil3.compose.ImagePainter(accessrewindjdVar);
    }
}
