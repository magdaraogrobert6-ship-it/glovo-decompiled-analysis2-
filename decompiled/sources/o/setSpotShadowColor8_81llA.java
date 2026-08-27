package o;

import android.os.Trace;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setSpotShadowColor8_81llA implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ setSpotShadowColor8_81llA(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.LayoutDirection layoutDirection, String str, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        this.IconCompatParcelizer = textStyle;
        this.RemoteActionCompatParcelizer = layoutDirection;
        this.write = str;
        this.serializer = density;
        this.MediaBrowserCompatMediaItem = resolver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        updateDensity updatedensitySerializer;
        int i = this.read;
        Object obj = this.MediaBrowserCompatMediaItem;
        Object obj2 = this.serializer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.IconCompatParcelizer;
        if (i == 0) {
            String str = this.write;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
            AndroidGraphicsContext2 androidGraphicsContext2 = (AndroidGraphicsContext2) obj2;
            onDrawWithContent ondrawwithcontent = (onDrawWithContent) obj;
            ((getClipannotations) obj4).getClass();
            boolean zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue();
            if (zBooleanValue) {
                try {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(str);
                } catch (Throwable th) {
                    if (zBooleanValue) {
                        Trace.endSection();
                    }
                    throw th;
                }
            }
            try {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                setScaleY setscaley = getClipannotations.IconCompatParcelizer;
                androidGraphicsContext2.serializer(setscaley);
                ondrawwithcontent.RemoteActionCompatParcelizer(setscaley);
            } catch (Throwable th2) {
                androidGraphicsContext2.serializer(new setRenderEffect(th2));
                ondrawwithcontent.serializer(th2);
            }
            if (zBooleanValue) {
                Trace.endSection();
                return;
            }
            return;
        }
        androidx.compose.ui.text.TextStyle textStyle = (androidx.compose.ui.text.TextStyle) obj4;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) obj3;
        String str2 = this.write;
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) obj2;
        androidx.compose.ui.text.font.FontFamily.Resolver resolver = (androidx.compose.ui.text.font.FontFamily.Resolver) obj;
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            getBrush getbrushWrite = getOffsetF1C5BW0.write();
            updateDensity updatedensity = getbrushWrite instanceof updateDensity ? (updateDensity) getbrushWrite : null;
            if (updatedensity == null || (updatedensitySerializer = updatedensity.serializer(null, null)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                getBrush getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = updatedensitySerializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                try {
                    androidx.compose.ui.text.ParagraphIntrinsics paragraphIntrinsicsParagraphIntrinsics$default = androidx.compose.ui.text.ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str2, androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection), instance_delegatelambda0.write, density, resolver, (List) null, 32, (Object) null);
                    paragraphIntrinsicsParagraphIntrinsics$default.getMaxIntrinsicWidth();
                    paragraphIntrinsicsParagraphIntrinsics$default.getMinIntrinsicWidth();
                    getBrush.write(getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    updatedensitySerializer.write().IconCompatParcelizer();
                    updatedensitySerializer.serializer();
                    Trace.endSection();
                } catch (Throwable th3) {
                    getBrush.write(getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    updatedensitySerializer.serializer();
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            Trace.endSection();
            throw th6;
        }
    }

    public /* synthetic */ setSpotShadowColor8_81llA(getClipannotations getclipannotations, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, AndroidGraphicsContext2 androidGraphicsContext2, onDrawWithContent ondrawwithcontent) {
        this.IconCompatParcelizer = getclipannotations;
        this.write = str;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = androidGraphicsContext2;
        this.MediaBrowserCompatMediaItem = ondrawwithcontent;
    }
}
